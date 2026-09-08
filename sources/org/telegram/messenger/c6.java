package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c6 implements RequestDelegate {
    public final int f17336a;
    public final int f17337b;
    public final int f17338c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17336a = i12;
        this.d = notificationCenterDelegate;
        this.f17337b = i10;
        this.f17338c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17336a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17337b, this.f17338c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f17337b, this.f17338c, tLObject, tL_error);
                return;
        }
    }
}
