package defpackage;

import android.view.View;
import android.view.WindowInsets;
public final class my2 implements sq4, nr7 {
    public final ry2 a;

    public my2(ry2 ry2Var) {
        this.a = ry2Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        boolean z;
        WindowInsets g = l2dVar.g();
        ry2 ry2Var = this.a;
        ry2Var.q0(g);
        fm0 fm0Var = ry2Var.T1;
        if (l2dVar.a.f(8).d > 0) {
            z = true;
        } else {
            z = false;
        }
        fm0Var.a(z, true);
        return l2d.b;
    }

    @Override
    public final void a(int i) {
        int min = Math.min(i, hl.L(144.0f));
        if (i > 0) {
            min -= hl.L(8.0f);
        }
        ry2 ry2Var = this.a;
        if (ry2Var.g2 != min) {
            ry2Var.g2 = min;
            ry2Var.S1.a(min);
            ry2Var.c2.postOnAnimation(new vd2(ry2Var, (byte) 18));
        }
    }
}
