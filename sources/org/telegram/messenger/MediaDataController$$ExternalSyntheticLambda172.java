package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda172 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda172 INSTANCE = new MediaDataController$$ExternalSyntheticLambda172();

    private MediaDataController$$ExternalSyntheticLambda172() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removePeer$114(tLObject, tLRPC$TL_error);
    }
}
