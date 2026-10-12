package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.m80;
public final class f6 implements Runnable {
    public final int f17219a;
    public final float f17220b;
    public final NotificationCenter.NotificationCenterDelegate f17221c;
    public final Object d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17219a = i10;
        this.f17221c = notificationCenterDelegate;
        this.d = obj;
        this.f17220b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17219a) {
            case 0:
                ((MediaController) this.f17221c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17220b);
                return;
            default:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f17221c;
                m80 m80Var = (m80) this.d;
                k4Var.f37545h0.M.c(0.0f, true);
                m80Var.f27293p = new org.telegram.ui.c0(k4Var, this.f17220b, 0);
                m80Var.Z();
                return;
        }
    }
}
