package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.iw0;
public final class a2 implements iw0 {
    public final int f11072a;
    public final NotificationCenter.NotificationCenterDelegate f11073b;

    public a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f11072a = i10;
        this.f11073b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f11072a) {
            case 0:
                u2 u2Var = ((d3) this.f11073b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ki.d2) this.f11073b).getClass();
                return;
        }
    }
}
