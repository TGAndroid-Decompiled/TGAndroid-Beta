package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.rw0;
public final class g2 implements rw0 {
    public final int f9081a;
    public final NotificationCenter.NotificationCenterDelegate f9082b;

    public g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f9081a = i10;
        this.f9082b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f9081a) {
            case 0:
                a3 a3Var = ((k3) this.f9082b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ii.e2) this.f9082b).getClass();
                return;
        }
    }
}
