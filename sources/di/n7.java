package di;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
public final class n7 implements DialogInterface.OnDismissListener {
    public final int f9381a;
    public final q10 f9382b;
    public final boolean[] f9383c;

    public n7(int i7, q10 q10Var, boolean[] zArr) {
        this.f9381a = i7;
        this.f9382b = q10Var;
        this.f9383c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9381a) {
            case 0:
                q10 q10Var = this.f9382b;
                if (q10Var != null && !this.f9383c[0]) {
                    q10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                q10 q10Var2 = this.f9382b;
                if (q10Var2 != null && !this.f9383c[0]) {
                    q10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                q10 q10Var3 = this.f9382b;
                if (q10Var3 != null && !this.f9383c[0]) {
                    q10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
