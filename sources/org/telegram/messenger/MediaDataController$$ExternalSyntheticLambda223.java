package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MediaDataController$$ExternalSyntheticLambda223 implements RequestDelegate {
    public static final MediaDataController$$ExternalSyntheticLambda223 INSTANCE = new MediaDataController$$ExternalSyntheticLambda223();

    private MediaDataController$$ExternalSyntheticLambda223() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MediaDataController.lambda$saveDraft$176(tLObject, tLRPC$TL_error);
    }
}
