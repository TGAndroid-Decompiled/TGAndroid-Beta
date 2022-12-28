package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda361 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda361 INSTANCE = new MessagesController$$ExternalSyntheticLambda361();

    private MessagesController$$ExternalSyntheticLambda361() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$unblockPeer$93(tLObject, tLRPC$TL_error);
    }
}
