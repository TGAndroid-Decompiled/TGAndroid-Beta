package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda368 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda368 INSTANCE = new MessagesController$$ExternalSyntheticLambda368();

    private MessagesController$$ExternalSyntheticLambda368() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$reportSpam$60(tLObject, tLRPC$TL_error);
    }
}
