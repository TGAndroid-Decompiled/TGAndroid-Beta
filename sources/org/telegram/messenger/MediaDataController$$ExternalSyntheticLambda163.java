package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;
public final class MediaDataController$$ExternalSyntheticLambda163 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda163 INSTANCE = new MediaDataController$$ExternalSyntheticLambda163();

    private MediaDataController$$ExternalSyntheticLambda163() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$169;
        lambda$getEntities$169 = MediaDataController.lambda$getEntities$169((Void) obj);
        return lambda$getEntities$169;
    }
}
