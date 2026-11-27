package defpackage;

import android.content.Context;
public final class w61 extends z51 {
    public final x61 f0;

    public w61(x61 x61Var, Context context) {
        super(context, 11, z51.a0, 0, z51.b0);
        this.f0 = x61Var;
    }

    @Override
    public final void c(int i, boolean z) {
        z61 z61Var = (z61) this.f0.f;
        if (!z) {
            z61Var.b.n1();
            return;
        }
        int i2 = -1;
        if (i == 8) {
            i = -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 < z61Var.g0.size()) {
                v61 v61Var = (v61) z61Var.g0.get(i3);
                if (v61Var != null && v61Var.a == 11 && v61Var.f == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i2 >= 0) {
            z61Var.b.g1(new yd(i2, (byte) 2), 0, true);
        } else {
            z61Var.b.n1();
        }
    }
}
