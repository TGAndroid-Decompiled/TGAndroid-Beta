package ai;

import org.telegram.messenger.NotificationCenter;
public final class ec implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f1231a;
    public final org.telegram.ui.ActionBar.h3[] f1232b;

    public ec(boolean[] zArr, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f1231a = zArr;
        this.f1232b = h3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.h3 h3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f1231a[0] && (h3Var = this.f1232b[0]) != null) {
            h3Var.dismiss();
        }
    }
}
