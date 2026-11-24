package defpackage;

import android.os.Build;
public final class xx9 implements nw4, mw4 {
    public final yx9 a;

    public xx9(yx9 yx9Var) {
        this.a = yx9Var;
    }

    @Override
    public final int i() {
        return bkb.v0(bkb.c6, this.a.J0);
    }

    @Override
    public final void j(int i) {
        yx9 yx9Var = this.a;
        cq3 cq3Var = yx9Var.g2;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            if (fod.a(i, 4)) {
                cq3Var.h(yx9Var.X0.e());
            }
            cq3Var.e(yx9Var.i2, yx9Var.b.getWidth(), yx9Var.b.getHeight());
        }
    }
}
