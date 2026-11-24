package defpackage;

import android.view.WindowInsets;
public class qzc extends pzc {
    public iq5 o;
    public iq5 p;
    public iq5 q;

    public qzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override
    public iq5 h() {
        iq5 iq5Var = this.p;
        if (iq5Var == null) {
            iq5 c = iq5.c(this.c.getMandatorySystemGestureInsets());
            this.p = c;
            return c;
        }
        return iq5Var;
    }

    @Override
    public iq5 j() {
        iq5 iq5Var = this.o;
        if (iq5Var == null) {
            iq5 c = iq5.c(this.c.getSystemGestureInsets());
            this.o = c;
            return c;
        }
        return iq5Var;
    }

    @Override
    public iq5 l() {
        iq5 iq5Var = this.q;
        if (iq5Var == null) {
            iq5 c = iq5.c(this.c.getTappableElementInsets());
            this.q = c;
            return c;
        }
        return iq5Var;
    }

    @Override
    public wzc m(int i, int i2, int i3, int i4) {
        return wzc.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override
    public void s(iq5 iq5Var) {
    }
}
