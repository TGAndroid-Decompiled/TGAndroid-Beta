package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;
public final class MediaDataController$$ExternalSyntheticLambda164 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda164 INSTANCE = new MediaDataController$$ExternalSyntheticLambda164();

    private MediaDataController$$ExternalSyntheticLambda164() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$170;
        lambda$getEntities$170 = MediaDataController.lambda$getEntities$170((Void) obj);
        return lambda$getEntities$170;
    }
}
