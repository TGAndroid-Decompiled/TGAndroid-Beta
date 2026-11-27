package defpackage;

import android.content.Context;
public final class zt8 extends wua {
    public final byte y3;
    public final au8 z3;

    public zt8(au8 au8Var, Context context, int i, long j, vnb vnbVar, byte b) {
        super(context, i, j, vnbVar, null);
        this.y3 = b;
        this.z3 = au8Var;
    }

    @Override
    public final d31 j() {
        byte b = this.y3;
        au8 au8Var = this.z3;
        switch (b) {
            case 0:
                return d31.b0(au8Var.a.a);
            case 1:
                return d31.b0(au8Var.a.a);
            default:
                return d31.b0(au8Var.a.a);
        }
    }
}
