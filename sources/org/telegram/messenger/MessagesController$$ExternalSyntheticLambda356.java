package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda356 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda356 INSTANCE = new MessagesController$$ExternalSyntheticLambda356();

    private MessagesController$$ExternalSyntheticLambda356() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$blockPeer$68(tLObject, tLRPC$TL_error);
    }
}
