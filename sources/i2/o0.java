package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import di.nb;
import fi.j4;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 implements Handler.Callback, u2.c0, h1, a3.x {
    public static final long f11657u0 = e2.d0.e0(10000);
    public final ArrayList E;
    public final e2.x F;
    public final x G;
    public final v0 H;
    public final f1 I;
    public final j J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.z N;
    public final boolean O;
    public final e P;
    public p1 Q;
    public o1 R;
    public boolean S;
    public boolean T;
    public n0 U;
    public g1 V;
    public l0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final n1[] f11658a;
    public boolean f11659a0;
    public final f[] f11660b;
    public long f11661b0;
    public final boolean[] f11662c;
    public boolean f11663c0;
    public final x2.u d;
    public int f11664d0;
    public final x2.v f11665e;
    public boolean f11666e0;
    public final l f11667f;
    public boolean f11668f0;
    public boolean f11669g0;
    public final y2.c h;
    public boolean f11670h0;
    public int f11671i0;
    public n0 f11672j0;
    public long f11673k0;
    public long f11674l0;
    public int m0;
    public final e2.z f11675n;
    public boolean f11676n0;
    public o f11677o0;
    public long f11678p0;
    public r f11679q0;
    public final j6.l f11680r;
    public long f11681r0;
    public final Looper f11682s;
    public boolean f11683s0;
    public float f11684t0;
    public final b2.j1 v;
    public final b2.h1 f11685w;
    public final long f11686x;
    public final a3.p f11687y;

    public o0(Context context, f[] fVarArr, f[] fVarArr2, x2.u uVar, x2.v vVar, l lVar, y2.c cVar, int i10, boolean z10, j2.f fVar, p1 p1Var, j jVar, long j3, Looper looper, e2.x xVar, x xVar2, j2.k kVar, final a3.x xVar3) {
        r rVar = r.f11726a;
        this.f11681r0 = -9223372036854775807L;
        this.G = xVar2;
        this.d = uVar;
        this.f11665e = vVar;
        this.f11667f = lVar;
        this.h = cVar;
        this.f11664d0 = i10;
        this.f11666e0 = z10;
        this.Q = p1Var;
        this.J = jVar;
        this.K = j3;
        this.Y = false;
        this.F = xVar;
        this.L = kVar;
        this.f11679q0 = rVar;
        this.M = fVar;
        this.f11684t0 = 1.0f;
        this.R = o1.f11688b;
        this.f11678p0 = -9223372036854775807L;
        this.f11661b0 = -9223372036854775807L;
        this.f11686x = lVar.f11621g;
        b2.g1 g1Var = b2.k1.f2131a;
        g1 k10 = g1.k(vVar);
        this.V = k10;
        this.W = new l0(k10);
        this.f11660b = new f[fVarArr.length];
        this.f11662c = new boolean[fVarArr.length];
        x2.p pVar = (x2.p) uVar;
        pVar.getClass();
        this.f11658a = new n1[fVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar2 = fVarArr[i11];
            fVar2.f11497e = i11;
            fVar2.f11498f = kVar;
            fVar2.h = xVar;
            this.f11660b[i11] = fVar2;
            f fVar3 = this.f11660b[i11];
            synchronized (fVar3.f11494a) {
                fVar3.H = pVar;
            }
            f fVar4 = fVarArr2[i11];
            if (fVar4 != null) {
                fVar4.f11497e = i11;
                fVar4.f11498f = kVar;
                fVar4.h = xVar;
                z11 = true;
            }
            this.f11658a[i11] = new n1(fVarArr[i11], fVar4, i11);
        }
        this.O = z11;
        this.f11687y = new a3.p(this, xVar);
        this.E = new ArrayList();
        this.v = new b2.j1();
        this.f11685w = new b2.h1();
        e2.d.g(uVar.f48766a == null);
        uVar.f48766a = this;
        uVar.f48767b = cVar;
        this.f11676n0 = true;
        e2.z a2 = xVar.a(looper, null);
        this.N = a2;
        this.H = new v0(fVar, a2, new fi.f(this, 10));
        this.I = new f1(this, fVar, a2, kVar);
        j6.l lVar2 = new j6.l(7);
        this.f11680r = lVar2;
        Looper g10 = lVar2.g();
        this.f11682s = g10;
        e2.z a10 = xVar.a(g10, this);
        this.f11675n = a10;
        this.P = new e(context, g10, this);
        a10.a(35, new a3.x() {
            @Override
            public final void c(long j10, long j11, b2.s sVar, MediaFormat mediaFormat) {
                o0 o0Var = o0.this;
                o0Var.getClass();
                xVar3.c(j10, j11, sVar, mediaFormat);
                o0Var.c(j10, j11, sVar, mediaFormat);
            }
        }).b();
    }

    public static boolean A(t0 t0Var) {
        u2.b1[] b1VarArr;
        long d;
        if (t0Var != null) {
            try {
                ?? r12 = t0Var.f11733a;
                if (!t0Var.f11736e) {
                    r12.j();
                } else {
                    for (u2.b1 b1Var : t0Var.f11735c) {
                        if (b1Var != null) {
                            b1Var.b();
                        }
                    }
                }
                if (!t0Var.f11736e) {
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

    public static Pair T(b2.k1 k1Var, n0 n0Var, boolean z10, int i10, boolean z11, b2.j1 j1Var, b2.h1 h1Var) {
        b2.k1 k1Var2;
        int U;
        b2.k1 k1Var3 = n0Var.f11645a;
        if (!k1Var.p()) {
            if (k1Var3.p()) {
                k1Var2 = k1Var;
            } else {
                k1Var2 = k1Var3;
            }
            try {
                Pair i11 = k1Var2.i(j1Var, h1Var, n0Var.f11646b, n0Var.f11647c);
                if (!k1Var.equals(k1Var2)) {
                    if (k1Var.b(i11.first) != -1) {
                        if (k1Var2.g(i11.first, h1Var).f2058f && k1Var2.m(h1Var.f2056c, j1Var, 0L).f2117n == k1Var2.b(i11.first)) {
                            return k1Var.i(j1Var, h1Var, k1Var.g(i11.first, h1Var).f2056c, n0Var.f11647c);
                        }
                    } else if (z10 && (U = U(j1Var, h1Var, i10, z11, i11.first, k1Var2, k1Var)) != -1) {
                        return k1Var.i(j1Var, h1Var, U, -9223372036854775807L);
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

    public static int U(b2.j1 j1Var, b2.h1 h1Var, int i10, boolean z10, Object obj, b2.k1 k1Var, b2.k1 k1Var2) {
        b2.j1 j1Var2 = j1Var;
        b2.k1 k1Var3 = k1Var;
        Object obj2 = k1Var3.m(k1Var3.g(obj, h1Var).f2056c, j1Var, 0L).f2106a;
        for (int i11 = 0; i11 < k1Var2.o(); i11++) {
            if (k1Var2.m(i11, j1Var, 0L).f2106a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = k1Var3.b(obj);
        int h = k1Var3.h();
        int i12 = 0;
        int i13 = -1;
        while (i12 < h && i13 == -1) {
            b2.k1 k1Var4 = k1Var3;
            int d = k1Var4.d(b10, h1Var, j1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i13 = k1Var2.b(k1Var4.l(d));
            i12++;
            k1Var3 = k1Var4;
            b10 = d;
            j1Var2 = j1Var;
        }
        if (i13 == -1) {
            return -1;
        }
        return k1Var2.f(i13, h1Var, false).f2056c;
    }

    public static void h(j1 j1Var) {
        try {
            synchronized (j1Var) {
                synchronized (j1Var) {
                }
                j1Var.f11604a.d(j1Var.f11606c, j1Var.d);
                return;
            }
            j1Var.f11604a.d(j1Var.f11606c, j1Var.d);
            return;
        } finally {
            j1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.A0():void");
    }

    public final boolean B(int i10, u2.f0 f0Var) {
        boolean z10;
        boolean z11;
        v0 v0Var = this.H;
        t0 t0Var = v0Var.f11766k;
        if (t0Var != null && t0Var.f11738g.f11749a.equals(f0Var)) {
            n1 n1Var = this.f11658a[i10];
            t0 t0Var2 = v0Var.f11766k;
            int i11 = n1Var.d;
            if ((i11 == 2 || i11 == 4) && n1Var.d(t0Var2) == n1Var.f11648a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (n1Var.d == 3 && n1Var.d(t0Var2) == n1Var.f11650c) {
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

    public final void B0(b2.k1 k1Var, u2.f0 f0Var, b2.k1 k1Var2, u2.f0 f0Var2, long j3, boolean z10) {
        Object obj;
        b2.v0 v0Var;
        boolean s02 = s0(k1Var, f0Var);
        Object obj2 = f0Var.f46667a;
        if (!s02) {
            if (f0Var.b()) {
                v0Var = b2.v0.d;
            } else {
                v0Var = this.V.f11566o;
            }
            a3.p pVar = this.f11687y;
            if (!pVar.h().equals(v0Var)) {
                this.f11675n.d(16);
                pVar.f(v0Var);
                y(this.V.f11566o, v0Var.f2400a, false, false);
                return;
            }
            return;
        }
        b2.h1 h1Var = this.f11685w;
        int i10 = k1Var.g(obj2, h1Var).f2056c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        b2.e0 e0Var = j1Var.f2113j;
        j jVar = this.J;
        jVar.getClass();
        jVar.f11591c = e2.d0.Q(e0Var.f2015a);
        jVar.f11593f = e2.d0.Q(e0Var.f2016b);
        jVar.f11594g = e2.d0.Q(e0Var.f2017c);
        float f7 = e0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        jVar.f11596j = f7;
        float f10 = e0Var.f2018e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        jVar.f11595i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            jVar.f11591c = -9223372036854775807L;
        }
        jVar.a();
        if (j3 != -9223372036854775807L) {
            jVar.d = n(k1Var, obj2, j3);
            jVar.a();
            return;
        }
        Object obj3 = j1Var.f2106a;
        if (!k1Var2.p()) {
            obj = k1Var2.m(k1Var2.g(f0Var2.f46667a, h1Var).f2056c, j1Var, 0L).f2106a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        jVar.d = -9223372036854775807L;
        jVar.a();
    }

    public final boolean C() {
        t0 t0Var = this.H.f11764i;
        long j3 = t0Var.f11738g.f11752e;
        if (t0Var.f11736e) {
            if (j3 == -9223372036854775807L || this.V.f11570s < j3 || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0(boolean z10, boolean z11) {
        long j3;
        this.f11659a0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f11661b0 = j3;
    }

    public final void D() {
        long d;
        long j3;
        boolean c10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f11767l)) {
            c10 = false;
        } else {
            t0 t0Var = this.H.f11767l;
            if (!t0Var.f11736e) {
                d = 0;
            } else {
                d = t0Var.f11733a.d();
            }
            long q6 = q(d);
            t0 t0Var2 = this.H.f11764i;
            if (s0(this.V.f11554a, t0Var.f11738g.f11749a)) {
                j3 = this.J.h;
            } else {
                j3 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.k1 k1Var = this.V.f11554a;
            float f7 = this.f11687y.h().f2400a;
            boolean z13 = this.V.f11563l;
            p0 p0Var = new p0(kVar, q6, f7, this.f11659a0, j3);
            c10 = this.f11667f.c(p0Var);
            t0 t0Var3 = this.H.f11764i;
            if (!c10 && t0Var3.f11736e && q6 < 500000 && this.f11686x > 0) {
                t0Var3.f11733a.l(this.V.f11570s);
                c10 = this.f11667f.c(p0Var);
            }
        }
        this.f11663c0 = c10;
        if (c10) {
            t0 t0Var4 = this.H.f11767l;
            t0Var4.getClass();
            q0 q0Var = new q0();
            q0Var.f11719a = this.f11673k0 - t0Var4.f11746p;
            float f10 = this.f11687y.h().f2400a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            e2.d.b(z10);
            q0Var.f11720b = f10;
            long j10 = this.f11661b0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            q0Var.f11721c = j10;
            r0 r0Var = new r0(q0Var);
            if (t0Var4.f11743m == null) {
                z12 = true;
            }
            e2.d.g(z12);
            t0Var4.f11733a.p(r0Var);
        }
        w0();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        v0 v0Var = this.H;
        v0Var.k();
        t0 t0Var = v0Var.f11768m;
        if (t0Var != null) {
            ?? r12 = t0Var.f11733a;
            if ((!t0Var.d || t0Var.f11736e) && !r12.c()) {
                b2.k1 k1Var = this.V.f11554a;
                if (t0Var.f11736e) {
                    r12.s();
                }
                for (k kVar : this.f11667f.h.values()) {
                    if (kVar.f11609a) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!t0Var.d) {
                    long j3 = t0Var.f11738g.f11750b;
                    t0Var.d = true;
                    r12.n(this, j3);
                    return;
                }
                q0 q0Var = new q0();
                q0Var.f11719a = this.f11673k0 - t0Var.f11746p;
                float f7 = this.f11687y.h().f2400a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e2.d.b(z10);
                q0Var.f11720b = f7;
                long j10 = this.f11661b0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                e2.d.b(z11);
                q0Var.f11721c = j10;
                r0 r0Var = new r0(q0Var);
                if (t0Var.f11743m != null) {
                    z12 = false;
                }
                e2.d.g(z12);
                r12.p(r0Var);
            }
        }
    }

    public final void F() {
        boolean z10;
        l0 l0Var = this.W;
        g1 g1Var = this.V;
        boolean z11 = l0Var.f11625c;
        if (((g1) l0Var.f11627f) != g1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        l0Var.f11625c = z12;
        l0Var.f11627f = g1Var;
        if (z12) {
            f0 f0Var = this.G.f11776b;
            f0Var.f11520j.c(new j4(10, f0Var, l0Var));
            this.W = new l0(this.V);
        }
    }

    public final void G(int i10) {
        n1 n1Var = this.f11658a[i10];
        try {
            t0 t0Var = this.H.f11764i;
            t0Var.getClass();
            f d = n1Var.d(t0Var);
            d.getClass();
            u2.b1 b1Var = d.f11500r;
            b1Var.getClass();
            b1Var.b();
        } catch (IOException | RuntimeException e7) {
            int i11 = n1Var.f11648a.f11495b;
            if (i11 != 3 && i11 != 5) {
                throw e7;
            }
            x2.v vVar = this.H.f11764i.f11745o;
            e2.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + b2.s.c(vVar.f48771c[i10].m()), e7);
            x2.v vVar2 = new x2.v((m1[]) vVar.f48770b.clone(), (x2.r[]) vVar.f48771c.clone(), vVar.d, vVar.f48772e);
            vVar2.f48770b[i10] = null;
            vVar2.f48771c[i10] = null;
            j(i10);
            t0 t0Var2 = this.H.f11764i;
            t0Var2.a(vVar2, this.V.f11570s, false, new boolean[t0Var2.f11740j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f11662c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.c(new g0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(k0 k0Var) {
        boolean z10;
        b2.k1 b10;
        this.W.f(1);
        int i10 = k0Var.f11611a;
        int i11 = k0Var.f11612b;
        int i12 = k0Var.f11613c;
        u2.g1 g1Var = k0Var.d;
        f1 f1Var = this.I;
        ArrayList arrayList = f1Var.f11541b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        f1Var.f11547j = g1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((e1) arrayList.get(min)).d;
            e2.d0.P(i10, i11, i12, arrayList);
            while (min <= max) {
                e1 e1Var = (e1) arrayList.get(min);
                e1Var.d = i13;
                i13 += e1Var.f11490a.f46613o.f46787e.o();
                min++;
            }
            b10 = f1Var.b();
        } else {
            b10 = f1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        this.W.f(1);
        P(false, false, false, true);
        l lVar = this.f11667f;
        HashMap hashMap = lVar.h;
        long id2 = Thread.currentThread().getId();
        long j3 = lVar.f11622i;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        lVar.f11622i = id2;
        j2.k kVar = this.L;
        if (!hashMap.containsKey(kVar)) {
            hashMap.put(kVar, new Object());
        }
        k kVar2 = (k) hashMap.get(kVar);
        kVar2.getClass();
        int i11 = lVar.f11620f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        kVar2.f11610b = i11;
        kVar2.f11609a = false;
        if (this.V.f11554a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        n0(i10);
        g1 g1Var = this.V;
        boolean z11 = g1Var.f11563l;
        z0(this.P.d(g1Var.f11557e, z11), g1Var.f11565n, g1Var.f11564m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        f1 f1Var = this.I;
        ArrayList arrayList = f1Var.f11541b;
        e2.d.g(!f1Var.f11548k);
        f1Var.f11549l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            e1 e1Var = (e1) arrayList.get(i12);
            f1Var.e(e1Var);
            f1Var.f11545g.add(e1Var);
        }
        f1Var.f11548k = true;
        this.f11675n.e(2);
    }

    public final void L(e2.g gVar) {
        j6.l lVar = this.f11680r;
        e2.z zVar = this.f11675n;
        try {
            P(true, false, true, false);
            M();
            l lVar2 = this.f11667f;
            if (lVar2.h.remove(this.L) != null) {
                lVar2.d();
            }
            if (lVar2.h.isEmpty()) {
                lVar2.f11622i = -1L;
            }
            e eVar = this.P;
            eVar.f11483c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            zVar.f8798a.removeCallbacksAndMessages(null);
            lVar.i();
            gVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f11658a.length; i10++) {
            f fVar = this.f11660b[i10];
            synchronized (fVar.f11494a) {
                fVar.H = null;
            }
            n1 n1Var = this.f11658a[i10];
            f fVar2 = n1Var.f11648a;
            boolean z11 = true;
            if (fVar2.f11499n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar2.q();
            n1Var.f11651e = false;
            f fVar3 = n1Var.f11650c;
            if (fVar3 != null) {
                if (fVar3.f11499n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar3.q();
                n1Var.f11652f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.g1 g1Var) {
        boolean z10 = true;
        this.W.f(1);
        f1 f1Var = this.I;
        f1Var.getClass();
        e2.d.b((i10 < 0 || i10 > i11 || i11 > f1Var.f11541b.size()) ? false : false);
        f1Var.f11547j = g1Var;
        f1Var.g(i10, i11);
        w(f1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        t0 t0Var = this.H.f11764i;
        if (t0Var != null && t0Var.f11738g.f11755i && this.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
    }

    public final void R(long j3) {
        v0 v0Var;
        long j10;
        n1[] n1VarArr;
        x2.r[] rVarArr;
        t0 t0Var = this.H.f11764i;
        if (t0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = t0Var.f11746p;
        }
        long j11 = j3 + j10;
        this.f11673k0 = j11;
        ((q1) this.f11687y.f171c).c(j11);
        for (n1 n1Var : this.f11658a) {
            long j12 = this.f11673k0;
            f d = n1Var.d(t0Var);
            if (d != null) {
                d.f11504y = false;
                d.f11502w = j12;
                d.f11503x = j12;
                d.p(j12, false);
            }
        }
        for (t0 t0Var2 = v0Var.f11764i; t0Var2 != null; t0Var2 = t0Var2.f11743m) {
            for (x2.r rVar : t0Var2.f11745o.f48771c) {
                if (rVar != null) {
                    rVar.r();
                }
            }
        }
    }

    public final void S(b2.k1 k1Var, b2.k1 k1Var2) {
        if (k1Var.p() && k1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a4.a.y(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j3) {
        n1[] n1VarArr;
        t0 t0Var;
        long j10;
        boolean z10 = this.S;
        long j11 = 1000;
        long j12 = f11657u0;
        if (z10) {
            this.R.getClass();
            if (this.V.f11557e != 3) {
                j11 = j12;
            }
            for (n1 n1Var : this.f11658a) {
                long j13 = this.f11673k0;
                long j14 = this.f11674l0;
                f fVar = n1Var.f11650c;
                f fVar2 = n1Var.f11648a;
                if (n1.h(fVar2)) {
                    j10 = fVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (fVar != null && fVar.f11499n != 0) {
                    j10 = Math.min(j10, fVar.g(j13, j14));
                }
                j11 = Math.min(j11, e2.d0.e0(j10));
            }
            if (this.V.m()) {
                t0 t0Var2 = this.H.f11764i;
                if (t0Var2 != null) {
                    t0Var = t0Var2.f11743m;
                } else {
                    t0Var = null;
                }
                if (t0Var != null) {
                    if ((((float) e2.d0.Q(j11)) * this.V.f11566o.f2400a) + ((float) this.f11673k0) >= ((float) t0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.V.f11557e != 3 || r0()) {
            j11 = j12;
        }
        this.f11675n.f8798a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void W(boolean z10) {
        u2.f0 f0Var = this.H.f11764i.f11738g.f11749a;
        long Y = Y(f0Var, this.V.f11570s, true, false);
        if (Y != this.V.f11570s) {
            g1 g1Var = this.V;
            this.V = z(f0Var, Y, g1Var.f11556c, g1Var.d, z10, 5);
        }
    }

    public final void X(i2.n0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.X(i2.n0, boolean):void");
    }

    public final long Y(u2.f0 f0Var, long j3, boolean z10, boolean z11) {
        n1[] n1VarArr;
        v0();
        C0(false, true);
        if (z11 || this.V.f11557e == 3) {
            n0(2);
        }
        v0 v0Var = this.H;
        t0 t0Var = v0Var.f11764i;
        t0 t0Var2 = t0Var;
        while (t0Var2 != null && !f0Var.equals(t0Var2.f11738g.f11749a)) {
            t0Var2 = t0Var2.f11743m;
        }
        if (z10 || t0Var != t0Var2 || (t0Var2 != null && t0Var2.f11746p + j3 < 0)) {
            int i10 = 0;
            while (true) {
                n1VarArr = this.f11658a;
                if (i10 >= n1VarArr.length) {
                    break;
                }
                j(i10);
                i10++;
            }
            this.f11681r0 = -9223372036854775807L;
            if (t0Var2 != null) {
                while (v0Var.f11764i != t0Var2) {
                    v0Var.a();
                }
                v0Var.n(t0Var2);
                t0Var2.f11746p = 1000000000000L;
                m(v0Var.f11765j.e(), new boolean[n1VarArr.length]);
                t0Var2.h = true;
            }
        }
        i();
        if (t0Var2 != null) {
            ?? r10 = t0Var2.f11733a;
            v0Var.n(t0Var2);
            if (!t0Var2.f11736e) {
                t0Var2.f11738g = t0Var2.f11738g.b(j3);
            } else if (t0Var2.f11737f) {
                j3 = r10.k(j3);
                r10.l(j3 - this.f11686x);
            }
            R(j3);
            D();
        } else {
            v0Var.b();
            R(j3);
        }
        v(false);
        this.f11675n.e(2);
        return j3;
    }

    public final void Z(j1 j1Var) {
        j1Var.getClass();
        Looper looper = j1Var.f11607e;
        Looper looper2 = this.f11682s;
        e2.z zVar = this.f11675n;
        if (looper == looper2) {
            h(j1Var);
            int i10 = this.V.f11557e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            zVar.e(2);
            return;
        }
        zVar.a(15, j1Var).b();
    }

    @Override
    public final void a(u2.d0 d0Var) {
        this.f11675n.a(8, d0Var).b();
    }

    public final void a0(j1 j1Var) {
        Looper looper = j1Var.f11607e;
        if (!looper.getThread().isAlive()) {
            e2.a.n("TAG", "Trying to send message on a dead thread.");
            j1Var.a(false);
            return;
        }
        this.F.a(looper, null).c(new nb(this, j1Var));
    }

    @Override
    public final void b(u2.d1 d1Var) {
        this.f11675n.a(9, (u2.d0) d1Var).b();
    }

    public final void b0(b2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.b0(b2.e, boolean):void");
    }

    @Override
    public final void c(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        if (this.T) {
            e2.z zVar = this.f11675n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8796a = zVar.f8798a.obtainMessage(37);
            b10.b();
        }
    }

    public final void c0(boolean z10, e2.g gVar) {
        if (this.f11668f0 != z10) {
            this.f11668f0 = z10;
            if (!z10) {
                for (n1 n1Var : this.f11658a) {
                    n1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void d(j0 j0Var, int i10) {
        this.W.f(1);
        f1 f1Var = this.I;
        if (i10 == -1) {
            i10 = f1Var.f11541b.size();
        }
        w(f1Var.a(i10, j0Var.f11601a, j0Var.f11602b), false);
    }

    public final void d0(j0 j0Var) {
        this.W.f(1);
        int i10 = j0Var.f11603c;
        u2.g1 g1Var = j0Var.f11602b;
        ArrayList arrayList = j0Var.f11601a;
        if (i10 != -1) {
            this.f11672j0 = new n0(new l1(arrayList, g1Var), j0Var.f11603c, j0Var.d);
        }
        f1 f1Var = this.I;
        ArrayList arrayList2 = f1Var.f11541b;
        f1Var.g(0, arrayList2.size());
        w(f1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final void e() {
        n1[] n1VarArr;
        o1 o1Var;
        for (n1 n1Var : this.f11658a) {
            if (this.S) {
                o1Var = this.R;
            } else {
                o1Var = null;
            }
            n1Var.f11648a.d(18, o1Var);
            f fVar = n1Var.f11650c;
            if (fVar != null) {
                fVar.d(18, o1Var);
            }
        }
    }

    public final void e0(boolean z10) {
        this.Y = z10;
        Q();
        if (this.Z) {
            v0 v0Var = this.H;
            if (v0Var.f11765j != v0Var.f11764i) {
                W(true);
                v(false);
            }
        }
    }

    public final boolean f() {
        if (!this.O) {
            return false;
        }
        for (n1 n1Var : this.f11658a) {
            if (n1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(b2.v0 v0Var) {
        this.f11675n.d(16);
        a3.p pVar = this.f11687y;
        pVar.f(v0Var);
        b2.v0 h = pVar.h();
        y(h, h.f2400a, true, true);
    }

    public final void g() {
        O();
        W(true);
    }

    public final void g0(r rVar) {
        this.f11679q0 = rVar;
        b2.k1 k1Var = this.V.f11554a;
        v0 v0Var = this.H;
        v0Var.getClass();
        rVar.getClass();
        if (!v0Var.f11772q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < v0Var.f11772q.size(); i10++) {
                ((t0) v0Var.f11772q.get(i10)).i();
            }
            v0Var.f11772q = arrayList;
            v0Var.f11768m = null;
            v0Var.k();
        }
    }

    public final void h0(int i10) {
        this.f11664d0 = i10;
        b2.k1 k1Var = this.V.f11554a;
        v0 v0Var = this.H;
        v0Var.f11763g = i10;
        int r10 = v0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        t0 t0Var;
        u2.f0 f0Var;
        t0 t0Var2;
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
                    this.W.f(1);
                    z0(this.P.d(this.V.f11557e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    X((n0) message.obj, true);
                    break;
                case 4:
                    f0((b2.v0) message.obj);
                    break;
                case 5:
                    k0((p1) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    L((e2.g) message.obj);
                    return true;
                case 8:
                    x((u2.d0) message.obj);
                    break;
                case 9:
                    t((u2.d0) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l0(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c0(z12, (e2.g) message.obj);
                    break;
                case 14:
                    Z((j1) message.obj);
                    break;
                case 15:
                    a0((j1) message.obj);
                    break;
                case 16:
                    b2.v0 v0Var = (b2.v0) message.obj;
                    y(v0Var, v0Var.f2400a, true, false);
                    break;
                case 17:
                    d0((j0) message.obj);
                    break;
                case 18:
                    d((j0) message.obj, message.arg1);
                    break;
                case 19:
                    J((k0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (u2.g1) message.obj);
                    break;
                case 21:
                    m0((u2.g1) message.obj);
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
                    e0(z13);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    g();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((r) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (e2.g) pair.second);
                    break;
                case 31:
                    b2.e eVar = (b2.e) message.obj;
                    if (message.arg1 != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    b0(eVar, z14);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    o0((a3.x) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.T = false;
                    n0 n0Var = this.U;
                    if (n0Var != null) {
                        X(n0Var, false);
                        this.U = null;
                        break;
                    }
                    break;
                case 38:
                    j0((o1) message.obj);
                    break;
            }
        } catch (b2.s0 e7) {
            boolean z15 = e7.f2378a;
            int i13 = e7.f2379b;
            if (i13 == 1) {
                if (z15) {
                    i11 = 3001;
                } else {
                    i11 = 3003;
                }
            } else if (i13 == 4) {
                if (z15) {
                    i11 = 3002;
                } else {
                    i11 = 3004;
                }
            }
            u(e7, i11);
        } catch (g2.j e10) {
            u(e10, e10.f10318a);
        } catch (o e11) {
            e = e11;
            int i14 = e.f11653s;
            v0 v0Var2 = this.H;
            if (i14 == 1 && (t0Var2 = v0Var2.f11765j) != null && e.E == null) {
                e = e.a(t0Var2.f11738g.f11749a);
            }
            int i15 = e.f11653s;
            e2.z zVar = this.f11675n;
            if (i15 == 1 && (f0Var = e.E) != null && B(e.f11654w, f0Var)) {
                this.f11683s0 = true;
                i();
                t0 g10 = v0Var2.g();
                t0 t0Var3 = v0Var2.f11764i;
                if (t0Var3 != g10) {
                    while (t0Var3 != null) {
                        t0 t0Var4 = t0Var3.f11743m;
                        if (t0Var4 == g10) {
                            break;
                        }
                        t0Var3 = t0Var4;
                    }
                }
                v0Var2.n(t0Var3);
                if (this.V.f11557e != 4) {
                    D();
                    zVar.e(2);
                }
            } else {
                o oVar = this.f11677o0;
                if (oVar != null) {
                    oVar.addSuppressed(e);
                    e = this.f11677o0;
                }
                if (e.f11653s == 1 && v0Var2.f11764i != v0Var2.f11765j) {
                    while (true) {
                        t0Var = v0Var2.f11764i;
                        if (t0Var == v0Var2.f11765j) {
                            break;
                        }
                        v0Var2.a();
                    }
                    e2.d.d(t0Var);
                    F();
                    u0 u0Var = t0Var.f11738g;
                    u2.f0 f0Var2 = u0Var.f11749a;
                    long j3 = u0Var.f11750b;
                    this.V = z(f0Var2, j3, u0Var.f11751c, j3, true, 0);
                }
                if (e.F && (this.f11677o0 == null || (i10 = e.f2395a) == 5004 || i10 == 5003)) {
                    e2.a.o("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f11677o0 == null) {
                        this.f11677o0 = e;
                    }
                    e2.y a2 = zVar.a(25, e);
                    Handler handler = zVar.f8798a;
                    Message message2 = a2.f8796a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    a2.a();
                } else {
                    e2.a.f("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.V = this.V.f(e);
                }
            }
        } catch (IOException e12) {
            u(e12, 2000);
        } catch (RuntimeException e13) {
            o oVar2 = new o(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.f("ExoPlayerImplInternal", "Playback error", oVar2);
            u0(true, false);
            this.V = this.V.f(oVar2);
        } catch (n2.f e14) {
            u(e14, e14.f16394a);
        } catch (u2.b e15) {
            u(e15, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        n1[] n1VarArr;
        boolean z10;
        f fVar;
        if (this.O && f()) {
            for (n1 n1Var : this.f11658a) {
                int c10 = n1Var.c();
                if (n1Var.f()) {
                    int i10 = n1Var.d;
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
                        fVar = n1Var.f11648a;
                    } else {
                        fVar = n1Var.f11650c;
                        fVar.getClass();
                    }
                    n1Var.a(fVar, this.f11687y);
                    n1Var.i(z10);
                    n1Var.d = i11;
                }
                this.f11671i0 -= c10 - n1Var.c();
            }
            this.f11681r0 = -9223372036854775807L;
        }
    }

    public final void i0(boolean z10) {
        if (!z10) {
            this.T = false;
            this.f11675n.d(37);
            n0 n0Var = this.U;
            if (n0Var != null) {
                X(n0Var, false);
                this.U = null;
            }
        }
        this.S = z10;
        e();
    }

    public final void j(int i10) {
        boolean z10;
        n1[] n1VarArr = this.f11658a;
        int c10 = n1VarArr[i10].c();
        n1 n1Var = n1VarArr[i10];
        f fVar = n1Var.f11648a;
        a3.p pVar = this.f11687y;
        n1Var.a(fVar, pVar);
        f fVar2 = n1Var.f11650c;
        if (fVar2 != null) {
            if (fVar2.f11499n != 0 && n1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            n1Var.a(fVar2, pVar);
            n1Var.i(false);
            if (z10) {
                f fVar3 = n1Var.f11648a;
                fVar2.getClass();
                fVar2.d(17, fVar3);
            }
        }
        n1Var.d = 0;
        H(i10, false);
        this.f11671i0 -= c10;
    }

    public final void j0(o1 o1Var) {
        this.R = o1Var;
        e();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.k():void");
    }

    public final void k0(p1 p1Var) {
        this.Q = p1Var;
    }

    public final void l(t0 t0Var, int i10, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        n1 n1Var = this.f11658a[i10];
        boolean g10 = n1Var.g();
        f fVar = n1Var.f11648a;
        if (!g10) {
            if (t0Var == this.H.f11764i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.v vVar = t0Var.f11745o;
            m1 m1Var = vVar.f48770b[i10];
            x2.r rVar = vVar.f48771c[i10];
            if (r0() && this.V.f11557e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f11671i0++;
            u2.b1 b1Var = t0Var.f11735c[i10];
            long j10 = t0Var.f11746p;
            u2.f0 f0Var = t0Var.f11738g.f11749a;
            f fVar2 = n1Var.f11650c;
            if (rVar != null) {
                i11 = rVar.length();
            } else {
                i11 = 0;
            }
            b2.s[] sVarArr = new b2.s[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                rVar.getClass();
                sVarArr[i12] = rVar.f(i12);
            }
            int i13 = n1Var.d;
            a3.p pVar = this.f11687y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                n1Var.f11652f = true;
                fVar2.getClass();
                if (fVar2.f11499n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                e2.d.g(z15);
                fVar2.d = m1Var;
                fVar2.G = f0Var;
                fVar2.f11499n = 1;
                fVar2.o(z13, z11);
                fVar2.x(sVarArr, b1Var, j3, j10, f0Var);
                fVar2.f11504y = false;
                fVar2.f11502w = j3;
                fVar2.f11503x = j3;
                fVar2.p(j3, z13);
                pVar.c(fVar2);
            } else {
                n1Var.f11651e = true;
                if (fVar.f11499n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                e2.d.g(z14);
                fVar.d = m1Var;
                fVar.G = f0Var;
                fVar.f11499n = 1;
                fVar.o(z13, z11);
                fVar.x(sVarArr, b1Var, j3, j10, f0Var);
                fVar.f11504y = false;
                fVar.f11502w = j3;
                fVar.f11503x = j3;
                fVar.p(j3, z13);
                pVar.c(fVar);
            }
            i0 i0Var = new i0(this);
            f d = n1Var.d(t0Var);
            d.getClass();
            d.d(11, i0Var);
            if (z12 && z11) {
                n1Var.m();
            }
        }
    }

    public final void l0(boolean z10) {
        this.f11666e0 = z10;
        b2.k1 k1Var = this.V.f11554a;
        v0 v0Var = this.H;
        v0Var.h = z10;
        int r10 = v0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final void m(long j3, boolean[] zArr) {
        n1[] n1VarArr;
        long j10;
        t0 t0Var = this.H.f11765j;
        x2.v vVar = t0Var.f11745o;
        int i10 = 0;
        while (true) {
            n1VarArr = this.f11658a;
            if (i10 >= n1VarArr.length) {
                break;
            }
            if (!vVar.b(i10)) {
                n1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < n1VarArr.length) {
            if (!vVar.b(i11) || n1VarArr[i11].d(t0Var) != null) {
                j10 = j3;
            } else {
                j10 = j3;
                l(t0Var, i11, zArr[i11], j10);
            }
            i11++;
            j3 = j10;
        }
    }

    public final void m0(u2.g1 g1Var) {
        this.W.f(1);
        f1 f1Var = this.I;
        int size = f1Var.f11541b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.h().e(0, size);
        }
        f1Var.f11547j = g1Var;
        w(f1Var.b(), false);
    }

    public final long n(b2.k1 k1Var, Object obj, long j3) {
        b2.h1 h1Var = this.f11685w;
        int i10 = k1Var.g(obj, h1Var).f2056c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        if (j1Var.f2110f == -9223372036854775807L || !j1Var.a() || !j1Var.f2112i) {
            return -9223372036854775807L;
        }
        return e2.d0.Q(e2.d0.A(j1Var.f2111g) - j1Var.f2110f) - (j3 + h1Var.f2057e);
    }

    public final void n0(int i10) {
        g1 g1Var = this.V;
        if (g1Var.f11557e != i10) {
            if (i10 != 2) {
                this.f11678p0 = -9223372036854775807L;
            }
            if (i10 != 3 && g1Var.f11567p) {
                this.V = g1Var.i(false);
            }
            this.V = this.V.h(i10);
        }
    }

    public final long o(t0 t0Var) {
        if (t0Var == null) {
            return 0L;
        }
        long j3 = t0Var.f11746p;
        if (!t0Var.f11736e) {
            return j3;
        }
        int i10 = 0;
        while (true) {
            n1[] n1VarArr = this.f11658a;
            if (i10 < n1VarArr.length) {
                if (n1VarArr[i10].d(t0Var) != null) {
                    f d = n1VarArr[i10].d(t0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f11503x;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j3 = Math.max(j10, j3);
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    public final void o0(a3.x xVar) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f11658a) {
            f fVar = n1Var.f11648a;
            if (fVar.f11495b == 2) {
                fVar.d(7, xVar);
                f fVar2 = n1Var.f11650c;
                if (fVar2 != null) {
                    fVar2.d(7, xVar);
                }
            }
        }
    }

    public final Pair p(b2.k1 k1Var) {
        long j3 = 0;
        if (k1Var.p()) {
            return Pair.create(g1.f11553u, 0L);
        }
        int a2 = k1Var.a(this.f11666e0);
        Pair i10 = k1Var.i(this.v, this.f11685w, a2, -9223372036854775807L);
        u2.f0 p5 = this.H.p(k1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f46667a;
            b2.h1 h1Var = this.f11685w;
            k1Var.g(obj, h1Var);
            if (p5.f46669c == h1Var.e(p5.f46668b)) {
                h1Var.f2059g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j3));
    }

    public final void p0(Object obj, e2.g gVar) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f11658a) {
            f fVar = n1Var.f11648a;
            if (fVar.f11495b == 2) {
                int i10 = n1Var.d;
                if (i10 != 4 && i10 != 1) {
                    fVar.d(1, obj);
                } else {
                    f fVar2 = n1Var.f11650c;
                    fVar2.getClass();
                    fVar2.d(1, obj);
                }
            }
        }
        int i11 = this.V.f11557e;
        if (i11 == 3 || i11 == 2) {
            this.f11675n.e(2);
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final long q(long j3) {
        t0 t0Var = this.H.f11767l;
        if (t0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f11673k0 - t0Var.f11746p));
    }

    public final void q0(float f7) {
        n1[] n1VarArr;
        this.f11684t0 = f7;
        float f10 = f7 * this.P.f11486g;
        for (n1 n1Var : this.f11658a) {
            f fVar = n1Var.f11648a;
            if (fVar.f11495b == 1) {
                fVar.d(2, Float.valueOf(f10));
                f fVar2 = n1Var.f11650c;
                if (fVar2 != null) {
                    fVar2.d(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void r(int i10) {
        g1 g1Var = this.V;
        z0(i10, g1Var.f11565n, g1Var.f11564m, g1Var.f11563l);
    }

    public final boolean r0() {
        g1 g1Var = this.V;
        if (g1Var.f11563l && g1Var.f11565n == 0) {
            return true;
        }
        return false;
    }

    public final void s() {
        q0(this.f11684t0);
    }

    public final boolean s0(b2.k1 k1Var, u2.f0 f0Var) {
        if (!f0Var.b() && !k1Var.p()) {
            int i10 = k1Var.g(f0Var.f46667a, this.f11685w).f2056c;
            b2.j1 j1Var = this.v;
            k1Var.n(i10, j1Var);
            if (j1Var.a() && j1Var.f2112i && j1Var.f2110f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(u2.d0 d0Var) {
        v0 v0Var = this.H;
        t0 t0Var = v0Var.f11767l;
        if (t0Var != null && t0Var.f11733a == d0Var) {
            v0Var.m(this.f11673k0);
            D();
            return;
        }
        t0 t0Var2 = v0Var.f11768m;
        if (t0Var2 != null && t0Var2.f11733a == d0Var) {
            E();
        }
    }

    public final void t0() {
        t0 t0Var = this.H.f11764i;
        if (t0Var != null) {
            x2.v vVar = t0Var.f11745o;
            int i10 = 0;
            while (true) {
                n1[] n1VarArr = this.f11658a;
                if (i10 < n1VarArr.length) {
                    if (vVar.b(i10)) {
                        n1VarArr[i10].m();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u(IOException iOException, int i10) {
        o oVar = new o(0, iOException, i10);
        t0 t0Var = this.H.f11764i;
        if (t0Var != null) {
            oVar = oVar.a(t0Var.f11738g.f11749a);
        }
        e2.a.f("ExoPlayerImplInternal", "Playback error", oVar);
        u0(false, false);
        this.V = this.V.f(oVar);
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f11668f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.W.f(z11 ? 1 : 0);
        l lVar = this.f11667f;
        if (lVar.h.remove(this.L) != null) {
            lVar.d();
        }
        this.P.d(1, this.V.f11563l);
        n0(1);
    }

    public final void v(boolean z10) {
        u2.f0 f0Var;
        long d;
        t0 t0Var = this.H.f11767l;
        if (t0Var == null) {
            f0Var = this.V.f11555b;
        } else {
            f0Var = t0Var.f11738g.f11749a;
        }
        boolean equals = this.V.f11562k.equals(f0Var);
        if (!equals) {
            this.V = this.V.c(f0Var);
        }
        g1 g1Var = this.V;
        if (t0Var == null) {
            d = g1Var.f11570s;
        } else {
            d = t0Var.d();
        }
        g1Var.f11568q = d;
        g1 g1Var2 = this.V;
        g1Var2.f11569r = q(g1Var2.f11568q);
        if ((!equals || z10) && t0Var != null && t0Var.f11736e) {
            x0(t0Var.f11745o);
        }
    }

    public final void v0() {
        n1[] n1VarArr;
        a3.p pVar = this.f11687y;
        pVar.f170b = false;
        q1 q1Var = (q1) pVar.f171c;
        if (q1Var.f11724c) {
            q1Var.c(q1Var.a());
            q1Var.f11724c = false;
        }
        for (n1 n1Var : this.f11658a) {
            f fVar = n1Var.f11650c;
            f fVar2 = n1Var.f11648a;
            if (n1.h(fVar2)) {
                n1.b(fVar2);
            }
            if (fVar != null && fVar.f11499n != 0) {
                n1.b(fVar);
            }
        }
    }

    public final void w(b2.k1 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.w(b2.k1, boolean):void");
    }

    public final void w0() {
        boolean z10;
        t0 t0Var = this.H.f11767l;
        if (!this.f11663c0 && (t0Var == null || !t0Var.f11733a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        g1 g1Var = this.V;
        if (z10 != g1Var.f11559g) {
            this.V = g1Var.b(z10);
        }
    }

    public final void x(u2.d0 d0Var) {
        t0 t0Var;
        v0 v0Var = this.H;
        t0 t0Var2 = v0Var.f11767l;
        a3.p pVar = this.f11687y;
        if (t0Var2 != null && t0Var2.f11733a == d0Var) {
            t0Var2.getClass();
            if (!t0Var2.f11736e) {
                float f7 = pVar.h().f2400a;
                g1 g1Var = this.V;
                t0Var2.f(f7, g1Var.f11554a, g1Var.f11563l);
            }
            x0(t0Var2.f11745o);
            if (t0Var2 == v0Var.f11764i) {
                R(t0Var2.f11738g.f11750b);
                m(v0Var.f11765j.e(), new boolean[this.f11658a.length]);
                t0Var2.h = true;
                g1 g1Var2 = this.V;
                u2.f0 f0Var = g1Var2.f11555b;
                long j3 = t0Var2.f11738g.f11750b;
                this.V = z(f0Var, j3, g1Var2.f11556c, j3, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < v0Var.f11772q.size()) {
                t0Var = (t0) v0Var.f11772q.get(i10);
                if (t0Var.f11733a == d0Var) {
                    break;
                }
                i10++;
            } else {
                t0Var = null;
                break;
            }
        }
        if (t0Var != null) {
            e2.d.g(true ^ t0Var.f11736e);
            float f10 = pVar.h().f2400a;
            g1 g1Var3 = this.V;
            t0Var.f(f10, g1Var3.f11554a, g1Var3.f11563l);
            t0 t0Var3 = v0Var.f11768m;
            if (t0Var3 != null && t0Var3.f11733a == d0Var) {
                E();
            }
        }
    }

    public final void x0(x2.v vVar) {
        t0 t0Var = this.H.f11767l;
        t0Var.getClass();
        q(t0Var.d());
        if (s0(this.V.f11554a, t0Var.f11738g.f11749a)) {
            long j3 = this.J.h;
        }
        b2.k1 k1Var = this.V.f11554a;
        float f7 = this.f11687y.h().f2400a;
        boolean z10 = this.V.f11563l;
        x2.r[] rVarArr = vVar.f48771c;
        l lVar = this.f11667f;
        k kVar = (k) lVar.h.get(this.L);
        kVar.getClass();
        int i10 = lVar.f11620f;
        if (i10 == -1) {
            int length = rVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    x2.r rVar = rVarArr[i11];
                    if (rVar != null) {
                        switch (rVar.b().f2144c) {
                            case -2:
                                i13 = 0;
                                break;
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i13 = 144310272;
                                break;
                            case 2:
                                i13 = 131072000;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i13 = 131072;
                                break;
                            case 4:
                                i13 = 26214400;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        i12 += i13;
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        kVar.f11610b = i10;
        lVar.d();
    }

    public final void y(b2.v0 v0Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.W.f(1);
            }
            this.V = this.V.g(v0Var);
        }
        float f10 = v0Var.f2400a;
        t0 t0Var = this.H.f11764i;
        while (true) {
            i10 = 0;
            if (t0Var == null) {
                break;
            }
            x2.r[] rVarArr = t0Var.f11745o.f48771c;
            int length = rVarArr.length;
            while (i10 < length) {
                x2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f10);
                }
                i10++;
            }
            t0Var = t0Var.f11743m;
        }
        n1[] n1VarArr = this.f11658a;
        int length2 = n1VarArr.length;
        while (i10 < length2) {
            n1 n1Var = n1VarArr[i10];
            float f11 = v0Var.f2400a;
            n1Var.f11648a.y(f7, f11);
            f fVar = n1Var.f11650c;
            if (fVar != null) {
                fVar.y(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.W.f(1);
        f1 f1Var = this.I;
        f1Var.getClass();
        ArrayList arrayList = f1Var.f11541b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        e2.d.b(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((e1) arrayList.get(i12)).f11490a.t((b2.k0) list.get(i12 - i10));
        }
        w(f1Var.b(), false);
    }

    public final g1 z(u2.f0 f0Var, long j3, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        e9.a1 a1Var;
        boolean z13;
        boolean z14;
        if (!this.f11676n0 && j3 == this.V.f11570s && f0Var.equals(this.V.f11555b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f11676n0 = z11;
        Q();
        g1 g1Var = this.V;
        u2.o1 o1Var = g1Var.h;
        x2.v vVar = g1Var.f11560i;
        List list = g1Var.f11561j;
        if (this.I.f11548k) {
            t0 t0Var = this.H.f11764i;
            if (t0Var == null) {
                o1Var = u2.o1.d;
            } else {
                o1Var = t0Var.f11744n;
            }
            if (t0Var == null) {
                vVar = this.f11665e;
            } else {
                vVar = t0Var.f11745o;
            }
            x2.r[] rVarArr = vVar.f48771c;
            ?? wVar = new com.google.android.gms.common.api.internal.w(4);
            boolean z15 = false;
            for (x2.r rVar : rVarArr) {
                if (rVar != null) {
                    b2.p0 p0Var = rVar.f(0).f2364l;
                    if (p0Var == null) {
                        wVar.b(new b2.p0(new b2.o0[0]));
                    } else {
                        wVar.b(p0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                a1Var = wVar.i();
            } else {
                e9.g0 g0Var = e9.i0.f8957b;
                a1Var = e9.a1.f8920e;
            }
            list = a1Var;
            if (t0Var != null) {
                u0 u0Var = t0Var.f11738g;
                if (u0Var.f11751c != j10) {
                    t0Var.f11738g = u0Var.a(j10);
                }
            }
            n1[] n1VarArr = this.f11658a;
            v0 v0Var = this.H;
            t0 t0Var2 = v0Var.f11764i;
            if (t0Var2 == v0Var.f11765j && t0Var2 != null) {
                x2.v vVar2 = t0Var2.f11745o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < n1VarArr.length) {
                        if (vVar2.b(i11)) {
                            if (n1VarArr[i11].f11648a.f11495b != 1) {
                                z13 = false;
                                break;
                            } else if (vVar2.f48770b[i11].f11643a != 0) {
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
                if (z14 != this.f11670h0) {
                    this.f11670h0 = z14;
                    if (!z14 && this.V.f11567p) {
                        this.f11675n.e(2);
                    }
                }
            }
        } else if (!f0Var.equals(g1Var.f11555b)) {
            o1Var = u2.o1.d;
            vVar = this.f11665e;
            list = e9.a1.f8920e;
        }
        u2.o1 o1Var2 = o1Var;
        x2.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            l0 l0Var = this.W;
            if (l0Var.d && l0Var.f11626e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
            } else {
                l0Var.f11625c = true;
                l0Var.d = true;
                l0Var.f11626e = i10;
            }
        }
        g1 g1Var2 = this.V;
        return g1Var2.d(f0Var, j3, j10, j11, q(g1Var2.f11568q), o1Var2, vVar3, list2);
    }

    public final void z0(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        x2.r[] rVarArr;
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
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = 0;
        }
        g1 g1Var = this.V;
        if (g1Var.f11563l != z11 || g1Var.f11565n != i11 || g1Var.f11564m != i12) {
            this.V = g1Var.e(i12, i11, z11);
            C0(false, false);
            v0 v0Var = this.H;
            for (t0 t0Var = v0Var.f11764i; t0Var != null; t0Var = t0Var.f11743m) {
                for (x2.r rVar : t0Var.f11745o.f48771c) {
                    if (rVar != null) {
                        rVar.e(z11);
                    }
                }
            }
            if (!r0()) {
                v0();
                A0();
                g1 g1Var2 = this.V;
                if (g1Var2.f11567p) {
                    this.V = g1Var2.i(false);
                }
                v0Var.m(this.f11673k0);
                return;
            }
            int i13 = this.V.f11557e;
            e2.z zVar = this.f11675n;
            if (i13 == 3) {
                a3.p pVar = this.f11687y;
                pVar.f170b = true;
                ((q1) pVar.f171c).d();
                t0();
                zVar.e(2);
            } else if (i13 == 2) {
                zVar.e(2);
            }
        }
    }
}
