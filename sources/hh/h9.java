package hh;

import org.telegram.messenger.NotificationCenter;

public final class h9 implements NotificationCenter.NotificationCenterDelegate {

    public final boolean[] f9397a;

    public final org.telegram.ui.ActionBar.e3[] f9398b;

    public h9(boolean[] zArr, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f9397a = zArr;
        this.f9398b = e3VarArr;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.e3 e3Var;
        if (i10 == NotificationCenter.starSubscriptionsLoaded && this.f9397a[0] && (e3Var = this.f9398b[0]) != null) {
            e3Var.dismiss();
        }
    }
}
