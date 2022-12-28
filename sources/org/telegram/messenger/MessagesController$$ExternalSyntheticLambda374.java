package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda374 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda374 INSTANCE = new MessagesController$$ExternalSyntheticLambda374();

    private MessagesController$$ExternalSyntheticLambda374() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$deleteUserPhoto$98(tLObject, tLRPC$TL_error);
    }
}
