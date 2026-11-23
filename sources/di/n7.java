package di;

import android.content.DialogInterface;
import org.telegram.messenger.r10;
public final class n7 implements DialogInterface.OnDismissListener {
    public final int f9403a;
    public final r10 f9404b;
    public final boolean[] f9405c;

    public n7(int i7, r10 r10Var, boolean[] zArr) {
        this.f9403a = i7;
        this.f9404b = r10Var;
        this.f9405c = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f9403a) {
            case 0:
                r10 r10Var = this.f9404b;
                if (r10Var != null && !this.f9405c[0]) {
                    r10Var.a(0L, Boolean.FALSE);
                    return;
                }
                return;
            case 1:
                r10 r10Var2 = this.f9404b;
                if (r10Var2 != null && !this.f9405c[0]) {
                    r10Var2.a(Boolean.FALSE, null);
                    return;
                }
                return;
            default:
                r10 r10Var3 = this.f9404b;
                if (r10Var3 != null && !this.f9405c[0]) {
                    r10Var3.a(Boolean.FALSE, null);
                    return;
                }
                return;
        }
    }
}
