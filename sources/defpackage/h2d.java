package defpackage;

import android.view.WindowInsets;
public final class h2d extends g2d {
    public static final l2d s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = l2d.h(null, windowInsets);
    }

    public h2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
    }

    @Override
    public mq5 f(int i) {
        return mq5.c(this.c.getInsets(k2d.a(i)));
    }

    @Override
    public mq5 g(int i) {
        return mq5.c(this.c.getInsetsIgnoringVisibility(k2d.a(i)));
    }

    @Override
    public boolean p(int i) {
        return this.c.isVisible(k2d.a(i));
    }
}
