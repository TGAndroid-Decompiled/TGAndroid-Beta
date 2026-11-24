package defpackage;

import android.view.WindowInsets;
public class pxc extends oxc {
    public io5 o;
    public io5 p;
    public io5 q;

    public pxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override
    public io5 h() {
        io5 io5Var = this.p;
        if (io5Var == null) {
            io5 c = io5.c(this.c.getMandatorySystemGestureInsets());
            this.p = c;
            return c;
        }
        return io5Var;
    }

    @Override
    public io5 j() {
        io5 io5Var = this.o;
        if (io5Var == null) {
            io5 c = io5.c(this.c.getSystemGestureInsets());
            this.o = c;
            return c;
        }
        return io5Var;
    }

    @Override
    public io5 l() {
        io5 io5Var = this.q;
        if (io5Var == null) {
            io5 c = io5.c(this.c.getTappableElementInsets());
            this.q = c;
            return c;
        }
        return io5Var;
    }

    @Override
    public vxc m(int i, int i2, int i3, int i4) {
        return vxc.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override
    public void s(io5 io5Var) {
    }
}
