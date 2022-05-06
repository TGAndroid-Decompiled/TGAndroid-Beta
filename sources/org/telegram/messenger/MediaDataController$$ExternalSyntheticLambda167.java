package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda167 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda167 INSTANCE = new MediaDataController$$ExternalSyntheticLambda167();

    private MediaDataController$$ExternalSyntheticLambda167() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFaturedStickersByIdAsRead$43(tLObject, tLRPC$TL_error);
    }
}
