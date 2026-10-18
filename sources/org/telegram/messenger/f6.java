package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i80;
public final class f6 implements Runnable {
    public final int f18329a;
    public final float f18330b;
    public final NotificationCenter.NotificationCenterDelegate f18331c;
    public final Object d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18329a = i10;
        this.f18331c = notificationCenterDelegate;
        this.d = obj;
        this.f18330b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18329a) {
            case 0:
                ((MediaController) this.f18331c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18330b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18331c;
                i80 i80Var = (i80) this.d;
                l4Var.f38713h0.M.c(0.0f, true);
                i80Var.f27129p = new org.telegram.ui.c0(l4Var, this.f18330b, 0);
                i80Var.Z();
                return;
        }
    }
}
