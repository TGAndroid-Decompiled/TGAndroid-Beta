package defpackage;

import android.view.WindowInsets;
public class f2d extends e2d {
    public mq5 o;
    public mq5 p;
    public mq5 q;

    public f2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override
    public mq5 h() {
        mq5 mq5Var = this.p;
        if (mq5Var == null) {
            mq5 c = mq5.c(this.c.getMandatorySystemGestureInsets());
            this.p = c;
            return c;
        }
        return mq5Var;
    }

    @Override
    public mq5 j() {
        mq5 mq5Var = this.o;
        if (mq5Var == null) {
            mq5 c = mq5.c(this.c.getSystemGestureInsets());
            this.o = c;
            return c;
        }
        return mq5Var;
    }

    @Override
    public mq5 l() {
        mq5 mq5Var = this.q;
        if (mq5Var == null) {
            mq5 c = mq5.c(this.c.getTappableElementInsets());
            this.q = c;
            return c;
        }
        return mq5Var;
    }

    @Override
    public l2d m(int i, int i2, int i3, int i4) {
        return l2d.h(null, this.c.inset(i, i2, i3, i4));
    }

    @Override
    public void s(mq5 mq5Var) {
    }
}
