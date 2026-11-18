package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class oa implements fs {
    public final boolean[] f9480a;
    public final org.telegram.ui.ActionBar.x2[] f9481b;

    public oa(boolean[] zArr, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.f9480a = zArr;
        this.f9481b = x2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.x2 x2Var;
        if (i7 == ks.C3 && this.f9480a[0] && (x2Var = this.f9481b[0]) != null) {
            x2Var.dismiss();
        }
    }
}
