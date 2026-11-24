package defpackage;

import android.content.Context;
public final class x74 extends l7c {
    public final byte Q;

    public x74(r59 r59Var, Context context, int i, int i2, boolean z, jac jacVar, ylb ylbVar, byte b) {
        super(r59Var, context, i, i2, z, jacVar, ylbVar);
        this.Q = b;
    }

    @Override
    public final boolean D(u69 u69Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(u69Var);
        }
    }

    @Override
    public final int I(int i) {
        switch (this.Q) {
            case 1:
                if (i == cmb.h5) {
                    return -15921907;
                }
                return cmb.v0(i, this.x);
            default:
                return super.I(i);
        }
    }
}
