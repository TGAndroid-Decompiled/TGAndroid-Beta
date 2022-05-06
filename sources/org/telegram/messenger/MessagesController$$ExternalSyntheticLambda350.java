package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda350 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda350 INSTANCE = new MessagesController$$ExternalSyntheticLambda350();

    private MessagesController$$ExternalSyntheticLambda350() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$deleteUserPhoto$93(tLObject, tLRPC$TL_error);
    }
}
