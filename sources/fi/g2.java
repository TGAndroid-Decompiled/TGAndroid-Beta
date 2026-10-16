package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nw0;
public final class g2 implements nw0 {
    public final int f9291a;
    public final NotificationCenter.NotificationCenterDelegate f9292b;

    public g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f9291a = i10;
        this.f9292b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f9291a) {
            case 0:
                a3 a3Var = ((k3) this.f9292b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ji.d2) this.f9292b).getClass();
                return;
        }
    }
}
