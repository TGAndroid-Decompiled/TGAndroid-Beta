package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda173 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda173 INSTANCE = new MediaDataController$$ExternalSyntheticLambda173();

    private MediaDataController$$ExternalSyntheticLambda173() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$markFaturedStickersAsRead$47(tLObject, tLRPC$TL_error);
    }
}
