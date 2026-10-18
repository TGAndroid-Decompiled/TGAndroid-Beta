package ai;

import org.telegram.messenger.NotificationCenter;
public final class dc implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f1176a;
    public final org.telegram.ui.ActionBar.f3[] f1177b;

    public dc(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1176a = zArr;
        this.f1177b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f1176a[0] && (f3Var = this.f1177b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
