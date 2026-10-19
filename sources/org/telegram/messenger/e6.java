package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.i80;
public final class e6 implements Runnable {
    public final int f18249a;
    public final float f18250b;
    public final NotificationCenter.NotificationCenterDelegate f18251c;
    public final Object d;

    public e6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18249a = i10;
        this.f18251c = notificationCenterDelegate;
        this.d = obj;
        this.f18250b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18249a) {
            case 0:
                ((MediaController) this.f18251c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18250b);
                return;
            default:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f18251c;
                i80 i80Var = (i80) this.d;
                l4Var.f38760h0.M.c(0.0f, true);
                i80Var.f27129p = new org.telegram.ui.c0(l4Var, this.f18250b, 0);
                i80Var.Z();
                return;
        }
    }
}
