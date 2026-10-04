package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b80;
public final class a6 implements Runnable {
    public final int f17308a;
    public final float f17309b;
    public final NotificationCenter.NotificationCenterDelegate f17310c;
    public final Object d;

    public a6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17308a = i10;
        this.f17310c = notificationCenterDelegate;
        this.d = obj;
        this.f17309b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17308a) {
            case 0:
                ((MediaController) this.f17310c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17309b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17310c;
                b80 b80Var = (b80) this.d;
                i4Var.f37268h0.M.c(0.0f, true);
                b80Var.f24844p = new org.telegram.ui.c0(i4Var, this.f17309b, 0);
                b80Var.Z();
                return;
        }
    }
}
