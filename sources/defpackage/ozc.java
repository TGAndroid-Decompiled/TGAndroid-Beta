package defpackage;

import android.view.WindowInsets;
public class ozc extends nzc {
    public iq5 n;

    public ozc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
        this.n = null;
    }

    @Override
    public wzc b() {
        return wzc.h(null, this.c.consumeStableInsets());
    }

    @Override
    public wzc c() {
        return wzc.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override
    public final iq5 i() {
        iq5 iq5Var = this.n;
        if (iq5Var == null) {
            WindowInsets windowInsets = this.c;
            iq5 b = iq5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.n = b;
            return b;
        }
        return iq5Var;
    }

    @Override
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override
    public void s(iq5 iq5Var) {
        this.n = iq5Var;
    }
}
