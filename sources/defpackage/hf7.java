package defpackage;

import java.io.EOFException;
import java.util.List;
public final class hf7 implements j74 {
    public static final yw6 w = new yw6((byte) 29);
    public final int a;
    public final long b;
    public final xu7 c;
    public final tf7 d;
    public final zr4 e;
    public final s34 f;
    public final yn3 g;
    public l74 h;
    public wxb i;
    public wxb j;
    public int k;
    public ld7 l;
    public ld7 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public kv9 s;
    public boolean t;
    public boolean u;
    public long v;

    public hf7(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new xu7(10);
        this.d = new Object();
        this.e = new zr4();
        this.n = -9223372036854775807L;
        this.f = new s34((byte) 8);
        yn3 yn3Var = new yn3();
        this.g = yn3Var;
        this.j = yn3Var;
        this.q = -1L;
    }

    @Override
    public final int b(defpackage.k74 r50, defpackage.m11 r51) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf7.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        return j((ja3) k74Var, true);
    }

    @Override
    public final void d(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        kv9 kv9Var = this.s;
        if (kv9Var instanceof jn5) {
            dd ddVar = ((jn5) kv9Var).d.b;
            int i = ddVar.b;
            if (i == 0 || j2 - ddVar.f0(i - 1) >= 100000) {
                this.u = true;
                this.j = this.g;
            }
        }
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.h = l74Var;
        wxb T = l74Var.T(0, 1);
        this.i = T;
        this.j = T;
        this.h.B();
    }

    public final qs2 g(ja3 ja3Var) {
        xu7 xu7Var = this.c;
        boolean z = false;
        ja3Var.d(xu7Var.a, 0, 4, false);
        xu7Var.N(0);
        int m = xu7Var.m();
        tf7 tf7Var = this.d;
        tf7Var.a(m);
        long j = ja3Var.c;
        long j2 = ja3Var.d;
        if ((this.a & 2) != 0) {
            z = true;
        }
        return new qs2(j, j2, tf7Var.f, tf7Var.c, z, true, -9223372036854775807L);
    }

    public final void h() {
        kv9 kv9Var = this.s;
        if ((kv9Var instanceof qs2) && ((ps2) kv9Var).c()) {
            long j = this.q;
            if (j != -1 && j != this.s.a()) {
                qs2 qs2Var = (qs2) this.s;
                this.s = new qs2(this.q, qs2Var.b, qs2Var.e, qs2Var.c, qs2Var.g, false, qs2Var.i);
                l74 l74Var = this.h;
                l74Var.getClass();
                l74Var.f0(this.s);
                wxb wxbVar = this.i;
                wxbVar.getClass();
                wxbVar.d(this.s.h());
            }
        }
    }

    public final boolean i(defpackage.ja3 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf7.i(ja3):boolean");
    }

    public final boolean j(ja3 ja3Var, boolean z) {
        int i;
        int i2;
        int a;
        boolean z2;
        boolean z3;
        rj5 rj5Var;
        ja3Var.f = 0;
        if (ja3Var.d == 0) {
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
                rj5Var = w;
            } else if (z3) {
                rj5Var = tj5.c;
            } else {
                rj5Var = null;
            }
            ld7 M = this.f.M(ja3Var, rj5Var, 131072);
            this.l = M;
            if (M != null) {
                this.e.b(M);
            }
            i = (int) ja3Var.f();
            if (!z) {
                ja3Var.l(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (i(ja3Var)) {
                if (i4 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                xu7 xu7Var = this.c;
                xu7Var.N(0);
                int m = xu7Var.m();
                if ((i2 != 0 && ((-128000) & m) != (i2 & (-128000))) || (a = uad.a(m)) == -1) {
                    int i6 = i5 + 1;
                    if (i5 == 131072) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        ja3Var.f = 0;
                        ja3Var.a(i + i6, false);
                    } else {
                        ja3Var.l(1, false);
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
                    ja3Var.a(a - 4, false);
                }
            }
        }
        if (z) {
            ja3Var.l(i + i5, false);
        } else {
            ja3Var.f = 0;
        }
        this.k = i2;
        return true;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }

    public hf7(int i) {
        this(i, -9223372036854775807L);
    }
}
