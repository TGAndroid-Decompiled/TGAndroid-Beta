package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class zb implements ls {
    public final boolean[] f5186a;
    public final org.telegram.ui.ActionBar.v2[] f5187b;

    public zb(boolean[] zArr, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.f5186a = zArr;
        this.f5187b = v2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.v2 v2Var;
        if (i7 == qs.A3 && this.f5186a[0] && (v2Var = this.f5187b[0]) != null) {
            v2Var.dismiss();
        }
    }
}
