package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda130 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda130 INSTANCE = new MediaDataController$$ExternalSyntheticLambda130();

    private MediaDataController$$ExternalSyntheticLambda130() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$142;
        lambda$getEntities$142 = MediaDataController.lambda$getEntities$142((Void) obj);
        return lambda$getEntities$142;
    }
}
