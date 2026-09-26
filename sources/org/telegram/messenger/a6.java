package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.z70;
public final class a6 implements Runnable {
    public final int f15877a;
    public final float f15878b;
    public final NotificationCenter.NotificationCenterDelegate f15879c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15877a = i10;
        this.f15879c = notificationCenterDelegate;
        this.d = obj;
        this.f15878b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15877a) {
            case 0:
                ((MediaController) this.f15879c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15878b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f15879c;
                z70 z70Var = (z70) this.d;
                i4Var.f34394h0.M.c(0.0f, true);
                z70Var.f30834p = new org.telegram.ui.c0(i4Var, this.f15878b, 0);
                z70Var.Z();
                return;
        }
    }
}
