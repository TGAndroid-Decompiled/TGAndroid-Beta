package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.j80;
public final class g6 implements Runnable {
    public final int f18486a;
    public final float f18487b;
    public final NotificationCenter.NotificationCenterDelegate f18488c;
    public final Object d;

    public g6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18486a = i10;
        this.f18488c = notificationCenterDelegate;
        this.d = obj;
        this.f18487b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18486a) {
            case 0:
                ((MediaController) this.f18488c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18487b);
                return;
            default:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f18488c;
                j80 j80Var = (j80) this.d;
                k4Var.f38793h0.M.c(0.0f, true);
                j80Var.f27575p = new org.telegram.ui.b0(k4Var, this.f18487b, 0);
                j80Var.Z();
                return;
        }
    }
}
