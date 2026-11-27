package defpackage;

import java.util.List;
public final class hn4 implements e84 {
    public final ey7 a = new ey7(4);
    public final ey7 b = new ey7(9);
    public final ey7 c = new ey7(11);
    public final ey7 d = new ey7();
    public final nu9 e;
    public g84 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public a40 o;
    public hgc p;

    public hn4() {
        ?? e23Var = new e23(new po3());
        e23Var.b = -9223372036854775807L;
        e23Var.c = new long[0];
        e23Var.d = new long[0];
        this.e = e23Var;
        this.g = (byte) 1;
    }

    @Override
    public final int b(defpackage.f84 r34, defpackage.v11 r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn4.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        ey7 ey7Var = this.a;
        cb3 cb3Var = (cb3) f84Var;
        cb3Var.d(ey7Var.a, 0, 3, false);
        ey7Var.N(0);
        if (ey7Var.D() == 4607062) {
            cb3Var.d(ey7Var.a, 0, 2, false);
            ey7Var.N(0);
            if ((ey7Var.H() & 250) == 0) {
                cb3Var.d(ey7Var.a, 0, 4, false);
                ey7Var.N(0);
                int m = ey7Var.m();
                cb3Var.f = 0;
                cb3Var.a(m, false);
                cb3Var.d(ey7Var.a, 0, 4, false);
                ey7Var.N(0);
                if (ey7Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.f = g84Var;
    }

    public final ey7 g(cb3 cb3Var) {
        int i = this.l;
        ey7 ey7Var = this.d;
        byte[] bArr = ey7Var.a;
        if (i > bArr.length) {
            ey7Var.L(0, new byte[Math.max(bArr.length << 1, i)]);
        } else {
            ey7Var.N(0);
        }
        ey7Var.M(this.l);
        cb3Var.c(ey7Var.a, 0, this.l, false);
        return ey7Var;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
