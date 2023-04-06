package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda388 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda388 INSTANCE = new MessagesController$$ExternalSyntheticLambda388();

    private MessagesController$$ExternalSyntheticLambda388() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markMessageContentAsRead$200(tLObject, tLRPC$TL_error);
    }
}
