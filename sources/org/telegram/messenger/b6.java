package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b6 implements RequestDelegate {
    public final int f17254a;
    public final int f17255b;
    public final int f17256c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17254a = i12;
        this.d = notificationCenterDelegate;
        this.f17255b = i10;
        this.f17256c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17254a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17255b, this.f17256c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f17255b, this.f17256c, tLObject, tL_error);
                return;
        }
    }
}
