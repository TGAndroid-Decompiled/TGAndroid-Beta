package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nv0;
public final class g2 implements nv0 {
    public final int f9690a;
    public final NotificationCenter.NotificationCenterDelegate f9691b;

    public g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f9690a = i10;
        this.f9691b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f9690a) {
            case 0:
                a3 a3Var = ((k3) this.f9691b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ji.c2) this.f9691b).getClass();
                return;
        }
    }
}
