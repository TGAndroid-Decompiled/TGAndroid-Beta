package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda362 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda362 INSTANCE = new MessagesController$$ExternalSyntheticLambda362();

    private MessagesController$$ExternalSyntheticLambda362() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$processUpdates$317(tLObject, tLRPC$TL_error);
    }
}
