package mh;

import org.telegram.messenger.NotificationCenter;
public final class e9 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f13975a;
    public final org.telegram.ui.ActionBar.h3[] f13976b;

    public e9(boolean[] zArr, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f13975a = zArr;
        this.f13976b = h3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.h3 h3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f13975a[0] && (h3Var = this.f13976b[0]) != null) {
            h3Var.dismiss();
        }
    }
}
