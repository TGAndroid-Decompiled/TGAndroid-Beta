package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda359 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda359 INSTANCE = new MessagesController$$ExternalSyntheticLambda359();

    private MessagesController$$ExternalSyntheticLambda359() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$reportSpam$62(tLObject, tLRPC$TL_error);
    }
}
