package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class zb implements ls {
    public final boolean[] f5191a;
    public final org.telegram.ui.ActionBar.w2[] f5192b;

    public zb(boolean[] zArr, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f5191a = zArr;
        this.f5192b = w2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.w2 w2Var;
        if (i7 == qs.A3 && this.f5191a[0] && (w2Var = this.f5192b[0]) != null) {
            w2Var.dismiss();
        }
    }
}
