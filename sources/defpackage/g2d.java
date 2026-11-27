package defpackage;

import android.view.View;
import android.view.WindowInsets;
public class g2d extends f2d {
    public static final l2d r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = l2d.h(null, windowInsets);
    }

    public g2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
    }

    @Override
    public mq5 f(int i) {
        return mq5.c(this.c.getInsets(j2d.a(i)));
    }

    @Override
    public mq5 g(int i) {
        return mq5.c(this.c.getInsetsIgnoringVisibility(j2d.a(i)));
    }

    @Override
    public boolean p(int i) {
        return this.c.isVisible(j2d.a(i));
    }

    @Override
    public final void d(View view) {
    }
}
