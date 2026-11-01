package ag;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.m5;
public final class c1 extends s4.b0 {
    public final d1 f478r;

    public c1(d1 d1Var, Context context) {
        super(context);
        this.f478r = d1Var;
    }

    @Override
    public final int k(int i10, View view) {
        return m5.B(8.0f, ((h1) this.f478r.V).f542s.getPaddingTop() - org.telegram.messenger.i0.f16166m, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
