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
public final class p0 implements Handler.Callback, u2.d0, j1, a3.y {
    public static final long f12535w0 = e2.m0.h0(10000);
    public final ArrayList E;
    public final e2.g0 F;
    public final v G;
    public final x0 H;
    public final h1 I;
    public final f J;
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
    public o0 V;
    public int W;
    public i1 X;
    public m0 Y;
    public boolean Z;
    public final p1[] f12536a;
    public boolean f12537a0;
    public final b[] f12538b;
    public boolean f12539b0;
    public final boolean[] f12540c;
    public boolean f12541c0;
    public final x2.s d;
    public long f12542d0;
    public final x2.t e;
    public boolean f12543e0;
    public final r0 f12544f;
    public int f12545f0;
    public boolean f12546g0;
    public final y2.c h;
    public boolean f12547h0;
    public boolean f12548i0;
    public boolean f12549j0;
    public int f12550k0;
    public o0 f12551l0;
    public long m0;
    public final e2.i0 f12552n;
    public long f12553n0;
    public int f12554o0;
    public boolean f12555p0;
    public l f12556q0;
    public final j6.l f12557r;
    public long f12558r0;
    public final Looper f12559s;
    public o f12560s0;
    public long f12561t0;
    public boolean f12562u0;
    public final b2.n1 v;
    public float f12563v0;
    public final b2.l1 f12564w;
    public final long f12565x;
    public final i f12566y;

