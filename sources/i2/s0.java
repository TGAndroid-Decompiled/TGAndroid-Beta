package i2;

import a8.yb;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import bi.u8;
import fi.ua;
import hi.u2;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class s0 implements Handler.Callback, u2.d0, l1, a3.y {
    public static final long f13727w0 = e2.n0.h0(10000);
    public final ArrayList E;
    public final e2.g0 F;
    public final x G;
    public final a1 H;
    public final j1 I;
    public final g J;
    public final long K;
    public final j2.j L;
    public final j2.e M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.e P;
    public final boolean Q;
    public t1 R;
    public s1 S;
    public boolean T;
    public boolean U;
    public r0 V;
    public int W;
    public k1 X;
    public p0 Y;
    public boolean Z;
    public final r1[] f13728a;
    public boolean f13729a0;
    public final b[] f13730b;
    public boolean f13731b0;
    public final boolean[] f13732c;
    public boolean f13733c0;
    public final x2.t d;
    public long f13734d0;
    public final x2.u e;
    public boolean f13735e0;
    public final u0 f13736f;
    public int f13737f0;
    public boolean f13738g0;
    public final y2.c h;
    public boolean f13739h0;
    public boolean f13740i0;
    public boolean f13741j0;
    public int f13742k0;
    public r0 f13743l0;
    public long m0;
    public final e2.i0 f13744n;
    public long f13745n0;
    public int f13746o0;
    public boolean f13747p0;
    public m f13748q0;
    public final k6.m f13749r;
    public long f13750r0;
    public final Looper f13751s;
    public p f13752s0;
    public long f13753t0;
    public boolean f13754u0;
    public final b2.o1 v;
    public float f13755v0;
    public final b2.m1 f13756w;
    public final long f13757x;
    public final j f13758y;

    public s0(Context context, b[] bVarArr, b[] bVarArr2, x2.t tVar, x2.u uVar, u0 u0Var, y2.c cVar, int i10, boolean z10, j2.e eVar, t1 t1Var, g gVar, long j10, Looper looper, e2.g0 g0Var, x xVar, j2.j jVar, final a3.y yVar, boolean z11) {
        p pVar = p.f13696a;
        this.f13753t0 = -9223372036854775807L;
        this.G = xVar;
        this.d = tVar;
        this.e = uVar;
        this.f13736f = u0Var;
        this.h = cVar;
        this.f13737f0 = i10;
        this.f13738g0 = z10;
        this.R = t1Var;
        this.J = gVar;
        this.K = j10;
        this.f13729a0 = false;
        this.F = g0Var;
        this.L = jVar;
        this.f13752s0 = pVar;
        this.M = eVar;
        this.f13755v0 = 1.0f;
        this.S = s1.f13759b;
        this.Q = z11;
        this.f13750r0 = -9223372036854775807L;
        this.f13734d0 = -9223372036854775807L;
        this.f13757x = ((i) u0Var).f13569n;
        b2.l1 l1Var = b2.p1.f3348a;
        k1 k10 = k1.k(uVar);
        this.X = k10;
        this.Y = new p0(k10);
        this.f13730b = new b[bVarArr.length];
        this.f13732c = new boolean[bVarArr.length];
        x2.o oVar = (x2.o) tVar;
        oVar.getClass();
        this.f13728a = new r1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f13493f = jVar;
            bVar.h = g0Var;
            this.f13730b[i11] = bVar;
            b bVar2 = this.f13730b[i11];
            synchronized (bVar2.f13490a) {
                bVar2.H = oVar;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f13493f = jVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f13728a[i11] = new r1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.f13758y = new j(this, g0Var);
        this.E = new ArrayList();
        this.v = new b2.o1();
        this.f13756w = new b2.m1();
        yb.p(tVar.f51358a == null);
        tVar.f51358a = this;
        tVar.f51359b = cVar;
        this.f13747p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new a1(eVar, a2, new e1.c(this, 23));
        this.I = new j1(this, eVar, a2, jVar);
        k6.m mVar = new k6.m(7);
        this.f13749r = mVar;
        Looper e = mVar.e();
        this.f13751s = e;
        e2.i0 a10 = g0Var.a(e, this);
        this.f13744n = a10;
        this.P = new c2.e(context, e, this);
        a10.b(35, new a3.y() {
            @Override
            public final void a(long j11, long j12, b2.x xVar2, MediaFormat mediaFormat) {
                s0 s0Var = s0.this;
                s0Var.getClass();
                yVar.a(j11, j12, xVar2, mediaFormat);
                s0Var.a(j11, j12, xVar2, mediaFormat);
            }
        }).b();
        a10.b(39, new l0(this)).b();
    }

    public static boolean A(y0 y0Var) {
        u2.d1[] d1VarArr;
        long b10;
        if (y0Var != null) {
            try {
                ?? r12 = y0Var.f13790a;
                if (!y0Var.e) {
                    r12.g();
                } else {
                    for (u2.d1 d1Var : y0Var.f13792c) {
                        if (d1Var != null) {
                            d1Var.d();
                        }
                    }
                }
                if (!y0Var.e) {
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

    public static Pair T(b2.p1 p1Var, r0 r0Var, boolean z10, int i10, boolean z11, b2.o1 o1Var, b2.m1 m1Var) {
        b2.p1 p1Var2;
        int U;
        b2.p1 p1Var3 = r0Var.f13719a;
        if (!p1Var.p()) {
            if (p1Var3.p()) {
                p1Var2 = p1Var;
            } else {
                p1Var2 = p1Var3;
            }
            try {
                Pair i11 = p1Var2.i(o1Var, m1Var, r0Var.f13720b, r0Var.f13721c);
                if (!p1Var.equals(p1Var2)) {
                    if (p1Var.b(i11.first) != -1) {
                        if (p1Var2.g(i11.first, m1Var).f3281f && p1Var2.m(m1Var.f3280c, o1Var, 0L).f3335n == p1Var2.b(i11.first)) {
                            return p1Var.i(o1Var, m1Var, p1Var.g(i11.first, m1Var).f3280c, r0Var.f13721c);
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
        Object obj2 = p1Var3.m(p1Var3.g(obj, m1Var).f3280c, o1Var, 0L).f3325a;
        for (int i11 = 0; i11 < p1Var2.o(); i11++) {
            if (p1Var2.m(i11, o1Var, 0L).f3325a.equals(obj2)) {
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
        return p1Var2.f(i12, m1Var, false).f3280c;
    }

    public static void f(n1 n1Var) {
        try {
            synchronized (n1Var) {
                synchronized (n1Var) {
                }
                n1Var.f13666a.c(n1Var.f13668c, n1Var.d);
                return;
            }
            n1Var.f13666a.c(n1Var.f13668c, n1Var.d);
            return;
        } finally {
            n1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.A0():void");
    }

    public final boolean B(int i10, u2.g0 g0Var) {
        boolean z10;
        boolean z11;
        a1 a1Var = this.H;
        y0 y0Var = a1Var.f13483k;
        if (y0Var != null && y0Var.f13794g.f13806a.equals(g0Var)) {
            r1 r1Var = this.f13728a[i10];
            y0 y0Var2 = a1Var.f13483k;
            int i11 = r1Var.d;
            if ((i11 == 2 || i11 == 4) && r1Var.d(y0Var2) == r1Var.f13722a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r1Var.d == 3 && r1Var.d(y0Var2) == r1Var.f13724c) {
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
        x2.q[] qVarArr;
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
        if (k1Var.f13646l != z11 || k1Var.f13648n != i11 || k1Var.f13647m != i12) {
            this.X = k1Var.e(i12, i11, z11);
            E0(false, false);
            a1 a1Var = this.H;
            for (y0 y0Var = a1Var.f13481i; y0Var != null; y0Var = y0Var.f13799m) {
                for (x2.q qVar : y0Var.f13801o.f51363c) {
                    if (qVar != null) {
                        qVar.e(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                k1 k1Var2 = this.X;
                if (k1Var2.f13650p) {
                    this.X = k1Var2.i(false);
                }
                a1Var.m(this.m0);
                return;
            }
            int i13 = this.X.e;
            e2.i0 i0Var = this.f13744n;
            if (i13 == 3) {
                j jVar = this.f13758y;
                jVar.f13582f = true;
                jVar.f13579a.d();
                u0();
                i0Var.f(2);
            } else if (i13 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final boolean C() {
        y0 y0Var = this.H.f13481i;
        long j10 = y0Var.f13794g.f13809f;
        if (y0Var.e) {
            if (j10 == -9223372036854775807L || this.X.f13653s < j10 || !s0()) {
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
        y0 y0Var = this.H.f13481i;
        if (y0Var != null) {
            if (y0Var.e) {
                j10 = y0Var.f13790a.l();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!y0Var.g()) {
                    this.H.n(y0Var);
                    v(false);
                    D();
                }
                R(j10, true);
                if (j10 != this.X.f13653s) {
                    k1 k1Var = this.X;
                    this.X = z(k1Var.f13639b, j10, k1Var.f13640c, j10, true, 5);
                }
            } else {
                j jVar = this.f13758y;
                if (y0Var != this.H.f13482j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1 u1Var = jVar.f13579a;
                b bVar = jVar.f13581c;
                if (bVar != null && !bVar.l() && ((!z10 || jVar.f13581c.f13494n == 2) && (jVar.f13581c.m() || (!z10 && !jVar.f13581c.k())))) {
                    x0 x0Var = jVar.d;
                    x0Var.getClass();
                    long a2 = x0Var.a();
                    if (jVar.e) {
                        if (a2 < u1Var.a()) {
                            if (u1Var.f13774c) {
                                u1Var.c(u1Var.a());
                                u1Var.f13774c = false;
                            }
                        } else {
                            jVar.e = false;
                            if (jVar.f13582f) {
                                u1Var.d();
                            }
                        }
                    }
                    u1Var.c(a2);
                    b2.a1 h = x0Var.h();
                    if (!h.equals((b2.a1) u1Var.e)) {
                        u1Var.f(h);
                        jVar.f13580b.f13744n.b(16, h).b();
                    }
                } else {
                    jVar.e = true;
                    if (jVar.f13582f) {
                        u1Var.d();
                    }
                }
                long a10 = jVar.a();
                this.m0 = a10;
                long j13 = a10 - y0Var.f13802p;
                long j14 = this.X.f13653s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f13639b.b()) {
                    if (this.f13747p0) {
                        this.f13747p0 = false;
                    }
                    k1 k1Var2 = this.X;
                    k1Var2.f13638a.b(k1Var2.f13639b.f49297a);
                    int min = Math.min(this.f13746o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f13746o0 = min;
                }
                if (this.f13758y.b()) {
                    boolean z11 = !this.Y.d;
                    k1 k1Var3 = this.X;
                    this.X = z(k1Var3.f13639b, j13, k1Var3.f13640c, j13, z11, 6);
                } else {
                    k1 k1Var4 = this.X;
                    k1Var4.f13653s = j13;
                    k1Var4.f13654t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f13651q = this.H.f13484l.d();
            k1 k1Var5 = this.X;
            k1Var5.f13652r = p(k1Var5.f13651q);
            k1 k1Var6 = this.X;
            if (k1Var6.f13646l && k1Var6.e == 3 && t0(k1Var6.f13638a, k1Var6.f13639b)) {
                k1 k1Var7 = this.X;
                float f10 = 1.0f;
                if (k1Var7.f13649o.f3140a == 1.0f) {
                    g gVar = this.J;
                    long l4 = l(k1Var7.f13638a, k1Var7.f13639b.f49297a, k1Var7.f13653s);
                    long j15 = this.X.f13652r;
                    if (gVar.f13538c != -9223372036854775807L) {
                        long j16 = l4 - j15;
                        if (gVar.f13545m == -9223372036854775807L) {
                            gVar.f13545m = j16;
                            gVar.f13546n = 0L;
                        } else {
                            gVar.f13545m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            gVar.f13546n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) gVar.f13546n) * 0.999f);
                        }
                        if (gVar.f13544l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - gVar.f13544l < 1000) {
                                f10 = gVar.f13543k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        gVar.f13544l = SystemClock.elapsedRealtime();
                        long j17 = (gVar.f13546n * 3) + gVar.f13545m;
                        if (gVar.h > j17) {
                            float S = (float) e2.n0.S(j12);
                            f7 = 1.0E-7f;
                            long[] jArr = {j17, gVar.e, gVar.h - (((gVar.f13543k - 1.0f) * S) + ((gVar.f13541i - 1.0f) * S))};
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
                            long j20 = e2.n0.j(l4 - (Math.max(0.0f, gVar.f13543k - 1.0f) / 1.0E-7f), gVar.h, j17);
                            gVar.h = j20;
                            long j21 = gVar.f13540g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                gVar.h = j21;
                            }
                        }
                        long j22 = l4 - gVar.h;
                        if (Math.abs(j22) < gVar.f13536a) {
                            gVar.f13543k = 1.0f;
                        } else {
                            gVar.f13543k = e2.n0.h((f7 * ((float) j22)) + 1.0f, gVar.f13542j, gVar.f13541i);
                        }
                        f10 = gVar.f13543k;
                    }
                    if (this.f13758y.h().f3140a != f10) {
                        b2.a1 a1Var = new b2.a1(f10, this.X.f13649o.f3141b);
                        this.f13744n.e(16);
                        this.f13758y.f(a1Var);
                        y(this.X.f13649o, this.f13758y.h().f3140a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        long b10;
        long j10;
        boolean b11;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f13484l)) {
            b11 = false;
        } else {
            y0 y0Var = this.H.f13484l;
            if (!y0Var.e) {
                b10 = 0;
            } else {
                b10 = y0Var.f13790a.b();
            }
            long p10 = p(b10);
            y0 y0Var2 = this.H.f13481i;
            if (t0(this.X.f13638a, y0Var.f13794g.f13806a)) {
                j10 = this.J.h;
            } else {
                j10 = -9223372036854775807L;
            }
            j2.j jVar = this.L;
            b2.p1 p1Var = this.X.f13638a;
            u2.g0 g0Var = y0Var.f13794g.f13806a;
            float f7 = this.f13758y.h().f3140a;
            boolean z13 = this.X.f13646l;
            t0 t0Var = new t0(jVar, p1Var, g0Var, p10, f7, this.f13733c0, j10);
            b11 = ((i) this.f13736f).b(t0Var);
            y0 y0Var3 = this.H.f13481i;
            if (!b11 && y0Var3.e && p10 < 500000 && this.f13757x > 0) {
                y0Var3.f13790a.i(this.X.f13653s);
                b11 = ((i) this.f13736f).b(t0Var);
            }
        }
        this.f13735e0 = b11;
        if (b11) {
            y0 y0Var4 = this.H.f13484l;
            y0Var4.getClass();
            v0 v0Var = new v0();
            v0Var.f13778a = this.m0 - y0Var4.f13802p;
            float f10 = this.f13758y.h().f3140a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            yb.g(z10);
            v0Var.f13779b = f10;
            long j11 = this.f13734d0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            yb.g(z11);
            v0Var.f13780c = j11;
            w0 w0Var = new w0(v0Var);
            if (y0Var4.f13799m == null) {
                z12 = true;
            }
            yb.p(z12);
            y0Var4.f13790a.m(w0Var);
        }
        x0();
    }

    public final void D0(b2.p1 p1Var, u2.g0 g0Var, b2.p1 p1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        Object obj;
        b2.a1 a1Var;
        boolean t02 = t0(p1Var, g0Var);
        Object obj2 = g0Var.f49297a;
        if (!t02) {
            if (g0Var.b()) {
                a1Var = b2.a1.d;
            } else {
                a1Var = this.X.f13649o;
            }
            j jVar = this.f13758y;
            if (!jVar.h().equals(a1Var)) {
                this.f13744n.e(16);
                jVar.f(a1Var);
                y(this.X.f13649o, a1Var.f3140a, false, false);
                return;
            }
            return;
        }
        b2.m1 m1Var = this.f13756w;
        int i10 = p1Var.g(obj2, m1Var).f3280c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        b2.j0 j0Var = o1Var.f3331j;
        g gVar = this.J;
        gVar.getClass();
        gVar.f13538c = e2.n0.S(j0Var.f3239a);
        gVar.f13539f = e2.n0.S(j0Var.f3240b);
        gVar.f13540g = e2.n0.S(j0Var.f3241c);
        float f7 = j0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        gVar.f13542j = f7;
        float f10 = j0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        gVar.f13541i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            gVar.f13538c = -9223372036854775807L;
        }
        gVar.a();
        if (j10 != -9223372036854775807L) {
            gVar.d = l(p1Var, obj2, j10);
            gVar.a();
            return;
        }
        Object obj3 = o1Var.f3325a;
        if (!p1Var2.p()) {
            obj = p1Var2.m(p1Var2.g(g0Var2.f49297a, m1Var).f3280c, o1Var, 0L).f3325a;
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
        a1 a1Var = this.H;
        a1Var.k();
        y0 y0Var = a1Var.f13485m;
        if (y0Var != null) {
            ?? r12 = y0Var.f13790a;
            if ((!y0Var.d || y0Var.e) && !r12.c()) {
                b2.p1 p1Var = this.X.f13638a;
                if (y0Var.e) {
                    r12.q();
                }
                for (h hVar : ((i) this.f13736f).f13571p.values()) {
                    if (hVar.f13551b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!y0Var.d) {
                    long j10 = y0Var.f13794g.f13807b;
                    y0Var.d = true;
                    r12.k(this, j10);
                    return;
                }
                v0 v0Var = new v0();
                v0Var.f13778a = this.m0 - y0Var.f13802p;
                float f7 = this.f13758y.h().f3140a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                yb.g(z10);
                v0Var.f13779b = f7;
                long j11 = this.f13734d0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                yb.g(z11);
                v0Var.f13780c = j11;
                w0 w0Var = new w0(v0Var);
                if (y0Var.f13799m != null) {
                    z12 = false;
                }
                yb.p(z12);
                r12.m(w0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f13733c0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f13734d0 = j10;
    }

    public final void F() {
        boolean z10;
        p0 p0Var = this.Y;
        k1 k1Var = this.X;
        boolean z11 = p0Var.f13699c;
        if (((k1) p0Var.f13700f) != k1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        p0Var.f13699c = z12;
        p0Var.f13700f = k1Var;
        if (z12) {
            j0 j0Var = this.G.f13787b;
            j0Var.f13597j.d(new u2(5, j0Var, p0Var));
            this.Y = new p0(this.X);
        }
    }

    public final void G(int i10) {
        r1 r1Var = this.f13728a[i10];
        try {
            y0 y0Var = this.H.f13481i;
            y0Var.getClass();
            b d = r1Var.d(y0Var);
            d.getClass();
            u2.d1 d1Var = d.f13495r;
            d1Var.getClass();
            d1Var.d();
        } catch (IOException | RuntimeException e) {
            int i11 = r1Var.f13722a.f13491b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.u uVar = this.H.f13481i.f13801o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.x.c(uVar.f51363c[i10].m()), e);
            x2.u uVar2 = new x2.u((q1[]) uVar.f51362b.clone(), (x2.q[]) uVar.f51363c.clone(), uVar.d, uVar.e);
            uVar2.f51362b[i10] = null;
            uVar2.f51363c[i10] = null;
            h(i10);
            y0 y0Var2 = this.H.f13481i;
            y0Var2.a(uVar2, this.X.f13653s, false, new boolean[y0Var2.f13796j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f13732c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new u8(this, i10, z10, 1));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(o0 o0Var) {
        boolean z10;
        b2.p1 b10;
        this.Y.f(1);
        int i10 = o0Var.f13692a;
        int i11 = o0Var.f13693b;
        int i12 = o0Var.f13694c;
        u2.i1 i1Var = o0Var.d;
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.f13624b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        j1Var.f13629j = i1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((i1) arrayList.get(min)).d;
            e2.n0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                i1 i1Var2 = (i1) arrayList.get(min);
                i1Var2.d = i13;
                i13 += i1Var2.f13576a.f49249o.e.o();
                min++;
            }
            b10 = j1Var.b();
        } else {
            b10 = j1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        int i11;
        this.Y.f(1);
        P(false, false, false, true);
        i iVar = (i) this.f13736f;
        ConcurrentHashMap concurrentHashMap = iVar.f13571p;
        long id2 = Thread.currentThread().getId();
        long j10 = iVar.f13572q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        iVar.f13572q = id2;
        j2.j jVar = this.L;
        h hVar = (h) concurrentHashMap.get(jVar);
        if (hVar == null) {
            ?? obj = new Object();
            obj.f13550a = 1;
            concurrentHashMap.put(jVar, obj);
        } else {
            hVar.f13550a++;
        }
        h hVar2 = (h) concurrentHashMap.get(jVar);
        hVar2.getClass();
        Integer num = (Integer) iVar.f13570o.get(jVar.f15227a);
        if (num != null && num.intValue() != -1) {
            i10 = num.intValue();
        } else {
            i10 = iVar.f13567l;
        }
        if (i10 == -1) {
            i10 = 13107200;
        }
        hVar2.f13552c = i10;
        hVar2.f13551b = false;
        if (this.X.f13638a.p()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        o0(i11);
        k1 k1Var = this.X;
        boolean z11 = k1Var.f13646l;
        B0(this.P.d(k1Var.e, z11), k1Var.f13648n, k1Var.f13647m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.f13624b;
        yb.p(!j1Var.f13630k);
        j1Var.f13631l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i1 i1Var = (i1) arrayList.get(i12);
            j1Var.e(i1Var);
            j1Var.f13627g.add(i1Var);
        }
        j1Var.f13630k = true;
        this.f13744n.f(2);
    }

    public final void L(e2.i iVar) {
        k6.m mVar = this.f13749r;
        e2.i0 i0Var = this.f13744n;
        try {
            P(true, false, true, false);
            M();
            u0 u0Var = this.f13736f;
            j2.j jVar = this.L;
            i iVar2 = (i) u0Var;
            ConcurrentHashMap concurrentHashMap = iVar2.f13571p;
            h hVar = (h) concurrentHashMap.get(jVar);
            if (hVar != null) {
                int i10 = hVar.f13550a - 1;
                hVar.f13550a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(jVar);
                    iVar2.c();
                }
            }
            if (iVar2.f13571p.isEmpty()) {
                iVar2.f13572q = -1L;
            }
            c2.e eVar = this.P;
            eVar.f5937c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f9672a.removeCallbacksAndMessages(null);
            mVar.g();
            iVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f13728a.length; i10++) {
            b bVar = this.f13730b[i10];
            synchronized (bVar.f13490a) {
                bVar.H = null;
            }
            r1 r1Var = this.f13728a[i10];
            b bVar2 = r1Var.f13722a;
            boolean z11 = true;
            if (bVar2.f13494n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            bVar2.q();
            r1Var.e = false;
            b bVar3 = r1Var.f13724c;
            if (bVar3 != null) {
                if (bVar3.f13494n != 0) {
                    z11 = false;
                }
                yb.p(z11);
                bVar3.q();
                r1Var.f13725f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        boolean z10 = true;
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > j1Var.f13624b.size()) {
            z10 = false;
        }
        yb.g(z10);
        j1Var.f13629j = i1Var;
        j1Var.g(i10, i11);
        w(j1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        y0 y0Var = this.H.f13481i;
        if (y0Var != null && y0Var.f13794g.f13812j && this.f13729a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13731b0 = z10;
    }

    public final void R(long j10, boolean z10) {
        a1 a1Var;
        long j11;
        r1[] r1VarArr;
        x2.q[] qVarArr;
        y0 y0Var = this.H.f13481i;
        if (y0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = y0Var.f13802p;
        }
        long j12 = j10 + j11;
        this.m0 = j12;
        this.f13758y.f13579a.c(j12);
        for (r1 r1Var : this.f13728a) {
            long j13 = this.m0;
            b d = r1Var.d(y0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (y0 y0Var2 = a1Var.f13481i; y0Var2 != null; y0Var2 = y0Var2.f13799m) {
            for (x2.q qVar : y0Var2.f13801o.f51363c) {
                if (qVar != null) {
                    qVar.r();
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
            a1.g.B(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j10) {
        r1[] r1VarArr;
        y0 y0Var;
        long j11;
        boolean z10 = this.T;
        long j12 = 1000;
        long j13 = f13727w0;
        if (z10) {
            this.S.getClass();
            if (this.X.e != 3) {
                j12 = j13;
            }
            for (r1 r1Var : this.f13728a) {
                long j14 = this.m0;
                long j15 = this.f13745n0;
                b bVar = r1Var.f13724c;
                b bVar2 = r1Var.f13722a;
                if (r1.h(bVar2)) {
                    j11 = bVar2.g(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f13494n != 0) {
                    j11 = Math.min(j11, bVar.g(j14, j15));
                }
                j12 = Math.min(j12, e2.n0.h0(j11));
            }
            if (this.X.m()) {
                y0 y0Var2 = this.H.f13481i;
                if (y0Var2 != null) {
                    y0Var = y0Var2.f13799m;
                } else {
                    y0Var = null;
                }
                if (y0Var != null) {
                    if ((((float) e2.n0.S(j12)) * this.X.f13649o.f3140a) + ((float) this.m0) >= ((float) y0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            j12 = j13;
        }
        this.f13744n.f9672a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.f13481i.f13794g.f13806a;
        long Y = Y(g0Var, this.X.f13653s, true, false);
        if (Y != this.X.f13653s) {
            k1 k1Var = this.X;
            this.X = z(g0Var, Y, k1Var.f13640c, k1Var.d, z10, 5);
        }
    }

    public final void X(i2.r0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.X(i2.r0):void");
    }

    public final long Y(u2.g0 g0Var, long j10, boolean z10, boolean z11) {
        a1 a1Var;
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
        y0 y0Var = this.H.f13481i;
        y0 y0Var2 = y0Var;
        while (y0Var2 != null && !g0Var.equals(y0Var2.f13794g.f13806a)) {
            y0Var2 = y0Var2.f13799m;
        }
        if (z10 || y0Var != y0Var2 || (y0Var2 != null && y0Var2.f13802p + j10 < 0)) {
            for (int i11 = 0; i11 < this.f13728a.length; i11++) {
                h(i11);
            }
            this.f13753t0 = -9223372036854775807L;
            if (y0Var2 != null) {
                while (true) {
                    a1Var = this.H;
                    if (a1Var.f13481i == y0Var2) {
                        break;
                    }
                    a1Var.a();
                }
                a1Var.n(y0Var2);
                y0Var2.f13802p = 1000000000000L;
                k(this.H.f13482j.e(), new boolean[this.f13728a.length]);
                y0Var2.h = true;
            }
        }
        g();
        if (this.T) {
            for (r1 r1Var : this.f13728a) {
                if (r1Var.g() && ((i10 = r1Var.f13722a.f13491b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (y0Var2 != null) {
            this.H.n(y0Var2);
            if (!y0Var2.e) {
                y0Var2.f13794g = y0Var2.f13794g.b(j10, -9223372036854775807L);
            } else if (y0Var2.f13793f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f13638a.p() && y0Var2.f13794g.f13806a.equals(this.X.f13639b)) {
                        long j11 = y0Var2.f13802p + j10;
                        boolean z14 = true;
                        for (r1 r1Var2 : this.f13728a) {
                            if (r1Var2.g()) {
                                b d = r1Var2.d(y0Var2);
                                if (d != null && d.E(j11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = y0Var2.f13790a;
                            long j12 = this.X.f13653s;
                            t1 t1Var = t1.e;
                            if (r10.r(j12, t1Var) == y0Var2.f13790a.r(j10, t1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = y0Var2.f13790a.h(j10);
                y0Var2.f13790a.i(j10 - this.f13757x);
            }
            R(j10, z13);
            D();
        } else {
            this.H.b();
            R(j10, true);
        }
        v(false);
        this.f13744n.f(2);
        return j10;
    }

    public final void Z(n1 n1Var) {
        n1Var.getClass();
        Looper looper = n1Var.e;
        Looper looper2 = this.f13751s;
        e2.i0 i0Var = this.f13744n;
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
            this.f13744n.a(37).b();
        }
    }

    public final void a0(n1 n1Var) {
        Looper looper = n1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            n1Var.a(false);
            return;
        }
        this.F.a(looper, null).d(new ua(this, n1Var));
    }

    public final void b(n0 n0Var, int i10) {
        this.Y.f(1);
        j1 j1Var = this.I;
        if (i10 == -1) {
            i10 = j1Var.f13624b.size();
        }
        w(j1Var.a(i10, n0Var.f13663a, n0Var.f13664b), false);
    }

    public final void b0(b2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.b0(b2.f, boolean):void");
    }

    public final void c() {
        r1[] r1VarArr;
        s1 s1Var;
        for (r1 r1Var : this.f13728a) {
            if (this.T) {
                s1Var = this.S;
            } else {
                s1Var = null;
            }
            r1Var.f13722a.c(18, s1Var);
            b bVar = r1Var.f13724c;
            if (bVar != null) {
                bVar.c(18, s1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.f13739h0 != z10) {
            this.f13739h0 = z10;
            if (!z10) {
                for (r1 r1Var : this.f13728a) {
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
        for (r1 r1Var : this.f13728a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(l0 l0Var) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f13728a) {
            b bVar = r1Var.f13722a;
            if (bVar.f13491b == 4) {
                bVar.c(23, l0Var);
                b bVar2 = r1Var.f13724c;
                if (bVar2 != null) {
                    bVar2.c(23, l0Var);
                }
            }
        }
    }

    public final void e() {
        O();
        W(true);
    }

    public final void e0(n0 n0Var) {
        this.Y.f(1);
        int i10 = n0Var.f13665c;
        u2.i1 i1Var = n0Var.f13664b;
        ArrayList arrayList = n0Var.f13663a;
        if (i10 != -1) {
            this.f13743l0 = new r0(new p1(arrayList, i1Var), n0Var.f13665c, n0Var.d);
        }
        j1 j1Var = this.I;
        ArrayList arrayList2 = j1Var.f13624b;
        j1Var.g(0, arrayList2.size());
        w(j1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f0(boolean z10) {
        this.f13729a0 = z10;
        Q();
        if (this.f13731b0) {
            a1 a1Var = this.H;
            if (a1Var.f13482j != a1Var.f13481i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g() {
        r1[] r1VarArr;
        boolean z10;
        b bVar;
        if (this.O && d()) {
            for (r1 r1Var : this.f13728a) {
                int c10 = r1Var.c();
                j jVar = this.f13758y;
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
                            bVar = r1Var.f13722a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = r1Var.f13724c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, jVar);
                    try {
                        r1Var.i(z10);
                    } catch (RuntimeException e10) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e10);
                    }
                    r1Var.d = i11;
                }
                this.f13742k0 -= c10 - r1Var.c();
            }
            this.f13753t0 = -9223372036854775807L;
        }
    }

    public final void g0(b2.a1 a1Var) {
        this.f13744n.e(16);
        j jVar = this.f13758y;
        jVar.f(a1Var);
        b2.a1 h = jVar.h();
        y(h, h.f3140a, true, true);
    }

    public final void h(int i10) {
        boolean z10;
        r1[] r1VarArr = this.f13728a;
        int c10 = r1VarArr[i10].c();
        r1 r1Var = r1VarArr[i10];
        b bVar = r1Var.f13722a;
        j jVar = this.f13758y;
        r1Var.a(bVar, jVar);
        b bVar2 = r1Var.f13724c;
        if (bVar2 != null) {
            if (bVar2.f13494n != 0 && r1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            r1Var.a(bVar2, jVar);
            r1Var.i(false);
            if (z10) {
                b bVar3 = r1Var.f13722a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i10, false);
        this.f13742k0 -= c10;
    }

    public final void h0(p pVar) {
        this.f13752s0 = pVar;
        b2.p1 p1Var = this.X.f13638a;
        a1 a1Var = this.H;
        a1Var.getClass();
        pVar.getClass();
        if (!a1Var.f13489q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < a1Var.f13489q.size(); i10++) {
                ((y0) a1Var.f13489q.get(i10)).i();
            }
            a1Var.f13489q = arrayList;
            a1Var.f13485m = null;
            a1Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        y0 y0Var;
        u2.g0 g0Var;
        y0 y0Var2;
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
                    X((r0) message.obj);
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
                    x((u2.e0) message.obj);
                    break;
                case 9:
                    s((u2.e0) message.obj);
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
                    y(a1Var, a1Var.f3140a, true, false);
                    break;
                case 17:
                    e0((n0) message.obj);
                    break;
                case 18:
                    b((n0) message.obj, message.arg1);
                    break;
                case 19:
                    J((o0) message.obj);
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
                    r0 r0Var = this.V;
                    if (r0Var != null) {
                        X(r0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((s1) message.obj);
                    break;
                case 39:
                    d0((l0) message.obj);
                    break;
            }
        } catch (b2.x0 e) {
            boolean z15 = e.f3593a;
            int i14 = e.f3594b;
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
        } catch (g2.j e10) {
            t(e10, e10.f12248a);
        } catch (m e11) {
            e = e11;
            int i15 = e.f13656s;
            a1 a1Var2 = this.H;
            if (i15 == 1 && (y0Var2 = a1Var2.f13482j) != null && e.E == null) {
                e = e.a(y0Var2.f13794g.f13806a);
            }
            int i16 = e.f13656s;
            e2.i0 i0Var = this.f13744n;
            if (i16 == 1 && (g0Var = e.E) != null && B(e.f13657w, g0Var)) {
                this.f13754u0 = true;
                g();
                y0 g7 = a1Var2.g();
                y0 y0Var3 = a1Var2.f13481i;
                if (y0Var3 != g7) {
                    while (y0Var3 != null) {
                        y0 y0Var4 = y0Var3.f13799m;
                        if (y0Var4 == g7) {
                            break;
                        }
                        y0Var3 = y0Var4;
                    }
                }
                a1Var2.n(y0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                m mVar = this.f13748q0;
                if (mVar != null) {
                    mVar.addSuppressed(e);
                    e = this.f13748q0;
                }
                if (e.f13656s == 1 && a1Var2.f13481i != a1Var2.f13482j) {
                    while (true) {
                        y0Var = a1Var2.f13481i;
                        if (y0Var == a1Var2.f13482j) {
                            break;
                        }
                        a1Var2.a();
                    }
                    yb.k(y0Var);
                    F();
                    z0 z0Var = y0Var.f13794g;
                    u2.g0 g0Var2 = z0Var.f13806a;
                    long j10 = z0Var.f13807b;
                    this.X = z(g0Var2, j10, z0Var.d, j10, true, 0);
                }
                if (e.F && (this.f13748q0 == null || (i10 = e.f3605a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f13748q0 == null) {
                        this.f13748q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f9672a;
                    Message message2 = b10.f9668a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    e2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.X = this.X.f(e);
                }
            }
        } catch (IOException e12) {
            t(e12, 2000);
        } catch (RuntimeException e13) {
            m mVar2 = new m(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.d("ExoPlayerImplInternal", "Playback error", mVar2);
            v0(true, false);
            this.X = this.X.f(mVar2);
        } catch (n2.f e14) {
            t(e14, e14.f18619a);
        } catch (u2.b e15) {
            t(e15, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.i():void");
    }

    public final void i0(int i10) {
        this.f13737f0 = i10;
        b2.p1 p1Var = this.X.f13638a;
        a1 a1Var = this.H;
        a1Var.f13480g = i10;
        int r6 = a1Var.r(p1Var);
        if ((r6 & 1) != 0) {
            W(true);
        } else if ((r6 & 2) != 0) {
            g();
        }
        v(false);
    }

    public final void j(y0 y0Var, int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        r1 r1Var = this.f13728a[i10];
        boolean g7 = r1Var.g();
        b bVar = r1Var.f13722a;
        if (!g7) {
            if (y0Var == this.H.f13481i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.u uVar = y0Var.f13801o;
            q1 q1Var = uVar.f51362b[i10];
            x2.q qVar = uVar.f51363c[i10];
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
            this.f13742k0++;
            u2.d1 d1Var = y0Var.f13792c[i10];
            long j11 = y0Var.f13802p;
            u2.g0 g0Var = y0Var.f13794g.f13806a;
            b bVar2 = r1Var.f13724c;
            if (qVar != null) {
                i11 = qVar.length();
            } else {
                i11 = 0;
            }
            b2.x[] xVarArr = new b2.x[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                qVar.getClass();
                xVarArr[i12] = qVar.f(i12);
            }
            int i13 = r1Var.d;
            j jVar = this.f13758y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                r1Var.f13725f = true;
                bVar2.getClass();
                if (bVar2.f13494n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                yb.p(z15);
                bVar2.d = q1Var;
                bVar2.G = g0Var;
                bVar2.f13494n = 1;
                bVar2.o(z13, z11);
                bVar2.y(xVarArr, d1Var, j10, j11, g0Var);
                bVar2.z(j10, z13, true);
                jVar.c(bVar2);
            } else {
                r1Var.e = true;
                if (bVar.f13494n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                yb.p(z14);
                bVar.d = q1Var;
                bVar.G = g0Var;
                bVar.f13494n = 1;
                bVar.o(z13, z11);
                bVar.y(xVarArr, d1Var, j10, j11, g0Var);
                bVar.z(j10, z13, true);
                jVar.c(bVar);
            }
            m0 m0Var = new m0(this);
            b d = r1Var.d(y0Var);
            d.getClass();
            d.c(11, m0Var);
            if (z12 && z11) {
                r1Var.m();
            }
        }
    }

    public final void j0(boolean z10) {
        if (!z10) {
            r0 r0Var = this.V;
            e2.i0 i0Var = this.f13744n;
            if (r0Var != null && this.U && !i0Var.f9672a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new ag.r0(this, i10, 11));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            r0 r0Var2 = this.V;
            if (r0Var2 != null) {
                X(r0Var2);
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
        y0 y0Var = this.H.f13482j;
        x2.u uVar = y0Var.f13801o;
        int i10 = 0;
        while (true) {
            r1VarArr = this.f13728a;
            if (i10 >= r1VarArr.length) {
                break;
            }
            if (!uVar.b(i10)) {
                r1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < r1VarArr.length) {
            if (!uVar.b(i11) || r1VarArr[i11].d(y0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                j(y0Var, i11, zArr[i11], j11);
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
        b2.m1 m1Var = this.f13756w;
        int i10 = p1Var.g(obj, m1Var).f3280c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        if (o1Var.f3328f == -9223372036854775807L || !o1Var.a() || !o1Var.f3330i) {
            return -9223372036854775807L;
        }
        return e2.n0.S(e2.n0.C(o1Var.f3329g) - o1Var.f3328f) - (j10 + m1Var.e);
    }

    public final void l0(t1 t1Var) {
        this.R = t1Var;
    }

    public final long m(y0 y0Var) {
        if (y0Var == null) {
            return 0L;
        }
        long j10 = y0Var.f13802p;
        if (!y0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            r1[] r1VarArr = this.f13728a;
            if (i10 < r1VarArr.length) {
                if (r1VarArr[i10].d(y0Var) != null) {
                    b d = r1VarArr[i10].d(y0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f13498x;
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
        this.f13738g0 = z10;
        b2.p1 p1Var = this.X.f13638a;
        a1 a1Var = this.H;
        a1Var.h = z10;
        int r6 = a1Var.r(p1Var);
        if ((r6 & 1) != 0) {
            W(true);
        } else if ((r6 & 2) != 0) {
            g();
        }
        v(false);
    }

    @Override
    public final void n(u2.e0 e0Var) {
        this.f13744n.b(8, e0Var).b();
    }

    public final void n0(u2.i1 i1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        int size = j1Var.f13624b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        j1Var.f13629j = i1Var;
        w(j1Var.b(), false);
    }

    public final Pair o(b2.p1 p1Var) {
        long j10 = 0;
        if (p1Var.p()) {
            return Pair.create(k1.f13637u, 0L);
        }
        int a2 = p1Var.a(this.f13738g0);
        Pair i10 = p1Var.i(this.v, this.f13756w, a2, -9223372036854775807L);
        u2.g0 p10 = this.H.p(p1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p10.b()) {
            Object obj = p10.f49297a;
            b2.m1 m1Var = this.f13756w;
            p1Var.g(obj, m1Var);
            if (p10.f49299c == m1Var.e(p10.f49298b)) {
                m1Var.f3282g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j10));
    }

    public final void o0(int i10) {
        k1 k1Var = this.X;
        if (k1Var.e != i10) {
            if (i10 != 2) {
                this.f13750r0 = -9223372036854775807L;
            }
            if (i10 != 3 && k1Var.f13650p) {
                this.X = k1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final long p(long j10) {
        y0 y0Var = this.H.f13484l;
        if (y0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - y0Var.f13802p));
    }

    public final void p0(a3.y yVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f13728a) {
            b bVar = r1Var.f13722a;
            if (bVar.f13491b == 2) {
                bVar.c(7, yVar);
                b bVar2 = r1Var.f13724c;
                if (bVar2 != null) {
                    bVar2.c(7, yVar);
                }
            }
        }
    }

    public final void q(int i10) {
        k1 k1Var = this.X;
        B0(i10, k1Var.f13648n, k1Var.f13647m, k1Var.f13646l);
    }

    public final void q0(Object obj, e2.i iVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f13728a) {
            b bVar = r1Var.f13722a;
            if (bVar.f13491b == 2) {
                int i10 = r1Var.d;
                if (i10 != 4 && i10 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = r1Var.f13724c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.f13744n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r() {
        r0(this.f13755v0);
    }

    public final void r0(float f7) {
        r1[] r1VarArr;
        this.f13755v0 = f7;
        float f10 = f7 * this.P.f5939g;
        for (r1 r1Var : this.f13728a) {
            b bVar = r1Var.f13722a;
            if (bVar.f13491b == 1) {
                bVar.c(2, Float.valueOf(f10));
                b bVar2 = r1Var.f13724c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s(u2.e0 e0Var) {
        a1 a1Var = this.H;
        y0 y0Var = a1Var.f13484l;
        if (y0Var != null && y0Var.f13790a == e0Var) {
            a1Var.m(this.m0);
            D();
            return;
        }
        y0 y0Var2 = a1Var.f13485m;
        if (y0Var2 != null && y0Var2.f13790a == e0Var) {
            E();
        }
    }

    public final boolean s0() {
        k1 k1Var = this.X;
        if (k1Var.f13646l && k1Var.f13648n == 0) {
            return true;
        }
        return false;
    }

    public final void t(IOException iOException, int i10) {
        m mVar = new m(0, iOException, i10);
        y0 y0Var = this.H.f13481i;
        if (y0Var != null) {
            mVar = mVar.a(y0Var.f13794g.f13806a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
        v0(false, false);
        this.X = this.X.f(mVar);
    }

    public final boolean t0(b2.p1 p1Var, u2.g0 g0Var) {
        if (!g0Var.b() && !p1Var.p()) {
            int i10 = p1Var.g(g0Var.f49297a, this.f13756w).f3280c;
            b2.o1 o1Var = this.v;
            p1Var.n(i10, o1Var);
            if (o1Var.a() && o1Var.f3330i && o1Var.f3328f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void u(u2.f1 f1Var) {
        this.f13744n.b(9, (u2.e0) f1Var).b();
    }

    public final void u0() {
        y0 y0Var = this.H.f13481i;
        if (y0Var != null) {
            x2.u uVar = y0Var.f13801o;
            int i10 = 0;
            while (true) {
                r1[] r1VarArr = this.f13728a;
                if (i10 < r1VarArr.length) {
                    if (uVar.b(i10)) {
                        r1VarArr[i10].m();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(boolean z10) {
        u2.g0 g0Var;
        long d;
        y0 y0Var = this.H.f13484l;
        if (y0Var == null) {
            g0Var = this.X.f13639b;
        } else {
            g0Var = y0Var.f13794g.f13806a;
        }
        boolean equals = this.X.f13645k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        k1 k1Var = this.X;
        if (y0Var == null) {
            d = k1Var.f13653s;
        } else {
            d = y0Var.d();
        }
        k1Var.f13651q = d;
        k1 k1Var2 = this.X;
        k1Var2.f13652r = p(k1Var2.f13651q);
        if ((!equals || z10) && y0Var != null && y0Var.e) {
            y0(y0Var.f13794g.f13806a, y0Var.f13801o);
        }
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f13739h0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        i iVar = (i) this.f13736f;
        ConcurrentHashMap concurrentHashMap = iVar.f13571p;
        j2.j jVar = this.L;
        h hVar = (h) concurrentHashMap.get(jVar);
        if (hVar != null) {
            int i10 = hVar.f13550a - 1;
            hVar.f13550a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(jVar);
                iVar.c();
            }
        }
        this.P.d(1, this.X.f13646l);
        o0(1);
    }

    public final void w(b2.p1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.w(b2.p1, boolean):void");
    }

    public final void w0() {
        r1[] r1VarArr;
        j jVar = this.f13758y;
        jVar.f13582f = false;
        u1 u1Var = jVar.f13579a;
        if (u1Var.f13774c) {
            u1Var.c(u1Var.a());
            u1Var.f13774c = false;
        }
        for (r1 r1Var : this.f13728a) {
            b bVar = r1Var.f13724c;
            b bVar2 = r1Var.f13722a;
            if (r1.h(bVar2)) {
                r1.b(bVar2);
            }
            if (bVar != null && bVar.f13494n != 0) {
                r1.b(bVar);
            }
        }
    }

    public final void x(u2.e0 e0Var) {
        y0 y0Var;
        a1 a1Var = this.H;
        y0 y0Var2 = a1Var.f13484l;
        j jVar = this.f13758y;
        if (y0Var2 != null && y0Var2.f13790a == e0Var) {
            y0Var2.getClass();
            if (!y0Var2.e) {
                float f7 = jVar.h().f3140a;
                k1 k1Var = this.X;
                y0Var2.f(f7, k1Var.f13638a, k1Var.f13646l);
            }
            y0(y0Var2.f13794g.f13806a, y0Var2.f13801o);
            if (y0Var2 == a1Var.f13481i) {
                R(y0Var2.f13794g.f13807b, true);
                k(a1Var.f13482j.e(), new boolean[this.f13728a.length]);
                y0Var2.h = true;
                k1 k1Var2 = this.X;
                u2.g0 g0Var = k1Var2.f13639b;
                long j10 = y0Var2.f13794g.f13807b;
                this.X = z(g0Var, j10, k1Var2.f13640c, j10, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < a1Var.f13489q.size()) {
                y0Var = (y0) a1Var.f13489q.get(i10);
                if (y0Var.f13790a == e0Var) {
                    break;
                }
                i10++;
            } else {
                y0Var = null;
                break;
            }
        }
        if (y0Var != null) {
            yb.p(true ^ y0Var.e);
            float f10 = jVar.h().f3140a;
            k1 k1Var3 = this.X;
            y0Var.f(f10, k1Var3.f13638a, k1Var3.f13646l);
            y0 y0Var3 = a1Var.f13485m;
            if (y0Var3 != null && y0Var3.f13790a == e0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z10;
        y0 y0Var = this.H.f13484l;
        if (!this.f13735e0 && (y0Var == null || !y0Var.f13790a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        k1 k1Var = this.X;
        if (z10 != k1Var.f13642g) {
            this.X = k1Var.b(z10);
        }
    }

    public final void y(b2.a1 a1Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.Y.f(1);
            }
            this.X = this.X.g(a1Var);
        }
        float f10 = a1Var.f3140a;
        y0 y0Var = this.H.f13481i;
        while (true) {
            i10 = 0;
            if (y0Var == null) {
                break;
            }
            x2.q[] qVarArr = y0Var.f13801o.f51363c;
            int length = qVarArr.length;
            while (i10 < length) {
                x2.q qVar = qVarArr[i10];
                if (qVar != null) {
                    qVar.p(f10);
                }
                i10++;
            }
            y0Var = y0Var.f13799m;
        }
        r1[] r1VarArr = this.f13728a;
        int length2 = r1VarArr.length;
        while (i10 < length2) {
            r1 r1Var = r1VarArr[i10];
            float f11 = a1Var.f3140a;
            r1Var.f13722a.A(f7, f11);
            b bVar = r1Var.f13724c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(u2.g0 r10, x2.u r11) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.y0(u2.g0, x2.u):void");
    }

    public final k1 z(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        f9.s1 s1Var;
        boolean z13;
        boolean z14;
        if (!this.f13747p0 && j10 == this.X.f13653s && g0Var.equals(this.X.f13639b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f13747p0 = z11;
        Q();
        k1 k1Var = this.X;
        u2.r1 r1Var = k1Var.h;
        x2.u uVar = k1Var.f13643i;
        List list = k1Var.f13644j;
        if (this.I.f13630k) {
            y0 y0Var = this.H.f13481i;
            if (y0Var == null) {
                r1Var = u2.r1.d;
            } else {
                r1Var = y0Var.f13800n;
            }
            if (y0Var == null) {
                uVar = this.e;
            } else {
                uVar = y0Var.f13801o;
            }
            x2.q[] qVarArr = uVar.f51363c;
            ?? b0Var = new f9.b0(4);
            boolean z15 = false;
            for (x2.q qVar : qVarArr) {
                if (qVar != null) {
                    b2.u0 u0Var = qVar.f(0).f3579l;
                    if (u0Var == null) {
                        b0Var.c(new b2.u0(new b2.t0[0]));
                    } else {
                        b0Var.c(u0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                s1Var = b0Var.f();
            } else {
                f9.g0 g0Var2 = f9.i0.f10287b;
                s1Var = f9.s1.e;
            }
            list = s1Var;
            if (y0Var != null) {
                z0 z0Var = y0Var.f13794g;
                if (z0Var.d != j11) {
                    y0Var.f13794g = z0Var.a(j11);
                }
            }
            r1[] r1VarArr = this.f13728a;
            a1 a1Var = this.H;
            y0 y0Var2 = a1Var.f13481i;
            if (y0Var2 == a1Var.f13482j && y0Var2 != null) {
                x2.u uVar2 = y0Var2.f13801o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < r1VarArr.length) {
                        if (uVar2.b(i11)) {
                            if (r1VarArr[i11].f13722a.f13491b != 1) {
                                z13 = false;
                                break;
                            } else if (uVar2.f51362b[i11].f13714a != 0) {
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
                if (z14 != this.f13741j0) {
                    this.f13741j0 = z14;
                    if (!z14 && this.X.f13650p) {
                        this.f13744n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(k1Var.f13639b)) {
            r1Var = u2.r1.d;
            uVar = this.e;
            list = f9.s1.e;
        }
        u2.r1 r1Var2 = r1Var;
        x2.u uVar3 = uVar;
        List list2 = list;
        if (z10) {
            p0 p0Var = this.Y;
            if (p0Var.d && p0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                yb.g(z12);
            } else {
                p0Var.f13699c = true;
                p0Var.d = true;
                p0Var.e = i10;
            }
        }
        k1 k1Var2 = this.X;
        return k1Var2.d(g0Var, j10, j11, j12, p(k1Var2.f13651q), r1Var2, uVar3, list2);
    }

    public final void z0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        ArrayList arrayList = j1Var.f13624b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        yb.g(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((i1) arrayList.get(i12)).f13576a.t((b2.p0) list.get(i12 - i10));
        }
        w(j1Var.b(), false);
    }
}
