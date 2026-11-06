package bi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class zb implements ls {
    public final boolean[] f5188a;
    public final org.telegram.ui.ActionBar.v2[] f5189b;

    public zb(boolean[] zArr, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.f5188a = zArr;
        this.f5189b = v2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.v2 v2Var;
        if (i7 == qs.A3 && this.f5188a[0] && (v2Var = this.f5189b[0]) != null) {
            v2Var.dismiss();
        }
    }
}
