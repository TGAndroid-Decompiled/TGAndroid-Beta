package defpackage;

import android.content.Context;
import android.view.View;
public final class y32 extends u26 {
    public final z12 r;

    public y32(z12 z12Var, Context context) {
        super(context);
        this.r = z12Var;
    }

    @Override
    public final int k(int i, View view) {
        int k = super.k(i, view);
        c42 c42Var = (c42) this.r.V;
        return k - (c42Var.M.getPaddingTop() - (c42Var.r0 - c42Var.q0));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 2;
    }
}
