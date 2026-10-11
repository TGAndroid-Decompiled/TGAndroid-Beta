package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.q80;
public final class b6 implements Runnable {
    public final int f17398a;
    public final float f17399b;
    public final NotificationCenter.NotificationCenterDelegate f17400c;
    public final Object d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17398a = i10;
        this.f17400c = notificationCenterDelegate;
        this.d = obj;
        this.f17399b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17398a) {
            case 0:
                ((MediaController) this.f17400c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17399b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f17400c;
                q80 q80Var = (q80) this.d;
                h4Var.f38273h0.M.c(0.0f, true);
                q80Var.f30078p = new org.telegram.ui.b0(h4Var, this.f17399b, 0);
                q80Var.Z();
                return;
        }
    }
}
