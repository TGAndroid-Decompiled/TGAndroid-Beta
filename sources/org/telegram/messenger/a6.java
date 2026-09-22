package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.y70;
public final class a6 implements Runnable {
    public final int f15881a;
    public final float f15882b;
    public final NotificationCenter.NotificationCenterDelegate f15883c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15881a = i10;
        this.f15883c = notificationCenterDelegate;
        this.d = obj;
        this.f15882b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15881a) {
            case 0:
                ((MediaController) this.f15883c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15882b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f15883c;
                y70 y70Var = (y70) this.d;
                h4Var.f34118h0.M.c(0.0f, true);
                y70Var.f30563p = new org.telegram.ui.b0(h4Var, this.f15882b, 0);
                y70Var.Z();
                return;
        }
    }
}
