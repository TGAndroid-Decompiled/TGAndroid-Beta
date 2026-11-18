package di;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
public final class n7 implements DialogInterface.OnDismissListener {
    public final int f9378a;
    public final q10 f9379b;
    public final boolean[] f9380c;

    public n7(int i7, q10 q10Var, boolean[] zArr) {
        this.f9378a = i7;
        this.f9379b = q10Var;
        this.f9380c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9378a) {
            case 0:
                q10 q10Var = this.f9379b;
                if (q10Var != null && !this.f9380c[0]) {
                    q10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                q10 q10Var2 = this.f9379b;
                if (q10Var2 != null && !this.f9380c[0]) {
                    q10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                q10 q10Var3 = this.f9379b;
                if (q10Var3 != null && !this.f9380c[0]) {
                    q10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
