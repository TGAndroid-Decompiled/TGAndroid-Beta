package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda377 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda377 INSTANCE = new MessagesController$$ExternalSyntheticLambda377();

    private MessagesController$$ExternalSyntheticLambda377() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$blockPeer$74(tLObject, tLRPC$TL_error);
    }
}