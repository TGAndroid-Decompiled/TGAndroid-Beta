package defpackage;

import android.content.Context;
import android.view.View;
public final class m72 extends v46 {
    public final l32 r;

    public m72(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override
    public final int k(int i, View view) {
        int i2;
        v72 v72Var = (v72) this.r.V;
        if (v72Var.W0) {
            i = -1;
        }
        int k = super.k(i, view);
        if (v72Var.W0) {
            k += gm.L(160.0f);
        }
        if (!v72Var.W0) {
            k = hg9.f(7.0f, v72Var.S0 - gm.m, k);
        }
        if (v72Var.W0 && k == 0 && (i2 = v72Var.X0) >= 0) {
            v72Var.k0(i2);
            v72Var.X0 = -1;
        }
        v72Var.W0 = false;
        return k;
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
