package ci;

import android.content.DialogInterface;
import org.telegram.messenger.u10;
public final class r7 implements DialogInterface.OnDismissListener {
    public final int f5900a = 0;
    public final boolean[] f5901b;
    public final u10 f5902c;

    public r7(u10 u10Var, boolean[] zArr) {
        this.f5902c = u10Var;
        this.f5901b = zArr;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5900a) {
            case 0:
                u10 u10Var = this.f5902c;
                if (u10Var != null && !this.f5901b[0]) {
                    u10Var.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr = this.f5901b;
                if (!zArr[0]) {
                    this.f5902c.a(Boolean.FALSE);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public r7(boolean[] zArr, u10 u10Var) {
        this.f5901b = zArr;
        this.f5902c = u10Var;
    }
}
