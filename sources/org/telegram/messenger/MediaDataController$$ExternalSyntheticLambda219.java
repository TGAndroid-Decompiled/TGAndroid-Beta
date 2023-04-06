package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MediaDataController$$ExternalSyntheticLambda219 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda219 INSTANCE = new MediaDataController$$ExternalSyntheticLambda219();

    private MediaDataController$$ExternalSyntheticLambda219() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFeaturedStickersAsRead$58(tLObject, tLRPC$TL_error);
    }
}
