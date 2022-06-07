package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda132 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda132 INSTANCE = new MediaDataController$$ExternalSyntheticLambda132();

    private MediaDataController$$ExternalSyntheticLambda132() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$141;
        lambda$getEntities$141 = MediaDataController.lambda$getEntities$141((Void) obj);
        return lambda$getEntities$141;
    }
}
