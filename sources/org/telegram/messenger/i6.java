package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final int f17847a;
    public final int f17848b;
    public final int f17849c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public i6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17847a = i12;
        this.d = notificationCenterDelegate;
        this.f17848b = i10;
        this.f17849c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17847a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17848b, this.f17849c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f17848b, this.f17849c, tLObject, tL_error);
                return;
        }
    }
}
