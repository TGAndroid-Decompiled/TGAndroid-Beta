package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda378 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda378 INSTANCE = new MessagesController$$ExternalSyntheticLambda378();

    private MessagesController$$ExternalSyntheticLambda378() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$blockPeer$74(tLObject, tLRPC$TL_error);
    }
}
