package defpackage;

import android.content.DialogInterface;
public final class og6 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final tg6 b;

    public og6(tg6 tg6Var, byte b) {
        this.a = b;
        this.b = tg6Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        tg6 tg6Var = this.b;
        switch (b) {
            case 0:
                tg6Var.v0.finishFragment();
                return;
            default:
                tg6Var.v0.finishFragment();
                return;
        }
    }
}
