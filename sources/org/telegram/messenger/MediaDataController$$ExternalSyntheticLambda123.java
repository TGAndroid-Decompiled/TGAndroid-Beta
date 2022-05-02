package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda123 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda123 INSTANCE = new MediaDataController$$ExternalSyntheticLambda123();

    private MediaDataController$$ExternalSyntheticLambda123() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$132;
        lambda$getEntities$132 = MediaDataController.lambda$getEntities$132((Void) obj);
        return lambda$getEntities$132;
    }
}
