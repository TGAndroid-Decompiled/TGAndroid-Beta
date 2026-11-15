package di;

import android.content.DialogInterface;
import org.telegram.messenger.z10;
public final class j7 implements DialogInterface.OnDismissListener {
    public final int f8862a = 0;
    public final boolean[] f8863b;
    public final z10 f8864c;

    public j7(z10 z10Var, boolean[] zArr) {
        this.f8864c = z10Var;
        this.f8863b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8862a) {
            case 0:
                z10 z10Var = this.f8864c;
                if (z10Var != null && !this.f8863b[0]) {
                    z10Var.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f8863b;
                if (!zArr[0]) {
                    this.f8864c.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public j7(boolean[] zArr, z10 z10Var) {
        this.f8863b = zArr;
        this.f8864c = z10Var;
    }
}
