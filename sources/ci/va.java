package ci;

import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
public final class va implements cs {
    public final boolean[] f6212a;
    public final org.telegram.ui.ActionBar.t2[] f6213b;

    public va(boolean[] zArr, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.f6212a = zArr;
        this.f6213b = t2VarArr;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.t2 t2Var;
        if (i3 == hs.A3 && this.f6212a[0] && (t2Var = this.f6213b[0]) != null) {
            t2Var.dismiss();
        }
    }
}
