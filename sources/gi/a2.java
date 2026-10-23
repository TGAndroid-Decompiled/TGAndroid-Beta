package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nw0;
public final class a2 implements nw0 {
    public final int f11090a;
    public final NotificationCenter.NotificationCenterDelegate f11091b;

    public a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f11090a = i10;
        this.f11091b = notificationCenterDelegate;
    }

    @Override
    public final void G(int i10, boolean z10) {
        switch (this.f11090a) {
            case 0:
                u2 u2Var = ((d3) this.f11091b).f11184w;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((ki.d2) this.f11091b).getClass();
                return;
        }
    }
}
