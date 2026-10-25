package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l6 implements RequestDelegate {
    public final int f20565a;
    public final int f20566b;
    public final int f20567c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public l6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f20565a = i12;
        this.d = notificationCenterDelegate;
        this.f20566b = i10;
        this.f20567c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20565a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f20566b, this.f20567c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$360(this.f20566b, this.f20567c, tLObject, tL_error);
                return;
        }
    }
}
