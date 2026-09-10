package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import fg.s1;
import gg.v1;
import hi.y1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import u2.q1;
public final class n0 implements Handler.Callback, u2.d0, g1, a3.y {
    public static final long f10281u0 = e2.d0.e0(10000);
    public final ArrayList E;
    public final e2.x F;
    public final w G;
    public final u0 H;
    public final e1 I;
    public final i J;
    public final long K;
    public final j2.k L;
    public final j2.e M;
    public final e2.z N;
    public final boolean O;
    public final e P;
    public o1 Q;
    public n1 R;
    public boolean S;
    public boolean T;
    public m0 U;
    public f1 V;
    public k0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final m1[] f10282a;
    public boolean f10283a0;
    public final f[] f10284b;
    public long f10285b0;
    public final boolean[] f10286c;
    public boolean f10287c0;
    public final x2.u d;
    public int f10288d0;
    public final x2.v e;
    public boolean f10289e0;
    public final k f10290f;
    public boolean f10291f0;
    public boolean f10292g0;
    public final y2.c h;
    public boolean f10293h0;
    public int f10294i0;
    public m0 f10295j0;
    public long f10296k0;
    public long f10297l0;
    public int m0;
    public final e2.z f10298n;
    public boolean f10299n0;
    public n f10300o0;
    public long f10301p0;
    public q f10302q0;
    public final j6.l f10303r;
    public long f10304r0;
    public final Looper f10305s;
    public boolean f10306s0;
    public float f10307t0;
    public final b2.j1 v;
    public final b2.h1 f10308w;
    public final long f10309x;
    public final a3.q f10310y;

    public n0(Context context, f[] fVarArr, f[] fVarArr2, x2.u uVar, x2.v vVar, k kVar, y2.c cVar, int i10, boolean z10, j2.e eVar, o1 o1Var, i iVar, long j3, Looper looper, e2.x xVar, w wVar, j2.k kVar2, final a3.y yVar) {
        q qVar = q.f10346a;
        this.f10304r0 = -9223372036854775807L;
        this.G = wVar;
        this.d = uVar;
        this.e = vVar;
        this.f10290f = kVar;
        this.h = cVar;
        this.f10288d0 = i10;
        this.f10289e0 = z10;
        this.Q = o1Var;
        this.J = iVar;
        this.K = j3;
        this.Y = false;
        this.F = xVar;
        this.L = kVar2;
        this.f10302q0 = qVar;
        this.M = eVar;
        this.f10307t0 = 1.0f;
        this.R = n1.f10311b;
        this.f10301p0 = -9223372036854775807L;
        this.f10285b0 = -9223372036854775807L;
        this.f10309x = kVar.f10248g;
        b2.g1 g1Var = b2.k1.f1774a;
        f1 k10 = f1.k(vVar);
        this.V = k10;
        this.W = new k0(k10);
        this.f10284b = new f[fVarArr.length];
        this.f10286c = new boolean[fVarArr.length];
        x2.p pVar = (x2.p) uVar;
        pVar.getClass();
        this.f10282a = new m1[fVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar = fVarArr[i11];
            fVar.e = i11;
            fVar.f10176f = kVar2;
            fVar.h = xVar;
            this.f10284b[i11] = fVar;
            f fVar2 = this.f10284b[i11];
            synchronized (fVar2.f10173a) {
                fVar2.H = pVar;
            }
            f fVar3 = fVarArr2[i11];
            if (fVar3 != null) {
                fVar3.e = i11;
                fVar3.f10176f = kVar2;
                fVar3.h = xVar;
                z11 = true;
            }
            this.f10282a[i11] = new m1(fVarArr[i11], fVar3, i11);
        }
        this.O = z11;
        this.f10310y = new a3.q(this, xVar);
        this.E = new ArrayList();
        this.v = new b2.j1();
        this.f10308w = new b2.h1();
        e2.d.g(uVar.f44555a == null);
        uVar.f44555a = this;
        uVar.f44556b = cVar;
        this.f10299n0 = true;
        e2.z a2 = xVar.a(looper, null);
        this.N = a2;
        this.H = new u0(eVar, a2, new y1(this, 13));
        this.I = new e1(this, eVar, a2, kVar2);
        j6.l lVar = new j6.l(7);
        this.f10303r = lVar;
        Looper g10 = lVar.g();
        this.f10305s = g10;
        e2.z a10 = xVar.a(g10, this);
        this.f10298n = a10;
        this.P = new e(context, g10, this);
        a10.a(35, new a3.y() {
            @Override
            public final void a(long j10, long j11, b2.s sVar, MediaFormat mediaFormat) {
                n0 n0Var = n0.this;
                n0Var.getClass();
                yVar.a(j10, j11, sVar, mediaFormat);
                n0Var.a(j10, j11, sVar, mediaFormat);
            }
        }).b();
    }

