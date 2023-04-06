package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda366 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda366 INSTANCE = new MessagesController$$ExternalSyntheticLambda366();

    private MessagesController$$ExternalSyntheticLambda366() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$installTheme$105(tLObject, tLRPC$TL_error);
    }
}
