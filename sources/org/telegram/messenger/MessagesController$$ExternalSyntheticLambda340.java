package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda340 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda340 INSTANCE = new MessagesController$$ExternalSyntheticLambda340();

    private MessagesController$$ExternalSyntheticLambda340() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$processUpdates$305(tLObject, tLRPC$TL_error);
    }
}
