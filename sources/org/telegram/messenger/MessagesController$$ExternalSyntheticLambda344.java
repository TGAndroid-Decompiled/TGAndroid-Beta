package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda344 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda344 INSTANCE = new MessagesController$$ExternalSyntheticLambda344();

    private MessagesController$$ExternalSyntheticLambda344() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$processUpdates$306(tLObject, tLRPC$TL_error);
    }
}
