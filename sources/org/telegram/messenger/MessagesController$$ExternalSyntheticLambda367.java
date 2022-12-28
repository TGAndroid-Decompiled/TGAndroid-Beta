package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda367 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda367 INSTANCE = new MessagesController$$ExternalSyntheticLambda367();

    private MessagesController$$ExternalSyntheticLambda367() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$completeReadTask$205(tLObject, tLRPC$TL_error);
    }
}
