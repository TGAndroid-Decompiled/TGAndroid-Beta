package defpackage;

import android.content.Context;
import android.view.View;
public final class s22 extends u26 {
    public final z12 r;

    public s22(z12 z12Var, Context context) {
        super(context);
        this.r = z12Var;
    }

    @Override
    public final int k(int i, View view) {
        return de9.f(56.0f, ((d32) this.r.V).r.getPaddingTop() - gl.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
