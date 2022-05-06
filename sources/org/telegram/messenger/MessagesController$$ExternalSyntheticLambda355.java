package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda355 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda355 INSTANCE = new MessagesController$$ExternalSyntheticLambda355();

    private MessagesController$$ExternalSyntheticLambda355() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markMentionsAsRead$201(tLObject, tLRPC$TL_error);
    }
}
