package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.n70;
public final class a6 implements Runnable {
    public final int f15649a;
    public final float f15650b;
    public final NotificationCenter.NotificationCenterDelegate f15651c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15649a = i10;
        this.f15651c = notificationCenterDelegate;
        this.d = obj;
        this.f15650b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15649a) {
            case 0:
                ((MediaController) this.f15651c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15650b);
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f15651c;
                n70 n70Var = (n70) this.d;
                h4Var.f34139h0.M.c(0.0f, true);
                n70Var.f26363p = new org.telegram.ui.b0(h4Var, this.f15650b, 0);
                n70Var.Z();
                return;
        }
    }
}
