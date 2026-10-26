package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.k80;
public final class i6 implements Runnable {
    public final int f20316a;
    public final float f20317b;
    public final NotificationCenter.NotificationCenterDelegate f20318c;
    public final Object d;

    public i6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f20316a = i10;
        this.f20318c = notificationCenterDelegate;
        this.d = obj;
        this.f20317b = f7;
    }

    @Override
    public final void run() {
        switch (this.f20316a) {
            case 0:
                ((MediaController) this.f20318c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f20317b);
                return;
            default:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f20318c;
                k80 k80Var = (k80) this.d;
                j4Var.f40437h0.M.c(0.0f, true);
                k80Var.f29863p = new org.telegram.ui.b0(j4Var, this.f20317b, 0);
                k80Var.Z();
                return;
        }
    }
}
