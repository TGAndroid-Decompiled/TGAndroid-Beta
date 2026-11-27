package defpackage;

import android.content.Context;
import android.view.View;
public final class r62 extends y46 {
    public final q22 r;

    public r62(q22 q22Var, Context context) {
        super(context);
        this.r = q22Var;
    }

    @Override
    public final int k(int i, View view) {
        int i2;
        a72 a72Var = (a72) this.r.V;
        if (a72Var.W0) {
            i = -1;
        }
        int k = super.k(i, view);
        if (a72Var.W0) {
            k += hl.L(160.0f);
        }
        if (!a72Var.W0) {
            k = uh9.f(7.0f, a72Var.S0 - hl.m, k);
        }
        if (a72Var.W0 && k == 0 && (i2 = a72Var.X0) >= 0) {
            a72Var.j0(i2);
            a72Var.X0 = -1;
        }
        a72Var.W0 = false;
        return k;
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
