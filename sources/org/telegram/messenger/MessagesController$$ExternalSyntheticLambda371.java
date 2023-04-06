package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda371 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda371 INSTANCE = new MessagesController$$ExternalSyntheticLambda371();

    private MessagesController$$ExternalSyntheticLambda371() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$saveTheme$104(tLObject, tLRPC$TL_error);
    }
}
