package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda389 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda389 INSTANCE = new MessagesController$$ExternalSyntheticLambda389();

    private MessagesController$$ExternalSyntheticLambda389() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$updateEmojiStatus$26(tLObject, tLRPC$TL_error);
    }
}
