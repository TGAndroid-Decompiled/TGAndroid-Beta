package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda336 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda336 INSTANCE = new MessagesController$$ExternalSyntheticLambda336();

    private MessagesController$$ExternalSyntheticLambda336() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$reportSpam$56(tLObject, tLRPC$TL_error);
    }
}
