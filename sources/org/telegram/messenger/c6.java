package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.q70;
public final class c6 implements Runnable {
    public final int f18327a;
    public final float f18328b;
    public final NotificationCenter.NotificationCenterDelegate f18329c;
    public final Object d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i10) {
        this.f18327a = i10;
        this.f18329c = notificationCenterDelegate;
        this.d = obj;
        this.f18328b = f10;
    }

    @Override
    public final void run() {
        switch (this.f18327a) {
            case 0:
                ((MediaController) this.f18329c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18328b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18329c;
                q70 q70Var = (q70) this.d;
                l4Var.f38607e0.J.c(0.0f, true);
                q70Var.f30324p = new org.telegram.ui.d0(l4Var, this.f18328b, 0);
                q70Var.Z();
                return;
        }
    }
}
