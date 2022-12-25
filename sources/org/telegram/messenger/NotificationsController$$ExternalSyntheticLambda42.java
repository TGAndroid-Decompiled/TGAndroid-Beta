package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class NotificationsController$$ExternalSyntheticLambda42 implements RequestDelegate {
    public static final NotificationsController$$ExternalSyntheticLambda42 INSTANCE = new NotificationsController$$ExternalSyntheticLambda42();

    private NotificationsController$$ExternalSyntheticLambda42() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        NotificationsController.lambda$updateServerNotificationsSettings$39(tLObject, tLRPC$TL_error);
    }
}
