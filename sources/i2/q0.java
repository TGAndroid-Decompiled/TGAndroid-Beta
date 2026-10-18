package i2;

import ai.y8;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import e9.x1;
import ei.bc;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class q0 implements Handler.Callback, u2.c0, j1, a3.y {
    public static final long f12540w0 = e2.m0.h0(10000);
    public final ArrayList E;
    public final e2.g0 F;
    public final w G;
    public final y0 H;
    public final h1 I;
    public final g J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.e P;
    public final boolean Q;
    public r1 R;
    public q1 S;
    public boolean T;
    public boolean U;
    public p0 V;
    public int W;
    public i1 X;
    public n0 Y;
    public boolean Z;
    public final p1[] f12541a;
    public boolean f12542a0;
    public final b[] f12543b;
    public boolean f12544b0;
    public final boolean[] f12545c;
    public boolean f12546c0;
    public final x2.s d;
    public long f12547d0;
    public final x2.t e;
    public boolean f12548e0;
    public final s0 f12549f;
    public int f12550f0;
    public boolean f12551g0;
    public final y2.c h;
    public boolean f12552h0;
    public boolean f12553i0;
    public boolean f12554j0;
    public int f12555k0;
    public p0 f12556l0;
    public long m0;
    public final e2.i0 f12557n;
    public long f12558n0;
    public int f12559o0;
    public boolean f12560p0;
    public m f12561q0;
    public final j6.l f12562r;
    public long f12563r0;
    public final Looper f12564s;
    public p f12565s0;
    public long f12566t0;
    public boolean f12567u0;
    public final b2.n1 v;
    public float f12568v0;
    public final b2.l1 f12569w;
    public final long f12570x;
    public final j f12571y;

    public q0(Context context, b[] bVarArr, b[] bVarArr2, x2.s sVar, x2.t tVar, s0 s0Var, y2.c cVar, int i10, boolean z10, j2.f fVar, r1 r1Var, g gVar, long j10, Looper looper, e2.g0 g0Var, w wVar, j2.k kVar, final a3.y yVar, boolean z11) {
        p pVar = p.f12532a;
        this.f12566t0 = -9223372036854775807L;
        this.G = wVar;
        this.d = sVar;
        this.e = tVar;
        this.f12549f = s0Var;
        this.h = cVar;
        this.f12550f0 = i10;
        this.f12551g0 = z10;
        this.R = r1Var;
        this.J = gVar;
        this.K = j10;
        this.f12542a0 = false;
        this.F = g0Var;
        this.L = kVar;
        this.f12565s0 = pVar;
        this.M = fVar;
        this.f12568v0 = 1.0f;
        this.S = q1.f12572b;
        this.Q = z11;
        this.f12563r0 = -9223372036854775807L;
        this.f12547d0 = -9223372036854775807L;
        this.f12570x = ((i) s0Var).f12441n;
        b2.k1 k1Var = b2.o1.f3894a;
        i1 k10 = i1.k(tVar);
        this.X = k10;
        this.Y = new n0(k10);
        this.f12543b = new b[bVarArr.length];
        this.f12545c = new boolean[bVarArr.length];
        x2.n nVar = (x2.n) sVar;
        nVar.getClass();
        this.f12541a = new p1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f12317f = kVar;
            bVar.h = g0Var;
            this.f12543b[i11] = bVar;
            b bVar2 = this.f12543b[i11];
            synchronized (bVar2.f12314a) {
                bVar2.H = nVar;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f12317f = kVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f12541a[i11] = new p1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.f12571y = new j(this, g0Var);
        this.E = new ArrayList();
        this.v = new b2.n1();
        this.f12569w = new b2.l1();
        u6.p(sVar.f49222a == null);
        sVar.f49222a = this;
        sVar.f49223b = cVar;
        this.f12560p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new y0(fVar, a2, new e1.c(this, 19));
        this.I = new h1(this, fVar, a2, kVar);
        j6.l lVar = new j6.l(7);
        this.f12562r = lVar;
        Looper d = lVar.d();
        this.f12564s = d;
        e2.i0 a10 = g0Var.a(d, this);
        this.f12557n = a10;
        this.P = new c2.e(context, d, this);
        a10.b(35, new a3.y() {
            @Override
            public final void a(long j11, long j12, b2.w wVar2, MediaFormat mediaFormat) {
                q0 q0Var = q0.this;
                q0Var.getClass();
                yVar.a(j11, j12, wVar2, mediaFormat);
                q0Var.a(j11, j12, wVar2, mediaFormat);
            }
        }).b();
        a10.b(39, new j0(this)).b();
    }

    public static boolean A(w0 w0Var) {
        u2.c1[] c1VarArr;
        long d;
        if (w0Var != null) {
            try {
                ?? r12 = w0Var.f12602a;
                if (!w0Var.e) {
                    r12.g();
                } else {
                    for (u2.c1 c1Var : w0Var.f12604c) {
                        if (c1Var != null) {
                            c1Var.a();
                        }
                    }
                }
                if (!w0Var.e) {
                    d = 0;
                } else {
                    d = r12.d();
                }
                if (d != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(b2.o1 o1Var, p0 p0Var, boolean z10, int i10, boolean z11, b2.n1 n1Var, b2.l1 l1Var) {
        b2.o1 o1Var2;
        int U;
        b2.o1 o1Var3 = p0Var.f12533a;
        if (!o1Var.p()) {
            if (o1Var3.p()) {
                o1Var2 = o1Var;
            } else {
                o1Var2 = o1Var3;
            }
            try {
                Pair i11 = o1Var2.i(n1Var, l1Var, p0Var.f12534b, p0Var.f12535c);
                if (!o1Var.equals(o1Var2)) {
                    if (o1Var.b(i11.first) != -1) {
                        if (o1Var2.g(i11.first, l1Var).f3827f && o1Var2.m(l1Var.f3826c, n1Var, 0L).f3881n == o1Var2.b(i11.first)) {
                            return o1Var.i(n1Var, l1Var, o1Var.g(i11.first, l1Var).f3826c, p0Var.f12535c);
                        }
                    } else if (z10 && (U = U(n1Var, l1Var, i10, z11, i11.first, o1Var2, o1Var)) != -1) {
                        return o1Var.i(n1Var, l1Var, U, -9223372036854775807L);
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

    public static int U(b2.n1 n1Var, b2.l1 l1Var, int i10, boolean z10, Object obj, b2.o1 o1Var, b2.o1 o1Var2) {
        b2.n1 n1Var2 = n1Var;
        b2.o1 o1Var3 = o1Var;
        Object obj2 = o1Var3.m(o1Var3.g(obj, l1Var).f3826c, n1Var, 0L).f3871a;
        for (int i11 = 0; i11 < o1Var2.o(); i11++) {
            if (o1Var2.m(i11, n1Var, 0L).f3871a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = o1Var3.b(obj);
        int h = o1Var3.h();
        int i12 = -1;
        int i13 = 0;
        while (i13 < h && i12 == -1) {
            b2.o1 o1Var4 = o1Var3;
            int d = o1Var4.d(b10, l1Var, n1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i12 = o1Var2.b(o1Var4.l(d));
            i13++;
            o1Var3 = o1Var4;
            b10 = d;
            n1Var2 = n1Var;
        }
        if (i12 == -1) {
            return -1;
        }
        return o1Var2.f(i12, l1Var, false).f3826c;
    }

    public static void f(l1 l1Var) {
        try {
            synchronized (l1Var) {
                synchronized (l1Var) {
                }
                l1Var.f12477a.c(l1Var.f12479c, l1Var.d);
                return;
            }
            l1Var.f12477a.c(l1Var.f12479c, l1Var.d);
            return;
        } finally {
            l1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.A0():void");
    }

    public final boolean B(int i10, u2.f0 f0Var) {
        boolean z10;
        boolean z11;
        y0 y0Var = this.H;
        w0 w0Var = y0Var.f12634k;
        if (w0Var != null && w0Var.f12606g.f12617a.equals(f0Var)) {
            p1 p1Var = this.f12541a[i10];
            w0 w0Var2 = y0Var.f12634k;
            int i11 = p1Var.d;
            if ((i11 == 2 || i11 == 4) && p1Var.d(w0Var2) == p1Var.f12536a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p1Var.d == 3 && p1Var.d(w0Var2) == p1Var.f12538c) {
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
        i1 i1Var = this.X;
        if (i1Var.f12456l != z11 || i1Var.f12458n != i11 || i1Var.f12457m != i12) {
            this.X = i1Var.e(i12, i11, z11);
            E0(false, false);
            y0 y0Var = this.H;
            for (w0 w0Var = y0Var.f12632i; w0Var != null; w0Var = w0Var.f12611m) {
                for (x2.p pVar : w0Var.f12613o.f49227c) {
                    if (pVar != null) {
                        pVar.e(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                i1 i1Var2 = this.X;
                if (i1Var2.f12460p) {
                    this.X = i1Var2.i(false);
                }
                y0Var.m(this.m0);
                return;
            }
            int i13 = this.X.e;
            e2.i0 i0Var = this.f12557n;
            if (i13 == 3) {
                j jVar = this.f12571y;
                jVar.f12468f = true;
                jVar.f12465a.d();
                u0();
                i0Var.f(2);
            } else if (i13 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final boolean C() {
        w0 w0Var = this.H.f12632i;
        long j10 = w0Var.f12606g.f12620f;
        if (w0Var.e) {
            if (j10 == -9223372036854775807L || this.X.f12463s < j10 || !s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0() {
        long j10;
        boolean z10;
        long j11;
        long max;
        long j12;
        float f7;
        w0 w0Var = this.H.f12632i;
        if (w0Var != null) {
            if (w0Var.e) {
                j10 = w0Var.f12602a.o();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!w0Var.g()) {
                    this.H.n(w0Var);
                    u(false);
                    D();
                }
                R(j10, true);
                if (j10 != this.X.f12463s) {
                    i1 i1Var = this.X;
                    this.X = z(i1Var.f12449b, j10, i1Var.f12450c, j10, true, 5);
                }
            } else {
                j jVar = this.f12571y;
                if (w0Var != this.H.f12633j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s1 s1Var = jVar.f12465a;
                b bVar = jVar.f12467c;
                if (bVar != null && !bVar.l() && ((!z10 || jVar.f12467c.f12318n == 2) && (jVar.f12467c.m() || (!z10 && !jVar.f12467c.k())))) {
                    v0 v0Var = jVar.d;
                    v0Var.getClass();
                    long a2 = v0Var.a();
                    if (jVar.e) {
                        if (a2 < s1Var.a()) {
                            if (s1Var.f12587c) {
                                s1Var.c(s1Var.a());
                                s1Var.f12587c = false;
                            }
                        } else {
                            jVar.e = false;
                            if (jVar.f12468f) {
                                s1Var.d();
                            }
                        }
                    }
                    s1Var.c(a2);
                    b2.z0 h = v0Var.h();
                    if (!h.equals((b2.z0) s1Var.e)) {
                        s1Var.f(h);
                        jVar.f12466b.f12557n.b(16, h).b();
                    }
                } else {
                    jVar.e = true;
                    if (jVar.f12468f) {
                        s1Var.d();
                    }
                }
                long a10 = jVar.a();
                this.m0 = a10;
                long j13 = a10 - w0Var.f12614p;
                long j14 = this.X.f12463s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f12449b.b()) {
                    if (this.f12560p0) {
                        this.f12560p0 = false;
                    }
                    i1 i1Var2 = this.X;
                    i1Var2.f12448a.b(i1Var2.f12449b.f47347a);
                    int min = Math.min(this.f12559o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f12559o0 = min;
                }
                if (this.f12571y.b()) {
                    boolean z11 = !this.Y.d;
                    i1 i1Var3 = this.X;
                    this.X = z(i1Var3.f12449b, j13, i1Var3.f12450c, j13, z11, 6);
                } else {
                    i1 i1Var4 = this.X;
                    i1Var4.f12463s = j13;
                    i1Var4.f12464t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f12461q = this.H.f12635l.d();
            i1 i1Var5 = this.X;
            i1Var5.f12462r = p(i1Var5.f12461q);
            i1 i1Var6 = this.X;
            if (i1Var6.f12456l && i1Var6.e == 3 && t0(i1Var6.f12448a, i1Var6.f12449b)) {
                i1 i1Var7 = this.X;
                float f10 = 1.0f;
                if (i1Var7.f12459o.f4156a == 1.0f) {
                    g gVar = this.J;
                    long m10 = m(i1Var7.f12448a, i1Var7.f12449b.f47347a, i1Var7.f12463s);
                    long j15 = this.X.f12462r;
                    if (gVar.f12363c != -9223372036854775807L) {
                        long j16 = m10 - j15;
                        if (gVar.f12370m == -9223372036854775807L) {
                            gVar.f12370m = j16;
                            gVar.f12371n = 0L;
                        } else {
                            gVar.f12370m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            gVar.f12371n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) gVar.f12371n) * 0.999f);
                        }
                        if (gVar.f12369l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - gVar.f12369l < 1000) {
                                f10 = gVar.f12368k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        gVar.f12369l = SystemClock.elapsedRealtime();
                        long j17 = (gVar.f12371n * 3) + gVar.f12370m;
                        if (gVar.h > j17) {
                            float S = (float) e2.m0.S(j12);
                            f7 = 1.0E-7f;
                            long[] jArr = {j17, gVar.e, gVar.h - (((gVar.f12368k - 1.0f) * S) + ((gVar.f12366i - 1.0f) * S))};
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
                            long j20 = e2.m0.j(m10 - (Math.max(0.0f, gVar.f12368k - 1.0f) / 1.0E-7f), gVar.h, j17);
                            gVar.h = j20;
                            long j21 = gVar.f12365g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                gVar.h = j21;
                            }
                        }
                        long j22 = m10 - gVar.h;
                        if (Math.abs(j22) < gVar.f12361a) {
                            gVar.f12368k = 1.0f;
                        } else {
                            gVar.f12368k = e2.m0.h((f7 * ((float) j22)) + 1.0f, gVar.f12367j, gVar.f12366i);
                        }
                        f10 = gVar.f12368k;
                    }
                    if (this.f12571y.h().f4156a != f10) {
                        b2.z0 z0Var = new b2.z0(f10, this.X.f12459o.f4157b);
                        this.f12557n.e(16);
                        this.f12571y.f(z0Var);
                        y(this.X.f12459o, this.f12571y.h().f4156a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        long d;
        long j10;
        boolean b10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f12635l)) {
            b10 = false;
        } else {
            w0 w0Var = this.H.f12635l;
            if (!w0Var.e) {
                d = 0;
            } else {
                d = w0Var.f12602a.d();
            }
            long p5 = p(d);
            w0 w0Var2 = this.H.f12632i;
            if (t0(this.X.f12448a, w0Var.f12606g.f12617a)) {
                j10 = this.J.h;
            } else {
                j10 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.o1 o1Var = this.X.f12448a;
            u2.f0 f0Var = w0Var.f12606g.f12617a;
            float f7 = this.f12571y.h().f4156a;
            boolean z13 = this.X.f12456l;
            r0 r0Var = new r0(kVar, o1Var, f0Var, p5, f7, this.f12546c0, j10);
            b10 = ((i) this.f12549f).b(r0Var);
            w0 w0Var3 = this.H.f12632i;
            if (!b10 && w0Var3.e && p5 < 500000 && this.f12570x > 0) {
                w0Var3.f12602a.k(this.X.f12463s);
                b10 = ((i) this.f12549f).b(r0Var);
            }
        }
        this.f12548e0 = b10;
        if (b10) {
            w0 w0Var4 = this.H.f12635l;
            w0Var4.getClass();
            t0 t0Var = new t0();
            t0Var.f12590a = this.m0 - w0Var4.f12614p;
            float f10 = this.f12571y.h().f4156a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            u6.g(z10);
            t0Var.f12591b = f10;
            long j11 = this.f12547d0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            t0Var.f12592c = j11;
            u0 u0Var = new u0(t0Var);
            if (w0Var4.f12611m == null) {
                z12 = true;
            }
            u6.p(z12);
            w0Var4.f12602a.p(u0Var);
        }
        x0();
    }

    public final void D0(b2.o1 o1Var, u2.f0 f0Var, b2.o1 o1Var2, u2.f0 f0Var2, long j10, boolean z10) {
        Object obj;
        b2.z0 z0Var;
        boolean t02 = t0(o1Var, f0Var);
        Object obj2 = f0Var.f47347a;
        if (!t02) {
            if (f0Var.b()) {
                z0Var = b2.z0.d;
            } else {
                z0Var = this.X.f12459o;
            }
            j jVar = this.f12571y;
            if (!jVar.h().equals(z0Var)) {
                this.f12557n.e(16);
                jVar.f(z0Var);
                y(this.X.f12459o, z0Var.f4156a, false, false);
                return;
            }
            return;
        }
        b2.l1 l1Var = this.f12569w;
        int i10 = o1Var.g(obj2, l1Var).f3826c;
        b2.n1 n1Var = this.v;
        o1Var.n(i10, n1Var);
        b2.i0 i0Var = n1Var.f3877j;
        g gVar = this.J;
        gVar.getClass();
        gVar.f12363c = e2.m0.S(i0Var.f3785a);
        gVar.f12364f = e2.m0.S(i0Var.f3786b);
        gVar.f12365g = e2.m0.S(i0Var.f3787c);
        float f7 = i0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        gVar.f12367j = f7;
        float f10 = i0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        gVar.f12366i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            gVar.f12363c = -9223372036854775807L;
        }
        gVar.a();
        if (j10 != -9223372036854775807L) {
            gVar.d = m(o1Var, obj2, j10);
            gVar.a();
            return;
        }
        Object obj3 = n1Var.f3871a;
        if (!o1Var2.p()) {
            obj = o1Var2.m(o1Var2.g(f0Var2.f47347a, l1Var).f3826c, n1Var, 0L).f3871a;
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
        boolean z11;
        y0 y0Var = this.H;
        y0Var.k();
        w0 w0Var = y0Var.f12636m;
        if (w0Var != null) {
            ?? r12 = w0Var.f12602a;
            if ((!w0Var.d || w0Var.e) && !r12.c()) {
                b2.o1 o1Var = this.X.f12448a;
                if (w0Var.e) {
                    r12.s();
                }
                for (h hVar : ((i) this.f12549f).f12443p.values()) {
                    if (hVar.f12379b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!w0Var.d) {
                    long j10 = w0Var.f12606g.f12618b;
                    w0Var.d = true;
                    r12.m(this, j10);
                    return;
                }
                t0 t0Var = new t0();
                t0Var.f12590a = this.m0 - w0Var.f12614p;
                float f7 = this.f12571y.h().f4156a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u6.g(z10);
                t0Var.f12591b = f7;
                long j11 = this.f12547d0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                u6.g(z11);
                t0Var.f12592c = j11;
                u0 u0Var = new u0(t0Var);
                if (w0Var.f12611m != null) {
                    z12 = false;
                }
                u6.p(z12);
                r12.p(u0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f12546c0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f12547d0 = j10;
    }

    public final void F() {
        boolean z10;
        n0 n0Var = this.Y;
        i1 i1Var = this.X;
        boolean z11 = n0Var.f12493c;
        if (((i1) n0Var.f12494f) != i1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        n0Var.f12493c = z12;
        n0Var.f12494f = i1Var;
        if (z12) {
            h0 h0Var = this.G.f12601b;
            h0Var.f12395j.d(new hi.t(1, h0Var, n0Var));
            this.Y = new n0(this.X);
        }
    }

    public final void G(int i10) {
        p1 p1Var = this.f12541a[i10];
        try {
            w0 w0Var = this.H.f12632i;
            w0Var.getClass();
            b d = p1Var.d(w0Var);
            d.getClass();
            u2.c1 c1Var = d.f12319r;
            c1Var.getClass();
            c1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = p1Var.f12536a.f12315b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.t tVar = this.H.f12632i.f12613o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.w.c(tVar.f49227c[i10].m()), e);
            x2.t tVar2 = new x2.t((o1[]) tVar.f49226b.clone(), (x2.p[]) tVar.f49227c.clone(), tVar.d, tVar.e);
            tVar2.f49226b[i10] = null;
            tVar2.f49227c[i10] = null;
            i(i10);
            w0 w0Var2 = this.H.f12632i;
            w0Var2.a(tVar2, this.X.f12463s, false, new boolean[w0Var2.f12608j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f12545c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new y8(this, i10, z10, 1));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(m0 m0Var) {
        boolean z10;
        b2.o1 b10;
        this.Y.f(1);
        int i10 = m0Var.f12485a;
        int i11 = m0Var.f12486b;
        int i12 = m0Var.f12487c;
        u2.h1 h1Var = m0Var.d;
        h1 h1Var2 = this.I;
        ArrayList arrayList = h1Var2.f12422b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        h1Var2.f12427j = h1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((g1) arrayList.get(min)).d;
            e2.m0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                g1 g1Var = (g1) arrayList.get(min);
                g1Var.d = i13;
                i13 += g1Var.f12375a.f47299o.e.o();
                min++;
            }
            b10 = h1Var2.b();
        } else {
            b10 = h1Var2.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        int i11;
        this.Y.f(1);
        P(false, false, false, true);
        i iVar = (i) this.f12549f;
        ConcurrentHashMap concurrentHashMap = iVar.f12443p;
        long id2 = Thread.currentThread().getId();
        long j10 = iVar.f12444q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        iVar.f12444q = id2;
        j2.k kVar = this.L;
        h hVar = (h) concurrentHashMap.get(kVar);
        if (hVar == null) {
            ?? obj = new Object();
            obj.f12378a = 1;
            concurrentHashMap.put(kVar, obj);
        } else {
            hVar.f12378a++;
        }
        h hVar2 = (h) concurrentHashMap.get(kVar);
        hVar2.getClass();
        Integer num = (Integer) iVar.f12442o.get(kVar.f13971a);
        if (num != null && num.intValue() != -1) {
            i10 = num.intValue();
        } else {
            i10 = iVar.f12439l;
        }
        if (i10 == -1) {
            i10 = 13107200;
        }
        hVar2.f12380c = i10;
        hVar2.f12379b = false;
        if (this.X.f12448a.p()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        o0(i11);
        i1 i1Var = this.X;
        boolean z11 = i1Var.f12456l;
        B0(this.P.d(i1Var.e, z11), i1Var.f12458n, i1Var.f12457m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        h1 h1Var = this.I;
        ArrayList arrayList = h1Var.f12422b;
        u6.p(!h1Var.f12428k);
        h1Var.f12429l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g1 g1Var = (g1) arrayList.get(i12);
            h1Var.e(g1Var);
            h1Var.f12425g.add(g1Var);
        }
        h1Var.f12428k = true;
        this.f12557n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.l lVar = this.f12562r;
        e2.i0 i0Var = this.f12557n;
        try {
            P(true, false, true, false);
            M();
            s0 s0Var = this.f12549f;
            j2.k kVar = this.L;
            i iVar2 = (i) s0Var;
            ConcurrentHashMap concurrentHashMap = iVar2.f12443p;
            h hVar = (h) concurrentHashMap.get(kVar);
            if (hVar != null) {
                int i10 = hVar.f12378a - 1;
                hVar.f12378a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(kVar);
                    iVar2.c();
                }
            }
            if (iVar2.f12443p.isEmpty()) {
                iVar2.f12444q = -1L;
            }
            c2.e eVar = this.P;
            eVar.f4501c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f8240a.removeCallbacksAndMessages(null);
            lVar.h();
            iVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f12541a.length; i10++) {
            b bVar = this.f12543b[i10];
            synchronized (bVar.f12314a) {
                bVar.H = null;
            }
            p1 p1Var = this.f12541a[i10];
            b bVar2 = p1Var.f12536a;
            boolean z11 = true;
            if (bVar2.f12318n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar2.q();
            p1Var.e = false;
            b bVar3 = p1Var.f12538c;
            if (bVar3 != null) {
                if (bVar3.f12318n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar3.q();
                p1Var.f12539f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.h1 h1Var) {
        boolean z10 = true;
        this.Y.f(1);
        h1 h1Var2 = this.I;
        h1Var2.getClass();
        if (i10 < 0 || i10 > i11 || i11 > h1Var2.f12422b.size()) {
            z10 = false;
        }
        u6.g(z10);
        h1Var2.f12427j = h1Var;
        h1Var2.g(i10, i11);
        w(h1Var2.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        w0 w0Var = this.H.f12632i;
        if (w0Var != null && w0Var.f12606g.f12623j && this.f12542a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12544b0 = z10;
    }

    public final void R(long j10, boolean z10) {
        y0 y0Var;
        long j11;
        p1[] p1VarArr;
        x2.p[] pVarArr;
        w0 w0Var = this.H.f12632i;
        if (w0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = w0Var.f12614p;
        }
        long j12 = j10 + j11;
        this.m0 = j12;
        this.f12571y.f12465a.c(j12);
        for (p1 p1Var : this.f12541a) {
            long j13 = this.m0;
            b d = p1Var.d(w0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (w0 w0Var2 = y0Var.f12632i; w0Var2 != null; w0Var2 = w0Var2.f12611m) {
            for (x2.p pVar : w0Var2.f12613o.f49227c) {
                if (pVar != null) {
                    pVar.r();
                }
            }
        }
    }

    public final void S(b2.o1 o1Var, b2.o1 o1Var2) {
        if (o1Var.p() && o1Var2.p()) {
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
        p1[] p1VarArr;
        w0 w0Var;
        long j11;
        boolean z10 = this.T;
        long j12 = 1000;
        long j13 = f12540w0;
        if (z10) {
            this.S.getClass();
            if (this.X.e != 3) {
                j12 = j13;
            }
            for (p1 p1Var : this.f12541a) {
                long j14 = this.m0;
                long j15 = this.f12558n0;
                b bVar = p1Var.f12538c;
                b bVar2 = p1Var.f12536a;
                if (p1.h(bVar2)) {
                    j11 = bVar2.g(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f12318n != 0) {
                    j11 = Math.min(j11, bVar.g(j14, j15));
                }
                j12 = Math.min(j12, e2.m0.h0(j11));
            }
            if (this.X.m()) {
                w0 w0Var2 = this.H.f12632i;
                if (w0Var2 != null) {
                    w0Var = w0Var2.f12611m;
                } else {
                    w0Var = null;
                }
                if (w0Var != null) {
                    if ((((float) e2.m0.S(j12)) * this.X.f12459o.f4156a) + ((float) this.m0) >= ((float) w0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            j12 = j13;
        }
        this.f12557n.f8240a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        u2.f0 f0Var = this.H.f12632i.f12606g.f12617a;
        long Y = Y(f0Var, this.X.f12463s, true, false);
        if (Y != this.X.f12463s) {
            i1 i1Var = this.X;
            this.X = z(f0Var, Y, i1Var.f12450c, i1Var.d, z10, 5);
        }
    }

    public final void X(i2.p0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.X(i2.p0):void");
    }

    public final long Y(u2.f0 f0Var, long j10, boolean z10, boolean z11) {
        y0 y0Var;
        p1[] p1VarArr;
        boolean z12;
        p1[] p1VarArr2;
        int i10;
        w0();
        boolean z13 = true;
        E0(false, true);
        if (z11 || this.X.e == 3) {
            o0(2);
        }
        w0 w0Var = this.H.f12632i;
        w0 w0Var2 = w0Var;
        while (w0Var2 != null && !f0Var.equals(w0Var2.f12606g.f12617a)) {
            w0Var2 = w0Var2.f12611m;
        }
        if (z10 || w0Var != w0Var2 || (w0Var2 != null && w0Var2.f12614p + j10 < 0)) {
            for (int i11 = 0; i11 < this.f12541a.length; i11++) {
                i(i11);
            }
            this.f12566t0 = -9223372036854775807L;
            if (w0Var2 != null) {
                while (true) {
                    y0Var = this.H;
                    if (y0Var.f12632i == w0Var2) {
                        break;
                    }
                    y0Var.a();
                }
                y0Var.n(w0Var2);
                w0Var2.f12614p = 1000000000000L;
                l(this.H.f12633j.e(), new boolean[this.f12541a.length]);
                w0Var2.h = true;
            }
        }
        g();
        if (this.T) {
            for (p1 p1Var : this.f12541a) {
                if (p1Var.g() && ((i10 = p1Var.f12536a.f12315b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (w0Var2 != null) {
            this.H.n(w0Var2);
            if (!w0Var2.e) {
                w0Var2.f12606g = w0Var2.f12606g.b(j10, -9223372036854775807L);
            } else if (w0Var2.f12605f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f12448a.p() && w0Var2.f12606g.f12617a.equals(this.X.f12449b)) {
                        long j11 = w0Var2.f12614p + j10;
                        boolean z14 = true;
                        for (p1 p1Var2 : this.f12541a) {
                            if (p1Var2.g()) {
                                b d = p1Var2.d(w0Var2);
                                if (d != null && d.E(j11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = w0Var2.f12602a;
                            long j12 = this.X.f12463s;
                            r1 r1Var = r1.e;
                            if (r10.t(j12, r1Var) == w0Var2.f12602a.t(j10, r1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = w0Var2.f12602a.i(j10);
                w0Var2.f12602a.k(j10 - this.f12570x);
            }
            R(j10, z13);
            D();
        } else {
            this.H.b();
            R(j10, true);
        }
        u(false);
        this.f12557n.f(2);
        return j10;
    }

    public final void Z(l1 l1Var) {
        l1Var.getClass();
        Looper looper = l1Var.e;
        Looper looper2 = this.f12564s;
        e2.i0 i0Var = this.f12557n;
        if (looper == looper2) {
            f(l1Var);
            int i10 = this.X.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, l1Var).b();
    }

    @Override
    public final void a(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        if (this.U) {
            this.f12557n.a(37).b();
        }
    }

    public final void a0(l1 l1Var) {
        Looper looper = l1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            l1Var.a(false);
            return;
        }
        this.F.a(looper, null).d(new bc(this, l1Var));
    }

    public final void b(l0 l0Var, int i10) {
        this.Y.f(1);
        h1 h1Var = this.I;
        if (i10 == -1) {
            i10 = h1Var.f12422b.size();
        }
        w(h1Var.a(i10, l0Var.f12474a, l0Var.f12475b), false);
    }

    public final void b0(b2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.b0(b2.f, boolean):void");
    }

    public final void c() {
        p1[] p1VarArr;
        q1 q1Var;
        for (p1 p1Var : this.f12541a) {
            if (this.T) {
                q1Var = this.S;
            } else {
                q1Var = null;
            }
            p1Var.f12536a.c(18, q1Var);
            b bVar = p1Var.f12538c;
            if (bVar != null) {
                bVar.c(18, q1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.f12552h0 != z10) {
            this.f12552h0 = z10;
            if (!z10) {
                for (p1 p1Var : this.f12541a) {
                    p1Var.k();
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
        for (p1 p1Var : this.f12541a) {
            if (p1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(j0 j0Var) {
        p1[] p1VarArr;
        for (p1 p1Var : this.f12541a) {
            b bVar = p1Var.f12536a;
            if (bVar.f12315b == 4) {
                bVar.c(23, j0Var);
                b bVar2 = p1Var.f12538c;
                if (bVar2 != null) {
                    bVar2.c(23, j0Var);
                }
            }
        }
    }

    public final void e() {
        O();
        W(true);
    }

    public final void e0(l0 l0Var) {
        this.Y.f(1);
        int i10 = l0Var.f12476c;
        u2.h1 h1Var = l0Var.f12475b;
        ArrayList arrayList = l0Var.f12474a;
        if (i10 != -1) {
            this.f12556l0 = new p0(new n1(arrayList, h1Var), l0Var.f12476c, l0Var.d);
        }
        h1 h1Var2 = this.I;
        ArrayList arrayList2 = h1Var2.f12422b;
        h1Var2.g(0, arrayList2.size());
        w(h1Var2.a(arrayList2.size(), arrayList, h1Var), false);
    }

    public final void f0(boolean z10) {
        this.f12542a0 = z10;
        Q();
        if (this.f12544b0) {
            y0 y0Var = this.H;
            if (y0Var.f12633j != y0Var.f12632i) {
                W(true);
                u(false);
            }
        }
    }

    public final void g() {
        p1[] p1VarArr;
        boolean z10;
        b bVar;
        if (this.O && d()) {
            for (p1 p1Var : this.f12541a) {
                int c10 = p1Var.c();
                j jVar = this.f12571y;
                if (p1Var.f()) {
                    int i10 = p1Var.d;
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
                            bVar = p1Var.f12536a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = p1Var.f12538c;
                        bVar.getClass();
                    }
                    p1Var.a(bVar, jVar);
                    try {
                        p1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    p1Var.d = i11;
                }
                this.f12555k0 -= c10 - p1Var.c();
            }
            this.f12566t0 = -9223372036854775807L;
        }
    }

    public final void g0(b2.z0 z0Var) {
        this.f12557n.e(16);
        j jVar = this.f12571y;
        jVar.f(z0Var);
        b2.z0 h = jVar.h();
        y(h, h.f4156a, true, true);
    }

    @Override
    public final void h(u2.d0 d0Var) {
        this.f12557n.b(8, d0Var).b();
    }

    public final void h0(p pVar) {
        this.f12565s0 = pVar;
        b2.o1 o1Var = this.X.f12448a;
        y0 y0Var = this.H;
        y0Var.getClass();
        pVar.getClass();
        if (!y0Var.f12640q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < y0Var.f12640q.size(); i10++) {
                ((w0) y0Var.f12640q.get(i10)).i();
            }
            y0Var.f12640q = arrayList;
            y0Var.f12636m = null;
            y0Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        w0 w0Var;
        u2.f0 f0Var;
        w0 w0Var2;
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
                    j();
                    break;
                case 3:
                    X((p0) message.obj);
                    break;
                case 4:
                    g0((b2.z0) message.obj);
                    break;
                case 5:
                    l0((r1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((e2.i) message.obj);
                    return true;
                case 8:
                    x((u2.d0) message.obj);
                    break;
                case 9:
                    s((u2.d0) message.obj);
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
                    Z((l1) message.obj);
                    break;
                case 15:
                    a0((l1) message.obj);
                    break;
                case 16:
                    b2.z0 z0Var = (b2.z0) message.obj;
                    y(z0Var, z0Var.f4156a, true, false);
                    break;
                case 17:
                    e0((l0) message.obj);
                    break;
                case 18:
                    b((l0) message.obj, message.arg1);
                    break;
                case 19:
                    J((m0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (u2.h1) message.obj);
                    break;
                case 21:
                    n0((u2.h1) message.obj);
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
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    p0((a3.y) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.U = false;
                    p0 p0Var = this.V;
                    if (p0Var != null) {
                        X(p0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((q1) message.obj);
                    break;
                case 39:
                    d0((j0) message.obj);
                    break;
            }
        } catch (b2.w0 e) {
            boolean z15 = e.f4139a;
            int i14 = e.f4140b;
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
                t(e, i12);
            }
            i12 = i11;
            t(e, i12);
        } catch (g2.j e7) {
            t(e7, e7.f10784a);
        } catch (m e10) {
            e = e10;
            int i15 = e.f12481s;
            y0 y0Var = this.H;
            if (i15 == 1 && (w0Var2 = y0Var.f12633j) != null && e.E == null) {
                e = e.a(w0Var2.f12606g.f12617a);
            }
            int i16 = e.f12481s;
            e2.i0 i0Var = this.f12557n;
            if (i16 == 1 && (f0Var = e.E) != null && B(e.f12482w, f0Var)) {
                this.f12567u0 = true;
                g();
                w0 g10 = y0Var.g();
                w0 w0Var3 = y0Var.f12632i;
                if (w0Var3 != g10) {
                    while (w0Var3 != null) {
                        w0 w0Var4 = w0Var3.f12611m;
                        if (w0Var4 == g10) {
                            break;
                        }
                        w0Var3 = w0Var4;
                    }
                }
                y0Var.n(w0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                m mVar = this.f12561q0;
                if (mVar != null) {
                    mVar.addSuppressed(e);
                    e = this.f12561q0;
                }
                if (e.f12481s == 1 && y0Var.f12632i != y0Var.f12633j) {
                    while (true) {
                        w0Var = y0Var.f12632i;
                        if (w0Var == y0Var.f12633j) {
                            break;
                        }
                        y0Var.a();
                    }
                    u6.k(w0Var);
                    F();
                    x0 x0Var = w0Var.f12606g;
                    u2.f0 f0Var2 = x0Var.f12617a;
                    long j10 = x0Var.f12618b;
                    this.X = z(f0Var2, j10, x0Var.d, j10, true, 0);
                }
                if (e.F && (this.f12561q0 == null || (i10 = e.f4151a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f12561q0 == null) {
                        this.f12561q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f8240a;
                    Message message2 = b10.f8236a;
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
            t(e11, 2000);
        } catch (RuntimeException e12) {
            m mVar2 = new m(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.d("ExoPlayerImplInternal", "Playback error", mVar2);
            v0(true, false);
            this.X = this.X.f(mVar2);
        } catch (n2.g e13) {
            t(e13, e13.f17054a);
        } catch (u2.b e14) {
            t(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        boolean z10;
        p1[] p1VarArr = this.f12541a;
        int c10 = p1VarArr[i10].c();
        p1 p1Var = p1VarArr[i10];
        b bVar = p1Var.f12536a;
        j jVar = this.f12571y;
        p1Var.a(bVar, jVar);
        b bVar2 = p1Var.f12538c;
        if (bVar2 != null) {
            if (bVar2.f12318n != 0 && p1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            p1Var.a(bVar2, jVar);
            p1Var.i(false);
            if (z10) {
                b bVar3 = p1Var.f12536a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        p1Var.d = 0;
        H(i10, false);
        this.f12555k0 -= c10;
    }

    public final void i0(int i10) {
        this.f12550f0 = i10;
        b2.o1 o1Var = this.X.f12448a;
        y0 y0Var = this.H;
        y0Var.f12631g = i10;
        int r10 = y0Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.j():void");
    }

    public final void j0(boolean z10) {
        if (!z10) {
            p0 p0Var = this.V;
            e2.i0 i0Var = this.f12557n;
            if (p0Var != null && this.U && !i0Var.f8240a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new ah.g(this, i10, 11));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            p0 p0Var2 = this.V;
            if (p0Var2 != null) {
                X(p0Var2);
                this.V = null;
                this.U = false;
            }
        }
        this.T = z10;
        c();
    }

    public final void k(w0 w0Var, int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        p1 p1Var = this.f12541a[i10];
        boolean g10 = p1Var.g();
        b bVar = p1Var.f12536a;
        if (!g10) {
            if (w0Var == this.H.f12632i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.t tVar = w0Var.f12613o;
            o1 o1Var = tVar.f49226b[i10];
            x2.p pVar = tVar.f49227c[i10];
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
            this.f12555k0++;
            u2.c1 c1Var = w0Var.f12604c[i10];
            long j11 = w0Var.f12614p;
            u2.f0 f0Var = w0Var.f12606g.f12617a;
            b bVar2 = p1Var.f12538c;
            if (pVar != null) {
                i11 = pVar.length();
            } else {
                i11 = 0;
            }
            b2.w[] wVarArr = new b2.w[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                pVar.getClass();
                wVarArr[i12] = pVar.f(i12);
            }
            int i13 = p1Var.d;
            j jVar = this.f12571y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                p1Var.f12539f = true;
                bVar2.getClass();
                if (bVar2.f12318n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                u6.p(z15);
                bVar2.d = o1Var;
                bVar2.G = f0Var;
                bVar2.f12318n = 1;
                bVar2.o(z13, z11);
                bVar2.y(wVarArr, c1Var, j10, j11, f0Var);
                bVar2.z(j10, z13, true);
                jVar.c(bVar2);
            } else {
                p1Var.e = true;
                if (bVar.f12318n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                u6.p(z14);
                bVar.d = o1Var;
                bVar.G = f0Var;
                bVar.f12318n = 1;
                bVar.o(z13, z11);
                bVar.y(wVarArr, c1Var, j10, j11, f0Var);
                bVar.z(j10, z13, true);
                jVar.c(bVar);
            }
            k0 k0Var = new k0(this);
            b d = p1Var.d(w0Var);
            d.getClass();
            d.c(11, k0Var);
            if (z12 && z11) {
                p1Var.m();
            }
        }
    }

    public final void k0(q1 q1Var) {
        this.S = q1Var;
        c();
    }

    public final void l(long j10, boolean[] zArr) {
        p1[] p1VarArr;
        long j11;
        w0 w0Var = this.H.f12633j;
        x2.t tVar = w0Var.f12613o;
        int i10 = 0;
        while (true) {
            p1VarArr = this.f12541a;
            if (i10 >= p1VarArr.length) {
                break;
            }
            if (!tVar.b(i10)) {
                p1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < p1VarArr.length) {
            if (!tVar.b(i11) || p1VarArr[i11].d(w0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                k(w0Var, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public final void l0(r1 r1Var) {
        this.R = r1Var;
    }

    public final long m(b2.o1 o1Var, Object obj, long j10) {
        b2.l1 l1Var = this.f12569w;
        int i10 = o1Var.g(obj, l1Var).f3826c;
        b2.n1 n1Var = this.v;
        o1Var.n(i10, n1Var);
        if (n1Var.f3874f == -9223372036854775807L || !n1Var.a() || !n1Var.f3876i) {
            return -9223372036854775807L;
        }
        return e2.m0.S(e2.m0.C(n1Var.f3875g) - n1Var.f3874f) - (j10 + l1Var.e);
    }

    public final void m0(boolean z10) {
        this.f12551g0 = z10;
        b2.o1 o1Var = this.X.f12448a;
        y0 y0Var = this.H;
        y0Var.h = z10;
        int r10 = y0Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long n(w0 w0Var) {
        if (w0Var == null) {
            return 0L;
        }
        long j10 = w0Var.f12614p;
        if (!w0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            p1[] p1VarArr = this.f12541a;
            if (i10 < p1VarArr.length) {
                if (p1VarArr[i10].d(w0Var) != null) {
                    b d = p1VarArr[i10].d(w0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f12322x;
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

    public final void n0(u2.h1 h1Var) {
        this.Y.f(1);
        h1 h1Var2 = this.I;
        int size = h1Var2.f12422b.size();
        if (h1Var.getLength() != size) {
            h1Var = h1Var.i().f(0, size);
        }
        h1Var2.f12427j = h1Var;
        w(h1Var2.b(), false);
    }

    public final Pair o(b2.o1 o1Var) {
        long j10 = 0;
        if (o1Var.p()) {
            return Pair.create(i1.f12447u, 0L);
        }
        int a2 = o1Var.a(this.f12551g0);
        Pair i10 = o1Var.i(this.v, this.f12569w, a2, -9223372036854775807L);
        u2.f0 p5 = this.H.p(o1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f47347a;
            b2.l1 l1Var = this.f12569w;
            o1Var.g(obj, l1Var);
            if (p5.f47349c == l1Var.e(p5.f47348b)) {
                l1Var.f3828g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j10));
    }

    public final void o0(int i10) {
        i1 i1Var = this.X;
        if (i1Var.e != i10) {
            if (i10 != 2) {
                this.f12563r0 = -9223372036854775807L;
            }
            if (i10 != 3 && i1Var.f12460p) {
                this.X = i1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final long p(long j10) {
        w0 w0Var = this.H.f12635l;
        if (w0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - w0Var.f12614p));
    }

    public final void p0(a3.y yVar) {
        p1[] p1VarArr;
        for (p1 p1Var : this.f12541a) {
            b bVar = p1Var.f12536a;
            if (bVar.f12315b == 2) {
                bVar.c(7, yVar);
                b bVar2 = p1Var.f12538c;
                if (bVar2 != null) {
                    bVar2.c(7, yVar);
                }
            }
        }
    }

    public final void q(int i10) {
        i1 i1Var = this.X;
        B0(i10, i1Var.f12458n, i1Var.f12457m, i1Var.f12456l);
    }

    public final void q0(Object obj, e2.i iVar) {
        p1[] p1VarArr;
        for (p1 p1Var : this.f12541a) {
            b bVar = p1Var.f12536a;
            if (bVar.f12315b == 2) {
                int i10 = p1Var.d;
                if (i10 != 4 && i10 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = p1Var.f12538c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.f12557n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r() {
        r0(this.f12568v0);
    }

    public final void r0(float f7) {
        p1[] p1VarArr;
        this.f12568v0 = f7;
        float f10 = f7 * this.P.f4503g;
        for (p1 p1Var : this.f12541a) {
            b bVar = p1Var.f12536a;
            if (bVar.f12315b == 1) {
                bVar.c(2, Float.valueOf(f10));
                b bVar2 = p1Var.f12538c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s(u2.d0 d0Var) {
        y0 y0Var = this.H;
        w0 w0Var = y0Var.f12635l;
        if (w0Var != null && w0Var.f12602a == d0Var) {
            y0Var.m(this.m0);
            D();
            return;
        }
        w0 w0Var2 = y0Var.f12636m;
        if (w0Var2 != null && w0Var2.f12602a == d0Var) {
            E();
        }
    }

    public final boolean s0() {
        i1 i1Var = this.X;
        if (i1Var.f12456l && i1Var.f12458n == 0) {
            return true;
        }
        return false;
    }

    public final void t(IOException iOException, int i10) {
        m mVar = new m(0, iOException, i10);
        w0 w0Var = this.H.f12632i;
        if (w0Var != null) {
            mVar = mVar.a(w0Var.f12606g.f12617a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
        v0(false, false);
        this.X = this.X.f(mVar);
    }

    public final boolean t0(b2.o1 o1Var, u2.f0 f0Var) {
        if (!f0Var.b() && !o1Var.p()) {
            int i10 = o1Var.g(f0Var.f47347a, this.f12569w).f3826c;
            b2.n1 n1Var = this.v;
            o1Var.n(i10, n1Var);
            if (n1Var.a() && n1Var.f3876i && n1Var.f3874f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(boolean z10) {
        u2.f0 f0Var;
        long d;
        w0 w0Var = this.H.f12635l;
        if (w0Var == null) {
            f0Var = this.X.f12449b;
        } else {
            f0Var = w0Var.f12606g.f12617a;
        }
        boolean equals = this.X.f12455k.equals(f0Var);
        if (!equals) {
            this.X = this.X.c(f0Var);
        }
        i1 i1Var = this.X;
        if (w0Var == null) {
            d = i1Var.f12463s;
        } else {
            d = w0Var.d();
        }
        i1Var.f12461q = d;
        i1 i1Var2 = this.X;
        i1Var2.f12462r = p(i1Var2.f12461q);
        if ((!equals || z10) && w0Var != null && w0Var.e) {
            y0(w0Var.f12606g.f12617a, w0Var.f12613o);
        }
    }

    public final void u0() {
        w0 w0Var = this.H.f12632i;
        if (w0Var != null) {
            x2.t tVar = w0Var.f12613o;
            int i10 = 0;
            while (true) {
                p1[] p1VarArr = this.f12541a;
                if (i10 < p1VarArr.length) {
                    if (tVar.b(i10)) {
                        p1VarArr[i10].m();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void v(u2.e1 e1Var) {
        this.f12557n.b(9, (u2.d0) e1Var).b();
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f12552h0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        i iVar = (i) this.f12549f;
        ConcurrentHashMap concurrentHashMap = iVar.f12443p;
        j2.k kVar = this.L;
        h hVar = (h) concurrentHashMap.get(kVar);
        if (hVar != null) {
            int i10 = hVar.f12378a - 1;
            hVar.f12378a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(kVar);
                iVar.c();
            }
        }
        this.P.d(1, this.X.f12456l);
        o0(1);
    }

    public final void w(b2.o1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.w(b2.o1, boolean):void");
    }

    public final void w0() {
        p1[] p1VarArr;
        j jVar = this.f12571y;
        jVar.f12468f = false;
        s1 s1Var = jVar.f12465a;
        if (s1Var.f12587c) {
            s1Var.c(s1Var.a());
            s1Var.f12587c = false;
        }
        for (p1 p1Var : this.f12541a) {
            b bVar = p1Var.f12538c;
            b bVar2 = p1Var.f12536a;
            if (p1.h(bVar2)) {
                p1.b(bVar2);
            }
            if (bVar != null && bVar.f12318n != 0) {
                p1.b(bVar);
            }
        }
    }

    public final void x(u2.d0 d0Var) {
        w0 w0Var;
        y0 y0Var = this.H;
        w0 w0Var2 = y0Var.f12635l;
        j jVar = this.f12571y;
        if (w0Var2 != null && w0Var2.f12602a == d0Var) {
            w0Var2.getClass();
            if (!w0Var2.e) {
                float f7 = jVar.h().f4156a;
                i1 i1Var = this.X;
                w0Var2.f(f7, i1Var.f12448a, i1Var.f12456l);
            }
            y0(w0Var2.f12606g.f12617a, w0Var2.f12613o);
            if (w0Var2 == y0Var.f12632i) {
                R(w0Var2.f12606g.f12618b, true);
                l(y0Var.f12633j.e(), new boolean[this.f12541a.length]);
                w0Var2.h = true;
                i1 i1Var2 = this.X;
                u2.f0 f0Var = i1Var2.f12449b;
                long j10 = w0Var2.f12606g.f12618b;
                this.X = z(f0Var, j10, i1Var2.f12450c, j10, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < y0Var.f12640q.size()) {
                w0Var = (w0) y0Var.f12640q.get(i10);
                if (w0Var.f12602a == d0Var) {
                    break;
                }
                i10++;
            } else {
                w0Var = null;
                break;
            }
        }
        if (w0Var != null) {
            u6.p(true ^ w0Var.e);
            float f10 = jVar.h().f4156a;
            i1 i1Var3 = this.X;
            w0Var.f(f10, i1Var3.f12448a, i1Var3.f12456l);
            w0 w0Var3 = y0Var.f12636m;
            if (w0Var3 != null && w0Var3.f12602a == d0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z10;
        w0 w0Var = this.H.f12635l;
        if (!this.f12548e0 && (w0Var == null || !w0Var.f12602a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        i1 i1Var = this.X;
        if (z10 != i1Var.f12452g) {
            this.X = i1Var.b(z10);
        }
    }

    public final void y(b2.z0 z0Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.Y.f(1);
            }
            this.X = this.X.g(z0Var);
        }
        float f10 = z0Var.f4156a;
        w0 w0Var = this.H.f12632i;
        while (true) {
            i10 = 0;
            if (w0Var == null) {
                break;
            }
            x2.p[] pVarArr = w0Var.f12613o.f49227c;
            int length = pVarArr.length;
            while (i10 < length) {
                x2.p pVar = pVarArr[i10];
                if (pVar != null) {
                    pVar.p(f10);
                }
                i10++;
            }
            w0Var = w0Var.f12611m;
        }
        p1[] p1VarArr = this.f12541a;
        int length2 = p1VarArr.length;
        while (i10 < length2) {
            p1 p1Var = p1VarArr[i10];
            float f11 = z0Var.f4156a;
            p1Var.f12536a.A(f7, f11);
            b bVar = p1Var.f12538c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(u2.f0 r10, x2.t r11) {
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.y0(u2.f0, x2.t):void");
    }

    public final i1 z(u2.f0 f0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        x1 x1Var;
        boolean z13;
        boolean z14;
        if (!this.f12560p0 && j10 == this.X.f12463s && f0Var.equals(this.X.f12449b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f12560p0 = z11;
        Q();
        i1 i1Var = this.X;
        u2.q1 q1Var = i1Var.h;
        x2.t tVar = i1Var.f12453i;
        List list = i1Var.f12454j;
        if (this.I.f12428k) {
            w0 w0Var = this.H.f12632i;
            if (w0Var == null) {
                q1Var = u2.q1.d;
            } else {
                q1Var = w0Var.f12612n;
            }
            if (w0Var == null) {
                tVar = this.e;
            } else {
                tVar = w0Var.f12613o;
            }
            x2.p[] pVarArr = tVar.f49227c;
            ?? g0Var = new e9.g0(4);
            boolean z15 = false;
            for (x2.p pVar : pVarArr) {
                if (pVar != null) {
                    b2.t0 t0Var = pVar.f(0).f4125l;
                    if (t0Var == null) {
                        g0Var.c(new b2.t0(new b2.s0[0]));
                    } else {
                        g0Var.c(t0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                x1Var = g0Var.f();
            } else {
                e9.l0 l0Var = e9.n0.f8477b;
                x1Var = x1.e;
            }
            list = x1Var;
            if (w0Var != null) {
                x0 x0Var = w0Var.f12606g;
                if (x0Var.d != j11) {
                    w0Var.f12606g = x0Var.a(j11);
                }
            }
            p1[] p1VarArr = this.f12541a;
            y0 y0Var = this.H;
            w0 w0Var2 = y0Var.f12632i;
            if (w0Var2 == y0Var.f12633j && w0Var2 != null) {
                x2.t tVar2 = w0Var2.f12613o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < p1VarArr.length) {
                        if (tVar2.b(i11)) {
                            if (p1VarArr[i11].f12536a.f12315b != 1) {
                                z13 = false;
                                break;
                            } else if (tVar2.f49226b[i11].f12530a != 0) {
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
                if (z14 != this.f12554j0) {
                    this.f12554j0 = z14;
                    if (!z14 && this.X.f12460p) {
                        this.f12557n.f(2);
                    }
                }
            }
        } else if (!f0Var.equals(i1Var.f12449b)) {
            q1Var = u2.q1.d;
            tVar = this.e;
            list = x1.e;
        }
        u2.q1 q1Var2 = q1Var;
        x2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            n0 n0Var = this.Y;
            if (n0Var.d && n0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
            } else {
                n0Var.f12493c = true;
                n0Var.d = true;
                n0Var.e = i10;
            }
        }
        i1 i1Var2 = this.X;
        return i1Var2.d(f0Var, j10, j11, j12, p(i1Var2.f12461q), q1Var2, tVar3, list2);
    }

    public final void z0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.Y.f(1);
        h1 h1Var = this.I;
        h1Var.getClass();
        ArrayList arrayList = h1Var.f12422b;
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
            ((g1) arrayList.get(i12)).f12375a.t((b2.o0) list.get(i12 - i10));
        }
        w(h1Var.b(), false);
    }
}
