package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda209 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda209 INSTANCE = new MediaDataController$$ExternalSyntheticLambda209();

    private MediaDataController$$ExternalSyntheticLambda209() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFeaturedStickersAsRead$54(tLObject, tLRPC$TL_error);
    }
}
