package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final int f17846a;
    public final int f17847b;
    public final int f17848c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public i6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17846a = i12;
        this.d = notificationCenterDelegate;
        this.f17847b = i10;
        this.f17848c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17846a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17847b, this.f17848c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f17847b, this.f17848c, tLObject, tL_error);
                return;
        }
    }
}
