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
public final class p0 implements Handler.Callback, u2.c0, i1, a3.y {
    public static final long f10829u0 = e2.d0.e0(10000);
    public final ArrayList E;
    public final e2.x F;
    public final x G;
    public final w0 H;
    public final g1 I;
    public final i J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.z N;
    public final boolean O;
    public final e P;
    public q1 Q;
    public p1 R;
    public boolean S;
    public boolean T;
    public o0 U;
    public h1 V;
    public m0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final o1[] f10830a;
    public boolean f10831a0;
    public final f[] f10832b;
    public long f10833b0;
    public final boolean[] f10834c;
    public boolean f10835c0;
    public final x2.u d;
    public int f10836d0;
    public final x2.v e;
    public boolean f10837e0;
    public final k f10838f;
    public boolean f10839f0;
    public boolean f10840g0;
    public final y2.c h;
    public boolean f10841h0;
    public int f10842i0;
    public o0 f10843j0;
    public long f10844k0;
    public long f10845l0;
    public int m0;
    public final e2.z f10846n;
    public boolean f10847n0;
    public n f10848o0;
    public long f10849p0;
    public q f10850q0;
    public final j6.l f10851r;
    public long f10852r0;
    public final Looper f10853s;
    public boolean f10854s0;
    public float f10855t0;
    public final b2.j1 v;
    public final b2.h1 f10856w;
    public final long f10857x;
    public final a3.q f10858y;

    public p0(Context context, f[] fVarArr, f[] fVarArr2, x2.u uVar, x2.v vVar, k kVar, y2.c cVar, int i10, boolean z10, j2.f fVar, q1 q1Var, i iVar, long j3, Looper looper, e2.x xVar, x xVar2, j2.k kVar2, final a3.y yVar) {
        q qVar = q.f10861a;
        this.f10852r0 = -9223372036854775807L;
        this.G = xVar2;
        this.d = uVar;
        this.e = vVar;
        this.f10838f = kVar;
        this.h = cVar;
        this.f10836d0 = i10;
        this.f10837e0 = z10;
        this.Q = q1Var;
        this.J = iVar;
        this.K = j3;
        this.Y = false;
        this.F = xVar;
        this.L = kVar2;
        this.f10850q0 = qVar;
        this.M = fVar;
        this.f10855t0 = 1.0f;
        this.R = p1.f10859b;
        this.f10849p0 = -9223372036854775807L;
        this.f10833b0 = -9223372036854775807L;
        this.f10857x = kVar.f10763g;
        b2.g1 g1Var = b2.k1.f3080a;
        h1 k10 = h1.k(vVar);
        this.V = k10;
        this.W = new m0(k10);
        this.f10832b = new f[fVarArr.length];
        this.f10834c = new boolean[fVarArr.length];
        x2.p pVar = (x2.p) uVar;
        pVar.getClass();
        this.f10830a = new o1[fVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar2 = fVarArr[i11];
            fVar2.e = i11;
            fVar2.f10655f = kVar2;
            fVar2.h = xVar;
            this.f10832b[i11] = fVar2;
            f fVar3 = this.f10832b[i11];
            synchronized (fVar3.f10652a) {
                fVar3.H = pVar;
            }
            f fVar4 = fVarArr2[i11];
            if (fVar4 != null) {
                fVar4.e = i11;
                fVar4.f10655f = kVar2;
                fVar4.h = xVar;
                z11 = true;
            }
            this.f10830a[i11] = new o1(fVarArr[i11], fVar4, i11);
        }
        this.O = z11;
        this.f10858y = new a3.q(this, xVar);
        this.E = new ArrayList();
        this.v = new b2.j1();
        this.f10856w = new b2.h1();
        e2.d.g(uVar.f45601a == null);
        uVar.f45601a = this;
        uVar.f45602b = cVar;
        this.f10847n0 = true;
        e2.z a2 = xVar.a(looper, null);
        this.N = a2;
        this.H = new w0(fVar, a2, new d5(this, 12));
        this.I = new g1(this, fVar, a2, kVar2);
        j6.l lVar = new j6.l(8);
        this.f10851r = lVar;
        Looper g10 = lVar.g();
        this.f10853s = g10;
        e2.z a10 = xVar.a(g10, this);
        this.f10846n = a10;
        this.P = new e(context, g10, this);
        a10.a(35, new a3.y() {
            @Override
            public final void a(long j10, long j11, b2.s sVar, MediaFormat mediaFormat) {
                p0 p0Var = p0.this;
                p0Var.getClass();
                yVar.a(j10, j11, sVar, mediaFormat);
                p0Var.a(j10, j11, sVar, mediaFormat);
            }
        }).b();
    }

