package defpackage;

import android.os.Build;
public final class yz9 implements py4, oy4 {
    public final zz9 a;

    public yz9(zz9 zz9Var) {
        this.a = zz9Var;
    }

    @Override
    public final int i() {
        return cmb.v0(cmb.c6, this.a.J0);
    }

    @Override
    public final void s(int i) {
        zz9 zz9Var = this.a;
        mr3 mr3Var = zz9Var.g2;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            if (iqd.a(i, 4)) {
                mr3Var.h(zz9Var.X0.e());
            }
            mr3Var.e(zz9Var.i2, zz9Var.b.getWidth(), zz9Var.b.getHeight());
        }
    }
}
