package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p80;
public final class b6 implements Runnable {
    public final int f17401a;
    public final float f17402b;
    public final NotificationCenter.NotificationCenterDelegate f17403c;
    public final Object d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17401a = i10;
        this.f17403c = notificationCenterDelegate;
        this.d = obj;
        this.f17402b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17401a) {
            case 0:
                ((MediaController) this.f17403c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17402b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17403c;
                p80 p80Var = (p80) this.d;
                i4Var.f38501h0.M.c(0.0f, true);
                p80Var.f29784p = new org.telegram.ui.c0(i4Var, this.f17402b, 0);
                p80Var.Z();
                return;
        }
    }
}
