package gh;

import org.telegram.messenger.NotificationCenter;
public final class i9 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f8308a;
    public final org.telegram.ui.ActionBar.f3[] f8309b;

    public i9(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f8308a = zArr;
        this.f8309b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i9 == NotificationCenter.starSubscriptionsLoaded && this.f8308a[0] && (f3Var = this.f8309b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
