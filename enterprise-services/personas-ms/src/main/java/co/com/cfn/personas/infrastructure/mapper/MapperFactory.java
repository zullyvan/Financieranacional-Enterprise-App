package co.com.cfn.personas.infrastructure.mapper;


import co.com.cfn.foundation.framework.components.builder.Mapper;

/**
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 * Cibercolegios Generic Artifact
 * Created: 4-Ene-2017
 * Author: Administrator
 * Type: JAVA class Artifact
 * Purpose:Mapper factory artifact
 * ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

public class MapperFactory {

    public static final String PERSONA_DTO_TO_ENTITY = "PERSONA_DTO_TO_ENTITY";
    public static final String PERSONA_ENTITY_TO_DTO = "PERSONA_ENTITY_TO_DTO";

    public static final String TIPODOCUMENTAL_DTO_TO_ENTITY = "TIPODOCUMENTAL_DTO_TO_ENTITY";
    public static final String TIPODOCUMENTAL_ENTITY_TO_DTO = "TIPODOCUMENTAL_ENTITY_TO_DTO";


    private static MapperFactory INSTANCE = new MapperFactory();

    // [constructor]------------------------------

    private MapperFactory() {
    }

    public static MapperFactory getInstance() {
        return INSTANCE;
    }

    // [method]------------------------------

    @SuppressWarnings("unchecked")
    public <I, O> Mapper<I, O> getMapper(String mappperId) {

        Mapper<I, O> mapper = null;

        switch (mappperId) {
            case PERSONA_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new ActividadPersonaDTOToEntityMapper();
                break;

            case PERSONA_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new ActividadPersonaEntityToDTOMapper();
                break;

            case TIPODOCUMENTAL_DTO_TO_ENTITY:
                mapper = (Mapper<I, O>) new TipoDocumetalDTOToEntityMapper();
                break;

            case TIPODOCUMENTAL_ENTITY_TO_DTO:
                mapper = (Mapper<I, O>) new TipoDocumentalEntityToDTOMapper();
                break;

            default:
                break;
        }

        return mapper;
    }

}
