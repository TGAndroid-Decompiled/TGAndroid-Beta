package defpackage;

import android.content.DialogInterface;
public final class cl1 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final mu1 b;

    public cl1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                uq1 uq1Var = mu1Var.m2;
                if (uq1Var != null) {
                    uq1Var.c(false);
                    return;
                }
                return;
            case 1:
                mu1Var.t9();
                return;
            case 2:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 3:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 4:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 5:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 6:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 7:
                mu1Var.r6(false, true, 0.0f);
                return;
            default:
                mu1Var.kc = null;
                return;
        }
    }
}
