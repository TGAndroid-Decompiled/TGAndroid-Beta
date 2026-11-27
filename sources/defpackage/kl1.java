package defpackage;

import android.content.DialogInterface;
public final class kl1 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final zu1 b;

    public kl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                hr1 hr1Var = zu1Var.m2;
                if (hr1Var != null) {
                    hr1Var.c(false);
                    return;
                }
                return;
            case 1:
                zu1Var.E9();
                return;
            case 2:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 3:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 4:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 5:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 6:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 7:
                zu1Var.vc = null;
                return;
            default:
                zu1Var.y6(false, true, 0.0f);
                return;
        }
    }
}
