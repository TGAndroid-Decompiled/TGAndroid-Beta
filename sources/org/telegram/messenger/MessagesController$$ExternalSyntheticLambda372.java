package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda372 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda372 INSTANCE = new MessagesController$$ExternalSyntheticLambda372();

    private MessagesController$$ExternalSyntheticLambda372() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markMentionsAsRead$207(tLObject, tLRPC$TL_error);
    }
}
