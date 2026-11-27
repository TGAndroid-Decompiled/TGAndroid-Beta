package defpackage;

import java.util.List;
public final class ek4 implements e84 {
    public g84 f;
    public x1c g;
    public vf7 i;
    public gk4 j;
    public int k;
    public int l;
    public dk4 m;
    public int n;
    public long o;
    public final byte[] a = new byte[42];
    public final ey7 b = new ey7(0, new byte[32768]);
    public final boolean c = false;
    public final boolean d = false;
    public final v11 e = new Object();
    public byte h = 0;

    @Override
    public final int b(defpackage.f84 r32, defpackage.v11 r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        cb3 cb3Var = (cb3) f84Var;
        lle.a(cb3Var, false, false);
        ey7 ey7Var = new ey7(4);
        cb3Var.d(ey7Var.a, 0, 4, false);
        if (ey7Var.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void d(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.h = (byte) 0;
        } else {
            dk4 dk4Var = this.m;
            if (dk4Var != null) {
                dk4Var.d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.o = j3;
        this.n = 0;
        this.b.K(0);
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.f = g84Var;
        this.g = g84Var.e0(0, 1);
        g84Var.D();
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
