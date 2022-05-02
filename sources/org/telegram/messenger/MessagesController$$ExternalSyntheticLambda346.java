package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda346 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda346 INSTANCE = new MessagesController$$ExternalSyntheticLambda346();

    private MessagesController$$ExternalSyntheticLambda346() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$saveTheme$94(tLObject, tLRPC$TL_error);
    }
}
