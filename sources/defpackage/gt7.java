package defpackage;

import android.content.DialogInterface;
public final class gt7 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final wt7 b;

    public gt7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.y0(false);
                return;
            default:
                wt7Var.y0(false);
                return;
        }
    }
}
