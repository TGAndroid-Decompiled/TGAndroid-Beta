package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda360 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda360 INSTANCE = new MessagesController$$ExternalSyntheticLambda360();

    private MessagesController$$ExternalSyntheticLambda360() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$installTheme$96(tLObject, tLRPC$TL_error);
    }
}
