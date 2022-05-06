package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda168 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda168 INSTANCE = new MediaDataController$$ExternalSyntheticLambda168();

    private MediaDataController$$ExternalSyntheticLambda168() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFaturedStickersAsRead$42(tLObject, tLRPC$TL_error);
    }
}
