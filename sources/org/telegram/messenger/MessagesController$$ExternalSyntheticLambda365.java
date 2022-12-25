package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda365 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda365 INSTANCE = new MessagesController$$ExternalSyntheticLambda365();

    private MessagesController$$ExternalSyntheticLambda365() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$reportSpam$61(tLObject, tLRPC$TL_error);
    }
}
