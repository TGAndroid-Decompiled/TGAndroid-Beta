package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;
public final class MediaDataController$$ExternalSyntheticLambda165 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda165 INSTANCE = new MediaDataController$$ExternalSyntheticLambda165();

    private MediaDataController$$ExternalSyntheticLambda165() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$172;
        lambda$getEntities$172 = MediaDataController.lambda$getEntities$172((Void) obj);
        return lambda$getEntities$172;
    }
}
