package defpackage;

import android.content.DialogInterface;
public final class lg6 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final rg6 b;

    public lg6(rg6 rg6Var, byte b) {
        this.a = b;
        this.b = rg6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        rg6 rg6Var = this.b;
        switch (b) {
            case 0:
                rg6Var.v0.finishFragment();
                return;
            default:
                rg6Var.v0.finishFragment();
                return;
        }
    }
}
