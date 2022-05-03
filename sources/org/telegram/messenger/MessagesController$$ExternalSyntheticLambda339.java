package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda339 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda339 INSTANCE = new MessagesController$$ExternalSyntheticLambda339();

    private MessagesController$$ExternalSyntheticLambda339() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$hidePeerSettingsBar$53(tLObject, tLRPC$TL_error);
    }
}
