package lh;

import org.telegram.messenger.NotificationCenter;
public final class e9 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean[] f12368a;
    public final org.telegram.ui.ActionBar.g3[] f12369b;

    public e9(boolean[] zArr, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f12368a = zArr;
        this.f12369b = g3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.g3 g3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f12368a[0] && (g3Var = this.f12369b[0]) != null) {
            g3Var.dismiss();
        }
    }
}
