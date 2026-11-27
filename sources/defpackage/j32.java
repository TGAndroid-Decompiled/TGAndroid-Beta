package defpackage;

import android.content.Context;
import android.view.View;
public final class j32 extends y46 {
    public final q22 r;

    public j32(q22 q22Var, Context context) {
        super(context);
        this.r = q22Var;
    }

    @Override
    public final int k(int i, View view) {
        return uh9.f(56.0f, ((u32) this.r.V).r.getPaddingTop() - hl.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
