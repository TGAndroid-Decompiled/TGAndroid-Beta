package jh;

import org.telegram.messenger.NotificationCenter;
public final class d9 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f11960a;
    public final org.telegram.ui.ActionBar.f3[] f11961b;

    public d9(boolean[] zArr, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f11960a = zArr;
        this.f11961b = f3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.f3 f3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f11960a[0] && (f3Var = this.f11961b[0]) != null) {
            f3Var.dismiss();
        }
    }
}
