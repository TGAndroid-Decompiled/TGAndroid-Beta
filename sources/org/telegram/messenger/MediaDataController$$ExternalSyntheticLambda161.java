package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda161 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda161 INSTANCE = new MediaDataController$$ExternalSyntheticLambda161();

    private MediaDataController$$ExternalSyntheticLambda161() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFaturedStickersByIdAsRead$40(tLObject, tLRPC$TL_error);
    }
}
