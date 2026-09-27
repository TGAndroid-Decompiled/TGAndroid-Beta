package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.a80;
public final class a6 implements Runnable {
    public final int f15871a;
    public final float f15872b;
    public final NotificationCenter.NotificationCenterDelegate f15873c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15871a = i10;
        this.f15873c = notificationCenterDelegate;
        this.d = obj;
        this.f15872b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15871a) {
            case 0:
                ((MediaController) this.f15873c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15872b);
                return;
            default:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f15873c;
                a80 a80Var = (a80) this.d;
                j4Var.f34615h0.M.c(0.0f, true);
                a80Var.f22601p = new org.telegram.ui.d0(j4Var, this.f15872b, 0);
                a80Var.Z();
                return;
        }
    }
}
