package defpackage;

import android.content.DialogInterface;
public final class bn9 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final on9 b;

    public bn9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.K0 = null;
                return;
            default:
                on9Var.dismiss();
                return;
        }
    }
}
