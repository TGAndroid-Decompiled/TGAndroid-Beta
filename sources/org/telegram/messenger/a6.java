package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n70;
public final class a6 implements Runnable {
    public final int f17155a;
    public final float f17156b;
    public final NotificationCenter.NotificationCenterDelegate f17157c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17155a = i10;
        this.f17157c = notificationCenterDelegate;
        this.d = obj;
        this.f17156b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17155a) {
            case 0:
                ((MediaController) this.f17157c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17156b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17157c;
                n70 n70Var = (n70) this.d;
                i4Var.f37247h0.M.c(0.0f, true);
                n70Var.f28682p = new org.telegram.ui.b0(i4Var, this.f17156b, 0);
                n70Var.Z();
                return;
        }
    }
}
