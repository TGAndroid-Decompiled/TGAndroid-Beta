package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda164 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda164 INSTANCE = new MediaDataController$$ExternalSyntheticLambda164();

    private MediaDataController$$ExternalSyntheticLambda164() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$removeInline$105(tLObject, tLRPC$TL_error);
    }
}
