package defpackage;

import android.view.WindowInsets;
public class d2d extends c2d {
    public mq5 n;

    public d2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
        this.n = null;
    }

    @Override
    public l2d b() {
        return l2d.h(null, this.c.consumeStableInsets());
    }

    @Override
    public l2d c() {
        return l2d.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override
    public final mq5 i() {
        mq5 mq5Var = this.n;
        if (mq5Var == null) {
            WindowInsets windowInsets = this.c;
            mq5 b = mq5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.n = b;
            return b;
        }
        return mq5Var;
    }

    @Override
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override
    public void s(mq5 mq5Var) {
        this.n = mq5Var;
    }
}
