package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.uw0;
public final class i2 implements uw0 {
    public final int f13031a;
    public final NotificationCenter.NotificationCenterDelegate f13032b;

    public i2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f13031a = i10;
        this.f13032b = notificationCenterDelegate;
    }

    @Override
    public final void I(int i10, boolean z10) {
        switch (this.f13031a) {
            case 0:
                d3 d3Var = ((m3) this.f13032b).f13129w;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((li.b2) this.f13032b).getClass();
                return;
        }
    }
}
