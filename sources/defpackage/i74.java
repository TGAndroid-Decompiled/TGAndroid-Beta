package defpackage;

import android.content.Context;
public final class i74 extends l9c {
    public final byte Q;

    public i74(d79 d79Var, Context context, int i, int i2, boolean z, icc iccVar, vnb vnbVar, byte b) {
        super(d79Var, context, i, i2, z, iccVar, vnbVar);
        this.Q = b;
    }

    @Override
    public final boolean D(f89 f89Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(f89Var);
        }
    }

    @Override
    public final int I(int i) {
        switch (this.Q) {
            case 1:
                if (i == aob.i5) {
                    return -15921907;
                }
                return aob.v0(i, this.x);
            default:
                return super.I(i);
        }
    }
}
