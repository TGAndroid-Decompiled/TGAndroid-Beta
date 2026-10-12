package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.s80;
public final class f6 implements Runnable {
    public final int f17576a;
    public final float f17577b;
    public final NotificationCenter.NotificationCenterDelegate f17578c;
    public final Object d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17576a = i10;
        this.f17578c = notificationCenterDelegate;
        this.d = obj;
        this.f17577b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17576a) {
            case 0:
                ((MediaController) this.f17578c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17577b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17578c;
                s80 s80Var = (s80) this.d;
                i4Var.f38649h0.M.c(0.0f, true);
                s80Var.f30467p = new org.telegram.ui.c0(i4Var, this.f17577b, 0);
                s80Var.Z();
                return;
        }
    }
}
