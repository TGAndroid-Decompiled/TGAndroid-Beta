package mh;

import org.telegram.messenger.NotificationCenter;
public final class e9 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f13977a;
    public final org.telegram.ui.ActionBar.h3[] f13978b;

    public e9(boolean[] zArr, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f13977a = zArr;
        this.f13978b = h3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.h3 h3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f13977a[0] && (h3Var = this.f13978b[0]) != null) {
            h3Var.dismiss();
        }
    }
}
