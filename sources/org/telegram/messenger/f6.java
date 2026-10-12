package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.s80;
public final class f6 implements Runnable {
    public final int f17577a;
    public final float f17578b;
    public final NotificationCenter.NotificationCenterDelegate f17579c;
    public final Object d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17577a = i10;
        this.f17579c = notificationCenterDelegate;
        this.d = obj;
        this.f17578b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17577a) {
            case 0:
                ((MediaController) this.f17579c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17578b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17579c;
                s80 s80Var = (s80) this.d;
                i4Var.f38652h0.M.c(0.0f, true);
                s80Var.f30463p = new org.telegram.ui.c0(i4Var, this.f17578b, 0);
                s80Var.Z();
                return;
        }
    }
}
