package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda369 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda369 INSTANCE = new MessagesController$$ExternalSyntheticLambda369();

    private MessagesController$$ExternalSyntheticLambda369() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$completeReadTask$203(tLObject, tLRPC$TL_error);
    }
}
