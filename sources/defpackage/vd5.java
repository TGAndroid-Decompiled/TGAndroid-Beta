package defpackage;

import java.util.List;
public final class vd5 implements j74 {
    public l74 b;
    public ja3 c;
    public hg2 d;
    public pf7 e;
    public int g;
    public long h;
    public int i;
    public final xu7 a = new xu7(16);
    public long j = -1;
    public byte f = 0;

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        while (true) {
            byte b = this.f;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 4) {
                                return -1;
                            }
                            sdb.a();
                            return 0;
                        }
                        if (this.d == null || k74Var != this.c) {
                            ja3 ja3Var = (ja3) k74Var;
                            this.c = ja3Var;
                            this.d = new hg2(ja3Var, this.j);
                        }
                        pf7 pf7Var = this.e;
                        pf7Var.getClass();
                        int b2 = pf7Var.b(this.d, m11Var);
                        if (b2 == 1) {
                            m11Var.a += this.j;
                        }
                        return b2;
                    }
                    if (this.e == null) {
                        this.e = new pf7(sab.B, 8);
                    }
                    hg2 hg2Var = new hg2((ja3) k74Var, this.j);
                    this.d = hg2Var;
                    if (this.e.c(hg2Var)) {
                        pf7 pf7Var2 = this.e;
                        long j = this.j;
                        l74 l74Var = this.b;
                        l74Var.getClass();
                        pf7Var2.f(new hg2(j, l74Var, (byte) 7));
                        this.f = (byte) 3;
                    } else {
                        l74 l74Var2 = this.b;
                        l74Var2.getClass();
                        l74Var2.B();
                        this.b.f0(new oc0(-9223372036854775807L));
                        this.f = (byte) 4;
                    }
                } else {
                    ((ja3) k74Var).l((int) (this.h - this.i), false);
                    this.i = 0;
                    this.f = (byte) 0;
                }
            } else {
                int i = this.i;
                xu7 xu7Var = this.a;
                if (i == 0) {
                    if (!((ja3) k74Var).c(xu7Var.a, 0, 8, true)) {
                        l74 l74Var3 = this.b;
                        l74Var3.getClass();
                        l74Var3.B();
                        this.b.f0(new oc0(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    xu7Var.N(0);
                    this.h = xu7Var.C();
                    this.g = xu7Var.m();
                }
                long j2 = this.h;
                if (j2 == 1) {
                    ((ja3) k74Var).c(xu7Var.a, 8, 8, false);
                    this.i += 8;
                    j2 = xu7Var.G();
                    this.h = j2;
                }
                if (this.g == 1836086884) {
                    long j3 = ((ja3) k74Var).d;
                    this.j = j3;
                    long j4 = this.i;
                    ef7 ef7Var = new ef7(0L, j3 - j4, -9223372036854775807L, j3, j2 - j4);
                    l74 l74Var4 = this.b;
                    l74Var4.getClass();
                    wxb T = l74Var4.T(1024, 4);
                    em4 em4Var = new em4();
                    em4Var.r = ud7.n("image/heic");
                    em4Var.l = new ld7(ef7Var);
                    yjb.v(em4Var, T);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            }
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        return hje.a((ja3) k74Var, true);
    }

    @Override
    public final void d(long j, long j2) {
        if (j == 0) {
            this.f = (byte) 0;
            this.i = 0;
            this.j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f == 3) {
            pf7 pf7Var = this.e;
            pf7Var.getClass();
            pf7Var.d(j, j2);
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.b = l74Var;
    }

    @Override
    public final void release() {
        pf7 pf7Var = this.e;
        if (pf7Var != null) {
            pf7Var.getClass();
            this.e = null;
        }
    }

    @Override
    public final j74 a() {
        return this;
    }
}
