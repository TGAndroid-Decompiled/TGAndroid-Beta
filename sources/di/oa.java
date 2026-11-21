package di;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class oa implements fs {
    public final boolean[] f9493a;
    public final org.telegram.ui.ActionBar.w2[] f9494b;

    public oa(boolean[] zArr, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.f9493a = zArr;
        this.f9494b = w2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.w2 w2Var;
        if (i7 == ks.C3 && this.f9493a[0] && (w2Var = this.f9494b[0]) != null) {
            w2Var.dismiss();
        }
    }
}
