package defpackage;

import android.view.View;
import android.view.WindowInsets;
public class rzc extends qzc {
    public static final wzc r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = wzc.h(null, windowInsets);
    }

    public rzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
    }

    @Override
    public iq5 f(int i) {
        return iq5.c(this.c.getInsets(uzc.a(i)));
    }

    @Override
    public iq5 g(int i) {
        return iq5.c(this.c.getInsetsIgnoringVisibility(uzc.a(i)));
    }

    @Override
    public boolean p(int i) {
        return this.c.isVisible(uzc.a(i));
    }

    @Override
    public final void d(View view) {
    }
}
