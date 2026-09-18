package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.w70;
public final class a6 implements Runnable {
    public final int f15834a;
    public final float f15835b;
    public final NotificationCenter.NotificationCenterDelegate f15836c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15834a = i10;
        this.f15836c = notificationCenterDelegate;
        this.d = obj;
        this.f15835b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15834a) {
            case 0:
                ((MediaController) this.f15836c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15835b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f15836c;
                w70 w70Var = (w70) this.d;
                h4Var.f34062h0.M.c(0.0f, true);
                w70Var.f29919p = new org.telegram.ui.b0(h4Var, this.f15835b, 0);
                w70Var.Z();
                return;
        }
    }
}
