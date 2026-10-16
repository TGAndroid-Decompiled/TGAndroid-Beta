package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.l80;
public final class f6 implements Runnable {
    public final int f16918a;
    public final float f16919b;
    public final NotificationCenter.NotificationCenterDelegate f16920c;
    public final Object d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f16918a = i10;
        this.f16920c = notificationCenterDelegate;
        this.d = obj;
        this.f16919b = f7;
    }

    @Override
    public final void run() {
        switch (this.f16918a) {
            case 0:
                ((MediaController) this.f16920c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f16919b);
                return;
            default:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f16920c;
                l80 l80Var = (l80) this.d;
                k4Var.f37266h0.M.c(0.0f, true);
                l80Var.f26663p = new org.telegram.ui.c0(k4Var, this.f16919b, 0);
                l80Var.Z();
                return;
        }
    }
}
