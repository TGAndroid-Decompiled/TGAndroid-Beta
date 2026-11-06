package bi;

import android.content.DialogInterface;
import org.telegram.messenger.v10;
public final class t8 implements DialogInterface.OnDismissListener {
    public final int f4754a;
    public final v10 f4755b;
    public final boolean[] f4756c;

    public t8(v10 v10Var, boolean[] zArr, int i7) {
        this.f4754a = i7;
        this.f4755b = v10Var;
        this.f4756c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4754a) {
            case 0:
                v10 v10Var = this.f4755b;
                if (v10Var != null && !this.f4756c[0]) {
                    v10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                v10 v10Var2 = this.f4755b;
                if (v10Var2 != null && !this.f4756c[0]) {
                    v10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                v10 v10Var3 = this.f4755b;
                if (v10Var3 != null && !this.f4756c[0]) {
                    v10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
