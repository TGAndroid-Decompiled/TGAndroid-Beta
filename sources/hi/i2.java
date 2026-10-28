package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.vw0;
public final class i2 implements vw0 {
    public final int f13030a;
    public final NotificationCenter.NotificationCenterDelegate f13031b;

    public i2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f13030a = i10;
        this.f13031b = notificationCenterDelegate;
    }

    @Override
    public final void I(int i10, boolean z10) {
        switch (this.f13030a) {
            case 0:
                d3 d3Var = ((m3) this.f13031b).f13128w;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((li.b2) this.f13031b).getClass();
                return;
        }
    }
}
