package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wu0;
public final class a2 implements wu0 {
    public final int f17698a;
    public final NotificationCenter.NotificationCenterDelegate f17699b;

    public a2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f17698a = i9;
        this.f17699b = notificationCenterDelegate;
    }

    @Override
    public final void G(int i9, boolean z10) {
        switch (this.f17698a) {
            case 0:
                t2 t2Var = ((c3) this.f17699b).v;
                if (i9 > AndroidUtilities.dp(20.0f)) {
                    t2Var.e(t2Var.getTopActionBarOffsetY() + (-t2Var.getOffsetY()));
                    return;
                }
                return;
            default:
                ((qh.x1) this.f17699b).getClass();
                return;
        }
    }
}
