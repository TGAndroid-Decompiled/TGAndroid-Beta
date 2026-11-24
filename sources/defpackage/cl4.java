package defpackage;

import java.util.List;
public final class cl4 implements j74 {
    public final xu7 a = new xu7(4);
    public final xu7 b = new xu7(9);
    public final xu7 c = new xu7(11);
    public final xu7 d = new xu7();
    public final uq9 e;
    public l74 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public z30 o;
    public jcc p;

    public cl4() {
        ?? l13Var = new l13(new yn3());
        l13Var.b = -9223372036854775807L;
        l13Var.c = new long[0];
        l13Var.d = new long[0];
        this.e = l13Var;
        this.g = (byte) 1;
    }

    @Override
    public final int b(defpackage.k74 r34, defpackage.m11 r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl4.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        xu7 xu7Var = this.a;
        ja3 ja3Var = (ja3) k74Var;
        ja3Var.d(xu7Var.a, 0, 3, false);
        xu7Var.N(0);
        if (xu7Var.D() == 4607062) {
            ja3Var.d(xu7Var.a, 0, 2, false);
            xu7Var.N(0);
            if ((xu7Var.H() & 250) == 0) {
                ja3Var.d(xu7Var.a, 0, 4, false);
                xu7Var.N(0);
                int m = xu7Var.m();
                ja3Var.f = 0;
                ja3Var.a(m, false);
                ja3Var.d(xu7Var.a, 0, 4, false);
                xu7Var.N(0);
                if (xu7Var.m() == 0) {
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
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.f = l74Var;
    }

    public final xu7 g(ja3 ja3Var) {
        int i = this.l;
        xu7 xu7Var = this.d;
        byte[] bArr = xu7Var.a;
        if (i > bArr.length) {
            xu7Var.L(0, new byte[Math.max(bArr.length << 1, i)]);
        } else {
            xu7Var.N(0);
        }
        xu7Var.M(this.l);
        ja3Var.c(xu7Var.a, 0, this.l, false);
        return xu7Var;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
