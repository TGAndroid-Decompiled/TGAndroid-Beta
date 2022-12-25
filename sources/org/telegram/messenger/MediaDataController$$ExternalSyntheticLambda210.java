package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda210 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda210 INSTANCE = new MediaDataController$$ExternalSyntheticLambda210();

    private MediaDataController$$ExternalSyntheticLambda210() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removePeer$137(tLObject, tLRPC$TL_error);
    }
}
