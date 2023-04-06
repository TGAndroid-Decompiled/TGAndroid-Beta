package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MediaDataController$$ExternalSyntheticLambda220 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda220 INSTANCE = new MediaDataController$$ExternalSyntheticLambda220();

    private MediaDataController$$ExternalSyntheticLambda220() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFeaturedStickersByIdAsRead$59(tLObject, tLRPC$TL_error);
    }
}
