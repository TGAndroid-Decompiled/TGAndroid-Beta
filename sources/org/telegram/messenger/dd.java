package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dd implements RequestDelegate {
    public final int f20096a;

    public dd(int i9) {
        this.f20096a = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20096a) {
            case 0:
                MessagesController.lambda$removeSuggestion$40(tLObject, tL_error);
                return;
            case 1:
                MessagesController.lambda$hidePromoDialog$135(tLObject, tL_error);
                return;
            case 2:
                MessagesController.lambda$blockPeer$89(tLObject, tL_error);
                return;
            case 3:
                MessagesController.lambda$logDeviceStats$31(tLObject, tL_error);
                return;
            case 4:
                MessagesController.lambda$deleteParticipantFromChat$314(tLObject, tL_error);
                return;
            case 5:
                NotificationsController.lambda$updateServerNotificationsSettings$51(tLObject, tL_error);
                return;
            case 6:
                NotificationsController.lambda$updateServerNotificationsSettings$52(tLObject, tL_error);
                return;
            default:
                NotificationsController.lambda$updateServerNotificationsSettings$50(tLObject, tL_error);
                return;
        }
    }
}
