package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p80;
public final class b6 implements Runnable {
    public final int f17434a;
    public final float f17435b;
    public final NotificationCenter.NotificationCenterDelegate f17436c;
    public final Object d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17434a = i10;
        this.f17436c = notificationCenterDelegate;
        this.d = obj;
        this.f17435b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17434a) {
            case 0:
                ((MediaController) this.f17436c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17435b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f17436c;
                p80 p80Var = (p80) this.d;
                h4Var.f38307h0.M.c(0.0f, true);
                p80Var.f29774p = new org.telegram.ui.b0(h4Var, this.f17435b, 0);
                p80Var.Z();
                return;
        }
    }
}
