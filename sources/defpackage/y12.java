package defpackage;

import android.content.Context;
import android.view.View;
public final class y12 extends u26 {
    public final z12 r;

    public y12(z12 z12Var, Context context) {
        super(context);
        this.r = z12Var;
    }

    @Override
    public final int k(int i, View view) {
        return de9.f(8.0f, ((k22) this.r.V).s.getPaddingTop() - gl.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
