package bi;

import org.telegram.messenger.NotificationCenter;
public final class xb implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f5708a;
    public final org.telegram.ui.ActionBar.k3[] f5709b;

    public xb(boolean[] zArr, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.f5708a = zArr;
        this.f5709b = k3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.k3 k3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f5708a[0] && (k3Var = this.f5709b[0]) != null) {
            k3Var.dismiss();
        }
    }
}
