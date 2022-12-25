package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda159 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda159 INSTANCE = new MediaDataController$$ExternalSyntheticLambda159();

    private MediaDataController$$ExternalSyntheticLambda159() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$162;
        lambda$getEntities$162 = MediaDataController.lambda$getEntities$162((Void) obj);
        return lambda$getEntities$162;
    }
}
