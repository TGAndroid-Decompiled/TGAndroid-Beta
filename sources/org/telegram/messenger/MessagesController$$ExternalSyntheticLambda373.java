package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda373 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda373 INSTANCE = new MessagesController$$ExternalSyntheticLambda373();

    private MessagesController$$ExternalSyntheticLambda373() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markMentionMessageAsRead$201(tLObject, tLRPC$TL_error);
    }
}
