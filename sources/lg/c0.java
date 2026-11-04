package lg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.k5;
public final class c0 extends u4.c0 {
    public final d0 f18260r;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f18260r = d0Var;
    }

    @Override
    public final int k(int i3, View view) {
        return k5.B(8.0f, ((h0) this.f18260r.V).f18322s.getPaddingTop() - org.telegram.messenger.g0.f22602m, super.k(i3, view));
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 2;
    }
}
