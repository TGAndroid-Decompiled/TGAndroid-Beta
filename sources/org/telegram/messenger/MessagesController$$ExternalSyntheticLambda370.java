package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda370 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda370 INSTANCE = new MessagesController$$ExternalSyntheticLambda370();

    private MessagesController$$ExternalSyntheticLambda370() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$installTheme$102(tLObject, tLRPC$TL_error);
    }
}
