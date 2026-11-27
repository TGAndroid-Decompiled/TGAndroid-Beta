package defpackage;

import android.content.DialogInterface;
public final class gy5 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final int b;
    public final xma c;
    public final Object d;

    public gy5(xma xmaVar, Object obj, int i, byte b) {
        this.a = b;
        this.c = xmaVar;
        this.d = obj;
        this.b = i;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        xma xmaVar = this.c;
        switch (b) {
            case 0:
                wy5 wy5Var = (wy5) xmaVar;
                if (wy5Var.K1 == ((ly5) obj)) {
                    wy5Var.K1 = null;
                }
                wy5Var.q0(false);
                wy5Var.E0(i);
                return;
            default:
                dx7 dx7Var = (dx7) xmaVar;
                dx7Var.Y1 = null;
                if (((boolean[]) obj)[0]) {
                    dx7Var.y0(false);
                }
                dx7Var.Q0(i);
                return;
        }
    }
}
