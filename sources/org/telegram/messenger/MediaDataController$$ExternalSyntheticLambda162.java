package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;
public final class MediaDataController$$ExternalSyntheticLambda162 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda162 INSTANCE = new MediaDataController$$ExternalSyntheticLambda162();

    private MediaDataController$$ExternalSyntheticLambda162() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$171;
        lambda$getEntities$171 = MediaDataController.lambda$getEntities$171((Void) obj);
        return lambda$getEntities$171;
    }
}
