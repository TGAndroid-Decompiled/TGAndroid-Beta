package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda343 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda343 INSTANCE = new MessagesController$$ExternalSyntheticLambda343();

    private MessagesController$$ExternalSyntheticLambda343() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markMentionsAsRead$200(tLObject, tLRPC$TL_error);
    }
}
