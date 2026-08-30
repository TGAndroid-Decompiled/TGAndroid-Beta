package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.o70;
public final class c6 implements Runnable {
    public final int f16908a;
    public final float f16909b;
    public final NotificationCenter.NotificationCenterDelegate f16910c;
    public final Object d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i10) {
        this.f16908a = i10;
        this.f16910c = notificationCenterDelegate;
        this.d = obj;
        this.f16909b = f10;
    }

    @Override
    public final void run() {
        switch (this.f16908a) {
            case 0:
                ((MediaController) this.f16910c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f16909b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f16910c;
                o70 o70Var = (o70) this.d;
                l4Var.f35933e0.J.c(0.0f, true);
                o70Var.f27484p = new org.telegram.ui.d0(l4Var, this.f16909b, 0);
                o70Var.Z();
                return;
        }
    }
}
