package ai;

import org.telegram.messenger.NotificationCenter;
public final class cc implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f1110a;
    public final org.telegram.ui.ActionBar.f3[] f1111b;

    public cc(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f1110a = zArr;
        this.f1111b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f1110a[0] && (f3Var = this.f1111b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
