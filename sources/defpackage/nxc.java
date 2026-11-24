package defpackage;

import android.view.WindowInsets;
public class nxc extends mxc {
    public io5 n;

    public nxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
        this.n = null;
    }

    @Override
    public vxc b() {
        return vxc.h(null, this.c.consumeStableInsets());
    }

    @Override
    public vxc c() {
        return vxc.h(null, this.c.consumeSystemWindowInsets());
    }

    @Override
    public final io5 i() {
        io5 io5Var = this.n;
        if (io5Var == null) {
            WindowInsets windowInsets = this.c;
            io5 b = io5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.n = b;
            return b;
        }
        return io5Var;
    }

    @Override
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override
    public void s(io5 io5Var) {
        this.n = io5Var;
    }
}
