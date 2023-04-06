package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda390 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda390 INSTANCE = new MessagesController$$ExternalSyntheticLambda390();

    private MessagesController$$ExternalSyntheticLambda390() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markReactionsAsRead$359(tLObject, tLRPC$TL_error);
    }
}
