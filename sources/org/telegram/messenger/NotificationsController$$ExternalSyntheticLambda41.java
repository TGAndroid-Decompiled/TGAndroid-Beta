package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class NotificationsController$$ExternalSyntheticLambda41 implements RequestDelegate {
    public static final NotificationsController$$ExternalSyntheticLambda41 INSTANCE = new NotificationsController$$ExternalSyntheticLambda41();

    private NotificationsController$$ExternalSyntheticLambda41() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        NotificationsController.lambda$updateServerNotificationsSettings$40(tLObject, tLRPC$TL_error);
    }
}
