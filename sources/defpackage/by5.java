package defpackage;

import android.content.DialogInterface;
public final class by5 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final int b;
    public final fla c;
    public final Object d;

    public by5(fla flaVar, Object obj, int i, byte b) {
        this.a = b;
        this.c = flaVar;
        this.d = obj;
        this.b = i;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        fla flaVar = this.c;
        switch (b) {
            case 0:
                ry5 ry5Var = (ry5) flaVar;
                if (ry5Var.Q1 == ((gy5) obj)) {
                    ry5Var.Q1 = null;
                }
                ry5Var.q0(false);
                ry5Var.E0(i);
                return;
            default:
                xv7 xv7Var = (xv7) flaVar;
                xv7Var.e2 = null;
                if (((boolean[]) obj)[0]) {
                    xv7Var.y0(false);
                }
                xv7Var.R0(i);
                return;
        }
    }
}
