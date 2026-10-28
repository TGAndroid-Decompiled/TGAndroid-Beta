package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd implements RequestDelegate {
    public final int f21516a;

    public vd(int i10) {
        this.f21516a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21516a) {
            case 0:
                MessagesController.lambda$reportSpam$77(tLObject, tL_error);
                return;
            case 1:
                MessagesController.lambda$hidePromoDialog$134(tLObject, tL_error);
                return;
            case 2:
                MessagesController.lambda$blockPeer$88(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$deleteParticipantFromChat$315(tLObject, tL_error);
                return;
            case 4:
                NotificationsController.lambda$updateServerNotificationsSettings$52(tLObject, tL_error);
                return;
            case 5:
                NotificationsController.lambda$updateServerNotificationsSettings$53(tLObject, tL_error);
                return;
            default:
                NotificationsController.lambda$updateServerNotificationsSettings$51(tLObject, tL_error);
                return;
        }
    }
}
