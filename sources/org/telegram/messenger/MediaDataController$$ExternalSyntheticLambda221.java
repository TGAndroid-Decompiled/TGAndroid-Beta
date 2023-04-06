package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MediaDataController$$ExternalSyntheticLambda221 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda221 INSTANCE = new MediaDataController$$ExternalSyntheticLambda221();

    private MediaDataController$$ExternalSyntheticLambda221() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removeInline$142(tLObject, tLRPC$TL_error);
    }
}
