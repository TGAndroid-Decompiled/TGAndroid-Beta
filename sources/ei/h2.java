package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.kw0;
public final class h2 implements kw0 {
    public final int f9081a;
    public final NotificationCenter.NotificationCenterDelegate f9082b;

    public h2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f9081a = i10;
        this.f9082b = notificationCenterDelegate;
    }

    @Override
    public final void F(int i10, boolean z10) {
        switch (this.f9081a) {
            case 0:
                b3 b3Var = ((l3) this.f9082b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    b3Var.e(b3Var.getTopActionBarOffsetY() + (-b3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ii.e2) this.f9082b).getClass();
                return;
        }
    }
}
