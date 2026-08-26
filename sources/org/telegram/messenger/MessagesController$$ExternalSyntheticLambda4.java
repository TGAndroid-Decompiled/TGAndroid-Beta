package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda4 implements RequestDelegate {
    public final int $r8$classId;

    public MessagesController$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                MessagesController.lambda$installTheme$117(tLObject, tL_error);
                break;
            case 1:
                MessagesController.lambda$hidePromoDialog$135(tLObject, tL_error);
                break;
            case 2:
                MessagesController.lambda$blockPeer$89(tLObject, tL_error);
                break;
            case 3:
                MessagesController.lambda$logDeviceStats$31(tLObject, tL_error);
                break;
            case 4:
                MessagesController.lambda$installTheme$118(tLObject, tL_error);
                break;
            case 5:
                NotificationsController.lambda$updateServerNotificationsSettings$52(tLObject, tL_error);
                break;
            case 6:
                NotificationsController.lambda$updateServerNotificationsSettings$51(tLObject, tL_error);
                break;
            default:
                NotificationsController.lambda$updateServerNotificationsSettings$50(tLObject, tL_error);
                break;
        }
    }
}
