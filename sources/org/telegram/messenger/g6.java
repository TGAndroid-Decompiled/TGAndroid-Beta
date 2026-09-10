package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.w70;
public final class g6 implements Runnable {
    public final int f15247a;
    public final float f15248b;
    public final NotificationCenter.NotificationCenterDelegate f15249c;
    public final Object d;

    public g6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15247a = i10;
        this.f15249c = notificationCenterDelegate;
        this.d = obj;
        this.f15248b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15247a) {
            case 0:
                ((MediaController) this.f15249c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15248b);
                return;
            default:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f15249c;
                w70 w70Var = (w70) this.d;
                j4Var.f33908h0.M.c(0.0f, true);
                w70Var.f28696p = new org.telegram.ui.c0(j4Var, this.f15248b, 0);
                w70Var.Z();
                return;
        }
    }
}
