package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda351 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda351 INSTANCE = new MessagesController$$ExternalSyntheticLambda351();

    private MessagesController$$ExternalSyntheticLambda351() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$removeSuggestion$21(tLObject, tLRPC$TL_error);
    }
}
