package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda341 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda341 INSTANCE = new MessagesController$$ExternalSyntheticLambda341();

    private MessagesController$$ExternalSyntheticLambda341() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$unblockPeer$87(tLObject, tLRPC$TL_error);
    }
}
