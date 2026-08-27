package org.telegram.messenger;

import org.telegram.ui.Components.b70;

public final class b6 implements Runnable {

    public final int f19766a;

    public final float f19767b;

    public final NotificationCenter.NotificationCenterDelegate f19768c;
    public final Object d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f10, int i10) {
        this.f19766a = i10;
        this.f19768c = notificationCenterDelegate;
        this.d = obj;
        this.f19767b = f10;
    }

    @Override
    public final void run() {
        switch (this.f19766a) {
            case 0:
                ((MediaController) this.f19768c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f19767b);
                break;
            default:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) this.f19768c;
                b70 b70Var = (b70) this.d;
                m4Var.f40335d0.I.c(0.0f, true);
                b70Var.f26987p = new org.telegram.ui.e0(m4Var, this.f19767b, 0);
                b70Var.Z();
                break;
        }
    }
}
