package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda156 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda156 INSTANCE = new MediaDataController$$ExternalSyntheticLambda156();

    private MediaDataController$$ExternalSyntheticLambda156() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$163;
        lambda$getEntities$163 = MediaDataController.lambda$getEntities$163((Void) obj);
        return lambda$getEntities$163;
    }
}
