package org.telegram.messenger;

import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MediaDataController$$ExternalSyntheticLambda158 implements GenericProvider {
    public static final MediaDataController$$ExternalSyntheticLambda158 INSTANCE = new MediaDataController$$ExternalSyntheticLambda158();

    private MediaDataController$$ExternalSyntheticLambda158() {
    }

    @Override
    public final Object provide(Object obj) {
        TLRPC$MessageEntity lambda$getEntities$164;
        lambda$getEntities$164 = MediaDataController.lambda$getEntities$164((Void) obj);
        return lambda$getEntities$164;
    }
}
