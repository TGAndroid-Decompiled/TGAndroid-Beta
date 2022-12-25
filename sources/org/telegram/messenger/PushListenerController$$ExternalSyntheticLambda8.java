package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class PushListenerController$$ExternalSyntheticLambda8 implements RequestDelegate {
    public static final PushListenerController$$ExternalSyntheticLambda8 INSTANCE = new PushListenerController$$ExternalSyntheticLambda8();

    private PushListenerController$$ExternalSyntheticLambda8() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        PushListenerController.lambda$sendRegistrationToServer$1(tLObject, tLRPC$TL_error);
    }
}
