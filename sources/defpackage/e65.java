package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class e65 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final j95 b;

    public e65(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                e S = LaunchActivity.S();
                if (j95Var.r2 && (S instanceof zu1)) {
                    ((zu1) S).ja(true, true);
                    return;
                }
                return;
            case 1:
                j95Var.dismiss();
                return;
            case 2:
                j95Var.k2 = null;
                return;
            default:
                j95Var.y3 = null;
                return;
        }
    }
}
