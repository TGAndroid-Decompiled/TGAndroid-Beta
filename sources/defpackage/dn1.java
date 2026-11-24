package defpackage;

import android.content.DialogInterface;
public final class dn1 implements DialogInterface.OnShowListener {
    public final byte a;
    public final yv1 b;

    public dn1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.pc(false);
                return;
            default:
                yv1Var.pc(false);
                return;
        }
    }
}
