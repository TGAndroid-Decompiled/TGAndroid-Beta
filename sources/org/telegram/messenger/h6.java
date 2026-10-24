package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.h80;
public final class h6 implements Runnable {
    public final int f18562a;
    public final float f18563b;
    public final NotificationCenter.NotificationCenterDelegate f18564c;
    public final Object d;

    public h6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, float f7, int i10) {
        this.f18562a = i10;
        this.f18564c = notificationCenterDelegate;
        this.d = obj;
        this.f18563b = f7;
    }

    @Override
    public final void run() {
        switch (this.f18562a) {
            case 0:
                ((MediaController) this.f18564c).lambda$setPlaybackSpeed$16((MessageObject) this.d, this.f18563b);
                return;
            default:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f18564c;
                h80 h80Var = (h80) this.d;
                k4Var.f38762h0.M.c(0.0f, true);
                h80Var.f26924p = new org.telegram.ui.b0(k4Var, this.f18563b, 0);
                h80Var.Z();
                return;
        }
    }
}
