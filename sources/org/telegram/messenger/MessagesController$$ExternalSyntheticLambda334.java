package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda334 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda334 INSTANCE = new MessagesController$$ExternalSyntheticLambda334();

    private MessagesController$$ExternalSyntheticLambda334() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$installTheme$94(tLObject, tLRPC$TL_error);
    }
}
