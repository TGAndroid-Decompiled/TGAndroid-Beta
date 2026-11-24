package defpackage;

import android.view.View;
import android.view.WindowInsets;
public class qxc extends pxc {
    public static final vxc r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = vxc.h(null, windowInsets);
    }

    public qxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
    }

    @Override
    public io5 f(int i) {
        return io5.c(this.c.getInsets(txc.a(i)));
    }

    @Override
    public io5 g(int i) {
        return io5.c(this.c.getInsetsIgnoringVisibility(txc.a(i)));
    }

    @Override
    public boolean p(int i) {
        return this.c.isVisible(txc.a(i));
    }

    @Override
    public final void d(View view) {
    }
}
