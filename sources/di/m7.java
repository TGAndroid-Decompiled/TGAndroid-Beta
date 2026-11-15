package di;

import android.content.DialogInterface;
import org.telegram.messenger.s10;
public final class m7 implements DialogInterface.OnDismissListener {
    public final int f9039a;
    public final s10 f9040b;
    public final boolean[] f9041c;

    public m7(s10 s10Var, boolean[] zArr, int i7) {
        this.f9039a = i7;
        this.f9040b = s10Var;
        this.f9041c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9039a) {
            case 0:
                s10 s10Var = this.f9040b;
                if (s10Var != null && !this.f9041c[0]) {
                    s10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                s10 s10Var2 = this.f9040b;
                if (s10Var2 != null && !this.f9041c[0]) {
                    s10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                s10 s10Var3 = this.f9040b;
                if (s10Var3 != null && !this.f9041c[0]) {
                    s10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
