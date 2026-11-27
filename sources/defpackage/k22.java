package defpackage;

import android.content.Context;
import android.view.View;
public final class k22 extends y46 {
    public final ar0 r;

    public k22(ar0 ar0Var, Context context) {
        super(context);
        this.r = ar0Var;
    }

    @Override
    public final int k(int i, View view) {
        return uh9.f(7.0f, ((m22) this.r.R).n.getPaddingTop(), super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
