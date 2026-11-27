package defpackage;

import android.content.Context;
public final class oi7 extends c51 {
    public final byte m0;
    public final ny0 n0;

    public oi7(ny0 ny0Var, Context context, vnb vnbVar, byte b) {
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
                qi7 qi7Var = (qi7) ny0Var;
                if (qi7Var.i2 != 0.0f) {
                    z = false;
                }
                qi7Var.i2 = f;
                if (z) {
                    qi7Var.j2 = new tg2(qi7Var, (byte) 2);
                    qi7Var.a1(false);
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
