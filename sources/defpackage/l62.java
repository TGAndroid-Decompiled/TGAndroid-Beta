package defpackage;

import android.content.Context;
import android.view.View;
public final class l62 extends u26 {
    public final z12 r;

    public l62(z12 z12Var, Context context) {
        super(context);
        this.r = z12Var;
    }

    @Override
    public final int k(int i, View view) {
        return de9.f(8.0f, ((p62) this.r.V).s.getPaddingTop() - gl.m, super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
