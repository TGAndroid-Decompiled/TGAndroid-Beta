package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda392 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda392 INSTANCE = new MessagesController$$ExternalSyntheticLambda392();

    private MessagesController$$ExternalSyntheticLambda392() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$installTheme$107(tLObject, tLRPC$TL_error);
    }
}
