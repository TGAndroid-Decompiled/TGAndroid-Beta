package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lw0;
public final class h2 implements lw0 {
    public final int f9082a;
    public final NotificationCenter.NotificationCenterDelegate f9083b;

    public h2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f9082a = i10;
        this.f9083b = notificationCenterDelegate;
    }

    @Override
    public final void F(int i10, boolean z10) {
        switch (this.f9082a) {
            case 0:
                b3 b3Var = ((l3) this.f9083b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    b3Var.e(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ii.e2) this.f9083b).getClass();
                return;
        }
    }
}
