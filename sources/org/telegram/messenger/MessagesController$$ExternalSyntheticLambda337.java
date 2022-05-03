package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda337 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda337 INSTANCE = new MessagesController$$ExternalSyntheticLambda337();

    private MessagesController$$ExternalSyntheticLambda337() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markReactionsAsRead$328(tLObject, tLRPC$TL_error);
    }
}
