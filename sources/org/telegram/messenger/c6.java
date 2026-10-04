package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c6 implements RequestDelegate {
    public final int f17507a;
    public final int f17508b;
    public final int f17509c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17507a = i12;
        this.d = notificationCenterDelegate;
        this.f17508b = i10;
        this.f17509c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17507a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17508b, this.f17509c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f17508b, this.f17509c, tLObject, tL_error);
                return;
        }
    }
}
