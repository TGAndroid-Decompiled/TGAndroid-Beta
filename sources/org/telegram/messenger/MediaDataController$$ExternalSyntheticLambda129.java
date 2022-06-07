package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda129 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda129 INSTANCE = new MediaDataController$$ExternalSyntheticLambda129();

    private MediaDataController$$ExternalSyntheticLambda129() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$140;
        lambda$getEntities$140 = MediaDataController.lambda$getEntities$140((Void) obj);
        return lambda$getEntities$140;
    }
}
