package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
public final class r74 implements Handler.Callback, st6, vcc {
    public static final long x0 = hac.i0(10000);
    public final ArrayList E;
    public final bfb F;
    public final y64 G;
    public final wt6 H;
    public final e07 I;
    public final vc3 J;
    public final short K;
    public final we8 L;
    public final boolean M;
    public final xa3 N;
    public final dfb O;
    public final boolean P;
    public final c10 Q;
    public boolean R;
    public jx9 S;
    public ot9 T;
    public boolean U;
    public boolean V;
    public q74 W;
    public int X;
    public be8 Y;
    public o74 Z;
    public final g99[] a;
    public boolean a0;
    public final uh0[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final fe3 d;
    public boolean d0;
    public final e0c e;
    public long e0;
    public final xc3 f;
    public boolean f0;
    public int g0;
    public final dfb h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public q74 m0;
    public final jif n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final Looper r;
    public u64 r0;
    public final aqb s;
    public long s0;
    public w64 t0;
    public long u0;
    public boolean v0;
    public final ypb w;
    public float w0;
    public final long x;
    public final yc3 y;

    public r74(Context context, uh0[] uh0VarArr, uh0[] uh0VarArr2, fe3 fe3Var, e0c e0cVar, xc3 xc3Var, eb3 eb3Var, int i, boolean z, xa3 xa3Var, jx9 jx9Var, vc3 vc3Var, long j, boolean z2, Looper looper, bfb bfbVar, y64 y64Var, we8 we8Var, final vcc vccVar, boolean z3) {
        w64 w64Var = w64.a;
        this.u0 = -9223372036854775807L;
        this.G = y64Var;
        this.d = fe3Var;
        this.e = e0cVar;
        this.f = xc3Var;
        this.g0 = i;
        this.h0 = z;
        this.S = jx9Var;
        this.J = vc3Var;
        this.K = (int) j;
        this.b0 = false;
        this.M = z2;
        this.F = bfbVar;
        this.L = we8Var;
        this.t0 = w64Var;
        this.N = xa3Var;
        this.w0 = 1.0f;
        this.T = ot9.b;
        this.R = z3;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.x = xc3Var.m;
        xpb xpbVar = bqb.a;
        be8 k = be8.k(e0cVar);
        this.Y = k;
        this.Z = new o74(k);
        this.b = new uh0[uh0VarArr.length];
        this.c = new boolean[uh0VarArr.length];
        fe3Var.getClass();
        this.a = new g99[uh0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < uh0VarArr.length; i2++) {
            uh0 uh0Var = uh0VarArr[i2];
            uh0Var.e = i2;
            uh0Var.f = we8Var;
            uh0Var.h = bfbVar;
            this.b[i2] = uh0Var;
            uh0 uh0Var2 = this.b[i2];
            synchronized (uh0Var2.a) {
                uh0Var2.J = fe3Var;
            }
            uh0 uh0Var3 = uh0VarArr2[i2];
            if (uh0Var3 != null) {
                uh0Var3.e = i2;
                uh0Var3.f = we8Var;
                uh0Var3.h = bfbVar;
                z4 = true;
            }
            this.a[i2] = new g99(uh0VarArr[i2], uh0Var3, i2);
        }
        this.P = z4;
        this.y = new yc3(this, bfbVar);
        this.E = new ArrayList();
        this.s = new aqb();
        this.w = new ypb();
        jte.p(fe3Var.a == null);
        fe3Var.a = this;
        fe3Var.b = eb3Var;
        fe3Var.g = fe3Var.f;
        this.q0 = true;
        dfb a = bfbVar.a(looper, null);
        this.O = a;
        this.H = new wt6(xa3Var, a, new yu3(this, (byte) 15), uh0VarArr.length);
        this.I = new e07(this, xa3Var, a, we8Var, eb3Var);
        jif jifVar = new jif((byte) 2);
        this.n = jifVar;
        Looper p = jifVar.p();
        this.r = p;
        dfb a2 = bfbVar.a(p, this);
        this.h = a2;
        this.Q = new c10(context, p, this);
        a2.c(35, new vcc() {
            @Override
            public final void c(long j2, long j3, go4 go4Var, MediaFormat mediaFormat) {
                vccVar.c(j2, j3, go4Var, mediaFormat);
                r74.this.c(j2, j3, go4Var, mediaFormat);
            }
        }).b();
        a2.c(39, new k74(this)).b();
    }

    public static Pair S(bqb bqbVar, q74 q74Var, boolean z, int i, boolean z2, aqb aqbVar, ypb ypbVar) {
        bqb bqbVar2;
        int T;
        bqb bqbVar3 = q74Var.a;
        if (!bqbVar.p()) {
            if (bqbVar3.p()) {
                bqbVar2 = bqbVar;
            } else {
                bqbVar2 = bqbVar3;
            }
            try {
                Pair i2 = bqbVar2.i(aqbVar, ypbVar, q74Var.b, q74Var.c);
                if (!bqbVar.equals(bqbVar2)) {
                    if (bqbVar.b(i2.first) != -1) {
                        if (bqbVar2.g(i2.first, ypbVar).f && bqbVar2.m(ypbVar.c, aqbVar, 0L).m == bqbVar2.b(i2.first)) {
                            return bqbVar.i(aqbVar, ypbVar, bqbVar.g(i2.first, ypbVar).c, q74Var.c);
                        }
                    } else if (z && (T = T(aqbVar, ypbVar, i, z2, i2.first, bqbVar2, bqbVar)) != -1) {
                        return bqbVar.i(aqbVar, ypbVar, T, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i2;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int T(aqb aqbVar, ypb ypbVar, int i, boolean z, Object obj, bqb bqbVar, bqb bqbVar2) {
        aqb aqbVar2 = aqbVar;
        bqb bqbVar3 = bqbVar;
        Object obj2 = bqbVar3.m(bqbVar3.g(obj, ypbVar).c, aqbVar, 0L).a;
        for (int i2 = 0; i2 < bqbVar2.o(); i2++) {
            if (bqbVar2.m(i2, aqbVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = bqbVar3.b(obj);
        int h = bqbVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            bqb bqbVar4 = bqbVar3;
            int d = bqbVar4.d(b, ypbVar, aqbVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = bqbVar2.b(bqbVar4.l(d));
            i4++;
            bqbVar3 = bqbVar4;
            b = d;
            aqbVar2 = aqbVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return bqbVar2.f(i3, ypbVar, false).c;
    }

    public static boolean y(ut6 ut6Var) {
        jr9[] jr9VarArr;
        long g;
        if (ut6Var != null) {
            try {
                hl6 hl6Var = ut6Var.a;
                if (!ut6Var.e) {
                    hl6Var.j();
                } else {
                    for (jr9 jr9Var : ut6Var.c) {
                        if (jr9Var != null) {
                            jr9Var.d();
                        }
                    }
                }
                if (!ut6Var.e) {
                    g = 0;
                } else {
                    g = hl6Var.g();
                }
                if (g != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, rz6 rz6Var) {
        wt6 wt6Var = this.H;
        ut6 ut6Var = wt6Var.k[i];
        if (ut6Var != null && ut6Var.g.a.equals(rz6Var)) {
            return this.a[i].h(wt6Var.k[i]);
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2;
        t74[] t74VarArr;
        if (z && i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.U;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            if (z3) {
                i2 = 4;
            } else {
                i2 = 0;
            }
        }
        be8 be8Var = this.Y;
        if (be8Var.l != z2 || be8Var.n != i2 || be8Var.m != i3) {
            this.Y = be8Var.e(i3, i2, z2);
            D0(false, false);
            wt6 wt6Var = this.H;
            for (ut6 ut6Var = wt6Var.i; ut6Var != null; ut6Var = ut6Var.m) {
                for (t74 t74Var : (t74[]) ut6Var.o.d) {
                    if (t74Var != null) {
                        t74Var.h(z2);
                    }
                }
            }
            if (!s0()) {
                w0();
                B0();
                be8 be8Var2 = this.Y;
                if (be8Var2.p) {
                    this.Y = be8Var2.i(false);
                }
                wt6Var.r(this.n0);
                return;
            }
            int i4 = this.Y.e;
            dfb dfbVar = this.h;
            if (i4 == 3) {
                yc3 yc3Var = this.y;
                yc3Var.b = true;
                ((tf2) yc3Var.c).c();
                u0();
                dfbVar.h(2);
            } else if (i4 == 2) {
                dfbVar.h(2);
            }
        }
    }

    public final boolean B() {
        ut6 ut6Var = this.H.i;
        long j = ut6Var.g.e;
        if (ut6Var.e) {
            if (j == -9223372036854775807L || this.Y.s < j || !s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        long j;
        long j2;
        long max;
        long j3;
        float f;
        long j4;
        ut6 ut6Var = this.H.i;
        if (ut6Var != null) {
            if (ut6Var.e) {
                j = ut6Var.a.n();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                if (!ut6Var.g()) {
                    this.H.s(ut6Var);
                    g();
                    t(false);
                    C();
                }
                Q(j, true);
                if (j != this.Y.s) {
                    be8 be8Var = this.Y;
                    this.Y = x(be8Var.b, j, be8Var.c, j, true, 5);
                }
            } else {
                yc3 yc3Var = this.y;
                boolean z = z();
                tf2 tf2Var = (tf2) yc3Var.c;
                uh0 uh0Var = (uh0) yc3Var.e;
                if (uh0Var != null && !uh0Var.n() && ((!z || ((uh0) yc3Var.e).n == 2) && (((uh0) yc3Var.e).o() || (!z && !((uh0) yc3Var.e).m())))) {
                    fm6 fm6Var = (fm6) yc3Var.f;
                    fm6Var.getClass();
                    long h = fm6Var.h();
                    if (yc3Var.a) {
                        if (h < tf2Var.h()) {
                            if (tf2Var.c) {
                                tf2Var.a(tf2Var.h());
                                tf2Var.c = false;
                            }
                        } else {
                            yc3Var.a = false;
                            if (yc3Var.b) {
                                tf2Var.c();
                            }
                        }
                    }
                    tf2Var.a(h);
                    ce8 g = fm6Var.g();
                    if (!g.equals((ce8) tf2Var.e)) {
                        tf2Var.b(g);
                        ((r74) yc3Var.d).h.c(16, g).b();
                    }
                } else {
                    yc3Var.a = true;
                    if (yc3Var.b) {
                        tf2Var.c();
                    }
                }
                long h2 = yc3Var.h();
                this.n0 = h2;
                long j5 = h2 - ut6Var.p;
                long j6 = this.Y.s;
                if (!this.E.isEmpty() && !this.Y.b.c()) {
                    if (this.q0) {
                        this.q0 = false;
                    }
                    be8 be8Var2 = this.Y;
                    be8Var2.a.b(be8Var2.b.a);
                    int min = Math.min(this.p0, this.E.size());
                    if (min > 0 && this.E.get(min - 1) != null) {
                        rjb.p();
                        return;
                    } else if (min < this.E.size() && this.E.get(min) != null) {
                        rjb.p();
                        return;
                    } else {
                        this.p0 = min;
                    }
                }
                if (this.y.i()) {
                    boolean z2 = !this.Z.d;
                    be8 be8Var3 = this.Y;
                    this.Y = x(be8Var3.b, j5, be8Var3.c, j5, z2, 6);
                } else {
                    be8 be8Var4 = this.Y;
                    be8Var4.s = j5;
                    be8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.q = this.H.l.d();
            be8 be8Var5 = this.Y;
            be8Var5.r = o(be8Var5.q);
            be8 be8Var6 = this.Y;
            if (be8Var6.l && be8Var6.e == 3 && t0(be8Var6.a, be8Var6.b)) {
                be8 be8Var7 = this.Y;
                float f2 = 1.0f;
                if (be8Var7.o.a == 1.0f) {
                    vc3 vc3Var = this.J;
                    long l = l(be8Var7.a, be8Var7.b.a, be8Var7.s);
                    long j7 = this.Y.r;
                    if (vc3Var.c != -9223372036854775807L) {
                        long j8 = l - j7;
                        if (vc3Var.m == -9223372036854775807L) {
                            vc3Var.m = j8;
                            vc3Var.n = 0L;
                        } else {
                            vc3Var.m = Math.max(j8, (((float) j8) * 9.999871E-4f) + (((float) j2) * 0.999f));
                            vc3Var.n = (9.999871E-4f * ((float) Math.abs(j8 - max))) + (((float) vc3Var.n) * 0.999f);
                        }
                        if (vc3Var.l != -9223372036854775807L) {
                            j3 = 1000;
                            if (SystemClock.elapsedRealtime() - vc3Var.l < 1000) {
                                f2 = vc3Var.k;
                            }
                        } else {
                            j3 = 1000;
                        }
                        vc3Var.l = SystemClock.elapsedRealtime();
                        long j9 = (vc3Var.n * 3) + vc3Var.m;
                        if (vc3Var.h > j9) {
                            float T = (float) hac.T(j3);
                            f = 1.0E-7f;
                            long[] jArr = {j9, vc3Var.e, vc3Var.h - (((vc3Var.k - 1.0f) * T) + ((vc3Var.i - 1.0f) * T))};
                            j4 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j4) {
                                    j4 = j10;
                                }
                            }
                            vc3Var.h = j4;
                        } else {
                            f = 1.0E-7f;
                            j4 = hac.j(l - (Math.max(0.0f, vc3Var.k - 1.0f) / 1.0E-7f), vc3Var.h, j9);
                            vc3Var.h = j4;
                            long j11 = vc3Var.g;
                            if (j11 != -9223372036854775807L && j4 > j11) {
                                vc3Var.h = j11;
                                j4 = j11;
                            }
                        }
                        long j12 = l - j4;
                        if (Math.abs(j12) < vc3Var.a) {
                            vc3Var.k = 1.0f;
                        } else {
                            f2 = hac.h((f * ((float) j12)) + 1.0f, vc3Var.j, vc3Var.i);
                            vc3Var.k = f2;
                        }
                    }
                    if (this.y.g().a != f2) {
                        ce8 ce8Var = new ce8(f2, this.Y.o.b);
                        this.h.g(16);
                        this.y.b(ce8Var);
                        w(this.Y.o, this.y.g().a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        long g;
        long j;
        boolean c;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!y(this.H.l)) {
            c = false;
        } else {
            ut6 ut6Var = this.H.l;
            if (!ut6Var.e) {
                g = 0;
            } else {
                g = ut6Var.a.g();
            }
            long o = o(g);
            ut6 ut6Var2 = this.H.i;
            if (t0(this.Y.a, ut6Var.g.a)) {
                j = this.J.h;
            } else {
                j = -9223372036854775807L;
            }
            we8 we8Var = this.L;
            bqb bqbVar = this.Y.a;
            rz6 rz6Var = ut6Var.g.a;
            float f = this.y.g().a;
            boolean z4 = this.Y.l;
            aa6 aa6Var = new aa6(we8Var, bqbVar, rz6Var, o, f, this.d0, j);
            c = this.f.c(aa6Var);
            ut6 ut6Var3 = this.H.i;
            if (!c && ut6Var3.e && o < 500000 && this.x > 0) {
                ut6Var3.a.l(this.Y.s);
                c = this.f.c(aa6Var);
            }
        }
        this.f0 = c;
        if (c) {
            ut6 ut6Var4 = this.H.l;
            ut6Var4.getClass();
            ra6 ra6Var = new ra6();
            ra6Var.a = this.n0 - ut6Var4.p;
            float f2 = this.y.g().a;
            if (f2 <= 0.0f && f2 != -3.4028235E38f) {
                z = false;
            } else {
                z = true;
            }
            jte.f(z);
            ra6Var.b = f2;
            long j2 = this.e0;
            if (j2 < 0 && j2 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = true;
            }
            jte.f(z2);
            ra6Var.c = j2;
            sa6 sa6Var = new sa6(ra6Var);
            if (ut6Var4.m == null) {
                z3 = true;
            }
            jte.p(z3);
            ut6Var4.a.r(sa6Var);
        }
        x0();
    }

    public final void C0(bqb bqbVar, rz6 rz6Var, bqb bqbVar2, rz6 rz6Var2, long j, boolean z) {
        Object obj;
        ce8 ce8Var;
        boolean t0 = t0(bqbVar, rz6Var);
        Object obj2 = rz6Var.a;
        if (!t0) {
            if (rz6Var.c()) {
                ce8Var = ce8.d;
            } else {
                ce8Var = this.Y.o;
            }
            yc3 yc3Var = this.y;
            if (!yc3Var.g().equals(ce8Var)) {
                this.h.g(16);
                yc3Var.b(ce8Var);
                w(this.Y.o, ce8Var.a, false, false);
                return;
            }
            return;
        }
        ypb ypbVar = this.w;
        int i = bqbVar.g(obj2, ypbVar).c;
        aqb aqbVar = this.s;
        bqbVar.n(i, aqbVar);
        ws6 ws6Var = aqbVar.i;
        String str = hac.a;
        vc3 vc3Var = this.J;
        vc3Var.getClass();
        vc3Var.c = hac.T(ws6Var.a);
        vc3Var.f = hac.T(ws6Var.b);
        vc3Var.g = hac.T(ws6Var.c);
        float f = ws6Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        vc3Var.j = f;
        float f2 = ws6Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        vc3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            vc3Var.c = -9223372036854775807L;
        }
        vc3Var.a();
        if (j != -9223372036854775807L) {
            vc3Var.d = l(bqbVar, obj2, j);
            vc3Var.a();
            return;
        }
        Object obj3 = aqbVar.a;
        if (!bqbVar2.p()) {
            obj = bqbVar2.m(bqbVar2.g(rz6Var2.a, ypbVar).c, aqbVar, 0L).a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z) {
            return;
        }
        vc3Var.d = -9223372036854775807L;
        vc3Var.a();
    }

    public final void D() {
        boolean z;
        boolean z2;
        wt6 wt6Var = this.H;
        wt6Var.p();
        ut6 ut6Var = wt6Var.m;
        if (ut6Var != null) {
            hl6 hl6Var = ut6Var.a;
            if ((!ut6Var.d || ut6Var.e) && !hl6Var.f()) {
                bqb bqbVar = this.Y.a;
                if (ut6Var.e) {
                    hl6Var.s();
                }
                for (wc3 wc3Var : this.f.o.values()) {
                    if (wc3Var.b) {
                        return;
                    }
                }
                boolean z3 = true;
                if (!ut6Var.d) {
                    long j = ut6Var.g.b;
                    ut6Var.d = true;
                    hl6Var.o(this, j);
                    return;
                }
                ra6 ra6Var = new ra6();
                ra6Var.a = this.n0 - ut6Var.p;
                float f = this.y.g().a;
                if (f <= 0.0f && f != -3.4028235E38f) {
                    z = false;
                } else {
                    z = true;
                }
                jte.f(z);
                ra6Var.b = f;
                long j2 = this.e0;
                if (j2 < 0 && j2 != -9223372036854775807L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                jte.f(z2);
                ra6Var.c = j2;
                sa6 sa6Var = new sa6(ra6Var);
                if (ut6Var.m != null) {
                    z3 = false;
                }
                jte.p(z3);
                hl6Var.r(sa6Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long j;
        this.d0 = z;
        if (z && !z2) {
            this.F.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = -9223372036854775807L;
        }
        this.e0 = j;
    }

    public final void E(int i) {
        boolean z;
        boolean z2;
        o74 o74Var = this.Z;
        be8 be8Var = this.Y;
        boolean z3 = o74Var.a;
        if (o74Var.b != be8Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z3 | z;
        o74Var.a = z4;
        o74Var.b = be8Var;
        if (z4) {
            if (!be8Var.a.p()) {
                be8 be8Var2 = this.Y;
                if (be8Var2.a.b(be8Var2.b.a) != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Locale locale = Locale.US;
                be8 be8Var3 = this.Y;
                jte.o(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", be8Var3.b.a, be8Var3.a.getClass().getName(), Integer.valueOf(this.Y.a.o()), Integer.valueOf(i)), z2);
            }
            o74 o74Var2 = this.Z;
            h74 h74Var = this.G.b;
            h74Var.j.e(new pv3(h74Var, o74Var2, (byte) 13));
            this.Z = new o74(this.Y);
        }
    }

    public final void F(int i) {
        g99 g99Var = this.a[i];
        try {
            ut6 ut6Var = this.H.i;
            ut6Var.getClass();
            uh0 d = g99Var.d(ut6Var);
            d.getClass();
            jr9 jr9Var = d.r;
            jr9Var.getClass();
            jr9Var.d();
        } catch (IOException | RuntimeException e) {
            byte b = g99Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            e0c e0cVar = this.H.i.o;
            ncd.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(go4.c(((t74[]) e0cVar.d)[i].o())), e);
            e0c e0cVar2 = new e0c((f99[]) ((f99[]) e0cVar.c).clone(), (t74[]) ((t74[]) e0cVar.d).clone(), (g0c) e0cVar.e, (kp) e0cVar.f);
            ((f99[]) e0cVar2.c)[i] = null;
            ((t74[]) e0cVar2.d)[i] = null;
            h(i);
            ut6 ut6Var2 = this.H.i;
            ut6Var2.a(e0cVar2, this.Y.s, false, new boolean[ut6Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.O.e(new i74(this, i, z, (byte) 0));
        }
    }

    public final void H() {
        u(this.I.b(), true);
    }

    public final void I(n74 n74Var) {
        boolean z;
        bqb b;
        this.Z.a(1);
        int i = n74Var.a;
        int i2 = n74Var.b;
        int i3 = n74Var.c;
        yia yiaVar = n74Var.d;
        e07 e07Var = this.I;
        ArrayList arrayList = e07Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        e07Var.k = yiaVar;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((d07) arrayList.get(min)).d;
            hac.S(i, i2, i3, arrayList);
            while (min <= max) {
                d07 d07Var = (d07) arrayList.get(min);
                d07Var.d = i4;
                i4 += d07Var.a.o.e.o();
                min++;
            }
            b = e07Var.b();
        } else {
            b = e07Var.b();
        }
        u(b, false);
    }

    public final void J() {
        boolean z;
        int i;
        int i2;
        this.Z.a(1);
        O(false, false, false, true);
        xc3 xc3Var = this.f;
        ConcurrentHashMap concurrentHashMap = xc3Var.o;
        long id = Thread.currentThread().getId();
        long j = xc3Var.p;
        if (j != -1 && j != id) {
            z = false;
        } else {
            z = true;
        }
        jte.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z);
        xc3Var.p = id;
        we8 we8Var = this.L;
        wc3 wc3Var = (wc3) concurrentHashMap.get(we8Var);
        if (wc3Var == null) {
            ?? obj = new Object();
            obj.a = 1;
            concurrentHashMap.put(we8Var, obj);
        } else {
            wc3Var.a++;
        }
        wc3 wc3Var2 = (wc3) concurrentHashMap.get(we8Var);
        wc3Var2.getClass();
        Integer num = (Integer) xc3Var.n.get(we8Var.a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (i == -1) {
            i = 13107200;
        }
        wc3Var2.c = i;
        wc3Var2.b = false;
        if (this.Y.a.p()) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        o0(i2);
        be8 be8Var = this.Y;
        boolean z2 = be8Var.l;
        A0(this.Q.c(be8Var.e, z2), be8Var.n, be8Var.m, z2);
        e07 e07Var = this.I;
        ArrayList arrayList = e07Var.c;
        jte.p(!e07Var.l);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            d07 d07Var = (d07) arrayList.get(i3);
            e07Var.e(d07Var);
            e07Var.h.add(d07Var);
        }
        e07Var.l = true;
        this.h.h(2);
    }

    public final void K(gs2 gs2Var) {
        tma tmaVar;
        try {
            O(true, false, true, false);
            L();
            xc3 xc3Var = this.f;
            we8 we8Var = this.L;
            ConcurrentHashMap concurrentHashMap = xc3Var.o;
            wc3 wc3Var = (wc3) concurrentHashMap.get(we8Var);
            if (wc3Var != null) {
                int i = wc3Var.a - 1;
                wc3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(we8Var);
                    xc3Var.d();
                }
            }
            if (xc3Var.o.isEmpty()) {
                xc3Var.p = -1L;
            }
            c10 c10Var = this.Q;
            c10Var.c = null;
            c10Var.a();
            c10Var.b(0);
            fe3 fe3Var = this.d;
            if (fe3Var.h != null) {
                jte.o("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(fe3Var.h));
            }
            if (Build.VERSION.SDK_INT >= 32 && (tmaVar = fe3Var.i) != null) {
                tmaVar.e();
                fe3Var.i = null;
            }
            fe3Var.a = null;
            fe3Var.b = null;
            o0(1);
        } finally {
            this.h.f();
            this.n.r();
            gs2Var.e();
        }
    }

    public final void L() {
        boolean z;
        for (int i = 0; i < this.a.length; i++) {
            uh0 uh0Var = this.b[i];
            synchronized (uh0Var.a) {
                uh0Var.J = null;
            }
            g99 g99Var = this.a[i];
            uh0 uh0Var2 = g99Var.a;
            boolean z2 = true;
            if (uh0Var2.n == 0) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            uh0Var2.t();
            g99Var.e = false;
            uh0 uh0Var3 = g99Var.c;
            if (uh0Var3 != null) {
                if (uh0Var3.n != 0) {
                    z2 = false;
                }
                jte.p(z2);
                uh0Var3.t();
                g99Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, yia yiaVar) {
        boolean z = true;
        this.Z.a(1);
        e07 e07Var = this.I;
        e07Var.getClass();
        if (i < 0 || i > i2 || i2 > e07Var.c.size()) {
            z = false;
        }
        jte.f(z);
        e07Var.k = yiaVar;
        e07Var.f(i, i2);
        u(e07Var.b(), false);
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.N():void");
    }

    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        boolean z;
        ut6 ut6Var = this.H.i;
        if (ut6Var != null && ut6Var.g.h && this.b0) {
            z = true;
        } else {
            z = false;
        }
        this.c0 = z;
    }

    public final void Q(long j, boolean z) {
        wt6 wt6Var;
        long j2;
        g99[] g99VarArr;
        t74[] t74VarArr;
        ut6 ut6Var = this.H.i;
        if (ut6Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = ut6Var.p;
        }
        long j3 = j + j2;
        this.n0 = j3;
        ((tf2) this.y.c).a(j3);
        for (g99 g99Var : this.a) {
            long j4 = this.n0;
            uh0 d = g99Var.d(ut6Var);
            if (d != null) {
                d.D(j4, false, z);
            }
        }
        for (ut6 ut6Var2 = wt6Var.i; ut6Var2 != null; ut6Var2 = ut6Var2.m) {
            for (t74 t74Var : (t74[]) ut6Var2.o.d) {
                if (t74Var != null) {
                    t74Var.t();
                }
            }
        }
    }

    public final void R(bqb bqbVar, bqb bqbVar2) {
        if (bqbVar.p() && bqbVar2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ts2.t(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        g99[] g99VarArr;
        ut6 ut6Var;
        long j2;
        boolean z = this.M;
        long j3 = 1000;
        long j4 = x0;
        if (!z) {
            if (this.U) {
                this.T.getClass();
            } else {
                if (this.Y.e != 3 || s0()) {
                    j3 = j4;
                }
                this.h.a.sendEmptyMessageAtTime(2, j + j3);
            }
        }
        if (this.Y.e != 3) {
            j3 = j4;
        }
        for (g99 g99Var : this.a) {
            long j5 = this.n0;
            long j6 = this.o0;
            uh0 uh0Var = g99Var.c;
            uh0 uh0Var2 = g99Var.a;
            if (g99.k(uh0Var2)) {
                j2 = uh0Var2.j(j5, j6);
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (uh0Var != null && uh0Var.n != 0) {
                j2 = Math.min(j2, uh0Var.j(j5, j6));
            }
            j3 = Math.min(j3, hac.i0(j2));
        }
        if (this.Y.m()) {
            ut6 ut6Var2 = this.H.i;
            if (ut6Var2 != null) {
                ut6Var = ut6Var2.m;
            } else {
                ut6Var = null;
            }
            if (ut6Var != null) {
                if ((((float) hac.T(j3)) * this.Y.o.a) + ((float) this.n0) >= ((float) ut6Var.e())) {
                    j3 = Math.min(j3, j4);
                }
            }
        }
        this.h.a.sendEmptyMessageAtTime(2, j + j3);
    }

    public final void V(boolean z) {
        rz6 rz6Var = this.H.i.g.a;
        long X = X(rz6Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            be8 be8Var = this.Y;
            this.Y = x(rz6Var, X, be8Var.c, be8Var.d, z, 5);
        }
    }

    public final void W(defpackage.q74 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.W(q74):void");
    }

    public final long X(rz6 rz6Var, long j, boolean z, boolean z2) {
        wt6 wt6Var;
        g99[] g99VarArr;
        boolean z3;
        g99[] g99VarArr2;
        byte b;
        w0();
        boolean z4 = true;
        D0(false, true);
        if (z2 || this.Y.e == 3) {
            o0(2);
        }
        ut6 ut6Var = this.H.i;
        ut6 ut6Var2 = ut6Var;
        while (ut6Var2 != null && !rz6Var.equals(ut6Var2.g.a)) {
            ut6Var2 = ut6Var2.m;
        }
        if (z || ut6Var != ut6Var2 || (ut6Var2 != null && ut6Var2.p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.u0 = -9223372036854775807L;
            if (ut6Var2 != null) {
                while (true) {
                    wt6Var = this.H;
                    if (wt6Var.i == ut6Var2) {
                        break;
                    }
                    wt6Var.a();
                }
                wt6Var.s(ut6Var2);
                ut6Var2.p = 1000000000000L;
                jte.p(!z());
                k(this.H.d().e(), new boolean[this.a.length]);
                a0(ut6Var2);
            }
        }
        g();
        if (this.U) {
            for (g99 g99Var : this.a) {
                if (g99Var.j() && ((b = g99Var.a.b) == 2 || b == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        wt6 wt6Var2 = this.H;
        if (ut6Var2 != null) {
            wt6Var2.s(ut6Var2);
            if (!ut6Var2.e) {
                ut6Var2.g = ut6Var2.g.b(j, -9223372036854775807L);
            } else if (ut6Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && ut6Var2.g.a.equals(this.Y.b)) {
                        long j2 = ut6Var2.p + j;
                        boolean z5 = true;
                        for (g99 g99Var2 : this.a) {
                            if (g99Var2.j()) {
                                uh0 d = g99Var2.d(ut6Var2);
                                if (d != null && d.I(j2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z5 &= z3;
                            }
                        }
                        if (z5) {
                            hl6 hl6Var = ut6Var2.a;
                            long j3 = this.Y.s;
                            jx9 jx9Var = jx9.e;
                            if (hl6Var.h(j3, jx9Var) == ut6Var2.a.h(j, jx9Var)) {
                                z4 = false;
                            }
                        }
                    }
                }
                j = ut6Var2.a.k(j);
                ut6Var2.a.l(j - this.x);
            }
            Q(j, z4);
            C();
        } else {
            wt6Var2.b();
            Q(j, true);
        }
        t(false);
        this.h.h(2);
        return j;
    }

    public final void Y(af8 af8Var) {
        af8Var.getClass();
        dfb dfbVar = this.h;
        if (af8Var.e == this.r) {
            synchronized (af8Var) {
            }
            try {
                af8Var.a.d(af8Var.c, af8Var.d);
                af8Var.a(true);
                int i = this.Y.e;
                if (i != 3 && i != 2) {
                    return;
                }
                dfbVar.h(2);
                return;
            } catch (Throwable th) {
                af8Var.a(true);
                throw th;
            }
        }
        dfbVar.c(15, af8Var).b();
    }

    public final void Z(af8 af8Var) {
        Looper looper = af8Var.e;
        if (!looper.getThread().isAlive()) {
            ncd.f("TAG", "Trying to send message on a dead thread.");
            af8Var.a(false);
            return;
        }
        this.F.a(looper, null).e(new a14(this, af8Var));
    }

    @Override
    public final void a(tt6 tt6Var) {
        this.h.c(8, tt6Var).b();
    }

    public final void a0(ut6 ut6Var) {
        for (int i = 0; i < this.a.length; i++) {
            ut6Var.h[i] = true;
        }
    }

    @Override
    public final void b(s6a s6aVar) {
        this.h.c(9, (tt6) s6aVar).b();
    }

    public final void b0(defpackage.o00 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.b0(o00, boolean):void");
    }

    @Override
    public final void c(long j, long j2, go4 go4Var, MediaFormat mediaFormat) {
        if (this.V) {
            this.h.a(37).b();
        }
    }

    public final void c0(int i) {
        g99[] g99VarArr;
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            byte b = uh0Var.b;
            if (b == 1 || b == 2) {
                uh0Var.d(10, Integer.valueOf(i));
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d(m74 m74Var, int i) {
        this.Z.a(1);
        e07 e07Var = this.I;
        if (i == -1) {
            i = e07Var.c.size();
        }
        u(e07Var.a(i, m74Var.a, m74Var.b), false);
    }

    public final void d0(boolean z, gs2 gs2Var) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z) {
                for (g99 g99Var : this.a) {
                    g99Var.n();
                }
            }
        }
        if (gs2Var != null) {
            gs2Var.e();
        }
    }

    public final void e() {
        g99[] g99VarArr;
        ot9 ot9Var;
        for (g99 g99Var : this.a) {
            if (this.U) {
                ot9Var = this.T;
            } else {
                ot9Var = null;
            }
            g99Var.a.d(18, ot9Var);
            uh0 uh0Var = g99Var.c;
            if (uh0Var != null) {
                uh0Var.d(18, ot9Var);
            }
        }
    }

    public final void e0(k74 k74Var) {
        g99[] g99VarArr;
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            if (uh0Var.b == 4) {
                uh0Var.d(23, k74Var);
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(23, k74Var);
                }
            }
        }
    }

    public final boolean f() {
        if (this.P) {
            for (g99 g99Var : this.a) {
                if (g99Var.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f0(m74 m74Var) {
        this.Z.a(1);
        int i = m74Var.c;
        yia yiaVar = m74Var.b;
        ArrayList arrayList = m74Var.a;
        if (i != -1) {
            this.m0 = new q74(new ff8(arrayList, yiaVar), m74Var.c, m74Var.d);
        }
        e07 e07Var = this.I;
        ArrayList arrayList2 = e07Var.c;
        e07Var.f(0, arrayList2.size());
        u(e07Var.a(arrayList2.size(), arrayList, yiaVar), false);
    }

    public final void g() {
        g99[] g99VarArr;
        boolean z;
        uh0 uh0Var;
        if (this.P && f()) {
            for (g99 g99Var : this.a) {
                int c = g99Var.c();
                yc3 yc3Var = this.y;
                if (g99Var.g()) {
                    byte b = g99Var.d;
                    byte b2 = 1;
                    if (b != 5 && b != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (b != 5 && b != 3) {
                        b2 = 0;
                    }
                    if (z) {
                        try {
                            uh0Var = g99Var.a;
                        } catch (RuntimeException e) {
                            ncd.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        uh0Var = g99Var.c;
                        uh0Var.getClass();
                    }
                    g99Var.a(uh0Var, yc3Var);
                    try {
                        g99Var.l(z);
                    } catch (RuntimeException e2) {
                        ncd.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    g99Var.d = b2;
                }
                this.l0 -= c - g99Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void g0(boolean z) {
        this.b0 = z;
        P();
        if (this.c0 && z()) {
            V(true);
            t(false);
        }
    }

    public final void h(int i) {
        g99[] g99VarArr = this.a;
        int c = g99VarArr[i].c();
        g99 g99Var = g99VarArr[i];
        uh0 uh0Var = g99Var.a;
        yc3 yc3Var = this.y;
        g99Var.a(uh0Var, yc3Var);
        uh0 uh0Var2 = g99Var.c;
        if (uh0Var2 != null) {
            byte b = g99Var.d;
            boolean z = true;
            if (b != 5 && b != 1 && b != 3) {
                z = false;
            }
            g99Var.a(uh0Var2, yc3Var);
            g99Var.l(false);
            if (z) {
                uh0 uh0Var3 = g99Var.a;
                uh0Var2.getClass();
                uh0Var2.d(17, uh0Var3);
            }
        }
        g99Var.d = (byte) 0;
        G(i, false);
        this.l0 -= c;
    }

    public final void h0(ce8 ce8Var) {
        this.h.g(16);
        yc3 yc3Var = this.y;
        yc3Var.b(ce8Var);
        ce8 g = yc3Var.g();
        w(g, g.a, true, true);
    }

    @Override
    public final boolean handleMessage(Message message) {
        dfb dfbVar;
        int i;
        ut6 ut6Var;
        rz6 rz6Var;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = message.arg2;
                    this.Z.a(1);
                    A0(this.Q.c(this.Y.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((q74) message.obj);
                    break;
                case 4:
                    h0((ce8) message.obj);
                    break;
                case 5:
                    this.S = (jx9) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((gs2) message.obj);
                    return true;
                case 8:
                    v((tt6) message.obj);
                    break;
                case 9:
                    r((tt6) message.obj);
                    break;
                case 10:
                    this.d.i((d0c) message.obj);
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d0(z3, (gs2) message.obj);
                    break;
                case 14:
                    Y((af8) message.obj);
                    break;
                case 15:
                    Z((af8) message.obj);
                    break;
                case 16:
                    ce8 ce8Var = (ce8) message.obj;
                    w(ce8Var, ce8Var.a, true, false);
                    break;
                case 17:
                    f0((m74) message.obj);
                    break;
                case 18:
                    d((m74) message.obj, message.arg1);
                    break;
                case 19:
                    I((n74) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (yia) message.obj);
                    break;
                case 21:
                    n0((yia) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    g0(z4);
                    break;
                case 24:
                    if (message.arg1 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.R = z5;
                    break;
                case 25:
                    N();
                    V(true);
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    i0((w64) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (gs2) pair.second);
                    break;
                case 31:
                    o00 o00Var = (o00) message.obj;
                    if (message.arg1 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    b0(o00Var, z6);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    p0((vcc) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    q74 q74Var = this.W;
                    if (q74Var != null) {
                        W(q74Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    l0((ot9) message.obj);
                    break;
                case 39:
                    e0((k74) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (bs3 e) {
            s(e, e.a);
        } catch (bx7 e2) {
            boolean z7 = e2.a;
            byte b = e2.b;
            if (b == 1) {
                if (z7) {
                    i2 = 3001;
                } else {
                    i2 = 3003;
                }
            } else {
                if (b == 4) {
                    if (z7) {
                        i2 = 3002;
                    } else {
                        i2 = 3004;
                    }
                }
                s(e2, i3);
            }
            i3 = i2;
            s(e2, i3);
        } catch (d83 e3) {
            s(e3, e3.a);
        } catch (IOException e4) {
            s(e4, 2000);
        } catch (RuntimeException e5) {
            u64 u64Var = new u64(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? 1004 : 1004);
            ncd.d("ExoPlayerImplInternal", "Playback error", u64Var);
            v0(true, false);
            this.Y = this.Y.f(u64Var);
        } catch (ji0 e6) {
            s(e6, 1002);
        } catch (u64 e7) {
            e = e7;
            byte b2 = e.d;
            wt6 wt6Var = this.H;
            if (b2 == 1 && e.r == null) {
                g99 g99Var = this.a[e.f];
                ut6 ut6Var2 = wt6Var.i;
                while (true) {
                    if (ut6Var2 != null) {
                        if (g99Var.i(ut6Var2)) {
                            break;
                        }
                        ut6Var2 = ut6Var2.m;
                    } else {
                        ut6Var2 = wt6Var.d();
                        break;
                    }
                }
                if (ut6Var2 != null) {
                    e = e.a(ut6Var2.g.a);
                }
            }
            int i5 = e.f;
            byte b3 = e.d;
            dfb dfbVar2 = this.h;
            if (b3 == 1 && (rz6Var = e.r) != null && A(i5, rz6Var)) {
                this.v0 = true;
                g();
                ut6 k = wt6Var.k(i5);
                ut6 ut6Var3 = wt6Var.i;
                if (ut6Var3 != k) {
                    while (ut6Var3 != null) {
                        ut6 ut6Var4 = ut6Var3.m;
                        if (ut6Var4 == k) {
                            break;
                        }
                        ut6Var3 = ut6Var4;
                    }
                }
                wt6Var.s(ut6Var3);
                if (this.Y.e != 4) {
                    C();
                    dfbVar2.h(2);
                }
            } else {
                u64 u64Var2 = this.r0;
                if (u64Var2 != null) {
                    u64Var2.addSuppressed(e);
                    e = this.r0;
                }
                if (e.d == 1 && wt6Var.i != wt6Var.f()) {
                    ut6 ut6Var5 = wt6Var.i;
                    while (true) {
                        if (ut6Var5 != null) {
                            if (ut6Var5.g.a.equals(e.r)) {
                                break;
                            }
                            ut6Var5 = ut6Var5.m;
                        } else {
                            ut6Var5 = wt6Var.d();
                            break;
                        }
                    }
                    while (true) {
                        ut6Var = wt6Var.i;
                        if (ut6Var == ut6Var5) {
                            break;
                        }
                        wt6Var.a();
                    }
                    jte.k(ut6Var);
                    E(message.what);
                    vt6 vt6Var = ut6Var.g;
                    rz6 rz6Var2 = vt6Var.a;
                    long j = vt6Var.b;
                    dfbVar = dfbVar2;
                    this.Y = x(rz6Var2, j, vt6Var.d, j, true, 0);
                } else {
                    dfbVar = dfbVar2;
                }
                if (e.s && (this.r0 == null || (i = e.a) == 5004 || i == 5003)) {
                    ncd.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    cfb c = dfbVar.c(25, e);
                    Handler handler = dfbVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    ncd.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        }
        E(message.what);
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.i():void");
    }

    public final void i0(w64 w64Var) {
        this.t0 = w64Var;
        bqb bqbVar = this.Y.a;
        wt6 wt6Var = this.H;
        wt6Var.getClass();
        w64Var.getClass();
        if (!wt6Var.q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < wt6Var.q.size(); i++) {
                ((ut6) wt6Var.q.get(i)).i();
            }
            wt6Var.q = arrayList;
            wt6Var.m = null;
            wt6Var.p();
        }
    }

    public final void j(ut6 ut6Var, int i, boolean z, long j) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        g99 g99Var = this.a[i];
        boolean j2 = g99Var.j();
        uh0 uh0Var = g99Var.a;
        if (!j2) {
            if (ut6Var == this.H.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            e0c e0cVar = ut6Var.o;
            f99 f99Var = ((f99[]) e0cVar.c)[i];
            t74 t74Var = ((t74[]) e0cVar.d)[i];
            if (s0() && this.Y.e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.l0++;
            jr9 jr9Var = ut6Var.c[i];
            long j3 = ut6Var.p;
            rz6 rz6Var = ut6Var.g.a;
            uh0 uh0Var2 = g99Var.c;
            if (t74Var != null) {
                i2 = t74Var.length();
            } else {
                i2 = 0;
            }
            go4[] go4VarArr = new go4[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                t74Var.getClass();
                go4VarArr[i3] = t74Var.i(i3);
            }
            byte b = g99Var.d;
            yc3 yc3Var = this.y;
            if (b != 0 && b != 2 && b != 5) {
                g99Var.f = true;
                uh0Var2.getClass();
                if (uh0Var2.n == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jte.p(z6);
                uh0Var2.d = f99Var;
                uh0Var2.H = rz6Var;
                uh0Var2.n = (byte) 1;
                uh0Var2.r(z4, z2);
                uh0Var2.C(go4VarArr, jr9Var, j, j3, rz6Var);
                uh0Var2.D(j, z4, true);
                yc3Var.f(uh0Var2);
            } else {
                g99Var.e = true;
                if (uh0Var.n == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                jte.p(z5);
                uh0Var.d = f99Var;
                uh0Var.H = rz6Var;
                uh0Var.n = (byte) 1;
                uh0Var.r(z4, z2);
                uh0Var.C(go4VarArr, jr9Var, j, j3, rz6Var);
                uh0Var.D(j, z4, true);
                yc3Var.f(uh0Var);
            }
            l74 l74Var = new l74(this);
            uh0 d = g99Var.d(ut6Var);
            d.getClass();
            d.d(11, l74Var);
            if (z3 && z2) {
                g99Var.p();
            }
        }
    }

    public final void j0(int i) {
        this.g0 = i;
        bqb bqbVar = this.Y.a;
        wt6 wt6Var = this.H;
        wt6Var.g = i;
        int w = wt6Var.w(bqbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(long j, boolean[] zArr) {
        g99[] g99VarArr;
        r74 r74Var;
        long j2;
        jte.p(!z());
        ut6 d = this.H.d();
        e0c e0cVar = d.o;
        int i = 0;
        while (true) {
            g99VarArr = this.a;
            if (i >= g99VarArr.length) {
                break;
            }
            if (!e0cVar.q(i)) {
                g99VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < g99VarArr.length) {
            if (e0cVar.q(i2) && !g99VarArr[i2].i(d)) {
                r74Var = this;
                j2 = j;
                r74Var.j(d, i2, zArr[i2], j2);
            } else {
                r74Var = this;
                j2 = j;
            }
            i2++;
            this = r74Var;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        if (!z) {
            q74 q74Var = this.W;
            dfb dfbVar = this.h;
            if (q74Var != null && this.V && !dfbVar.a.hasMessages(37)) {
                this.X++;
            }
            int i = this.X;
            if (i > 0) {
                this.O.e(new bm3(this, i, (byte) 6));
            }
            this.X = 0;
            this.V = false;
            dfbVar.g(37);
            q74 q74Var2 = this.W;
            if (q74Var2 != null) {
                W(q74Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z;
        e();
    }

    public final long l(bqb bqbVar, Object obj, long j) {
        ypb ypbVar = this.w;
        int i = bqbVar.g(obj, ypbVar).c;
        aqb aqbVar = this.s;
        bqbVar.n(i, aqbVar);
        if (aqbVar.e == -9223372036854775807L || !aqbVar.a() || !aqbVar.h) {
            return -9223372036854775807L;
        }
        return hac.T(hac.E(aqbVar.f) - aqbVar.e) - (j + ypbVar.e);
    }

    public final void l0(ot9 ot9Var) {
        this.T = ot9Var;
        e();
    }

    public final Pair m(bqb bqbVar) {
        long j = 0;
        if (bqbVar.p()) {
            return Pair.create(be8.u, 0L);
        }
        int a = bqbVar.a(this.h0);
        Pair i = bqbVar.i(this.s, this.w, a, -9223372036854775807L);
        rz6 u = this.H.u(this.Y, bqbVar, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            ypb ypbVar = this.w;
            bqbVar.g(obj, ypbVar);
            if (u.c == ypbVar.e(u.b)) {
                da daVar = da.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.h0 = z;
        bqb bqbVar = this.Y.a;
        wt6 wt6Var = this.H;
        wt6Var.h = z;
        int w = wt6Var.w(bqbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(ut6 ut6Var, int i) {
        if (ut6Var == null) {
            return 0L;
        }
        if (ut6Var.e) {
            g99[] g99VarArr = this.a;
            if (g99VarArr[i].i(ut6Var)) {
                uh0 d = g99VarArr[i].d(ut6Var);
                Objects.requireNonNull(d);
                return d.y;
            }
        }
        return ut6Var.p;
    }

    public final void n0(yia yiaVar) {
        this.Z.a(1);
        e07 e07Var = this.I;
        int size = e07Var.c.size();
        if (yiaVar.c() != size) {
            yiaVar = yiaVar.a().b(0, size);
        }
        e07Var.k = yiaVar;
        u(e07Var.b(), false);
    }

    public final long o(long j) {
        ut6 ut6Var = this.H.l;
        if (ut6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.n0 - ut6Var.p));
    }

    public final void o0(int i) {
        be8 be8Var = this.Y;
        if (be8Var.e != i) {
            if (i != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i != 3 && be8Var.p) {
                be8Var = be8Var.i(false);
                this.Y = be8Var;
            }
            this.Y = be8Var.h(i);
        }
    }

    public final void p(int i) {
        be8 be8Var = this.Y;
        A0(i, be8Var.n, be8Var.m, be8Var.l);
    }

    public final void p0(vcc vccVar) {
        g99[] g99VarArr;
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            byte b = uh0Var.b;
            if (b == 2 || b == 4) {
                uh0Var.d(7, vccVar);
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(7, vccVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.w0);
    }

    public final void q0(Object obj, gs2 gs2Var) {
        g99[] g99VarArr;
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            if (uh0Var.b == 2) {
                byte b = g99Var.d;
                if (b != 5 && b != 3 && b != 1) {
                    uh0Var.d(1, obj);
                } else {
                    uh0 uh0Var2 = g99Var.c;
                    uh0Var2.getClass();
                    uh0Var2.d(1, obj);
                }
            }
        }
        int i = this.Y.e;
        if (i == 3 || i == 2) {
            this.h.h(2);
        }
        if (gs2Var != null) {
            gs2Var.e();
        }
    }

    public final void r(tt6 tt6Var) {
        wt6 wt6Var = this.H;
        ut6 ut6Var = wt6Var.l;
        if (ut6Var != null && ut6Var.a == tt6Var) {
            wt6Var.r(this.n0);
            C();
            return;
        }
        ut6 ut6Var2 = wt6Var.m;
        if (ut6Var2 != null && ut6Var2.a == tt6Var) {
            D();
        }
    }

    public final void r0(float f) {
        g99[] g99VarArr;
        this.w0 = f;
        float f2 = f * this.Q.g;
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            if (uh0Var.b == 1) {
                uh0Var.d(2, Float.valueOf(f2));
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        u64 u64Var = new u64(0, iOException, i);
        ut6 ut6Var = this.H.i;
        if (ut6Var != null) {
            u64Var = u64Var.a(ut6Var.g.a);
        }
        ncd.d("ExoPlayerImplInternal", "Playback error", u64Var);
        v0(false, false);
        this.Y = this.Y.f(u64Var);
    }

    public final boolean s0() {
        be8 be8Var = this.Y;
        if (be8Var.l && be8Var.n == 0) {
            return true;
        }
        return false;
    }

    public final void t(boolean z) {
        rz6 rz6Var;
        long d;
        ut6 ut6Var = this.H.l;
        if (ut6Var == null) {
            rz6Var = this.Y.b;
        } else {
            rz6Var = ut6Var.g.a;
        }
        boolean equals = this.Y.k.equals(rz6Var);
        if (!equals) {
            this.Y = this.Y.c(rz6Var);
        }
        be8 be8Var = this.Y;
        if (ut6Var == null) {
            d = be8Var.s;
        } else {
            d = ut6Var.d();
        }
        be8Var.q = d;
        be8 be8Var2 = this.Y;
        be8Var2.r = o(be8Var2.q);
        if ((!equals || z) && ut6Var != null && ut6Var.e) {
            y0(ut6Var.g.a, ut6Var.o);
        }
    }

    public final boolean t0(bqb bqbVar, rz6 rz6Var) {
        if (!rz6Var.c() && !bqbVar.p()) {
            int i = bqbVar.g(rz6Var.a, this.w).c;
            aqb aqbVar = this.s;
            bqbVar.n(i, aqbVar);
            if (aqbVar.a() && aqbVar.h && aqbVar.e != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(defpackage.bqb r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.u(bqb, boolean):void");
    }

    public final void u0() {
        ut6 ut6Var = this.H.i;
        if (ut6Var != null) {
            e0c e0cVar = ut6Var.o;
            int i = 0;
            while (true) {
                g99[] g99VarArr = this.a;
                if (i < g99VarArr.length) {
                    if (e0cVar.q(i)) {
                        g99VarArr[i].p();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(tt6 tt6Var) {
        ut6 ut6Var;
        r74 r74Var;
        wt6 wt6Var = this.H;
        ut6 ut6Var2 = wt6Var.l;
        yc3 yc3Var = this.y;
        if (ut6Var2 != null && ut6Var2.a == tt6Var) {
            ut6Var2.getClass();
            if (!ut6Var2.e) {
                float f = yc3Var.g().a;
                be8 be8Var = this.Y;
                ut6Var2.f(f, be8Var.a, be8Var.l);
            }
            y0(ut6Var2.g.a, ut6Var2.o);
            if (ut6Var2 == wt6Var.i) {
                Q(ut6Var2.g.b, true);
                jte.p(!z());
                k(wt6Var.d().e(), new boolean[this.a.length]);
                a0(ut6Var2);
                be8 be8Var2 = this.Y;
                rz6 rz6Var = be8Var2.b;
                long j = ut6Var2.g.b;
                r74Var = this;
                r74Var.Y = x(rz6Var, j, be8Var2.c, j, false, 5);
            } else {
                r74Var = this;
            }
            r74Var.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i < wt6Var.q.size()) {
                ut6Var = (ut6) wt6Var.q.get(i);
                if (ut6Var.a == tt6Var) {
                    break;
                }
                i++;
            } else {
                ut6Var = null;
                break;
            }
        }
        if (ut6Var != null) {
            jte.p(!ut6Var.e);
            float f2 = yc3Var.g().a;
            be8 be8Var3 = this.Y;
            ut6Var.f(f2, be8Var3.a, be8Var3.l);
            ut6 ut6Var3 = wt6Var.m;
            if (ut6Var3 != null && ut6Var3.a == tt6Var) {
                D();
            }
        }
    }

    public final void v0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.i0) {
            z3 = false;
        } else {
            z3 = true;
        }
        O(z3, false, true, false);
        this.Z.a(z2 ? 1 : 0);
        xc3 xc3Var = this.f;
        ConcurrentHashMap concurrentHashMap = xc3Var.o;
        we8 we8Var = this.L;
        wc3 wc3Var = (wc3) concurrentHashMap.get(we8Var);
        if (wc3Var != null) {
            int i = wc3Var.a - 1;
            wc3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(we8Var);
                xc3Var.d();
            }
        }
        this.Q.c(1, this.Y.l);
        o0(1);
    }

    public final void w(ce8 ce8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.Z.a(1);
            }
            this.Y = this.Y.g(ce8Var);
        }
        float f2 = ce8Var.a;
        ut6 ut6Var = this.H.i;
        while (true) {
            i = 0;
            if (ut6Var == null) {
                break;
            }
            t74[] t74VarArr = (t74[]) ut6Var.o.d;
            int length = t74VarArr.length;
            while (i < length) {
                t74 t74Var = t74VarArr[i];
                if (t74Var != null) {
                    t74Var.r(f2);
                }
                i++;
            }
            ut6Var = ut6Var.m;
        }
        g99[] g99VarArr = this.a;
        int length2 = g99VarArr.length;
        while (i < length2) {
            g99 g99Var = g99VarArr[i];
            float f3 = ce8Var.a;
            g99Var.a.E(f, f3);
            uh0 uh0Var = g99Var.c;
            if (uh0Var != null) {
                uh0Var.E(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        g99[] g99VarArr;
        yc3 yc3Var = this.y;
        yc3Var.b = false;
        tf2 tf2Var = (tf2) yc3Var.c;
        if (tf2Var.c) {
            tf2Var.a(tf2Var.h());
            tf2Var.c = false;
        }
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.c;
            uh0 uh0Var2 = g99Var.a;
            if (g99.k(uh0Var2)) {
                g99.b(uh0Var2);
            }
            if (uh0Var != null && uh0Var.n != 0) {
                g99.b(uh0Var);
            }
        }
    }

    public final be8 x(rz6 rz6Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        boolean z3;
        y79 y79Var;
        ut6 ut6Var;
        boolean z4;
        boolean z5;
        if (!this.q0 && j == this.Y.s && rz6Var.equals(this.Y.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.q0 = z2;
        P();
        be8 be8Var = this.Y;
        vzb vzbVar = be8Var.h;
        e0c e0cVar = be8Var.i;
        List list = be8Var.j;
        if (this.I.l) {
            ut6 ut6Var2 = this.H.i;
            if (ut6Var2 == null) {
                vzbVar = vzb.d;
                e0cVar = this.e;
            } else {
                vzbVar = ut6Var2.n;
                e0cVar = ut6Var2.o;
            }
            t74[] t74VarArr = (t74[]) e0cVar.d;
            ?? eo5Var = new eo5(4);
            boolean z6 = false;
            for (t74 t74Var : t74VarArr) {
                if (t74Var != null) {
                    nf7 nf7Var = t74Var.i(0).m;
                    if (nf7Var == null) {
                        eo5Var.c(new nf7(new lf7[0]));
                    } else {
                        eo5Var.c(nf7Var);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                y79Var = eo5Var.f();
            } else {
                ko5 ko5Var = mo5.b;
                y79Var = y79.e;
            }
            list = y79Var;
            if (ut6Var2 != null) {
                vt6 vt6Var = ut6Var2.g;
                if (vt6Var.d != j2) {
                    ut6Var2.g = vt6Var.a(j2);
                }
            }
            g99[] g99VarArr = this.a;
            if (!z() && (ut6Var = this.H.i) != null) {
                e0c e0cVar2 = ut6Var.o;
                int i2 = 0;
                boolean z7 = false;
                while (true) {
                    if (i2 < g99VarArr.length) {
                        if (e0cVar2.q(i2)) {
                            if (g99VarArr[i2].a.b != 1) {
                                z4 = false;
                                break;
                            } else if (((f99[]) e0cVar2.c)[i2].a != 0) {
                                z7 = true;
                            }
                        }
                        i2++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (z7 && z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 != this.k0) {
                    this.k0 = z5;
                    if (!z5 && this.Y.p) {
                        this.h.h(2);
                    }
                }
            }
        } else if (!rz6Var.equals(be8Var.b)) {
            vzbVar = vzb.d;
            e0cVar = this.e;
            ko5 ko5Var2 = mo5.b;
            list = y79.e;
        }
        e0c e0cVar3 = e0cVar;
        List list2 = list;
        vzb vzbVar2 = vzbVar;
        if (z) {
            o74 o74Var = this.Z;
            if (o74Var.d && o74Var.e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jte.f(z3);
            } else {
                o74Var.a = true;
                o74Var.d = true;
                o74Var.e = i;
            }
        }
        be8 be8Var2 = this.Y;
        return be8Var2.d(rz6Var, j, j2, j3, o(be8Var2.q), vzbVar2, e0cVar3, list2);
    }

    public final void x0() {
        boolean z;
        ut6 ut6Var = this.H.l;
        if (!this.f0 && (ut6Var == null || !ut6Var.a.f())) {
            z = false;
        } else {
            z = true;
        }
        be8 be8Var = this.Y;
        if (z != be8Var.g) {
            this.Y = be8Var.b(z);
        }
    }

    public final void y0(defpackage.rz6 r9, defpackage.e0c r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r74.y0(rz6, e0c):void");
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            wt6 wt6Var = this.H;
            if (wt6Var.i != wt6Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(List list, int i, int i2) {
        boolean z;
        boolean z2 = true;
        this.Z.a(1);
        e07 e07Var = this.I;
        e07Var.getClass();
        ArrayList arrayList = e07Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        jte.f(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((d07) arrayList.get(i3)).a.t((bt6) list.get(i3 - i));
        }
        u(e07Var.b(), false);
    }
}
