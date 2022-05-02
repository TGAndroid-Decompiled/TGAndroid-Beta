package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda358 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda358 INSTANCE = new MessagesController$$ExternalSyntheticLambda358();

    private MessagesController$$ExternalSyntheticLambda358() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markReactionsAsRead$335(tLObject, tLRPC$TL_error);
    }
}
