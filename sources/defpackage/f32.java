package defpackage;

import android.content.Context;
import android.view.View;
public final class f32 extends v46 {
    public final as0 r;

    public f32(as0 as0Var, Context context) {
        super(context);
        this.r = as0Var;
    }

    @Override
    public final int k(int i, View view) {
        return hg9.f(7.0f, ((h32) this.r.R).n.getPaddingTop(), super.k(i, view));
    }

    @Override
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
