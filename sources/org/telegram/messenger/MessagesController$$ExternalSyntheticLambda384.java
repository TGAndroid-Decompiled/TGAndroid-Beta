package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda384 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda384 INSTANCE = new MessagesController$$ExternalSyntheticLambda384();

    private MessagesController$$ExternalSyntheticLambda384() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$hidePeerSettingsBar$62(tLObject, tLRPC$TL_error);
    }
}
