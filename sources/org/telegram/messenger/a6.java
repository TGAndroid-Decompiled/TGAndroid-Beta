package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b80;
public final class a6 implements Runnable {
    public final int f17303a;
    public final float f17304b;
    public final NotificationCenter.NotificationCenterDelegate f17305c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17303a = i10;
        this.f17305c = notificationCenterDelegate;
        this.d = obj;
        this.f17304b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                ((MediaController) this.f17305c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17304b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17305c;
                b80 b80Var = (b80) this.d;
                i4Var.f37262h0.M.c(0.0f, true);
                b80Var.f24839p = new org.telegram.ui.c0(i4Var, this.f17304b, 0);
                b80Var.Z();
                return;
        }
    }
}
