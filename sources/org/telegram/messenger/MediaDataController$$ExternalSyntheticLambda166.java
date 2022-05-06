package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda166 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda166 INSTANCE = new MediaDataController$$ExternalSyntheticLambda166();

    private MediaDataController$$ExternalSyntheticLambda166() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$saveDraft$141(tLObject, tLRPC$TL_error);
    }
}
