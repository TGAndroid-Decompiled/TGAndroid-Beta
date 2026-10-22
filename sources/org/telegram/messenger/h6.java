package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i80;
public final class h6 implements Runnable {
    public final int f18497a;
    public final float f18498b;
    public final NotificationCenter.NotificationCenterDelegate f18499c;
    public final Object d;

    public h6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18497a = i10;
        this.f18499c = notificationCenterDelegate;
        this.d = obj;
        this.f18498b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18497a) {
            case 0:
                ((MediaController) this.f18499c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18498b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18499c;
                i80 i80Var = (i80) this.d;
                l4Var.f38770h0.M.c(0.0f, true);
                i80Var.f27183p = new org.telegram.ui.c0(l4Var, this.f18498b, 0);
                i80Var.Z();
                return;
        }
    }
}
