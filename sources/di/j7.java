package di;

import android.content.DialogInterface;
import org.telegram.messenger.z10;
public final class j7 implements DialogInterface.OnDismissListener {
    public final int f8857a = 0;
    public final boolean[] f8858b;
    public final z10 f8859c;

    public j7(z10 z10Var, boolean[] zArr) {
        this.f8859c = z10Var;
        this.f8858b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8857a) {
            case 0:
                z10 z10Var = this.f8859c;
                if (z10Var != null && !this.f8858b[0]) {
                    z10Var.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f8858b;
                if (!zArr[0]) {
                    this.f8859c.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public j7(boolean[] zArr, z10 z10Var) {
        this.f8858b = zArr;
        this.f8859c = z10Var;
    }
}
