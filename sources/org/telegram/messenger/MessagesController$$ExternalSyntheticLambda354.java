package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda354 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda354 INSTANCE = new MessagesController$$ExternalSyntheticLambda354();

    private MessagesController$$ExternalSyntheticLambda354() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$completeReadTask$198(tLObject, tLRPC$TL_error);
    }
}
