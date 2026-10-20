package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i80;
public final class g6 implements Runnable {
    public final int f18422a;
    public final float f18423b;
    public final NotificationCenter.NotificationCenterDelegate f18424c;
    public final Object d;

    public g6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18422a = i10;
        this.f18424c = notificationCenterDelegate;
        this.d = obj;
        this.f18423b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18422a) {
            case 0:
                ((MediaController) this.f18424c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18423b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18424c;
                i80 i80Var = (i80) this.d;
                l4Var.f38766h0.M.c(0.0f, true);
                i80Var.f27180p = new org.telegram.ui.c0(l4Var, this.f18423b, 0);
                i80Var.Z();
                return;
        }
    }
}
