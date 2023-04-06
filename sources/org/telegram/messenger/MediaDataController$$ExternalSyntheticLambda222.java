package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MediaDataController$$ExternalSyntheticLambda222 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda222 INSTANCE = new MediaDataController$$ExternalSyntheticLambda222();

    private MediaDataController$$ExternalSyntheticLambda222() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removePeer$143(tLObject, tLRPC$TL_error);
    }
}
