package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l80;
public final class j6 implements Runnable {
    public final int f20410a;
    public final float f20411b;
    public final NotificationCenter.NotificationCenterDelegate f20412c;
    public final Object d;

    public j6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f20410a = i10;
        this.f20412c = notificationCenterDelegate;
        this.d = obj;
        this.f20411b = f7;
    }

    @Override
    public final void run() {
        switch (this.f20410a) {
            case 0:
                ((MediaController) this.f20412c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f20411b);
                return;
            default:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f20412c;
                l80 l80Var = (l80) this.d;
                j4Var.f40402h0.M.c(0.0f, true);
                l80Var.f30163p = new org.telegram.ui.b0(j4Var, this.f20411b, 0);
                l80Var.Z();
                return;
        }
    }
}
