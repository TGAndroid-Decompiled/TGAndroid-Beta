package defpackage;

import android.view.WindowInsets;
public final class rxc extends qxc {
    public static final vxc s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = vxc.h(null, windowInsets);
    }

    public rxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
    }

    @Override
    public io5 f(int i) {
        return io5.c(this.c.getInsets(uxc.a(i)));
    }

    @Override
    public io5 g(int i) {
        return io5.c(this.c.getInsetsIgnoringVisibility(uxc.a(i)));
    }

    @Override
    public boolean p(int i) {
        return this.c.isVisible(uxc.a(i));
    }
}
