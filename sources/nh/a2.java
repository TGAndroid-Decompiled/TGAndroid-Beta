package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yu0;

public final class a2 implements yu0 {

    public final int f18544a;

    public final NotificationCenter.NotificationCenterDelegate f18545b;

    public a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f18544a = i10;
        this.f18545b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f18544a) {
            case 0:
                s2 s2Var = ((b3) this.f18545b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    s2Var.e(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()));
                }
                break;
            default:
                ((rh.x1) this.f18545b).getClass();
                break;
        }
    }
}
