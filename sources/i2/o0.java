package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import ei.d5;
import gg.x1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class o0 implements Handler.Callback, u2.c0, h1, a3.y {
    public static final long f10802u0 = e2.d0.e0(10000);
    public final ArrayList E;
    public final e2.x F;
    public final w G;
    public final v0 H;
    public final f1 I;
    public final i J;
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
    public final n1[] f10803a;
    public boolean f10804a0;
    public final f[] f10805b;
    public long f10806b0;
    public final boolean[] f10807c;
    public boolean f10808c0;
    public final x2.u d;
    public int f10809d0;
    public final x2.v e;
    public boolean f10810e0;
    public final k f10811f;
    public boolean f10812f0;
    public boolean f10813g0;
    public final y2.c h;
    public boolean f10814h0;
    public int f10815i0;
    public n0 f10816j0;
    public long f10817k0;
    public long f10818l0;
    public int m0;
    public final e2.z f10819n;
    public boolean f10820n0;
    public n f10821o0;
    public long f10822p0;
    public q f10823q0;
    public final j6.l f10824r;
    public long f10825r0;
    public final Looper f10826s;
    public boolean f10827s0;
    public float f10828t0;
    public final b2.j1 v;
    public final b2.h1 f10829w;
    public final long f10830x;
    public final a3.q f10831y;

    public o0(Context context, f[] fVarArr, f[] fVarArr2, x2.u uVar, x2.v vVar, k kVar, y2.c cVar, int i10, boolean z10, j2.f fVar, p1 p1Var, i iVar, long j3, Looper looper, e2.x xVar, w wVar, j2.k kVar2, final a3.y yVar) {
        q qVar = q.f10859a;
        this.f10825r0 = -9223372036854775807L;
        this.G = wVar;
        this.d = uVar;
        this.e = vVar;
        this.f10811f = kVar;
        this.h = cVar;
        this.f10809d0 = i10;
        this.f10810e0 = z10;
        this.Q = p1Var;
        this.J = iVar;
        this.K = j3;
        this.Y = false;
        this.F = xVar;
        this.L = kVar2;
        this.f10823q0 = qVar;
        this.M = fVar;
        this.f10828t0 = 1.0f;
        this.R = o1.f10832b;
        this.f10822p0 = -9223372036854775807L;
        this.f10806b0 = -9223372036854775807L;
        this.f10830x = kVar.f10762g;
        b2.g1 g1Var = b2.k1.f3076a;
        g1 k10 = g1.k(vVar);
        this.V = k10;
        this.W = new l0(k10);
        this.f10805b = new f[fVarArr.length];
        this.f10807c = new boolean[fVarArr.length];
        x2.p pVar = (x2.p) uVar;
        pVar.getClass();
        this.f10803a = new n1[fVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar2 = fVarArr[i11];
            fVar2.e = i11;
            fVar2.f10684f = kVar2;
            fVar2.h = xVar;
            this.f10805b[i11] = fVar2;
            f fVar3 = this.f10805b[i11];
            synchronized (fVar3.f10681a) {
                fVar3.H = pVar;
            }
            f fVar4 = fVarArr2[i11];
            if (fVar4 != null) {
                fVar4.e = i11;
                fVar4.f10684f = kVar2;
                fVar4.h = xVar;
                z11 = true;
            }
            this.f10803a[i11] = new n1(fVarArr[i11], fVar4, i11);
        }
        this.O = z11;
        this.f10831y = new a3.q(this, xVar);
        this.E = new ArrayList();
        this.v = new b2.j1();
        this.f10829w = new b2.h1();
        e2.d.g(uVar.f45215a == null);
        uVar.f45215a = this;
        uVar.f45216b = cVar;
        this.f10820n0 = true;
        e2.z a2 = xVar.a(looper, null);
        this.N = a2;
        this.H = new v0(fVar, a2, new d5(this, 13));
        this.I = new f1(this, fVar, a2, kVar2);
        j6.l lVar = new j6.l(8);
        this.f10824r = lVar;
        Looper g10 = lVar.g();
        this.f10826s = g10;
        e2.z a10 = xVar.a(g10, this);
        this.f10819n = a10;
        this.P = new e(context, g10, this);
        a10.a(35, new a3.y() {
            @Override
            public final void b(long j10, long j11, b2.s sVar, MediaFormat mediaFormat) {
                o0 o0Var = o0.this;
                o0Var.getClass();
                yVar.b(j10, j11, sVar, mediaFormat);
                o0Var.b(j10, j11, sVar, mediaFormat);
            }
        }).b();
    }

    public static boolean A(t0 t0Var) {
        u2.b1[] b1VarArr;
        long d;
        if (t0Var != null) {
            try {
                ?? r12 = t0Var.f10874a;
                if (!t0Var.e) {
                    r12.g();
                } else {
                    for (u2.b1 b1Var : t0Var.f10876c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                }
                if (!t0Var.e) {
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
        b2.k1 k1Var3 = n0Var.f10793a;
        if (!k1Var.p()) {
            if (k1Var3.p()) {
                k1Var2 = k1Var;
            } else {
                k1Var2 = k1Var3;
            }
            try {
                Pair i11 = k1Var2.i(j1Var, h1Var, n0Var.f10794b, n0Var.f10795c);
                if (!k1Var.equals(k1Var2)) {
                    if (k1Var.b(i11.first) != -1) {
                        if (k1Var2.g(i11.first, h1Var).f3010f && k1Var2.m(h1Var.f3009c, j1Var, 0L).f3063n == k1Var2.b(i11.first)) {
                            return k1Var.i(j1Var, h1Var, k1Var.g(i11.first, h1Var).f3009c, n0Var.f10795c);
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
        Object obj2 = k1Var3.m(k1Var3.g(obj, h1Var).f3009c, j1Var, 0L).f3053a;
        for (int i11 = 0; i11 < k1Var2.o(); i11++) {
            if (k1Var2.m(i11, j1Var, 0L).f3053a.equals(obj2)) {
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
        return k1Var2.f(i13, h1Var, false).f3009c;
    }

    public static void g(j1 j1Var) {
        try {
            synchronized (j1Var) {
                synchronized (j1Var) {
                }
                j1Var.f10754a.c(j1Var.f10756c, j1Var.d);
                return;
            }
            j1Var.f10754a.c(j1Var.f10756c, j1Var.d);
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
        t0 t0Var = v0Var.f10904k;
        if (t0Var != null && t0Var.f10878g.f10888a.equals(f0Var)) {
            n1 n1Var = this.f10803a[i10];
            t0 t0Var2 = v0Var.f10904k;
            int i11 = n1Var.d;
            if ((i11 == 2 || i11 == 4) && n1Var.d(t0Var2) == n1Var.f10796a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (n1Var.d == 3 && n1Var.d(t0Var2) == n1Var.f10798c) {
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
        Object obj2 = f0Var.f43357a;
        if (!s02) {
            if (f0Var.b()) {
                v0Var = b2.v0.d;
            } else {
                v0Var = this.V.f10726o;
            }
            a3.q qVar = this.f10831y;
            if (!qVar.h().equals(v0Var)) {
                this.f10819n.d(16);
                qVar.f(v0Var);
                y(this.V.f10726o, v0Var.f3331a, false, false);
                return;
            }
            return;
        }
        b2.h1 h1Var = this.f10829w;
        int i10 = k1Var.g(obj2, h1Var).f3009c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        b2.e0 e0Var = j1Var.f3059j;
        i iVar = this.J;
        iVar.getClass();
        iVar.f10739c = e2.d0.Q(e0Var.f2973a);
        iVar.f10740f = e2.d0.Q(e0Var.f2974b);
        iVar.f10741g = e2.d0.Q(e0Var.f2975c);
        float f7 = e0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        iVar.f10743j = f7;
        float f10 = e0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.f10742i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            iVar.f10739c = -9223372036854775807L;
        }
        iVar.a();
        if (j3 != -9223372036854775807L) {
            iVar.d = m(k1Var, obj2, j3);
            iVar.a();
            return;
        }
        Object obj3 = j1Var.f3053a;
        if (!k1Var2.p()) {
            obj = k1Var2.m(k1Var2.g(f0Var2.f43357a, h1Var).f3009c, j1Var, 0L).f3053a;
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
        t0 t0Var = this.H.f10902i;
        long j3 = t0Var.f10878g.e;
        if (t0Var.e) {
            if (j3 == -9223372036854775807L || this.V.f10730s < j3 || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0(boolean z10, boolean z11) {
        long j3;
        this.f10804a0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f10806b0 = j3;
    }

    public final void D() {
        long d;
        long j3;
        boolean c10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f10905l)) {
            c10 = false;
        } else {
            t0 t0Var = this.H.f10905l;
            if (!t0Var.e) {
                d = 0;
            } else {
                d = t0Var.f10874a.d();
            }
            long p5 = p(d);
            t0 t0Var2 = this.H.f10902i;
            if (s0(this.V.f10715a, t0Var.f10878g.f10888a)) {
                j3 = this.J.h;
            } else {
                j3 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.k1 k1Var = this.V.f10715a;
            float f7 = this.f10831y.h().f3331a;
            boolean z13 = this.V.f10723l;
            p0 p0Var = new p0(kVar, p5, f7, this.f10804a0, j3);
            c10 = this.f10811f.c(p0Var);
            t0 t0Var3 = this.H.f10902i;
            if (!c10 && t0Var3.e && p5 < 500000 && this.f10830x > 0) {
                t0Var3.f10874a.i(this.V.f10730s);
                c10 = this.f10811f.c(p0Var);
            }
        }
        this.f10808c0 = c10;
        if (c10) {
            t0 t0Var4 = this.H.f10905l;
            t0Var4.getClass();
            q0 q0Var = new q0();
            q0Var.f10860a = this.f10817k0 - t0Var4.f10886p;
            float f10 = this.f10831y.h().f3331a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            e2.d.b(z10);
            q0Var.f10861b = f10;
            long j10 = this.f10806b0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            q0Var.f10862c = j10;
            r0 r0Var = new r0(q0Var);
            if (t0Var4.f10883m == null) {
                z12 = true;
            }
            e2.d.g(z12);
            t0Var4.f10874a.m(r0Var);
        }
        w0();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        v0 v0Var = this.H;
        v0Var.k();
        t0 t0Var = v0Var.f10906m;
        if (t0Var != null) {
            ?? r12 = t0Var.f10874a;
            if ((!t0Var.d || t0Var.e) && !r12.c()) {
                b2.k1 k1Var = this.V.f10715a;
                if (t0Var.e) {
                    r12.s();
                }
                for (j jVar : this.f10811f.h.values()) {
                    if (jVar.f10749a) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!t0Var.d) {
                    long j3 = t0Var.f10878g.f10889b;
                    t0Var.d = true;
                    r12.k(this, j3);
                    return;
                }
                q0 q0Var = new q0();
                q0Var.f10860a = this.f10817k0 - t0Var.f10886p;
                float f7 = this.f10831y.h().f3331a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e2.d.b(z10);
                q0Var.f10861b = f7;
                long j10 = this.f10806b0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                e2.d.b(z11);
                q0Var.f10862c = j10;
                r0 r0Var = new r0(q0Var);
                if (t0Var.f10883m != null) {
                    z12 = false;
                }
                e2.d.g(z12);
                r12.m(r0Var);
            }
        }
    }

    public final void F() {
        boolean z10;
        l0 l0Var = this.W;
        g1 g1Var = this.V;
        boolean z11 = l0Var.f10774c;
        if (((g1) l0Var.f10775f) != g1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        l0Var.f10774c = z12;
        l0Var.f10775f = g1Var;
        if (z12) {
            e0 e0Var = this.G.f10912b;
            e0Var.f10658j.c(new x1(9, e0Var, l0Var));
            this.W = new l0(this.V);
        }
    }

    public final void G(int i10) {
        n1 n1Var = this.f10803a[i10];
        try {
            t0 t0Var = this.H.f10902i;
            t0Var.getClass();
            f d = n1Var.d(t0Var);
            d.getClass();
            u2.b1 b1Var = d.f10686r;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = n1Var.f10796a.f10682b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.v vVar = this.H.f10902i.f10885o;
            e2.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + b2.s.c(vVar.f45220c[i10].m()), e);
            x2.v vVar2 = new x2.v((m1[]) vVar.f45219b.clone(), (x2.r[]) vVar.f45220c.clone(), vVar.d, vVar.e);
            vVar2.f45219b[i10] = null;
            vVar2.f45220c[i10] = null;
            i(i10);
            t0 t0Var2 = this.H.f10902i;
            t0Var2.a(vVar2, this.V.f10730s, false, new boolean[t0Var2.f10880j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f10807c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.c(new f0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(k0 k0Var) {
        boolean z10;
        b2.k1 b10;
        this.W.f(1);
        int i10 = k0Var.f10764a;
        int i11 = k0Var.f10765b;
        int i12 = k0Var.f10766c;
        u2.g1 g1Var = k0Var.d;
        f1 f1Var = this.I;
        ArrayList arrayList = f1Var.f10695b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        f1Var.f10700j = g1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((e1) arrayList.get(min)).d;
            e2.d0.P(i10, i11, i12, arrayList);
            while (min <= max) {
                e1 e1Var = (e1) arrayList.get(min);
                e1Var.d = i13;
                i13 += e1Var.f10678a.f43307o.e.o();
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
        k kVar = this.f10811f;
        HashMap hashMap = kVar.h;
        long id2 = Thread.currentThread().getId();
        long j3 = kVar.f10763i;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        kVar.f10763i = id2;
        j2.k kVar2 = this.L;
        if (!hashMap.containsKey(kVar2)) {
            hashMap.put(kVar2, new Object());
        }
        j jVar = (j) hashMap.get(kVar2);
        jVar.getClass();
        int i11 = kVar.f10761f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        jVar.f10750b = i11;
        jVar.f10749a = false;
        if (this.V.f10715a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        n0(i10);
        g1 g1Var = this.V;
        boolean z11 = g1Var.f10723l;
        z0(this.P.d(g1Var.e, z11), g1Var.f10725n, g1Var.f10724m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        f1 f1Var = this.I;
        ArrayList arrayList = f1Var.f10695b;
        e2.d.g(!f1Var.f10701k);
        f1Var.f10702l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            e1 e1Var = (e1) arrayList.get(i12);
            f1Var.e(e1Var);
            f1Var.f10698g.add(e1Var);
        }
        f1Var.f10701k = true;
        this.f10819n.e(2);
    }

    public final void L(e2.g gVar) {
        j6.l lVar = this.f10824r;
        e2.z zVar = this.f10819n;
        try {
            P(true, false, true, false);
            M();
            k kVar = this.f10811f;
            if (kVar.h.remove(this.L) != null) {
                kVar.d();
            }
            if (kVar.h.isEmpty()) {
                kVar.f10763i = -1L;
            }
            e eVar = this.P;
            eVar.f10641c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            zVar.f7938a.removeCallbacksAndMessages(null);
            lVar.i();
            gVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f10803a.length; i10++) {
            f fVar = this.f10805b[i10];
            synchronized (fVar.f10681a) {
                fVar.H = null;
            }
            n1 n1Var = this.f10803a[i10];
            f fVar2 = n1Var.f10796a;
            boolean z11 = true;
            if (fVar2.f10685n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar2.r();
            n1Var.e = false;
            f fVar3 = n1Var.f10798c;
            if (fVar3 != null) {
                if (fVar3.f10685n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar3.r();
                n1Var.f10799f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.g1 g1Var) {
        boolean z10 = true;
        this.W.f(1);
        f1 f1Var = this.I;
        f1Var.getClass();
        e2.d.b((i10 < 0 || i10 > i11 || i11 > f1Var.f10695b.size()) ? false : false);
        f1Var.f10700j = g1Var;
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
        t0 t0Var = this.H.f10902i;
        if (t0Var != null && t0Var.f10878g.f10893i && this.Y) {
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
        t0 t0Var = this.H.f10902i;
        if (t0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = t0Var.f10886p;
        }
        long j11 = j3 + j10;
        this.f10817k0 = j11;
        ((q1) this.f10831y.f180c).c(j11);
        for (n1 n1Var : this.f10803a) {
            long j12 = this.f10817k0;
            f d = n1Var.d(t0Var);
            if (d != null) {
                d.f10690y = false;
                d.f10688w = j12;
                d.f10689x = j12;
                d.q(j12, false);
            }
        }
        for (t0 t0Var2 = v0Var.f10902i; t0Var2 != null; t0Var2 = t0Var2.f10883m) {
            for (x2.r rVar : t0Var2.f10885o.f45220c) {
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
        long j12 = f10802u0;
        if (z10) {
            this.R.getClass();
            if (this.V.e != 3) {
                j11 = j12;
            }
            for (n1 n1Var : this.f10803a) {
                long j13 = this.f10817k0;
                long j14 = this.f10818l0;
                f fVar = n1Var.f10798c;
                f fVar2 = n1Var.f10796a;
                if (n1.h(fVar2)) {
                    j10 = fVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (fVar != null && fVar.f10685n != 0) {
                    j10 = Math.min(j10, fVar.g(j13, j14));
                }
                j11 = Math.min(j11, e2.d0.e0(j10));
            }
            if (this.V.m()) {
                t0 t0Var2 = this.H.f10902i;
                if (t0Var2 != null) {
                    t0Var = t0Var2.f10883m;
                } else {
                    t0Var = null;
                }
                if (t0Var != null) {
                    if ((((float) e2.d0.Q(j11)) * this.V.f10726o.f3331a) + ((float) this.f10817k0) >= ((float) t0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.V.e != 3 || r0()) {
            j11 = j12;
        }
        this.f10819n.f7938a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void W(boolean z10) {
        u2.f0 f0Var = this.H.f10902i.f10878g.f10888a;
        long Y = Y(f0Var, this.V.f10730s, true, false);
        if (Y != this.V.f10730s) {
            g1 g1Var = this.V;
            this.V = z(f0Var, Y, g1Var.f10717c, g1Var.d, z10, 5);
        }
    }

    public final void X(i2.n0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.X(i2.n0, boolean):void");
    }

    public final long Y(u2.f0 f0Var, long j3, boolean z10, boolean z11) {
        n1[] n1VarArr;
        v0();
        C0(false, true);
        if (z11 || this.V.e == 3) {
            n0(2);
        }
        v0 v0Var = this.H;
        t0 t0Var = v0Var.f10902i;
        t0 t0Var2 = t0Var;
        while (t0Var2 != null && !f0Var.equals(t0Var2.f10878g.f10888a)) {
            t0Var2 = t0Var2.f10883m;
        }
        if (z10 || t0Var != t0Var2 || (t0Var2 != null && t0Var2.f10886p + j3 < 0)) {
            int i10 = 0;
            while (true) {
                n1VarArr = this.f10803a;
                if (i10 >= n1VarArr.length) {
                    break;
                }
                i(i10);
                i10++;
            }
            this.f10825r0 = -9223372036854775807L;
            if (t0Var2 != null) {
                while (v0Var.f10902i != t0Var2) {
                    v0Var.a();
                }
                v0Var.n(t0Var2);
                t0Var2.f10886p = 1000000000000L;
                l(v0Var.f10903j.e(), new boolean[n1VarArr.length]);
                t0Var2.h = true;
            }
        }
        h();
        if (t0Var2 != null) {
            ?? r10 = t0Var2.f10874a;
            v0Var.n(t0Var2);
            if (!t0Var2.e) {
                t0Var2.f10878g = t0Var2.f10878g.b(j3);
            } else if (t0Var2.f10877f) {
                j3 = r10.h(j3);
                r10.i(j3 - this.f10830x);
            }
            R(j3);
            D();
        } else {
            v0Var.b();
            R(j3);
        }
        u(false);
        this.f10819n.e(2);
        return j3;
    }

    public final void Z(j1 j1Var) {
        j1Var.getClass();
        Looper looper = j1Var.e;
        Looper looper2 = this.f10826s;
        e2.z zVar = this.f10819n;
        if (looper == looper2) {
            g(j1Var);
            int i10 = this.V.e;
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
        this.f10819n.a(8, d0Var).b();
    }

    public final void a0(j1 j1Var) {
        Looper looper = j1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.n("TAG", "Trying to send message on a dead thread.");
            j1Var.a(false);
            return;
        }
        this.F.a(looper, null).c(new g0(this, j1Var));
    }

    @Override
    public final void b(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        if (this.T) {
            e2.z zVar = this.f10819n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7936a = zVar.f7938a.obtainMessage(37);
            b10.b();
        }
    }

    public final void b0(b2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.b0(b2.e, boolean):void");
    }

    public final void c(j0 j0Var, int i10) {
        this.W.f(1);
        f1 f1Var = this.I;
        if (i10 == -1) {
            i10 = f1Var.f10695b.size();
        }
        w(f1Var.a(i10, j0Var.f10751a, j0Var.f10752b), false);
    }

    public final void c0(boolean z10, e2.g gVar) {
        if (this.f10812f0 != z10) {
            this.f10812f0 = z10;
            if (!z10) {
                for (n1 n1Var : this.f10803a) {
                    n1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void d() {
        n1[] n1VarArr;
        o1 o1Var;
        for (n1 n1Var : this.f10803a) {
            if (this.S) {
                o1Var = this.R;
            } else {
                o1Var = null;
            }
            n1Var.f10796a.c(18, o1Var);
            f fVar = n1Var.f10798c;
            if (fVar != null) {
                fVar.c(18, o1Var);
            }
        }
    }

    public final void d0(j0 j0Var) {
        this.W.f(1);
        int i10 = j0Var.f10753c;
        u2.g1 g1Var = j0Var.f10752b;
        ArrayList arrayList = j0Var.f10751a;
        if (i10 != -1) {
            this.f10816j0 = new n0(new l1(arrayList, g1Var), j0Var.f10753c, j0Var.d);
        }
        f1 f1Var = this.I;
        ArrayList arrayList2 = f1Var.f10695b;
        f1Var.g(0, arrayList2.size());
        w(f1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final boolean e() {
        if (!this.O) {
            return false;
        }
        for (n1 n1Var : this.f10803a) {
            if (n1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        this.Y = z10;
        Q();
        if (this.Z) {
            v0 v0Var = this.H;
            if (v0Var.f10903j != v0Var.f10902i) {
                W(true);
                u(false);
            }
        }
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(b2.v0 v0Var) {
        this.f10819n.d(16);
        a3.q qVar = this.f10831y;
        qVar.f(v0Var);
        b2.v0 h = qVar.h();
        y(h, h.f3331a, true, true);
    }

    public final void g0(q qVar) {
        this.f10823q0 = qVar;
        b2.k1 k1Var = this.V.f10715a;
        v0 v0Var = this.H;
        v0Var.getClass();
        qVar.getClass();
        if (!v0Var.f10910q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < v0Var.f10910q.size(); i10++) {
                ((t0) v0Var.f10910q.get(i10)).i();
            }
            v0Var.f10910q = arrayList;
            v0Var.f10906m = null;
            v0Var.k();
        }
    }

    public final void h() {
        n1[] n1VarArr;
        boolean z10;
        f fVar;
        if (this.O && e()) {
            for (n1 n1Var : this.f10803a) {
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
                        fVar = n1Var.f10796a;
                    } else {
                        fVar = n1Var.f10798c;
                        fVar.getClass();
                    }
                    n1Var.a(fVar, this.f10831y);
                    n1Var.i(z10);
                    n1Var.d = i11;
                }
                this.f10815i0 -= c10 - n1Var.c();
            }
            this.f10825r0 = -9223372036854775807L;
        }
    }

    public final void h0(int i10) {
        this.f10809d0 = i10;
        b2.k1 k1Var = this.V.f10715a;
        v0 v0Var = this.H;
        v0Var.f10901g = i10;
        int r10 = v0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        u(false);
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
                    z0(this.P.d(this.V.e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    j();
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
                    s((u2.d0) message.obj);
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
                    y(v0Var, v0Var.f3331a, true, false);
                    break;
                case 17:
                    d0((j0) message.obj);
                    break;
                case 18:
                    c((j0) message.obj, message.arg1);
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
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    o0((a3.y) message.obj);
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
        } catch (b2.s0 e) {
            boolean z15 = e.f3312a;
            int i13 = e.f3313b;
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
            t(e, i11);
        } catch (g2.j e7) {
            t(e7, e7.f9365a);
        } catch (n e10) {
            e = e10;
            int i14 = e.f10789s;
            v0 v0Var2 = this.H;
            if (i14 == 1 && (t0Var2 = v0Var2.f10903j) != null && e.E == null) {
                e = e.a(t0Var2.f10878g.f10888a);
            }
            int i15 = e.f10789s;
            e2.z zVar = this.f10819n;
            if (i15 == 1 && (f0Var = e.E) != null && B(e.f10790w, f0Var)) {
                this.f10827s0 = true;
                h();
                t0 g10 = v0Var2.g();
                t0 t0Var3 = v0Var2.f10902i;
                if (t0Var3 != g10) {
                    while (t0Var3 != null) {
                        t0 t0Var4 = t0Var3.f10883m;
                        if (t0Var4 == g10) {
                            break;
                        }
                        t0Var3 = t0Var4;
                    }
                }
                v0Var2.n(t0Var3);
                if (this.V.e != 4) {
                    D();
                    zVar.e(2);
                }
            } else {
                n nVar = this.f10821o0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f10821o0;
                }
                if (e.f10789s == 1 && v0Var2.f10902i != v0Var2.f10903j) {
                    while (true) {
                        t0Var = v0Var2.f10902i;
                        if (t0Var == v0Var2.f10903j) {
                            break;
                        }
                        v0Var2.a();
                    }
                    e2.d.d(t0Var);
                    F();
                    u0 u0Var = t0Var.f10878g;
                    u2.f0 f0Var2 = u0Var.f10888a;
                    long j3 = u0Var.f10889b;
                    this.V = z(f0Var2, j3, u0Var.f10890c, j3, true, 0);
                }
                if (e.F && (this.f10821o0 == null || (i10 = e.f3327a) == 5004 || i10 == 5003)) {
                    e2.a.o("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f10821o0 == null) {
                        this.f10821o0 = e;
                    }
                    e2.y a2 = zVar.a(25, e);
                    Handler handler = zVar.f7938a;
                    Message message2 = a2.f7936a;
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
            t(e11, 2000);
        } catch (RuntimeException e12) {
            n nVar2 = new n(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.f("ExoPlayerImplInternal", "Playback error", nVar2);
            u0(true, false);
            this.V = this.V.f(nVar2);
        } catch (n2.f e13) {
            t(e13, e13.f14899a);
        } catch (u2.b e14) {
            t(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        boolean z10;
        n1[] n1VarArr = this.f10803a;
        int c10 = n1VarArr[i10].c();
        n1 n1Var = n1VarArr[i10];
        f fVar = n1Var.f10796a;
        a3.q qVar = this.f10831y;
        n1Var.a(fVar, qVar);
        f fVar2 = n1Var.f10798c;
        if (fVar2 != null) {
            if (fVar2.f10685n != 0 && n1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            n1Var.a(fVar2, qVar);
            n1Var.i(false);
            if (z10) {
                f fVar3 = n1Var.f10796a;
                fVar2.getClass();
                fVar2.c(17, fVar3);
            }
        }
        n1Var.d = 0;
        H(i10, false);
        this.f10815i0 -= c10;
    }

    public final void i0(boolean z10) {
        if (!z10) {
            this.T = false;
            this.f10819n.d(37);
            n0 n0Var = this.U;
            if (n0Var != null) {
                X(n0Var, false);
                this.U = null;
            }
        }
        this.S = z10;
        d();
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.j():void");
    }

    public final void j0(o1 o1Var) {
        this.R = o1Var;
        d();
    }

    public final void k(t0 t0Var, int i10, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        n1 n1Var = this.f10803a[i10];
        boolean g10 = n1Var.g();
        f fVar = n1Var.f10796a;
        if (!g10) {
            if (t0Var == this.H.f10902i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.v vVar = t0Var.f10885o;
            m1 m1Var = vVar.f45219b[i10];
            x2.r rVar = vVar.f45220c[i10];
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
            this.f10815i0++;
            u2.b1 b1Var = t0Var.f10876c[i10];
            long j10 = t0Var.f10886p;
            u2.f0 f0Var = t0Var.f10878g.f10888a;
            f fVar2 = n1Var.f10798c;
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
            a3.q qVar = this.f10831y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                n1Var.f10799f = true;
                fVar2.getClass();
                if (fVar2.f10685n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                e2.d.g(z15);
                fVar2.d = m1Var;
                fVar2.G = f0Var;
                fVar2.f10685n = 1;
                fVar2.p(z13, z11);
                fVar2.y(sVarArr, b1Var, j3, j10, f0Var);
                fVar2.f10690y = false;
                fVar2.f10688w = j3;
                fVar2.f10689x = j3;
                fVar2.q(j3, z13);
                qVar.c(fVar2);
            } else {
                n1Var.e = true;
                if (fVar.f10685n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                e2.d.g(z14);
                fVar.d = m1Var;
                fVar.G = f0Var;
                fVar.f10685n = 1;
                fVar.p(z13, z11);
                fVar.y(sVarArr, b1Var, j3, j10, f0Var);
                fVar.f10690y = false;
                fVar.f10688w = j3;
                fVar.f10689x = j3;
                fVar.q(j3, z13);
                qVar.c(fVar);
            }
            i0 i0Var = new i0(this);
            f d = n1Var.d(t0Var);
            d.getClass();
            d.c(11, i0Var);
            if (z12 && z11) {
                n1Var.m();
            }
        }
    }

    public final void k0(p1 p1Var) {
        this.Q = p1Var;
    }

    public final void l(long j3, boolean[] zArr) {
        n1[] n1VarArr;
        long j10;
        t0 t0Var = this.H.f10903j;
        x2.v vVar = t0Var.f10885o;
        int i10 = 0;
        while (true) {
            n1VarArr = this.f10803a;
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
                k(t0Var, i11, zArr[i11], j10);
            }
            i11++;
            j3 = j10;
        }
    }

    public final void l0(boolean z10) {
        this.f10810e0 = z10;
        b2.k1 k1Var = this.V.f10715a;
        v0 v0Var = this.H;
        v0Var.h = z10;
        int r10 = v0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        u(false);
    }

    public final long m(b2.k1 k1Var, Object obj, long j3) {
        b2.h1 h1Var = this.f10829w;
        int i10 = k1Var.g(obj, h1Var).f3009c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        if (j1Var.f3056f == -9223372036854775807L || !j1Var.a() || !j1Var.f3058i) {
            return -9223372036854775807L;
        }
        return e2.d0.Q(e2.d0.A(j1Var.f3057g) - j1Var.f3056f) - (j3 + h1Var.e);
    }

    public final void m0(u2.g1 g1Var) {
        this.W.f(1);
        f1 f1Var = this.I;
        int size = f1Var.f10695b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.h().e(0, size);
        }
        f1Var.f10700j = g1Var;
        w(f1Var.b(), false);
    }

    public final long n(t0 t0Var) {
        if (t0Var == null) {
            return 0L;
        }
        long j3 = t0Var.f10886p;
        if (!t0Var.e) {
            return j3;
        }
        int i10 = 0;
        while (true) {
            n1[] n1VarArr = this.f10803a;
            if (i10 < n1VarArr.length) {
                if (n1VarArr[i10].d(t0Var) != null) {
                    f d = n1VarArr[i10].d(t0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f10689x;
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

    public final void n0(int i10) {
        g1 g1Var = this.V;
        if (g1Var.e != i10) {
            if (i10 != 2) {
                this.f10822p0 = -9223372036854775807L;
            }
            if (i10 != 3 && g1Var.f10727p) {
                this.V = g1Var.i(false);
            }
            this.V = this.V.h(i10);
        }
    }

    public final Pair o(b2.k1 k1Var) {
        long j3 = 0;
        if (k1Var.p()) {
            return Pair.create(g1.f10714u, 0L);
        }
        int a2 = k1Var.a(this.f10810e0);
        Pair i10 = k1Var.i(this.v, this.f10829w, a2, -9223372036854775807L);
        u2.f0 p5 = this.H.p(k1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f43357a;
            b2.h1 h1Var = this.f10829w;
            k1Var.g(obj, h1Var);
            if (p5.f43359c == h1Var.e(p5.f43358b)) {
                h1Var.f3011g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j3));
    }

    public final void o0(a3.y yVar) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f10803a) {
            f fVar = n1Var.f10796a;
            if (fVar.f10682b == 2) {
                fVar.c(7, yVar);
                f fVar2 = n1Var.f10798c;
                if (fVar2 != null) {
                    fVar2.c(7, yVar);
                }
            }
        }
    }

    public final long p(long j3) {
        t0 t0Var = this.H.f10905l;
        if (t0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f10817k0 - t0Var.f10886p));
    }

    public final void p0(Object obj, e2.g gVar) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f10803a) {
            f fVar = n1Var.f10796a;
            if (fVar.f10682b == 2) {
                int i10 = n1Var.d;
                if (i10 != 4 && i10 != 1) {
                    fVar.c(1, obj);
                } else {
                    f fVar2 = n1Var.f10798c;
                    fVar2.getClass();
                    fVar2.c(1, obj);
                }
            }
        }
        int i11 = this.V.e;
        if (i11 == 3 || i11 == 2) {
            this.f10819n.e(2);
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void q(int i10) {
        g1 g1Var = this.V;
        z0(i10, g1Var.f10725n, g1Var.f10724m, g1Var.f10723l);
    }

    public final void q0(float f7) {
        n1[] n1VarArr;
        this.f10828t0 = f7;
        float f10 = f7 * this.P.f10643g;
        for (n1 n1Var : this.f10803a) {
            f fVar = n1Var.f10796a;
            if (fVar.f10682b == 1) {
                fVar.c(2, Float.valueOf(f10));
                f fVar2 = n1Var.f10798c;
                if (fVar2 != null) {
                    fVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void r() {
        q0(this.f10828t0);
    }

    public final boolean r0() {
        g1 g1Var = this.V;
        if (g1Var.f10723l && g1Var.f10725n == 0) {
            return true;
        }
        return false;
    }

    public final void s(u2.d0 d0Var) {
        v0 v0Var = this.H;
        t0 t0Var = v0Var.f10905l;
        if (t0Var != null && t0Var.f10874a == d0Var) {
            v0Var.m(this.f10817k0);
            D();
            return;
        }
        t0 t0Var2 = v0Var.f10906m;
        if (t0Var2 != null && t0Var2.f10874a == d0Var) {
            E();
        }
    }

    public final boolean s0(b2.k1 k1Var, u2.f0 f0Var) {
        if (!f0Var.b() && !k1Var.p()) {
            int i10 = k1Var.g(f0Var.f43357a, this.f10829w).f3009c;
            b2.j1 j1Var = this.v;
            k1Var.n(i10, j1Var);
            if (j1Var.a() && j1Var.f3058i && j1Var.f3056f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        t0 t0Var = this.H.f10902i;
        if (t0Var != null) {
            nVar = nVar.a(t0Var.f10878g.f10888a);
        }
        e2.a.f("ExoPlayerImplInternal", "Playback error", nVar);
        u0(false, false);
        this.V = this.V.f(nVar);
    }

    public final void t0() {
        t0 t0Var = this.H.f10902i;
        if (t0Var != null) {
            x2.v vVar = t0Var.f10885o;
            int i10 = 0;
            while (true) {
                n1[] n1VarArr = this.f10803a;
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

    public final void u(boolean z10) {
        u2.f0 f0Var;
        long d;
        t0 t0Var = this.H.f10905l;
        if (t0Var == null) {
            f0Var = this.V.f10716b;
        } else {
            f0Var = t0Var.f10878g.f10888a;
        }
        boolean equals = this.V.f10722k.equals(f0Var);
        if (!equals) {
            this.V = this.V.c(f0Var);
        }
        g1 g1Var = this.V;
        if (t0Var == null) {
            d = g1Var.f10730s;
        } else {
            d = t0Var.d();
        }
        g1Var.f10728q = d;
        g1 g1Var2 = this.V;
        g1Var2.f10729r = p(g1Var2.f10728q);
        if ((!equals || z10) && t0Var != null && t0Var.e) {
            x0(t0Var.f10885o);
        }
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f10812f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.W.f(z11 ? 1 : 0);
        k kVar = this.f10811f;
        if (kVar.h.remove(this.L) != null) {
            kVar.d();
        }
        this.P.d(1, this.V.f10723l);
        n0(1);
    }

    @Override
    public final void v(u2.d1 d1Var) {
        this.f10819n.a(9, (u2.d0) d1Var).b();
    }

    public final void v0() {
        n1[] n1VarArr;
        a3.q qVar = this.f10831y;
        qVar.f179b = false;
        q1 q1Var = (q1) qVar.f180c;
        if (q1Var.f10865c) {
            q1Var.c(q1Var.a());
            q1Var.f10865c = false;
        }
        for (n1 n1Var : this.f10803a) {
            f fVar = n1Var.f10798c;
            f fVar2 = n1Var.f10796a;
            if (n1.h(fVar2)) {
                n1.b(fVar2);
            }
            if (fVar != null && fVar.f10685n != 0) {
                n1.b(fVar);
            }
        }
    }

    public final void w(b2.k1 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: i2.o0.w(b2.k1, boolean):void");
    }

    public final void w0() {
        boolean z10;
        t0 t0Var = this.H.f10905l;
        if (!this.f10808c0 && (t0Var == null || !t0Var.f10874a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        g1 g1Var = this.V;
        if (z10 != g1Var.f10719g) {
            this.V = g1Var.b(z10);
        }
    }

    public final void x(u2.d0 d0Var) {
        t0 t0Var;
        v0 v0Var = this.H;
        t0 t0Var2 = v0Var.f10905l;
        a3.q qVar = this.f10831y;
        if (t0Var2 != null && t0Var2.f10874a == d0Var) {
            t0Var2.getClass();
            if (!t0Var2.e) {
                float f7 = qVar.h().f3331a;
                g1 g1Var = this.V;
                t0Var2.f(f7, g1Var.f10715a, g1Var.f10723l);
            }
            x0(t0Var2.f10885o);
            if (t0Var2 == v0Var.f10902i) {
                R(t0Var2.f10878g.f10889b);
                l(v0Var.f10903j.e(), new boolean[this.f10803a.length]);
                t0Var2.h = true;
                g1 g1Var2 = this.V;
                u2.f0 f0Var = g1Var2.f10716b;
                long j3 = t0Var2.f10878g.f10889b;
                this.V = z(f0Var, j3, g1Var2.f10717c, j3, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < v0Var.f10910q.size()) {
                t0Var = (t0) v0Var.f10910q.get(i10);
                if (t0Var.f10874a == d0Var) {
                    break;
                }
                i10++;
            } else {
                t0Var = null;
                break;
            }
        }
        if (t0Var != null) {
            e2.d.g(true ^ t0Var.e);
            float f10 = qVar.h().f3331a;
            g1 g1Var3 = this.V;
            t0Var.f(f10, g1Var3.f10715a, g1Var3.f10723l);
            t0 t0Var3 = v0Var.f10906m;
            if (t0Var3 != null && t0Var3.f10874a == d0Var) {
                E();
            }
        }
    }

    public final void x0(x2.v vVar) {
        t0 t0Var = this.H.f10905l;
        t0Var.getClass();
        p(t0Var.d());
        if (s0(this.V.f10715a, t0Var.f10878g.f10888a)) {
            long j3 = this.J.h;
        }
        b2.k1 k1Var = this.V.f10715a;
        float f7 = this.f10831y.h().f3331a;
        boolean z10 = this.V.f10723l;
        x2.r[] rVarArr = vVar.f45220c;
        k kVar = this.f10811f;
        j jVar = (j) kVar.h.get(this.L);
        jVar.getClass();
        int i10 = kVar.f10761f;
        if (i10 == -1) {
            int length = rVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    x2.r rVar = rVarArr[i11];
                    if (rVar != null) {
                        switch (rVar.b().f3088c) {
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
        jVar.f10750b = i10;
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
        float f10 = v0Var.f3331a;
        t0 t0Var = this.H.f10902i;
        while (true) {
            i10 = 0;
            if (t0Var == null) {
                break;
            }
            x2.r[] rVarArr = t0Var.f10885o.f45220c;
            int length = rVarArr.length;
            while (i10 < length) {
                x2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f10);
                }
                i10++;
            }
            t0Var = t0Var.f10883m;
        }
        n1[] n1VarArr = this.f10803a;
        int length2 = n1VarArr.length;
        while (i10 < length2) {
            n1 n1Var = n1VarArr[i10];
            float f11 = v0Var.f3331a;
            n1Var.f10796a.z(f7, f11);
            f fVar = n1Var.f10798c;
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
        f1 f1Var = this.I;
        f1Var.getClass();
        ArrayList arrayList = f1Var.f10695b;
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
            ((e1) arrayList.get(i12)).f10678a.t((b2.k0) list.get(i12 - i10));
        }
        w(f1Var.b(), false);
    }

    public final g1 z(u2.f0 f0Var, long j3, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        e9.a1 a1Var;
        boolean z13;
        boolean z14;
        if (!this.f10820n0 && j3 == this.V.f10730s && f0Var.equals(this.V.f10716b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f10820n0 = z11;
        Q();
        g1 g1Var = this.V;
        u2.o1 o1Var = g1Var.h;
        x2.v vVar = g1Var.f10720i;
        List list = g1Var.f10721j;
        if (this.I.f10701k) {
            t0 t0Var = this.H.f10902i;
            if (t0Var == null) {
                o1Var = u2.o1.d;
            } else {
                o1Var = t0Var.f10884n;
            }
            if (t0Var == null) {
                vVar = this.e;
            } else {
                vVar = t0Var.f10885o;
            }
            x2.r[] rVarArr = vVar.f45220c;
            ?? wVar = new com.google.android.gms.common.api.internal.w(4);
            boolean z15 = false;
            for (x2.r rVar : rVarArr) {
                if (rVar != null) {
                    b2.p0 p0Var = rVar.f(0).f3298l;
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
                e9.g0 g0Var = e9.i0.f8079b;
                a1Var = e9.a1.e;
            }
            list = a1Var;
            if (t0Var != null) {
                u0 u0Var = t0Var.f10878g;
                if (u0Var.f10890c != j10) {
                    t0Var.f10878g = u0Var.a(j10);
                }
            }
            n1[] n1VarArr = this.f10803a;
            v0 v0Var = this.H;
            t0 t0Var2 = v0Var.f10902i;
            if (t0Var2 == v0Var.f10903j && t0Var2 != null) {
                x2.v vVar2 = t0Var2.f10885o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < n1VarArr.length) {
                        if (vVar2.b(i11)) {
                            if (n1VarArr[i11].f10796a.f10682b != 1) {
                                z13 = false;
                                break;
                            } else if (vVar2.f45219b[i11].f10787a != 0) {
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
                if (z14 != this.f10814h0) {
                    this.f10814h0 = z14;
                    if (!z14 && this.V.f10727p) {
                        this.f10819n.e(2);
                    }
                }
            }
        } else if (!f0Var.equals(g1Var.f10716b)) {
            o1Var = u2.o1.d;
            vVar = this.e;
            list = e9.a1.e;
        }
        u2.o1 o1Var2 = o1Var;
        x2.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            l0 l0Var = this.W;
            if (l0Var.d && l0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
            } else {
                l0Var.f10774c = true;
                l0Var.d = true;
                l0Var.e = i10;
            }
        }
        g1 g1Var2 = this.V;
        return g1Var2.d(f0Var, j3, j10, j11, p(g1Var2.f10728q), o1Var2, vVar3, list2);
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
        if (g1Var.f10723l != z11 || g1Var.f10725n != i11 || g1Var.f10724m != i12) {
            this.V = g1Var.e(i12, i11, z11);
            C0(false, false);
            v0 v0Var = this.H;
            for (t0 t0Var = v0Var.f10902i; t0Var != null; t0Var = t0Var.f10883m) {
                for (x2.r rVar : t0Var.f10885o.f45220c) {
                    if (rVar != null) {
                        rVar.e(z11);
                    }
                }
            }
            if (!r0()) {
                v0();
                A0();
                g1 g1Var2 = this.V;
                if (g1Var2.f10727p) {
                    this.V = g1Var2.i(false);
                }
                v0Var.m(this.f10817k0);
                return;
            }
            int i13 = this.V.e;
            e2.z zVar = this.f10819n;
            if (i13 == 3) {
                a3.q qVar = this.f10831y;
                qVar.f179b = true;
                ((q1) qVar.f180c).d();
                t0();
                zVar.e(2);
            } else if (i13 == 2) {
                zVar.e(2);
            }
        }
    }
}
