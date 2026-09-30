package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b80;
public final class a6 implements Runnable {
    public final int f15894a;
    public final float f15895b;
    public final NotificationCenter.NotificationCenterDelegate f15896c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15894a = i10;
        this.f15896c = notificationCenterDelegate;
        this.d = obj;
        this.f15895b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15894a) {
            case 0:
                ((MediaController) this.f15896c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15895b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f15896c;
                b80 b80Var = (b80) this.d;
                i4Var.f34490h0.M.c(0.0f, true);
                b80Var.f22867p = new org.telegram.ui.c0(i4Var, this.f15895b, 0);
                b80Var.Z();
                return;
        }
    }
}
