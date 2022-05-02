package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda125 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda125 INSTANCE = new MediaDataController$$ExternalSyntheticLambda125();

    private MediaDataController$$ExternalSyntheticLambda125() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$131;
        lambda$getEntities$131 = MediaDataController.lambda$getEntities$131((Void) obj);
        return lambda$getEntities$131;
    }
}
