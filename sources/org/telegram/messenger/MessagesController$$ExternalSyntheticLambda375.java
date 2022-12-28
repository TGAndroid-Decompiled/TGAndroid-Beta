package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda375 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda375 INSTANCE = new MessagesController$$ExternalSyntheticLambda375();

    private MessagesController$$ExternalSyntheticLambda375() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$saveTheme$100(tLObject, tLRPC$TL_error);
    }
}
