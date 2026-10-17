package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i80;
public final class e6 implements Runnable {
    public final int f18238a;
    public final float f18239b;
    public final NotificationCenter.NotificationCenterDelegate f18240c;
    public final Object d;

    public e6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18238a = i10;
        this.f18240c = notificationCenterDelegate;
        this.d = obj;
        this.f18239b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18238a) {
            case 0:
                ((MediaController) this.f18240c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18239b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18240c;
                i80 i80Var = (i80) this.d;
                l4Var.f38767h0.M.c(0.0f, true);
                i80Var.f27129p = new org.telegram.ui.c0(l4Var, this.f18239b, 0);
                i80Var.Z();
                return;
        }
    }
}
