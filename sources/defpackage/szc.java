package defpackage;

import android.view.WindowInsets;
public final class szc extends rzc {
    public static final wzc s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = wzc.h(null, windowInsets);
    }

    public szc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
    }

    @Override
    public iq5 f(int i) {
        return iq5.c(this.c.getInsets(vzc.a(i)));
    }

    @Override
    public iq5 g(int i) {
        return iq5.c(this.c.getInsetsIgnoringVisibility(vzc.a(i)));
    }

    @Override
    public boolean p(int i) {
        return this.c.isVisible(vzc.a(i));
    }
}
