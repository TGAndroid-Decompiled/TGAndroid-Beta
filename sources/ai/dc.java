package ai;

import org.telegram.messenger.NotificationCenter;
public final class dc implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f1164a;
    public final org.telegram.ui.ActionBar.f3[] f1165b;

    public dc(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1164a = zArr;
        this.f1165b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f1164a[0] && (f3Var = this.f1165b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
