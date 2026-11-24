package defpackage;

import android.content.DialogInterface;
public final class hv7 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final xv7 b;

    public hv7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.y0(false);
                return;
            default:
                xv7Var.y0(false);
                return;
        }
    }
}
