package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.q70;
public final class c6 implements Runnable {
    public final int f18329a;
    public final float f18330b;
    public final NotificationCenter.NotificationCenterDelegate f18331c;
    public final Object d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i10) {
        this.f18329a = i10;
        this.f18331c = notificationCenterDelegate;
        this.d = obj;
        this.f18330b = f10;
    }

    @Override
    public final void run() {
        switch (this.f18329a) {
            case 0:
                ((MediaController) this.f18331c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18330b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18331c;
                q70 q70Var = (q70) this.d;
                l4Var.f38512e0.J.c(0.0f, true);
                q70Var.f30328p = new org.telegram.ui.d0(l4Var, this.f18330b, 0);
                q70Var.Z();
                return;
        }
    }
}
