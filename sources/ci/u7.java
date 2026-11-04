package ci;

import android.content.DialogInterface;
import org.telegram.messenger.n10;
public final class u7 implements DialogInterface.OnDismissListener {
    public final int f6109a;
    public final n10 f6110b;
    public final boolean[] f6111c;

    public u7(n10 n10Var, boolean[] zArr, int i3) {
        this.f6109a = i3;
        this.f6110b = n10Var;
        this.f6111c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6109a) {
            case 0:
                n10 n10Var = this.f6110b;
                if (n10Var != null && !this.f6111c[0]) {
                    n10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                n10 n10Var2 = this.f6110b;
                if (n10Var2 != null && !this.f6111c[0]) {
                    n10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                n10 n10Var3 = this.f6110b;
                if (n10Var3 != null && !this.f6111c[0]) {
                    n10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
