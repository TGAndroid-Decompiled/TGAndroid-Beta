package defpackage;

import android.content.Context;
public final class eg7 extends u41 {
    public final byte m0;
    public final fy0 n0;

    public eg7(fy0 fy0Var, Context context, wjb wjbVar, byte b) {
        super(wjbVar, context, true);
        this.m0 = b;
        this.n0 = fy0Var;
    }

    @Override
    public final float b(float f, float f2) {
        byte b = this.m0;
        boolean z = true;
        fy0 fy0Var = this.n0;
        switch (b) {
            case 0:
                gg7 gg7Var = (gg7) fy0Var;
                if (gg7Var.i2 != 0.0f) {
                    z = false;
                }
                gg7Var.i2 = f;
                if (z) {
                    gg7Var.j2 = new bg2(gg7Var, (byte) 2);
                    gg7Var.Z0(false);
                }
                return f;
            default:
                s7c s7cVar = (s7c) fy0Var;
                if (s7cVar.n2 != 0.0f) {
                    z = false;
                }
                s7cVar.n2 = f;
                if (z) {
                    s7cVar.o2 = new bg2(s7cVar, (byte) 4);
                    s7cVar.e1(false);
                }
                return f;
        }
    }
}
