package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p70;
public final class c6 implements Runnable {
    public final int f16893a;
    public final float f16894b;
    public final NotificationCenter.NotificationCenterDelegate f16895c;
    public final Object d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i10) {
        this.f16893a = i10;
        this.f16895c = notificationCenterDelegate;
        this.d = obj;
        this.f16894b = f10;
    }

    @Override
    public final void run() {
        switch (this.f16893a) {
            case 0:
                ((MediaController) this.f16895c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f16894b);
                return;
            default:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) this.f16895c;
                p70 p70Var = (p70) this.d;
                n4Var.f36363e0.J.c(0.0f, true);
                p70Var.f27772p = new org.telegram.ui.e0(n4Var, this.f16894b, 0);
                p70Var.Z();
                return;
        }
    }
}
