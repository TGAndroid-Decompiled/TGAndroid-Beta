package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MediaDataController$$ExternalSyntheticLambda171 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda171 INSTANCE = new MediaDataController$$ExternalSyntheticLambda171();

    private MediaDataController$$ExternalSyntheticLambda171() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$saveDraft$146(tLObject, tLRPC$TL_error);
    }
}
