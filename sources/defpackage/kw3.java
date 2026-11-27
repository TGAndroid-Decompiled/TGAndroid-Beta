package defpackage;

import android.content.Context;
public final class kw3 extends xy3 {
    public final ow3 g0;

    public kw3(ow3 ow3Var, Context context, vnb vnbVar) {
        super(context, vnbVar, false, false, false, true, 0, null, aob.v0(aob.v6, vnbVar), false);
        this.g0 = ow3Var;
    }

    @Override
    public final boolean h(int i) {
        int i2;
        int paddingTop;
        rw3 rw3Var;
        ow3 ow3Var = this.g0;
        dw3 dw3Var = ow3Var.b;
        nw3 nw3Var = ow3Var.c;
        sw3 sw3Var = ow3Var.f;
        int i3 = 0;
        if (this.d) {
            return false;
        }
        if (sw3Var != null && (rw3Var = sw3Var.h) != null) {
            if (rw3Var.getSelectedCategory() != null) {
                int i4 = dw3.q3;
                dw3Var.A1(0, 0);
                sw3Var.h.J1(null);
            }
            sw3Var.h.H1();
            sw3Var.b();
        }
        if (nw3Var != null) {
            nw3Var.D(null);
        }
        while (true) {
            if (i3 < nw3Var.E.size()) {
                i2 = nw3Var.E.keyAt(i3);
                if (nw3Var.E.valueAt(i3) == i) {
                    break;
                }
                i3++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            float f = ow3Var.n;
            if (f >= 0.0f) {
                paddingTop = dw3Var.getPaddingTop();
            } else {
                f = ow3Var.b();
                ow3Var.n = f;
                paddingTop = dw3Var.getPaddingTop();
            }
            int L = ((int) (f + paddingTop)) - hl.L(102.0f);
            int i5 = dw3.q3;
            dw3Var.A1(i2, L);
        }
        return true;
    }
}
