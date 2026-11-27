package defpackage;

import android.content.DialogInterface;
public final class nw7 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final dx7 b;

    public nw7(dx7 dx7Var, byte b) {
        this.a = b;
        this.b = dx7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.y0(false);
                return;
            default:
                dx7Var.y0(false);
                return;
        }
    }
}
