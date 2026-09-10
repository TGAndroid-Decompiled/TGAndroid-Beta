package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.zv0;
public final class j2 implements zv0 {
    public final int f6700a;
    public final NotificationCenter.NotificationCenterDelegate f6701b;

    public j2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6700a = i10;
        this.f6701b = notificationCenterDelegate;
    }

    @Override
    public final void H(int i10, boolean z10) {
        switch (this.f6700a) {
            case 0:
                d3 d3Var = ((n3) this.f6701b).v;
                if (i10 > AndroidUtilities.dp(20.0f)) {
                    d3Var.e(d3Var.getTopActionBarOffsetY() + (-d3Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((hi.g2) this.f6701b).getClass();
                return;
        }
    }
}
