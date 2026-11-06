package bi;

import android.content.DialogInterface;
import org.telegram.messenger.c20;
public final class q8 implements DialogInterface.OnDismissListener {
    public final int f4579a = 0;
    public final boolean[] f4580b;
    public final c20 f4581c;

    public q8(c20 c20Var, boolean[] zArr) {
        this.f4581c = c20Var;
        this.f4580b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4579a) {
            case 0:
                c20 c20Var = this.f4581c;
                if (c20Var != null && !this.f4580b[0]) {
                    c20Var.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f4580b;
                if (!zArr[0]) {
                    this.f4581c.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public q8(boolean[] zArr, c20 c20Var) {
        this.f4580b = zArr;
        this.f4581c = c20Var;
    }
}
