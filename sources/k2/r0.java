package k2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b8.zb;
import ci.c8;
import ei.y8;
import gi.f6;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class r0 implements Handler.Callback, w2.d0, k1, c3.w {
    public static final long f16687x0 = g2.n0.h0(10000);
    public final i E;
    public final ArrayList F;
    public final g2.h0 G;
    public final w H;
    public final z0 I;
    public final i1 J;
    public final f K;
    public final long L;
    public final l2.k M;
    public final l2.f N;
    public final g2.j0 O;
    public final boolean P;
    public final e2.d Q;
    public final boolean R;
    public t1 S;
    public s1 T;
    public boolean U;
    public boolean V;
    public q0 W;
    public int X;
    public j1 Y;
    public o0 Z;
    public final r1[] f16688a;
    public boolean f16689a0;
    public final b[] f16690b;
    public boolean f16691b0;
    public final boolean[] f16692c;
    public boolean f16693c0;
    public final z2.s d;
    public boolean f16694d0;
    public final z2.t f16695e;
    public long f16696e0;
    public final t0 f16697f;
    public boolean f16698f0;
    public int f16699g0;
    public final a3.d h;
    public boolean f16700h0;
    public boolean f16701i0;
    public boolean f16702j0;
    public boolean f16703k0;
    public int f16704l0;
    public q0 m0;
    public final g2.j0 f16705n;
    public long f16706n0;
    public long f16707o0;
    public int f16708p0;
    public boolean f16709q0;
    public final l6.n f16710r;
    public l f16711r0;
    public final Looper f16712s;
    public long f16713s0;
    public o f16714t0;
    public long f16715u0;
    public boolean f16716v0;
    public final d2.m1 f16717w;
    public float f16718w0;
    public final d2.k1 f16719x;
    public final long f16720y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, z2.s sVar, z2.t tVar, t0 t0Var, a3.d dVar, int i3, boolean z10, l2.f fVar, t1 t1Var, f fVar2, long j10, Looper looper, g2.h0 h0Var, w wVar, l2.k kVar, final c3.w wVar2, boolean z11) {
        o oVar = o.f16658a;
        this.f16715u0 = -9223372036854775807L;
        this.H = wVar;
        this.d = sVar;
        this.f16695e = tVar;
        this.f16697f = t0Var;
        this.h = dVar;
        this.f16699g0 = i3;
        this.f16700h0 = z10;
        this.S = t1Var;
        this.K = fVar2;
        this.L = j10;
        this.f16691b0 = false;
        this.G = h0Var;
        this.M = kVar;
        this.f16714t0 = oVar;
        this.N = fVar;
        this.f16718w0 = 1.0f;
        this.T = s1.f16732b;
        this.R = z11;
        this.f16713s0 = -9223372036854775807L;
        this.f16696e0 = -9223372036854775807L;
        this.f16720y = ((h) t0Var).f16524n;
        d2.j1 j1Var = d2.n1.f8245a;
        j1 k10 = j1.k(tVar);
        this.Y = k10;
        this.Z = new o0(k10);
        this.f16690b = new b[bVarArr.length];
        this.f16692c = new boolean[bVarArr.length];
        z2.n nVar = (z2.n) sVar;
        nVar.getClass();
        this.f16688a = new r1[bVarArr.length];
        boolean z12 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.f16446e = i10;
            bVar.f16447f = kVar;
            bVar.h = h0Var;
            this.f16690b[i10] = bVar;
            b bVar2 = this.f16690b[i10];
            synchronized (bVar2.f16443a) {
                bVar2.I = nVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.f16446e = i10;
                bVar3.f16447f = kVar;
                bVar3.h = h0Var;
                z12 = true;
            }
            this.f16688a[i10] = new r1(bVarArr[i10], bVar3, i10);
        }
        this.P = z12;
        this.E = new i(this, h0Var);
        this.F = new ArrayList();
        this.f16717w = new d2.m1();
        this.f16719x = new d2.k1();
        zb.p(sVar.f59643a == null);
        sVar.f59643a = this;
        sVar.f59644b = dVar;
        this.f16709q0 = true;
        g2.j0 a10 = h0Var.a(looper, null);
        this.O = a10;
        this.I = new z0(fVar, a10, new y8(this, 23));
        this.J = new i1(this, fVar, a10, kVar);
        l6.n nVar2 = new l6.n(6);
        this.f16710r = nVar2;
        Looper e10 = nVar2.e();
        this.f16712s = e10;
        g2.j0 a11 = h0Var.a(e10, this);
        this.f16705n = a11;
        this.Q = new e2.d(context, e10, this);
        a11.b(35, new c3.w() {
            @Override
            public final void a(long j11, long j12, d2.v vVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                wVar2.a(j11, j12, vVar, mediaFormat);
                r0Var.a(j11, j12, vVar, mediaFormat);
            }
        }).b();
        a11.b(39, new k0(this)).b();
    }

    public static boolean A(x0 x0Var) {
        w2.d1[] d1VarArr;
        long e10;
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.f16760a;
                if (!x0Var.f16763e) {
                    r12.g();
                } else {
                    for (w2.d1 d1Var : x0Var.f16762c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                }
                if (!x0Var.f16763e) {
                    e10 = 0;
                } else {
                    e10 = r12.e();
                }
                if (e10 != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(d2.n1 n1Var, q0 q0Var, boolean z10, int i3, boolean z11, d2.m1 m1Var, d2.k1 k1Var) {
        d2.n1 n1Var2;
        int U;
        d2.n1 n1Var3 = q0Var.f16680a;
        if (!n1Var.p()) {
            if (n1Var3.p()) {
                n1Var2 = n1Var;
            } else {
                n1Var2 = n1Var3;
            }
            try {
                Pair i10 = n1Var2.i(m1Var, k1Var, q0Var.f16681b, q0Var.f16682c);
                if (!n1Var.equals(n1Var2)) {
                    if (n1Var.b(i10.first) != -1) {
                        if (n1Var2.g(i10.first, k1Var).f8165f && n1Var2.m(k1Var.f8163c, m1Var, 0L).f8219n == n1Var2.b(i10.first)) {
                            return n1Var.i(m1Var, k1Var, n1Var.g(i10.first, k1Var).f8163c, q0Var.f16682c);
                        }
                    } else if (z10 && (U = U(m1Var, k1Var, i3, z11, i10.first, n1Var2, n1Var)) != -1) {
                        return n1Var.i(m1Var, k1Var, U, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i10;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int U(d2.m1 m1Var, d2.k1 k1Var, int i3, boolean z10, Object obj, d2.n1 n1Var, d2.n1 n1Var2) {
        d2.m1 m1Var2 = m1Var;
        d2.n1 n1Var3 = n1Var;
        Object obj2 = n1Var3.m(n1Var3.g(obj, k1Var).f8163c, m1Var, 0L).f8208a;
        for (int i10 = 0; i10 < n1Var2.o(); i10++) {
            if (n1Var2.m(i10, m1Var, 0L).f8208a.equals(obj2)) {
                return i10;
            }
        }
        int b10 = n1Var3.b(obj);
        int h = n1Var3.h();
        int i11 = -1;
        int i12 = 0;
        while (i12 < h && i11 == -1) {
            d2.n1 n1Var4 = n1Var3;
            int d = n1Var4.d(b10, k1Var, m1Var2, i3, z10);
            if (d == -1) {
                break;
            }
            i11 = n1Var2.b(n1Var4.l(d));
            i12++;
            n1Var3 = n1Var4;
            b10 = d;
            m1Var2 = m1Var;
        }
        if (i11 == -1) {
            return -1;
        }
        return n1Var2.f(i11, k1Var, false).f8163c;
    }

    public static void g(m1 m1Var) {
        try {
            synchronized (m1Var) {
                synchronized (m1Var) {
                }
                m1Var.f16626a.d(m1Var.f16628c, m1Var.d);
                return;
            }
            m1Var.f16626a.d(m1Var.f16628c, m1Var.d);
            return;
        } finally {
            m1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.A0():void");
    }

    public final boolean B(int i3, w2.g0 g0Var) {
        boolean z10;
        boolean z11;
        z0 z0Var = this.I;
        x0 x0Var = z0Var.f16796k;
        if (x0Var != null && x0Var.f16765g.f16777a.equals(g0Var)) {
            r1 r1Var = this.f16688a[i3];
            x0 x0Var2 = z0Var.f16796k;
            int i10 = r1Var.d;
            if ((i10 == 2 || i10 == 4) && r1Var.d(x0Var2) == r1Var.f16721a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (r1Var.d == 3 && r1Var.d(x0Var2) == r1Var.f16723c) {
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

    public final void B0(int i3, int i10, int i11, boolean z10) {
        boolean z11;
        z2.p[] pVarArr;
        if (z10 && i3 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i3 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z12 = this.U;
        if (i3 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            if (z12) {
                i10 = 4;
            } else {
                i10 = 0;
            }
        }
        j1 j1Var = this.Y;
        if (j1Var.f16606l != z11 || j1Var.f16608n != i10 || j1Var.f16607m != i11) {
            this.Y = j1Var.e(i11, i10, z11);
            E0(false, false);
            z0 z0Var = this.I;
            for (x0 x0Var = z0Var.f16794i; x0Var != null; x0Var = x0Var.f16770m) {
                for (z2.p pVar : x0Var.f16772o.f59648c) {
                    if (pVar != null) {
                        pVar.f(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                j1 j1Var2 = this.Y;
                if (j1Var2.f16610p) {
                    this.Y = j1Var2.i(false);
                }
                z0Var.m(this.f16706n0);
                return;
            }
            int i12 = this.Y.f16600e;
            g2.j0 j0Var = this.f16705n;
            if (i12 == 3) {
                i iVar = this.E;
                iVar.f16539f = true;
                iVar.f16535a.e();
                u0();
                j0Var.f(2);
            } else if (i12 == 2) {
                j0Var.f(2);
            }
        }
    }

    public final boolean C() {
        x0 x0Var = this.I.f16794i;
        long j10 = x0Var.f16765g.f16781f;
        if (x0Var.f16763e) {
            if (j10 == -9223372036854775807L || this.Y.f16613s < j10 || !s0()) {
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
        float f10;
        x0 x0Var = this.I.f16794i;
        if (x0Var != null) {
            if (x0Var.f16763e) {
                j10 = x0Var.f16760a.n();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!x0Var.g()) {
                    this.I.n(x0Var);
                    v(false);
                    D();
                }
                R(j10, true);
                if (j10 != this.Y.f16613s) {
                    j1 j1Var = this.Y;
                    this.Y = z(j1Var.f16598b, j10, j1Var.f16599c, j10, true, 5);
                }
            } else {
                i iVar = this.E;
                if (x0Var != this.I.f16795j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1 u1Var = iVar.f16535a;
                b bVar = iVar.f16537c;
                if (bVar != null && !bVar.l() && ((!z10 || iVar.f16537c.f16448n == 2) && (iVar.f16537c.m() || (!z10 && !iVar.f16537c.k())))) {
                    w0 w0Var = iVar.d;
                    w0Var.getClass();
                    long a10 = w0Var.a();
                    if (iVar.f16538e) {
                        if (a10 < u1Var.a()) {
                            if (u1Var.f16749c) {
                                u1Var.d(u1Var.a());
                                u1Var.f16749c = false;
                            }
                        } else {
                            iVar.f16538e = false;
                            if (iVar.f16539f) {
                                u1Var.e();
                            }
                        }
                    }
                    u1Var.d(a10);
                    d2.y0 g7 = w0Var.g();
                    if (!g7.equals((d2.y0) u1Var.f16750e)) {
                        u1Var.c(g7);
                        iVar.f16536b.f16705n.b(16, g7).b();
                    }
                } else {
                    iVar.f16538e = true;
                    if (iVar.f16539f) {
                        u1Var.e();
                    }
                }
                long a11 = iVar.a();
                this.f16706n0 = a11;
                long j13 = a11 - x0Var.f16773p;
                long j14 = this.Y.f16613s;
                ArrayList arrayList = this.F;
                if (!arrayList.isEmpty() && !this.Y.f16598b.b()) {
                    if (this.f16709q0) {
                        this.f16709q0 = false;
                    }
                    j1 j1Var2 = this.Y;
                    j1Var2.f16597a.b(j1Var2.f16598b.f57081a);
                    int min = Math.min(this.f16708p0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f16708p0 = min;
                }
                if (this.E.b()) {
                    boolean z11 = !this.Z.d;
                    j1 j1Var3 = this.Y;
                    this.Y = z(j1Var3.f16598b, j13, j1Var3.f16599c, j13, z11, 6);
                } else {
                    j1 j1Var4 = this.Y;
                    j1Var4.f16613s = j13;
                    j1Var4.f16614t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.f16611q = this.I.f16797l.d();
            j1 j1Var5 = this.Y;
            j1Var5.f16612r = q(j1Var5.f16611q);
            j1 j1Var6 = this.Y;
            if (j1Var6.f16606l && j1Var6.f16600e == 3 && t0(j1Var6.f16597a, j1Var6.f16598b)) {
                j1 j1Var7 = this.Y;
                float f11 = 1.0f;
                if (j1Var7.f16609o.f8517a == 1.0f) {
                    f fVar = this.K;
                    long n4 = n(j1Var7.f16597a, j1Var7.f16598b.f57081a, j1Var7.f16613s);
                    long j15 = this.Y.f16612r;
                    if (fVar.f16491c != -9223372036854775807L) {
                        long j16 = n4 - j15;
                        if (fVar.f16499m == -9223372036854775807L) {
                            fVar.f16499m = j16;
                            fVar.f16500n = 0L;
                        } else {
                            fVar.f16499m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            fVar.f16500n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) fVar.f16500n) * 0.999f);
                        }
                        if (fVar.f16498l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - fVar.f16498l < 1000) {
                                f11 = fVar.f16497k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        fVar.f16498l = SystemClock.elapsedRealtime();
                        long j17 = (fVar.f16500n * 3) + fVar.f16499m;
                        if (fVar.h > j17) {
                            float S = (float) g2.n0.S(j12);
                            f10 = 1.0E-7f;
                            long[] jArr = {j17, fVar.f16492e, fVar.h - (((fVar.f16497k - 1.0f) * S) + ((fVar.f16495i - 1.0f) * S))};
                            long j18 = jArr[0];
                            for (int i3 = 1; i3 < 3; i3++) {
                                long j19 = jArr[i3];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            fVar.h = j18;
                        } else {
                            f10 = 1.0E-7f;
                            long j20 = g2.n0.j(n4 - (Math.max(0.0f, fVar.f16497k - 1.0f) / 1.0E-7f), fVar.h, j17);
                            fVar.h = j20;
                            long j21 = fVar.f16494g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                fVar.h = j21;
                            }
                        }
                        long j22 = n4 - fVar.h;
                        if (Math.abs(j22) < fVar.f16489a) {
                            fVar.f16497k = 1.0f;
                        } else {
                            fVar.f16497k = g2.n0.h((f10 * ((float) j22)) + 1.0f, fVar.f16496j, fVar.f16495i);
                        }
                        f11 = fVar.f16497k;
                    }
                    if (this.E.g().f8517a != f11) {
                        d2.y0 y0Var = new d2.y0(f11, this.Y.f16609o.f8518b);
                        this.f16705n.e(16);
                        this.E.c(y0Var);
                        y(this.Y.f16609o, this.E.g().f8517a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        long e10;
        long j10;
        boolean b10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.I.f16797l)) {
            b10 = false;
        } else {
            x0 x0Var = this.I.f16797l;
            if (!x0Var.f16763e) {
                e10 = 0;
            } else {
                e10 = x0Var.f16760a.e();
            }
            long q10 = q(e10);
            x0 x0Var2 = this.I.f16794i;
            if (t0(this.Y.f16597a, x0Var.f16765g.f16777a)) {
                j10 = this.K.h;
            } else {
                j10 = -9223372036854775807L;
            }
            l2.k kVar = this.M;
            d2.n1 n1Var = this.Y.f16597a;
            w2.g0 g0Var = x0Var.f16765g.f16777a;
            float f10 = this.E.g().f8517a;
            boolean z13 = this.Y.f16606l;
            s0 s0Var = new s0(kVar, n1Var, g0Var, q10, f10, this.f16694d0, j10);
            b10 = ((h) this.f16697f).b(s0Var);
            x0 x0Var3 = this.I.f16794i;
            if (!b10 && x0Var3.f16763e && q10 < 500000 && this.f16720y > 0) {
                x0Var3.f16760a.l(this.Y.f16613s);
                b10 = ((h) this.f16697f).b(s0Var);
            }
        }
        this.f16698f0 = b10;
        if (b10) {
            x0 x0Var4 = this.I.f16797l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.f16744a = this.f16706n0 - x0Var4.f16773p;
            float f11 = this.E.g().f8517a;
            if (f11 <= 0.0f && f11 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            zb.f(z10);
            u0Var.f16745b = f11;
            long j11 = this.f16696e0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            zb.f(z11);
            u0Var.f16746c = j11;
            v0 v0Var = new v0(u0Var);
            if (x0Var4.f16770m == null) {
                z12 = true;
            }
            zb.p(z12);
            x0Var4.f16760a.c(v0Var);
        }
        x0();
    }

    public final void D0(d2.n1 n1Var, w2.g0 g0Var, d2.n1 n1Var2, w2.g0 g0Var2, long j10, boolean z10) {
        Object obj;
        d2.y0 y0Var;
        boolean t02 = t0(n1Var, g0Var);
        Object obj2 = g0Var.f57081a;
        if (!t02) {
            if (g0Var.b()) {
                y0Var = d2.y0.d;
            } else {
                y0Var = this.Y.f16609o;
            }
            i iVar = this.E;
            if (!iVar.g().equals(y0Var)) {
                this.f16705n.e(16);
                iVar.c(y0Var);
                y(this.Y.f16609o, y0Var.f8517a, false, false);
                return;
            }
            return;
        }
        d2.k1 k1Var = this.f16719x;
        int i3 = n1Var.g(obj2, k1Var).f8163c;
        d2.m1 m1Var = this.f16717w;
        n1Var.n(i3, m1Var);
        d2.h0 h0Var = m1Var.f8215j;
        f fVar = this.K;
        fVar.getClass();
        fVar.f16491c = g2.n0.S(h0Var.f8121a);
        fVar.f16493f = g2.n0.S(h0Var.f8122b);
        fVar.f16494g = g2.n0.S(h0Var.f8123c);
        float f10 = h0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        fVar.f16496j = f10;
        float f11 = h0Var.f8124e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        fVar.f16495i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            fVar.f16491c = -9223372036854775807L;
        }
        fVar.a();
        if (j10 != -9223372036854775807L) {
            fVar.d = n(n1Var, obj2, j10);
            fVar.a();
            return;
        }
        Object obj3 = m1Var.f8208a;
        if (!n1Var2.p()) {
            obj = n1Var2.m(n1Var2.g(g0Var2.f57081a, k1Var).f8163c, m1Var, 0L).f8208a;
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
        z0 z0Var = this.I;
        z0Var.k();
        x0 x0Var = z0Var.f16798m;
        if (x0Var != null) {
            ?? r12 = x0Var.f16760a;
            if ((!x0Var.d || x0Var.f16763e) && !r12.d()) {
                d2.n1 n1Var = this.Y.f16597a;
                if (x0Var.f16763e) {
                    r12.q();
                }
                for (g gVar : ((h) this.f16697f).f16526p.values()) {
                    if (gVar.f16505b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!x0Var.d) {
                    long j10 = x0Var.f16765g.f16778b;
                    x0Var.d = true;
                    r12.i(this, j10);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.f16744a = this.f16706n0 - x0Var.f16773p;
                float f10 = this.E.g().f8517a;
                if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zb.f(z10);
                u0Var.f16745b = f10;
                long j11 = this.f16696e0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                zb.f(z11);
                u0Var.f16746c = j11;
                v0 v0Var = new v0(u0Var);
                if (x0Var.f16770m != null) {
                    z12 = false;
                }
                zb.p(z12);
                r12.c(v0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f16694d0 = z10;
        if (z10 && !z11) {
            this.G.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f16696e0 = j10;
    }

    public final void F() {
        boolean z10;
        o0 o0Var = this.Z;
        j1 j1Var = this.Y;
        boolean z11 = o0Var.f16661c;
        if (((j1) o0Var.f16663f) != j1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        o0Var.f16661c = z12;
        o0Var.f16663f = j1Var;
        if (z12) {
            i0 i0Var = this.H.f16757b;
            i0Var.f16555j.d(new ii.e(10, i0Var, o0Var));
            this.Z = new o0(this.Y);
        }
    }

    public final void G(int i3) {
        r1 r1Var = this.f16688a[i3];
        try {
            x0 x0Var = this.I.f16794i;
            x0Var.getClass();
            b d = r1Var.d(x0Var);
            d.getClass();
            w2.d1 d1Var = d.f16449r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = r1Var.f16721a.f16444b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            z2.t tVar = this.I.f16794i.f16772o;
            g2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + d2.v.c(tVar.f59648c[i3].n()), e10);
            z2.t tVar2 = new z2.t((q1[]) tVar.f59647b.clone(), (z2.p[]) tVar.f59648c.clone(), tVar.d, tVar.f59649e);
            tVar2.f59647b[i3] = null;
            tVar2.f59648c[i3] = null;
            i(i3);
            x0 x0Var2 = this.I.f16794i;
            x0Var2.a(tVar2, this.Y.f16613s, false, new boolean[x0Var2.f16767j.length]);
        }
    }

    public final void H(int i3, boolean z10) {
        boolean[] zArr = this.f16692c;
        if (zArr[i3] != z10) {
            zArr[i3] = z10;
            this.O.d(new c8(this, i3, z10, 1));
        }
    }

    public final void I() {
        w(this.J.b(), true);
    }

    public final void J(n0 n0Var) {
        boolean z10;
        d2.n1 b10;
        this.Z.f(1);
        int i3 = n0Var.f16654a;
        int i10 = n0Var.f16655b;
        int i11 = n0Var.f16656c;
        w2.i1 i1Var = n0Var.d;
        i1 i1Var2 = this.J;
        ArrayList arrayList = i1Var2.f16582b;
        if (i3 >= 0 && i3 <= i10 && i10 <= arrayList.size() && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        i1Var2.f16588j = i1Var;
        if (i3 != i10 && i3 != i11) {
            int min = Math.min(i3, i11);
            int max = Math.max(((i10 - i3) + i11) - 1, i10 - 1);
            int i12 = ((h1) arrayList.get(min)).d;
            g2.n0.R(i3, i10, i11, arrayList);
            while (min <= max) {
                h1 h1Var = (h1) arrayList.get(min);
                h1Var.d = i12;
                i12 += h1Var.f16531a.f57029o.f57209e.o();
                min++;
            }
            b10 = i1Var2.b();
        } else {
            b10 = i1Var2.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i3;
        int i10;
        this.Z.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f16697f;
        ConcurrentHashMap concurrentHashMap = hVar.f16526p;
        long id2 = Thread.currentThread().getId();
        long j10 = hVar.f16527q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        hVar.f16527q = id2;
        l2.k kVar = this.M;
        g gVar = (g) concurrentHashMap.get(kVar);
        if (gVar == null) {
            ?? obj = new Object();
            obj.f16504a = 1;
            concurrentHashMap.put(kVar, obj);
        } else {
            gVar.f16504a++;
        }
        g gVar2 = (g) concurrentHashMap.get(kVar);
        gVar2.getClass();
        Integer num = (Integer) hVar.f16525o.get(kVar.f17728a);
        if (num != null && num.intValue() != -1) {
            i3 = num.intValue();
        } else {
            i3 = hVar.f16522l;
        }
        if (i3 == -1) {
            i3 = 13107200;
        }
        gVar2.f16506c = i3;
        gVar2.f16505b = false;
        if (this.Y.f16597a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        o0(i10);
        j1 j1Var = this.Y;
        boolean z11 = j1Var.f16606l;
        B0(this.Q.d(j1Var.f16600e, z11), j1Var.f16608n, j1Var.f16607m, z11);
        a3.g gVar3 = (a3.g) this.h;
        gVar3.getClass();
        i1 i1Var = this.J;
        ArrayList arrayList = i1Var.f16582b;
        zb.p(!i1Var.f16589k);
        i1Var.f16590l = gVar3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h1 h1Var = (h1) arrayList.get(i11);
            i1Var.e(h1Var);
            i1Var.f16586g.add(h1Var);
        }
        i1Var.f16589k = true;
        this.f16705n.f(2);
    }

    public final void L(g2.j jVar) {
        l6.n nVar = this.f16710r;
        g2.j0 j0Var = this.f16705n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f16697f;
            l2.k kVar = this.M;
            h hVar = (h) t0Var;
            ConcurrentHashMap concurrentHashMap = hVar.f16526p;
            g gVar = (g) concurrentHashMap.get(kVar);
            if (gVar != null) {
                int i3 = gVar.f16504a - 1;
                gVar.f16504a = i3;
                if (i3 == 0) {
                    concurrentHashMap.remove(kVar);
                    hVar.c();
                }
            }
            if (hVar.f16526p.isEmpty()) {
                hVar.f16527q = -1L;
            }
            e2.d dVar = this.Q;
            dVar.f9334c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            j0Var.f11857a.removeCallbacksAndMessages(null);
            nVar.g();
            jVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i3 = 0; i3 < this.f16688a.length; i3++) {
            b bVar = this.f16690b[i3];
            synchronized (bVar.f16443a) {
                bVar.I = null;
            }
            r1 r1Var = this.f16688a[i3];
            b bVar2 = r1Var.f16721a;
            boolean z11 = true;
            if (bVar2.f16448n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
            bVar2.q();
            r1Var.f16724e = false;
            b bVar3 = r1Var.f16723c;
            if (bVar3 != null) {
                if (bVar3.f16448n != 0) {
                    z11 = false;
                }
                zb.p(z11);
                bVar3.q();
                r1Var.f16725f = false;
            }
        }
    }

    public final void N(int i3, int i10, w2.i1 i1Var) {
        boolean z10 = true;
        this.Z.f(1);
        i1 i1Var2 = this.J;
        i1Var2.getClass();
        if (i3 < 0 || i3 > i10 || i10 > i1Var2.f16582b.size()) {
            z10 = false;
        }
        zb.f(z10);
        i1Var2.f16588j = i1Var;
        i1Var2.g(i3, i10);
        w(i1Var2.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        x0 x0Var = this.I.f16794i;
        if (x0Var != null && x0Var.f16765g.f16784j && this.f16691b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16693c0 = z10;
    }

    public final void R(long j10, boolean z10) {
        z0 z0Var;
        long j11;
        r1[] r1VarArr;
        z2.p[] pVarArr;
        x0 x0Var = this.I.f16794i;
        if (x0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = x0Var.f16773p;
        }
        long j12 = j10 + j11;
        this.f16706n0 = j12;
        this.E.f16535a.d(j12);
        for (r1 r1Var : this.f16688a) {
            long j13 = this.f16706n0;
            b d = r1Var.d(x0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (x0 x0Var2 = z0Var.f16794i; x0Var2 != null; x0Var2 = x0Var2.f16770m) {
            for (z2.p pVar : x0Var2.f16772o.f59648c) {
                if (pVar != null) {
                    pVar.s();
                }
            }
        }
    }

    public final void S(d2.n1 n1Var, d2.n1 n1Var2) {
        if (n1Var.p() && n1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.F;
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
        boolean z10 = this.U;
        long j12 = 1000;
        long j13 = f16687x0;
        if (z10) {
            this.T.getClass();
            if (this.Y.f16600e != 3) {
                j12 = j13;
            }
            for (r1 r1Var : this.f16688a) {
                long j14 = this.f16706n0;
                long j15 = this.f16707o0;
                b bVar = r1Var.f16723c;
                b bVar2 = r1Var.f16721a;
                if (r1.h(bVar2)) {
                    j11 = bVar2.h(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f16448n != 0) {
                    j11 = Math.min(j11, bVar.h(j14, j15));
                }
                j12 = Math.min(j12, g2.n0.h0(j11));
            }
            if (this.Y.m()) {
                x0 x0Var2 = this.I.f16794i;
                if (x0Var2 != null) {
                    x0Var = x0Var2.f16770m;
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    if ((((float) g2.n0.S(j12)) * this.Y.f16609o.f8517a) + ((float) this.f16706n0) >= ((float) x0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.Y.f16600e != 3 || s0()) {
            j12 = j13;
        }
        this.f16705n.f11857a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        w2.g0 g0Var = this.I.f16794i.f16765g.f16777a;
        long Y = Y(g0Var, this.Y.f16613s, true, false);
        if (Y != this.Y.f16613s) {
            j1 j1Var = this.Y;
            this.Y = z(g0Var, Y, j1Var.f16599c, j1Var.d, z10, 5);
        }
    }

    public final void X(k2.q0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.X(k2.q0):void");
    }

    public final long Y(w2.g0 g0Var, long j10, boolean z10, boolean z11) {
        z0 z0Var;
        r1[] r1VarArr;
        boolean z12;
        r1[] r1VarArr2;
        int i3;
        w0();
        boolean z13 = true;
        E0(false, true);
        if (z11 || this.Y.f16600e == 3) {
            o0(2);
        }
        x0 x0Var = this.I.f16794i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !g0Var.equals(x0Var2.f16765g.f16777a)) {
            x0Var2 = x0Var2.f16770m;
        }
        if (z10 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.f16773p + j10 < 0)) {
            for (int i10 = 0; i10 < this.f16688a.length; i10++) {
                i(i10);
            }
            this.f16715u0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    z0Var = this.I;
                    if (z0Var.f16794i == x0Var2) {
                        break;
                    }
                    z0Var.a();
                }
                z0Var.n(x0Var2);
                x0Var2.f16773p = 1000000000000L;
                m(this.I.f16795j.e(), new boolean[this.f16688a.length]);
                x0Var2.h = true;
            }
        }
        h();
        if (this.U) {
            for (r1 r1Var : this.f16688a) {
                if (r1Var.g() && ((i3 = r1Var.f16721a.f16444b) == 2 || i3 == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.I.n(x0Var2);
            if (!x0Var2.f16763e) {
                x0Var2.f16765g = x0Var2.f16765g.b(j10, -9223372036854775807L);
            } else if (x0Var2.f16764f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.f16597a.p() && x0Var2.f16765g.f16777a.equals(this.Y.f16598b)) {
                        long j11 = x0Var2.f16773p + j10;
                        boolean z14 = true;
                        for (r1 r1Var2 : this.f16688a) {
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
                            ?? r10 = x0Var2.f16760a;
                            long j12 = this.Y.f16613s;
                            t1 t1Var = t1.f16737e;
                            if (r10.r(j12, t1Var) == x0Var2.f16760a.r(j10, t1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = x0Var2.f16760a.j(j10);
                x0Var2.f16760a.l(j10 - this.f16720y);
            }
            R(j10, z13);
            D();
        } else {
            this.I.b();
            R(j10, true);
        }
        v(false);
        this.f16705n.f(2);
        return j10;
    }

    public final void Z(m1 m1Var) {
        m1Var.getClass();
        Looper looper = m1Var.f16629e;
        Looper looper2 = this.f16712s;
        g2.j0 j0Var = this.f16705n;
        if (looper == looper2) {
            g(m1Var);
            int i3 = this.Y.f16600e;
            if (i3 != 3 && i3 != 2) {
                return;
            }
            j0Var.f(2);
            return;
        }
        j0Var.b(15, m1Var).b();
    }

    @Override
    public final void a(long j10, long j11, d2.v vVar, MediaFormat mediaFormat) {
        if (this.V) {
            this.f16705n.a(37).b();
        }
    }

    public final void a0(m1 m1Var) {
        Looper looper = m1Var.f16629e;
        if (!looper.getThread().isAlive()) {
            g2.a.l("TAG", "Trying to send message on a dead thread.");
            m1Var.a(false);
            return;
        }
        this.G.a(looper, null).d(new f6(this, m1Var));
    }

    @Override
    public final void b(w2.e0 e0Var) {
        this.f16705n.b(8, e0Var).b();
    }

    public final void b0(d2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.b0(d2.f, boolean):void");
    }

    public final void c(m0 m0Var, int i3) {
        this.Z.f(1);
        i1 i1Var = this.J;
        if (i3 == -1) {
            i3 = i1Var.f16582b.size();
        }
        w(i1Var.a(i3, m0Var.f16623a, m0Var.f16624b), false);
    }

    public final void c0(boolean z10, g2.j jVar) {
        if (this.f16701i0 != z10) {
            this.f16701i0 = z10;
            if (!z10) {
                for (r1 r1Var : this.f16688a) {
                    r1Var.k();
                }
            }
        }
        if (jVar != null) {
            jVar.e();
        }
    }

    public final void d() {
        r1[] r1VarArr;
        s1 s1Var;
        for (r1 r1Var : this.f16688a) {
            if (this.U) {
                s1Var = this.T;
            } else {
                s1Var = null;
            }
            r1Var.f16721a.d(18, s1Var);
            b bVar = r1Var.f16723c;
            if (bVar != null) {
                bVar.d(18, s1Var);
            }
        }
    }

    public final void d0(k0 k0Var) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f16688a) {
            b bVar = r1Var.f16721a;
            if (bVar.f16444b == 4) {
                bVar.d(23, k0Var);
                b bVar2 = r1Var.f16723c;
                if (bVar2 != null) {
                    bVar2.d(23, k0Var);
                }
            }
        }
    }

    public final boolean e() {
        if (!this.P) {
            return false;
        }
        for (r1 r1Var : this.f16688a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(m0 m0Var) {
        this.Z.f(1);
        int i3 = m0Var.f16625c;
        w2.i1 i1Var = m0Var.f16624b;
        ArrayList arrayList = m0Var.f16623a;
        if (i3 != -1) {
            this.m0 = new q0(new o1(arrayList, i1Var), m0Var.f16625c, m0Var.d);
        }
        i1 i1Var2 = this.J;
        ArrayList arrayList2 = i1Var2.f16582b;
        i1Var2.g(0, arrayList2.size());
        w(i1Var2.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(boolean z10) {
        this.f16691b0 = z10;
        Q();
        if (this.f16693c0) {
            z0 z0Var = this.I;
            if (z0Var.f16795j != z0Var.f16794i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g0(d2.y0 y0Var) {
        this.f16705n.e(16);
        i iVar = this.E;
        iVar.c(y0Var);
        d2.y0 g7 = iVar.g();
        y(g7, g7.f8517a, true, true);
    }

    public final void h() {
        r1[] r1VarArr;
        boolean z10;
        b bVar;
        if (this.P && e()) {
            for (r1 r1Var : this.f16688a) {
                int c2 = r1Var.c();
                i iVar = this.E;
                if (r1Var.f()) {
                    int i3 = r1Var.d;
                    int i10 = 1;
                    if (i3 != 4 && i3 != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i3 != 4) {
                        i10 = 0;
                    }
                    if (z10) {
                        try {
                            bVar = r1Var.f16721a;
                        } catch (RuntimeException e10) {
                            g2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = r1Var.f16723c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, iVar);
                    try {
                        r1Var.i(z10);
                    } catch (RuntimeException e11) {
                        g2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    r1Var.d = i10;
                }
                this.f16704l0 -= c2 - r1Var.c();
            }
            this.f16715u0 = -9223372036854775807L;
        }
    }

    public final void h0(o oVar) {
        this.f16714t0 = oVar;
        d2.n1 n1Var = this.Y.f16597a;
        z0 z0Var = this.I;
        z0Var.getClass();
        oVar.getClass();
        if (!z0Var.f16802q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < z0Var.f16802q.size(); i3++) {
                ((x0) z0Var.f16802q.get(i3)).i();
            }
            z0Var.f16802q = arrayList;
            z0Var.f16798m = null;
            z0Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i3;
        x0 x0Var;
        w2.g0 g0Var;
        x0 x0Var2;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = message.arg2;
                    this.Z.f(1);
                    B0(this.Q.d(this.Y.f16600e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((d2.y0) message.obj);
                    break;
                case 5:
                    l0((t1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((g2.j) message.obj);
                    return true;
                case 8:
                    x((w2.e0) message.obj);
                    break;
                case 9:
                    t((w2.e0) message.obj);
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
                    c0(z12, (g2.j) message.obj);
                    break;
                case 14:
                    Z((m1) message.obj);
                    break;
                case 15:
                    a0((m1) message.obj);
                    break;
                case 16:
                    d2.y0 y0Var = (d2.y0) message.obj;
                    y(y0Var, y0Var.f8517a, true, false);
                    break;
                case 17:
                    e0((m0) message.obj);
                    break;
                case 18:
                    c((m0) message.obj, message.arg1);
                    break;
                case 19:
                    J((n0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (w2.i1) message.obj);
                    break;
                case 21:
                    n0((w2.i1) message.obj);
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
                    f();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    h0((o) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (g2.j) pair.second);
                    break;
                case 31:
                    d2.f fVar = (d2.f) message.obj;
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
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    p0((c3.w) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    q0 q0Var = this.W;
                    if (q0Var != null) {
                        X(q0Var);
                        this.W = null;
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
        } catch (d2.v0 e10) {
            boolean z15 = e10.f8496a;
            int i13 = e10.f8497b;
            if (i13 == 1) {
                if (z15) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else {
                if (i13 == 4) {
                    if (z15) {
                        i10 = 3002;
                    } else {
                        i10 = 3004;
                    }
                }
                u(e10, i11);
            }
            i11 = i10;
            u(e10, i11);
        } catch (i2.k e11) {
            u(e11, e11.f14552a);
        } catch (IOException e12) {
            u(e12, 2000);
        } catch (RuntimeException e13) {
            l lVar = new l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            g2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
            v0(true, false);
            this.Y = this.Y.f(lVar);
        } catch (l e14) {
            e = e14;
            int i14 = e.f16616s;
            z0 z0Var = this.I;
            if (i14 == 1 && (x0Var2 = z0Var.f16795j) != null && e.F == null) {
                e = e.a(x0Var2.f16765g.f16777a);
            }
            int i15 = e.f16616s;
            g2.j0 j0Var = this.f16705n;
            if (i15 == 1 && (g0Var = e.F) != null && B(e.f16618x, g0Var)) {
                this.f16716v0 = true;
                h();
                x0 g7 = z0Var.g();
                x0 x0Var3 = z0Var.f16794i;
                if (x0Var3 != g7) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.f16770m;
                        if (x0Var4 == g7) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                z0Var.n(x0Var3);
                if (this.Y.f16600e != 4) {
                    D();
                    j0Var.f(2);
                }
            } else {
                l lVar2 = this.f16711r0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.f16711r0;
                }
                if (e.f16616s == 1 && z0Var.f16794i != z0Var.f16795j) {
                    while (true) {
                        x0Var = z0Var.f16794i;
                        if (x0Var == z0Var.f16795j) {
                            break;
                        }
                        z0Var.a();
                    }
                    zb.l(x0Var);
                    F();
                    y0 y0Var2 = x0Var.f16765g;
                    w2.g0 g0Var2 = y0Var2.f16777a;
                    long j10 = y0Var2.f16778b;
                    this.Y = z(g0Var2, j10, y0Var2.d, j10, true, 0);
                }
                if (e.G && (this.f16711r0 == null || (i3 = e.f8512a) == 5004 || i3 == 5003)) {
                    g2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f16711r0 == null) {
                        this.f16711r0 = e;
                    }
                    g2.i0 b10 = j0Var.b(25, e);
                    Handler handler = j0Var.f11857a;
                    Message message2 = b10.f11853a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    g2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (p2.f e15) {
            u(e15, e15.f53109a);
        } catch (w2.b e16) {
            u(e16, 1002);
        }
        F();
        return true;
    }

    public final void i(int i3) {
        boolean z10;
        r1[] r1VarArr = this.f16688a;
        int c2 = r1VarArr[i3].c();
        r1 r1Var = r1VarArr[i3];
        b bVar = r1Var.f16721a;
        i iVar = this.E;
        r1Var.a(bVar, iVar);
        b bVar2 = r1Var.f16723c;
        if (bVar2 != null) {
            if (bVar2.f16448n != 0 && r1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            r1Var.a(bVar2, iVar);
            r1Var.i(false);
            if (z10) {
                b bVar3 = r1Var.f16721a;
                bVar2.getClass();
                bVar2.d(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i3, false);
        this.f16704l0 -= c2;
    }

    public final void i0(int i3) {
        this.f16699g0 = i3;
        d2.n1 n1Var = this.Y.f16597a;
        z0 z0Var = this.I;
        z0Var.f16793g = i3;
        int r5 = z0Var.r(n1Var);
        if ((r5 & 1) != 0) {
            W(true);
        } else if ((r5 & 2) != 0) {
            h();
        }
        v(false);
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.j():void");
    }

    public final void j0(boolean z10) {
        if (!z10) {
            q0 q0Var = this.W;
            g2.j0 j0Var = this.f16705n;
            if (q0Var != null && this.V && !j0Var.f11857a.hasMessages(37)) {
                this.X++;
            }
            int i3 = this.X;
            if (i3 > 0) {
                this.O.d(new cg.l0(this, i3, 10));
            }
            this.X = 0;
            this.V = false;
            j0Var.e(37);
            q0 q0Var2 = this.W;
            if (q0Var2 != null) {
                X(q0Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z10;
        d();
    }

    @Override
    public final void k(w2.f1 f1Var) {
        this.f16705n.b(9, (w2.e0) f1Var).b();
    }

    public final void k0(s1 s1Var) {
        this.T = s1Var;
        d();
    }

    public final void l(x0 x0Var, int i3, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        r1 r1Var = this.f16688a[i3];
        boolean g7 = r1Var.g();
        b bVar = r1Var.f16721a;
        if (!g7) {
            if (x0Var == this.I.f16794i) {
                z11 = true;
            } else {
                z11 = false;
            }
            z2.t tVar = x0Var.f16772o;
            q1 q1Var = tVar.f59647b[i3];
            z2.p pVar = tVar.f59648c[i3];
            if (s0() && this.Y.f16600e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f16704l0++;
            w2.d1 d1Var = x0Var.f16762c[i3];
            long j11 = x0Var.f16773p;
            w2.g0 g0Var = x0Var.f16765g.f16777a;
            b bVar2 = r1Var.f16723c;
            if (pVar != null) {
                i10 = pVar.length();
            } else {
                i10 = 0;
            }
            d2.v[] vVarArr = new d2.v[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                pVar.getClass();
                vVarArr[i11] = pVar.g(i11);
            }
            int i12 = r1Var.d;
            i iVar = this.E;
            if (i12 != 0 && i12 != 2 && i12 != 4) {
                r1Var.f16725f = true;
                bVar2.getClass();
                if (bVar2.f16448n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zb.p(z15);
                bVar2.d = q1Var;
                bVar2.H = g0Var;
                bVar2.f16448n = 1;
                bVar2.o(z13, z11);
                bVar2.y(vVarArr, d1Var, j10, j11, g0Var);
                bVar2.z(j10, z13, true);
                iVar.d(bVar2);
            } else {
                r1Var.f16724e = true;
                if (bVar.f16448n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zb.p(z14);
                bVar.d = q1Var;
                bVar.H = g0Var;
                bVar.f16448n = 1;
                bVar.o(z13, z11);
                bVar.y(vVarArr, d1Var, j10, j11, g0Var);
                bVar.z(j10, z13, true);
                iVar.d(bVar);
            }
            l0 l0Var = new l0(this);
            b d = r1Var.d(x0Var);
            d.getClass();
            d.d(11, l0Var);
            if (z12 && z11) {
                r1Var.m();
            }
        }
    }

    public final void l0(t1 t1Var) {
        this.S = t1Var;
    }

    public final void m(long j10, boolean[] zArr) {
        r1[] r1VarArr;
        long j11;
        x0 x0Var = this.I.f16795j;
        z2.t tVar = x0Var.f16772o;
        int i3 = 0;
        while (true) {
            r1VarArr = this.f16688a;
            if (i3 >= r1VarArr.length) {
                break;
            }
            if (!tVar.b(i3)) {
                r1VarArr[i3].k();
            }
            i3++;
        }
        int i10 = 0;
        while (i10 < r1VarArr.length) {
            if (!tVar.b(i10) || r1VarArr[i10].d(x0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                l(x0Var, i10, zArr[i10], j11);
            }
            i10++;
            j10 = j11;
        }
    }

    public final void m0(boolean z10) {
        this.f16700h0 = z10;
        d2.n1 n1Var = this.Y.f16597a;
        z0 z0Var = this.I;
        z0Var.h = z10;
        int r5 = z0Var.r(n1Var);
        if ((r5 & 1) != 0) {
            W(true);
        } else if ((r5 & 2) != 0) {
            h();
        }
        v(false);
    }

    public final long n(d2.n1 n1Var, Object obj, long j10) {
        d2.k1 k1Var = this.f16719x;
        int i3 = n1Var.g(obj, k1Var).f8163c;
        d2.m1 m1Var = this.f16717w;
        n1Var.n(i3, m1Var);
        if (m1Var.f8212f == -9223372036854775807L || !m1Var.a() || !m1Var.f8214i) {
            return -9223372036854775807L;
        }
        return g2.n0.S(g2.n0.C(m1Var.f8213g) - m1Var.f8212f) - (j10 + k1Var.f8164e);
    }

    public final void n0(w2.i1 i1Var) {
        this.Z.f(1);
        i1 i1Var2 = this.J;
        int size = i1Var2.f16582b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        i1Var2.f16588j = i1Var;
        w(i1Var2.b(), false);
    }

    public final long o(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j10 = x0Var.f16773p;
        if (!x0Var.f16763e) {
            return j10;
        }
        int i3 = 0;
        while (true) {
            r1[] r1VarArr = this.f16688a;
            if (i3 < r1VarArr.length) {
                if (r1VarArr[i3].d(x0Var) != null) {
                    b d = r1VarArr[i3].d(x0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f16453y;
                    if (j11 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(j11, j10);
                }
                i3++;
            } else {
                return j10;
            }
        }
    }

    public final void o0(int i3) {
        j1 j1Var = this.Y;
        if (j1Var.f16600e != i3) {
            if (i3 != 2) {
                this.f16713s0 = -9223372036854775807L;
            }
            if (i3 != 3 && j1Var.f16610p) {
                this.Y = j1Var.i(false);
            }
            this.Y = this.Y.h(i3);
        }
    }

    public final Pair p(d2.n1 n1Var) {
        long j10 = 0;
        if (n1Var.p()) {
            return Pair.create(j1.f16596u, 0L);
        }
        int a10 = n1Var.a(this.f16700h0);
        Pair i3 = n1Var.i(this.f16717w, this.f16719x, a10, -9223372036854775807L);
        w2.g0 p10 = this.I.p(n1Var, i3.first, 0L);
        long longValue = ((Long) i3.second).longValue();
        if (p10.b()) {
            Object obj = p10.f57081a;
            d2.k1 k1Var = this.f16719x;
            n1Var.g(obj, k1Var);
            if (p10.f57083c == k1Var.e(p10.f57082b)) {
                k1Var.f8166g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j10));
    }

    public final void p0(c3.w wVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f16688a) {
            b bVar = r1Var.f16721a;
            if (bVar.f16444b == 2) {
                bVar.d(7, wVar);
                b bVar2 = r1Var.f16723c;
                if (bVar2 != null) {
                    bVar2.d(7, wVar);
                }
            }
        }
    }

    public final long q(long j10) {
        x0 x0Var = this.I.f16797l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f16706n0 - x0Var.f16773p));
    }

    public final void q0(Object obj, g2.j jVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f16688a) {
            b bVar = r1Var.f16721a;
            if (bVar.f16444b == 2) {
                int i3 = r1Var.d;
                if (i3 != 4 && i3 != 1) {
                    bVar.d(1, obj);
                } else {
                    b bVar2 = r1Var.f16723c;
                    bVar2.getClass();
                    bVar2.d(1, obj);
                }
            }
        }
        int i10 = this.Y.f16600e;
        if (i10 == 3 || i10 == 2) {
            this.f16705n.f(2);
        }
        if (jVar != null) {
            jVar.e();
        }
    }

    public final void r(int i3) {
        j1 j1Var = this.Y;
        B0(i3, j1Var.f16608n, j1Var.f16607m, j1Var.f16606l);
    }

    public final void r0(float f10) {
        r1[] r1VarArr;
        this.f16718w0 = f10;
        float f11 = f10 * this.Q.f9337g;
        for (r1 r1Var : this.f16688a) {
            b bVar = r1Var.f16721a;
            if (bVar.f16444b == 1) {
                bVar.d(2, Float.valueOf(f11));
                b bVar2 = r1Var.f16723c;
                if (bVar2 != null) {
                    bVar2.d(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void s() {
        r0(this.f16718w0);
    }

    public final boolean s0() {
        j1 j1Var = this.Y;
        if (j1Var.f16606l && j1Var.f16608n == 0) {
            return true;
        }
        return false;
    }

    public final void t(w2.e0 e0Var) {
        z0 z0Var = this.I;
        x0 x0Var = z0Var.f16797l;
        if (x0Var != null && x0Var.f16760a == e0Var) {
            z0Var.m(this.f16706n0);
            D();
            return;
        }
        x0 x0Var2 = z0Var.f16798m;
        if (x0Var2 != null && x0Var2.f16760a == e0Var) {
            E();
        }
    }

    public final boolean t0(d2.n1 n1Var, w2.g0 g0Var) {
        if (!g0Var.b() && !n1Var.p()) {
            int i3 = n1Var.g(g0Var.f57081a, this.f16719x).f8163c;
            d2.m1 m1Var = this.f16717w;
            n1Var.n(i3, m1Var);
            if (m1Var.a() && m1Var.f8214i && m1Var.f8212f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(IOException iOException, int i3) {
        l lVar = new l(0, iOException, i3);
        x0 x0Var = this.I.f16794i;
        if (x0Var != null) {
            lVar = lVar.a(x0Var.f16765g.f16777a);
        }
        g2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.Y = this.Y.f(lVar);
    }

    public final void u0() {
        x0 x0Var = this.I.f16794i;
        if (x0Var != null) {
            z2.t tVar = x0Var.f16772o;
            int i3 = 0;
            while (true) {
                r1[] r1VarArr = this.f16688a;
                if (i3 < r1VarArr.length) {
                    if (tVar.b(i3)) {
                        r1VarArr[i3].m();
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(boolean z10) {
        w2.g0 g0Var;
        long d;
        x0 x0Var = this.I.f16797l;
        if (x0Var == null) {
            g0Var = this.Y.f16598b;
        } else {
            g0Var = x0Var.f16765g.f16777a;
        }
        boolean equals = this.Y.f16605k.equals(g0Var);
        if (!equals) {
            this.Y = this.Y.c(g0Var);
        }
        j1 j1Var = this.Y;
        if (x0Var == null) {
            d = j1Var.f16613s;
        } else {
            d = x0Var.d();
        }
        j1Var.f16611q = d;
        j1 j1Var2 = this.Y;
        j1Var2.f16612r = q(j1Var2.f16611q);
        if ((!equals || z10) && x0Var != null && x0Var.f16763e) {
            y0(x0Var.f16765g.f16777a, x0Var.f16772o);
        }
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f16701i0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Z.f(z11 ? 1 : 0);
        h hVar = (h) this.f16697f;
        ConcurrentHashMap concurrentHashMap = hVar.f16526p;
        l2.k kVar = this.M;
        g gVar = (g) concurrentHashMap.get(kVar);
        if (gVar != null) {
            int i3 = gVar.f16504a - 1;
            gVar.f16504a = i3;
            if (i3 == 0) {
                concurrentHashMap.remove(kVar);
                hVar.c();
            }
        }
        this.Q.d(1, this.Y.f16606l);
        o0(1);
    }

    public final void w(d2.n1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.w(d2.n1, boolean):void");
    }

    public final void w0() {
        r1[] r1VarArr;
        i iVar = this.E;
        iVar.f16539f = false;
        u1 u1Var = iVar.f16535a;
        if (u1Var.f16749c) {
            u1Var.d(u1Var.a());
            u1Var.f16749c = false;
        }
        for (r1 r1Var : this.f16688a) {
            b bVar = r1Var.f16723c;
            b bVar2 = r1Var.f16721a;
            if (r1.h(bVar2)) {
                r1.b(bVar2);
            }
            if (bVar != null && bVar.f16448n != 0) {
                r1.b(bVar);
            }
        }
    }

    public final void x(w2.e0 e0Var) {
        x0 x0Var;
        z0 z0Var = this.I;
        x0 x0Var2 = z0Var.f16797l;
        i iVar = this.E;
        if (x0Var2 != null && x0Var2.f16760a == e0Var) {
            x0Var2.getClass();
            if (!x0Var2.f16763e) {
                float f10 = iVar.g().f8517a;
                j1 j1Var = this.Y;
                x0Var2.f(f10, j1Var.f16597a, j1Var.f16606l);
            }
            y0(x0Var2.f16765g.f16777a, x0Var2.f16772o);
            if (x0Var2 == z0Var.f16794i) {
                R(x0Var2.f16765g.f16778b, true);
                m(z0Var.f16795j.e(), new boolean[this.f16688a.length]);
                x0Var2.h = true;
                j1 j1Var2 = this.Y;
                w2.g0 g0Var = j1Var2.f16598b;
                long j10 = x0Var2.f16765g.f16778b;
                this.Y = z(g0Var, j10, j1Var2.f16599c, j10, false, 5);
            }
            D();
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 < z0Var.f16802q.size()) {
                x0Var = (x0) z0Var.f16802q.get(i3);
                if (x0Var.f16760a == e0Var) {
                    break;
                }
                i3++;
            } else {
                x0Var = null;
                break;
            }
        }
        if (x0Var != null) {
            zb.p(true ^ x0Var.f16763e);
            float f11 = iVar.g().f8517a;
            j1 j1Var3 = this.Y;
            x0Var.f(f11, j1Var3.f16597a, j1Var3.f16606l);
            x0 x0Var3 = z0Var.f16798m;
            if (x0Var3 != null && x0Var3.f16760a == e0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z10;
        x0 x0Var = this.I.f16797l;
        if (!this.f16698f0 && (x0Var == null || !x0Var.f16760a.d())) {
            z10 = false;
        } else {
            z10 = true;
        }
        j1 j1Var = this.Y;
        if (z10 != j1Var.f16602g) {
            this.Y = j1Var.b(z10);
        }
    }

    public final void y(d2.y0 y0Var, float f10, boolean z10, boolean z11) {
        int i3;
        if (z10) {
            if (z11) {
                this.Z.f(1);
            }
            this.Y = this.Y.g(y0Var);
        }
        float f11 = y0Var.f8517a;
        x0 x0Var = this.I.f16794i;
        while (true) {
            i3 = 0;
            if (x0Var == null) {
                break;
            }
            z2.p[] pVarArr = x0Var.f16772o.f59648c;
            int length = pVarArr.length;
            while (i3 < length) {
                z2.p pVar = pVarArr[i3];
                if (pVar != null) {
                    pVar.q(f11);
                }
                i3++;
            }
            x0Var = x0Var.f16770m;
        }
        r1[] r1VarArr = this.f16688a;
        int length2 = r1VarArr.length;
        while (i3 < length2) {
            r1 r1Var = r1VarArr[i3];
            float f12 = y0Var.f8517a;
            r1Var.f16721a.A(f10, f12);
            b bVar = r1Var.f16723c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i3++;
        }
    }

    public final void y0(w2.g0 r10, z2.t r11) {
        throw new UnsupportedOperationException("Method not decompiled: k2.r0.y0(w2.g0, z2.t):void");
    }

    public final j1 z(w2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i3) {
        boolean z11;
        boolean z12;
        g9.s1 s1Var;
        boolean z13;
        boolean z14;
        if (!this.f16709q0 && j10 == this.Y.f16613s && g0Var.equals(this.Y.f16598b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f16709q0 = z11;
        Q();
        j1 j1Var = this.Y;
        w2.r1 r1Var = j1Var.h;
        z2.t tVar = j1Var.f16603i;
        List list = j1Var.f16604j;
        if (this.J.f16589k) {
            x0 x0Var = this.I.f16794i;
            if (x0Var == null) {
                r1Var = w2.r1.d;
            } else {
                r1Var = x0Var.f16771n;
            }
            if (x0Var == null) {
                tVar = this.f16695e;
            } else {
                tVar = x0Var.f16772o;
            }
            z2.p[] pVarArr = tVar.f59648c;
            ?? b0Var = new g9.b0(4);
            boolean z15 = false;
            for (z2.p pVar : pVarArr) {
                if (pVar != null) {
                    d2.s0 s0Var = pVar.g(0).f8482l;
                    if (s0Var == null) {
                        b0Var.c(new d2.s0(new d2.r0[0]));
                    } else {
                        b0Var.c(s0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                s1Var = b0Var.f();
            } else {
                g9.g0 g0Var2 = g9.i0.f12083b;
                s1Var = g9.s1.f12146e;
            }
            list = s1Var;
            if (x0Var != null) {
                y0 y0Var = x0Var.f16765g;
                if (y0Var.d != j11) {
                    x0Var.f16765g = y0Var.a(j11);
                }
            }
            r1[] r1VarArr = this.f16688a;
            z0 z0Var = this.I;
            x0 x0Var2 = z0Var.f16794i;
            if (x0Var2 == z0Var.f16795j && x0Var2 != null) {
                z2.t tVar2 = x0Var2.f16772o;
                int i10 = 0;
                boolean z16 = false;
                while (true) {
                    if (i10 < r1VarArr.length) {
                        if (tVar2.b(i10)) {
                            if (r1VarArr[i10].f16721a.f16444b != 1) {
                                z13 = false;
                                break;
                            } else if (tVar2.f59647b[i10].f16684a != 0) {
                                z16 = true;
                            }
                        }
                        i10++;
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
                if (z14 != this.f16703k0) {
                    this.f16703k0 = z14;
                    if (!z14 && this.Y.f16610p) {
                        this.f16705n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(j1Var.f16598b)) {
            r1Var = w2.r1.d;
            tVar = this.f16695e;
            list = g9.s1.f12146e;
        }
        w2.r1 r1Var2 = r1Var;
        z2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            o0 o0Var = this.Z;
            if (o0Var.d && o0Var.f16662e != 5) {
                if (i3 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zb.f(z12);
            } else {
                o0Var.f16661c = true;
                o0Var.d = true;
                o0Var.f16662e = i3;
            }
        }
        j1 j1Var2 = this.Y;
        return j1Var2.d(g0Var, j10, j11, j12, q(j1Var2.f16611q), r1Var2, tVar3, list2);
    }

    public final void z0(List list, int i3, int i10) {
        boolean z10;
        boolean z11 = true;
        this.Z.f(1);
        i1 i1Var = this.J;
        i1Var.getClass();
        ArrayList arrayList = i1Var.f16582b;
        if (i3 >= 0 && i3 <= i10 && i10 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (list.size() != i10 - i3) {
            z11 = false;
        }
        zb.f(z11);
        for (int i11 = i3; i11 < i10; i11++) {
            ((h1) arrayList.get(i11)).f16531a.t((d2.n0) list.get(i11 - i3));
        }
        w(i1Var.b(), false);
    }
}
