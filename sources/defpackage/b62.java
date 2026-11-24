package defpackage;

import android.content.Context;
import android.view.View;
public final class b62 extends u26 {
    public final z12 r;

    public b62(z12 z12Var, Context context) {
        super(context);
        this.r = z12Var;
    }

    @Override
    public final int k(int i, View view) {
        int i2;
        k62 k62Var = (k62) this.r.V;
        if (k62Var.W0) {
            i = -1;
        }
        int k = super.k(i, view);
        if (k62Var.W0) {
            k += gl.L(160.0f);
        }
        if (!k62Var.W0) {
            k = de9.f(7.0f, k62Var.S0 - gl.m, k);
        }
        if (k62Var.W0 && k == 0 && (i2 = k62Var.X0) >= 0) {
            k62Var.k0(i2);
            k62Var.X0 = -1;
        }
        k62Var.W0 = false;
        return k;
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
