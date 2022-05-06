package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda353 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda353 INSTANCE = new MessagesController$$ExternalSyntheticLambda353();

    private MessagesController$$ExternalSyntheticLambda353() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$installTheme$97(tLObject, tLRPC$TL_error);
    }
}
