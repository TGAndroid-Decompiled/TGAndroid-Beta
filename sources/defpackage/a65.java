package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class a65 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final g95 b;

    public a65(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                d S = LaunchActivity.S();
                if (g95Var.r2 && (S instanceof yv1)) {
                    ((yv1) S).ia(true, true);
                    return;
                }
                return;
            case 1:
                g95Var.dismiss();
                return;
            case 2:
                g95Var.y3 = null;
                return;
            default:
                g95Var.k2 = null;
                return;
        }
    }
}
