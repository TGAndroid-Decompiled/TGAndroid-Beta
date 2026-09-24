package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y70;
public final class a6 implements Runnable {
    public final int f15862a;
    public final float f15863b;
    public final NotificationCenter.NotificationCenterDelegate f15864c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15862a = i10;
        this.f15864c = notificationCenterDelegate;
        this.d = obj;
        this.f15863b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15862a) {
            case 0:
                ((MediaController) this.f15864c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15863b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f15864c;
                y70 y70Var = (y70) this.d;
                i4Var.f34382h0.M.c(0.0f, true);
                y70Var.f30542p = new org.telegram.ui.c0(i4Var, this.f15863b, 0);
                y70Var.Z();
                return;
        }
    }
}
