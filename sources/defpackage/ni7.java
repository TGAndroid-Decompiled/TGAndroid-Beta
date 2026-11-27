package defpackage;

import android.content.Context;
public final class ni7 extends c51 {
    public final byte m0;
    public final ny0 n0;

    public ni7(ny0 ny0Var, Context context, vnb vnbVar, byte b) {
        super(vnbVar, context, true);
        this.m0 = b;
        this.n0 = ny0Var;
    }

    @Override
    public final float b(float f, float f2) {
        byte b = this.m0;
        boolean z = true;
        ny0 ny0Var = this.n0;
        switch (b) {
            case 0:
                pi7 pi7Var = (pi7) ny0Var;
                if (pi7Var.i2 != 0.0f) {
                    z = false;
                }
                pi7Var.i2 = f;
                if (z) {
                    pi7Var.j2 = new tg2(pi7Var, (byte) 2);
                    pi7Var.a1(false);
                }
                return f;
            default:
                sbc sbcVar = (sbc) ny0Var;
                if (sbcVar.n2 != 0.0f) {
                    z = false;
                }
                sbcVar.n2 = f;
                if (z) {
                    sbcVar.o2 = new tg2(sbcVar, (byte) 4);
                    sbcVar.f1(false);
                }
                return f;
        }
    }
}
