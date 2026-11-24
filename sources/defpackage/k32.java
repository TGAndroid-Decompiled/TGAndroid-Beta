package defpackage;

import android.content.Context;
import android.view.View;
public final class k32 extends v46 {
    public final l32 r;

    public k32(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override
    public final int k(int i, View view) {
        return hg9.f(8.0f, ((w32) this.r.V).s.getPaddingTop() - gm.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
