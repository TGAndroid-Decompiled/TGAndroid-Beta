package defpackage;

import java.util.List;
public final class wf5 implements e84 {
    public g84 b;
    public cb3 c;
    public zg2 d;
    public yh7 e;
    public int g;
    public long h;
    public int i;
    public final ey7 a = new ey7(16);
    public long j = -1;
    public byte f = 0;

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        while (true) {
            byte b = this.f;
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 4) {
                                return -1;
                            }
                            grb.g();
                            return 0;
                        }
                        if (this.d == null || f84Var != this.c) {
                            cb3 cb3Var = (cb3) f84Var;
                            this.c = cb3Var;
                            this.d = new zg2(cb3Var, this.j);
                        }
                        yh7 yh7Var = this.e;
                        yh7Var.getClass();
                        int b2 = yh7Var.b(this.d, v11Var);
                        if (b2 == 1) {
                            v11Var.a += this.j;
                        }
                        return b2;
                    }
                    if (this.e == null) {
                        this.e = new yh7(peb.B, 8);
                    }
                    zg2 zg2Var = new zg2((cb3) f84Var, this.j);
                    this.d = zg2Var;
                    if (this.e.c(zg2Var)) {
                        yh7 yh7Var2 = this.e;
                        long j = this.j;
                        g84 g84Var = this.b;
                        g84Var.getClass();
                        yh7Var2.f(new zg2(j, g84Var, (byte) 8));
                        this.f = (byte) 3;
                    } else {
                        g84 g84Var2 = this.b;
                        g84Var2.getClass();
                        g84Var2.D();
                        this.b.m0(new qc0(-9223372036854775807L));
                        this.f = (byte) 4;
                    }
                } else {
                    ((cb3) f84Var).l((int) (this.h - this.i), false);
                    this.i = 0;
                    this.f = (byte) 0;
                }
            } else {
                int i = this.i;
                ey7 ey7Var = this.a;
                if (i == 0) {
                    if (!((cb3) f84Var).c(ey7Var.a, 0, 8, true)) {
                        g84 g84Var3 = this.b;
                        g84Var3.getClass();
                        g84Var3.D();
                        this.b.m0(new qc0(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    ey7Var.N(0);
                    this.h = ey7Var.C();
                    this.g = ey7Var.m();
                }
                long j2 = this.h;
                if (j2 == 1) {
                    ((cb3) f84Var).c(ey7Var.a, 8, 8, false);
                    this.i += 8;
                    j2 = ey7Var.G();
                    this.h = j2;
                }
                if (this.g == 1836086884) {
                    long j3 = ((cb3) f84Var).d;
                    this.j = j3;
                    long j4 = this.i;
                    nh7 nh7Var = new nh7(0L, j3 - j4, -9223372036854775807L, j3, j2 - j4);
                    g84 g84Var4 = this.b;
                    g84Var4.getClass();
                    x1c e0 = g84Var4.e0(1024, 4);
                    jo4 jo4Var = new jo4();
                    jo4Var.r = dg7.n("image/heic");
                    jo4Var.l = new uf7(nh7Var);
                    xnb.v(jo4Var, e0);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            }
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        return boe.a((cb3) f84Var, true);
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
            yh7 yh7Var = this.e;
            yh7Var.getClass();
            yh7Var.d(j, j2);
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.b = g84Var;
    }

    @Override
    public final void release() {
        yh7 yh7Var = this.e;
        if (yh7Var != null) {
            yh7Var.getClass();
            this.e = null;
        }
    }

    @Override
    public final e84 a() {
        return this;
    }
}
