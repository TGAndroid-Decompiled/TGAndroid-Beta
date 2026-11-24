package defpackage;

import android.content.Context;
public final class hi7 extends b61 {
    public final byte m0;
    public final mz0 n0;

    public hi7(mz0 mz0Var, Context context, ylb ylbVar, byte b) {
        super(ylbVar, context, true);
        this.m0 = b;
        this.n0 = mz0Var;
    }

    @Override
    public final float b(float f, float f2) {
        byte b = this.m0;
        boolean z = true;
        mz0 mz0Var = this.n0;
        switch (b) {
            case 0:
                ji7 ji7Var = (ji7) mz0Var;
                if (ji7Var.i2 != 0.0f) {
                    z = false;
                }
                ji7Var.i2 = f;
                if (z) {
                    ji7Var.j2 = new ph2(ji7Var, (byte) 2);
                    ji7Var.Z0(false);
                }
                return f;
            default:
                t9c t9cVar = (t9c) mz0Var;
                if (t9cVar.n2 != 0.0f) {
                    z = false;
                }
                t9cVar.n2 = f;
                if (z) {
                    t9cVar.o2 = new ph2(t9cVar, (byte) 4);
                    t9cVar.e1(false);
                }
                return f;
        }
    }
}
