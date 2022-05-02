package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda342 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda342 INSTANCE = new MessagesController$$ExternalSyntheticLambda342();

    private MessagesController$$ExternalSyntheticLambda342() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$reportSpam$56(tLObject, tLRPC$TL_error);
    }
}
