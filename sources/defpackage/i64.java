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
public final class i64 implements Handler.Callback, rr6, sac {
    public static final long x0 = g8c.i0(10000);
    public final ArrayList E;
    public final adb F;
    public final o54 G;
    public final vr6 H;
    public final ey6 I;
    public final jb3 J;
    public final short K;
    public final uc8 L;
    public final boolean M;
    public final l93 N;
    public final cdb O;
    public final boolean P;
    public final c00 Q;
    public boolean R;
    public gv9 S;
    public mr9 T;
    public boolean U;
    public boolean V;
    public h64 W;
    public int X;
    public yb8 Y;
    public f64 Z;
    public final e79[] a;
    public boolean a0;
    public final ug0[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final sc3 d;
    public boolean d0;
    public final cyb e;
    public long e0;
    public final lb3 f;
    public boolean f0;
    public int g0;
    public final cdb h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public h64 m0;
    public final igf n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final Looper r;
    public j54 r0;
    public final znb s;
    public long s0;
    public l54 t0;
    public long u0;
    public boolean v0;
    public final xnb w;
    public float w0;
    public final long x;
    public final mb3 y;

    public i64(Context context, ug0[] ug0VarArr, ug0[] ug0VarArr2, sc3 sc3Var, cyb cybVar, lb3 lb3Var, s93 s93Var, int i, boolean z, l93 l93Var, gv9 gv9Var, jb3 jb3Var, long j, boolean z2, Looper looper, adb adbVar, o54 o54Var, uc8 uc8Var, final sac sacVar, boolean z3) {
        l54 l54Var = l54.a;
        this.u0 = -9223372036854775807L;
        this.G = o54Var;
        this.d = sc3Var;
        this.e = cybVar;
        this.f = lb3Var;
        this.g0 = i;
        this.h0 = z;
        this.S = gv9Var;
        this.J = jb3Var;
        this.K = (int) j;
        this.b0 = false;
        this.M = z2;
        this.F = adbVar;
        this.L = uc8Var;
        this.t0 = l54Var;
        this.N = l93Var;
        this.w0 = 1.0f;
        this.T = mr9.b;
        this.R = z3;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.x = lb3Var.m;
        wnb wnbVar = aob.a;
        yb8 k = yb8.k(cybVar);
        this.Y = k;
        this.Z = new f64(k);
        this.b = new ug0[ug0VarArr.length];
        this.c = new boolean[ug0VarArr.length];
        sc3Var.getClass();
        this.a = new e79[ug0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < ug0VarArr.length; i2++) {
            ug0 ug0Var = ug0VarArr[i2];
            ug0Var.e = i2;
            ug0Var.f = uc8Var;
            ug0Var.h = adbVar;
            this.b[i2] = ug0Var;
            ug0 ug0Var2 = this.b[i2];
            synchronized (ug0Var2.a) {
                ug0Var2.J = sc3Var;
            }
            ug0 ug0Var3 = ug0VarArr2[i2];
            if (ug0Var3 != null) {
                ug0Var3.e = i2;
                ug0Var3.f = uc8Var;
                ug0Var3.h = adbVar;
                z4 = true;
            }
            this.a[i2] = new e79(ug0VarArr[i2], ug0Var3, i2);
        }
        this.P = z4;
        this.y = new mb3(this, adbVar);
        this.E = new ArrayList();
        this.s = new znb();
        this.w = new xnb();
        gre.p(sc3Var.a == null);
        sc3Var.a = this;
        sc3Var.b = s93Var;
        sc3Var.g = sc3Var.f;
        this.q0 = true;
        cdb a = adbVar.a(looper, null);
        this.O = a;
        this.H = new vr6(l93Var, a, new kx3(this, (byte) 12), ug0VarArr.length);
        this.I = new ey6(this, l93Var, a, uc8Var, s93Var);
        igf igfVar = new igf((byte) 2);
        this.n = igfVar;
        Looper p = igfVar.p();
        this.r = p;
        cdb a2 = adbVar.a(p, this);
        this.h = a2;
        this.Q = new c00(context, p, this);
        a2.c(35, new sac() {
            @Override
            public final void c(long j2, long j3, fm4 fm4Var, MediaFormat mediaFormat) {
                sacVar.c(j2, j3, fm4Var, mediaFormat);
                i64.this.c(j2, j3, fm4Var, mediaFormat);
            }
        }).b();
        a2.c(39, new b64(this)).b();
    }

    public static Pair S(aob aobVar, h64 h64Var, boolean z, int i, boolean z2, znb znbVar, xnb xnbVar) {
        aob aobVar2;
        int T;
        aob aobVar3 = h64Var.a;
        if (!aobVar.p()) {
            if (aobVar3.p()) {
                aobVar2 = aobVar;
            } else {
                aobVar2 = aobVar3;
            }
            try {
                Pair i2 = aobVar2.i(znbVar, xnbVar, h64Var.b, h64Var.c);
                if (!aobVar.equals(aobVar2)) {
                    if (aobVar.b(i2.first) != -1) {
                        if (aobVar2.g(i2.first, xnbVar).f && aobVar2.m(xnbVar.c, znbVar, 0L).m == aobVar2.b(i2.first)) {
                            return aobVar.i(znbVar, xnbVar, aobVar.g(i2.first, xnbVar).c, h64Var.c);
                        }
                    } else if (z && (T = T(znbVar, xnbVar, i, z2, i2.first, aobVar2, aobVar)) != -1) {
                        return aobVar.i(znbVar, xnbVar, T, -9223372036854775807L);
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

    public static int T(znb znbVar, xnb xnbVar, int i, boolean z, Object obj, aob aobVar, aob aobVar2) {
        znb znbVar2 = znbVar;
        aob aobVar3 = aobVar;
        Object obj2 = aobVar3.m(aobVar3.g(obj, xnbVar).c, znbVar, 0L).a;
        for (int i2 = 0; i2 < aobVar2.o(); i2++) {
            if (aobVar2.m(i2, znbVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = aobVar3.b(obj);
        int h = aobVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            aob aobVar4 = aobVar3;
            int d = aobVar4.d(b, xnbVar, znbVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = aobVar2.b(aobVar4.l(d));
            i4++;
            aobVar3 = aobVar4;
            b = d;
            znbVar2 = znbVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return aobVar2.f(i3, xnbVar, false).c;
    }

    public static boolean y(tr6 tr6Var) {
        ip9[] ip9VarArr;
        long g;
        if (tr6Var != null) {
            try {
                ej6 ej6Var = tr6Var.a;
                if (!tr6Var.e) {
                    ej6Var.k();
                } else {
                    for (ip9 ip9Var : tr6Var.c) {
                        if (ip9Var != null) {
                            ip9Var.b();
                        }
                    }
                }
                if (!tr6Var.e) {
                    g = 0;
                } else {
                    g = ej6Var.g();
                }
                if (g != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, rx6 rx6Var) {
        vr6 vr6Var = this.H;
        tr6 tr6Var = vr6Var.k[i];
        if (tr6Var != null && tr6Var.g.a.equals(rx6Var)) {
            return this.a[i].h(vr6Var.k[i]);
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2;
        k64[] k64VarArr;
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
        yb8 yb8Var = this.Y;
        if (yb8Var.l != z2 || yb8Var.n != i2 || yb8Var.m != i3) {
            this.Y = yb8Var.e(i3, i2, z2);
            D0(false, false);
            vr6 vr6Var = this.H;
            for (tr6 tr6Var = vr6Var.i; tr6Var != null; tr6Var = tr6Var.m) {
                for (k64 k64Var : (k64[]) tr6Var.o.d) {
                    if (k64Var != null) {
                        k64Var.h(z2);
                    }
                }
            }
            if (!s0()) {
                w0();
                B0();
                yb8 yb8Var2 = this.Y;
                if (yb8Var2.p) {
                    this.Y = yb8Var2.i(false);
                }
                vr6Var.r(this.n0);
                return;
            }
            int i4 = this.Y.e;
            cdb cdbVar = this.h;
            if (i4 == 3) {
                mb3 mb3Var = this.y;
                mb3Var.b = true;
                ((ie2) mb3Var.c).c();
                u0();
                cdbVar.h(2);
            } else if (i4 == 2) {
                cdbVar.h(2);
            }
        }
    }

    public final boolean B() {
        tr6 tr6Var = this.H.i;
        long j = tr6Var.g.e;
        if (tr6Var.e) {
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
        tr6 tr6Var = this.H.i;
        if (tr6Var != null) {
            if (tr6Var.e) {
                j = tr6Var.a.o();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                if (!tr6Var.g()) {
                    this.H.s(tr6Var);
                    g();
                    t(false);
                    C();
                }
                Q(j, true);
                if (j != this.Y.s) {
                    yb8 yb8Var = this.Y;
                    this.Y = x(yb8Var.b, j, yb8Var.c, j, true, 5);
                }
            } else {
                mb3 mb3Var = this.y;
                boolean z = z();
                ie2 ie2Var = (ie2) mb3Var.c;
                ug0 ug0Var = (ug0) mb3Var.e;
                if (ug0Var != null && !ug0Var.n() && ((!z || ((ug0) mb3Var.e).n == 2) && (((ug0) mb3Var.e).o() || (!z && !((ug0) mb3Var.e).m())))) {
                    ck6 ck6Var = (ck6) mb3Var.f;
                    ck6Var.getClass();
                    long h = ck6Var.h();
                    if (mb3Var.a) {
                        if (h < ie2Var.h()) {
                            if (ie2Var.c) {
                                ie2Var.a(ie2Var.h());
                                ie2Var.c = false;
                            }
                        } else {
                            mb3Var.a = false;
                            if (mb3Var.b) {
                                ie2Var.c();
                            }
                        }
                    }
                    ie2Var.a(h);
                    zb8 g = ck6Var.g();
                    if (!g.equals((zb8) ie2Var.e)) {
                        ie2Var.b(g);
                        ((i64) mb3Var.d).h.c(16, g).b();
                    }
                } else {
                    mb3Var.a = true;
                    if (mb3Var.b) {
                        ie2Var.c();
                    }
                }
                long h2 = mb3Var.h();
                this.n0 = h2;
                long j5 = h2 - tr6Var.p;
                long j6 = this.Y.s;
                if (!this.E.isEmpty() && !this.Y.b.c()) {
                    if (this.q0) {
                        this.q0 = false;
                    }
                    yb8 yb8Var2 = this.Y;
                    yb8Var2.a.b(yb8Var2.b.a);
                    int min = Math.min(this.p0, this.E.size());
                    if (min > 0 && this.E.get(min - 1) != null) {
                        fyb.g();
                        return;
                    } else if (min < this.E.size() && this.E.get(min) != null) {
                        fyb.g();
                        return;
                    } else {
                        this.p0 = min;
                    }
                }
                if (this.y.i()) {
                    boolean z2 = !this.Z.d;
                    yb8 yb8Var3 = this.Y;
                    this.Y = x(yb8Var3.b, j5, yb8Var3.c, j5, z2, 6);
                } else {
                    yb8 yb8Var4 = this.Y;
                    yb8Var4.s = j5;
                    yb8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.q = this.H.l.d();
            yb8 yb8Var5 = this.Y;
            yb8Var5.r = o(yb8Var5.q);
            yb8 yb8Var6 = this.Y;
            if (yb8Var6.l && yb8Var6.e == 3 && t0(yb8Var6.a, yb8Var6.b)) {
                yb8 yb8Var7 = this.Y;
                float f2 = 1.0f;
                if (yb8Var7.o.a == 1.0f) {
                    jb3 jb3Var = this.J;
                    long l = l(yb8Var7.a, yb8Var7.b.a, yb8Var7.s);
                    long j7 = this.Y.r;
                    if (jb3Var.c != -9223372036854775807L) {
                        long j8 = l - j7;
                        if (jb3Var.m == -9223372036854775807L) {
                            jb3Var.m = j8;
                            jb3Var.n = 0L;
                        } else {
                            jb3Var.m = Math.max(j8, (((float) j8) * 9.999871E-4f) + (((float) j2) * 0.999f));
                            jb3Var.n = (9.999871E-4f * ((float) Math.abs(j8 - max))) + (((float) jb3Var.n) * 0.999f);
                        }
                        if (jb3Var.l != -9223372036854775807L) {
                            j3 = 1000;
                            if (SystemClock.elapsedRealtime() - jb3Var.l < 1000) {
                                f2 = jb3Var.k;
                            }
                        } else {
                            j3 = 1000;
                        }
                        jb3Var.l = SystemClock.elapsedRealtime();
                        long j9 = (jb3Var.n * 3) + jb3Var.m;
                        if (jb3Var.h > j9) {
                            float T = (float) g8c.T(j3);
                            f = 1.0E-7f;
                            long[] jArr = {j9, jb3Var.e, jb3Var.h - (((jb3Var.k - 1.0f) * T) + ((jb3Var.i - 1.0f) * T))};
                            j4 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j4) {
                                    j4 = j10;
                                }
                            }
                            jb3Var.h = j4;
                        } else {
                            f = 1.0E-7f;
                            j4 = g8c.j(l - (Math.max(0.0f, jb3Var.k - 1.0f) / 1.0E-7f), jb3Var.h, j9);
                            jb3Var.h = j4;
                            long j11 = jb3Var.g;
                            if (j11 != -9223372036854775807L && j4 > j11) {
                                jb3Var.h = j11;
                                j4 = j11;
                            }
                        }
                        long j12 = l - j4;
                        if (Math.abs(j12) < jb3Var.a) {
                            jb3Var.k = 1.0f;
                        } else {
                            f2 = g8c.h((f * ((float) j12)) + 1.0f, jb3Var.j, jb3Var.i);
                            jb3Var.k = f2;
                        }
                    }
                    if (this.y.g().a != f2) {
                        zb8 zb8Var = new zb8(f2, this.Y.o.b);
                        this.h.g(16);
                        this.y.b(zb8Var);
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
            tr6 tr6Var = this.H.l;
            if (!tr6Var.e) {
                g = 0;
            } else {
                g = tr6Var.a.g();
            }
            long o = o(g);
            tr6 tr6Var2 = this.H.i;
            if (t0(this.Y.a, tr6Var.g.a)) {
                j = this.J.h;
            } else {
                j = -9223372036854775807L;
            }
            uc8 uc8Var = this.L;
            aob aobVar = this.Y.a;
            rx6 rx6Var = tr6Var.g.a;
            float f = this.y.g().a;
            boolean z4 = this.Y.l;
            b86 b86Var = new b86(uc8Var, aobVar, rx6Var, o, f, this.d0, j);
            c = this.f.c(b86Var);
            tr6 tr6Var3 = this.H.i;
            if (!c && tr6Var3.e && o < 500000 && this.x > 0) {
                tr6Var3.a.m(this.Y.s);
                c = this.f.c(b86Var);
            }
        }
        this.f0 = c;
        if (c) {
            tr6 tr6Var4 = this.H.l;
            tr6Var4.getClass();
            s86 s86Var = new s86();
            s86Var.a = this.n0 - tr6Var4.p;
            float f2 = this.y.g().a;
            if (f2 <= 0.0f && f2 != -3.4028235E38f) {
                z = false;
            } else {
                z = true;
            }
            gre.f(z);
            s86Var.b = f2;
            long j2 = this.e0;
            if (j2 < 0 && j2 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = true;
            }
            gre.f(z2);
            s86Var.c = j2;
            t86 t86Var = new t86(s86Var);
            if (tr6Var4.m == null) {
                z3 = true;
            }
            gre.p(z3);
            tr6Var4.a.r(t86Var);
        }
        x0();
    }

    public final void C0(aob aobVar, rx6 rx6Var, aob aobVar2, rx6 rx6Var2, long j, boolean z) {
        Object obj;
        zb8 zb8Var;
        boolean t0 = t0(aobVar, rx6Var);
        Object obj2 = rx6Var.a;
        if (!t0) {
            if (rx6Var.c()) {
                zb8Var = zb8.d;
            } else {
                zb8Var = this.Y.o;
            }
            mb3 mb3Var = this.y;
            if (!mb3Var.g().equals(zb8Var)) {
                this.h.g(16);
                mb3Var.b(zb8Var);
                w(this.Y.o, zb8Var.a, false, false);
                return;
            }
            return;
        }
        xnb xnbVar = this.w;
        int i = aobVar.g(obj2, xnbVar).c;
        znb znbVar = this.s;
        aobVar.n(i, znbVar);
        wq6 wq6Var = znbVar.i;
        String str = g8c.a;
        jb3 jb3Var = this.J;
        jb3Var.getClass();
        jb3Var.c = g8c.T(wq6Var.a);
        jb3Var.f = g8c.T(wq6Var.b);
        jb3Var.g = g8c.T(wq6Var.c);
        float f = wq6Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        jb3Var.j = f;
        float f2 = wq6Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        jb3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            jb3Var.c = -9223372036854775807L;
        }
        jb3Var.a();
        if (j != -9223372036854775807L) {
            jb3Var.d = l(aobVar, obj2, j);
            jb3Var.a();
            return;
        }
        Object obj3 = znbVar.a;
        if (!aobVar2.p()) {
            obj = aobVar2.m(aobVar2.g(rx6Var2.a, xnbVar).c, znbVar, 0L).a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z) {
            return;
        }
        jb3Var.d = -9223372036854775807L;
        jb3Var.a();
    }

    public final void D() {
        boolean z;
        boolean z2;
        vr6 vr6Var = this.H;
        vr6Var.p();
        tr6 tr6Var = vr6Var.m;
        if (tr6Var != null) {
            ej6 ej6Var = tr6Var.a;
            if ((!tr6Var.d || tr6Var.e) && !ej6Var.d()) {
                aob aobVar = this.Y.a;
                if (tr6Var.e) {
                    ej6Var.s();
                }
                for (kb3 kb3Var : this.f.o.values()) {
                    if (kb3Var.b) {
                        return;
                    }
                }
                boolean z3 = true;
                if (!tr6Var.d) {
                    long j = tr6Var.g.b;
                    tr6Var.d = true;
                    ej6Var.p(this, j);
                    return;
                }
                s86 s86Var = new s86();
                s86Var.a = this.n0 - tr6Var.p;
                float f = this.y.g().a;
                if (f <= 0.0f && f != -3.4028235E38f) {
                    z = false;
                } else {
                    z = true;
                }
                gre.f(z);
                s86Var.b = f;
                long j2 = this.e0;
                if (j2 < 0 && j2 != -9223372036854775807L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                gre.f(z2);
                s86Var.c = j2;
                t86 t86Var = new t86(s86Var);
                if (tr6Var.m != null) {
                    z3 = false;
                }
                gre.p(z3);
                ej6Var.r(t86Var);
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
        f64 f64Var = this.Z;
        yb8 yb8Var = this.Y;
        boolean z3 = f64Var.a;
        if (f64Var.b != yb8Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z3 | z;
        f64Var.a = z4;
        f64Var.b = yb8Var;
        if (z4) {
            if (!yb8Var.a.p()) {
                yb8 yb8Var2 = this.Y;
                if (yb8Var2.a.b(yb8Var2.b.a) != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Locale locale = Locale.US;
                yb8 yb8Var3 = this.Y;
                gre.o(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", yb8Var3.b.a, yb8Var3.a.getClass().getName(), Integer.valueOf(this.Y.a.o()), Integer.valueOf(i)), z2);
            }
            f64 f64Var2 = this.Z;
            y54 y54Var = this.G.b;
            y54Var.j.e(new eu3(y54Var, f64Var2, (byte) 12));
            this.Z = new f64(this.Y);
        }
    }

    public final void F(int i) {
        e79 e79Var = this.a[i];
        try {
            tr6 tr6Var = this.H.i;
            tr6Var.getClass();
            ug0 d = e79Var.d(tr6Var);
            d.getClass();
            ip9 ip9Var = d.r;
            ip9Var.getClass();
            ip9Var.b();
        } catch (IOException | RuntimeException e) {
            byte b = e79Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            cyb cybVar = this.H.i.o;
            lad.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(fm4.c(((k64[]) cybVar.d)[i].o())), e);
            cyb cybVar2 = new cyb((d79[]) ((d79[]) cybVar.c).clone(), (k64[]) ((k64[]) cybVar.d).clone(), (eyb) cybVar.e, (ko) cybVar.f);
            ((d79[]) cybVar2.c)[i] = null;
            ((k64[]) cybVar2.d)[i] = null;
            h(i);
            tr6 tr6Var2 = this.H.i;
            tr6Var2.a(cybVar2, this.Y.s, false, new boolean[tr6Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.O.e(new z54(this, i, z, (byte) 0));
        }
    }

    public final void H() {
        u(this.I.b(), true);
    }

    public final void I(e64 e64Var) {
        boolean z;
        aob b;
        this.Z.a(1);
        int i = e64Var.a;
        int i2 = e64Var.b;
        int i3 = e64Var.c;
        wga wgaVar = e64Var.d;
        ey6 ey6Var = this.I;
        ArrayList arrayList = ey6Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        ey6Var.k = wgaVar;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((dy6) arrayList.get(min)).d;
            g8c.S(i, i2, i3, arrayList);
            while (min <= max) {
                dy6 dy6Var = (dy6) arrayList.get(min);
                dy6Var.d = i4;
                i4 += dy6Var.a.o.e.o();
                min++;
            }
            b = ey6Var.b();
        } else {
            b = ey6Var.b();
        }
        u(b, false);
    }

    public final void J() {
        boolean z;
        int i;
        int i2;
        this.Z.a(1);
        O(false, false, false, true);
        lb3 lb3Var = this.f;
        ConcurrentHashMap concurrentHashMap = lb3Var.o;
        long id = Thread.currentThread().getId();
        long j = lb3Var.p;
        if (j != -1 && j != id) {
            z = false;
        } else {
            z = true;
        }
        gre.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z);
        lb3Var.p = id;
        uc8 uc8Var = this.L;
        kb3 kb3Var = (kb3) concurrentHashMap.get(uc8Var);
        if (kb3Var == null) {
            ?? obj = new Object();
            obj.a = 1;
            concurrentHashMap.put(uc8Var, obj);
        } else {
            kb3Var.a++;
        }
        kb3 kb3Var2 = (kb3) concurrentHashMap.get(uc8Var);
        kb3Var2.getClass();
        Integer num = (Integer) lb3Var.n.get(uc8Var.a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (i == -1) {
            i = 13107200;
        }
        kb3Var2.c = i;
        kb3Var2.b = false;
        if (this.Y.a.p()) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        o0(i2);
        yb8 yb8Var = this.Y;
        boolean z2 = yb8Var.l;
        A0(this.Q.c(yb8Var.e, z2), yb8Var.n, yb8Var.m, z2);
        ey6 ey6Var = this.I;
        ArrayList arrayList = ey6Var.c;
        gre.p(!ey6Var.l);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            dy6 dy6Var = (dy6) arrayList.get(i3);
            ey6Var.e(dy6Var);
            ey6Var.h.add(dy6Var);
        }
        ey6Var.l = true;
        this.h.h(2);
    }

    public final void K(vq2 vq2Var) {
        ska skaVar;
        try {
            O(true, false, true, false);
            L();
            lb3 lb3Var = this.f;
            uc8 uc8Var = this.L;
            ConcurrentHashMap concurrentHashMap = lb3Var.o;
            kb3 kb3Var = (kb3) concurrentHashMap.get(uc8Var);
            if (kb3Var != null) {
                int i = kb3Var.a - 1;
                kb3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(uc8Var);
                    lb3Var.d();
                }
            }
            if (lb3Var.o.isEmpty()) {
                lb3Var.p = -1L;
            }
            c00 c00Var = this.Q;
            c00Var.c = null;
            c00Var.a();
            c00Var.b(0);
            sc3 sc3Var = this.d;
            if (sc3Var.h != null) {
                gre.o("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(sc3Var.h));
            }
            if (Build.VERSION.SDK_INT >= 32 && (skaVar = sc3Var.i) != null) {
                skaVar.e();
                sc3Var.i = null;
            }
            sc3Var.a = null;
            sc3Var.b = null;
            o0(1);
        } finally {
            this.h.f();
            this.n.r();
            vq2Var.e();
        }
    }

    public final void L() {
        boolean z;
        for (int i = 0; i < this.a.length; i++) {
            ug0 ug0Var = this.b[i];
            synchronized (ug0Var.a) {
                ug0Var.J = null;
            }
            e79 e79Var = this.a[i];
            ug0 ug0Var2 = e79Var.a;
            boolean z2 = true;
            if (ug0Var2.n == 0) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            ug0Var2.t();
            e79Var.e = false;
            ug0 ug0Var3 = e79Var.c;
            if (ug0Var3 != null) {
                if (ug0Var3.n != 0) {
                    z2 = false;
                }
                gre.p(z2);
                ug0Var3.t();
                e79Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, wga wgaVar) {
        boolean z = true;
        this.Z.a(1);
        ey6 ey6Var = this.I;
        ey6Var.getClass();
        if (i < 0 || i > i2 || i2 > ey6Var.c.size()) {
            z = false;
        }
        gre.f(z);
        ey6Var.k = wgaVar;
        ey6Var.f(i, i2);
        u(ey6Var.b(), false);
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.N():void");
    }

    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        boolean z;
        tr6 tr6Var = this.H.i;
        if (tr6Var != null && tr6Var.g.h && this.b0) {
            z = true;
        } else {
            z = false;
        }
        this.c0 = z;
    }

    public final void Q(long j, boolean z) {
        vr6 vr6Var;
        long j2;
        e79[] e79VarArr;
        k64[] k64VarArr;
        tr6 tr6Var = this.H.i;
        if (tr6Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = tr6Var.p;
        }
        long j3 = j + j2;
        this.n0 = j3;
        ((ie2) this.y.c).a(j3);
        for (e79 e79Var : this.a) {
            long j4 = this.n0;
            ug0 d = e79Var.d(tr6Var);
            if (d != null) {
                d.D(j4, false, z);
            }
        }
        for (tr6 tr6Var2 = vr6Var.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            for (k64 k64Var : (k64[]) tr6Var2.o.d) {
                if (k64Var != null) {
                    k64Var.t();
                }
            }
        }
    }

    public final void R(aob aobVar, aob aobVar2) {
        if (aobVar.p() && aobVar2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ir2.u(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        e79[] e79VarArr;
        tr6 tr6Var;
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
        for (e79 e79Var : this.a) {
            long j5 = this.n0;
            long j6 = this.o0;
            ug0 ug0Var = e79Var.c;
            ug0 ug0Var2 = e79Var.a;
            if (e79.k(ug0Var2)) {
                j2 = ug0Var2.j(j5, j6);
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (ug0Var != null && ug0Var.n != 0) {
                j2 = Math.min(j2, ug0Var.j(j5, j6));
            }
            j3 = Math.min(j3, g8c.i0(j2));
        }
        if (this.Y.m()) {
            tr6 tr6Var2 = this.H.i;
            if (tr6Var2 != null) {
                tr6Var = tr6Var2.m;
            } else {
                tr6Var = null;
            }
            if (tr6Var != null) {
                if ((((float) g8c.T(j3)) * this.Y.o.a) + ((float) this.n0) >= ((float) tr6Var.e())) {
                    j3 = Math.min(j3, j4);
                }
            }
        }
        this.h.a.sendEmptyMessageAtTime(2, j + j3);
    }

    public final void V(boolean z) {
        rx6 rx6Var = this.H.i.g.a;
        long X = X(rx6Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            yb8 yb8Var = this.Y;
            this.Y = x(rx6Var, X, yb8Var.c, yb8Var.d, z, 5);
        }
    }

    public final void W(defpackage.h64 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.W(h64):void");
    }

    public final long X(rx6 rx6Var, long j, boolean z, boolean z2) {
        vr6 vr6Var;
        e79[] e79VarArr;
        boolean z3;
        e79[] e79VarArr2;
        byte b;
        w0();
        boolean z4 = true;
        D0(false, true);
        if (z2 || this.Y.e == 3) {
            o0(2);
        }
        tr6 tr6Var = this.H.i;
        tr6 tr6Var2 = tr6Var;
        while (tr6Var2 != null && !rx6Var.equals(tr6Var2.g.a)) {
            tr6Var2 = tr6Var2.m;
        }
        if (z || tr6Var != tr6Var2 || (tr6Var2 != null && tr6Var2.p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.u0 = -9223372036854775807L;
            if (tr6Var2 != null) {
                while (true) {
                    vr6Var = this.H;
                    if (vr6Var.i == tr6Var2) {
                        break;
                    }
                    vr6Var.a();
                }
                vr6Var.s(tr6Var2);
                tr6Var2.p = 1000000000000L;
                gre.p(!z());
                k(this.H.d().e(), new boolean[this.a.length]);
                a0(tr6Var2);
            }
        }
        g();
        if (this.U) {
            for (e79 e79Var : this.a) {
                if (e79Var.j() && ((b = e79Var.a.b) == 2 || b == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        vr6 vr6Var2 = this.H;
        if (tr6Var2 != null) {
            vr6Var2.s(tr6Var2);
            if (!tr6Var2.e) {
                tr6Var2.g = tr6Var2.g.b(j, -9223372036854775807L);
            } else if (tr6Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && tr6Var2.g.a.equals(this.Y.b)) {
                        long j2 = tr6Var2.p + j;
                        boolean z5 = true;
                        for (e79 e79Var2 : this.a) {
                            if (e79Var2.j()) {
                                ug0 d = e79Var2.d(tr6Var2);
                                if (d != null && d.I(j2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z5 &= z3;
                            }
                        }
                        if (z5) {
                            ej6 ej6Var = tr6Var2.a;
                            long j3 = this.Y.s;
                            gv9 gv9Var = gv9.e;
                            if (ej6Var.i(j3, gv9Var) == tr6Var2.a.i(j, gv9Var)) {
                                z4 = false;
                            }
                        }
                    }
                }
                j = tr6Var2.a.l(j);
                tr6Var2.a.m(j - this.x);
            }
            Q(j, z4);
            C();
        } else {
            vr6Var2.b();
            Q(j, true);
        }
        t(false);
        this.h.h(2);
        return j;
    }

    public final void Y(yc8 yc8Var) {
        yc8Var.getClass();
        cdb cdbVar = this.h;
        if (yc8Var.e == this.r) {
            synchronized (yc8Var) {
            }
            try {
                yc8Var.a.d(yc8Var.c, yc8Var.d);
                yc8Var.a(true);
                int i = this.Y.e;
                if (i != 3 && i != 2) {
                    return;
                }
                cdbVar.h(2);
                return;
            } catch (Throwable th) {
                yc8Var.a(true);
                throw th;
            }
        }
        cdbVar.c(15, yc8Var).b();
    }

    public final void Z(yc8 yc8Var) {
        Looper looper = yc8Var.e;
        if (!looper.getThread().isAlive()) {
            lad.f("TAG", "Trying to send message on a dead thread.");
            yc8Var.a(false);
            return;
        }
        this.F.a(looper, null).e(new s54(this, yc8Var));
    }

    @Override
    public final void a(sr6 sr6Var) {
        this.h.c(8, sr6Var).b();
    }

    public final void a0(tr6 tr6Var) {
        for (int i = 0; i < this.a.length; i++) {
            tr6Var.h[i] = true;
        }
    }

    @Override
    public final void b(q4a q4aVar) {
        this.h.c(9, (sr6) q4aVar).b();
    }

    public final void b0(defpackage.nz r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.b0(nz, boolean):void");
    }

    @Override
    public final void c(long j, long j2, fm4 fm4Var, MediaFormat mediaFormat) {
        if (this.V) {
            this.h.a(37).b();
        }
    }

    public final void c0(int i) {
        e79[] e79VarArr;
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            byte b = ug0Var.b;
            if (b == 1 || b == 2) {
                ug0Var.d(10, Integer.valueOf(i));
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d(d64 d64Var, int i) {
        this.Z.a(1);
        ey6 ey6Var = this.I;
        if (i == -1) {
            i = ey6Var.c.size();
        }
        u(ey6Var.a(i, d64Var.a, d64Var.b), false);
    }

    public final void d0(boolean z, vq2 vq2Var) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z) {
                for (e79 e79Var : this.a) {
                    e79Var.n();
                }
            }
        }
        if (vq2Var != null) {
            vq2Var.e();
        }
    }

    public final void e() {
        e79[] e79VarArr;
        mr9 mr9Var;
        for (e79 e79Var : this.a) {
            if (this.U) {
                mr9Var = this.T;
            } else {
                mr9Var = null;
            }
            e79Var.a.d(18, mr9Var);
            ug0 ug0Var = e79Var.c;
            if (ug0Var != null) {
                ug0Var.d(18, mr9Var);
            }
        }
    }

    public final void e0(b64 b64Var) {
        e79[] e79VarArr;
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            if (ug0Var.b == 4) {
                ug0Var.d(23, b64Var);
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(23, b64Var);
                }
            }
        }
    }

    public final boolean f() {
        if (this.P) {
            for (e79 e79Var : this.a) {
                if (e79Var.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f0(d64 d64Var) {
        this.Z.a(1);
        int i = d64Var.c;
        wga wgaVar = d64Var.b;
        ArrayList arrayList = d64Var.a;
        if (i != -1) {
            this.m0 = new h64(new dd8(arrayList, wgaVar), d64Var.c, d64Var.d);
        }
        ey6 ey6Var = this.I;
        ArrayList arrayList2 = ey6Var.c;
        ey6Var.f(0, arrayList2.size());
        u(ey6Var.a(arrayList2.size(), arrayList, wgaVar), false);
    }

    public final void g() {
        e79[] e79VarArr;
        boolean z;
        ug0 ug0Var;
        if (this.P && f()) {
            for (e79 e79Var : this.a) {
                int c = e79Var.c();
                mb3 mb3Var = this.y;
                if (e79Var.g()) {
                    byte b = e79Var.d;
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
                            ug0Var = e79Var.a;
                        } catch (RuntimeException e) {
                            lad.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        ug0Var = e79Var.c;
                        ug0Var.getClass();
                    }
                    e79Var.a(ug0Var, mb3Var);
                    try {
                        e79Var.l(z);
                    } catch (RuntimeException e2) {
                        lad.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    e79Var.d = b2;
                }
                this.l0 -= c - e79Var.c();
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
        e79[] e79VarArr = this.a;
        int c = e79VarArr[i].c();
        e79 e79Var = e79VarArr[i];
        ug0 ug0Var = e79Var.a;
        mb3 mb3Var = this.y;
        e79Var.a(ug0Var, mb3Var);
        ug0 ug0Var2 = e79Var.c;
        if (ug0Var2 != null) {
            byte b = e79Var.d;
            boolean z = true;
            if (b != 5 && b != 1 && b != 3) {
                z = false;
            }
            e79Var.a(ug0Var2, mb3Var);
            e79Var.l(false);
            if (z) {
                ug0 ug0Var3 = e79Var.a;
                ug0Var2.getClass();
                ug0Var2.d(17, ug0Var3);
            }
        }
        e79Var.d = (byte) 0;
        G(i, false);
        this.l0 -= c;
    }

    public final void h0(zb8 zb8Var) {
        this.h.g(16);
        mb3 mb3Var = this.y;
        mb3Var.b(zb8Var);
        zb8 g = mb3Var.g();
        w(g, g.a, true, true);
    }

    @Override
    public final boolean handleMessage(Message message) {
        cdb cdbVar;
        int i;
        tr6 tr6Var;
        rx6 rx6Var;
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
                    W((h64) message.obj);
                    break;
                case 4:
                    h0((zb8) message.obj);
                    break;
                case 5:
                    this.S = (gv9) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((vq2) message.obj);
                    return true;
                case 8:
                    v((sr6) message.obj);
                    break;
                case 9:
                    r((sr6) message.obj);
                    break;
                case 10:
                    this.d.i((byb) message.obj);
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
                    d0(z3, (vq2) message.obj);
                    break;
                case 14:
                    Y((yc8) message.obj);
                    break;
                case 15:
                    Z((yc8) message.obj);
                    break;
                case 16:
                    zb8 zb8Var = (zb8) message.obj;
                    w(zb8Var, zb8Var.a, true, false);
                    break;
                case 17:
                    f0((d64) message.obj);
                    break;
                case 18:
                    d((d64) message.obj, message.arg1);
                    break;
                case 19:
                    I((e64) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (wga) message.obj);
                    break;
                case 21:
                    n0((wga) message.obj);
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
                    i0((l54) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (vq2) pair.second);
                    break;
                case 31:
                    nz nzVar = (nz) message.obj;
                    if (message.arg1 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    b0(nzVar, z6);
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
                    p0((sac) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    h64 h64Var = this.W;
                    if (h64Var != null) {
                        W(h64Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    l0((mr9) message.obj);
                    break;
                case 39:
                    e0((b64) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (av7 e) {
            boolean z7 = e.a;
            byte b = e.b;
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
                s(e, i3);
            }
            i3 = i2;
            s(e, i3);
        } catch (j54 e2) {
            e = e2;
            byte b2 = e.d;
            vr6 vr6Var = this.H;
            if (b2 == 1 && e.r == null) {
                e79 e79Var = this.a[e.f];
                tr6 tr6Var2 = vr6Var.i;
                while (true) {
                    if (tr6Var2 != null) {
                        if (e79Var.i(tr6Var2)) {
                            break;
                        }
                        tr6Var2 = tr6Var2.m;
                    } else {
                        tr6Var2 = vr6Var.d();
                        break;
                    }
                }
                if (tr6Var2 != null) {
                    e = e.a(tr6Var2.g.a);
                }
            }
            int i5 = e.f;
            byte b3 = e.d;
            cdb cdbVar2 = this.h;
            if (b3 == 1 && (rx6Var = e.r) != null && A(i5, rx6Var)) {
                this.v0 = true;
                g();
                tr6 k = vr6Var.k(i5);
                tr6 tr6Var3 = vr6Var.i;
                if (tr6Var3 != k) {
                    while (tr6Var3 != null) {
                        tr6 tr6Var4 = tr6Var3.m;
                        if (tr6Var4 == k) {
                            break;
                        }
                        tr6Var3 = tr6Var4;
                    }
                }
                vr6Var.s(tr6Var3);
                if (this.Y.e != 4) {
                    C();
                    cdbVar2.h(2);
                }
            } else {
                j54 j54Var = this.r0;
                if (j54Var != null) {
                    j54Var.addSuppressed(e);
                    e = this.r0;
                }
                if (e.d == 1 && vr6Var.i != vr6Var.f()) {
                    tr6 tr6Var5 = vr6Var.i;
                    while (true) {
                        if (tr6Var5 != null) {
                            if (tr6Var5.g.a.equals(e.r)) {
                                break;
                            }
                            tr6Var5 = tr6Var5.m;
                        } else {
                            tr6Var5 = vr6Var.d();
                            break;
                        }
                    }
                    while (true) {
                        tr6Var = vr6Var.i;
                        if (tr6Var == tr6Var5) {
                            break;
                        }
                        vr6Var.a();
                    }
                    gre.k(tr6Var);
                    E(message.what);
                    ur6 ur6Var = tr6Var.g;
                    rx6 rx6Var2 = ur6Var.a;
                    long j = ur6Var.b;
                    cdbVar = cdbVar2;
                    this.Y = x(rx6Var2, j, ur6Var.d, j, true, 0);
                } else {
                    cdbVar = cdbVar2;
                }
                if (e.s && (this.r0 == null || (i = e.a) == 5004 || i == 5003)) {
                    lad.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    bdb c = cdbVar.c(25, e);
                    Handler handler = cdbVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    lad.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (RuntimeException e3) {
            j54 j54Var2 = new j54(2, e3, ((e3 instanceof IllegalStateException) || (e3 instanceof IllegalArgumentException)) ? 1004 : 1004);
            lad.d("ExoPlayerImplInternal", "Playback error", j54Var2);
            v0(true, false);
            this.Y = this.Y.f(j54Var2);
        } catch (jh0 e4) {
            s(e4, 1002);
        } catch (r63 e5) {
            s(e5, e5.a);
        } catch (rq3 e6) {
            s(e6, e6.a);
        } catch (IOException e7) {
            s(e7, 2000);
        }
        E(message.what);
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.i():void");
    }

    public final void i0(l54 l54Var) {
        this.t0 = l54Var;
        aob aobVar = this.Y.a;
        vr6 vr6Var = this.H;
        vr6Var.getClass();
        l54Var.getClass();
        if (!vr6Var.q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < vr6Var.q.size(); i++) {
                ((tr6) vr6Var.q.get(i)).i();
            }
            vr6Var.q = arrayList;
            vr6Var.m = null;
            vr6Var.p();
        }
    }

    public final void j(tr6 tr6Var, int i, boolean z, long j) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        e79 e79Var = this.a[i];
        boolean j2 = e79Var.j();
        ug0 ug0Var = e79Var.a;
        if (!j2) {
            if (tr6Var == this.H.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            cyb cybVar = tr6Var.o;
            d79 d79Var = ((d79[]) cybVar.c)[i];
            k64 k64Var = ((k64[]) cybVar.d)[i];
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
            ip9 ip9Var = tr6Var.c[i];
            long j3 = tr6Var.p;
            rx6 rx6Var = tr6Var.g.a;
            ug0 ug0Var2 = e79Var.c;
            if (k64Var != null) {
                i2 = k64Var.length();
            } else {
                i2 = 0;
            }
            fm4[] fm4VarArr = new fm4[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                k64Var.getClass();
                fm4VarArr[i3] = k64Var.i(i3);
            }
            byte b = e79Var.d;
            mb3 mb3Var = this.y;
            if (b != 0 && b != 2 && b != 5) {
                e79Var.f = true;
                ug0Var2.getClass();
                if (ug0Var2.n == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                gre.p(z6);
                ug0Var2.d = d79Var;
                ug0Var2.H = rx6Var;
                ug0Var2.n = (byte) 1;
                ug0Var2.r(z4, z2);
                ug0Var2.C(fm4VarArr, ip9Var, j, j3, rx6Var);
                ug0Var2.D(j, z4, true);
                mb3Var.f(ug0Var2);
            } else {
                e79Var.e = true;
                if (ug0Var.n == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                gre.p(z5);
                ug0Var.d = d79Var;
                ug0Var.H = rx6Var;
                ug0Var.n = (byte) 1;
                ug0Var.r(z4, z2);
                ug0Var.C(fm4VarArr, ip9Var, j, j3, rx6Var);
                ug0Var.D(j, z4, true);
                mb3Var.f(ug0Var);
            }
            c64 c64Var = new c64(this);
            ug0 d = e79Var.d(tr6Var);
            d.getClass();
            d.d(11, c64Var);
            if (z3 && z2) {
                e79Var.p();
            }
        }
    }

    public final void j0(int i) {
        this.g0 = i;
        aob aobVar = this.Y.a;
        vr6 vr6Var = this.H;
        vr6Var.g = i;
        int w = vr6Var.w(aobVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(long j, boolean[] zArr) {
        e79[] e79VarArr;
        i64 i64Var;
        long j2;
        gre.p(!z());
        tr6 d = this.H.d();
        cyb cybVar = d.o;
        int i = 0;
        while (true) {
            e79VarArr = this.a;
            if (i >= e79VarArr.length) {
                break;
            }
            if (!cybVar.q(i)) {
                e79VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < e79VarArr.length) {
            if (cybVar.q(i2) && !e79VarArr[i2].i(d)) {
                i64Var = this;
                j2 = j;
                i64Var.j(d, i2, zArr[i2], j2);
            } else {
                i64Var = this;
                j2 = j;
            }
            i2++;
            this = i64Var;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        if (!z) {
            h64 h64Var = this.W;
            cdb cdbVar = this.h;
            if (h64Var != null && this.V && !cdbVar.a.hasMessages(37)) {
                this.X++;
            }
            int i = this.X;
            if (i > 0) {
                this.O.e(new sm3(this, i, (byte) 5));
            }
            this.X = 0;
            this.V = false;
            cdbVar.g(37);
            h64 h64Var2 = this.W;
            if (h64Var2 != null) {
                W(h64Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z;
        e();
    }

    public final long l(aob aobVar, Object obj, long j) {
        xnb xnbVar = this.w;
        int i = aobVar.g(obj, xnbVar).c;
        znb znbVar = this.s;
        aobVar.n(i, znbVar);
        if (znbVar.e == -9223372036854775807L || !znbVar.a() || !znbVar.h) {
            return -9223372036854775807L;
        }
        return g8c.T(g8c.E(znbVar.f) - znbVar.e) - (j + xnbVar.e);
    }

    public final void l0(mr9 mr9Var) {
        this.T = mr9Var;
        e();
    }

    public final Pair m(aob aobVar) {
        long j = 0;
        if (aobVar.p()) {
            return Pair.create(yb8.u, 0L);
        }
        int a = aobVar.a(this.h0);
        Pair i = aobVar.i(this.s, this.w, a, -9223372036854775807L);
        rx6 u = this.H.u(this.Y, aobVar, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            xnb xnbVar = this.w;
            aobVar.g(obj, xnbVar);
            if (u.c == xnbVar.e(u.b)) {
                da daVar = da.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.h0 = z;
        aob aobVar = this.Y.a;
        vr6 vr6Var = this.H;
        vr6Var.h = z;
        int w = vr6Var.w(aobVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(tr6 tr6Var, int i) {
        if (tr6Var == null) {
            return 0L;
        }
        if (tr6Var.e) {
            e79[] e79VarArr = this.a;
            if (e79VarArr[i].i(tr6Var)) {
                ug0 d = e79VarArr[i].d(tr6Var);
                Objects.requireNonNull(d);
                return d.y;
            }
        }
        return tr6Var.p;
    }

    public final void n0(wga wgaVar) {
        this.Z.a(1);
        ey6 ey6Var = this.I;
        int size = ey6Var.c.size();
        if (wgaVar.c() != size) {
            wgaVar = wgaVar.a().b(0, size);
        }
        ey6Var.k = wgaVar;
        u(ey6Var.b(), false);
    }

    public final long o(long j) {
        tr6 tr6Var = this.H.l;
        if (tr6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.n0 - tr6Var.p));
    }

    public final void o0(int i) {
        yb8 yb8Var = this.Y;
        if (yb8Var.e != i) {
            if (i != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i != 3 && yb8Var.p) {
                yb8Var = yb8Var.i(false);
                this.Y = yb8Var;
            }
            this.Y = yb8Var.h(i);
        }
    }

    public final void p(int i) {
        yb8 yb8Var = this.Y;
        A0(i, yb8Var.n, yb8Var.m, yb8Var.l);
    }

    public final void p0(sac sacVar) {
        e79[] e79VarArr;
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            byte b = ug0Var.b;
            if (b == 2 || b == 4) {
                ug0Var.d(7, sacVar);
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(7, sacVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.w0);
    }

    public final void q0(Object obj, vq2 vq2Var) {
        e79[] e79VarArr;
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            if (ug0Var.b == 2) {
                byte b = e79Var.d;
                if (b != 5 && b != 3 && b != 1) {
                    ug0Var.d(1, obj);
                } else {
                    ug0 ug0Var2 = e79Var.c;
                    ug0Var2.getClass();
                    ug0Var2.d(1, obj);
                }
            }
        }
        int i = this.Y.e;
        if (i == 3 || i == 2) {
            this.h.h(2);
        }
        if (vq2Var != null) {
            vq2Var.e();
        }
    }

    public final void r(sr6 sr6Var) {
        vr6 vr6Var = this.H;
        tr6 tr6Var = vr6Var.l;
        if (tr6Var != null && tr6Var.a == sr6Var) {
            vr6Var.r(this.n0);
            C();
            return;
        }
        tr6 tr6Var2 = vr6Var.m;
        if (tr6Var2 != null && tr6Var2.a == sr6Var) {
            D();
        }
    }

    public final void r0(float f) {
        e79[] e79VarArr;
        this.w0 = f;
        float f2 = f * this.Q.g;
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            if (ug0Var.b == 1) {
                ug0Var.d(2, Float.valueOf(f2));
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        j54 j54Var = new j54(0, iOException, i);
        tr6 tr6Var = this.H.i;
        if (tr6Var != null) {
            j54Var = j54Var.a(tr6Var.g.a);
        }
        lad.d("ExoPlayerImplInternal", "Playback error", j54Var);
        v0(false, false);
        this.Y = this.Y.f(j54Var);
    }

    public final boolean s0() {
        yb8 yb8Var = this.Y;
        if (yb8Var.l && yb8Var.n == 0) {
            return true;
        }
        return false;
    }

    public final void t(boolean z) {
        rx6 rx6Var;
        long d;
        tr6 tr6Var = this.H.l;
        if (tr6Var == null) {
            rx6Var = this.Y.b;
        } else {
            rx6Var = tr6Var.g.a;
        }
        boolean equals = this.Y.k.equals(rx6Var);
        if (!equals) {
            this.Y = this.Y.c(rx6Var);
        }
        yb8 yb8Var = this.Y;
        if (tr6Var == null) {
            d = yb8Var.s;
        } else {
            d = tr6Var.d();
        }
        yb8Var.q = d;
        yb8 yb8Var2 = this.Y;
        yb8Var2.r = o(yb8Var2.q);
        if ((!equals || z) && tr6Var != null && tr6Var.e) {
            y0(tr6Var.g.a, tr6Var.o);
        }
    }

    public final boolean t0(aob aobVar, rx6 rx6Var) {
        if (!rx6Var.c() && !aobVar.p()) {
            int i = aobVar.g(rx6Var.a, this.w).c;
            znb znbVar = this.s;
            aobVar.n(i, znbVar);
            if (znbVar.a() && znbVar.h && znbVar.e != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(defpackage.aob r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.u(aob, boolean):void");
    }

    public final void u0() {
        tr6 tr6Var = this.H.i;
        if (tr6Var != null) {
            cyb cybVar = tr6Var.o;
            int i = 0;
            while (true) {
                e79[] e79VarArr = this.a;
                if (i < e79VarArr.length) {
                    if (cybVar.q(i)) {
                        e79VarArr[i].p();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(sr6 sr6Var) {
        tr6 tr6Var;
        i64 i64Var;
        vr6 vr6Var = this.H;
        tr6 tr6Var2 = vr6Var.l;
        mb3 mb3Var = this.y;
        if (tr6Var2 != null && tr6Var2.a == sr6Var) {
            tr6Var2.getClass();
            if (!tr6Var2.e) {
                float f = mb3Var.g().a;
                yb8 yb8Var = this.Y;
                tr6Var2.f(f, yb8Var.a, yb8Var.l);
            }
            y0(tr6Var2.g.a, tr6Var2.o);
            if (tr6Var2 == vr6Var.i) {
                Q(tr6Var2.g.b, true);
                gre.p(!z());
                k(vr6Var.d().e(), new boolean[this.a.length]);
                a0(tr6Var2);
                yb8 yb8Var2 = this.Y;
                rx6 rx6Var = yb8Var2.b;
                long j = tr6Var2.g.b;
                i64Var = this;
                i64Var.Y = x(rx6Var, j, yb8Var2.c, j, false, 5);
            } else {
                i64Var = this;
            }
            i64Var.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i < vr6Var.q.size()) {
                tr6Var = (tr6) vr6Var.q.get(i);
                if (tr6Var.a == sr6Var) {
                    break;
                }
                i++;
            } else {
                tr6Var = null;
                break;
            }
        }
        if (tr6Var != null) {
            gre.p(!tr6Var.e);
            float f2 = mb3Var.g().a;
            yb8 yb8Var3 = this.Y;
            tr6Var.f(f2, yb8Var3.a, yb8Var3.l);
            tr6 tr6Var3 = vr6Var.m;
            if (tr6Var3 != null && tr6Var3.a == sr6Var) {
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
        lb3 lb3Var = this.f;
        ConcurrentHashMap concurrentHashMap = lb3Var.o;
        uc8 uc8Var = this.L;
        kb3 kb3Var = (kb3) concurrentHashMap.get(uc8Var);
        if (kb3Var != null) {
            int i = kb3Var.a - 1;
            kb3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(uc8Var);
                lb3Var.d();
            }
        }
        this.Q.c(1, this.Y.l);
        o0(1);
    }

    public final void w(zb8 zb8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.Z.a(1);
            }
            this.Y = this.Y.g(zb8Var);
        }
        float f2 = zb8Var.a;
        tr6 tr6Var = this.H.i;
        while (true) {
            i = 0;
            if (tr6Var == null) {
                break;
            }
            k64[] k64VarArr = (k64[]) tr6Var.o.d;
            int length = k64VarArr.length;
            while (i < length) {
                k64 k64Var = k64VarArr[i];
                if (k64Var != null) {
                    k64Var.r(f2);
                }
                i++;
            }
            tr6Var = tr6Var.m;
        }
        e79[] e79VarArr = this.a;
        int length2 = e79VarArr.length;
        while (i < length2) {
            e79 e79Var = e79VarArr[i];
            float f3 = zb8Var.a;
            e79Var.a.E(f, f3);
            ug0 ug0Var = e79Var.c;
            if (ug0Var != null) {
                ug0Var.E(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        e79[] e79VarArr;
        mb3 mb3Var = this.y;
        mb3Var.b = false;
        ie2 ie2Var = (ie2) mb3Var.c;
        if (ie2Var.c) {
            ie2Var.a(ie2Var.h());
            ie2Var.c = false;
        }
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.c;
            ug0 ug0Var2 = e79Var.a;
            if (e79.k(ug0Var2)) {
                e79.b(ug0Var2);
            }
            if (ug0Var != null && ug0Var.n != 0) {
                e79.b(ug0Var);
            }
        }
    }

    public final yb8 x(rx6 rx6Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        boolean z3;
        w59 w59Var;
        tr6 tr6Var;
        boolean z4;
        boolean z5;
        if (!this.q0 && j == this.Y.s && rx6Var.equals(this.Y.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.q0 = z2;
        P();
        yb8 yb8Var = this.Y;
        txb txbVar = yb8Var.h;
        cyb cybVar = yb8Var.i;
        List list = yb8Var.j;
        if (this.I.l) {
            tr6 tr6Var2 = this.H.i;
            if (tr6Var2 == null) {
                txbVar = txb.d;
                cybVar = this.e;
            } else {
                txbVar = tr6Var2.n;
                cybVar = tr6Var2.o;
            }
            k64[] k64VarArr = (k64[]) cybVar.d;
            ?? em5Var = new em5(4);
            boolean z6 = false;
            for (k64 k64Var : k64VarArr) {
                if (k64Var != null) {
                    ld7 ld7Var = k64Var.i(0).m;
                    if (ld7Var == null) {
                        em5Var.c(new ld7(new jd7[0]));
                    } else {
                        em5Var.c(ld7Var);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                w59Var = em5Var.f();
            } else {
                km5 km5Var = mm5.b;
                w59Var = w59.e;
            }
            list = w59Var;
            if (tr6Var2 != null) {
                ur6 ur6Var = tr6Var2.g;
                if (ur6Var.d != j2) {
                    tr6Var2.g = ur6Var.a(j2);
                }
            }
            e79[] e79VarArr = this.a;
            if (!z() && (tr6Var = this.H.i) != null) {
                cyb cybVar2 = tr6Var.o;
                int i2 = 0;
                boolean z7 = false;
                while (true) {
                    if (i2 < e79VarArr.length) {
                        if (cybVar2.q(i2)) {
                            if (e79VarArr[i2].a.b != 1) {
                                z4 = false;
                                break;
                            } else if (((d79[]) cybVar2.c)[i2].a != 0) {
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
        } else if (!rx6Var.equals(yb8Var.b)) {
            txbVar = txb.d;
            cybVar = this.e;
            km5 km5Var2 = mm5.b;
            list = w59.e;
        }
        cyb cybVar3 = cybVar;
        List list2 = list;
        txb txbVar2 = txbVar;
        if (z) {
            f64 f64Var = this.Z;
            if (f64Var.d && f64Var.e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gre.f(z3);
            } else {
                f64Var.a = true;
                f64Var.d = true;
                f64Var.e = i;
            }
        }
        yb8 yb8Var2 = this.Y;
        return yb8Var2.d(rx6Var, j, j2, j3, o(yb8Var2.q), txbVar2, cybVar3, list2);
    }

    public final void x0() {
        boolean z;
        tr6 tr6Var = this.H.l;
        if (!this.f0 && (tr6Var == null || !tr6Var.a.d())) {
            z = false;
        } else {
            z = true;
        }
        yb8 yb8Var = this.Y;
        if (z != yb8Var.g) {
            this.Y = yb8Var.b(z);
        }
    }

    public final void y0(defpackage.rx6 r9, defpackage.cyb r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i64.y0(rx6, cyb):void");
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            vr6 vr6Var = this.H;
            if (vr6Var.i != vr6Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(List list, int i, int i2) {
        boolean z;
        boolean z2 = true;
        this.Z.a(1);
        ey6 ey6Var = this.I;
        ey6Var.getClass();
        ArrayList arrayList = ey6Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        gre.f(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((dy6) arrayList.get(i3)).a.t((br6) list.get(i3 - i));
        }
        u(ey6Var.b(), false);
    }
}
