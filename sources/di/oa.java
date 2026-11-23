package di;

import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public final class oa implements gs {
    public final boolean[] f9496a;
    public final org.telegram.ui.ActionBar.w2[] f9497b;

    public oa(boolean[] zArr, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9496a = zArr;
        this.f9497b = w2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.w2 w2Var;
        if (i7 == ls.C3 && this.f9496a[0] && (w2Var = this.f9497b[0]) != null) {
            w2Var.dismiss();
        }
    }
}
