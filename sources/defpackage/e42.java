package defpackage;

import android.content.Context;
import android.view.View;
public final class e42 extends v46 {
    public final l32 r;

    public e42(l32 l32Var, Context context) {
        super(context);
        this.r = l32Var;
    }

    @Override
    public final int k(int i, View view) {
        return hg9.f(56.0f, ((p42) this.r.V).r.getPaddingTop() - gm.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
