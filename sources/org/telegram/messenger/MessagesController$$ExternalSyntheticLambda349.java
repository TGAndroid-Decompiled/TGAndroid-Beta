package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class MessagesController$$ExternalSyntheticLambda349 implements RequestDelegate {
    public static final MessagesController$$ExternalSyntheticLambda349 INSTANCE = new MessagesController$$ExternalSyntheticLambda349();

    private MessagesController$$ExternalSyntheticLambda349() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        MessagesController.lambda$deleteParticipantFromChat$246(tLObject, tLRPC$TL_error);
    }
}
