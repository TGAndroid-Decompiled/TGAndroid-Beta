package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda335 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda335 INSTANCE = new MessagesController$$ExternalSyntheticLambda335();

    private MessagesController$$ExternalSyntheticLambda335() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$completeReadTask$194(tLObject, tLRPC$TL_error);
    }
}
