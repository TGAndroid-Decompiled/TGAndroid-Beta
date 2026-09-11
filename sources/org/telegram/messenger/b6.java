package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b6 implements RequestDelegate {
    public final int f17227a;
    public final int f17228b;
    public final int f17229c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17227a = i12;
        this.d = notificationCenterDelegate;
        this.f17228b = i10;
        this.f17229c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17227a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17228b, this.f17229c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f17228b, this.f17229c, tLObject, tL_error);
                return;
        }
    }
}
