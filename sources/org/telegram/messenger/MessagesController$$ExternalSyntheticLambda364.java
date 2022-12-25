package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda364 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda364 INSTANCE = new MessagesController$$ExternalSyntheticLambda364();

    private MessagesController$$ExternalSyntheticLambda364() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$removeSuggestion$26(tLObject, tLRPC$TL_error);
    }
}