    public static boolean A(s0 s0Var) {
        u2.d1[] d1VarArr;
        long d;
        if (s0Var != null) {
            try {
                ?? r12 = s0Var.f10353a;
                if (!s0Var.e) {
                    r12.f();
                } else {
                    for (u2.d1 d1Var : s0Var.f10355c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                }
                if (!s0Var.e) {
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

    public static Pair T(b2.k1 k1Var, m0 m0Var, boolean z10, int i10, boolean z11, b2.j1 j1Var, b2.h1 h1Var) {
        b2.k1 k1Var2;
        int U;
        b2.k1 k1Var3 = m0Var.f10270a;
        if (!k1Var.p()) {
            if (k1Var3.p()) {
                k1Var2 = k1Var;
            } else {
                k1Var2 = k1Var3;
            }
            try {
                Pair i11 = k1Var2.i(j1Var, h1Var, m0Var.f10271b, m0Var.f10272c);
                if (!k1Var.equals(k1Var2)) {
                    if (k1Var.b(i11.first) != -1) {
                        if (k1Var2.g(i11.first, h1Var).f1708f && k1Var2.m(h1Var.f1707c, j1Var, 0L).f1761n == k1Var2.b(i11.first)) {
                            return k1Var.i(j1Var, h1Var, k1Var.g(i11.first, h1Var).f1707c, m0Var.f10272c);
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
        Object obj2 = k1Var3.m(k1Var3.g(obj, h1Var).f1707c, j1Var, 0L).f1751a;
        for (int i11 = 0; i11 < k1Var2.o(); i11++) {
            if (k1Var2.m(i11, j1Var, 0L).f1751a.equals(obj2)) {
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
        return k1Var2.f(i13, h1Var, false).f1707c;
    }

    public static void h(i1 i1Var) {
        try {
            synchronized (i1Var) {
                synchronized (i1Var) {
                }
                i1Var.f10233a.c(i1Var.f10235c, i1Var.d);
                return;
            }
            i1Var.f10233a.c(i1Var.f10235c, i1Var.d);
            return;
        } finally {
            i1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.A0():void");
    }

    public final boolean B(int i10, u2.g0 g0Var) {
        boolean z10;
        boolean z11;
        u0 u0Var = this.H;
        s0 s0Var = u0Var.f10383k;
        if (s0Var != null && s0Var.f10357g.f10368a.equals(g0Var)) {
            m1 m1Var = this.f10282a[i10];
            s0 s0Var2 = u0Var.f10383k;
            int i11 = m1Var.d;
            if ((i11 == 2 || i11 == 4) && m1Var.d(s0Var2) == m1Var.f10273a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (m1Var.d == 3 && m1Var.d(s0Var2) == m1Var.f10275c) {
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

    public final void B0(b2.k1 k1Var, u2.g0 g0Var, b2.k1 k1Var2, u2.g0 g0Var2, long j3, boolean z10) {
        Object obj;
        b2.v0 v0Var;
        boolean s02 = s0(k1Var, g0Var);
        Object obj2 = g0Var.f42324a;
        if (!s02) {
            if (g0Var.b()) {
                v0Var = b2.v0.d;
            } else {
                v0Var = this.V.f10198o;
            }
            a3.q qVar = this.f10310y;
            if (!qVar.h().equals(v0Var)) {
                this.f10298n.d(16);
                qVar.f(v0Var);
                y(this.V.f10198o, v0Var.f2029a, false, false);
                return;
            }
            return;
        }
        b2.h1 h1Var = this.f10308w;
        int i10 = k1Var.g(obj2, h1Var).f1707c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        b2.e0 e0Var = j1Var.f1757j;
        i iVar = this.J;
        iVar.getClass();
        iVar.f10221c = e2.d0.Q(e0Var.f1671a);
        iVar.f10222f = e2.d0.Q(e0Var.f1672b);
        iVar.f10223g = e2.d0.Q(e0Var.f1673c);
        float f7 = e0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        iVar.f10225j = f7;
        float f10 = e0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.f10224i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            iVar.f10221c = -9223372036854775807L;
        }
        iVar.a();
        if (j3 != -9223372036854775807L) {
            iVar.d = n(k1Var, obj2, j3);
            iVar.a();
            return;
        }
        Object obj3 = j1Var.f1751a;
        if (!k1Var2.p()) {
            obj = k1Var2.m(k1Var2.g(g0Var2.f42324a, h1Var).f1707c, j1Var, 0L).f1751a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    public final boolean C() {
        s0 s0Var = this.H.f10381i;
        long j3 = s0Var.f10357g.e;
        if (s0Var.e) {
            if (j3 == -9223372036854775807L || this.V.f10202s < j3 || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0(boolean z10, boolean z11) {
        long j3;
        this.f10283a0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f10285b0 = j3;
    }

    public final void D() {
        long d;
        long j3;
        boolean c10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f10384l)) {
            c10 = false;
        } else {
            s0 s0Var = this.H.f10384l;
            if (!s0Var.e) {
                d = 0;
            } else {
                d = s0Var.f10353a.d();
            }
            long q6 = q(d);
            s0 s0Var2 = this.H.f10381i;
            if (s0(this.V.f10187a, s0Var.f10357g.f10368a)) {
                j3 = this.J.h;
            } else {
                j3 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.k1 k1Var = this.V.f10187a;
            float f7 = this.f10310y.h().f2029a;
            boolean z13 = this.V.f10195l;
            o0 o0Var = new o0(kVar, q6, f7, this.f10283a0, j3);
            c10 = this.f10290f.c(o0Var);
            s0 s0Var3 = this.H.f10381i;
            if (!c10 && s0Var3.e && q6 < 500000 && this.f10309x > 0) {
                s0Var3.f10353a.i(this.V.f10202s);
                c10 = this.f10290f.c(o0Var);
            }
        }
        this.f10287c0 = c10;
        if (c10) {
            s0 s0Var4 = this.H.f10384l;
            s0Var4.getClass();
            p0 p0Var = new p0();
            p0Var.f10340a = this.f10296k0 - s0Var4.f10365p;
            float f10 = this.f10310y.h().f2029a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            e2.d.b(z10);
            p0Var.f10341b = f10;
            long j10 = this.f10285b0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            p0Var.f10342c = j10;
            q0 q0Var = new q0(p0Var);
            if (s0Var4.f10362m == null) {
                z12 = true;
            }
            e2.d.g(z12);
            s0Var4.f10353a.n(q0Var);
        }
        w0();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        u0 u0Var = this.H;
        u0Var.k();
        s0 s0Var = u0Var.f10385m;
        if (s0Var != null) {
            ?? r12 = s0Var.f10353a;
            if ((!s0Var.d || s0Var.e) && !r12.c()) {
                b2.k1 k1Var = this.V.f10187a;
                if (s0Var.e) {
                    r12.r();
                }
                for (j jVar : this.f10290f.h.values()) {
                    if (jVar.f10237a) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!s0Var.d) {
                    long j3 = s0Var.f10357g.f10369b;
                    s0Var.d = true;
                    r12.j(this, j3);
                    return;
                }
                p0 p0Var = new p0();
                p0Var.f10340a = this.f10296k0 - s0Var.f10365p;
                float f7 = this.f10310y.h().f2029a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e2.d.b(z10);
                p0Var.f10341b = f7;
                long j10 = this.f10285b0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                e2.d.b(z11);
                p0Var.f10342c = j10;
                q0 q0Var = new q0(p0Var);
                if (s0Var.f10362m != null) {
                    z12 = false;
                }
                e2.d.g(z12);
                r12.n(q0Var);
            }
        }
    }

    public final void F() {
        boolean z10;
        k0 k0Var = this.W;
        f1 f1Var = this.V;
        boolean z11 = k0Var.f10252c;
        if (((f1) k0Var.f10253f) != f1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        k0Var.f10252c = z12;
        k0Var.f10253f = f1Var;
        if (z12) {
            e0 e0Var = this.G.f10393b;
            e0Var.f10144j.c(new s1(19, e0Var, k0Var));
            this.W = new k0(this.V);
        }
    }

    public final void G(int i10) {
        m1 m1Var = this.f10282a[i10];
        try {
            s0 s0Var = this.H.f10381i;
            s0Var.getClass();
            f d = m1Var.d(s0Var);
            d.getClass();
            u2.d1 d1Var = d.f10178r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = m1Var.f10273a.f10174b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.v vVar = this.H.f10381i.f10364o;
            e2.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + b2.s.c(vVar.f44560c[i10].m()), e);
            x2.v vVar2 = new x2.v((l1[]) vVar.f44559b.clone(), (x2.r[]) vVar.f44560c.clone(), vVar.d, vVar.e);
            vVar2.f44559b[i10] = null;
            vVar2.f44560c[i10] = null;
            j(i10);
            s0 s0Var2 = this.H.f10381i;
            s0Var2.a(vVar2, this.V.f10202s, false, new boolean[s0Var2.f10359j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f10286c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.c(new f0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(j0 j0Var) {
        boolean z10;
        b2.k1 b10;
        this.W.f(1);
        int i10 = j0Var.f10239a;
        int i11 = j0Var.f10240b;
        int i12 = j0Var.f10241c;
        u2.i1 i1Var = j0Var.d;
        e1 e1Var = this.I;
        ArrayList arrayList = e1Var.f10165b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        e1Var.f10170j = i1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((d1) arrayList.get(min)).d;
            e2.d0.P(i10, i11, i12, arrayList);
            while (min <= max) {
                d1 d1Var = (d1) arrayList.get(min);
                d1Var.d = i13;
                i13 += d1Var.f10122a.f42276o.e.o();
                min++;
            }
            b10 = e1Var.b();
        } else {
            b10 = e1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        this.W.f(1);
        P(false, false, false, true);
        k kVar = this.f10290f;
        HashMap hashMap = kVar.h;
        long id2 = Thread.currentThread().getId();
        long j3 = kVar.f10249i;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        kVar.f10249i = id2;
        j2.k kVar2 = this.L;
        if (!hashMap.containsKey(kVar2)) {
            hashMap.put(kVar2, new Object());
        }
        j jVar = (j) hashMap.get(kVar2);
        jVar.getClass();
        int i11 = kVar.f10247f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        jVar.f10238b = i11;
        jVar.f10237a = false;
        if (this.V.f10187a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        n0(i10);
        f1 f1Var = this.V;
        boolean z11 = f1Var.f10195l;
        z0(this.P.d(f1Var.e, z11), f1Var.f10197n, f1Var.f10196m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        e1 e1Var = this.I;
        ArrayList arrayList = e1Var.f10165b;
        e2.d.g(!e1Var.f10171k);
        e1Var.f10172l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            d1 d1Var = (d1) arrayList.get(i12);
            e1Var.e(d1Var);
            e1Var.f10168g.add(d1Var);
        }
        e1Var.f10171k = true;
        this.f10298n.e(2);
    }

    public final void L(e2.g gVar) {
        j6.l lVar = this.f10303r;
        e2.z zVar = this.f10298n;
        try {
            P(true, false, true, false);
            M();
            k kVar = this.f10290f;
            if (kVar.h.remove(this.L) != null) {
                kVar.d();
            }
            if (kVar.h.isEmpty()) {
                kVar.f10249i = -1L;
            }
            e eVar = this.P;
            eVar.f10127c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            zVar.f7243a.removeCallbacksAndMessages(null);
            lVar.i();
            gVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f10282a.length; i10++) {
            f fVar = this.f10284b[i10];
            synchronized (fVar.f10173a) {
                fVar.H = null;
            }
            m1 m1Var = this.f10282a[i10];
            f fVar2 = m1Var.f10273a;
            boolean z11 = true;
            if (fVar2.f10177n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar2.r();
            m1Var.e = false;
            f fVar3 = m1Var.f10275c;
            if (fVar3 != null) {
                if (fVar3.f10177n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar3.r();
                m1Var.f10276f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        boolean z10 = true;
        this.W.f(1);
        e1 e1Var = this.I;
        e1Var.getClass();
        e2.d.b((i10 < 0 || i10 > i11 || i11 > e1Var.f10165b.size()) ? false : false);
        e1Var.f10170j = i1Var;
        e1Var.g(i10, i11);
        w(e1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        s0 s0Var = this.H.f10381i;
        if (s0Var != null && s0Var.f10357g.f10373i && this.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
    }

    public final void R(long j3) {
        u0 u0Var;
        long j10;
        m1[] m1VarArr;
        x2.r[] rVarArr;
        s0 s0Var = this.H.f10381i;
        if (s0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = s0Var.f10365p;
        }
        long j11 = j3 + j10;
        this.f10296k0 = j11;
        ((p1) this.f10310y.f180c).c(j11);
        for (m1 m1Var : this.f10282a) {
            long j12 = this.f10296k0;
            f d = m1Var.d(s0Var);
            if (d != null) {
                d.f10182y = false;
                d.f10180w = j12;
                d.f10181x = j12;
                d.q(j12, false);
            }
        }
        for (s0 s0Var2 = u0Var.f10381i; s0Var2 != null; s0Var2 = s0Var2.f10362m) {
            for (x2.r rVar : s0Var2.f10364o.f44560c) {
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
        m1[] m1VarArr;
        s0 s0Var;
        long j10;
        boolean z10 = this.S;
        long j11 = 1000;
        long j12 = f10281u0;
        if (z10) {
            this.R.getClass();
            if (this.V.e != 3) {
                j11 = j12;
            }
            for (m1 m1Var : this.f10282a) {
                long j13 = this.f10296k0;
                long j14 = this.f10297l0;
                f fVar = m1Var.f10275c;
                f fVar2 = m1Var.f10273a;
                if (m1.h(fVar2)) {
                    j10 = fVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (fVar != null && fVar.f10177n != 0) {
                    j10 = Math.min(j10, fVar.g(j13, j14));
                }
                j11 = Math.min(j11, e2.d0.e0(j10));
            }
            if (this.V.m()) {
                s0 s0Var2 = this.H.f10381i;
                if (s0Var2 != null) {
                    s0Var = s0Var2.f10362m;
                } else {
                    s0Var = null;
                }
                if (s0Var != null) {
                    if ((((float) e2.d0.Q(j11)) * this.V.f10198o.f2029a) + ((float) this.f10296k0) >= ((float) s0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.V.e != 3 || r0()) {
            j11 = j12;
        }
        this.f10298n.f7243a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.f10381i.f10357g.f10368a;
        long Y = Y(g0Var, this.V.f10202s, true, false);
        if (Y != this.V.f10202s) {
            f1 f1Var = this.V;
            this.V = z(g0Var, Y, f1Var.f10189c, f1Var.d, z10, 5);
        }
    }

    public final void X(i2.m0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.X(i2.m0, boolean):void");
    }

    public final long Y(u2.g0 g0Var, long j3, boolean z10, boolean z11) {
        m1[] m1VarArr;
        v0();
        C0(false, true);
        if (z11 || this.V.e == 3) {
            n0(2);
        }
        u0 u0Var = this.H;
        s0 s0Var = u0Var.f10381i;
        s0 s0Var2 = s0Var;
        while (s0Var2 != null && !g0Var.equals(s0Var2.f10357g.f10368a)) {
            s0Var2 = s0Var2.f10362m;
        }
        if (z10 || s0Var != s0Var2 || (s0Var2 != null && s0Var2.f10365p + j3 < 0)) {
            int i10 = 0;
            while (true) {
                m1VarArr = this.f10282a;
                if (i10 >= m1VarArr.length) {
                    break;
                }
                j(i10);
                i10++;
            }
            this.f10304r0 = -9223372036854775807L;
            if (s0Var2 != null) {
                while (u0Var.f10381i != s0Var2) {
                    u0Var.a();
                }
                u0Var.n(s0Var2);
                s0Var2.f10365p = 1000000000000L;
                m(u0Var.f10382j.e(), new boolean[m1VarArr.length]);
                s0Var2.h = true;
            }
        }
        i();
        if (s0Var2 != null) {
            ?? r10 = s0Var2.f10353a;
            u0Var.n(s0Var2);
            if (!s0Var2.e) {
                s0Var2.f10357g = s0Var2.f10357g.b(j3);
            } else if (s0Var2.f10356f) {
                j3 = r10.h(j3);
                r10.i(j3 - this.f10309x);
            }
            R(j3);
            D();
        } else {
            u0Var.b();
            R(j3);
        }
        v(false);
        this.f10298n.e(2);
        return j3;
    }

    public final void Z(i1 i1Var) {
        i1Var.getClass();
        Looper looper = i1Var.e;
        Looper looper2 = this.f10305s;
        e2.z zVar = this.f10298n;
        if (looper == looper2) {
            h(i1Var);
            int i10 = this.V.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            zVar.e(2);
            return;
        }
        zVar.a(15, i1Var).b();
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        if (this.T) {
            e2.z zVar = this.f10298n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7241a = zVar.f7243a.obtainMessage(37);
            b10.b();
        }
    }

    public final void a0(i1 i1Var) {
        Looper looper = i1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.n("TAG", "Trying to send message on a dead thread.");
            i1Var.a(false);
            return;
        }
        this.F.a(looper, null).c(new v1(this, i1Var));
    }

    @Override
    public final void b(u2.e0 e0Var) {
        this.f10298n.a(8, e0Var).b();
    }

    public final void b0(b2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.b0(b2.e, boolean):void");
    }

    public final void c(i0 i0Var, int i10) {
        this.W.f(1);
        e1 e1Var = this.I;
        if (i10 == -1) {
            i10 = e1Var.f10165b.size();
        }
        w(e1Var.a(i10, i0Var.f10230a, i0Var.f10231b), false);
    }

    public final void c0(boolean z10, e2.g gVar) {
        if (this.f10291f0 != z10) {
            this.f10291f0 = z10;
            if (!z10) {
                for (m1 m1Var : this.f10282a) {
                    m1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void d() {
        m1[] m1VarArr;
        n1 n1Var;
        for (m1 m1Var : this.f10282a) {
            if (this.S) {
                n1Var = this.R;
            } else {
                n1Var = null;
            }
            m1Var.f10273a.c(18, n1Var);
            f fVar = m1Var.f10275c;
            if (fVar != null) {
                fVar.c(18, n1Var);
            }
        }
    }

    public final void d0(i0 i0Var) {
        this.W.f(1);
        int i10 = i0Var.f10232c;
        u2.i1 i1Var = i0Var.f10231b;
        ArrayList arrayList = i0Var.f10230a;
        if (i10 != -1) {
            this.f10295j0 = new m0(new k1(arrayList, i1Var), i0Var.f10232c, i0Var.d);
        }
        e1 e1Var = this.I;
        ArrayList arrayList2 = e1Var.f10165b;
        e1Var.g(0, arrayList2.size());
        w(e1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final boolean e() {
        if (!this.O) {
            return false;
        }
        for (m1 m1Var : this.f10282a) {
            if (m1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        this.Y = z10;
        Q();
        if (this.Z) {
            u0 u0Var = this.H;
            if (u0Var.f10382j != u0Var.f10381i) {
                W(true);
                v(false);
            }
        }
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(b2.v0 v0Var) {
        this.f10298n.d(16);
        a3.q qVar = this.f10310y;
        qVar.f(v0Var);
        b2.v0 h = qVar.h();
        y(h, h.f2029a, true, true);
    }

    @Override
    public final void g(u2.f1 f1Var) {
        this.f10298n.a(9, (u2.e0) f1Var).b();
    }

    public final void g0(q qVar) {
        this.f10302q0 = qVar;
        b2.k1 k1Var = this.V.f10187a;
        u0 u0Var = this.H;
        u0Var.getClass();
        qVar.getClass();
        if (!u0Var.f10389q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < u0Var.f10389q.size(); i10++) {
                ((s0) u0Var.f10389q.get(i10)).i();
            }
            u0Var.f10389q = arrayList;
            u0Var.f10385m = null;
            u0Var.k();
        }
    }

    public final void h0(int i10) {
        this.f10288d0 = i10;
        b2.k1 k1Var = this.V.f10187a;
        u0 u0Var = this.H;
        u0Var.f10380g = i10;
        int r10 = u0Var.r(k1Var);
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
        s0 s0Var;
        u2.g0 g0Var;
        s0 s0Var2;
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
                    z0(this.P.d(this.V.e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    X((m0) message.obj, true);
                    break;
                case 4:
                    f0((b2.v0) message.obj);
                    break;
                case 5:
                    k0((o1) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    L((e2.g) message.obj);
                    return true;
                case 8:
                    x((u2.e0) message.obj);
                    break;
                case 9:
                    t((u2.e0) message.obj);
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
                    Z((i1) message.obj);
                    break;
                case 15:
                    a0((i1) message.obj);
                    break;
                case 16:
                    b2.v0 v0Var = (b2.v0) message.obj;
                    y(v0Var, v0Var.f2029a, true, false);
                    break;
                case 17:
                    d0((i0) message.obj);
                    break;
                case 18:
                    c((i0) message.obj, message.arg1);
                    break;
                case 19:
                    J((j0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (u2.i1) message.obj);
                    break;
                case 21:
                    m0((u2.i1) message.obj);
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
                    f();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((q) message.obj);
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
                    o0((a3.y) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.T = false;
                    m0 m0Var = this.U;
                    if (m0Var != null) {
                        X(m0Var, false);
                        this.U = null;
                        break;
                    }
                    break;
                case 38:
                    j0((n1) message.obj);
                    break;
            }
        } catch (b2.s0 e) {
            boolean z15 = e.f2010a;
            int i13 = e.f2011b;
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
            u(e, i11);
        } catch (g2.j e7) {
            u(e7, e7.f8498a);
        } catch (n e10) {
            e = e10;
            int i14 = e.f10277s;
            u0 u0Var = this.H;
            if (i14 == 1 && (s0Var2 = u0Var.f10382j) != null && e.E == null) {
                e = e.a(s0Var2.f10357g.f10368a);
            }
            int i15 = e.f10277s;
            e2.z zVar = this.f10298n;
            if (i15 == 1 && (g0Var = e.E) != null && B(e.f10278w, g0Var)) {
                this.f10306s0 = true;
                i();
                s0 g10 = u0Var.g();
                s0 s0Var3 = u0Var.f10381i;
                if (s0Var3 != g10) {
                    while (s0Var3 != null) {
                        s0 s0Var4 = s0Var3.f10362m;
                        if (s0Var4 == g10) {
                            break;
                        }
                        s0Var3 = s0Var4;
                    }
                }
                u0Var.n(s0Var3);
                if (this.V.e != 4) {
                    D();
                    zVar.e(2);
                }
            } else {
                n nVar = this.f10300o0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f10300o0;
                }
                if (e.f10277s == 1 && u0Var.f10381i != u0Var.f10382j) {
                    while (true) {
                        s0Var = u0Var.f10381i;
                        if (s0Var == u0Var.f10382j) {
                            break;
                        }
                        u0Var.a();
                    }
                    e2.d.d(s0Var);
                    F();
                    t0 t0Var = s0Var.f10357g;
                    u2.g0 g0Var2 = t0Var.f10368a;
                    long j3 = t0Var.f10369b;
                    this.V = z(g0Var2, j3, t0Var.f10370c, j3, true, 0);
                }
                if (e.F && (this.f10300o0 == null || (i10 = e.f2025a) == 5004 || i10 == 5003)) {
                    e2.a.o("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f10300o0 == null) {
                        this.f10300o0 = e;
                    }
                    e2.y a2 = zVar.a(25, e);
                    Handler handler = zVar.f7243a;
                    Message message2 = a2.f7241a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    a2.a();
                } else {
                    e2.a.f("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.V = this.V.f(e);
                }
            }
        } catch (IOException e11) {
            u(e11, 2000);
        } catch (RuntimeException e12) {
            n nVar2 = new n(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.f("ExoPlayerImplInternal", "Playback error", nVar2);
            u0(true, false);
            this.V = this.V.f(nVar2);
        } catch (n2.f e13) {
            u(e13, e13.f13728a);
        } catch (u2.b e14) {
            u(e14, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        m1[] m1VarArr;
        boolean z10;
        f fVar;
        if (this.O && e()) {
            for (m1 m1Var : this.f10282a) {
                int c10 = m1Var.c();
                if (m1Var.f()) {
                    int i10 = m1Var.d;
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
                        fVar = m1Var.f10273a;
                    } else {
                        fVar = m1Var.f10275c;
                        fVar.getClass();
                    }
                    m1Var.a(fVar, this.f10310y);
                    m1Var.i(z10);
                    m1Var.d = i11;
                }
                this.f10294i0 -= c10 - m1Var.c();
            }
            this.f10304r0 = -9223372036854775807L;
        }
    }

    public final void i0(boolean z10) {
        if (!z10) {
            this.T = false;
            this.f10298n.d(37);
            m0 m0Var = this.U;
            if (m0Var != null) {
                X(m0Var, false);
                this.U = null;
            }
        }
        this.S = z10;
        d();
    }

    public final void j(int i10) {
        boolean z10;
        m1[] m1VarArr = this.f10282a;
        int c10 = m1VarArr[i10].c();
        m1 m1Var = m1VarArr[i10];
        f fVar = m1Var.f10273a;
        a3.q qVar = this.f10310y;
        m1Var.a(fVar, qVar);
        f fVar2 = m1Var.f10275c;
        if (fVar2 != null) {
            if (fVar2.f10177n != 0 && m1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            m1Var.a(fVar2, qVar);
            m1Var.i(false);
            if (z10) {
                f fVar3 = m1Var.f10273a;
                fVar2.getClass();
                fVar2.c(17, fVar3);
            }
        }
        m1Var.d = 0;
        H(i10, false);
        this.f10294i0 -= c10;
    }

    public final void j0(n1 n1Var) {
        this.R = n1Var;
        d();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.k():void");
    }

    public final void k0(o1 o1Var) {
        this.Q = o1Var;
    }

    public final void l(s0 s0Var, int i10, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        m1 m1Var = this.f10282a[i10];
        boolean g10 = m1Var.g();
        f fVar = m1Var.f10273a;
        if (!g10) {
            if (s0Var == this.H.f10381i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.v vVar = s0Var.f10364o;
            l1 l1Var = vVar.f44559b[i10];
            x2.r rVar = vVar.f44560c[i10];
            if (r0() && this.V.e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f10294i0++;
            u2.d1 d1Var = s0Var.f10355c[i10];
            long j10 = s0Var.f10365p;
            u2.g0 g0Var = s0Var.f10357g.f10368a;
            f fVar2 = m1Var.f10275c;
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
            int i13 = m1Var.d;
            a3.q qVar = this.f10310y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                m1Var.f10276f = true;
                fVar2.getClass();
                if (fVar2.f10177n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                e2.d.g(z15);
                fVar2.d = l1Var;
                fVar2.G = g0Var;
                fVar2.f10177n = 1;
                fVar2.p(z13, z11);
                fVar2.y(sVarArr, d1Var, j3, j10, g0Var);
                fVar2.f10182y = false;
                fVar2.f10180w = j3;
                fVar2.f10181x = j3;
                fVar2.q(j3, z13);
                qVar.c(fVar2);
            } else {
                m1Var.e = true;
                if (fVar.f10177n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                e2.d.g(z14);
                fVar.d = l1Var;
                fVar.G = g0Var;
                fVar.f10177n = 1;
                fVar.p(z13, z11);
                fVar.y(sVarArr, d1Var, j3, j10, g0Var);
                fVar.f10182y = false;
                fVar.f10180w = j3;
                fVar.f10181x = j3;
                fVar.q(j3, z13);
                qVar.c(fVar);
            }
            h0 h0Var = new h0(this);
            f d = m1Var.d(s0Var);
            d.getClass();
            d.c(11, h0Var);
            if (z12 && z11) {
                m1Var.m();
            }
        }
    }

    public final void l0(boolean z10) {
        this.f10289e0 = z10;
        b2.k1 k1Var = this.V.f10187a;
        u0 u0Var = this.H;
        u0Var.h = z10;
        int r10 = u0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final void m(long j3, boolean[] zArr) {
        m1[] m1VarArr;
        long j10;
        s0 s0Var = this.H.f10382j;
        x2.v vVar = s0Var.f10364o;
        int i10 = 0;
        while (true) {
            m1VarArr = this.f10282a;
            if (i10 >= m1VarArr.length) {
                break;
            }
            if (!vVar.b(i10)) {
                m1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < m1VarArr.length) {
            if (!vVar.b(i11) || m1VarArr[i11].d(s0Var) != null) {
                j10 = j3;
            } else {
                j10 = j3;
                l(s0Var, i11, zArr[i11], j10);
            }
            i11++;
            j3 = j10;
        }
    }

    public final void m0(u2.i1 i1Var) {
        this.W.f(1);
        e1 e1Var = this.I;
        int size = e1Var.f10165b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.h().e(0, size);
        }
        e1Var.f10170j = i1Var;
        w(e1Var.b(), false);
    }

    public final long n(b2.k1 k1Var, Object obj, long j3) {
        b2.h1 h1Var = this.f10308w;
        int i10 = k1Var.g(obj, h1Var).f1707c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        if (j1Var.f1754f == -9223372036854775807L || !j1Var.a() || !j1Var.f1756i) {
            return -9223372036854775807L;
        }
        return e2.d0.Q(e2.d0.A(j1Var.f1755g) - j1Var.f1754f) - (j3 + h1Var.e);
    }

    public final void n0(int i10) {
        f1 f1Var = this.V;
        if (f1Var.e != i10) {
            if (i10 != 2) {
                this.f10301p0 = -9223372036854775807L;
            }
            if (i10 != 3 && f1Var.f10199p) {
                this.V = f1Var.i(false);
            }
            this.V = this.V.h(i10);
        }
    }

    public final long o(s0 s0Var) {
        if (s0Var == null) {
            return 0L;
        }
        long j3 = s0Var.f10365p;
        if (!s0Var.e) {
            return j3;
        }
        int i10 = 0;
        while (true) {
            m1[] m1VarArr = this.f10282a;
            if (i10 < m1VarArr.length) {
                if (m1VarArr[i10].d(s0Var) != null) {
                    f d = m1VarArr[i10].d(s0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f10181x;
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

    public final void o0(a3.y yVar) {
        m1[] m1VarArr;
        for (m1 m1Var : this.f10282a) {
            f fVar = m1Var.f10273a;
            if (fVar.f10174b == 2) {
                fVar.c(7, yVar);
                f fVar2 = m1Var.f10275c;
                if (fVar2 != null) {
                    fVar2.c(7, yVar);
                }
            }
        }
    }

    public final Pair p(b2.k1 k1Var) {
        long j3 = 0;
        if (k1Var.p()) {
            return Pair.create(f1.f10186u, 0L);
        }
        int a2 = k1Var.a(this.f10289e0);
        Pair i10 = k1Var.i(this.v, this.f10308w, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(k1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f42324a;
            b2.h1 h1Var = this.f10308w;
            k1Var.g(obj, h1Var);
            if (p5.f42326c == h1Var.e(p5.f42325b)) {
                h1Var.f1709g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j3));
    }

    public final void p0(Object obj, e2.g gVar) {
        m1[] m1VarArr;
        for (m1 m1Var : this.f10282a) {
            f fVar = m1Var.f10273a;
            if (fVar.f10174b == 2) {
                int i10 = m1Var.d;
                if (i10 != 4 && i10 != 1) {
                    fVar.c(1, obj);
                } else {
                    f fVar2 = m1Var.f10275c;
                    fVar2.getClass();
                    fVar2.c(1, obj);
                }
            }
        }
        int i11 = this.V.e;
        if (i11 == 3 || i11 == 2) {
            this.f10298n.e(2);
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final long q(long j3) {
        s0 s0Var = this.H.f10384l;
        if (s0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f10296k0 - s0Var.f10365p));
    }

    public final void q0(float f7) {
        m1[] m1VarArr;
        this.f10307t0 = f7;
        float f10 = f7 * this.P.f10129g;
        for (m1 m1Var : this.f10282a) {
            f fVar = m1Var.f10273a;
            if (fVar.f10174b == 1) {
                fVar.c(2, Float.valueOf(f10));
                f fVar2 = m1Var.f10275c;
                if (fVar2 != null) {
                    fVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void r(int i10) {
        f1 f1Var = this.V;
        z0(i10, f1Var.f10197n, f1Var.f10196m, f1Var.f10195l);
    }

    public final boolean r0() {
        f1 f1Var = this.V;
        if (f1Var.f10195l && f1Var.f10197n == 0) {
            return true;
        }
        return false;
    }

    public final void s() {
        q0(this.f10307t0);
    }

    public final boolean s0(b2.k1 k1Var, u2.g0 g0Var) {
        if (!g0Var.b() && !k1Var.p()) {
            int i10 = k1Var.g(g0Var.f42324a, this.f10308w).f1707c;
            b2.j1 j1Var = this.v;
            k1Var.n(i10, j1Var);
            if (j1Var.a() && j1Var.f1756i && j1Var.f1754f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(u2.e0 e0Var) {
        u0 u0Var = this.H;
        s0 s0Var = u0Var.f10384l;
        if (s0Var != null && s0Var.f10353a == e0Var) {
            u0Var.m(this.f10296k0);
            D();
            return;
        }
        s0 s0Var2 = u0Var.f10385m;
        if (s0Var2 != null && s0Var2.f10353a == e0Var) {
            E();
        }
    }

    public final void t0() {
        s0 s0Var = this.H.f10381i;
        if (s0Var != null) {
            x2.v vVar = s0Var.f10364o;
            int i10 = 0;
            while (true) {
                m1[] m1VarArr = this.f10282a;
                if (i10 < m1VarArr.length) {
                    if (vVar.b(i10)) {
                        m1VarArr[i10].m();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        s0 s0Var = this.H.f10381i;
        if (s0Var != null) {
            nVar = nVar.a(s0Var.f10357g.f10368a);
        }
        e2.a.f("ExoPlayerImplInternal", "Playback error", nVar);
        u0(false, false);
        this.V = this.V.f(nVar);
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f10291f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.W.f(z11 ? 1 : 0);
        k kVar = this.f10290f;
        if (kVar.h.remove(this.L) != null) {
            kVar.d();
        }
        this.P.d(1, this.V.f10195l);
        n0(1);
    }

    public final void v(boolean z10) {
        u2.g0 g0Var;
        long d;
        s0 s0Var = this.H.f10384l;
        if (s0Var == null) {
            g0Var = this.V.f10188b;
        } else {
            g0Var = s0Var.f10357g.f10368a;
        }
        boolean equals = this.V.f10194k.equals(g0Var);
        if (!equals) {
            this.V = this.V.c(g0Var);
        }
        f1 f1Var = this.V;
        if (s0Var == null) {
            d = f1Var.f10202s;
        } else {
            d = s0Var.d();
        }
        f1Var.f10200q = d;
        f1 f1Var2 = this.V;
        f1Var2.f10201r = q(f1Var2.f10200q);
        if ((!equals || z10) && s0Var != null && s0Var.e) {
            x0(s0Var.f10364o);
        }
    }

    public final void v0() {
        m1[] m1VarArr;
        a3.q qVar = this.f10310y;
        qVar.f179b = false;
        p1 p1Var = (p1) qVar.f180c;
        if (p1Var.f10345c) {
            p1Var.c(p1Var.a());
            p1Var.f10345c = false;
        }
        for (m1 m1Var : this.f10282a) {
            f fVar = m1Var.f10275c;
            f fVar2 = m1Var.f10273a;
            if (m1.h(fVar2)) {
                m1.b(fVar2);
            }
            if (fVar != null && fVar.f10177n != 0) {
                m1.b(fVar);
            }
        }
    }

    public final void w(b2.k1 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: i2.n0.w(b2.k1, boolean):void");
    }

    public final void w0() {
        boolean z10;
        s0 s0Var = this.H.f10384l;
        if (!this.f10287c0 && (s0Var == null || !s0Var.f10353a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        f1 f1Var = this.V;
        if (z10 != f1Var.f10191g) {
            this.V = f1Var.b(z10);
        }
    }

    public final void x(u2.e0 e0Var) {
        s0 s0Var;
        u0 u0Var = this.H;
        s0 s0Var2 = u0Var.f10384l;
        a3.q qVar = this.f10310y;
        if (s0Var2 != null && s0Var2.f10353a == e0Var) {
            s0Var2.getClass();
            if (!s0Var2.e) {
                float f7 = qVar.h().f2029a;
                f1 f1Var = this.V;
                s0Var2.f(f7, f1Var.f10187a, f1Var.f10195l);
            }
            x0(s0Var2.f10364o);
            if (s0Var2 == u0Var.f10381i) {
                R(s0Var2.f10357g.f10369b);
                m(u0Var.f10382j.e(), new boolean[this.f10282a.length]);
                s0Var2.h = true;
                f1 f1Var2 = this.V;
                u2.g0 g0Var = f1Var2.f10188b;
                long j3 = s0Var2.f10357g.f10369b;
                this.V = z(g0Var, j3, f1Var2.f10189c, j3, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < u0Var.f10389q.size()) {
                s0Var = (s0) u0Var.f10389q.get(i10);
                if (s0Var.f10353a == e0Var) {
                    break;
                }
                i10++;
            } else {
                s0Var = null;
                break;
            }
        }
        if (s0Var != null) {
            e2.d.g(true ^ s0Var.e);
            float f10 = qVar.h().f2029a;
            f1 f1Var3 = this.V;
            s0Var.f(f10, f1Var3.f10187a, f1Var3.f10195l);
            s0 s0Var3 = u0Var.f10385m;
            if (s0Var3 != null && s0Var3.f10353a == e0Var) {
                E();
            }
        }
    }

    public final void x0(x2.v vVar) {
        s0 s0Var = this.H.f10384l;
        s0Var.getClass();
        q(s0Var.d());
        if (s0(this.V.f10187a, s0Var.f10357g.f10368a)) {
            long j3 = this.J.h;
        }
        b2.k1 k1Var = this.V.f10187a;
        float f7 = this.f10310y.h().f2029a;
        boolean z10 = this.V.f10195l;
        x2.r[] rVarArr = vVar.f44560c;
        k kVar = this.f10290f;
        j jVar = (j) kVar.h.get(this.L);
        jVar.getClass();
        int i10 = kVar.f10247f;
        if (i10 == -1) {
            int length = rVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    x2.r rVar = rVarArr[i11];
                    if (rVar != null) {
                        switch (rVar.b().f1786c) {
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
        jVar.f10238b = i10;
        kVar.d();
    }

    public final void y(b2.v0 v0Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.W.f(1);
            }
            this.V = this.V.g(v0Var);
        }
        float f10 = v0Var.f2029a;
        s0 s0Var = this.H.f10381i;
        while (true) {
            i10 = 0;
            if (s0Var == null) {
                break;
            }
            x2.r[] rVarArr = s0Var.f10364o.f44560c;
            int length = rVarArr.length;
            while (i10 < length) {
                x2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f10);
                }
                i10++;
            }
            s0Var = s0Var.f10362m;
        }
        m1[] m1VarArr = this.f10282a;
        int length2 = m1VarArr.length;
        while (i10 < length2) {
            m1 m1Var = m1VarArr[i10];
            float f11 = v0Var.f2029a;
            m1Var.f10273a.z(f7, f11);
            f fVar = m1Var.f10275c;
            if (fVar != null) {
                fVar.z(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.W.f(1);
        e1 e1Var = this.I;
        e1Var.getClass();
        ArrayList arrayList = e1Var.f10165b;
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
            ((d1) arrayList.get(i12)).f10122a.t((b2.k0) list.get(i12 - i10));
        }
        w(e1Var.b(), false);
    }

    public final f1 z(u2.g0 g0Var, long j3, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        e9.a1 a1Var;
        boolean z13;
        boolean z14;
        if (!this.f10299n0 && j3 == this.V.f10202s && g0Var.equals(this.V.f10188b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f10299n0 = z11;
        Q();
        f1 f1Var = this.V;
        q1 q1Var = f1Var.h;
        x2.v vVar = f1Var.f10192i;
        List list = f1Var.f10193j;
        if (this.I.f10171k) {
            s0 s0Var = this.H.f10381i;
            if (s0Var == null) {
                q1Var = q1.d;
            } else {
                q1Var = s0Var.f10363n;
            }
            if (s0Var == null) {
                vVar = this.e;
            } else {
                vVar = s0Var.f10364o;
            }
            x2.r[] rVarArr = vVar.f44560c;
            ?? wVar = new com.google.android.gms.common.api.internal.w(4);
            boolean z15 = false;
            for (x2.r rVar : rVarArr) {
                if (rVar != null) {
                    b2.p0 p0Var = rVar.f(0).f1996l;
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
                e9.g0 g0Var2 = e9.i0.f7384b;
                a1Var = e9.a1.e;
            }
            list = a1Var;
            if (s0Var != null) {
                t0 t0Var = s0Var.f10357g;
                if (t0Var.f10370c != j10) {
                    s0Var.f10357g = t0Var.a(j10);
                }
            }
            m1[] m1VarArr = this.f10282a;
            u0 u0Var = this.H;
            s0 s0Var2 = u0Var.f10381i;
            if (s0Var2 == u0Var.f10382j && s0Var2 != null) {
                x2.v vVar2 = s0Var2.f10364o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < m1VarArr.length) {
                        if (vVar2.b(i11)) {
                            if (m1VarArr[i11].f10273a.f10174b != 1) {
                                z13 = false;
                                break;
                            } else if (vVar2.f44559b[i11].f10268a != 0) {
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
                if (z14 != this.f10293h0) {
                    this.f10293h0 = z14;
                    if (!z14 && this.V.f10199p) {
                        this.f10298n.e(2);
                    }
                }
            }
        } else if (!g0Var.equals(f1Var.f10188b)) {
            q1Var = q1.d;
            vVar = this.e;
            list = e9.a1.e;
        }
        q1 q1Var2 = q1Var;
        x2.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            k0 k0Var = this.W;
            if (k0Var.d && k0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
            } else {
                k0Var.f10252c = true;
                k0Var.d = true;
                k0Var.e = i10;
            }
        }
        f1 f1Var2 = this.V;
        return f1Var2.d(g0Var, j3, j10, j11, q(f1Var2.f10200q), q1Var2, vVar3, list2);
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
        f1 f1Var = this.V;
        if (f1Var.f10195l != z11 || f1Var.f10197n != i11 || f1Var.f10196m != i12) {
            this.V = f1Var.e(i12, i11, z11);
            C0(false, false);
            u0 u0Var = this.H;
            for (s0 s0Var = u0Var.f10381i; s0Var != null; s0Var = s0Var.f10362m) {
                for (x2.r rVar : s0Var.f10364o.f44560c) {
                    if (rVar != null) {
                        rVar.e(z11);
                    }
                }
            }
            if (!r0()) {
                v0();
                A0();
                f1 f1Var2 = this.V;
                if (f1Var2.f10199p) {
                    this.V = f1Var2.i(false);
                }
                u0Var.m(this.f10296k0);
                return;
            }
            int i13 = this.V.e;
            e2.z zVar = this.f10298n;
            if (i13 == 3) {
                a3.q qVar = this.f10310y;
                qVar.f179b = true;
                ((p1) qVar.f180c).d();
                t0();
                zVar.e(2);
            } else if (i13 == 2) {
                zVar.e(2);
            }
        }
    }
}
