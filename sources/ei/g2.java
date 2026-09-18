package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pv0;
public final class g2 implements pv0 {
    public final int f8364a;
    public final NotificationCenter.NotificationCenterDelegate f8365b;

    public g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8364a = i10;
        this.f8365b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f8364a) {
            case 0:
                a3 a3Var = ((k3) this.f8365b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ii.d2) this.f8365b).getClass();
                return;
        }
    }
}
