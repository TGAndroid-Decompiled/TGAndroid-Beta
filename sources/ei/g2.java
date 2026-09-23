package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ov0;
public final class g2 implements ov0 {
    public final int f8347a;
    public final NotificationCenter.NotificationCenterDelegate f8348b;

    public g2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8347a = i10;
        this.f8348b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f8347a) {
            case 0:
                a3 a3Var = ((k3) this.f8348b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ii.e2) this.f8348b).getClass();
                return;
        }
    }
}
