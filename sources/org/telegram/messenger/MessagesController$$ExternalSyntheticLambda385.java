package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class MessagesController$$ExternalSyntheticLambda385 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda385 INSTANCE = new MessagesController$$ExternalSyntheticLambda385();

    private MessagesController$$ExternalSyntheticLambda385() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$unregistedPush$271(tLObject, tLRPC$TL_error);
    }
}
