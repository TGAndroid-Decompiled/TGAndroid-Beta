package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b80;
public final class a6 implements Runnable {
    public final int f17304a;
    public final float f17305b;
    public final NotificationCenter.NotificationCenterDelegate f17306c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17304a = i10;
        this.f17306c = notificationCenterDelegate;
        this.d = obj;
        this.f17305b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                ((MediaController) this.f17306c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17305b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17306c;
                b80 b80Var = (b80) this.d;
                i4Var.f37263h0.M.c(0.0f, true);
                b80Var.f24840p = new org.telegram.ui.c0(i4Var, this.f17305b, 0);
                b80Var.Z();
                return;
        }
    }
}
