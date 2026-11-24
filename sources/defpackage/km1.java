package defpackage;

import android.content.DialogInterface;
public final class km1 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final yv1 b;

    public km1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                gs1 gs1Var = yv1Var.m2;
                if (gs1Var != null) {
                    gs1Var.c(false);
                    return;
                }
                return;
            case 1:
                yv1Var.D9();
                return;
            case 2:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 3:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 4:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 5:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 6:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 7:
                yv1Var.y6(false, true, 0.0f);
                return;
            default:
                yv1Var.uc = null;
                return;
        }
    }
}
