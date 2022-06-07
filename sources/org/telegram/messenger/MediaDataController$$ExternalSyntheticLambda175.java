package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda175 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda175 INSTANCE = new MediaDataController$$ExternalSyntheticLambda175();

    private MediaDataController$$ExternalSyntheticLambda175() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removeInline$113(tLObject, tLRPC$TL_error);
    }
}
