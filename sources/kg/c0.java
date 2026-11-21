package kg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.f3;
public final class c0 extends v4.d0 {
    public final d0 f18300r;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f18300r = d0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return f3.B(8.0f, ((h0) this.f18300r.V).f18362s.getPaddingTop() - org.telegram.messenger.g0.f24140m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
