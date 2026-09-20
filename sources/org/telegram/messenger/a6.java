package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.v70;
public final class a6 implements Runnable {
    public final int f15866a;
    public final float f15867b;
    public final NotificationCenter.NotificationCenterDelegate f15868c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15866a = i10;
        this.f15868c = notificationCenterDelegate;
        this.d = obj;
        this.f15867b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15866a) {
            case 0:
                ((MediaController) this.f15868c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15867b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f15868c;
                v70 v70Var = (v70) this.d;
                h4Var.f34102h0.M.c(0.0f, true);
                v70Var.f28989p = new org.telegram.ui.b0(h4Var, this.f15867b, 0);
                v70Var.Z();
                return;
        }
    }
}
