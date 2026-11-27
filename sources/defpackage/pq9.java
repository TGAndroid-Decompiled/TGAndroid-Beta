package defpackage;

import android.content.DialogInterface;
public final class pq9 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final er9 b;

    public pq9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        er9 er9Var = this.b;
        switch (b) {
            case 0:
                er9Var.K0 = null;
                return;
            default:
                er9Var.dismiss();
                return;
        }
    }
}
