package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n70;
public final class a6 implements Runnable {
    public final int f15645a;
    public final float f15646b;
    public final NotificationCenter.NotificationCenterDelegate f15647c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15645a = i10;
        this.f15647c = notificationCenterDelegate;
        this.d = obj;
        this.f15646b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15645a) {
            case 0:
                ((MediaController) this.f15647c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15646b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f15647c;
                n70 n70Var = (n70) this.d;
                h4Var.f34078h0.M.c(0.0f, true);
                n70Var.f26362p = new org.telegram.ui.b0(h4Var, this.f15646b, 0);
                n70Var.Z();
                return;
        }
    }
}
