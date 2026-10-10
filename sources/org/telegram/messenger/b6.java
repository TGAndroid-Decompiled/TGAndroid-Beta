package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.q80;
public final class b6 implements Runnable {
    public final int f17405a;
    public final float f17406b;
    public final NotificationCenter.NotificationCenterDelegate f17407c;
    public final Object d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f17405a = i10;
        this.f17407c = notificationCenterDelegate;
        this.d = obj;
        this.f17406b = f7;
    }

    @Override
    public final void run() {
        switch (this.f17405a) {
            case 0:
                ((MediaController) this.f17407c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f17406b);
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f17407c;
                q80 q80Var = (q80) this.d;
                i4Var.f38547h0.M.c(0.0f, true);
                q80Var.f30115p = new org.telegram.ui.c0(i4Var, this.f17406b, 0);
                q80Var.Z();
                return;
        }
    }
}
