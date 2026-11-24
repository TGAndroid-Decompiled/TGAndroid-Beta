package defpackage;

import java.io.EOFException;
import java.util.List;
public final class kh7 implements s84 {
    public static final bh7 w = new bh7((byte) 1);
    public final int a;
    public final long b;
    public final yw7 c;
    public final wh7 d;
    public final au4 e;
    public final fk3 f;
    public final ip3 g;
    public u84 h;
    public yzb i;
    public yzb j;
    public int k;
    public nf7 l;
    public nf7 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public nx9 s;
    public boolean t;
    public boolean u;
    public long v;

    public kh7(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new yw7(10);
        this.d = new Object();
        this.e = new au4();
        this.n = -9223372036854775807L;
        this.f = new fk3((byte) 11);
        ip3 ip3Var = new ip3();
        this.g = ip3Var;
        this.j = ip3Var;
        this.q = -1L;
    }

    @Override
    public final int b(defpackage.t84 r50, defpackage.u21 r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh7.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        return j((vb3) t84Var, true);
    }

    @Override
    public final void d(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        nx9 nx9Var = this.s;
        if (nx9Var instanceof jp5) {
            de deVar = ((jp5) nx9Var).d.b;
            int i = deVar.b;
            if (i == 0 || j2 - deVar.g0(i - 1) >= 100000) {
                this.u = true;
                this.j = this.g;
            }
        }
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.h = u84Var;
        yzb c0 = u84Var.c0(0, 1);
        this.i = c0;
        this.j = c0;
        this.h.B();
    }

    public final bu2 g(vb3 vb3Var) {
        yw7 yw7Var = this.c;
        boolean z = false;
        vb3Var.d(yw7Var.a, 0, 4, false);
        yw7Var.N(0);
        int m = yw7Var.m();
        wh7 wh7Var = this.d;
        wh7Var.a(m);
        long j = vb3Var.c;
        long j2 = vb3Var.d;
        if ((this.a & 2) != 0) {
            z = true;
        }
        return new bu2(j, j2, wh7Var.f, wh7Var.c, z, true, -9223372036854775807L);
    }

    public final void h() {
        nx9 nx9Var = this.s;
        if ((nx9Var instanceof bu2) && ((au2) nx9Var).c()) {
            long j = this.q;
            if (j != -1 && j != this.s.a()) {
                bu2 bu2Var = (bu2) this.s;
                this.s = new bu2(this.q, bu2Var.b, bu2Var.e, bu2Var.c, bu2Var.g, false, bu2Var.i);
                u84 u84Var = this.h;
                u84Var.getClass();
                u84Var.f0(this.s);
                yzb yzbVar = this.i;
                yzbVar.getClass();
                yzbVar.d(this.s.h());
            }
        }
    }

    public final boolean i(defpackage.vb3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh7.i(vb3):boolean");
    }

    public final boolean j(vb3 vb3Var, boolean z) {
        int i;
        int i2;
        int a;
        boolean z2;
        boolean z3;
        ql5 ql5Var;
        vb3Var.f = 0;
        if (vb3Var.d == 0) {
            int i3 = this.a;
            if ((i3 & 8) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 16) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2) {
                ql5Var = w;
            } else if (z3) {
                ql5Var = sl5.c;
            } else {
                ql5Var = null;
            }
            nf7 Z = this.f.Z(vb3Var, ql5Var, 131072);
            this.l = Z;
            if (Z != null) {
                this.e.b(Z);
            }
            i = (int) vb3Var.f();
            if (!z) {
                vb3Var.m(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (i(vb3Var)) {
                if (i4 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                yw7 yw7Var = this.c;
                yw7Var.N(0);
                int m = yw7Var.m();
                if ((i2 != 0 && ((-128000) & m) != (i2 & (-128000))) || (a = wcd.a(m)) == -1) {
                    int i6 = i5 + 1;
                    if (i5 == 131072) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        vb3Var.f = 0;
                        vb3Var.a(i + i6, false);
                    } else {
                        vb3Var.m(1, false);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        this.d.a(m);
                        i2 = m;
                    } else if (i4 == 4) {
                        break;
                    }
                    vb3Var.a(a - 4, false);
                }
            }
        }
        if (z) {
            vb3Var.m(i + i5, false);
        } else {
            vb3Var.f = 0;
        }
        this.k = i2;
        return true;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }

    public kh7(int i) {
        this(i, -9223372036854775807L);
    }
}
