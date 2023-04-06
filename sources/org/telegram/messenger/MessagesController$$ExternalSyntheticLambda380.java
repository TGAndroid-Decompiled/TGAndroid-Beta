package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda380 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda380 INSTANCE = new MessagesController$$ExternalSyntheticLambda380();

    private MessagesController$$ExternalSyntheticLambda380() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$blockPeer$76(tLObject, tLRPC$TL_error);
    }
}
