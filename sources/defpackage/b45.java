package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class b45 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final h75 b;

    public b45(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                d S = LaunchActivity.S();
                if (h75Var.r2 && (S instanceof mu1)) {
                    ((mu1) S).Y9(true, true);
                    return;
                }
                return;
            case 1:
                h75Var.dismiss();
                return;
            case 2:
                h75Var.y3 = null;
                return;
            default:
                h75Var.k2 = null;
                return;
        }
    }
}
