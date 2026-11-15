package di;

import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class la implements is {
    public final boolean[] f8998a;
    public final org.telegram.ui.ActionBar.u2[] f8999b;

    public la(boolean[] zArr, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.f8998a = zArr;
        this.f8999b = u2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.u2 u2Var;
        if (i7 == ns.A3 && this.f8998a[0] && (u2Var = this.f8999b[0]) != null) {
            u2Var.dismiss();
        }
    }
}
