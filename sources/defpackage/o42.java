package defpackage;

import android.content.Context;
import android.view.View;
public final class o42 extends y46 {
    public final q22 r;

    public o42(q22 q22Var, Context context) {
        super(context);
        this.r = q22Var;
    }

    @Override
    public final int k(int i, View view) {
        int k = super.k(i, view);
        s42 s42Var = (s42) this.r.V;
        return k - (s42Var.M.getPaddingTop() - (s42Var.r0 - s42Var.q0));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 2;
    }
}
