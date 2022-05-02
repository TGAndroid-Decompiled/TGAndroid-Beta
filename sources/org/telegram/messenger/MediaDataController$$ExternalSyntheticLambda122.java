package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda122 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda122 INSTANCE = new MediaDataController$$ExternalSyntheticLambda122();

    private MediaDataController$$ExternalSyntheticLambda122() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$133;
        lambda$getEntities$133 = MediaDataController.lambda$getEntities$133((Void) obj);
        return lambda$getEntities$133;
    }
}
