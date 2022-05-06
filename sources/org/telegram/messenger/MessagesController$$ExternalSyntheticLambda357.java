package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda357 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda357 INSTANCE = new MessagesController$$ExternalSyntheticLambda357();

    private MessagesController$$ExternalSyntheticLambda357() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$markMessageContentAsRead$191(tLObject, tLRPC$TL_error);
    }
}
