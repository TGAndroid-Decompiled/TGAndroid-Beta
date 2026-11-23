package di;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
public final class n7 implements DialogInterface.OnDismissListener {
    public final int f9364a;
    public final p10 f9365b;
    public final boolean[] f9366c;

    public n7(int i7, p10 p10Var, boolean[] zArr) {
        this.f9364a = i7;
        this.f9365b = p10Var;
        this.f9366c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9364a) {
            case 0:
                p10 p10Var = this.f9365b;
                if (p10Var != null && !this.f9366c[0]) {
                    p10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                p10 p10Var2 = this.f9365b;
                if (p10Var2 != null && !this.f9366c[0]) {
                    p10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                p10 p10Var3 = this.f9365b;
                if (p10Var3 != null && !this.f9366c[0]) {
                    p10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
