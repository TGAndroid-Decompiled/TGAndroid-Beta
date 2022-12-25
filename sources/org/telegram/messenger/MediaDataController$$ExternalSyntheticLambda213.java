package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda213 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda213 INSTANCE = new MediaDataController$$ExternalSyntheticLambda213();

    private MediaDataController$$ExternalSyntheticLambda213() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removeInline$136(tLObject, tLRPC$TL_error);
    }
}
