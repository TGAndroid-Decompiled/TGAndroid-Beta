package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda163 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda163 INSTANCE = new MediaDataController$$ExternalSyntheticLambda163();

    private MediaDataController$$ExternalSyntheticLambda163() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$saveDraft$138(tLObject, tLRPC$TL_error);
    }
}
