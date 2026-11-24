package defpackage;

import android.content.Context;
public final class o64 extends l5c {
    public final byte Q;

    public o64(o39 o39Var, Context context, int i, int i2, boolean z, i8c i8cVar, wjb wjbVar, byte b) {
        super(o39Var, context, i, i2, z, i8cVar, wjbVar);
        this.Q = b;
    }

    @Override
    public final boolean D(s49 s49Var) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.D(s49Var);
        }
    }

    @Override
    public final int I(int i) {
        switch (this.Q) {
            case 1:
                if (i == bkb.h5) {
                    return -15921907;
                }
                return bkb.v0(i, this.x);
            default:
                return super.I(i);
        }
    }
}
