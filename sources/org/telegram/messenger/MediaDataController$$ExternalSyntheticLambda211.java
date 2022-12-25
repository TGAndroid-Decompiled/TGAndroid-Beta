package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda211 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda211 INSTANCE = new MediaDataController$$ExternalSyntheticLambda211();

    private MediaDataController$$ExternalSyntheticLambda211() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$saveDraft$169(tLObject, tLRPC$TL_error);
    }
}
