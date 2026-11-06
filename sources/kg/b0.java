package kg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.k5;
public final class b0 extends v4.c0 {
    public final c0 f17312r;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f17312r = c0Var;
    }

    @Override
    public final int k(int i7, View view) {
        return k5.B(8.0f, ((g0) this.f17312r.V).f17383s.getPaddingTop() - org.telegram.messenger.g0.f22538m, super.k(i7, view));
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 2;
    }
}
