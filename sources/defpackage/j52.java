package defpackage;

import android.content.Context;
import android.view.View;
public final class j52 extends v46 {
    public final l32 r;

    public j52(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override
    public final int k(int i, View view) {
        int k = super.k(i, view);
        n52 n52Var = (n52) this.r.V;
        return k - (n52Var.M.getPaddingTop() - (n52Var.r0 - n52Var.q0));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 2;
    }
}
