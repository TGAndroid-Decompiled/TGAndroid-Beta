package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.o70;
public final class a6 implements Runnable {
    public final int f15622a;
    public final float f15623b;
    public final NotificationCenter.NotificationCenterDelegate f15624c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f15622a = i10;
        this.f15624c = notificationCenterDelegate;
        this.d = obj;
        this.f15623b = f7;
    }

    @Override
    public final void run() {
        switch (this.f15622a) {
            case 0:
                ((MediaController) this.f15624c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f15623b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f15624c;
                o70 o70Var = (o70) this.d;
                i4Var.f34009h0.M.c(0.0f, true);
                o70Var.f26664p = new org.telegram.ui.c0(i4Var, this.f15623b, 0);
                o70Var.Z();
                return;
        }
    }
}
