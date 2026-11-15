package di;

import android.content.DialogInterface;
import org.telegram.messenger.s10;
public final class m7 implements DialogInterface.OnDismissListener {
    public final int f9061a;
    public final s10 f9062b;
    public final boolean[] f9063c;

    public m7(s10 s10Var, boolean[] zArr, int i7) {
        this.f9061a = i7;
        this.f9062b = s10Var;
        this.f9063c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9061a) {
            case 0:
                s10 s10Var = this.f9062b;
                if (s10Var != null && !this.f9063c[0]) {
                    s10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                s10 s10Var2 = this.f9062b;
                if (s10Var2 != null && !this.f9063c[0]) {
                    s10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                s10 s10Var3 = this.f9062b;
                if (s10Var3 != null && !this.f9063c[0]) {
                    s10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
