package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda126 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda126 INSTANCE = new MediaDataController$$ExternalSyntheticLambda126();

    private MediaDataController$$ExternalSyntheticLambda126() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$134;
        lambda$getEntities$134 = MediaDataController.lambda$getEntities$134((Void) obj);
        return lambda$getEntities$134;
    }
}
