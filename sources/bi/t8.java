package bi;

import android.content.DialogInterface;
import org.telegram.messenger.v10;
public final class t8 implements DialogInterface.OnDismissListener {
    public final int f4752a;
    public final v10 f4753b;
    public final boolean[] f4754c;

    public t8(v10 v10Var, boolean[] zArr, int i7) {
        this.f4752a = i7;
        this.f4753b = v10Var;
        this.f4754c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4752a) {
            case 0:
                v10 v10Var = this.f4753b;
                if (v10Var != null && !this.f4754c[0]) {
                    v10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                v10 v10Var2 = this.f4753b;
                if (v10Var2 != null && !this.f4754c[0]) {
                    v10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                v10 v10Var3 = this.f4753b;
                if (v10Var3 != null && !this.f4754c[0]) {
                    v10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