    public static boolean A(u0 u0Var) {
        u2.b1[] b1VarArr;
        long d;
        if (u0Var != null) {
            try {
                ?? r12 = u0Var.f10883a;
                if (!u0Var.e) {
                    r12.g();
                } else {
                    for (u2.b1 b1Var : u0Var.f10885c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                }
                if (!u0Var.e) {
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

    public static Pair T(b2.k1 k1Var, o0 o0Var, boolean z10, int i10, boolean z11, b2.j1 j1Var, b2.h1 h1Var) {
        b2.k1 k1Var2;
        int U;
        b2.k1 k1Var3 = o0Var.f10803a;
        if (!k1Var.p()) {
            if (k1Var3.p()) {
                k1Var2 = k1Var;
            } else {
                k1Var2 = k1Var3;
            }
            try {
                Pair i11 = k1Var2.i(j1Var, h1Var, o0Var.f10804b, o0Var.f10805c);
                if (!k1Var.equals(k1Var2)) {
                    if (k1Var.b(i11.first) != -1) {
                        if (k1Var2.g(i11.first, h1Var).f3014f && k1Var2.m(h1Var.f3013c, j1Var, 0L).f3067n == k1Var2.b(i11.first)) {
                            return k1Var.i(j1Var, h1Var, k1Var.g(i11.first, h1Var).f3013c, o0Var.f10805c);
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
        Object obj2 = k1Var3.m(k1Var3.g(obj, h1Var).f3013c, j1Var, 0L).f3057a;
        for (int i11 = 0; i11 < k1Var2.o(); i11++) {
            if (k1Var2.m(i11, j1Var, 0L).f3057a.equals(obj2)) {
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
        return k1Var2.f(i13, h1Var, false).f3013c;
    }

    public static void g(k1 k1Var) {
        try {
            synchronized (k1Var) {
                synchronized (k1Var) {
                }
                k1Var.f10768a.c(k1Var.f10770c, k1Var.d);
                return;
            }
            k1Var.f10768a.c(k1Var.f10770c, k1Var.d);
            return;
        } finally {
            k1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.A0():void");
    }

    public final boolean B(int i10, u2.f0 f0Var) {
        boolean z10;
        boolean z11;
        w0 w0Var = this.H;
        u0 u0Var = w0Var.f10914k;
        if (u0Var != null && u0Var.f10887g.f10898a.equals(f0Var)) {
            o1 o1Var = this.f10830a[i10];
            u0 u0Var2 = w0Var.f10914k;
            int i11 = o1Var.d;
            if ((i11 == 2 || i11 == 4) && o1Var.d(u0Var2) == o1Var.f10806a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (o1Var.d == 3 && o1Var.d(u0Var2) == o1Var.f10808c) {
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
        Object obj2 = f0Var.f43749a;
        if (!s02) {
            if (f0Var.b()) {
                v0Var = b2.v0.d;
            } else {
                v0Var = this.V.f10737o;
            }
            a3.q qVar = this.f10858y;
            if (!qVar.h().equals(v0Var)) {
                this.f10846n.d(16);
                qVar.f(v0Var);
                y(this.V.f10737o, v0Var.f3335a, false, false);
                return;
            }
            return;
        }
        b2.h1 h1Var = this.f10856w;
        int i10 = k1Var.g(obj2, h1Var).f3013c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        b2.e0 e0Var = j1Var.f3063j;
        i iVar = this.J;
        iVar.getClass();
        iVar.f10745c = e2.d0.Q(e0Var.f2977a);
        iVar.f10746f = e2.d0.Q(e0Var.f2978b);
        iVar.f10747g = e2.d0.Q(e0Var.f2979c);
        float f7 = e0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        iVar.f10749j = f7;
        float f10 = e0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.f10748i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            iVar.f10745c = -9223372036854775807L;
        }
        iVar.a();
        if (j3 != -9223372036854775807L) {
            iVar.d = n(k1Var, obj2, j3);
            iVar.a();
            return;
        }
        Object obj3 = j1Var.f3057a;
        if (!k1Var2.p()) {
            obj = k1Var2.m(k1Var2.g(f0Var2.f43749a, h1Var).f3013c, j1Var, 0L).f3057a;
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
        u0 u0Var = this.H.f10912i;
        long j3 = u0Var.f10887g.e;
        if (u0Var.e) {
            if (j3 == -9223372036854775807L || this.V.f10741s < j3 || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0(boolean z10, boolean z11) {
        long j3;
        this.f10831a0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f10833b0 = j3;
    }

    public final void D() {
        long d;
        long j3;
        boolean c10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f10915l)) {
            c10 = false;
        } else {
            u0 u0Var = this.H.f10915l;
            if (!u0Var.e) {
                d = 0;
            } else {
                d = u0Var.f10883a.d();
            }
            long q6 = q(d);
            u0 u0Var2 = this.H.f10912i;
            if (s0(this.V.f10726a, u0Var.f10887g.f10898a)) {
                j3 = this.J.h;
            } else {
                j3 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.k1 k1Var = this.V.f10726a;
            float f7 = this.f10858y.h().f3335a;
            boolean z13 = this.V.f10734l;
            q0 q0Var = new q0(kVar, q6, f7, this.f10831a0, j3);
            c10 = this.f10838f.c(q0Var);
            u0 u0Var3 = this.H.f10912i;
            if (!c10 && u0Var3.e && q6 < 500000 && this.f10857x > 0) {
                u0Var3.f10883a.i(this.V.f10741s);
                c10 = this.f10838f.c(q0Var);
            }
        }
        this.f10835c0 = c10;
        if (c10) {
            u0 u0Var4 = this.H.f10915l;
            u0Var4.getClass();
            r0 r0Var = new r0();
            r0Var.f10868a = this.f10844k0 - u0Var4.f10895p;
            float f10 = this.f10858y.h().f3335a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            e2.d.b(z10);
            r0Var.f10869b = f10;
            long j10 = this.f10833b0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            r0Var.f10870c = j10;
            s0 s0Var = new s0(r0Var);
            if (u0Var4.f10892m == null) {
                z12 = true;
            }
            e2.d.g(z12);
            u0Var4.f10883a.p(s0Var);
        }
        w0();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        w0 w0Var = this.H;
        w0Var.k();
        u0 u0Var = w0Var.f10916m;
        if (u0Var != null) {
            ?? r12 = u0Var.f10883a;
            if ((!u0Var.d || u0Var.e) && !r12.c()) {
                b2.k1 k1Var = this.V.f10726a;
                if (u0Var.e) {
                    r12.s();
                }
                for (j jVar : this.f10838f.h.values()) {
                    if (jVar.f10756a) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!u0Var.d) {
                    long j3 = u0Var.f10887g.f10899b;
                    u0Var.d = true;
                    r12.k(this, j3);
                    return;
                }
                r0 r0Var = new r0();
                r0Var.f10868a = this.f10844k0 - u0Var.f10895p;
                float f7 = this.f10858y.h().f3335a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e2.d.b(z10);
                r0Var.f10869b = f7;
                long j10 = this.f10833b0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                e2.d.b(z11);
                r0Var.f10870c = j10;
                s0 s0Var = new s0(r0Var);
                if (u0Var.f10892m != null) {
                    z12 = false;
                }
                e2.d.g(z12);
                r12.p(s0Var);
            }
        }
    }

    public final void F() {
        boolean z10;
        m0 m0Var = this.W;
        h1 h1Var = this.V;
        boolean z11 = m0Var.f10782c;
        if (((h1) m0Var.f10783f) != h1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        m0Var.f10782c = z12;
        m0Var.f10783f = h1Var;
        if (z12) {
            f0 f0Var = this.G.f10922b;
            f0Var.f10676j.c(new x1(9, f0Var, m0Var));
            this.W = new m0(this.V);
        }
    }

    public final void G(int i10) {
        o1 o1Var = this.f10830a[i10];
        try {
            u0 u0Var = this.H.f10912i;
            u0Var.getClass();
            f d = o1Var.d(u0Var);
            d.getClass();
            u2.b1 b1Var = d.f10657r;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = o1Var.f10806a.f10653b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.v vVar = this.H.f10912i.f10894o;
            e2.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + b2.s.c(vVar.f45606c[i10].m()), e);
            x2.v vVar2 = new x2.v((n1[]) vVar.f45605b.clone(), (x2.r[]) vVar.f45606c.clone(), vVar.d, vVar.e);
            vVar2.f45605b[i10] = null;
            vVar2.f45606c[i10] = null;
            i(i10);
            u0 u0Var2 = this.H.f10912i;
            u0Var2.a(vVar2, this.V.f10741s, false, new boolean[u0Var2.f10889j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f10834c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.c(new g0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(l0 l0Var) {
        boolean z10;
        b2.k1 b10;
        this.W.f(1);
        int i10 = l0Var.f10775a;
        int i11 = l0Var.f10776b;
        int i12 = l0Var.f10777c;
        u2.g1 g1Var = l0Var.d;
        g1 g1Var2 = this.I;
        ArrayList arrayList = g1Var2.f10712b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        g1Var2.f10717j = g1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((f1) arrayList.get(min)).d;
            e2.d0.P(i10, i11, i12, arrayList);
            while (min <= max) {
                f1 f1Var = (f1) arrayList.get(min);
                f1Var.d = i13;
                i13 += f1Var.f10696a.f43699o.e.o();
                min++;
            }
            b10 = g1Var2.b();
        } else {
            b10 = g1Var2.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        this.W.f(1);
        P(false, false, false, true);
        k kVar = this.f10838f;
        HashMap hashMap = kVar.h;
        long id2 = Thread.currentThread().getId();
        long j3 = kVar.f10764i;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        kVar.f10764i = id2;
        j2.k kVar2 = this.L;
        if (!hashMap.containsKey(kVar2)) {
            hashMap.put(kVar2, new Object());
        }
        j jVar = (j) hashMap.get(kVar2);
        jVar.getClass();
        int i11 = kVar.f10762f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        jVar.f10757b = i11;
        jVar.f10756a = false;
        if (this.V.f10726a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        n0(i10);
        h1 h1Var = this.V;
        boolean z11 = h1Var.f10734l;
        z0(this.P.d(h1Var.e, z11), h1Var.f10736n, h1Var.f10735m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        g1 g1Var = this.I;
        ArrayList arrayList = g1Var.f10712b;
        e2.d.g(!g1Var.f10718k);
        g1Var.f10719l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            f1 f1Var = (f1) arrayList.get(i12);
            g1Var.e(f1Var);
            g1Var.f10715g.add(f1Var);
        }
        g1Var.f10718k = true;
        this.f10846n.e(2);
    }

    public final void L(e2.g gVar) {
        j6.l lVar = this.f10851r;
        e2.z zVar = this.f10846n;
        try {
            P(true, false, true, false);
            M();
            k kVar = this.f10838f;
            if (kVar.h.remove(this.L) != null) {
                kVar.d();
            }
            if (kVar.h.isEmpty()) {
                kVar.f10764i = -1L;
            }
            e eVar = this.P;
            eVar.f10643c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            zVar.f7937a.removeCallbacksAndMessages(null);
            lVar.i();
            gVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f10830a.length; i10++) {
            f fVar = this.f10832b[i10];
            synchronized (fVar.f10652a) {
                fVar.H = null;
            }
            o1 o1Var = this.f10830a[i10];
            f fVar2 = o1Var.f10806a;
            boolean z11 = true;
            if (fVar2.f10656n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar2.r();
            o1Var.e = false;
            f fVar3 = o1Var.f10808c;
            if (fVar3 != null) {
                if (fVar3.f10656n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar3.r();
                o1Var.f10809f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.g1 g1Var) {
        boolean z10 = true;
        this.W.f(1);
        g1 g1Var2 = this.I;
        g1Var2.getClass();
        e2.d.b((i10 < 0 || i10 > i11 || i11 > g1Var2.f10712b.size()) ? false : false);
        g1Var2.f10717j = g1Var;
        g1Var2.g(i10, i11);
        w(g1Var2.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        u0 u0Var = this.H.f10912i;
        if (u0Var != null && u0Var.f10887g.f10903i && this.Y) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
    }

    public final void R(long j3) {
        w0 w0Var;
        long j10;
        o1[] o1VarArr;
        x2.r[] rVarArr;
        u0 u0Var = this.H.f10912i;
        if (u0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = u0Var.f10895p;
        }
        long j11 = j3 + j10;
        this.f10844k0 = j11;
        ((r1) this.f10858y.f182c).c(j11);
        for (o1 o1Var : this.f10830a) {
            long j12 = this.f10844k0;
            f d = o1Var.d(u0Var);
            if (d != null) {
                d.f10661y = false;
                d.f10659w = j12;
                d.f10660x = j12;
                d.q(j12, false);
            }
        }
        for (u0 u0Var2 = w0Var.f10912i; u0Var2 != null; u0Var2 = u0Var2.f10892m) {
            for (x2.r rVar : u0Var2.f10894o.f45606c) {
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
            a4.a.z(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j3) {
        o1[] o1VarArr;
        u0 u0Var;
        long j10;
        boolean z10 = this.S;
        long j11 = 1000;
        long j12 = f10829u0;
        if (z10) {
            this.R.getClass();
            if (this.V.e != 3) {
                j11 = j12;
            }
            for (o1 o1Var : this.f10830a) {
                long j13 = this.f10844k0;
                long j14 = this.f10845l0;
                f fVar = o1Var.f10808c;
                f fVar2 = o1Var.f10806a;
                if (o1.h(fVar2)) {
                    j10 = fVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (fVar != null && fVar.f10656n != 0) {
                    j10 = Math.min(j10, fVar.g(j13, j14));
                }
                j11 = Math.min(j11, e2.d0.e0(j10));
            }
            if (this.V.m()) {
                u0 u0Var2 = this.H.f10912i;
                if (u0Var2 != null) {
                    u0Var = u0Var2.f10892m;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    if ((((float) e2.d0.Q(j11)) * this.V.f10737o.f3335a) + ((float) this.f10844k0) >= ((float) u0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.V.e != 3 || r0()) {
            j11 = j12;
        }
        this.f10846n.f7937a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void W(boolean z10) {
        u2.f0 f0Var = this.H.f10912i.f10887g.f10898a;
        long Y = Y(f0Var, this.V.f10741s, true, false);
        if (Y != this.V.f10741s) {
            h1 h1Var = this.V;
            this.V = z(f0Var, Y, h1Var.f10728c, h1Var.d, z10, 5);
        }
    }

    public final void X(i2.o0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.X(i2.o0, boolean):void");
    }

    public final long Y(u2.f0 f0Var, long j3, boolean z10, boolean z11) {
        o1[] o1VarArr;
        v0();
        C0(false, true);
        if (z11 || this.V.e == 3) {
            n0(2);
        }
        w0 w0Var = this.H;
        u0 u0Var = w0Var.f10912i;
        u0 u0Var2 = u0Var;
        while (u0Var2 != null && !f0Var.equals(u0Var2.f10887g.f10898a)) {
            u0Var2 = u0Var2.f10892m;
        }
        if (z10 || u0Var != u0Var2 || (u0Var2 != null && u0Var2.f10895p + j3 < 0)) {
            int i10 = 0;
            while (true) {
                o1VarArr = this.f10830a;
                if (i10 >= o1VarArr.length) {
                    break;
                }
                i(i10);
                i10++;
            }
            this.f10852r0 = -9223372036854775807L;
            if (u0Var2 != null) {
                while (w0Var.f10912i != u0Var2) {
                    w0Var.a();
                }
                w0Var.n(u0Var2);
                u0Var2.f10895p = 1000000000000L;
                l(w0Var.f10913j.e(), new boolean[o1VarArr.length]);
                u0Var2.h = true;
            }
        }
        h();
        if (u0Var2 != null) {
            ?? r10 = u0Var2.f10883a;
            w0Var.n(u0Var2);
            if (!u0Var2.e) {
                u0Var2.f10887g = u0Var2.f10887g.b(j3);
            } else if (u0Var2.f10886f) {
                j3 = r10.h(j3);
                r10.i(j3 - this.f10857x);
            }
            R(j3);
            D();
        } else {
            w0Var.b();
            R(j3);
        }
        v(false);
        this.f10846n.e(2);
        return j3;
    }

    public final void Z(k1 k1Var) {
        k1Var.getClass();
        Looper looper = k1Var.e;
        Looper looper2 = this.f10853s;
        e2.z zVar = this.f10846n;
        if (looper == looper2) {
            g(k1Var);
            int i10 = this.V.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            zVar.e(2);
            return;
        }
        zVar.a(15, k1Var).b();
    }

    @Override
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        if (this.T) {
            e2.z zVar = this.f10846n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f7935a = zVar.f7937a.obtainMessage(37);
            b10.b();
        }
    }

    public final void a0(k1 k1Var) {
        Looper looper = k1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.n("TAG", "Trying to send message on a dead thread.");
            k1Var.a(false);
            return;
        }
        this.F.a(looper, null).c(new h0(this, k1Var));
    }

    @Override
    public final void b(u2.d0 d0Var) {
        this.f10846n.a(8, d0Var).b();
    }

    public final void b0(b2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.b0(b2.e, boolean):void");
    }

    public final void c(k0 k0Var, int i10) {
        this.W.f(1);
        g1 g1Var = this.I;
        if (i10 == -1) {
            i10 = g1Var.f10712b.size();
        }
        w(g1Var.a(i10, k0Var.f10765a, k0Var.f10766b), false);
    }

    public final void c0(boolean z10, e2.g gVar) {
        if (this.f10839f0 != z10) {
            this.f10839f0 = z10;
            if (!z10) {
                for (o1 o1Var : this.f10830a) {
                    o1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void d() {
        o1[] o1VarArr;
        p1 p1Var;
        for (o1 o1Var : this.f10830a) {
            if (this.S) {
                p1Var = this.R;
            } else {
                p1Var = null;
            }
            o1Var.f10806a.c(18, p1Var);
            f fVar = o1Var.f10808c;
            if (fVar != null) {
                fVar.c(18, p1Var);
            }
        }
    }

    public final void d0(k0 k0Var) {
        this.W.f(1);
        int i10 = k0Var.f10767c;
        u2.g1 g1Var = k0Var.f10766b;
        ArrayList arrayList = k0Var.f10765a;
        if (i10 != -1) {
            this.f10843j0 = new o0(new m1(arrayList, g1Var), k0Var.f10767c, k0Var.d);
        }
        g1 g1Var2 = this.I;
        ArrayList arrayList2 = g1Var2.f10712b;
        g1Var2.g(0, arrayList2.size());
        w(g1Var2.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final boolean e() {
        if (!this.O) {
            return false;
        }
        for (o1 o1Var : this.f10830a) {
            if (o1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        this.Y = z10;
        Q();
        if (this.Z) {
            w0 w0Var = this.H;
            if (w0Var.f10913j != w0Var.f10912i) {
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
        this.f10846n.d(16);
        a3.q qVar = this.f10858y;
        qVar.f(v0Var);
        b2.v0 h = qVar.h();
        y(h, h.f3335a, true, true);
    }

    public final void g0(q qVar) {
        this.f10850q0 = qVar;
        b2.k1 k1Var = this.V.f10726a;
        w0 w0Var = this.H;
        w0Var.getClass();
        qVar.getClass();
        if (!w0Var.f10920q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < w0Var.f10920q.size(); i10++) {
                ((u0) w0Var.f10920q.get(i10)).i();
            }
            w0Var.f10920q = arrayList;
            w0Var.f10916m = null;
            w0Var.k();
        }
    }

    public final void h() {
        o1[] o1VarArr;
        boolean z10;
        f fVar;
        if (this.O && e()) {
            for (o1 o1Var : this.f10830a) {
                int c10 = o1Var.c();
                if (o1Var.f()) {
                    int i10 = o1Var.d;
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
                        fVar = o1Var.f10806a;
                    } else {
                        fVar = o1Var.f10808c;
                        fVar.getClass();
                    }
                    o1Var.a(fVar, this.f10858y);
                    o1Var.i(z10);
                    o1Var.d = i11;
                }
                this.f10842i0 -= c10 - o1Var.c();
            }
            this.f10852r0 = -9223372036854775807L;
        }
    }

    public final void h0(int i10) {
        this.f10836d0 = i10;
        b2.k1 k1Var = this.V.f10726a;
        w0 w0Var = this.H;
        w0Var.f10911g = i10;
        int r10 = w0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        u0 u0Var;
        u2.f0 f0Var;
        u0 u0Var2;
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
                    X((o0) message.obj, true);
                    break;
                case 4:
                    f0((b2.v0) message.obj);
                    break;
                case 5:
                    k0((q1) message.obj);
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
                    Z((k1) message.obj);
                    break;
                case 15:
                    a0((k1) message.obj);
                    break;
                case 16:
                    b2.v0 v0Var = (b2.v0) message.obj;
                    y(v0Var, v0Var.f3335a, true, false);
                    break;
                case 17:
                    d0((k0) message.obj);
                    break;
                case 18:
                    c((k0) message.obj, message.arg1);
                    break;
                case 19:
                    J((l0) message.obj);
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
                    o0 o0Var = this.U;
                    if (o0Var != null) {
                        X(o0Var, false);
                        this.U = null;
                        break;
                    }
                    break;
                case 38:
                    j0((p1) message.obj);
                    break;
            }
        } catch (b2.s0 e) {
            boolean z15 = e.f3316a;
            int i13 = e.f3317b;
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
            u(e7, e7.f9364a);
        } catch (n e10) {
            e = e10;
            int i14 = e.f10790s;
            w0 w0Var = this.H;
            if (i14 == 1 && (u0Var2 = w0Var.f10913j) != null && e.E == null) {
                e = e.a(u0Var2.f10887g.f10898a);
            }
            int i15 = e.f10790s;
            e2.z zVar = this.f10846n;
            if (i15 == 1 && (f0Var = e.E) != null && B(e.f10791w, f0Var)) {
                this.f10854s0 = true;
                h();
                u0 g10 = w0Var.g();
                u0 u0Var3 = w0Var.f10912i;
                if (u0Var3 != g10) {
                    while (u0Var3 != null) {
                        u0 u0Var4 = u0Var3.f10892m;
                        if (u0Var4 == g10) {
                            break;
                        }
                        u0Var3 = u0Var4;
                    }
                }
                w0Var.n(u0Var3);
                if (this.V.e != 4) {
                    D();
                    zVar.e(2);
                }
            } else {
                n nVar = this.f10848o0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f10848o0;
                }
                if (e.f10790s == 1 && w0Var.f10912i != w0Var.f10913j) {
                    while (true) {
                        u0Var = w0Var.f10912i;
                        if (u0Var == w0Var.f10913j) {
                            break;
                        }
                        w0Var.a();
                    }
                    e2.d.d(u0Var);
                    F();
                    v0 v0Var2 = u0Var.f10887g;
                    u2.f0 f0Var2 = v0Var2.f10898a;
                    long j3 = v0Var2.f10899b;
                    this.V = z(f0Var2, j3, v0Var2.f10900c, j3, true, 0);
                }
                if (e.F && (this.f10848o0 == null || (i10 = e.f3331a) == 5004 || i10 == 5003)) {
                    e2.a.o("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f10848o0 == null) {
                        this.f10848o0 = e;
                    }
                    e2.y a2 = zVar.a(25, e);
                    Handler handler = zVar.f7937a;
                    Message message2 = a2.f7935a;
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
        } catch (n2.g e13) {
            u(e13, e13.f15143a);
        } catch (u2.b e14) {
            u(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        boolean z10;
        o1[] o1VarArr = this.f10830a;
        int c10 = o1VarArr[i10].c();
        o1 o1Var = o1VarArr[i10];
        f fVar = o1Var.f10806a;
        a3.q qVar = this.f10858y;
        o1Var.a(fVar, qVar);
        f fVar2 = o1Var.f10808c;
        if (fVar2 != null) {
            if (fVar2.f10656n != 0 && o1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            o1Var.a(fVar2, qVar);
            o1Var.i(false);
            if (z10) {
                f fVar3 = o1Var.f10806a;
                fVar2.getClass();
                fVar2.c(17, fVar3);
            }
        }
        o1Var.d = 0;
        H(i10, false);
        this.f10842i0 -= c10;
    }

    public final void i0(boolean z10) {
        if (!z10) {
            this.T = false;
            this.f10846n.d(37);
            o0 o0Var = this.U;
            if (o0Var != null) {
                X(o0Var, false);
                this.U = null;
            }
        }
        this.S = z10;
        d();
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.j():void");
    }

    public final void j0(p1 p1Var) {
        this.R = p1Var;
        d();
    }

    public final void k(u0 u0Var, int i10, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        o1 o1Var = this.f10830a[i10];
        boolean g10 = o1Var.g();
        f fVar = o1Var.f10806a;
        if (!g10) {
            if (u0Var == this.H.f10912i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.v vVar = u0Var.f10894o;
            n1 n1Var = vVar.f45605b[i10];
            x2.r rVar = vVar.f45606c[i10];
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
            this.f10842i0++;
            u2.b1 b1Var = u0Var.f10885c[i10];
            long j10 = u0Var.f10895p;
            u2.f0 f0Var = u0Var.f10887g.f10898a;
            f fVar2 = o1Var.f10808c;
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
            int i13 = o1Var.d;
            a3.q qVar = this.f10858y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                o1Var.f10809f = true;
                fVar2.getClass();
                if (fVar2.f10656n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                e2.d.g(z15);
                fVar2.d = n1Var;
                fVar2.G = f0Var;
                fVar2.f10656n = 1;
                fVar2.p(z13, z11);
                fVar2.y(sVarArr, b1Var, j3, j10, f0Var);
                fVar2.f10661y = false;
                fVar2.f10659w = j3;
                fVar2.f10660x = j3;
                fVar2.q(j3, z13);
                qVar.c(fVar2);
            } else {
                o1Var.e = true;
                if (fVar.f10656n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                e2.d.g(z14);
                fVar.d = n1Var;
                fVar.G = f0Var;
                fVar.f10656n = 1;
                fVar.p(z13, z11);
                fVar.y(sVarArr, b1Var, j3, j10, f0Var);
                fVar.f10661y = false;
                fVar.f10659w = j3;
                fVar.f10660x = j3;
                fVar.q(j3, z13);
                qVar.c(fVar);
            }
            j0 j0Var = new j0(this);
            f d = o1Var.d(u0Var);
            d.getClass();
            d.c(11, j0Var);
            if (z12 && z11) {
                o1Var.m();
            }
        }
    }

    public final void k0(q1 q1Var) {
        this.Q = q1Var;
    }

    public final void l(long j3, boolean[] zArr) {
        o1[] o1VarArr;
        long j10;
        u0 u0Var = this.H.f10913j;
        x2.v vVar = u0Var.f10894o;
        int i10 = 0;
        while (true) {
            o1VarArr = this.f10830a;
            if (i10 >= o1VarArr.length) {
                break;
            }
            if (!vVar.b(i10)) {
                o1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < o1VarArr.length) {
            if (!vVar.b(i11) || o1VarArr[i11].d(u0Var) != null) {
                j10 = j3;
            } else {
                j10 = j3;
                k(u0Var, i11, zArr[i11], j10);
            }
            i11++;
            j3 = j10;
        }
    }

    public final void l0(boolean z10) {
        this.f10837e0 = z10;
        b2.k1 k1Var = this.V.f10726a;
        w0 w0Var = this.H;
        w0Var.h = z10;
        int r10 = w0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    @Override
    public final void m(u2.d1 d1Var) {
        this.f10846n.a(9, (u2.d0) d1Var).b();
    }

    public final void m0(u2.g1 g1Var) {
        this.W.f(1);
        g1 g1Var2 = this.I;
        int size = g1Var2.f10712b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.h().e(0, size);
        }
        g1Var2.f10717j = g1Var;
        w(g1Var2.b(), false);
    }

    public final long n(b2.k1 k1Var, Object obj, long j3) {
        b2.h1 h1Var = this.f10856w;
        int i10 = k1Var.g(obj, h1Var).f3013c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        if (j1Var.f3060f == -9223372036854775807L || !j1Var.a() || !j1Var.f3062i) {
            return -9223372036854775807L;
        }
        return e2.d0.Q(e2.d0.A(j1Var.f3061g) - j1Var.f3060f) - (j3 + h1Var.e);
    }

    public final void n0(int i10) {
        h1 h1Var = this.V;
        if (h1Var.e != i10) {
            if (i10 != 2) {
                this.f10849p0 = -9223372036854775807L;
            }
            if (i10 != 3 && h1Var.f10738p) {
                this.V = h1Var.i(false);
            }
            this.V = this.V.h(i10);
        }
    }

    public final long o(u0 u0Var) {
        if (u0Var == null) {
            return 0L;
        }
        long j3 = u0Var.f10895p;
        if (!u0Var.e) {
            return j3;
        }
        int i10 = 0;
        while (true) {
            o1[] o1VarArr = this.f10830a;
            if (i10 < o1VarArr.length) {
                if (o1VarArr[i10].d(u0Var) != null) {
                    f d = o1VarArr[i10].d(u0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f10660x;
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
        o1[] o1VarArr;
        for (o1 o1Var : this.f10830a) {
            f fVar = o1Var.f10806a;
            if (fVar.f10653b == 2) {
                fVar.c(7, yVar);
                f fVar2 = o1Var.f10808c;
                if (fVar2 != null) {
                    fVar2.c(7, yVar);
                }
            }
        }
    }

    public final Pair p(b2.k1 k1Var) {
        long j3 = 0;
        if (k1Var.p()) {
            return Pair.create(h1.f10725u, 0L);
        }
        int a2 = k1Var.a(this.f10837e0);
        Pair i10 = k1Var.i(this.v, this.f10856w, a2, -9223372036854775807L);
        u2.f0 p5 = this.H.p(k1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f43749a;
            b2.h1 h1Var = this.f10856w;
            k1Var.g(obj, h1Var);
            if (p5.f43751c == h1Var.e(p5.f43750b)) {
                h1Var.f3015g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j3));
    }

    public final void p0(Object obj, e2.g gVar) {
        o1[] o1VarArr;
        for (o1 o1Var : this.f10830a) {
            f fVar = o1Var.f10806a;
            if (fVar.f10653b == 2) {
                int i10 = o1Var.d;
                if (i10 != 4 && i10 != 1) {
                    fVar.c(1, obj);
                } else {
                    f fVar2 = o1Var.f10808c;
                    fVar2.getClass();
                    fVar2.c(1, obj);
                }
            }
        }
        int i11 = this.V.e;
        if (i11 == 3 || i11 == 2) {
            this.f10846n.e(2);
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final long q(long j3) {
        u0 u0Var = this.H.f10915l;
        if (u0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f10844k0 - u0Var.f10895p));
    }

    public final void q0(float f7) {
        o1[] o1VarArr;
        this.f10855t0 = f7;
        float f10 = f7 * this.P.f10645g;
        for (o1 o1Var : this.f10830a) {
            f fVar = o1Var.f10806a;
            if (fVar.f10653b == 1) {
                fVar.c(2, Float.valueOf(f10));
                f fVar2 = o1Var.f10808c;
                if (fVar2 != null) {
                    fVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void r(int i10) {
        h1 h1Var = this.V;
        z0(i10, h1Var.f10736n, h1Var.f10735m, h1Var.f10734l);
    }

    public final boolean r0() {
        h1 h1Var = this.V;
        if (h1Var.f10734l && h1Var.f10736n == 0) {
            return true;
        }
        return false;
    }

    public final void s() {
        q0(this.f10855t0);
    }

    public final boolean s0(b2.k1 k1Var, u2.f0 f0Var) {
        if (!f0Var.b() && !k1Var.p()) {
            int i10 = k1Var.g(f0Var.f43749a, this.f10856w).f3013c;
            b2.j1 j1Var = this.v;
            k1Var.n(i10, j1Var);
            if (j1Var.a() && j1Var.f3062i && j1Var.f3060f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(u2.d0 d0Var) {
        w0 w0Var = this.H;
        u0 u0Var = w0Var.f10915l;
        if (u0Var != null && u0Var.f10883a == d0Var) {
            w0Var.m(this.f10844k0);
            D();
            return;
        }
        u0 u0Var2 = w0Var.f10916m;
        if (u0Var2 != null && u0Var2.f10883a == d0Var) {
            E();
        }
    }

    public final void t0() {
        u0 u0Var = this.H.f10912i;
        if (u0Var != null) {
            x2.v vVar = u0Var.f10894o;
            int i10 = 0;
            while (true) {
                o1[] o1VarArr = this.f10830a;
                if (i10 < o1VarArr.length) {
                    if (vVar.b(i10)) {
                        o1VarArr[i10].m();
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
        u0 u0Var = this.H.f10912i;
        if (u0Var != null) {
            nVar = nVar.a(u0Var.f10887g.f10898a);
        }
        e2.a.f("ExoPlayerImplInternal", "Playback error", nVar);
        u0(false, false);
        this.V = this.V.f(nVar);
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f10839f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.W.f(z11 ? 1 : 0);
        k kVar = this.f10838f;
        if (kVar.h.remove(this.L) != null) {
            kVar.d();
        }
        this.P.d(1, this.V.f10734l);
        n0(1);
    }

    public final void v(boolean z10) {
        u2.f0 f0Var;
        long d;
        u0 u0Var = this.H.f10915l;
        if (u0Var == null) {
            f0Var = this.V.f10727b;
        } else {
            f0Var = u0Var.f10887g.f10898a;
        }
        boolean equals = this.V.f10733k.equals(f0Var);
        if (!equals) {
            this.V = this.V.c(f0Var);
        }
        h1 h1Var = this.V;
        if (u0Var == null) {
            d = h1Var.f10741s;
        } else {
            d = u0Var.d();
        }
        h1Var.f10739q = d;
        h1 h1Var2 = this.V;
        h1Var2.f10740r = q(h1Var2.f10739q);
        if ((!equals || z10) && u0Var != null && u0Var.e) {
            x0(u0Var.f10894o);
        }
    }

    public final void v0() {
        o1[] o1VarArr;
        a3.q qVar = this.f10858y;
        qVar.f181b = false;
        r1 r1Var = (r1) qVar.f182c;
        if (r1Var.f10873c) {
            r1Var.c(r1Var.a());
            r1Var.f10873c = false;
        }
        for (o1 o1Var : this.f10830a) {
            f fVar = o1Var.f10808c;
            f fVar2 = o1Var.f10806a;
            if (o1.h(fVar2)) {
                o1.b(fVar2);
            }
            if (fVar != null && fVar.f10656n != 0) {
                o1.b(fVar);
            }
        }
    }

    public final void w(b2.k1 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.w(b2.k1, boolean):void");
    }

    public final void w0() {
        boolean z10;
        u0 u0Var = this.H.f10915l;
        if (!this.f10835c0 && (u0Var == null || !u0Var.f10883a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        h1 h1Var = this.V;
        if (z10 != h1Var.f10730g) {
            this.V = h1Var.b(z10);
        }
    }

    public final void x(u2.d0 d0Var) {
        u0 u0Var;
        w0 w0Var = this.H;
        u0 u0Var2 = w0Var.f10915l;
        a3.q qVar = this.f10858y;
        if (u0Var2 != null && u0Var2.f10883a == d0Var) {
            u0Var2.getClass();
            if (!u0Var2.e) {
                float f7 = qVar.h().f3335a;
                h1 h1Var = this.V;
                u0Var2.f(f7, h1Var.f10726a, h1Var.f10734l);
            }
            x0(u0Var2.f10894o);
            if (u0Var2 == w0Var.f10912i) {
                R(u0Var2.f10887g.f10899b);
                l(w0Var.f10913j.e(), new boolean[this.f10830a.length]);
                u0Var2.h = true;
                h1 h1Var2 = this.V;
                u2.f0 f0Var = h1Var2.f10727b;
                long j3 = u0Var2.f10887g.f10899b;
                this.V = z(f0Var, j3, h1Var2.f10728c, j3, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < w0Var.f10920q.size()) {
                u0Var = (u0) w0Var.f10920q.get(i10);
                if (u0Var.f10883a == d0Var) {
                    break;
                }
                i10++;
            } else {
                u0Var = null;
                break;
            }
        }
        if (u0Var != null) {
            e2.d.g(true ^ u0Var.e);
            float f10 = qVar.h().f3335a;
            h1 h1Var3 = this.V;
            u0Var.f(f10, h1Var3.f10726a, h1Var3.f10734l);
            u0 u0Var3 = w0Var.f10916m;
            if (u0Var3 != null && u0Var3.f10883a == d0Var) {
                E();
            }
        }
    }

    public final void x0(x2.v vVar) {
        u0 u0Var = this.H.f10915l;
        u0Var.getClass();
        q(u0Var.d());
        if (s0(this.V.f10726a, u0Var.f10887g.f10898a)) {
            long j3 = this.J.h;
        }
        b2.k1 k1Var = this.V.f10726a;
        float f7 = this.f10858y.h().f3335a;
        boolean z10 = this.V.f10734l;
        x2.r[] rVarArr = vVar.f45606c;
        k kVar = this.f10838f;
        j jVar = (j) kVar.h.get(this.L);
        jVar.getClass();
        int i10 = kVar.f10762f;
        if (i10 == -1) {
            int length = rVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    x2.r rVar = rVarArr[i11];
                    if (rVar != null) {
                        switch (rVar.b().f3092c) {
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
        jVar.f10757b = i10;
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
        float f10 = v0Var.f3335a;
        u0 u0Var = this.H.f10912i;
        while (true) {
            i10 = 0;
            if (u0Var == null) {
                break;
            }
            x2.r[] rVarArr = u0Var.f10894o.f45606c;
            int length = rVarArr.length;
            while (i10 < length) {
                x2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f10);
                }
                i10++;
            }
            u0Var = u0Var.f10892m;
        }
        o1[] o1VarArr = this.f10830a;
        int length2 = o1VarArr.length;
        while (i10 < length2) {
            o1 o1Var = o1VarArr[i10];
            float f11 = v0Var.f3335a;
            o1Var.f10806a.z(f7, f11);
            f fVar = o1Var.f10808c;
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
        g1 g1Var = this.I;
        g1Var.getClass();
        ArrayList arrayList = g1Var.f10712b;
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
            ((f1) arrayList.get(i12)).f10696a.t((b2.k0) list.get(i12 - i10));
        }
        w(g1Var.b(), false);
    }

    public final h1 z(u2.f0 f0Var, long j3, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        e9.a1 a1Var;
        boolean z13;
        boolean z14;
        if (!this.f10847n0 && j3 == this.V.f10741s && f0Var.equals(this.V.f10727b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f10847n0 = z11;
        Q();
        h1 h1Var = this.V;
        u2.p1 p1Var = h1Var.h;
        x2.v vVar = h1Var.f10731i;
        List list = h1Var.f10732j;
        if (this.I.f10718k) {
            u0 u0Var = this.H.f10912i;
            if (u0Var == null) {
                p1Var = u2.p1.d;
            } else {
                p1Var = u0Var.f10893n;
            }
            if (u0Var == null) {
                vVar = this.e;
            } else {
                vVar = u0Var.f10894o;
            }
            x2.r[] rVarArr = vVar.f45606c;
            ?? wVar = new com.google.android.gms.common.api.internal.w(4);
            boolean z15 = false;
            for (x2.r rVar : rVarArr) {
                if (rVar != null) {
                    b2.p0 p0Var = rVar.f(0).f3302l;
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
                e9.g0 g0Var = e9.i0.f8078b;
                a1Var = e9.a1.e;
            }
            list = a1Var;
            if (u0Var != null) {
                v0 v0Var = u0Var.f10887g;
                if (v0Var.f10900c != j10) {
                    u0Var.f10887g = v0Var.a(j10);
                }
            }
            o1[] o1VarArr = this.f10830a;
            w0 w0Var = this.H;
            u0 u0Var2 = w0Var.f10912i;
            if (u0Var2 == w0Var.f10913j && u0Var2 != null) {
                x2.v vVar2 = u0Var2.f10894o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < o1VarArr.length) {
                        if (vVar2.b(i11)) {
                            if (o1VarArr[i11].f10806a.f10653b != 1) {
                                z13 = false;
                                break;
                            } else if (vVar2.f45605b[i11].f10799a != 0) {
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
                if (z14 != this.f10841h0) {
                    this.f10841h0 = z14;
                    if (!z14 && this.V.f10738p) {
                        this.f10846n.e(2);
                    }
                }
            }
        } else if (!f0Var.equals(h1Var.f10727b)) {
            p1Var = u2.p1.d;
            vVar = this.e;
            list = e9.a1.e;
        }
        u2.p1 p1Var2 = p1Var;
        x2.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            m0 m0Var = this.W;
            if (m0Var.d && m0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
            } else {
                m0Var.f10782c = true;
                m0Var.d = true;
                m0Var.e = i10;
            }
        }
        h1 h1Var2 = this.V;
        return h1Var2.d(f0Var, j3, j10, j11, q(h1Var2.f10739q), p1Var2, vVar3, list2);
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
        h1 h1Var = this.V;
        if (h1Var.f10734l != z11 || h1Var.f10736n != i11 || h1Var.f10735m != i12) {
            this.V = h1Var.e(i12, i11, z11);
            C0(false, false);
            w0 w0Var = this.H;
            for (u0 u0Var = w0Var.f10912i; u0Var != null; u0Var = u0Var.f10892m) {
                for (x2.r rVar : u0Var.f10894o.f45606c) {
                    if (rVar != null) {
                        rVar.e(z11);
                    }
                }
            }
            if (!r0()) {
                v0();
                A0();
                h1 h1Var2 = this.V;
                if (h1Var2.f10738p) {
                    this.V = h1Var2.i(false);
                }
                w0Var.m(this.f10844k0);
                return;
            }
            int i13 = this.V.e;
            e2.z zVar = this.f10846n;
            if (i13 == 3) {
                a3.q qVar = this.f10858y;
                qVar.f181b = true;
                ((r1) qVar.f182c).d();
                t0();
                zVar.e(2);
            } else if (i13 == 2) {
                zVar.e(2);
            }
        }
    }
}
