package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda348 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda348 INSTANCE = new MessagesController$$ExternalSyntheticLambda348();

    private MessagesController$$ExternalSyntheticLambda348() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$completeReadTask$196(tLObject, tLRPC$TL_error);
    }
}
