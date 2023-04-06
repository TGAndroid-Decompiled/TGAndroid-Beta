package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda387 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda387 INSTANCE = new MessagesController$$ExternalSyntheticLambda387();

    private MessagesController$$ExternalSyntheticLambda387() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$updateEmojiStatus$25(tLObject, tLRPC$TL_error);
    }
}
