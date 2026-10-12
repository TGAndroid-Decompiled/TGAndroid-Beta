package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import di.x8;
import e9.x1;
import fi.q3;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class r0 implements Handler.Callback, u2.d0, l1, a3.y {
    public static final long f11148w0 = e2.m0.h0(10000);
    public final ArrayList E;
    public final e2.g0 F;
    public final w G;
    public final z0 H;
    public final j1 I;
    public final g J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.e P;
    public final boolean Q;
    public t1 R;
    public s1 S;
    public boolean T;
    public boolean U;
    public q0 V;
    public int W;
    public k1 X;
    public o0 Y;
    public boolean Z;
    public final r1[] f11149a;
    public boolean f11150a0;
    public final b[] f11151b;
    public boolean f11152b0;
    public final boolean[] f11153c;
    public boolean f11154c0;
    public final x2.s d;
    public long f11155d0;
    public final x2.t e;
    public boolean f11156e0;
    public final t0 f11157f;
    public int f11158f0;
    public boolean f11159g0;
    public final y2.c h;
    public boolean f11160h0;
    public boolean f11161i0;
    public boolean f11162j0;
    public int f11163k0;
    public q0 f11164l0;
    public long m0;
    public final e2.i0 f11165n;
    public long f11166n0;
    public int f11167o0;
    public boolean f11168p0;
    public m f11169q0;
    public final j6.l f11170r;
    public long f11171r0;
    public final Looper f11172s;
    public p f11173s0;
    public long f11174t0;
    public boolean f11175u0;
    public final b2.o1 v;
    public float f11176v0;
    public final b2.m1 f11177w;
    public final long f11178x;
    public final j f11179y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, x2.s sVar, x2.t tVar, t0 t0Var, y2.c cVar, int i10, boolean z10, j2.f fVar, t1 t1Var, g gVar, long j10, Looper looper, e2.g0 g0Var, w wVar, j2.k kVar, final a3.y yVar, boolean z11) {
        p pVar = p.f11126a;
        this.f11174t0 = -9223372036854775807L;
        this.G = wVar;
        this.d = sVar;
        this.e = tVar;
        this.f11157f = t0Var;
        this.h = cVar;
        this.f11158f0 = i10;
        this.f11159g0 = z10;
        this.R = t1Var;
        this.J = gVar;
        this.K = j10;
        this.f11150a0 = false;
        this.F = g0Var;
        this.L = kVar;
        this.f11173s0 = pVar;
        this.M = fVar;
        this.f11176v0 = 1.0f;
        this.S = s1.f11188b;
        this.Q = z11;
        this.f11171r0 = -9223372036854775807L;
        this.f11155d0 = -9223372036854775807L;
        this.f11178x = ((i) t0Var).f11035n;
        b2.l1 l1Var = b2.p1.f2281a;
        k1 k10 = k1.k(tVar);
        this.X = k10;
        this.Y = new o0(k10);
        this.f11151b = new b[bVarArr.length];
        this.f11153c = new boolean[bVarArr.length];
        x2.n nVar = (x2.n) sVar;
        nVar.getClass();
        this.f11149a = new r1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f10918f = kVar;
            bVar.h = g0Var;
            this.f11151b[i11] = bVar;
            b bVar2 = this.f11151b[i11];
            synchronized (bVar2.f10915a) {
                bVar2.H = nVar;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f10918f = kVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f11149a[i11] = new r1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.f11179y = new j(this, g0Var);
        this.E = new ArrayList();
        this.v = new b2.o1();
        this.f11177w = new b2.m1();
        u6.p(sVar.f47789a == null);
        sVar.f47789a = this;
        sVar.f47790b = cVar;
        this.f11168p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new z0(fVar, a2, new f1.a(this, 10));
        this.I = new j1(this, fVar, a2, kVar);
        j6.l lVar = new j6.l(7);
        this.f11170r = lVar;
        Looper d = lVar.d();
        this.f11172s = d;
        e2.i0 a10 = g0Var.a(d, this);
        this.f11165n = a10;
        this.P = new c2.e(context, d, this);
        a10.b(35, new a3.y() {
            @Override
            public final void a(long j11, long j12, b2.x xVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                yVar.a(j11, j12, xVar, mediaFormat);
                r0Var.a(j11, j12, xVar, mediaFormat);
            }
        }).b();
        a10.b(39, new k0(this)).b();
    }

    public static Pair T(b2.p1 p1Var, q0 q0Var, boolean z10, int i10, boolean z11, b2.o1 o1Var, b2.m1 m1Var) {
        b2.p1 p1Var2;
        int U;
        b2.p1 p1Var3 = q0Var.f11139a;
        if (!p1Var.p()) {
            if (p1Var3.p()) {
                p1Var2 = p1Var;
            } else {
                p1Var2 = p1Var3;
            }
            try {
                Pair i11 = p1Var2.i(o1Var, m1Var, q0Var.f11140b, q0Var.f11141c);
                if (!p1Var.equals(p1Var2)) {
                    if (p1Var.b(i11.first) != -1) {
                        if (p1Var2.g(i11.first, m1Var).f2214f && p1Var2.m(m1Var.f2213c, o1Var, 0L).f2268n == p1Var2.b(i11.first)) {
                            return p1Var.i(o1Var, m1Var, p1Var.g(i11.first, m1Var).f2213c, q0Var.f11141c);
                        }
                    } else if (z10 && (U = U(o1Var, m1Var, i10, z11, i11.first, p1Var2, p1Var)) != -1) {
                        return p1Var.i(o1Var, m1Var, U, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i11;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int U(b2.o1 o1Var, b2.m1 m1Var, int i10, boolean z10, Object obj, b2.p1 p1Var, b2.p1 p1Var2) {
        b2.o1 o1Var2 = o1Var;
        b2.p1 p1Var3 = p1Var;
        Object obj2 = p1Var3.m(p1Var3.g(obj, m1Var).f2213c, o1Var, 0L).f2258a;
        for (int i11 = 0; i11 < p1Var2.o(); i11++) {
            if (p1Var2.m(i11, o1Var, 0L).f2258a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = p1Var3.b(obj);
        int h = p1Var3.h();
        int i12 = -1;
        int i13 = 0;
        while (i13 < h && i12 == -1) {
            b2.p1 p1Var4 = p1Var3;
            int d = p1Var4.d(b10, m1Var, o1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i12 = p1Var2.b(p1Var4.l(d));
            i13++;
            p1Var3 = p1Var4;
            b10 = d;
            o1Var2 = o1Var;
        }
        if (i12 == -1) {
            return -1;
        }
        return p1Var2.f(i12, m1Var, false).f2213c;
    }

    public static void f(n1 n1Var) {
        try {
            synchronized (n1Var) {
                synchronized (n1Var) {
                }
                n1Var.f11095a.c(n1Var.f11097c, n1Var.d);
                return;
            }
            n1Var.f11095a.c(n1Var.f11097c, n1Var.d);
            return;
        } finally {
            n1Var.a(true);
        }
    }

    public static boolean z(x0 x0Var) {
        u2.d1[] d1VarArr;
        long b10;
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.f11213a;
                if (!x0Var.e) {
                    r12.g();
                } else {
                    for (u2.d1 d1Var : x0Var.f11215c) {
                        if (d1Var != null) {
                            d1Var.d();
                        }
                    }
                }
                if (!x0Var.e) {
                    b10 = 0;
                } else {
                    b10 = r12.b();
                }
                if (b10 != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i10, u2.g0 g0Var) {
        boolean z10;
        boolean z11;
        z0 z0Var = this.H;
        x0 x0Var = z0Var.f11246k;
        if (x0Var != null && x0Var.f11217g.f11228a.equals(g0Var)) {
            r1 r1Var = this.f11149a[i10];
            x0 x0Var2 = z0Var.f11246k;
            int i11 = r1Var.d;
            if ((i11 == 2 || i11 == 4) && r1Var.d(x0Var2) == r1Var.f11180a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r1Var.d == 3 && r1Var.d(x0Var2) == r1Var.f11182c) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.A0():void");
    }

    public final boolean B() {
        x0 x0Var = this.H.f11244i;
        long j10 = x0Var.f11217g.f11231f;
        if (x0Var.e) {
            if (j10 == -9223372036854775807L || this.X.f11080s < j10 || !s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        x2.p[] pVarArr;
        if (z10 && i10 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.T;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            if (z12) {
                i11 = 4;
            } else {
                i11 = 0;
            }
        }
        k1 k1Var = this.X;
        if (k1Var.f11073l != z11 || k1Var.f11075n != i11 || k1Var.f11074m != i12) {
            this.X = k1Var.e(i12, i11, z11);
            E0(false, false);
            z0 z0Var = this.H;
            for (x0 x0Var = z0Var.f11244i; x0Var != null; x0Var = x0Var.f11222m) {
                for (x2.p pVar : x0Var.f11224o.f47794c) {
                    if (pVar != null) {
                        pVar.e(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                k1 k1Var2 = this.X;
                if (k1Var2.f11077p) {
                    this.X = k1Var2.i(false);
                }
                z0Var.m(this.m0);
                return;
            }
            int i13 = this.X.e;
            e2.i0 i0Var = this.f11165n;
            if (i13 == 3) {
                j jVar = this.f11179y;
                jVar.f11048f = true;
                jVar.f11045a.d();
                u0();
                i0Var.f(2);
            } else if (i13 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final void C() {
        long b10;
        long j10;
        boolean b11;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!z(this.H.f11247l)) {
            b11 = false;
        } else {
            x0 x0Var = this.H.f11247l;
            if (!x0Var.e) {
                b10 = 0;
            } else {
                b10 = x0Var.f11213a.b();
            }
            long o10 = o(b10);
            x0 x0Var2 = this.H.f11244i;
            if (t0(this.X.f11065a, x0Var.f11217g.f11228a)) {
                j10 = this.J.h;
            } else {
                j10 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.p1 p1Var = this.X.f11065a;
            u2.g0 g0Var = x0Var.f11217g.f11228a;
            float f7 = this.f11179y.h().f2073a;
            boolean z13 = this.X.f11073l;
            s0 s0Var = new s0(kVar, p1Var, g0Var, o10, f7, this.f11154c0, j10);
            b11 = ((i) this.f11157f).b(s0Var);
            x0 x0Var3 = this.H.f11244i;
            if (!b11 && x0Var3.e && o10 < 500000 && this.f11178x > 0) {
                x0Var3.f11213a.i(this.X.f11080s);
                b11 = ((i) this.f11157f).b(s0Var);
            }
        }
        this.f11156e0 = b11;
        if (b11) {
            x0 x0Var4 = this.H.f11247l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.f11198a = this.m0 - x0Var4.f11225p;
            float f10 = this.f11179y.h().f2073a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            u6.g(z10);
            u0Var.f11199b = f10;
            long j11 = this.f11155d0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            u0Var.f11200c = j11;
            v0 v0Var = new v0(u0Var);
            if (x0Var4.f11222m == null) {
                z12 = true;
            }
            u6.p(z12);
            x0Var4.f11213a.p(v0Var);
        }
        x0();
    }

    public final void C0() {
        long j10;
        boolean z10;
        long j11;
        long max;
        long j12;
        float f7;
        x0 x0Var = this.H.f11244i;
        if (x0Var != null) {
            if (x0Var.e) {
                j10 = x0Var.f11213a.o();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!x0Var.g()) {
                    this.H.n(x0Var);
                    t(false);
                    C();
                }
                R(j10, true);
                if (j10 != this.X.f11080s) {
                    k1 k1Var = this.X;
                    this.X = x(k1Var.f11066b, j10, k1Var.f11067c, j10, true, 5);
                }
            } else {
                j jVar = this.f11179y;
                if (x0Var != this.H.f11245j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1 u1Var = jVar.f11045a;
                b bVar = jVar.f11047c;
                if (bVar != null && !bVar.l() && ((!z10 || jVar.f11047c.f10919n == 2) && (jVar.f11047c.m() || (!z10 && !jVar.f11047c.k())))) {
                    w0 w0Var = jVar.d;
                    w0Var.getClass();
                    long a2 = w0Var.a();
                    if (jVar.e) {
                        if (a2 < u1Var.a()) {
                            if (u1Var.f11203c) {
                                u1Var.c(u1Var.a());
                                u1Var.f11203c = false;
                            }
                        } else {
                            jVar.e = false;
                            if (jVar.f11048f) {
                                u1Var.d();
                            }
                        }
                    }
                    u1Var.c(a2);
                    b2.a1 h = w0Var.h();
                    if (!h.equals((b2.a1) u1Var.e)) {
                        u1Var.f(h);
                        jVar.f11046b.f11165n.b(16, h).b();
                    }
                } else {
                    jVar.e = true;
                    if (jVar.f11048f) {
                        u1Var.d();
                    }
                }
                long a10 = jVar.a();
                this.m0 = a10;
                long j13 = a10 - x0Var.f11225p;
                long j14 = this.X.f11080s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f11066b.b()) {
                    if (this.f11168p0) {
                        this.f11168p0 = false;
                    }
                    k1 k1Var2 = this.X;
                    k1Var2.f11065a.b(k1Var2.f11066b.f45920a);
                    int min = Math.min(this.f11167o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f11167o0 = min;
                }
                if (this.f11179y.b()) {
                    boolean z11 = !this.Y.d;
                    k1 k1Var3 = this.X;
                    this.X = x(k1Var3.f11066b, j13, k1Var3.f11067c, j13, z11, 6);
                } else {
                    k1 k1Var4 = this.X;
                    k1Var4.f11080s = j13;
                    k1Var4.f11081t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f11078q = this.H.f11247l.d();
            k1 k1Var5 = this.X;
            k1Var5.f11079r = o(k1Var5.f11078q);
            k1 k1Var6 = this.X;
            if (k1Var6.f11073l && k1Var6.e == 3 && t0(k1Var6.f11065a, k1Var6.f11066b)) {
                k1 k1Var7 = this.X;
                float f10 = 1.0f;
                if (k1Var7.f11076o.f2073a == 1.0f) {
                    g gVar = this.J;
                    long l4 = l(k1Var7.f11065a, k1Var7.f11066b.f45920a, k1Var7.f11080s);
                    long j15 = this.X.f11079r;
                    if (gVar.f10964c != -9223372036854775807L) {
                        long j16 = l4 - j15;
                        if (gVar.f10971m == -9223372036854775807L) {
                            gVar.f10971m = j16;
                            gVar.f10972n = 0L;
                        } else {
                            gVar.f10971m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            gVar.f10972n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) gVar.f10972n) * 0.999f);
                        }
                        if (gVar.f10970l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - gVar.f10970l < 1000) {
                                f10 = gVar.f10969k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        gVar.f10970l = SystemClock.elapsedRealtime();
                        long j17 = (gVar.f10972n * 3) + gVar.f10971m;
                        if (gVar.h > j17) {
                            float S = (float) e2.m0.S(j12);
                            f7 = 1.0E-7f;
                            long[] jArr = {j17, gVar.e, gVar.h - (((gVar.f10969k - 1.0f) * S) + ((gVar.f10967i - 1.0f) * S))};
                            long j18 = jArr[0];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j19 = jArr[i10];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            gVar.h = j18;
                        } else {
                            f7 = 1.0E-7f;
                            long j20 = e2.m0.j(l4 - (Math.max(0.0f, gVar.f10969k - 1.0f) / 1.0E-7f), gVar.h, j17);
                            gVar.h = j20;
                            long j21 = gVar.f10966g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                gVar.h = j21;
                            }
                        }
                        long j22 = l4 - gVar.h;
                        if (Math.abs(j22) < gVar.f10962a) {
                            gVar.f10969k = 1.0f;
                        } else {
                            gVar.f10969k = e2.m0.h((f7 * ((float) j22)) + 1.0f, gVar.f10968j, gVar.f10967i);
                        }
                        f10 = gVar.f10969k;
                    }
                    if (this.f11179y.h().f2073a != f10) {
                        b2.a1 a1Var = new b2.a1(f10, this.X.f11076o.f2074b);
                        this.f11165n.e(16);
                        this.f11179y.f(a1Var);
                        w(this.X.f11076o, this.f11179y.h().f2073a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        boolean z10;
        boolean z11;
        z0 z0Var = this.H;
        z0Var.k();
        x0 x0Var = z0Var.f11248m;
        if (x0Var != null) {
            ?? r12 = x0Var.f11213a;
            if ((!x0Var.d || x0Var.e) && !r12.c()) {
                b2.p1 p1Var = this.X.f11065a;
                if (x0Var.e) {
                    r12.s();
                }
                for (h hVar : ((i) this.f11157f).f11037p.values()) {
                    if (hVar.f10979b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!x0Var.d) {
                    long j10 = x0Var.f11217g.f11229b;
                    x0Var.d = true;
                    r12.n(this, j10);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.f11198a = this.m0 - x0Var.f11225p;
                float f7 = this.f11179y.h().f2073a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u6.g(z10);
                u0Var.f11199b = f7;
                long j11 = this.f11155d0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                u6.g(z11);
                u0Var.f11200c = j11;
                v0 v0Var = new v0(u0Var);
                if (x0Var.f11222m != null) {
                    z12 = false;
                }
                u6.p(z12);
                r12.p(v0Var);
            }
        }
    }

    public final void D0(b2.p1 p1Var, u2.g0 g0Var, b2.p1 p1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        Object obj;
        b2.a1 a1Var;
        boolean t02 = t0(p1Var, g0Var);
        Object obj2 = g0Var.f45920a;
        if (!t02) {
            if (g0Var.b()) {
                a1Var = b2.a1.d;
            } else {
                a1Var = this.X.f11076o;
            }
            j jVar = this.f11179y;
            if (!jVar.h().equals(a1Var)) {
                this.f11165n.e(16);
                jVar.f(a1Var);
                w(this.X.f11076o, a1Var.f2073a, false, false);
                return;
            }
            return;
        }
        b2.m1 m1Var = this.f11177w;
        int i10 = p1Var.g(obj2, m1Var).f2213c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        b2.j0 j0Var = o1Var.f2264j;
        g gVar = this.J;
        gVar.getClass();
        gVar.f10964c = e2.m0.S(j0Var.f2172a);
        gVar.f10965f = e2.m0.S(j0Var.f2173b);
        gVar.f10966g = e2.m0.S(j0Var.f2174c);
        float f7 = j0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        gVar.f10968j = f7;
        float f10 = j0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        gVar.f10967i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            gVar.f10964c = -9223372036854775807L;
        }
        gVar.a();
        if (j10 != -9223372036854775807L) {
            gVar.d = l(p1Var, obj2, j10);
            gVar.a();
            return;
        }
        Object obj3 = o1Var.f2258a;
        if (!p1Var2.p()) {
            obj = p1Var2.m(p1Var2.g(g0Var2.f45920a, m1Var).f2213c, o1Var, 0L).f2258a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        gVar.d = -9223372036854775807L;
        gVar.a();
    }

    public final void E() {
        boolean z10;
        o0 o0Var = this.Y;
        k1 k1Var = this.X;
        boolean z11 = o0Var.f11123c;
        if (((k1) o0Var.f11124f) != k1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        o0Var.f11123c = z12;
        o0Var.f11124f = k1Var;
        if (z12) {
            h0 h0Var = this.G.f11210b;
            h0Var.f10995j.d(new q3(12, h0Var, o0Var));
            this.Y = new o0(this.X);
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f11154c0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f11155d0 = j10;
    }

    public final void F(int i10) {
        r1 r1Var = this.f11149a[i10];
        try {
            x0 x0Var = this.H.f11244i;
            x0Var.getClass();
            b d = r1Var.d(x0Var);
            d.getClass();
            u2.d1 d1Var = d.f10920r;
            d1Var.getClass();
            d1Var.d();
        } catch (IOException | RuntimeException e) {
            int i11 = r1Var.f11180a.f10916b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.t tVar = this.H.f11244i.f11224o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.x.c(tVar.f47794c[i10].m()), e);
            x2.t tVar2 = new x2.t((q1[]) tVar.f47793b.clone(), (x2.p[]) tVar.f47794c.clone(), tVar.d, tVar.e);
            tVar2.f47793b[i10] = null;
            tVar2.f47794c[i10] = null;
            h(i10);
            x0 x0Var2 = this.H.f11244i;
            x0Var2.a(tVar2, this.X.f11080s, false, new boolean[x0Var2.f11219j.length]);
        }
    }

    @Override
    public final void G(u2.f1 f1Var) {
        this.f11165n.b(9, (u2.e0) f1Var).b();
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f11153c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new i0(this, i10, z10, 0));
        }
    }

    public final void I() {
        u(this.I.b(), true);
    }

    public final void J(n0 n0Var) {
        boolean z10;
        b2.p1 b10;
        this.Y.f(1);
        int i10 = n0Var.f11092a;
        int i11 = n0Var.f11093b;
        int i12 = n0Var.f11094c;
        u2.i1 i1Var = n0Var.d;
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.f11052b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        j1Var.f11057j = i1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((i1) arrayList.get(min)).d;
            e2.m0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                i1 i1Var2 = (i1) arrayList.get(min);
                i1Var2.d = i13;
                i13 += i1Var2.f11042a.f45869o.e.o();
                min++;
            }
            b10 = j1Var.b();
        } else {
            b10 = j1Var.b();
        }
        u(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        int i11;
        this.Y.f(1);
        P(false, false, false, true);
        i iVar = (i) this.f11157f;
        ConcurrentHashMap concurrentHashMap = iVar.f11037p;
        long id2 = Thread.currentThread().getId();
        long j10 = iVar.f11038q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        iVar.f11038q = id2;
        j2.k kVar = this.L;
        h hVar = (h) concurrentHashMap.get(kVar);
        if (hVar == null) {
            ?? obj = new Object();
            obj.f10978a = 1;
            concurrentHashMap.put(kVar, obj);
        } else {
            hVar.f10978a++;
        }
        h hVar2 = (h) concurrentHashMap.get(kVar);
        hVar2.getClass();
        Integer num = (Integer) iVar.f11036o.get(kVar.f12555a);
        if (num != null && num.intValue() != -1) {
            i10 = num.intValue();
        } else {
            i10 = iVar.f11033l;
        }
        if (i10 == -1) {
            i10 = 13107200;
        }
        hVar2.f10980c = i10;
        hVar2.f10979b = false;
        if (this.X.f11065a.p()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        o0(i11);
        k1 k1Var = this.X;
        boolean z11 = k1Var.f11073l;
        B0(this.P.d(k1Var.e, z11), k1Var.f11075n, k1Var.f11074m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.f11052b;
        u6.p(!j1Var.f11058k);
        j1Var.f11059l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i1 i1Var = (i1) arrayList.get(i12);
            j1Var.e(i1Var);
            j1Var.f11055g.add(i1Var);
        }
        j1Var.f11058k = true;
        this.f11165n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.l lVar = this.f11170r;
        e2.i0 i0Var = this.f11165n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f11157f;
            j2.k kVar = this.L;
            i iVar2 = (i) t0Var;
            ConcurrentHashMap concurrentHashMap = iVar2.f11037p;
            h hVar = (h) concurrentHashMap.get(kVar);
            if (hVar != null) {
                int i10 = hVar.f10978a - 1;
                hVar.f10978a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(kVar);
                    iVar2.c();
                }
            }
            if (iVar2.f11037p.isEmpty()) {
                iVar2.f11038q = -1L;
            }
            c2.e eVar = this.P;
            eVar.f4126c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f8357a.removeCallbacksAndMessages(null);
            lVar.h();
            iVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f11149a.length; i10++) {
            b bVar = this.f11151b[i10];
            synchronized (bVar.f10915a) {
                bVar.H = null;
            }
            r1 r1Var = this.f11149a[i10];
            b bVar2 = r1Var.f11180a;
            boolean z11 = true;
            if (bVar2.f10919n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar2.q();
            r1Var.e = false;
            b bVar3 = r1Var.f11182c;
            if (bVar3 != null) {
                if (bVar3.f10919n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar3.q();
                r1Var.f11183f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        boolean z10 = true;
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > j1Var.f11052b.size()) {
            z10 = false;
        }
        u6.g(z10);
        j1Var.f11057j = i1Var;
        j1Var.g(i10, i11);
        u(j1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        x0 x0Var = this.H.f11244i;
        if (x0Var != null && x0Var.f11217g.f11234j && this.f11150a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11152b0 = z10;
    }

    public final void R(long j10, boolean z10) {
        z0 z0Var;
        long j11;
        r1[] r1VarArr;
        x2.p[] pVarArr;
        x0 x0Var = this.H.f11244i;
        if (x0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = x0Var.f11225p;
        }
        long j12 = j10 + j11;
        this.m0 = j12;
        this.f11179y.f11045a.c(j12);
        for (r1 r1Var : this.f11149a) {
            long j13 = this.m0;
            b d = r1Var.d(x0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (x0 x0Var2 = z0Var.f11244i; x0Var2 != null; x0Var2 = x0Var2.f11222m) {
            for (x2.p pVar : x0Var2.f11224o.f47794c) {
                if (pVar != null) {
                    pVar.r();
                }
            }
        }
    }

    public final void S(b2.p1 p1Var, b2.p1 p1Var2) {
        if (p1Var.p() && p1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a1.g.z(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j10) {
        r1[] r1VarArr;
        x0 x0Var;
        long j11;
        boolean z10 = this.T;
        long j12 = 1000;
        long j13 = f11148w0;
        if (z10) {
            this.S.getClass();
            if (this.X.e != 3) {
                j12 = j13;
            }
            for (r1 r1Var : this.f11149a) {
                long j14 = this.m0;
                long j15 = this.f11166n0;
                b bVar = r1Var.f11182c;
                b bVar2 = r1Var.f11180a;
                if (r1.h(bVar2)) {
                    j11 = bVar2.g(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f10919n != 0) {
                    j11 = Math.min(j11, bVar.g(j14, j15));
                }
                j12 = Math.min(j12, e2.m0.h0(j11));
            }
            if (this.X.m()) {
                x0 x0Var2 = this.H.f11244i;
                if (x0Var2 != null) {
                    x0Var = x0Var2.f11222m;
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    if ((((float) e2.m0.S(j12)) * this.X.f11076o.f2073a) + ((float) this.m0) >= ((float) x0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            j12 = j13;
        }
        this.f11165n.f8357a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.f11244i.f11217g.f11228a;
        long Y = Y(g0Var, this.X.f11080s, true, false);
        if (Y != this.X.f11080s) {
            k1 k1Var = this.X;
            this.X = x(g0Var, Y, k1Var.f11067c, k1Var.d, z10, 5);
        }
    }

    public final void X(i2.q0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.X(i2.q0):void");
    }

    public final long Y(u2.g0 g0Var, long j10, boolean z10, boolean z11) {
        z0 z0Var;
        r1[] r1VarArr;
        boolean z12;
        r1[] r1VarArr2;
        int i10;
        w0();
        boolean z13 = true;
        E0(false, true);
        if (z11 || this.X.e == 3) {
            o0(2);
        }
        x0 x0Var = this.H.f11244i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !g0Var.equals(x0Var2.f11217g.f11228a)) {
            x0Var2 = x0Var2.f11222m;
        }
        if (z10 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.f11225p + j10 < 0)) {
            for (int i11 = 0; i11 < this.f11149a.length; i11++) {
                h(i11);
            }
            this.f11174t0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    z0Var = this.H;
                    if (z0Var.f11244i == x0Var2) {
                        break;
                    }
                    z0Var.a();
                }
                z0Var.n(x0Var2);
                x0Var2.f11225p = 1000000000000L;
                k(this.H.f11245j.e(), new boolean[this.f11149a.length]);
                x0Var2.h = true;
            }
        }
        g();
        if (this.T) {
            for (r1 r1Var : this.f11149a) {
                if (r1Var.g() && ((i10 = r1Var.f11180a.f10916b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.H.n(x0Var2);
            if (!x0Var2.e) {
                x0Var2.f11217g = x0Var2.f11217g.b(j10, -9223372036854775807L);
            } else if (x0Var2.f11216f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f11065a.p() && x0Var2.f11217g.f11228a.equals(this.X.f11066b)) {
                        long j11 = x0Var2.f11225p + j10;
                        boolean z14 = true;
                        for (r1 r1Var2 : this.f11149a) {
                            if (r1Var2.g()) {
                                b d = r1Var2.d(x0Var2);
                                if (d != null && d.E(j11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = x0Var2.f11213a;
                            long j12 = this.X.f11080s;
                            t1 t1Var = t1.e;
                            if (r10.t(j12, t1Var) == x0Var2.f11213a.t(j10, t1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = x0Var2.f11213a.h(j10);
                x0Var2.f11213a.i(j10 - this.f11178x);
            }
            R(j10, z13);
            C();
        } else {
            this.H.b();
            R(j10, true);
        }
        t(false);
        this.f11165n.f(2);
        return j10;
    }

    public final void Z(n1 n1Var) {
        n1Var.getClass();
        Looper looper = n1Var.e;
        Looper looper2 = this.f11172s;
        e2.i0 i0Var = this.f11165n;
        if (looper == looper2) {
            f(n1Var);
            int i10 = this.X.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, n1Var).b();
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        if (this.U) {
            this.f11165n.a(37).b();
        }
    }

    public final void a0(n1 n1Var) {
        Looper looper = n1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            n1Var.a(false);
            return;
        }
        this.F.a(looper, null).d(new x8(this, n1Var));
    }

    public final void b(m0 m0Var, int i10) {
        this.Y.f(1);
        j1 j1Var = this.I;
        if (i10 == -1) {
            i10 = j1Var.f11052b.size();
        }
        u(j1Var.a(i10, m0Var.f11087a, m0Var.f11088b), false);
    }

    public final void b0(b2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.b0(b2.f, boolean):void");
    }

    public final void c() {
        r1[] r1VarArr;
        s1 s1Var;
        for (r1 r1Var : this.f11149a) {
            if (this.T) {
                s1Var = this.S;
            } else {
                s1Var = null;
            }
            r1Var.f11180a.c(18, s1Var);
            b bVar = r1Var.f11182c;
            if (bVar != null) {
                bVar.c(18, s1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.f11160h0 != z10) {
            this.f11160h0 = z10;
            if (!z10) {
                for (r1 r1Var : this.f11149a) {
                    r1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final boolean d() {
        if (!this.O) {
            return false;
        }
        for (r1 r1Var : this.f11149a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(k0 k0Var) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f11149a) {
            b bVar = r1Var.f11180a;
            if (bVar.f10916b == 4) {
                bVar.c(23, k0Var);
                b bVar2 = r1Var.f11182c;
                if (bVar2 != null) {
                    bVar2.c(23, k0Var);
                }
            }
        }
    }

    public final void e() {
        O();
        W(true);
    }

    public final void e0(m0 m0Var) {
        this.Y.f(1);
        int i10 = m0Var.f11089c;
        u2.i1 i1Var = m0Var.f11088b;
        ArrayList arrayList = m0Var.f11087a;
        if (i10 != -1) {
            this.f11164l0 = new q0(new p1(arrayList, i1Var), m0Var.f11089c, m0Var.d);
        }
        j1 j1Var = this.I;
        ArrayList arrayList2 = j1Var.f11052b;
        j1Var.g(0, arrayList2.size());
        u(j1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f0(boolean z10) {
        this.f11150a0 = z10;
        Q();
        if (this.f11152b0) {
            z0 z0Var = this.H;
            if (z0Var.f11245j != z0Var.f11244i) {
                W(true);
                t(false);
            }
        }
    }

    public final void g() {
        r1[] r1VarArr;
        boolean z10;
        b bVar;
        if (this.O && d()) {
            for (r1 r1Var : this.f11149a) {
                int c10 = r1Var.c();
                j jVar = this.f11179y;
                if (r1Var.f()) {
                    int i10 = r1Var.d;
                    int i11 = 1;
                    if (i10 != 4 && i10 != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i10 != 4) {
                        i11 = 0;
                    }
                    if (z10) {
                        try {
                            bVar = r1Var.f11180a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = r1Var.f11182c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, jVar);
                    try {
                        r1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    r1Var.d = i11;
                }
                this.f11163k0 -= c10 - r1Var.c();
            }
            this.f11174t0 = -9223372036854775807L;
        }
    }

    public final void g0(b2.a1 a1Var) {
        this.f11165n.e(16);
        j jVar = this.f11179y;
        jVar.f(a1Var);
        b2.a1 h = jVar.h();
        w(h, h.f2073a, true, true);
    }

    public final void h(int i10) {
        boolean z10;
        r1[] r1VarArr = this.f11149a;
        int c10 = r1VarArr[i10].c();
        r1 r1Var = r1VarArr[i10];
        b bVar = r1Var.f11180a;
        j jVar = this.f11179y;
        r1Var.a(bVar, jVar);
        b bVar2 = r1Var.f11182c;
        if (bVar2 != null) {
            if (bVar2.f10919n != 0 && r1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            r1Var.a(bVar2, jVar);
            r1Var.i(false);
            if (z10) {
                b bVar3 = r1Var.f11180a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i10, false);
        this.f11163k0 -= c10;
    }

    public final void h0(p pVar) {
        this.f11173s0 = pVar;
        b2.p1 p1Var = this.X.f11065a;
        z0 z0Var = this.H;
        z0Var.getClass();
        pVar.getClass();
        if (!z0Var.f11252q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < z0Var.f11252q.size(); i10++) {
                ((x0) z0Var.f11252q.get(i10)).i();
            }
            z0Var.f11252q = arrayList;
            z0Var.f11248m = null;
            z0Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        x0 x0Var;
        u2.g0 g0Var;
        x0 x0Var2;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = message.arg2;
                    this.Y.f(1);
                    B0(this.P.d(this.X.e, z10), i13 >> 4, i13 & 15, z10);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((b2.a1) message.obj);
                    break;
                case 5:
                    l0((t1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((e2.i) message.obj);
                    return true;
                case 8:
                    v((u2.e0) message.obj);
                    break;
                case 9:
                    r((u2.e0) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    i0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m0(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c0(z12, (e2.i) message.obj);
                    break;
                case 14:
                    Z((n1) message.obj);
                    break;
                case 15:
                    a0((n1) message.obj);
                    break;
                case 16:
                    b2.a1 a1Var = (b2.a1) message.obj;
                    w(a1Var, a1Var.f2073a, true, false);
                    break;
                case 17:
                    e0((m0) message.obj);
                    break;
                case 18:
                    b((m0) message.obj, message.arg1);
                    break;
                case 19:
                    J((n0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (u2.i1) message.obj);
                    break;
                case 21:
                    n0((u2.i1) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    f0(z13);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    z0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    h0((p) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (e2.i) pair.second);
                    break;
                case 31:
                    b2.f fVar = (b2.f) message.obj;
                    if (message.arg1 != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    b0(fVar, z14);
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
                    p0((a3.y) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.U = false;
                    q0 q0Var = this.V;
                    if (q0Var != null) {
                        X(q0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((s1) message.obj);
                    break;
                case 39:
                    d0((k0) message.obj);
                    break;
            }
        } catch (b2.x0 e) {
            boolean z15 = e.f2526a;
            int i14 = e.f2527b;
            if (i14 == 1) {
                if (z15) {
                    i11 = 3001;
                } else {
                    i11 = 3003;
                }
            } else {
                if (i14 == 4) {
                    if (z15) {
                        i11 = 3002;
                    } else {
                        i11 = 3004;
                    }
                }
                s(e, i12);
            }
            i12 = i11;
            s(e, i12);
        } catch (g2.j e7) {
            s(e7, e7.f9873a);
        } catch (m e10) {
            e = e10;
            int i15 = e.f11083s;
            z0 z0Var = this.H;
            if (i15 == 1 && (x0Var2 = z0Var.f11245j) != null && e.E == null) {
                e = e.a(x0Var2.f11217g.f11228a);
            }
            int i16 = e.f11083s;
            e2.i0 i0Var = this.f11165n;
            if (i16 == 1 && (g0Var = e.E) != null && A(e.f11084w, g0Var)) {
                this.f11175u0 = true;
                g();
                x0 g10 = z0Var.g();
                x0 x0Var3 = z0Var.f11244i;
                if (x0Var3 != g10) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.f11222m;
                        if (x0Var4 == g10) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                z0Var.n(x0Var3);
                if (this.X.e != 4) {
                    C();
                    i0Var.f(2);
                }
            } else {
                m mVar = this.f11169q0;
                if (mVar != null) {
                    mVar.addSuppressed(e);
                    e = this.f11169q0;
                }
                if (e.f11083s == 1 && z0Var.f11244i != z0Var.f11245j) {
                    while (true) {
                        x0Var = z0Var.f11244i;
                        if (x0Var == z0Var.f11245j) {
                            break;
                        }
                        z0Var.a();
                    }
                    u6.k(x0Var);
                    E();
                    y0 y0Var = x0Var.f11217g;
                    u2.g0 g0Var2 = y0Var.f11228a;
                    long j10 = y0Var.f11229b;
                    this.X = x(g0Var2, j10, y0Var.d, j10, true, 0);
                }
                if (e.F && (this.f11169q0 == null || (i10 = e.f2538a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f11169q0 == null) {
                        this.f11169q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f8357a;
                    Message message2 = b10.f8353a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    e2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.X = this.X.f(e);
                }
            }
        } catch (IOException e11) {
            s(e11, 2000);
        } catch (RuntimeException e12) {
            m mVar2 = new m(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.d("ExoPlayerImplInternal", "Playback error", mVar2);
            v0(true, false);
            this.X = this.X.f(mVar2);
        } catch (n2.f e13) {
            s(e13, e13.f15954a);
        } catch (u2.b e14) {
            s(e14, 1002);
        }
        E();
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.i():void");
    }

    public final void i0(int i10) {
        this.f11158f0 = i10;
        b2.p1 p1Var = this.X.f11065a;
        z0 z0Var = this.H;
        z0Var.f11243g = i10;
        int r10 = z0Var.r(p1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void j(x0 x0Var, int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        r1 r1Var = this.f11149a[i10];
        boolean g10 = r1Var.g();
        b bVar = r1Var.f11180a;
        if (!g10) {
            if (x0Var == this.H.f11244i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.t tVar = x0Var.f11224o;
            q1 q1Var = tVar.f47793b[i10];
            x2.p pVar = tVar.f47794c[i10];
            if (s0() && this.X.e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f11163k0++;
            u2.d1 d1Var = x0Var.f11215c[i10];
            long j11 = x0Var.f11225p;
            u2.g0 g0Var = x0Var.f11217g.f11228a;
            b bVar2 = r1Var.f11182c;
            if (pVar != null) {
                i11 = pVar.length();
            } else {
                i11 = 0;
            }
            b2.x[] xVarArr = new b2.x[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                pVar.getClass();
                xVarArr[i12] = pVar.f(i12);
            }
            int i13 = r1Var.d;
            j jVar = this.f11179y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                r1Var.f11183f = true;
                bVar2.getClass();
                if (bVar2.f10919n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                u6.p(z15);
                bVar2.d = q1Var;
                bVar2.G = g0Var;
                bVar2.f10919n = 1;
                bVar2.o(z13, z11);
                bVar2.y(xVarArr, d1Var, j10, j11, g0Var);
                bVar2.z(j10, z13, true);
                jVar.c(bVar2);
            } else {
                r1Var.e = true;
                if (bVar.f10919n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                u6.p(z14);
                bVar.d = q1Var;
                bVar.G = g0Var;
                bVar.f10919n = 1;
                bVar.o(z13, z11);
                bVar.y(xVarArr, d1Var, j10, j11, g0Var);
                bVar.z(j10, z13, true);
                jVar.c(bVar);
            }
            l0 l0Var = new l0(this);
            b d = r1Var.d(x0Var);
            d.getClass();
            d.c(11, l0Var);
            if (z12 && z11) {
                r1Var.m();
            }
        }
    }

    public final void j0(boolean z10) {
        if (!z10) {
            q0 q0Var = this.V;
            e2.i0 i0Var = this.f11165n;
            if (q0Var != null && this.U && !i0Var.f8357a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new ah.g(this, i10, 9));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            q0 q0Var2 = this.V;
            if (q0Var2 != null) {
                X(q0Var2);
                this.V = null;
                this.U = false;
            }
        }
        this.T = z10;
        c();
    }

    public final void k(long j10, boolean[] zArr) {
        r1[] r1VarArr;
        long j11;
        x0 x0Var = this.H.f11245j;
        x2.t tVar = x0Var.f11224o;
        int i10 = 0;
        while (true) {
            r1VarArr = this.f11149a;
            if (i10 >= r1VarArr.length) {
                break;
            }
            if (!tVar.b(i10)) {
                r1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < r1VarArr.length) {
            if (!tVar.b(i11) || r1VarArr[i11].d(x0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                j(x0Var, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public final void k0(s1 s1Var) {
        this.S = s1Var;
        c();
    }

    public final long l(b2.p1 p1Var, Object obj, long j10) {
        b2.m1 m1Var = this.f11177w;
        int i10 = p1Var.g(obj, m1Var).f2213c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        if (o1Var.f2261f == -9223372036854775807L || !o1Var.a() || !o1Var.f2263i) {
            return -9223372036854775807L;
        }
        return e2.m0.S(e2.m0.C(o1Var.f2262g) - o1Var.f2261f) - (j10 + m1Var.e);
    }

    public final void l0(t1 t1Var) {
        this.R = t1Var;
    }

    public final long m(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j10 = x0Var.f11225p;
        if (!x0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            r1[] r1VarArr = this.f11149a;
            if (i10 < r1VarArr.length) {
                if (r1VarArr[i10].d(x0Var) != null) {
                    b d = r1VarArr[i10].d(x0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f10923x;
                    if (j11 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(j11, j10);
                }
                i10++;
            } else {
                return j10;
            }
        }
    }

    public final void m0(boolean z10) {
        this.f11159g0 = z10;
        b2.p1 p1Var = this.X.f11065a;
        z0 z0Var = this.H;
        z0Var.h = z10;
        int r10 = z0Var.r(p1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    public final Pair n(b2.p1 p1Var) {
        long j10 = 0;
        if (p1Var.p()) {
            return Pair.create(k1.f11064u, 0L);
        }
        int a2 = p1Var.a(this.f11159g0);
        Pair i10 = p1Var.i(this.v, this.f11177w, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(p1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f45920a;
            b2.m1 m1Var = this.f11177w;
            p1Var.g(obj, m1Var);
            if (p5.f45922c == m1Var.e(p5.f45921b)) {
                m1Var.f2215g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j10));
    }

    public final void n0(u2.i1 i1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        int size = j1Var.f11052b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        j1Var.f11057j = i1Var;
        u(j1Var.b(), false);
    }

    public final long o(long j10) {
        x0 x0Var = this.H.f11247l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - x0Var.f11225p));
    }

    public final void o0(int i10) {
        k1 k1Var = this.X;
        if (k1Var.e != i10) {
            if (i10 != 2) {
                this.f11171r0 = -9223372036854775807L;
            }
            if (i10 != 3 && k1Var.f11077p) {
                this.X = k1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final void p(int i10) {
        k1 k1Var = this.X;
        B0(i10, k1Var.f11075n, k1Var.f11074m, k1Var.f11073l);
    }

    public final void p0(a3.y yVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f11149a) {
            b bVar = r1Var.f11180a;
            if (bVar.f10916b == 2) {
                bVar.c(7, yVar);
                b bVar2 = r1Var.f11182c;
                if (bVar2 != null) {
                    bVar2.c(7, yVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.f11176v0);
    }

    public final void q0(Object obj, e2.i iVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f11149a) {
            b bVar = r1Var.f11180a;
            if (bVar.f10916b == 2) {
                int i10 = r1Var.d;
                if (i10 != 4 && i10 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = r1Var.f11182c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.f11165n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r(u2.e0 e0Var) {
        z0 z0Var = this.H;
        x0 x0Var = z0Var.f11247l;
        if (x0Var != null && x0Var.f11213a == e0Var) {
            z0Var.m(this.m0);
            C();
            return;
        }
        x0 x0Var2 = z0Var.f11248m;
        if (x0Var2 != null && x0Var2.f11213a == e0Var) {
            D();
        }
    }

    public final void r0(float f7) {
        r1[] r1VarArr;
        this.f11176v0 = f7;
        float f10 = f7 * this.P.f4128g;
        for (r1 r1Var : this.f11149a) {
            b bVar = r1Var.f11180a;
            if (bVar.f10916b == 1) {
                bVar.c(2, Float.valueOf(f10));
                b bVar2 = r1Var.f11182c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s(IOException iOException, int i10) {
        m mVar = new m(0, iOException, i10);
        x0 x0Var = this.H.f11244i;
        if (x0Var != null) {
            mVar = mVar.a(x0Var.f11217g.f11228a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
        v0(false, false);
        this.X = this.X.f(mVar);
    }

    public final boolean s0() {
        k1 k1Var = this.X;
        if (k1Var.f11073l && k1Var.f11075n == 0) {
            return true;
        }
        return false;
    }

    public final void t(boolean z10) {
        u2.g0 g0Var;
        long d;
        x0 x0Var = this.H.f11247l;
        if (x0Var == null) {
            g0Var = this.X.f11066b;
        } else {
            g0Var = x0Var.f11217g.f11228a;
        }
        boolean equals = this.X.f11072k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        k1 k1Var = this.X;
        if (x0Var == null) {
            d = k1Var.f11080s;
        } else {
            d = x0Var.d();
        }
        k1Var.f11078q = d;
        k1 k1Var2 = this.X;
        k1Var2.f11079r = o(k1Var2.f11078q);
        if ((!equals || z10) && x0Var != null && x0Var.e) {
            y0(x0Var.f11217g.f11228a, x0Var.f11224o);
        }
    }

    public final boolean t0(b2.p1 p1Var, u2.g0 g0Var) {
        if (!g0Var.b() && !p1Var.p()) {
            int i10 = p1Var.g(g0Var.f45920a, this.f11177w).f2213c;
            b2.o1 o1Var = this.v;
            p1Var.n(i10, o1Var);
            if (o1Var.a() && o1Var.f2263i && o1Var.f2261f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(b2.p1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.u(b2.p1, boolean):void");
    }

    public final void u0() {
        x0 x0Var = this.H.f11244i;
        if (x0Var != null) {
            x2.t tVar = x0Var.f11224o;
            int i10 = 0;
            while (true) {
                r1[] r1VarArr = this.f11149a;
                if (i10 < r1VarArr.length) {
                    if (tVar.b(i10)) {
                        r1VarArr[i10].m();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(u2.e0 e0Var) {
        x0 x0Var;
        z0 z0Var = this.H;
        x0 x0Var2 = z0Var.f11247l;
        j jVar = this.f11179y;
        if (x0Var2 != null && x0Var2.f11213a == e0Var) {
            x0Var2.getClass();
            if (!x0Var2.e) {
                float f7 = jVar.h().f2073a;
                k1 k1Var = this.X;
                x0Var2.f(f7, k1Var.f11065a, k1Var.f11073l);
            }
            y0(x0Var2.f11217g.f11228a, x0Var2.f11224o);
            if (x0Var2 == z0Var.f11244i) {
                R(x0Var2.f11217g.f11229b, true);
                k(z0Var.f11245j.e(), new boolean[this.f11149a.length]);
                x0Var2.h = true;
                k1 k1Var2 = this.X;
                u2.g0 g0Var = k1Var2.f11066b;
                long j10 = x0Var2.f11217g.f11229b;
                this.X = x(g0Var, j10, k1Var2.f11067c, j10, false, 5);
            }
            C();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < z0Var.f11252q.size()) {
                x0Var = (x0) z0Var.f11252q.get(i10);
                if (x0Var.f11213a == e0Var) {
                    break;
                }
                i10++;
            } else {
                x0Var = null;
                break;
            }
        }
        if (x0Var != null) {
            u6.p(true ^ x0Var.e);
            float f10 = jVar.h().f2073a;
            k1 k1Var3 = this.X;
            x0Var.f(f10, k1Var3.f11065a, k1Var3.f11073l);
            x0 x0Var3 = z0Var.f11248m;
            if (x0Var3 != null && x0Var3.f11213a == e0Var) {
                D();
            }
        }
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f11160h0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        i iVar = (i) this.f11157f;
        ConcurrentHashMap concurrentHashMap = iVar.f11037p;
        j2.k kVar = this.L;
        h hVar = (h) concurrentHashMap.get(kVar);
        if (hVar != null) {
            int i10 = hVar.f10978a - 1;
            hVar.f10978a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(kVar);
                iVar.c();
            }
        }
        this.P.d(1, this.X.f11073l);
        o0(1);
    }

    public final void w(b2.a1 a1Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.Y.f(1);
            }
            this.X = this.X.g(a1Var);
        }
        float f10 = a1Var.f2073a;
        x0 x0Var = this.H.f11244i;
        while (true) {
            i10 = 0;
            if (x0Var == null) {
                break;
            }
            x2.p[] pVarArr = x0Var.f11224o.f47794c;
            int length = pVarArr.length;
            while (i10 < length) {
                x2.p pVar = pVarArr[i10];
                if (pVar != null) {
                    pVar.p(f10);
                }
                i10++;
            }
            x0Var = x0Var.f11222m;
        }
        r1[] r1VarArr = this.f11149a;
        int length2 = r1VarArr.length;
        while (i10 < length2) {
            r1 r1Var = r1VarArr[i10];
            float f11 = a1Var.f2073a;
            r1Var.f11180a.A(f7, f11);
            b bVar = r1Var.f11182c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void w0() {
        r1[] r1VarArr;
        j jVar = this.f11179y;
        jVar.f11048f = false;
        u1 u1Var = jVar.f11045a;
        if (u1Var.f11203c) {
            u1Var.c(u1Var.a());
            u1Var.f11203c = false;
        }
        for (r1 r1Var : this.f11149a) {
            b bVar = r1Var.f11182c;
            b bVar2 = r1Var.f11180a;
            if (r1.h(bVar2)) {
                r1.b(bVar2);
            }
            if (bVar != null && bVar.f10919n != 0) {
                r1.b(bVar);
            }
        }
    }

    public final k1 x(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        x1 x1Var;
        boolean z13;
        boolean z14;
        if (!this.f11168p0 && j10 == this.X.f11080s && g0Var.equals(this.X.f11066b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f11168p0 = z11;
        Q();
        k1 k1Var = this.X;
        u2.r1 r1Var = k1Var.h;
        x2.t tVar = k1Var.f11070i;
        List list = k1Var.f11071j;
        if (this.I.f11058k) {
            x0 x0Var = this.H.f11244i;
            if (x0Var == null) {
                r1Var = u2.r1.d;
            } else {
                r1Var = x0Var.f11223n;
            }
            if (x0Var == null) {
                tVar = this.e;
            } else {
                tVar = x0Var.f11224o;
            }
            x2.p[] pVarArr = tVar.f47794c;
            ?? g0Var2 = new e9.g0(4);
            boolean z15 = false;
            for (x2.p pVar : pVarArr) {
                if (pVar != null) {
                    b2.u0 u0Var = pVar.f(0).f2512l;
                    if (u0Var == null) {
                        g0Var2.c(new b2.u0(new b2.t0[0]));
                    } else {
                        g0Var2.c(u0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                x1Var = g0Var2.f();
            } else {
                e9.l0 l0Var = e9.n0.f8592b;
                x1Var = x1.e;
            }
            list = x1Var;
            if (x0Var != null) {
                y0 y0Var = x0Var.f11217g;
                if (y0Var.d != j11) {
                    x0Var.f11217g = y0Var.a(j11);
                }
            }
            r1[] r1VarArr = this.f11149a;
            z0 z0Var = this.H;
            x0 x0Var2 = z0Var.f11244i;
            if (x0Var2 == z0Var.f11245j && x0Var2 != null) {
                x2.t tVar2 = x0Var2.f11224o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < r1VarArr.length) {
                        if (tVar2.b(i11)) {
                            if (r1VarArr[i11].f11180a.f10916b != 1) {
                                z13 = false;
                                break;
                            } else if (tVar2.f47793b[i11].f11143a != 0) {
                                z16 = true;
                            }
                        }
                        i11++;
                    } else {
                        z13 = true;
                        break;
                    }
                }
                if (z16 && z13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != this.f11162j0) {
                    this.f11162j0 = z14;
                    if (!z14 && this.X.f11077p) {
                        this.f11165n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(k1Var.f11066b)) {
            r1Var = u2.r1.d;
            tVar = this.e;
            list = x1.e;
        }
        u2.r1 r1Var2 = r1Var;
        x2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            o0 o0Var = this.Y;
            if (o0Var.d && o0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
            } else {
                o0Var.f11123c = true;
                o0Var.d = true;
                o0Var.e = i10;
            }
        }
        k1 k1Var2 = this.X;
        return k1Var2.d(g0Var, j10, j11, j12, o(k1Var2.f11078q), r1Var2, tVar3, list2);
    }

    public final void x0() {
        boolean z10;
        x0 x0Var = this.H.f11247l;
        if (!this.f11156e0 && (x0Var == null || !x0Var.f11213a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        k1 k1Var = this.X;
        if (z10 != k1Var.f11069g) {
            this.X = k1Var.b(z10);
        }
    }

    @Override
    public final void y(u2.e0 e0Var) {
        this.f11165n.b(8, e0Var).b();
    }

    public final void y0(u2.g0 r10, x2.t r11) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.y0(u2.g0, x2.t):void");
    }

    public final void z0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        ArrayList arrayList = j1Var.f11052b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        u6.g(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((i1) arrayList.get(i12)).f11042a.t((b2.p0) list.get(i12 - i10));
        }
        u(j1Var.b(), false);
    }
}
