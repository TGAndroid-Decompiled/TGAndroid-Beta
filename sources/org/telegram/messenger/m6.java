package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m6 implements RequestDelegate {
    public final int f20662a;
    public final int f20663b;
    public final int f20664c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f20662a = i12;
        this.d = notificationCenterDelegate;
        this.f20663b = i10;
        this.f20664c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20662a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f20663b, this.f20664c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$360(this.f20663b, this.f20664c, tLObject, tL_error);
                return;
        }
    }
}
