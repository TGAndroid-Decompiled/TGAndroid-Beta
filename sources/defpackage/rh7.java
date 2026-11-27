package defpackage;

import java.io.EOFException;
import java.util.List;
public final class rh7 implements e84 {
    public static final hz6 w = new hz6((byte) 17);
    public final int a;
    public final long b;
    public final ey7 c;
    public final di7 d;
    public final du4 e;
    public final aj3 f;
    public final po3 g;
    public g84 h;
    public x1c i;
    public x1c j;
    public int k;
    public vf7 l;
    public vf7 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public ez9 s;
    public boolean t;
    public boolean u;
    public long v;

    public rh7(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new ey7(10);
        this.d = new Object();
        this.e = new du4();
        this.n = -9223372036854775807L;
        this.f = new aj3((byte) 12);
        po3 po3Var = new po3();
        this.g = po3Var;
        this.j = po3Var;
        this.q = -1L;
    }

    @Override
    public final int b(defpackage.f84 r50, defpackage.v11 r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh7.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        return j((cb3) f84Var, true);
    }

    @Override
    public final void d(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        ez9 ez9Var = this.s;
        if (ez9Var instanceof mp5) {
            ed edVar = ((mp5) ez9Var).d.b;
            int i = edVar.b;
            if (i == 0 || j2 - edVar.h0(i - 1) >= 100000) {
                this.u = true;
                this.j = this.g;
            }
        }
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.h = g84Var;
        x1c e0 = g84Var.e0(0, 1);
        this.i = e0;
        this.j = e0;
        this.h.D();
    }

    public final kt2 g(cb3 cb3Var) {
        ey7 ey7Var = this.c;
        boolean z = false;
        cb3Var.d(ey7Var.a, 0, 4, false);
        ey7Var.N(0);
        int m = ey7Var.m();
        di7 di7Var = this.d;
        di7Var.a(m);
        long j = cb3Var.c;
        long j2 = cb3Var.d;
        if ((this.a & 2) != 0) {
            z = true;
        }
        return new kt2(j, j2, di7Var.f, di7Var.c, z, true, -9223372036854775807L);
    }

    public final void h() {
        ez9 ez9Var = this.s;
        if ((ez9Var instanceof kt2) && ((jt2) ez9Var).c()) {
            long j = this.q;
            if (j != -1 && j != this.s.a()) {
                kt2 kt2Var = (kt2) this.s;
                this.s = new kt2(this.q, kt2Var.b, kt2Var.e, kt2Var.c, kt2Var.g, false, kt2Var.i);
                g84 g84Var = this.h;
                g84Var.getClass();
                g84Var.m0(this.s);
                x1c x1cVar = this.i;
                x1cVar.getClass();
                x1cVar.d(this.s.h());
            }
        }
    }

    public final boolean i(defpackage.cb3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh7.i(cb3):boolean");
    }

    public final boolean j(cb3 cb3Var, boolean z) {
        int i;
        int i2;
        int a;
        boolean z2;
        boolean z3;
        tl5 tl5Var;
        cb3Var.f = 0;
        if (cb3Var.d == 0) {
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
                tl5Var = w;
            } else if (z3) {
                tl5Var = vl5.c;
            } else {
                tl5Var = null;
            }
            vf7 c0 = this.f.c0(cb3Var, tl5Var, 131072);
            this.l = c0;
            if (c0 != null) {
                this.e.b(c0);
            }
            i = (int) cb3Var.e();
            if (!z) {
                cb3Var.l(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (i(cb3Var)) {
                if (i4 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                ey7 ey7Var = this.c;
                ey7Var.N(0);
                int m = ey7Var.m();
                if ((i2 != 0 && ((-128000) & m) != (i2 & (-128000))) || (a = nfd.a(m)) == -1) {
                    int i6 = i5 + 1;
                    if (i5 == 131072) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        cb3Var.f = 0;
                        cb3Var.a(i + i6, false);
                    } else {
                        cb3Var.l(1, false);
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
                    cb3Var.a(a - 4, false);
                }
            }
        }
        if (z) {
            cb3Var.l(i + i5, false);
        } else {
            cb3Var.f = 0;
        }
        this.k = i2;
        return true;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }

    public rh7(int i) {
        this(i, -9223372036854775807L);
    }
}
