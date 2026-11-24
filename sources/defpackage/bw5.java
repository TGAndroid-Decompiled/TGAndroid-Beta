package defpackage;

import android.content.DialogInterface;
public final class bw5 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final int b;
    public final dja c;
    public final Object d;

    public bw5(dja djaVar, Object obj, int i, byte b) {
        this.a = b;
        this.c = djaVar;
        this.d = obj;
        this.b = i;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.d;
        dja djaVar = this.c;
        switch (b) {
            case 0:
                rw5 rw5Var = (rw5) djaVar;
                if (rw5Var.Q1 == ((gw5) obj)) {
                    rw5Var.Q1 = null;
                }
                rw5Var.q0(false);
                rw5Var.E0(i);
                return;
            default:
                wt7 wt7Var = (wt7) djaVar;
                wt7Var.e2 = null;
                if (((boolean[]) obj)[0]) {
                    wt7Var.y0(false);
                }
                wt7Var.R0(i);
                return;
        }
    }
}
