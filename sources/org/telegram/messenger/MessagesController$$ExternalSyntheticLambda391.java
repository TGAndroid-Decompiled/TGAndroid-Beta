package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda391 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda391 INSTANCE = new MessagesController$$ExternalSyntheticLambda391();

    private MessagesController$$ExternalSyntheticLambda391() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$hidePromoDialog$118(tLObject, tLRPC$TL_error);
    }
}
