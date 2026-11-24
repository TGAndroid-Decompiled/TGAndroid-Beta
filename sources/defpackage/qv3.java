package defpackage;

import android.content.Context;
public final class qv3 extends cy3 {
    public final tv3 g0;

    public qv3(tv3 tv3Var, Context context, wjb wjbVar) {
        super(context, wjbVar, false, false, false, true, 0, null, bkb.v0(bkb.u6, wjbVar), false);
        this.g0 = tv3Var;
    }

    @Override
    public final boolean h(int i) {
        int i2;
        int paddingTop;
        wv3 wv3Var;
        tv3 tv3Var = this.g0;
        jv3 jv3Var = tv3Var.b;
        sv3 sv3Var = tv3Var.c;
        xv3 xv3Var = tv3Var.f;
        int i3 = 0;
        if (this.d) {
            return false;
        }
        if (xv3Var != null && (wv3Var = xv3Var.h) != null) {
            if (wv3Var.getSelectedCategory() != null) {
                int i4 = jv3.q3;
                jv3Var.z1(0, 0);
                xv3Var.h.I1(null);
            }
            xv3Var.h.G1();
            xv3Var.b();
        }
        if (sv3Var != null) {
            sv3Var.D(null);
        }
        while (true) {
            if (i3 < sv3Var.E.size()) {
                i2 = sv3Var.E.keyAt(i3);
                if (sv3Var.E.valueAt(i3) == i) {
                    break;
                }
                i3++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            float f = tv3Var.n;
            if (f >= 0.0f) {
                paddingTop = jv3Var.getPaddingTop();
            } else {
                f = tv3Var.b();
                tv3Var.n = f;
                paddingTop = jv3Var.getPaddingTop();
            }
            int L = ((int) (f + paddingTop)) - gl.L(102.0f);
            int i5 = jv3.q3;
            jv3Var.z1(i2, L);
        }
        return true;
    }
}
