package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.zv0;
public final class g2 implements zv0 {
    public final int f8346a;
    public final NotificationCenter.NotificationCenterDelegate f8347b;

    public g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8346a = i10;
        this.f8347b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f8346a) {
            case 0:
                a3 a3Var = ((k3) this.f8347b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ii.e2) this.f8347b).getClass();
                return;
        }
    }
}
