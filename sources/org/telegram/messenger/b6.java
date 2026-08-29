package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.j70;
public final class b6 implements Runnable {
    public final int f19775a;
    public final float f19776b;
    public final NotificationCenter.NotificationCenterDelegate f19777c;
    public final Object d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f9, int i10) {
        this.f19775a = i10;
        this.f19777c = notificationCenterDelegate;
        this.d = obj;
        this.f19776b = f9;
    }

    @Override
    public final void run() {
        switch (this.f19775a) {
            case 0:
                ((MediaController) this.f19777c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f19776b);
                return;
            default:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f19777c;
                j70 j70Var = (j70) this.d;
                m4Var.f40392d0.I.c(0.0f, true);
                j70Var.f29595p = new org.telegram.ui.e0(m4Var, this.f19776b, 0);
                j70Var.Z();
                return;
        }
    }
}
