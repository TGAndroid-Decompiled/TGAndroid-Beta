package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b80;
public final class a6 implements Runnable {
    public final int f17313a;
    public final float f17314b;
    public final NotificationCenter.NotificationCenterDelegate f17315c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17313a = i10;
        this.f17315c = notificationCenterDelegate;
        this.d = obj;
        this.f17314b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17313a) {
            case 0:
                ((MediaController) this.f17315c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17314b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17315c;
                b80 b80Var = (b80) this.d;
                i4Var.f37271h0.M.c(0.0f, true);
                b80Var.f24880p = new org.telegram.ui.c0(i4Var, this.f17314b, 0);
                b80Var.Z();
                return;
        }
    }
}