    public p0(Context context, b[] bVarArr, b[] bVarArr2, x2.s sVar, x2.t tVar, r0 r0Var, y2.c cVar, int i10, boolean z10, j2.f fVar, r1 r1Var, f fVar2, long j10, Looper looper, e2.g0 g0Var, v vVar, j2.k kVar, final a3.y yVar, boolean z11) {
        o oVar = o.f12528a;
        this.f12561t0 = -9223372036854775807L;
        this.G = vVar;
        this.d = sVar;
        this.e = tVar;
        this.f12544f = r0Var;
        this.h = cVar;
        this.f12545f0 = i10;
        this.f12546g0 = z10;
        this.R = r1Var;
        this.J = fVar2;
        this.K = j10;
        this.f12537a0 = false;
        this.F = g0Var;
        this.L = kVar;
        this.f12560s0 = oVar;
        this.M = fVar;
        this.f12563v0 = 1.0f;
        this.S = q1.f12577b;
        this.Q = z11;
        this.f12558r0 = -9223372036854775807L;
        this.f12542d0 = -9223372036854775807L;
        this.f12565x = ((h) r0Var).f12431n;
        b2.k1 k1Var = b2.o1.f3893a;
        i1 k10 = i1.k(tVar);
        this.X = k10;
        this.Y = new m0(k10);
        this.f12538b = new b[bVarArr.length];
        this.f12540c = new boolean[bVarArr.length];
        x2.n nVar = (x2.n) sVar;
        nVar.getClass();
        this.f12536a = new p1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f12316f = kVar;
            bVar.h = g0Var;
            this.f12538b[i11] = bVar;
            b bVar2 = this.f12538b[i11];
            synchronized (bVar2.f12313a) {
                bVar2.H = nVar;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f12316f = kVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f12536a[i11] = new p1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.f12566y = new i(this, g0Var);
        this.E = new ArrayList();
        this.v = new b2.n1();
        this.f12564w = new b2.l1();
        u6.p(sVar.f49197a == null);
        sVar.f49197a = this;
        sVar.f49198b = cVar;
        this.f12555p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new x0(fVar, a2, new e1.c(this, 19));
        this.I = new h1(this, fVar, a2, kVar);
        j6.l lVar = new j6.l(7);
        this.f12557r = lVar;
        Looper d = lVar.d();
        this.f12559s = d;
        e2.i0 a10 = g0Var.a(d, this);
        this.f12552n = a10;
        this.P = new c2.e(context, d, this);
        a10.b(35, new a3.y() {
            @Override
            public final void a(long j11, long j12, b2.w wVar, MediaFormat mediaFormat) {
                p0 p0Var = p0.this;
                p0Var.getClass();
                yVar.a(j11, j12, wVar, mediaFormat);
                p0Var.a(j11, j12, wVar, mediaFormat);
            }
        }).b();
        a10.b(39, new i0(this)).b();
    }

    public static boolean A(v0 v0Var) {
        u2.d1[] d1VarArr;
        long d;
        if (v0Var != null) {
            try {
                ?? r12 = v0Var.f12601a;
                if (!v0Var.e) {
                    r12.g();
                } else {
                    for (u2.d1 d1Var : v0Var.f12603c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                }
                if (!v0Var.e) {
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

    public static Pair T(b2.o1 o1Var, o0 o0Var, boolean z10, int i10, boolean z11, b2.n1 n1Var, b2.l1 l1Var) {
        b2.o1 o1Var2;
        int U;
        b2.o1 o1Var3 = o0Var.f12529a;
        if (!o1Var.p()) {
            if (o1Var3.p()) {
                o1Var2 = o1Var;
            } else {
                o1Var2 = o1Var3;
            }
            try {
                Pair i11 = o1Var2.i(n1Var, l1Var, o0Var.f12530b, o0Var.f12531c);
                if (!o1Var.equals(o1Var2)) {
                    if (o1Var.b(i11.first) != -1) {
                        if (o1Var2.g(i11.first, l1Var).f3826f && o1Var2.m(l1Var.f3825c, n1Var, 0L).f3880n == o1Var2.b(i11.first)) {
                            return o1Var.i(n1Var, l1Var, o1Var.g(i11.first, l1Var).f3825c, o0Var.f12531c);
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
        Object obj2 = o1Var3.m(o1Var3.g(obj, l1Var).f3825c, n1Var, 0L).f3870a;
        for (int i11 = 0; i11 < o1Var2.o(); i11++) {
            if (o1Var2.m(i11, n1Var, 0L).f3870a.equals(obj2)) {
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
        return o1Var2.f(i12, l1Var, false).f3825c;
    }

    public static void f(l1 l1Var) {
        try {
            synchronized (l1Var) {
                synchronized (l1Var) {
                }
                l1Var.f12483a.c(l1Var.f12485c, l1Var.d);
                return;
            }
            l1Var.f12483a.c(l1Var.f12485c, l1Var.d);
            return;
        } finally {
            l1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.A0():void");
    }

    public final boolean B(int i10, u2.g0 g0Var) {
        boolean z10;
        boolean z11;
        x0 x0Var = this.H;
        v0 v0Var = x0Var.f12633k;
        if (v0Var != null && v0Var.f12605g.f12616a.equals(g0Var)) {
            p1 p1Var = this.f12536a[i10];
            v0 v0Var2 = x0Var.f12633k;
            int i11 = p1Var.d;
            if ((i11 == 2 || i11 == 4) && p1Var.d(v0Var2) == p1Var.f12567a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p1Var.d == 3 && p1Var.d(v0Var2) == p1Var.f12569c) {
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
        if (i1Var.f12460l != z11 || i1Var.f12462n != i11 || i1Var.f12461m != i12) {
            this.X = i1Var.e(i12, i11, z11);
            E0(false, false);
            x0 x0Var = this.H;
            for (v0 v0Var = x0Var.f12631i; v0Var != null; v0Var = v0Var.f12610m) {
                for (x2.p pVar : v0Var.f12612o.f49202c) {
                    if (pVar != null) {
                        pVar.e(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                i1 i1Var2 = this.X;
                if (i1Var2.f12464p) {
                    this.X = i1Var2.i(false);
                }
                x0Var.m(this.m0);
                return;
            }
            int i13 = this.X.e;
            e2.i0 i0Var = this.f12552n;
            if (i13 == 3) {
                i iVar = this.f12566y;
                iVar.f12449f = true;
                iVar.f12446a.d();
                u0();
                i0Var.f(2);
            } else if (i13 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final boolean C() {
        v0 v0Var = this.H.f12631i;
        long j10 = v0Var.f12605g.f12619f;
        if (v0Var.e) {
            if (j10 == -9223372036854775807L || this.X.f12467s < j10 || !s0()) {
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
        v0 v0Var = this.H.f12631i;
        if (v0Var != null) {
            if (v0Var.e) {
                j10 = v0Var.f12601a.o();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!v0Var.g()) {
                    this.H.n(v0Var);
                    u(false);
                    D();
                }
                R(j10, true);
                if (j10 != this.X.f12467s) {
                    i1 i1Var = this.X;
                    this.X = z(i1Var.f12453b, j10, i1Var.f12454c, j10, true, 5);
                }
            } else {
                i iVar = this.f12566y;
                if (v0Var != this.H.f12632j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s1 s1Var = iVar.f12446a;
                b bVar = iVar.f12448c;
                if (bVar != null && !bVar.l() && ((!z10 || iVar.f12448c.f12317n == 2) && (iVar.f12448c.m() || (!z10 && !iVar.f12448c.k())))) {
                    u0 u0Var = iVar.d;
                    u0Var.getClass();
                    long a2 = u0Var.a();
                    if (iVar.e) {
                        if (a2 < s1Var.a()) {
                            if (s1Var.f12591c) {
                                s1Var.c(s1Var.a());
                                s1Var.f12591c = false;
                            }
                        } else {
                            iVar.e = false;
                            if (iVar.f12449f) {
                                s1Var.d();
                            }
                        }
                    }
                    s1Var.c(a2);
                    b2.z0 h = u0Var.h();
                    if (!h.equals((b2.z0) s1Var.e)) {
                        s1Var.f(h);
                        iVar.f12447b.f12552n.b(16, h).b();
                    }
                } else {
                    iVar.e = true;
                    if (iVar.f12449f) {
                        s1Var.d();
                    }
                }
                long a10 = iVar.a();
                this.m0 = a10;
                long j13 = a10 - v0Var.f12613p;
                long j14 = this.X.f12467s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f12453b.b()) {
                    if (this.f12555p0) {
                        this.f12555p0 = false;
                    }
                    i1 i1Var2 = this.X;
                    i1Var2.f12452a.b(i1Var2.f12453b.f47327a);
                    int min = Math.min(this.f12554o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f12554o0 = min;
                }
                if (this.f12566y.b()) {
                    boolean z11 = !this.Y.d;
                    i1 i1Var3 = this.X;
                    this.X = z(i1Var3.f12453b, j13, i1Var3.f12454c, j13, z11, 6);
                } else {
                    i1 i1Var4 = this.X;
                    i1Var4.f12467s = j13;
                    i1Var4.f12468t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f12465q = this.H.f12634l.d();
            i1 i1Var5 = this.X;
            i1Var5.f12466r = p(i1Var5.f12465q);
            i1 i1Var6 = this.X;
            if (i1Var6.f12460l && i1Var6.e == 3 && t0(i1Var6.f12452a, i1Var6.f12453b)) {
                i1 i1Var7 = this.X;
                float f10 = 1.0f;
                if (i1Var7.f12463o.f4155a == 1.0f) {
                    f fVar = this.J;
                    long m10 = m(i1Var7.f12452a, i1Var7.f12453b.f47327a, i1Var7.f12467s);
                    long j15 = this.X.f12466r;
                    if (fVar.f12359c != -9223372036854775807L) {
                        long j16 = m10 - j15;
                        if (fVar.f12366m == -9223372036854775807L) {
                            fVar.f12366m = j16;
                            fVar.f12367n = 0L;
                        } else {
                            fVar.f12366m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            fVar.f12367n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) fVar.f12367n) * 0.999f);
                        }
                        if (fVar.f12365l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - fVar.f12365l < 1000) {
                                f10 = fVar.f12364k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        fVar.f12365l = SystemClock.elapsedRealtime();
                        long j17 = (fVar.f12367n * 3) + fVar.f12366m;
                        if (fVar.h > j17) {
                            float S = (float) e2.m0.S(j12);
                            f7 = 1.0E-7f;
                            long[] jArr = {j17, fVar.e, fVar.h - (((fVar.f12364k - 1.0f) * S) + ((fVar.f12362i - 1.0f) * S))};
                            long j18 = jArr[0];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j19 = jArr[i10];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            fVar.h = j18;
                        } else {
                            f7 = 1.0E-7f;
                            long j20 = e2.m0.j(m10 - (Math.max(0.0f, fVar.f12364k - 1.0f) / 1.0E-7f), fVar.h, j17);
                            fVar.h = j20;
                            long j21 = fVar.f12361g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                fVar.h = j21;
                            }
                        }
                        long j22 = m10 - fVar.h;
                        if (Math.abs(j22) < fVar.f12357a) {
                            fVar.f12364k = 1.0f;
                        } else {
                            fVar.f12364k = e2.m0.h((f7 * ((float) j22)) + 1.0f, fVar.f12363j, fVar.f12362i);
                        }
                        f10 = fVar.f12364k;
                    }
                    if (this.f12566y.h().f4155a != f10) {
                        b2.z0 z0Var = new b2.z0(f10, this.X.f12463o.f4156b);
                        this.f12552n.e(16);
                        this.f12566y.f(z0Var);
                        y(this.X.f12463o, this.f12566y.h().f4155a, false, false);
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
        if (!A(this.H.f12634l)) {
            b10 = false;
        } else {
            v0 v0Var = this.H.f12634l;
            if (!v0Var.e) {
                d = 0;
            } else {
                d = v0Var.f12601a.d();
            }
            long p5 = p(d);
            v0 v0Var2 = this.H.f12631i;
            if (t0(this.X.f12452a, v0Var.f12605g.f12616a)) {
                j10 = this.J.h;
            } else {
                j10 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.o1 o1Var = this.X.f12452a;
            u2.g0 g0Var = v0Var.f12605g.f12616a;
            float f7 = this.f12566y.h().f4155a;
            boolean z13 = this.X.f12460l;
            q0 q0Var = new q0(kVar, o1Var, g0Var, p5, f7, this.f12541c0, j10);
            b10 = ((h) this.f12544f).b(q0Var);
            v0 v0Var3 = this.H.f12631i;
            if (!b10 && v0Var3.e && p5 < 500000 && this.f12565x > 0) {
                v0Var3.f12601a.k(this.X.f12467s);
                b10 = ((h) this.f12544f).b(q0Var);
            }
        }
        this.f12543e0 = b10;
        if (b10) {
            v0 v0Var4 = this.H.f12634l;
            v0Var4.getClass();
            s0 s0Var = new s0();
            s0Var.f12586a = this.m0 - v0Var4.f12613p;
            float f10 = this.f12566y.h().f4155a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            u6.g(z10);
            s0Var.f12587b = f10;
            long j11 = this.f12542d0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            s0Var.f12588c = j11;
            t0 t0Var = new t0(s0Var);
            if (v0Var4.f12610m == null) {
                z12 = true;
            }
            u6.p(z12);
            v0Var4.f12601a.p(t0Var);
        }
        x0();
    }

    public final void D0(b2.o1 o1Var, u2.g0 g0Var, b2.o1 o1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        Object obj;
        b2.z0 z0Var;
        boolean t02 = t0(o1Var, g0Var);
        Object obj2 = g0Var.f47327a;
        if (!t02) {
            if (g0Var.b()) {
                z0Var = b2.z0.d;
            } else {
                z0Var = this.X.f12463o;
            }
            i iVar = this.f12566y;
            if (!iVar.h().equals(z0Var)) {
                this.f12552n.e(16);
                iVar.f(z0Var);
                y(this.X.f12463o, z0Var.f4155a, false, false);
                return;
            }
            return;
        }
        b2.l1 l1Var = this.f12564w;
        int i10 = o1Var.g(obj2, l1Var).f3825c;
        b2.n1 n1Var = this.v;
        o1Var.n(i10, n1Var);
        b2.i0 i0Var = n1Var.f3876j;
        f fVar = this.J;
        fVar.getClass();
        fVar.f12359c = e2.m0.S(i0Var.f3784a);
        fVar.f12360f = e2.m0.S(i0Var.f3785b);
        fVar.f12361g = e2.m0.S(i0Var.f3786c);
        float f7 = i0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        fVar.f12363j = f7;
        float f10 = i0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        fVar.f12362i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            fVar.f12359c = -9223372036854775807L;
        }
        fVar.a();
        if (j10 != -9223372036854775807L) {
            fVar.d = m(o1Var, obj2, j10);
            fVar.a();
            return;
        }
        Object obj3 = n1Var.f3870a;
        if (!o1Var2.p()) {
            obj = o1Var2.m(o1Var2.g(g0Var2.f47327a, l1Var).f3825c, n1Var, 0L).f3870a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        fVar.d = -9223372036854775807L;
        fVar.a();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        x0 x0Var = this.H;
        x0Var.k();
        v0 v0Var = x0Var.f12635m;
        if (v0Var != null) {
            ?? r12 = v0Var.f12601a;
            if ((!v0Var.d || v0Var.e) && !r12.c()) {
                b2.o1 o1Var = this.X.f12452a;
                if (v0Var.e) {
                    r12.s();
                }
                for (g gVar : ((h) this.f12544f).f12433p.values()) {
                    if (gVar.f12375b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!v0Var.d) {
                    long j10 = v0Var.f12605g.f12617b;
                    v0Var.d = true;
                    r12.m(this, j10);
                    return;
                }
                s0 s0Var = new s0();
                s0Var.f12586a = this.m0 - v0Var.f12613p;
                float f7 = this.f12566y.h().f4155a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u6.g(z10);
                s0Var.f12587b = f7;
                long j11 = this.f12542d0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                u6.g(z11);
                s0Var.f12588c = j11;
                t0 t0Var = new t0(s0Var);
                if (v0Var.f12610m != null) {
                    z12 = false;
                }
                u6.p(z12);
                r12.p(t0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f12541c0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f12542d0 = j10;
    }

    public final void F() {
        boolean z10;
        m0 m0Var = this.Y;
        i1 i1Var = this.X;
        boolean z11 = m0Var.f12491c;
        if (((i1) m0Var.f12492f) != i1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        m0Var.f12491c = z12;
        m0Var.f12492f = i1Var;
        if (z12) {
            g0 g0Var = this.G.f12600b;
            g0Var.f12391j.d(new hi.t(1, g0Var, m0Var));
            this.Y = new m0(this.X);
        }
    }

    public final void G(int i10) {
        p1 p1Var = this.f12536a[i10];
        try {
            v0 v0Var = this.H.f12631i;
            v0Var.getClass();
            b d = p1Var.d(v0Var);
            d.getClass();
            u2.d1 d1Var = d.f12318r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = p1Var.f12567a.f12314b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.t tVar = this.H.f12631i.f12612o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.w.c(tVar.f49202c[i10].m()), e);
            x2.t tVar2 = new x2.t((o1[]) tVar.f49201b.clone(), (x2.p[]) tVar.f49202c.clone(), tVar.d, tVar.e);
            tVar2.f49201b[i10] = null;
            tVar2.f49202c[i10] = null;
            i(i10);
            v0 v0Var2 = this.H.f12631i;
            v0Var2.a(tVar2, this.X.f12467s, false, new boolean[v0Var2.f12607j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f12540c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new y8(this, i10, z10, 1));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(l0 l0Var) {
        boolean z10;
        b2.o1 b10;
        this.Y.f(1);
        int i10 = l0Var.f12480a;
        int i11 = l0Var.f12481b;
        int i12 = l0Var.f12482c;
        u2.i1 i1Var = l0Var.d;
        h1 h1Var = this.I;
        ArrayList arrayList = h1Var.f12438b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        h1Var.f12443j = i1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((g1) arrayList.get(min)).d;
            e2.m0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                g1 g1Var = (g1) arrayList.get(min);
                g1Var.d = i13;
                i13 += g1Var.f12417a.f47276o.e.o();
                min++;
            }
            b10 = h1Var.b();
        } else {
            b10 = h1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        int i11;
        this.Y.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f12544f;
        ConcurrentHashMap concurrentHashMap = hVar.f12433p;
        long id2 = Thread.currentThread().getId();
        long j10 = hVar.f12434q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        hVar.f12434q = id2;
        j2.k kVar = this.L;
        g gVar = (g) concurrentHashMap.get(kVar);
        if (gVar == null) {
            ?? obj = new Object();
            obj.f12374a = 1;
            concurrentHashMap.put(kVar, obj);
        } else {
            gVar.f12374a++;
        }
        g gVar2 = (g) concurrentHashMap.get(kVar);
        gVar2.getClass();
        Integer num = (Integer) hVar.f12432o.get(kVar.f13964a);
        if (num != null && num.intValue() != -1) {
            i10 = num.intValue();
        } else {
            i10 = hVar.f12429l;
        }
        if (i10 == -1) {
            i10 = 13107200;
        }
        gVar2.f12376c = i10;
        gVar2.f12375b = false;
        if (this.X.f12452a.p()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        o0(i11);
        i1 i1Var = this.X;
        boolean z11 = i1Var.f12460l;
        B0(this.P.d(i1Var.e, z11), i1Var.f12462n, i1Var.f12461m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        h1 h1Var = this.I;
        ArrayList arrayList = h1Var.f12438b;
        u6.p(!h1Var.f12444k);
        h1Var.f12445l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g1 g1Var = (g1) arrayList.get(i12);
            h1Var.e(g1Var);
            h1Var.f12441g.add(g1Var);
        }
        h1Var.f12444k = true;
        this.f12552n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.l lVar = this.f12557r;
        e2.i0 i0Var = this.f12552n;
        try {
            P(true, false, true, false);
            M();
            r0 r0Var = this.f12544f;
            j2.k kVar = this.L;
            h hVar = (h) r0Var;
            ConcurrentHashMap concurrentHashMap = hVar.f12433p;
            g gVar = (g) concurrentHashMap.get(kVar);
            if (gVar != null) {
                int i10 = gVar.f12374a - 1;
                gVar.f12374a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(kVar);
                    hVar.c();
                }
            }
            if (hVar.f12433p.isEmpty()) {
                hVar.f12434q = -1L;
            }
            c2.e eVar = this.P;
            eVar.f4500c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f8239a.removeCallbacksAndMessages(null);
            lVar.h();
            iVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f12536a.length; i10++) {
            b bVar = this.f12538b[i10];
            synchronized (bVar.f12313a) {
                bVar.H = null;
            }
            p1 p1Var = this.f12536a[i10];
            b bVar2 = p1Var.f12567a;
            boolean z11 = true;
            if (bVar2.f12317n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar2.q();
            p1Var.e = false;
            b bVar3 = p1Var.f12569c;
            if (bVar3 != null) {
                if (bVar3.f12317n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar3.q();
                p1Var.f12570f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        boolean z10 = true;
        this.Y.f(1);
        h1 h1Var = this.I;
        h1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > h1Var.f12438b.size()) {
            z10 = false;
        }
        u6.g(z10);
        h1Var.f12443j = i1Var;
        h1Var.g(i10, i11);
        w(h1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        v0 v0Var = this.H.f12631i;
        if (v0Var != null && v0Var.f12605g.f12622j && this.f12537a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12539b0 = z10;
    }

    public final void R(long j10, boolean z10) {
        x0 x0Var;
        long j11;
        p1[] p1VarArr;
        x2.p[] pVarArr;
        v0 v0Var = this.H.f12631i;
        if (v0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = v0Var.f12613p;
        }
        long j12 = j10 + j11;
        this.m0 = j12;
        this.f12566y.f12446a.c(j12);
        for (p1 p1Var : this.f12536a) {
            long j13 = this.m0;
            b d = p1Var.d(v0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (v0 v0Var2 = x0Var.f12631i; v0Var2 != null; v0Var2 = v0Var2.f12610m) {
            for (x2.p pVar : v0Var2.f12612o.f49202c) {
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
        v0 v0Var;
        long j11;
        boolean z10 = this.T;
        long j12 = 1000;
        long j13 = f12535w0;
        if (z10) {
            this.S.getClass();
            if (this.X.e != 3) {
                j12 = j13;
            }
            for (p1 p1Var : this.f12536a) {
                long j14 = this.m0;
                long j15 = this.f12553n0;
                b bVar = p1Var.f12569c;
                b bVar2 = p1Var.f12567a;
                if (p1.h(bVar2)) {
                    j11 = bVar2.g(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f12317n != 0) {
                    j11 = Math.min(j11, bVar.g(j14, j15));
                }
                j12 = Math.min(j12, e2.m0.h0(j11));
            }
            if (this.X.m()) {
                v0 v0Var2 = this.H.f12631i;
                if (v0Var2 != null) {
                    v0Var = v0Var2.f12610m;
                } else {
                    v0Var = null;
                }
                if (v0Var != null) {
                    if ((((float) e2.m0.S(j12)) * this.X.f12463o.f4155a) + ((float) this.m0) >= ((float) v0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            j12 = j13;
        }
        this.f12552n.f8239a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.f12631i.f12605g.f12616a;
        long Y = Y(g0Var, this.X.f12467s, true, false);
        if (Y != this.X.f12467s) {
            i1 i1Var = this.X;
            this.X = z(g0Var, Y, i1Var.f12454c, i1Var.d, z10, 5);
        }
    }

    public final void X(i2.o0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.X(i2.o0):void");
    }

    public final long Y(u2.g0 g0Var, long j10, boolean z10, boolean z11) {
        x0 x0Var;
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
        v0 v0Var = this.H.f12631i;
        v0 v0Var2 = v0Var;
        while (v0Var2 != null && !g0Var.equals(v0Var2.f12605g.f12616a)) {
            v0Var2 = v0Var2.f12610m;
        }
        if (z10 || v0Var != v0Var2 || (v0Var2 != null && v0Var2.f12613p + j10 < 0)) {
            for (int i11 = 0; i11 < this.f12536a.length; i11++) {
                i(i11);
            }
            this.f12561t0 = -9223372036854775807L;
            if (v0Var2 != null) {
                while (true) {
                    x0Var = this.H;
                    if (x0Var.f12631i == v0Var2) {
                        break;
                    }
                    x0Var.a();
                }
                x0Var.n(v0Var2);
                v0Var2.f12613p = 1000000000000L;
                l(this.H.f12632j.e(), new boolean[this.f12536a.length]);
                v0Var2.h = true;
            }
        }
        g();
        if (this.T) {
            for (p1 p1Var : this.f12536a) {
                if (p1Var.g() && ((i10 = p1Var.f12567a.f12314b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (v0Var2 != null) {
            this.H.n(v0Var2);
            if (!v0Var2.e) {
                v0Var2.f12605g = v0Var2.f12605g.b(j10, -9223372036854775807L);
            } else if (v0Var2.f12604f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f12452a.p() && v0Var2.f12605g.f12616a.equals(this.X.f12453b)) {
                        long j11 = v0Var2.f12613p + j10;
                        boolean z14 = true;
                        for (p1 p1Var2 : this.f12536a) {
                            if (p1Var2.g()) {
                                b d = p1Var2.d(v0Var2);
                                if (d != null && d.E(j11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = v0Var2.f12601a;
                            long j12 = this.X.f12467s;
                            r1 r1Var = r1.e;
                            if (r10.t(j12, r1Var) == v0Var2.f12601a.t(j10, r1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = v0Var2.f12601a.i(j10);
                v0Var2.f12601a.k(j10 - this.f12565x);
            }
            R(j10, z13);
            D();
        } else {
            this.H.b();
            R(j10, true);
        }
        u(false);
        this.f12552n.f(2);
        return j10;
    }

    public final void Z(l1 l1Var) {
        l1Var.getClass();
        Looper looper = l1Var.e;
        Looper looper2 = this.f12559s;
        e2.i0 i0Var = this.f12552n;
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
            this.f12552n.a(37).b();
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

    public final void b(k0 k0Var, int i10) {
        this.Y.f(1);
        h1 h1Var = this.I;
        if (i10 == -1) {
            i10 = h1Var.f12438b.size();
        }
        w(h1Var.a(i10, k0Var.f12473a, k0Var.f12474b), false);
    }

    public final void b0(b2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.b0(b2.f, boolean):void");
    }

    public final void c() {
        p1[] p1VarArr;
        q1 q1Var;
        for (p1 p1Var : this.f12536a) {
            if (this.T) {
                q1Var = this.S;
            } else {
                q1Var = null;
            }
            p1Var.f12567a.c(18, q1Var);
            b bVar = p1Var.f12569c;
            if (bVar != null) {
                bVar.c(18, q1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.f12547h0 != z10) {
            this.f12547h0 = z10;
            if (!z10) {
                for (p1 p1Var : this.f12536a) {
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
        for (p1 p1Var : this.f12536a) {
            if (p1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(i0 i0Var) {
        p1[] p1VarArr;
        for (p1 p1Var : this.f12536a) {
            b bVar = p1Var.f12567a;
            if (bVar.f12314b == 4) {
                bVar.c(23, i0Var);
                b bVar2 = p1Var.f12569c;
                if (bVar2 != null) {
                    bVar2.c(23, i0Var);
                }
            }
        }
    }

    public final void e() {
        O();
        W(true);
    }

    public final void e0(k0 k0Var) {
        this.Y.f(1);
        int i10 = k0Var.f12475c;
        u2.i1 i1Var = k0Var.f12474b;
        ArrayList arrayList = k0Var.f12473a;
        if (i10 != -1) {
            this.f12551l0 = new o0(new n1(arrayList, i1Var), k0Var.f12475c, k0Var.d);
        }
        h1 h1Var = this.I;
        ArrayList arrayList2 = h1Var.f12438b;
        h1Var.g(0, arrayList2.size());
        w(h1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f0(boolean z10) {
        this.f12537a0 = z10;
        Q();
        if (this.f12539b0) {
            x0 x0Var = this.H;
            if (x0Var.f12632j != x0Var.f12631i) {
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
            for (p1 p1Var : this.f12536a) {
                int c10 = p1Var.c();
                i iVar = this.f12566y;
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
                            bVar = p1Var.f12567a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = p1Var.f12569c;
                        bVar.getClass();
                    }
                    p1Var.a(bVar, iVar);
                    try {
                        p1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    p1Var.d = i11;
                }
                this.f12550k0 -= c10 - p1Var.c();
            }
            this.f12561t0 = -9223372036854775807L;
        }
    }

    public final void g0(b2.z0 z0Var) {
        this.f12552n.e(16);
        i iVar = this.f12566y;
        iVar.f(z0Var);
        b2.z0 h = iVar.h();
        y(h, h.f4155a, true, true);
    }

    @Override
    public final void h(u2.e0 e0Var) {
        this.f12552n.b(8, e0Var).b();
    }

    public final void h0(o oVar) {
        this.f12560s0 = oVar;
        b2.o1 o1Var = this.X.f12452a;
        x0 x0Var = this.H;
        x0Var.getClass();
        oVar.getClass();
        if (!x0Var.f12639q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < x0Var.f12639q.size(); i10++) {
                ((v0) x0Var.f12639q.get(i10)).i();
            }
            x0Var.f12639q = arrayList;
            x0Var.f12635m = null;
            x0Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        v0 v0Var;
        u2.g0 g0Var;
        v0 v0Var2;
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
                    X((o0) message.obj);
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
                    Z((l1) message.obj);
                    break;
                case 15:
                    a0((l1) message.obj);
                    break;
                case 16:
                    b2.z0 z0Var = (b2.z0) message.obj;
                    y(z0Var, z0Var.f4155a, true, false);
                    break;
                case 17:
                    e0((k0) message.obj);
                    break;
                case 18:
                    b((k0) message.obj, message.arg1);
                    break;
                case 19:
                    J((l0) message.obj);
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
                    h0((o) message.obj);
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
                    o0 o0Var = this.V;
                    if (o0Var != null) {
                        X(o0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((q1) message.obj);
                    break;
                case 39:
                    d0((i0) message.obj);
                    break;
            }
        } catch (b2.w0 e) {
            boolean z15 = e.f4138a;
            int i14 = e.f4139b;
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
            t(e7, e7.f10782a);
        } catch (l e10) {
            e = e10;
            int i15 = e.f12476s;
            x0 x0Var = this.H;
            if (i15 == 1 && (v0Var2 = x0Var.f12632j) != null && e.E == null) {
                e = e.a(v0Var2.f12605g.f12616a);
            }
            int i16 = e.f12476s;
            e2.i0 i0Var = this.f12552n;
            if (i16 == 1 && (g0Var = e.E) != null && B(e.f12477w, g0Var)) {
                this.f12562u0 = true;
                g();
                v0 g10 = x0Var.g();
                v0 v0Var3 = x0Var.f12631i;
                if (v0Var3 != g10) {
                    while (v0Var3 != null) {
                        v0 v0Var4 = v0Var3.f12610m;
                        if (v0Var4 == g10) {
                            break;
                        }
                        v0Var3 = v0Var4;
                    }
                }
                x0Var.n(v0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                l lVar = this.f12556q0;
                if (lVar != null) {
                    lVar.addSuppressed(e);
                    e = this.f12556q0;
                }
                if (e.f12476s == 1 && x0Var.f12631i != x0Var.f12632j) {
                    while (true) {
                        v0Var = x0Var.f12631i;
                        if (v0Var == x0Var.f12632j) {
                            break;
                        }
                        x0Var.a();
                    }
                    u6.k(v0Var);
                    F();
                    w0 w0Var = v0Var.f12605g;
                    u2.g0 g0Var2 = w0Var.f12616a;
                    long j10 = w0Var.f12617b;
                    this.X = z(g0Var2, j10, w0Var.d, j10, true, 0);
                }
                if (e.F && (this.f12556q0 == null || (i10 = e.f4150a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f12556q0 == null) {
                        this.f12556q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f8239a;
                    Message message2 = b10.f8235a;
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
            l lVar2 = new l(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.d("ExoPlayerImplInternal", "Playback error", lVar2);
            v0(true, false);
            this.X = this.X.f(lVar2);
        } catch (n2.g e13) {
            t(e13, e13.f17047a);
        } catch (u2.b e14) {
            t(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        boolean z10;
        p1[] p1VarArr = this.f12536a;
        int c10 = p1VarArr[i10].c();
        p1 p1Var = p1VarArr[i10];
        b bVar = p1Var.f12567a;
        i iVar = this.f12566y;
        p1Var.a(bVar, iVar);
        b bVar2 = p1Var.f12569c;
        if (bVar2 != null) {
            if (bVar2.f12317n != 0 && p1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            p1Var.a(bVar2, iVar);
            p1Var.i(false);
            if (z10) {
                b bVar3 = p1Var.f12567a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        p1Var.d = 0;
        H(i10, false);
        this.f12550k0 -= c10;
    }

    public final void i0(int i10) {
        this.f12545f0 = i10;
        b2.o1 o1Var = this.X.f12452a;
        x0 x0Var = this.H;
        x0Var.f12630g = i10;
        int r10 = x0Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.j():void");
    }

    public final void j0(boolean z10) {
        if (!z10) {
            o0 o0Var = this.V;
            e2.i0 i0Var = this.f12552n;
            if (o0Var != null && this.U && !i0Var.f8239a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new ah.g(this, i10, 11));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            o0 o0Var2 = this.V;
            if (o0Var2 != null) {
                X(o0Var2);
                this.V = null;
                this.U = false;
            }
        }
        this.T = z10;
        c();
    }

    public final void k(v0 v0Var, int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        p1 p1Var = this.f12536a[i10];
        boolean g10 = p1Var.g();
        b bVar = p1Var.f12567a;
        if (!g10) {
            if (v0Var == this.H.f12631i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.t tVar = v0Var.f12612o;
            o1 o1Var = tVar.f49201b[i10];
            x2.p pVar = tVar.f49202c[i10];
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
            this.f12550k0++;
            u2.d1 d1Var = v0Var.f12603c[i10];
            long j11 = v0Var.f12613p;
            u2.g0 g0Var = v0Var.f12605g.f12616a;
            b bVar2 = p1Var.f12569c;
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
            i iVar = this.f12566y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                p1Var.f12570f = true;
                bVar2.getClass();
                if (bVar2.f12317n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                u6.p(z15);
                bVar2.d = o1Var;
                bVar2.G = g0Var;
                bVar2.f12317n = 1;
                bVar2.o(z13, z11);
                bVar2.y(wVarArr, d1Var, j10, j11, g0Var);
                bVar2.z(j10, z13, true);
                iVar.c(bVar2);
            } else {
                p1Var.e = true;
                if (bVar.f12317n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                u6.p(z14);
                bVar.d = o1Var;
                bVar.G = g0Var;
                bVar.f12317n = 1;
                bVar.o(z13, z11);
                bVar.y(wVarArr, d1Var, j10, j11, g0Var);
                bVar.z(j10, z13, true);
                iVar.c(bVar);
            }
            j0 j0Var = new j0(this);
            b d = p1Var.d(v0Var);
            d.getClass();
            d.c(11, j0Var);
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
        v0 v0Var = this.H.f12632j;
        x2.t tVar = v0Var.f12612o;
        int i10 = 0;
        while (true) {
            p1VarArr = this.f12536a;
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
            if (!tVar.b(i11) || p1VarArr[i11].d(v0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                k(v0Var, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public final void l0(r1 r1Var) {
        this.R = r1Var;
    }

    public final long m(b2.o1 o1Var, Object obj, long j10) {
        b2.l1 l1Var = this.f12564w;
        int i10 = o1Var.g(obj, l1Var).f3825c;
        b2.n1 n1Var = this.v;
        o1Var.n(i10, n1Var);
        if (n1Var.f3873f == -9223372036854775807L || !n1Var.a() || !n1Var.f3875i) {
            return -9223372036854775807L;
        }
        return e2.m0.S(e2.m0.C(n1Var.f3874g) - n1Var.f3873f) - (j10 + l1Var.e);
    }

    public final void m0(boolean z10) {
        this.f12546g0 = z10;
        b2.o1 o1Var = this.X.f12452a;
        x0 x0Var = this.H;
        x0Var.h = z10;
        int r10 = x0Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long n(v0 v0Var) {
        if (v0Var == null) {
            return 0L;
        }
        long j10 = v0Var.f12613p;
        if (!v0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            p1[] p1VarArr = this.f12536a;
            if (i10 < p1VarArr.length) {
                if (p1VarArr[i10].d(v0Var) != null) {
                    b d = p1VarArr[i10].d(v0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f12321x;
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

    public final void n0(u2.i1 i1Var) {
        this.Y.f(1);
        h1 h1Var = this.I;
        int size = h1Var.f12438b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        h1Var.f12443j = i1Var;
        w(h1Var.b(), false);
    }

    public final Pair o(b2.o1 o1Var) {
        long j10 = 0;
        if (o1Var.p()) {
            return Pair.create(i1.f12451u, 0L);
        }
        int a2 = o1Var.a(this.f12546g0);
        Pair i10 = o1Var.i(this.v, this.f12564w, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(o1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f47327a;
            b2.l1 l1Var = this.f12564w;
            o1Var.g(obj, l1Var);
            if (p5.f47329c == l1Var.e(p5.f47328b)) {
                l1Var.f3827g.getClass();
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
                this.f12558r0 = -9223372036854775807L;
            }
            if (i10 != 3 && i1Var.f12464p) {
                this.X = i1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final long p(long j10) {
        v0 v0Var = this.H.f12634l;
        if (v0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - v0Var.f12613p));
    }

    public final void p0(a3.y yVar) {
        p1[] p1VarArr;
        for (p1 p1Var : this.f12536a) {
            b bVar = p1Var.f12567a;
            if (bVar.f12314b == 2) {
                bVar.c(7, yVar);
                b bVar2 = p1Var.f12569c;
                if (bVar2 != null) {
                    bVar2.c(7, yVar);
                }
            }
        }
    }

    public final void q(int i10) {
        i1 i1Var = this.X;
        B0(i10, i1Var.f12462n, i1Var.f12461m, i1Var.f12460l);
    }

    public final void q0(Object obj, e2.i iVar) {
        p1[] p1VarArr;
        for (p1 p1Var : this.f12536a) {
            b bVar = p1Var.f12567a;
            if (bVar.f12314b == 2) {
                int i10 = p1Var.d;
                if (i10 != 4 && i10 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = p1Var.f12569c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.f12552n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r() {
        r0(this.f12563v0);
    }

    public final void r0(float f7) {
        p1[] p1VarArr;
        this.f12563v0 = f7;
        float f10 = f7 * this.P.f4502g;
        for (p1 p1Var : this.f12536a) {
            b bVar = p1Var.f12567a;
            if (bVar.f12314b == 1) {
                bVar.c(2, Float.valueOf(f10));
                b bVar2 = p1Var.f12569c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s(u2.e0 e0Var) {
        x0 x0Var = this.H;
        v0 v0Var = x0Var.f12634l;
        if (v0Var != null && v0Var.f12601a == e0Var) {
            x0Var.m(this.m0);
            D();
            return;
        }
        v0 v0Var2 = x0Var.f12635m;
        if (v0Var2 != null && v0Var2.f12601a == e0Var) {
            E();
        }
    }

    public final boolean s0() {
        i1 i1Var = this.X;
        if (i1Var.f12460l && i1Var.f12462n == 0) {
            return true;
        }
        return false;
    }

    public final void t(IOException iOException, int i10) {
        l lVar = new l(0, iOException, i10);
        v0 v0Var = this.H.f12631i;
        if (v0Var != null) {
            lVar = lVar.a(v0Var.f12605g.f12616a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.X = this.X.f(lVar);
    }

    public final boolean t0(b2.o1 o1Var, u2.g0 g0Var) {
        if (!g0Var.b() && !o1Var.p()) {
            int i10 = o1Var.g(g0Var.f47327a, this.f12564w).f3825c;
            b2.n1 n1Var = this.v;
            o1Var.n(i10, n1Var);
            if (n1Var.a() && n1Var.f3875i && n1Var.f3873f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(boolean z10) {
        u2.g0 g0Var;
        long d;
        v0 v0Var = this.H.f12634l;
        if (v0Var == null) {
            g0Var = this.X.f12453b;
        } else {
            g0Var = v0Var.f12605g.f12616a;
        }
        boolean equals = this.X.f12459k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        i1 i1Var = this.X;
        if (v0Var == null) {
            d = i1Var.f12467s;
        } else {
            d = v0Var.d();
        }
        i1Var.f12465q = d;
        i1 i1Var2 = this.X;
        i1Var2.f12466r = p(i1Var2.f12465q);
        if ((!equals || z10) && v0Var != null && v0Var.e) {
            y0(v0Var.f12605g.f12616a, v0Var.f12612o);
        }
    }

    public final void u0() {
        v0 v0Var = this.H.f12631i;
        if (v0Var != null) {
            x2.t tVar = v0Var.f12612o;
            int i10 = 0;
            while (true) {
                p1[] p1VarArr = this.f12536a;
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
    public final void v(u2.f1 f1Var) {
        this.f12552n.b(9, (u2.e0) f1Var).b();
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f12547h0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        h hVar = (h) this.f12544f;
        ConcurrentHashMap concurrentHashMap = hVar.f12433p;
        j2.k kVar = this.L;
        g gVar = (g) concurrentHashMap.get(kVar);
        if (gVar != null) {
            int i10 = gVar.f12374a - 1;
            gVar.f12374a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(kVar);
                hVar.c();
            }
        }
        this.P.d(1, this.X.f12460l);
        o0(1);
    }

    public final void w(b2.o1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.w(b2.o1, boolean):void");
    }

    public final void w0() {
        p1[] p1VarArr;
        i iVar = this.f12566y;
        iVar.f12449f = false;
        s1 s1Var = iVar.f12446a;
        if (s1Var.f12591c) {
            s1Var.c(s1Var.a());
            s1Var.f12591c = false;
        }
        for (p1 p1Var : this.f12536a) {
            b bVar = p1Var.f12569c;
            b bVar2 = p1Var.f12567a;
            if (p1.h(bVar2)) {
                p1.b(bVar2);
            }
            if (bVar != null && bVar.f12317n != 0) {
                p1.b(bVar);
            }
        }
    }

    public final void x(u2.e0 e0Var) {
        v0 v0Var;
        x0 x0Var = this.H;
        v0 v0Var2 = x0Var.f12634l;
        i iVar = this.f12566y;
        if (v0Var2 != null && v0Var2.f12601a == e0Var) {
            v0Var2.getClass();
            if (!v0Var2.e) {
                float f7 = iVar.h().f4155a;
                i1 i1Var = this.X;
                v0Var2.f(f7, i1Var.f12452a, i1Var.f12460l);
            }
            y0(v0Var2.f12605g.f12616a, v0Var2.f12612o);
            if (v0Var2 == x0Var.f12631i) {
                R(v0Var2.f12605g.f12617b, true);
                l(x0Var.f12632j.e(), new boolean[this.f12536a.length]);
                v0Var2.h = true;
                i1 i1Var2 = this.X;
                u2.g0 g0Var = i1Var2.f12453b;
                long j10 = v0Var2.f12605g.f12617b;
                this.X = z(g0Var, j10, i1Var2.f12454c, j10, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < x0Var.f12639q.size()) {
                v0Var = (v0) x0Var.f12639q.get(i10);
                if (v0Var.f12601a == e0Var) {
                    break;
                }
                i10++;
            } else {
                v0Var = null;
                break;
            }
        }
        if (v0Var != null) {
            u6.p(true ^ v0Var.e);
            float f10 = iVar.h().f4155a;
            i1 i1Var3 = this.X;
            v0Var.f(f10, i1Var3.f12452a, i1Var3.f12460l);
            v0 v0Var3 = x0Var.f12635m;
            if (v0Var3 != null && v0Var3.f12601a == e0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z10;
        v0 v0Var = this.H.f12634l;
        if (!this.f12543e0 && (v0Var == null || !v0Var.f12601a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        i1 i1Var = this.X;
        if (z10 != i1Var.f12456g) {
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
        float f10 = z0Var.f4155a;
        v0 v0Var = this.H.f12631i;
        while (true) {
            i10 = 0;
            if (v0Var == null) {
                break;
            }
            x2.p[] pVarArr = v0Var.f12612o.f49202c;
            int length = pVarArr.length;
            while (i10 < length) {
                x2.p pVar = pVarArr[i10];
                if (pVar != null) {
                    pVar.p(f10);
                }
                i10++;
            }
            v0Var = v0Var.f12610m;
        }
        p1[] p1VarArr = this.f12536a;
        int length2 = p1VarArr.length;
        while (i10 < length2) {
            p1 p1Var = p1VarArr[i10];
            float f11 = z0Var.f4155a;
            p1Var.f12567a.A(f7, f11);
            b bVar = p1Var.f12569c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(u2.g0 r10, x2.t r11) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.y0(u2.g0, x2.t):void");
    }

    public final i1 z(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        x1 x1Var;
        boolean z13;
        boolean z14;
        if (!this.f12555p0 && j10 == this.X.f12467s && g0Var.equals(this.X.f12453b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f12555p0 = z11;
        Q();
        i1 i1Var = this.X;
        u2.r1 r1Var = i1Var.h;
        x2.t tVar = i1Var.f12457i;
        List list = i1Var.f12458j;
        if (this.I.f12444k) {
            v0 v0Var = this.H.f12631i;
            if (v0Var == null) {
                r1Var = u2.r1.d;
            } else {
                r1Var = v0Var.f12611n;
            }
            if (v0Var == null) {
                tVar = this.e;
            } else {
                tVar = v0Var.f12612o;
            }
            x2.p[] pVarArr = tVar.f49202c;
            ?? g0Var2 = new e9.g0(4);
            boolean z15 = false;
            for (x2.p pVar : pVarArr) {
                if (pVar != null) {
                    b2.t0 t0Var = pVar.f(0).f4124l;
                    if (t0Var == null) {
                        g0Var2.c(new b2.t0(new b2.s0[0]));
                    } else {
                        g0Var2.c(t0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                x1Var = g0Var2.f();
            } else {
                e9.l0 l0Var = e9.n0.f8476b;
                x1Var = x1.e;
            }
            list = x1Var;
            if (v0Var != null) {
                w0 w0Var = v0Var.f12605g;
                if (w0Var.d != j11) {
                    v0Var.f12605g = w0Var.a(j11);
                }
            }
            p1[] p1VarArr = this.f12536a;
            x0 x0Var = this.H;
            v0 v0Var2 = x0Var.f12631i;
            if (v0Var2 == x0Var.f12632j && v0Var2 != null) {
                x2.t tVar2 = v0Var2.f12612o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < p1VarArr.length) {
                        if (tVar2.b(i11)) {
                            if (p1VarArr[i11].f12567a.f12314b != 1) {
                                z13 = false;
                                break;
                            } else if (tVar2.f49201b[i11].f12533a != 0) {
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
                if (z14 != this.f12549j0) {
                    this.f12549j0 = z14;
                    if (!z14 && this.X.f12464p) {
                        this.f12552n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(i1Var.f12453b)) {
            r1Var = u2.r1.d;
            tVar = this.e;
            list = x1.e;
        }
        u2.r1 r1Var2 = r1Var;
        x2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            m0 m0Var = this.Y;
            if (m0Var.d && m0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
            } else {
                m0Var.f12491c = true;
                m0Var.d = true;
                m0Var.e = i10;
            }
        }
        i1 i1Var2 = this.X;
        return i1Var2.d(g0Var, j10, j11, j12, p(i1Var2.f12465q), r1Var2, tVar3, list2);
    }

    public final void z0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.Y.f(1);
        h1 h1Var = this.I;
        h1Var.getClass();
        ArrayList arrayList = h1Var.f12438b;
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
            ((g1) arrayList.get(i12)).f12417a.t((b2.o0) list.get(i12 - i10));
        }
        w(h1Var.b(), false);
    }
}
