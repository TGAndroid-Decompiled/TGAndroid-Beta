package defpackage;

import android.content.Context;
import android.view.View;
public final class b72 extends y46 {
    public final q22 r;

    public b72(q22 q22Var, Context context) {
        super(context);
        this.r = q22Var;
    }

    @Override
    public final int k(int i, View view) {
        return uh9.f(8.0f, ((f72) this.r.V).s.getPaddingTop() - hl.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
