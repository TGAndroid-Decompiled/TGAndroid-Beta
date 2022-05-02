package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class GcmPushListenerService$$ExternalSyntheticLambda9 implements RequestDelegate {
    public static final GcmPushListenerService$$ExternalSyntheticLambda9 INSTANCE = new GcmPushListenerService$$ExternalSyntheticLambda9();

    private GcmPushListenerService$$ExternalSyntheticLambda9() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        GcmPushListenerService.lambda$sendRegistrationToServer$7(tLObject, tLRPC$TL_error);
    }
}
