package l2;

import a8.ja;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import di.t7;
import h9.s1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kg.t1;
public final class o0 implements Handler.Callback, x2.c0, h1, d3.v {
    public static final long f19120x0 = h2.l0.h0(10000);
    public final i E;
    public final ArrayList F;
    public final h2.g0 G;
    public final u H;
    public final w0 I;
    public final f1 J;
    public final f K;
    public final long L;
    public final m2.j M;
    public final m2.e N;
    public final h2.i0 O;
    public final boolean P;
    public final f2.d Q;
    public final boolean R;
    public p1 S;
    public o1 T;
    public boolean U;
    public boolean V;
    public n0 W;
    public int X;
    public g1 Y;
    public l0 Z;
    public final n1[] f19121a;
    public boolean f19122a0;
    public final b[] f19123b;
    public boolean f19124b0;
    public final boolean[] f19125c;
    public boolean f19126c0;
    public final a3.x d;
    public boolean f19127d0;
    public final a3.y f19128e;
    public long f19129e0;
    public final q0 f19130f;
    public boolean f19131f0;
    public int f19132g0;
    public final b3.d h;
    public boolean f19133h0;
    public boolean f19134i0;
    public boolean f19135j0;
    public boolean f19136k0;
    public int f19137l0;
    public n0 m0;
    public final h2.i0 f19138n;
    public long f19139n0;
    public long f19140o0;
    public int f19141p0;
    public boolean f19142q0;
    public final m6.n f19143r;
    public l f19144r0;
    public final Looper f19145s;
    public long f19146s0;
    public o f19147t0;
    public long f19148u0;
    public boolean f19149v0;
    public final e2.k1 f19150w;
    public float f19151w0;
    public final e2.i1 f19152x;
    public final long f19153y;

    public o0(Context context, b[] bVarArr, b[] bVarArr2, a3.x xVar, a3.y yVar, q0 q0Var, b3.d dVar, int i7, boolean z10, m2.e eVar, p1 p1Var, f fVar, long j3, Looper looper, h2.g0 g0Var, u uVar, m2.j jVar, final d3.v vVar, boolean z11) {
        o oVar = o.f19119a;
        this.f19148u0 = -9223372036854775807L;
        this.H = uVar;
        this.d = xVar;
        this.f19128e = yVar;
        this.f19130f = q0Var;
        this.h = dVar;
        this.f19132g0 = i7;
        this.f19133h0 = z10;
        this.S = p1Var;
        this.K = fVar;
        this.L = j3;
        this.f19124b0 = false;
        this.G = g0Var;
        this.M = jVar;
        this.f19147t0 = oVar;
        this.N = eVar;
        this.f19151w0 = 1.0f;
        this.T = o1.f19154b;
        this.R = z11;
        this.f19146s0 = -9223372036854775807L;
        this.f19129e0 = -9223372036854775807L;
        this.f19153y = ((h) q0Var).f19035n;
        e2.h1 h1Var = e2.l1.f10190a;
        g1 k10 = g1.k(yVar);
        this.Y = k10;
        this.Z = new l0(k10);
        this.f19123b = new b[bVarArr.length];
        this.f19125c = new boolean[bVarArr.length];
        a3.s sVar = (a3.s) xVar;
        sVar.getClass();
        this.f19121a = new n1[bVarArr.length];
        boolean z12 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.f18891e = i10;
            bVar.f18892f = jVar;
            bVar.h = g0Var;
            this.f19123b[i10] = bVar;
            b bVar2 = this.f19123b[i10];
            synchronized (bVar2.f18888a) {
                bVar2.I = sVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.f18891e = i10;
                bVar3.f18892f = jVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f19121a[i10] = new n1(bVarArr[i10], bVar3, i10);
        }
        this.P = z12;
        this.E = new i(this, g0Var);
        this.F = new ArrayList();
        this.f19150w = new e2.k1();
        this.f19152x = new e2.i1();
        ja.p(xVar.f140a == null);
        xVar.f140a = this;
        xVar.f141b = dVar;
        this.f19142q0 = true;
        h2.i0 a10 = g0Var.a(looper, null);
        this.O = a10;
        this.I = new w0(eVar, a10, new ki.e(this, 8));
        this.J = new f1(this, eVar, a10, jVar);
        m6.n nVar = new m6.n(7);
        this.f19143r = nVar;
        Looper d = nVar.d();
        this.f19145s = d;
        h2.i0 a11 = g0Var.a(d, this);
        this.f19138n = a11;
        this.Q = new f2.d(context, d, this);
        a11.b(35, new d3.v() {
            @Override
            public final void a(long j10, long j11, e2.u uVar2, MediaFormat mediaFormat) {
                o0 o0Var = o0.this;
                o0Var.getClass();
                vVar.a(j10, j11, uVar2, mediaFormat);
                o0Var.a(j10, j11, uVar2, mediaFormat);
            }
        }).b();
        a11.b(39, new h0(this)).b();
    }

    public static Pair S(e2.l1 l1Var, n0 n0Var, boolean z10, int i7, boolean z11, e2.k1 k1Var, e2.i1 i1Var) {
        e2.l1 l1Var2;
        int T;
        e2.l1 l1Var3 = n0Var.f19111a;
        if (!l1Var.p()) {
            if (l1Var3.p()) {
                l1Var2 = l1Var;
            } else {
                l1Var2 = l1Var3;
            }
            try {
                Pair i10 = l1Var2.i(k1Var, i1Var, n0Var.f19112b, n0Var.f19113c);
                if (!l1Var.equals(l1Var2)) {
                    if (l1Var.b(i10.first) != -1) {
                        if (l1Var2.g(i10.first, i1Var).f10120f && l1Var2.m(i1Var.f10118c, k1Var, 0L).f10171n == l1Var2.b(i10.first)) {
                            return l1Var.i(k1Var, i1Var, l1Var.g(i10.first, i1Var).f10118c, n0Var.f19113c);
                        }
                    } else if (z10 && (T = T(k1Var, i1Var, i7, z11, i10.first, l1Var2, l1Var)) != -1) {
                        return l1Var.i(k1Var, i1Var, T, -9223372036854775807L);
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

    public static int T(e2.k1 k1Var, e2.i1 i1Var, int i7, boolean z10, Object obj, e2.l1 l1Var, e2.l1 l1Var2) {
        e2.k1 k1Var2 = k1Var;
        e2.l1 l1Var3 = l1Var;
        Object obj2 = l1Var3.m(l1Var3.g(obj, i1Var).f10118c, k1Var, 0L).f10160a;
        for (int i10 = 0; i10 < l1Var2.o(); i10++) {
            if (l1Var2.m(i10, k1Var, 0L).f10160a.equals(obj2)) {
                return i10;
            }
        }
        int b10 = l1Var3.b(obj);
        int h = l1Var3.h();
        int i11 = -1;
        int i12 = 0;
        while (i12 < h && i11 == -1) {
            e2.l1 l1Var4 = l1Var3;
            int d = l1Var4.d(b10, i1Var, k1Var2, i7, z10);
            if (d == -1) {
                break;
            }
            i11 = l1Var2.b(l1Var4.l(d));
            i12++;
            l1Var3 = l1Var4;
            b10 = d;
            k1Var2 = k1Var;
        }
        if (i11 == -1) {
            return -1;
        }
        return l1Var2.f(i11, i1Var, false).f10118c;
    }

    public static void f(j1 j1Var) {
        try {
            synchronized (j1Var) {
                synchronized (j1Var) {
                }
                j1Var.f19052a.c(j1Var.f19054c, j1Var.d);
                return;
            }
            j1Var.f19052a.c(j1Var.f19054c, j1Var.d);
            return;
        } finally {
            j1Var.a(true);
        }
    }

    public static boolean z(u0 u0Var) {
        x2.b1[] b1VarArr;
        long e10;
        if (u0Var != null) {
            try {
                ?? r12 = u0Var.f19184a;
                if (!u0Var.f19187e) {
                    r12.i();
                } else {
                    for (x2.b1 b1Var : u0Var.f19186c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                }
                if (!u0Var.f19187e) {
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

    public final boolean A(int i7, x2.f0 f0Var) {
        boolean z10;
        boolean z11;
        w0 w0Var = this.I;
        u0 u0Var = w0Var.f19219k;
        if (u0Var != null && u0Var.f19189g.f19200a.equals(f0Var)) {
            n1 n1Var = this.f19121a[i7];
            u0 u0Var2 = w0Var.f19219k;
            int i10 = n1Var.d;
            if ((i10 == 2 || i10 == 4) && n1Var.d(u0Var2) == n1Var.f19114a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (n1Var.d == 3 && n1Var.d(u0Var2) == n1Var.f19116c) {
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
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.A0():void");
    }

    public final boolean B() {
        u0 u0Var = this.I.f19217i;
        long j3 = u0Var.f19189g.f19204f;
        if (u0Var.f19187e) {
            if (j3 == -9223372036854775807L || this.Y.f19021s < j3 || !s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0(int i7, int i10, int i11, boolean z10) {
        boolean z11;
        a3.u[] uVarArr;
        if (z10 && i7 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i7 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z12 = this.U;
        if (i7 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            if (z12) {
                i10 = 4;
            } else {
                i10 = 0;
            }
        }
        g1 g1Var = this.Y;
        if (g1Var.f19014l != z11 || g1Var.f19016n != i10 || g1Var.f19015m != i11) {
            this.Y = g1Var.e(i11, i10, z11);
            E0(false, false);
            w0 w0Var = this.I;
            for (u0 u0Var = w0Var.f19217i; u0Var != null; u0Var = u0Var.f19194m) {
                for (a3.u uVar : u0Var.f19196o.f145c) {
                    if (uVar != null) {
                        uVar.f(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                g1 g1Var2 = this.Y;
                if (g1Var2.f19018p) {
                    this.Y = g1Var2.i(false);
                }
                w0Var.m(this.f19139n0);
                return;
            }
            int i12 = this.Y.f19008e;
            h2.i0 i0Var = this.f19138n;
            if (i12 == 3) {
                i iVar = this.E;
                iVar.f19041b = true;
                ((q1) iVar.f19042c).d();
                u0();
                i0Var.f(2);
            } else if (i12 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final void C() {
        long e10;
        long j3;
        boolean b10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!z(this.I.f19220l)) {
            b10 = false;
        } else {
            u0 u0Var = this.I.f19220l;
            if (!u0Var.f19187e) {
                e10 = 0;
            } else {
                e10 = u0Var.f19184a.e();
            }
            long p10 = p(e10);
            u0 u0Var2 = this.I.f19217i;
            if (t0(this.Y.f19005a, u0Var.f19189g.f19200a)) {
                j3 = this.K.h;
            } else {
                j3 = -9223372036854775807L;
            }
            m2.j jVar = this.M;
            e2.l1 l1Var = this.Y.f19005a;
            x2.f0 f0Var = u0Var.f19189g.f19200a;
            float f10 = this.E.j().f10474a;
            boolean z13 = this.Y.f19014l;
            p0 p0Var = new p0(jVar, l1Var, f0Var, p10, f10, this.f19127d0, j3);
            b10 = ((h) this.f19130f).b(p0Var);
            u0 u0Var3 = this.I.f19217i;
            if (!b10 && u0Var3.f19187e && p10 < 500000 && this.f19153y > 0) {
                u0Var3.f19184a.l(this.Y.f19021s);
                b10 = ((h) this.f19130f).b(p0Var);
            }
        }
        this.f19131f0 = b10;
        if (b10) {
            u0 u0Var4 = this.I.f19220l;
            u0Var4.getClass();
            r0 r0Var = new r0();
            r0Var.f19172a = this.f19139n0 - u0Var4.f19197p;
            float f11 = this.E.j().f10474a;
            if (f11 <= 0.0f && f11 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            ja.f(z10);
            r0Var.f19173b = f11;
            long j10 = this.f19129e0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            ja.f(z11);
            r0Var.f19174c = j10;
            s0 s0Var = new s0(r0Var);
            if (u0Var4.f19194m == null) {
                z12 = true;
            }
            ja.p(z12);
            u0Var4.f19184a.c(s0Var);
        }
        x0();
    }

    public final void C0() {
        long j3;
        boolean z10;
        long j10;
        long max;
        long j11;
        float f10;
        u0 u0Var = this.I.f19217i;
        if (u0Var != null) {
            if (u0Var.f19187e) {
                j3 = u0Var.f19184a.o();
            } else {
                j3 = -9223372036854775807L;
            }
            if (j3 != -9223372036854775807L) {
                if (!u0Var.g()) {
                    this.I.n(u0Var);
                    u(false);
                    C();
                }
                Q(j3, true);
                if (j3 != this.Y.f19021s) {
                    g1 g1Var = this.Y;
                    this.Y = y(g1Var.f19006b, j3, g1Var.f19007c, j3, true, 5);
                }
            } else {
                i iVar = this.E;
                if (u0Var != this.I.f19218j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q1 q1Var = (q1) iVar.f19042c;
                b bVar = (b) iVar.f19043e;
                if (bVar != null && !bVar.l() && ((!z10 || ((b) iVar.f19043e).f18893n == 2) && (((b) iVar.f19043e).m() || (!z10 && !((b) iVar.f19043e).k())))) {
                    t0 t0Var = (t0) iVar.f19044f;
                    t0Var.getClass();
                    long a10 = t0Var.a();
                    if (iVar.f19040a) {
                        if (a10 < q1Var.a()) {
                            if (q1Var.f19168c) {
                                q1Var.c(q1Var.a());
                                q1Var.f19168c = false;
                            }
                        } else {
                            iVar.f19040a = false;
                            if (iVar.f19041b) {
                                q1Var.d();
                            }
                        }
                    }
                    q1Var.c(a10);
                    e2.w0 j12 = t0Var.j();
                    if (!j12.equals((e2.w0) q1Var.f19169e)) {
                        q1Var.e(j12);
                        ((o0) iVar.d).f19138n.b(16, j12).b();
                    }
                } else {
                    iVar.f19040a = true;
                    if (iVar.f19041b) {
                        q1Var.d();
                    }
                }
                long a11 = iVar.a();
                this.f19139n0 = a11;
                long j13 = a11 - u0Var.f19197p;
                long j14 = this.Y.f19021s;
                ArrayList arrayList = this.F;
                if (!arrayList.isEmpty() && !this.Y.f19006b.b()) {
                    if (this.f19142q0) {
                        this.f19142q0 = false;
                    }
                    g1 g1Var2 = this.Y;
                    g1Var2.f19005a.b(g1Var2.f19006b.f59523a);
                    int min = Math.min(this.f19141p0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f19141p0 = min;
                }
                if (this.E.b()) {
                    boolean z11 = !this.Z.d;
                    g1 g1Var3 = this.Y;
                    this.Y = y(g1Var3.f19006b, j13, g1Var3.f19007c, j13, z11, 6);
                } else {
                    g1 g1Var4 = this.Y;
                    g1Var4.f19021s = j13;
                    g1Var4.f19022t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.f19019q = this.I.f19220l.d();
            g1 g1Var5 = this.Y;
            g1Var5.f19020r = p(g1Var5.f19019q);
            g1 g1Var6 = this.Y;
            if (g1Var6.f19014l && g1Var6.f19008e == 3 && t0(g1Var6.f19005a, g1Var6.f19006b)) {
                g1 g1Var7 = this.Y;
                float f11 = 1.0f;
                if (g1Var7.f19017o.f10474a == 1.0f) {
                    f fVar = this.K;
                    long m10 = m(g1Var7.f19005a, g1Var7.f19006b.f59523a, g1Var7.f19021s);
                    long j15 = this.Y.f19020r;
                    if (fVar.f18938c != -9223372036854775807L) {
                        long j16 = m10 - j15;
                        if (fVar.f18946m == -9223372036854775807L) {
                            fVar.f18946m = j16;
                            fVar.f18947n = 0L;
                        } else {
                            fVar.f18946m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j10) * 0.999f));
                            fVar.f18947n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) fVar.f18947n) * 0.999f);
                        }
                        if (fVar.f18945l != -9223372036854775807L) {
                            j11 = 1000;
                            if (SystemClock.elapsedRealtime() - fVar.f18945l < 1000) {
                                f11 = fVar.f18944k;
                            }
                        } else {
                            j11 = 1000;
                        }
                        fVar.f18945l = SystemClock.elapsedRealtime();
                        long j17 = (fVar.f18947n * 3) + fVar.f18946m;
                        if (fVar.h > j17) {
                            float S = (float) h2.l0.S(j11);
                            f10 = 1.0E-7f;
                            long[] jArr = {j17, fVar.f18939e, fVar.h - (((fVar.f18944k - 1.0f) * S) + ((fVar.f18942i - 1.0f) * S))};
                            long j18 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j19 = jArr[i7];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            fVar.h = j18;
                        } else {
                            f10 = 1.0E-7f;
                            long j20 = h2.l0.j(m10 - (Math.max(0.0f, fVar.f18944k - 1.0f) / 1.0E-7f), fVar.h, j17);
                            fVar.h = j20;
                            long j21 = fVar.f18941g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                fVar.h = j21;
                            }
                        }
                        long j22 = m10 - fVar.h;
                        if (Math.abs(j22) < fVar.f18936a) {
                            fVar.f18944k = 1.0f;
                        } else {
                            fVar.f18944k = h2.l0.h((f10 * ((float) j22)) + 1.0f, fVar.f18943j, fVar.f18942i);
                        }
                        f11 = fVar.f18944k;
                    }
                    if (this.E.j().f10474a != f11) {
                        e2.w0 w0Var = new e2.w0(f11, this.Y.f19017o.f10475b);
                        this.f19138n.e(16);
                        this.E.e(w0Var);
                        x(this.Y.f19017o, this.E.j().f10474a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        boolean z10;
        boolean z11;
        w0 w0Var = this.I;
        w0Var.k();
        u0 u0Var = w0Var.f19221m;
        if (u0Var != null) {
            ?? r12 = u0Var.f19184a;
            if ((!u0Var.d || u0Var.f19187e) && !r12.g()) {
                e2.l1 l1Var = this.Y.f19005a;
                if (u0Var.f19187e) {
                    r12.s();
                }
                for (g gVar : ((h) this.f19130f).f19037p.values()) {
                    if (gVar.f19000b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!u0Var.d) {
                    long j3 = u0Var.f19189g.f19201b;
                    u0Var.d = true;
                    r12.t(this, j3);
                    return;
                }
                r0 r0Var = new r0();
                r0Var.f19172a = this.f19139n0 - u0Var.f19197p;
                float f10 = this.E.j().f10474a;
                if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ja.f(z10);
                r0Var.f19173b = f10;
                long j10 = this.f19129e0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ja.f(z11);
                r0Var.f19174c = j10;
                s0 s0Var = new s0(r0Var);
                if (u0Var.f19194m != null) {
                    z12 = false;
                }
                ja.p(z12);
                r12.c(s0Var);
            }
        }
    }

    public final void D0(e2.l1 l1Var, x2.f0 f0Var, e2.l1 l1Var2, x2.f0 f0Var2, long j3, boolean z10) {
        Object obj;
        e2.w0 w0Var;
        boolean t02 = t0(l1Var, f0Var);
        Object obj2 = f0Var.f59523a;
        if (!t02) {
            if (f0Var.b()) {
                w0Var = e2.w0.d;
            } else {
                w0Var = this.Y.f19017o;
            }
            i iVar = this.E;
            if (!iVar.j().equals(w0Var)) {
                this.f19138n.e(16);
                iVar.e(w0Var);
                x(this.Y.f19017o, w0Var.f10474a, false, false);
                return;
            }
            return;
        }
        e2.i1 i1Var = this.f19152x;
        int i7 = l1Var.g(obj2, i1Var).f10118c;
        e2.k1 k1Var = this.f19150w;
        l1Var.n(i7, k1Var);
        e2.f0 f0Var3 = k1Var.f10167j;
        f fVar = this.K;
        fVar.getClass();
        fVar.f18938c = h2.l0.S(f0Var3.f10077a);
        fVar.f18940f = h2.l0.S(f0Var3.f10078b);
        fVar.f18941g = h2.l0.S(f0Var3.f10079c);
        float f10 = f0Var3.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        fVar.f18943j = f10;
        float f11 = f0Var3.f10080e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        fVar.f18942i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            fVar.f18938c = -9223372036854775807L;
        }
        fVar.a();
        if (j3 != -9223372036854775807L) {
            fVar.d = m(l1Var, obj2, j3);
            fVar.a();
            return;
        }
        Object obj3 = k1Var.f10160a;
        if (!l1Var2.p()) {
            obj = l1Var2.m(l1Var2.g(f0Var2.f59523a, i1Var).f10118c, k1Var, 0L).f10160a;
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
        l0 l0Var = this.Z;
        g1 g1Var = this.Y;
        boolean z11 = l0Var.f19067c;
        if (((g1) l0Var.f19069f) != g1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        l0Var.f19067c = z12;
        l0Var.f19069f = g1Var;
        if (z12) {
            f0 f0Var = this.H.f19183b;
            f0Var.f18963j.d(new t1(11, f0Var, l0Var));
            this.Z = new l0(this.Y);
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j3;
        this.f19127d0 = z10;
        if (z10 && !z11) {
            this.G.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f19129e0 = j3;
    }

    public final void F(int i7) {
        n1 n1Var = this.f19121a[i7];
        try {
            u0 u0Var = this.I.f19217i;
            u0Var.getClass();
            b d = n1Var.d(u0Var);
            d.getClass();
            x2.b1 b1Var = d.f18894r;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = n1Var.f19114a.f18889b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            a3.y yVar = this.I.f19217i.f19196o;
            h2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + e2.u.c(yVar.f145c[i7].n()), e10);
            a3.y yVar2 = new a3.y((m1[]) yVar.f144b.clone(), (a3.u[]) yVar.f145c.clone(), yVar.d, yVar.f146e);
            yVar2.f144b[i7] = null;
            yVar2.f145c[i7] = null;
            h(i7);
            u0 u0Var2 = this.I.f19217i;
            u0Var2.a(yVar2, this.Y.f19021s, false, new boolean[u0Var2.f19191j.length]);
        }
    }

    public final void G(int i7, boolean z10) {
        boolean[] zArr = this.f19125c;
        if (zArr[i7] != z10) {
            zArr[i7] = z10;
            this.O.d(new t7(this, i7, z10, 1));
        }
    }

    public final void H() {
        v(this.J.b(), true);
    }

    public final void I(k0 k0Var) {
        boolean z10;
        e2.l1 b10;
        this.Z.f(1);
        int i7 = k0Var.f19057a;
        int i10 = k0Var.f19058b;
        int i11 = k0Var.f19059c;
        x2.g1 g1Var = k0Var.d;
        f1 f1Var = this.J;
        ArrayList arrayList = f1Var.f18990b;
        if (i7 >= 0 && i7 <= i10 && i10 <= arrayList.size() && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        f1Var.f18996j = g1Var;
        if (i7 != i10 && i7 != i11) {
            int min = Math.min(i7, i11);
            int max = Math.max(((i10 - i7) + i11) - 1, i10 - 1);
            int i12 = ((e1) arrayList.get(min)).d;
            h2.l0.R(i7, i10, i11, arrayList);
            while (min <= max) {
                e1 e1Var = (e1) arrayList.get(min);
                e1Var.d = i12;
                i12 += e1Var.f18932a.f59468o.f59643e.o();
                min++;
            }
            b10 = f1Var.b();
        } else {
            b10 = f1Var.b();
        }
        v(b10, false);
    }

    public final void J() {
        boolean z10;
        int i7;
        int i10;
        this.Z.f(1);
        O(false, false, false, true);
        h hVar = (h) this.f19130f;
        ConcurrentHashMap concurrentHashMap = hVar.f19037p;
        long id2 = Thread.currentThread().getId();
        long j3 = hVar.f19038q;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        hVar.f19038q = id2;
        m2.j jVar = this.M;
        g gVar = (g) concurrentHashMap.get(jVar);
        if (gVar == null) {
            ?? obj = new Object();
            obj.f18999a = 1;
            concurrentHashMap.put(jVar, obj);
        } else {
            gVar.f18999a++;
        }
        g gVar2 = (g) concurrentHashMap.get(jVar);
        gVar2.getClass();
        Integer num = (Integer) hVar.f19036o.get(jVar.f20158a);
        if (num != null && num.intValue() != -1) {
            i7 = num.intValue();
        } else {
            i7 = hVar.f19033l;
        }
        if (i7 == -1) {
            i7 = 13107200;
        }
        gVar2.f19001c = i7;
        gVar2.f19000b = false;
        if (this.Y.f19005a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        o0(i10);
        g1 g1Var = this.Y;
        boolean z11 = g1Var.f19014l;
        B0(this.Q.d(g1Var.f19008e, z11), g1Var.f19016n, g1Var.f19015m, z11);
        b3.g gVar3 = (b3.g) this.h;
        gVar3.getClass();
        f1 f1Var = this.J;
        ArrayList arrayList = f1Var.f18990b;
        ja.p(!f1Var.f18997k);
        f1Var.f18998l = gVar3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e1 e1Var = (e1) arrayList.get(i11);
            f1Var.e(e1Var);
            f1Var.f18994g.add(e1Var);
        }
        f1Var.f18997k = true;
        this.f19138n.f(2);
    }

    public final void K(h2.i iVar) {
        m6.n nVar = this.f19143r;
        h2.i0 i0Var = this.f19138n;
        try {
            O(true, false, true, false);
            L();
            q0 q0Var = this.f19130f;
            m2.j jVar = this.M;
            h hVar = (h) q0Var;
            ConcurrentHashMap concurrentHashMap = hVar.f19037p;
            g gVar = (g) concurrentHashMap.get(jVar);
            if (gVar != null) {
                int i7 = gVar.f18999a - 1;
                gVar.f18999a = i7;
                if (i7 == 0) {
                    concurrentHashMap.remove(jVar);
                    hVar.c();
                }
            }
            if (hVar.f19037p.isEmpty()) {
                hVar.f19038q = -1L;
            }
            f2.d dVar = this.Q;
            dVar.f10711c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f13456a.removeCallbacksAndMessages(null);
            nVar.g();
            iVar.e();
        }
    }

    public final void L() {
        boolean z10;
        for (int i7 = 0; i7 < this.f19121a.length; i7++) {
            b bVar = this.f19123b[i7];
            synchronized (bVar.f18888a) {
                bVar.I = null;
            }
            n1 n1Var = this.f19121a[i7];
            b bVar2 = n1Var.f19114a;
            boolean z11 = true;
            if (bVar2.f18893n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
            bVar2.q();
            n1Var.f19117e = false;
            b bVar3 = n1Var.f19116c;
            if (bVar3 != null) {
                if (bVar3.f18893n != 0) {
                    z11 = false;
                }
                ja.p(z11);
                bVar3.q();
                n1Var.f19118f = false;
            }
        }
    }

    public final void M(int i7, int i10, x2.g1 g1Var) {
        boolean z10 = true;
        this.Z.f(1);
        f1 f1Var = this.J;
        f1Var.getClass();
        if (i7 < 0 || i7 > i10 || i10 > f1Var.f18990b.size()) {
            z10 = false;
        }
        ja.f(z10);
        f1Var.f18996j = g1Var;
        f1Var.g(i7, i10);
        v(f1Var.b(), false);
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.N():void");
    }

    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        boolean z10;
        u0 u0Var = this.I.f19217i;
        if (u0Var != null && u0Var.f19189g.f19207j && this.f19124b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19126c0 = z10;
    }

    public final void Q(long j3, boolean z10) {
        w0 w0Var;
        long j10;
        n1[] n1VarArr;
        a3.u[] uVarArr;
        u0 u0Var = this.I.f19217i;
        if (u0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = u0Var.f19197p;
        }
        long j11 = j3 + j10;
        this.f19139n0 = j11;
        ((q1) this.E.f19042c).c(j11);
        for (n1 n1Var : this.f19121a) {
            long j12 = this.f19139n0;
            b d = n1Var.d(u0Var);
            if (d != null) {
                d.z(j12, false, z10);
            }
        }
        for (u0 u0Var2 = w0Var.f19217i; u0Var2 != null; u0Var2 = u0Var2.f19194m) {
            for (a3.u uVar : u0Var2.f19196o.f145c) {
                if (uVar != null) {
                    uVar.s();
                }
            }
        }
    }

    public final void R(e2.l1 l1Var, e2.l1 l1Var2) {
        if (l1Var.p() && l1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.F;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a8.p0.A(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j3) {
        n1[] n1VarArr;
        u0 u0Var;
        long j10;
        boolean z10 = this.U;
        long j11 = 1000;
        long j12 = f19120x0;
        if (z10) {
            this.T.getClass();
            if (this.Y.f19008e != 3) {
                j11 = j12;
            }
            for (n1 n1Var : this.f19121a) {
                long j13 = this.f19139n0;
                long j14 = this.f19140o0;
                b bVar = n1Var.f19116c;
                b bVar2 = n1Var.f19114a;
                if (n1.h(bVar2)) {
                    j10 = bVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f18893n != 0) {
                    j10 = Math.min(j10, bVar.g(j13, j14));
                }
                j11 = Math.min(j11, h2.l0.h0(j10));
            }
            if (this.Y.m()) {
                u0 u0Var2 = this.I.f19217i;
                if (u0Var2 != null) {
                    u0Var = u0Var2.f19194m;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    if ((((float) h2.l0.S(j11)) * this.Y.f19017o.f10474a) + ((float) this.f19139n0) >= ((float) u0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.Y.f19008e != 3 || s0()) {
            j11 = j12;
        }
        this.f19138n.f13456a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void V(boolean z10) {
        x2.f0 f0Var = this.I.f19217i.f19189g.f19200a;
        long X = X(f0Var, this.Y.f19021s, true, false);
        if (X != this.Y.f19021s) {
            g1 g1Var = this.Y;
            this.Y = y(f0Var, X, g1Var.f19007c, g1Var.d, z10, 5);
        }
    }

    public final void W(l2.n0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.W(l2.n0):void");
    }

    public final long X(x2.f0 f0Var, long j3, boolean z10, boolean z11) {
        w0 w0Var;
        n1[] n1VarArr;
        boolean z12;
        n1[] n1VarArr2;
        int i7;
        w0();
        boolean z13 = true;
        E0(false, true);
        if (z11 || this.Y.f19008e == 3) {
            o0(2);
        }
        u0 u0Var = this.I.f19217i;
        u0 u0Var2 = u0Var;
        while (u0Var2 != null && !f0Var.equals(u0Var2.f19189g.f19200a)) {
            u0Var2 = u0Var2.f19194m;
        }
        if (z10 || u0Var != u0Var2 || (u0Var2 != null && u0Var2.f19197p + j3 < 0)) {
            for (int i10 = 0; i10 < this.f19121a.length; i10++) {
                h(i10);
            }
            this.f19148u0 = -9223372036854775807L;
            if (u0Var2 != null) {
                while (true) {
                    w0Var = this.I;
                    if (w0Var.f19217i == u0Var2) {
                        break;
                    }
                    w0Var.a();
                }
                w0Var.n(u0Var2);
                u0Var2.f19197p = 1000000000000L;
                l(this.I.f19218j.e(), new boolean[this.f19121a.length]);
                u0Var2.h = true;
            }
        }
        g();
        if (this.U) {
            for (n1 n1Var : this.f19121a) {
                if (n1Var.g() && ((i7 = n1Var.f19114a.f18889b) == 2 || i7 == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        if (u0Var2 != null) {
            this.I.n(u0Var2);
            if (!u0Var2.f19187e) {
                u0Var2.f19189g = u0Var2.f19189g.b(j3, -9223372036854775807L);
            } else if (u0Var2.f19188f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.f19005a.p() && u0Var2.f19189g.f19200a.equals(this.Y.f19006b)) {
                        long j10 = u0Var2.f19197p + j3;
                        boolean z14 = true;
                        for (n1 n1Var2 : this.f19121a) {
                            if (n1Var2.g()) {
                                b d = n1Var2.d(u0Var2);
                                if (d != null && d.E(j10)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = u0Var2.f19184a;
                            long j11 = this.Y.f19021s;
                            p1 p1Var = p1.f19161e;
                            if (r10.h(j11, p1Var) == u0Var2.f19184a.h(j3, p1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j3 = u0Var2.f19184a.j(j3);
                u0Var2.f19184a.l(j3 - this.f19153y);
            }
            Q(j3, z13);
            C();
        } else {
            this.I.b();
            Q(j3, true);
        }
        u(false);
        this.f19138n.f(2);
        return j3;
    }

    public final void Y(j1 j1Var) {
        j1Var.getClass();
        Looper looper = j1Var.f19055e;
        Looper looper2 = this.f19145s;
        h2.i0 i0Var = this.f19138n;
        if (looper == looper2) {
            f(j1Var);
            int i7 = this.Y.f19008e;
            if (i7 != 3 && i7 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, j1Var).b();
    }

    public final void Z(j1 j1Var) {
        Looper looper = j1Var.f19055e;
        if (!looper.getThread().isAlive()) {
            h2.a.l("TAG", "Trying to send message on a dead thread.");
            j1Var.a(false);
            return;
        }
        this.G.a(looper, null).d(new kg.j1(this, j1Var));
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        if (this.V) {
            this.f19138n.a(37).b();
        }
    }

    public final void a0(e2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.a0(e2.e, boolean):void");
    }

    public final void b(j0 j0Var, int i7) {
        this.Z.f(1);
        f1 f1Var = this.J;
        if (i7 == -1) {
            i7 = f1Var.f18990b.size();
        }
        v(f1Var.a(i7, j0Var.f19049a, j0Var.f19050b), false);
    }

    public final void b0(boolean z10, h2.i iVar) {
        if (this.f19134i0 != z10) {
            this.f19134i0 = z10;
            if (!z10) {
                for (n1 n1Var : this.f19121a) {
                    n1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void c() {
        n1[] n1VarArr;
        o1 o1Var;
        for (n1 n1Var : this.f19121a) {
            if (this.U) {
                o1Var = this.T;
            } else {
                o1Var = null;
            }
            n1Var.f19114a.c(18, o1Var);
            b bVar = n1Var.f19116c;
            if (bVar != null) {
                bVar.c(18, o1Var);
            }
        }
    }

    public final void c0(h0 h0Var) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f19121a) {
            b bVar = n1Var.f19114a;
            if (bVar.f18889b == 4) {
                bVar.c(23, h0Var);
                b bVar2 = n1Var.f19116c;
                if (bVar2 != null) {
                    bVar2.c(23, h0Var);
                }
            }
        }
    }

    public final boolean d() {
        if (!this.P) {
            return false;
        }
        for (n1 n1Var : this.f19121a) {
            if (n1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(j0 j0Var) {
        this.Z.f(1);
        int i7 = j0Var.f19051c;
        x2.g1 g1Var = j0Var.f19050b;
        ArrayList arrayList = j0Var.f19049a;
        if (i7 != -1) {
            this.m0 = new n0(new l1(arrayList, g1Var), j0Var.f19051c, j0Var.d);
        }
        f1 f1Var = this.J;
        ArrayList arrayList2 = f1Var.f18990b;
        f1Var.g(0, arrayList2.size());
        v(f1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final void e() {
        N();
        V(true);
    }

    public final void e0(boolean z10) {
        this.f19124b0 = z10;
        P();
        if (this.f19126c0) {
            w0 w0Var = this.I;
            if (w0Var.f19218j != w0Var.f19217i) {
                V(true);
                u(false);
            }
        }
    }

    @Override
    public final void f0(x2.d1 d1Var) {
        this.f19138n.b(9, (x2.d0) d1Var).b();
    }

    public final void g() {
        n1[] n1VarArr;
        boolean z10;
        b bVar;
        if (this.P && d()) {
            for (n1 n1Var : this.f19121a) {
                int c10 = n1Var.c();
                i iVar = this.E;
                if (n1Var.f()) {
                    int i7 = n1Var.d;
                    int i10 = 1;
                    if (i7 != 4 && i7 != 2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (i7 != 4) {
                        i10 = 0;
                    }
                    if (z10) {
                        try {
                            bVar = n1Var.f19114a;
                        } catch (RuntimeException e10) {
                            h2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = n1Var.f19116c;
                        bVar.getClass();
                    }
                    n1Var.a(bVar, iVar);
                    try {
                        n1Var.i(z10);
                    } catch (RuntimeException e11) {
                        h2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    n1Var.d = i10;
                }
                this.f19137l0 -= c10 - n1Var.c();
            }
            this.f19148u0 = -9223372036854775807L;
        }
    }

    public final void g0(e2.w0 w0Var) {
        this.f19138n.e(16);
        i iVar = this.E;
        iVar.e(w0Var);
        e2.w0 j3 = iVar.j();
        x(j3, j3.f10474a, true, true);
    }

    public final void h(int i7) {
        boolean z10;
        n1[] n1VarArr = this.f19121a;
        int c10 = n1VarArr[i7].c();
        n1 n1Var = n1VarArr[i7];
        b bVar = n1Var.f19114a;
        i iVar = this.E;
        n1Var.a(bVar, iVar);
        b bVar2 = n1Var.f19116c;
        if (bVar2 != null) {
            if (bVar2.f18893n != 0 && n1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            n1Var.a(bVar2, iVar);
            n1Var.i(false);
            if (z10) {
                b bVar3 = n1Var.f19114a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        n1Var.d = 0;
        G(i7, false);
        this.f19137l0 -= c10;
    }

    public final void h0(o oVar) {
        this.f19147t0 = oVar;
        e2.l1 l1Var = this.Y.f19005a;
        w0 w0Var = this.I;
        w0Var.getClass();
        oVar.getClass();
        if (!w0Var.f19225q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < w0Var.f19225q.size(); i7++) {
                ((u0) w0Var.f19225q.get(i7)).i();
            }
            w0Var.f19225q = arrayList;
            w0Var.f19221m = null;
            w0Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7;
        u0 u0Var;
        x2.f0 f0Var;
        u0 u0Var2;
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
                    B0(this.Q.d(this.Y.f19008e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((n0) message.obj);
                    break;
                case 4:
                    g0((e2.w0) message.obj);
                    break;
                case 5:
                    l0((p1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((h2.i) message.obj);
                    return true;
                case 8:
                    w((x2.d0) message.obj);
                    break;
                case 9:
                    s((x2.d0) message.obj);
                    break;
                case 10:
                    N();
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
                    b0(z12, (h2.i) message.obj);
                    break;
                case 14:
                    Y((j1) message.obj);
                    break;
                case 15:
                    Z((j1) message.obj);
                    break;
                case 16:
                    e2.w0 w0Var = (e2.w0) message.obj;
                    x(w0Var, w0Var.f10474a, true, false);
                    break;
                case 17:
                    d0((j0) message.obj);
                    break;
                case 18:
                    b((j0) message.obj, message.arg1);
                    break;
                case 19:
                    I((k0) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (x2.g1) message.obj);
                    break;
                case 21:
                    n0((x2.g1) message.obj);
                    break;
                case 22:
                    H();
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
                    e();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    h0((o) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (h2.i) pair.second);
                    break;
                case 31:
                    e2.e eVar = (e2.e) message.obj;
                    if (message.arg1 != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    a0(eVar, z14);
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
                    p0((d3.v) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    n0 n0Var = this.W;
                    if (n0Var != null) {
                        W(n0Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    k0((o1) message.obj);
                    break;
                case 39:
                    c0((h0) message.obj);
                    break;
            }
        } catch (e2.t0 e10) {
            boolean z15 = e10.f10407a;
            int i13 = e10.f10408b;
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
                t(e10, i11);
            }
            i11 = i10;
            t(e10, i11);
        } catch (j2.j e11) {
            t(e11, e11.f16791a);
        } catch (IOException e12) {
            t(e12, 2000);
        } catch (RuntimeException e13) {
            l lVar = new l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
            v0(true, false);
            this.Y = this.Y.f(lVar);
        } catch (l e14) {
            e = e14;
            int i14 = e.f19061s;
            w0 w0Var2 = this.I;
            if (i14 == 1 && (u0Var2 = w0Var2.f19218j) != null && e.F == null) {
                e = e.a(u0Var2.f19189g.f19200a);
            }
            int i15 = e.f19061s;
            h2.i0 i0Var = this.f19138n;
            if (i15 == 1 && (f0Var = e.F) != null && A(e.f19063x, f0Var)) {
                this.f19149v0 = true;
                g();
                u0 g10 = w0Var2.g();
                u0 u0Var3 = w0Var2.f19217i;
                if (u0Var3 != g10) {
                    while (u0Var3 != null) {
                        u0 u0Var4 = u0Var3.f19194m;
                        if (u0Var4 == g10) {
                            break;
                        }
                        u0Var3 = u0Var4;
                    }
                }
                w0Var2.n(u0Var3);
                if (this.Y.f19008e != 4) {
                    C();
                    i0Var.f(2);
                }
            } else {
                l lVar2 = this.f19144r0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.f19144r0;
                }
                if (e.f19061s == 1 && w0Var2.f19217i != w0Var2.f19218j) {
                    while (true) {
                        u0Var = w0Var2.f19217i;
                        if (u0Var == w0Var2.f19218j) {
                            break;
                        }
                        w0Var2.a();
                    }
                    ja.l(u0Var);
                    E();
                    v0 v0Var = u0Var.f19189g;
                    x2.f0 f0Var2 = v0Var.f19200a;
                    long j3 = v0Var.f19201b;
                    this.Y = y(f0Var2, j3, v0Var.d, j3, true, 0);
                }
                if (e.G && (this.f19144r0 == null || (i7 = e.f10465a) == 5004 || i7 == 5003)) {
                    h2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f19144r0 == null) {
                        this.f19144r0 = e;
                    }
                    h2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f13456a;
                    Message message2 = b10.f13452a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    h2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (q2.g e15) {
            t(e15, e15.f55179a);
        } catch (x2.b e16) {
            t(e16, 1002);
        }
        E();
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.i():void");
    }

    public final void i0(int i7) {
        this.f19132g0 = i7;
        e2.l1 l1Var = this.Y.f19005a;
        w0 w0Var = this.I;
        w0Var.f19216g = i7;
        int r10 = w0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            V(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void j(u0 u0Var, int i7, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        n1 n1Var = this.f19121a[i7];
        boolean g10 = n1Var.g();
        b bVar = n1Var.f19114a;
        if (!g10) {
            if (u0Var == this.I.f19217i) {
                z11 = true;
            } else {
                z11 = false;
            }
            a3.y yVar = u0Var.f19196o;
            m1 m1Var = yVar.f144b[i7];
            a3.u uVar = yVar.f145c[i7];
            if (s0() && this.Y.f19008e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f19137l0++;
            x2.b1 b1Var = u0Var.f19186c[i7];
            long j10 = u0Var.f19197p;
            x2.f0 f0Var = u0Var.f19189g.f19200a;
            b bVar2 = n1Var.f19116c;
            if (uVar != null) {
                i10 = uVar.length();
            } else {
                i10 = 0;
            }
            e2.u[] uVarArr = new e2.u[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                uVar.getClass();
                uVarArr[i11] = uVar.g(i11);
            }
            int i12 = n1Var.d;
            i iVar = this.E;
            if (i12 != 0 && i12 != 2 && i12 != 4) {
                n1Var.f19118f = true;
                bVar2.getClass();
                if (bVar2.f18893n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ja.p(z15);
                bVar2.d = m1Var;
                bVar2.H = f0Var;
                bVar2.f18893n = 1;
                bVar2.o(z13, z11);
                bVar2.y(uVarArr, b1Var, j3, j10, f0Var);
                bVar2.z(j3, z13, true);
                iVar.h(bVar2);
            } else {
                n1Var.f19117e = true;
                if (bVar.f18893n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ja.p(z14);
                bVar.d = m1Var;
                bVar.H = f0Var;
                bVar.f18893n = 1;
                bVar.o(z13, z11);
                bVar.y(uVarArr, b1Var, j3, j10, f0Var);
                bVar.z(j3, z13, true);
                iVar.h(bVar);
            }
            i0 i0Var = new i0(this);
            b d = n1Var.d(u0Var);
            d.getClass();
            d.c(11, i0Var);
            if (z12 && z11) {
                n1Var.m();
            }
        }
    }

    public final void j0(boolean z10) {
        if (!z10) {
            n0 n0Var = this.W;
            h2.i0 i0Var = this.f19138n;
            if (n0Var != null && this.V && !i0Var.f13456a.hasMessages(37)) {
                this.X++;
            }
            int i7 = this.X;
            if (i7 > 0) {
                this.O.d(new ai.w0(this, i7, 14));
            }
            this.X = 0;
            this.V = false;
            i0Var.e(37);
            n0 n0Var2 = this.W;
            if (n0Var2 != null) {
                W(n0Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z10;
        c();
    }

    @Override
    public final void k(x2.d0 d0Var) {
        this.f19138n.b(8, d0Var).b();
    }

    public final void k0(o1 o1Var) {
        this.T = o1Var;
        c();
    }

    public final void l(long j3, boolean[] zArr) {
        n1[] n1VarArr;
        long j10;
        u0 u0Var = this.I.f19218j;
        a3.y yVar = u0Var.f19196o;
        int i7 = 0;
        while (true) {
            n1VarArr = this.f19121a;
            if (i7 >= n1VarArr.length) {
                break;
            }
            if (!yVar.b(i7)) {
                n1VarArr[i7].k();
            }
            i7++;
        }
        int i10 = 0;
        while (i10 < n1VarArr.length) {
            if (!yVar.b(i10) || n1VarArr[i10].d(u0Var) != null) {
                j10 = j3;
            } else {
                j10 = j3;
                j(u0Var, i10, zArr[i10], j10);
            }
            i10++;
            j3 = j10;
        }
    }

    public final void l0(p1 p1Var) {
        this.S = p1Var;
    }

    public final long m(e2.l1 l1Var, Object obj, long j3) {
        e2.i1 i1Var = this.f19152x;
        int i7 = l1Var.g(obj, i1Var).f10118c;
        e2.k1 k1Var = this.f19150w;
        l1Var.n(i7, k1Var);
        if (k1Var.f10164f == -9223372036854775807L || !k1Var.a() || !k1Var.f10166i) {
            return -9223372036854775807L;
        }
        return h2.l0.S(h2.l0.C(k1Var.f10165g) - k1Var.f10164f) - (j3 + i1Var.f10119e);
    }

    public final void m0(boolean z10) {
        this.f19133h0 = z10;
        e2.l1 l1Var = this.Y.f19005a;
        w0 w0Var = this.I;
        w0Var.h = z10;
        int r10 = w0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            V(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long n(u0 u0Var) {
        if (u0Var == null) {
            return 0L;
        }
        long j3 = u0Var.f19197p;
        if (!u0Var.f19187e) {
            return j3;
        }
        int i7 = 0;
        while (true) {
            n1[] n1VarArr = this.f19121a;
            if (i7 < n1VarArr.length) {
                if (n1VarArr[i7].d(u0Var) != null) {
                    b d = n1VarArr[i7].d(u0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f18898y;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j3 = Math.max(j10, j3);
                }
                i7++;
            } else {
                return j3;
            }
        }
    }

    public final void n0(x2.g1 g1Var) {
        this.Z.f(1);
        f1 f1Var = this.J;
        int size = f1Var.f18990b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.i().f(0, size);
        }
        f1Var.f18996j = g1Var;
        v(f1Var.b(), false);
    }

    public final Pair o(e2.l1 l1Var) {
        long j3 = 0;
        if (l1Var.p()) {
            return Pair.create(g1.f19004u, 0L);
        }
        int a10 = l1Var.a(this.f19133h0);
        Pair i7 = l1Var.i(this.f19150w, this.f19152x, a10, -9223372036854775807L);
        x2.f0 p10 = this.I.p(l1Var, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (p10.b()) {
            Object obj = p10.f59523a;
            e2.i1 i1Var = this.f19152x;
            l1Var.g(obj, i1Var);
            if (p10.f59525c == i1Var.e(p10.f59524b)) {
                i1Var.f10121g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j3));
    }

    public final void o0(int i7) {
        g1 g1Var = this.Y;
        if (g1Var.f19008e != i7) {
            if (i7 != 2) {
                this.f19146s0 = -9223372036854775807L;
            }
            if (i7 != 3 && g1Var.f19018p) {
                this.Y = g1Var.i(false);
            }
            this.Y = this.Y.h(i7);
        }
    }

    public final long p(long j3) {
        u0 u0Var = this.I.f19220l;
        if (u0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f19139n0 - u0Var.f19197p));
    }

    public final void p0(d3.v vVar) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f19121a) {
            b bVar = n1Var.f19114a;
            if (bVar.f18889b == 2) {
                bVar.c(7, vVar);
                b bVar2 = n1Var.f19116c;
                if (bVar2 != null) {
                    bVar2.c(7, vVar);
                }
            }
        }
    }

    public final void q(int i7) {
        g1 g1Var = this.Y;
        B0(i7, g1Var.f19016n, g1Var.f19015m, g1Var.f19014l);
    }

    public final void q0(Object obj, h2.i iVar) {
        n1[] n1VarArr;
        for (n1 n1Var : this.f19121a) {
            b bVar = n1Var.f19114a;
            if (bVar.f18889b == 2) {
                int i7 = n1Var.d;
                if (i7 != 4 && i7 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = n1Var.f19116c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i10 = this.Y.f19008e;
        if (i10 == 3 || i10 == 2) {
            this.f19138n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r() {
        r0(this.f19151w0);
    }

    public final void r0(float f10) {
        n1[] n1VarArr;
        this.f19151w0 = f10;
        float f11 = f10 * this.Q.f10714g;
        for (n1 n1Var : this.f19121a) {
            b bVar = n1Var.f19114a;
            if (bVar.f18889b == 1) {
                bVar.c(2, Float.valueOf(f11));
                b bVar2 = n1Var.f19116c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void s(x2.d0 d0Var) {
        w0 w0Var = this.I;
        u0 u0Var = w0Var.f19220l;
        if (u0Var != null && u0Var.f19184a == d0Var) {
            w0Var.m(this.f19139n0);
            C();
            return;
        }
        u0 u0Var2 = w0Var.f19221m;
        if (u0Var2 != null && u0Var2.f19184a == d0Var) {
            D();
        }
    }

    public final boolean s0() {
        g1 g1Var = this.Y;
        if (g1Var.f19014l && g1Var.f19016n == 0) {
            return true;
        }
        return false;
    }

    public final void t(IOException iOException, int i7) {
        l lVar = new l(0, iOException, i7);
        u0 u0Var = this.I.f19217i;
        if (u0Var != null) {
            lVar = lVar.a(u0Var.f19189g.f19200a);
        }
        h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.Y = this.Y.f(lVar);
    }

    public final boolean t0(e2.l1 l1Var, x2.f0 f0Var) {
        if (!f0Var.b() && !l1Var.p()) {
            int i7 = l1Var.g(f0Var.f59523a, this.f19152x).f10118c;
            e2.k1 k1Var = this.f19150w;
            l1Var.n(i7, k1Var);
            if (k1Var.a() && k1Var.f10166i && k1Var.f10164f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(boolean z10) {
        x2.f0 f0Var;
        long d;
        u0 u0Var = this.I.f19220l;
        if (u0Var == null) {
            f0Var = this.Y.f19006b;
        } else {
            f0Var = u0Var.f19189g.f19200a;
        }
        boolean equals = this.Y.f19013k.equals(f0Var);
        if (!equals) {
            this.Y = this.Y.c(f0Var);
        }
        g1 g1Var = this.Y;
        if (u0Var == null) {
            d = g1Var.f19021s;
        } else {
            d = u0Var.d();
        }
        g1Var.f19019q = d;
        g1 g1Var2 = this.Y;
        g1Var2.f19020r = p(g1Var2.f19019q);
        if ((!equals || z10) && u0Var != null && u0Var.f19187e) {
            y0(u0Var.f19189g.f19200a, u0Var.f19196o);
        }
    }

    public final void u0() {
        u0 u0Var = this.I.f19217i;
        if (u0Var != null) {
            a3.y yVar = u0Var.f19196o;
            int i7 = 0;
            while (true) {
                n1[] n1VarArr = this.f19121a;
                if (i7 < n1VarArr.length) {
                    if (yVar.b(i7)) {
                        n1VarArr[i7].m();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(e2.l1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.v(e2.l1, boolean):void");
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f19134i0) {
            z12 = false;
        } else {
            z12 = true;
        }
        O(z12, false, true, false);
        this.Z.f(z11 ? 1 : 0);
        h hVar = (h) this.f19130f;
        ConcurrentHashMap concurrentHashMap = hVar.f19037p;
        m2.j jVar = this.M;
        g gVar = (g) concurrentHashMap.get(jVar);
        if (gVar != null) {
            int i7 = gVar.f18999a - 1;
            gVar.f18999a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(jVar);
                hVar.c();
            }
        }
        this.Q.d(1, this.Y.f19014l);
        o0(1);
    }

    public final void w(x2.d0 d0Var) {
        u0 u0Var;
        w0 w0Var = this.I;
        u0 u0Var2 = w0Var.f19220l;
        i iVar = this.E;
        if (u0Var2 != null && u0Var2.f19184a == d0Var) {
            u0Var2.getClass();
            if (!u0Var2.f19187e) {
                float f10 = iVar.j().f10474a;
                g1 g1Var = this.Y;
                u0Var2.f(f10, g1Var.f19005a, g1Var.f19014l);
            }
            y0(u0Var2.f19189g.f19200a, u0Var2.f19196o);
            if (u0Var2 == w0Var.f19217i) {
                Q(u0Var2.f19189g.f19201b, true);
                l(w0Var.f19218j.e(), new boolean[this.f19121a.length]);
                u0Var2.h = true;
                g1 g1Var2 = this.Y;
                x2.f0 f0Var = g1Var2.f19006b;
                long j3 = u0Var2.f19189g.f19201b;
                this.Y = y(f0Var, j3, g1Var2.f19007c, j3, false, 5);
            }
            C();
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 < w0Var.f19225q.size()) {
                u0Var = (u0) w0Var.f19225q.get(i7);
                if (u0Var.f19184a == d0Var) {
                    break;
                }
                i7++;
            } else {
                u0Var = null;
                break;
            }
        }
        if (u0Var != null) {
            ja.p(true ^ u0Var.f19187e);
            float f11 = iVar.j().f10474a;
            g1 g1Var3 = this.Y;
            u0Var.f(f11, g1Var3.f19005a, g1Var3.f19014l);
            u0 u0Var3 = w0Var.f19221m;
            if (u0Var3 != null && u0Var3.f19184a == d0Var) {
                D();
            }
        }
    }

    public final void w0() {
        n1[] n1VarArr;
        i iVar = this.E;
        iVar.f19041b = false;
        q1 q1Var = (q1) iVar.f19042c;
        if (q1Var.f19168c) {
            q1Var.c(q1Var.a());
            q1Var.f19168c = false;
        }
        for (n1 n1Var : this.f19121a) {
            b bVar = n1Var.f19116c;
            b bVar2 = n1Var.f19114a;
            if (n1.h(bVar2)) {
                n1.b(bVar2);
            }
            if (bVar != null && bVar.f18893n != 0) {
                n1.b(bVar);
            }
        }
    }

    public final void x(e2.w0 w0Var, float f10, boolean z10, boolean z11) {
        int i7;
        if (z10) {
            if (z11) {
                this.Z.f(1);
            }
            this.Y = this.Y.g(w0Var);
        }
        float f11 = w0Var.f10474a;
        u0 u0Var = this.I.f19217i;
        while (true) {
            i7 = 0;
            if (u0Var == null) {
                break;
            }
            a3.u[] uVarArr = u0Var.f19196o.f145c;
            int length = uVarArr.length;
            while (i7 < length) {
                a3.u uVar = uVarArr[i7];
                if (uVar != null) {
                    uVar.q(f11);
                }
                i7++;
            }
            u0Var = u0Var.f19194m;
        }
        n1[] n1VarArr = this.f19121a;
        int length2 = n1VarArr.length;
        while (i7 < length2) {
            n1 n1Var = n1VarArr[i7];
            float f12 = w0Var.f10474a;
            n1Var.f19114a.A(f10, f12);
            b bVar = n1Var.f19116c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i7++;
        }
    }

    public final void x0() {
        boolean z10;
        u0 u0Var = this.I.f19220l;
        if (!this.f19131f0 && (u0Var == null || !u0Var.f19184a.g())) {
            z10 = false;
        } else {
            z10 = true;
        }
        g1 g1Var = this.Y;
        if (z10 != g1Var.f19010g) {
            this.Y = g1Var.b(z10);
        }
    }

    public final g1 y(x2.f0 f0Var, long j3, long j10, long j11, boolean z10, int i7) {
        boolean z11;
        boolean z12;
        s1 s1Var;
        boolean z13;
        boolean z14;
        if (!this.f19142q0 && j3 == this.Y.f19021s && f0Var.equals(this.Y.f19006b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f19142q0 = z11;
        P();
        g1 g1Var = this.Y;
        x2.q1 q1Var = g1Var.h;
        a3.y yVar = g1Var.f19011i;
        List list = g1Var.f19012j;
        if (this.J.f18997k) {
            u0 u0Var = this.I.f19217i;
            if (u0Var == null) {
                q1Var = x2.q1.d;
            } else {
                q1Var = u0Var.f19195n;
            }
            if (u0Var == null) {
                yVar = this.f19128e;
            } else {
                yVar = u0Var.f19196o;
            }
            a3.u[] uVarArr = yVar.f145c;
            ?? b0Var = new h9.b0(4);
            boolean z15 = false;
            for (a3.u uVar : uVarArr) {
                if (uVar != null) {
                    e2.q0 q0Var = uVar.g(0).f10444l;
                    if (q0Var == null) {
                        b0Var.c(new e2.q0(new e2.p0[0]));
                    } else {
                        b0Var.c(q0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                s1Var = b0Var.f();
            } else {
                h9.g0 g0Var = h9.i0.f13686b;
                s1Var = s1.f13749e;
            }
            list = s1Var;
            if (u0Var != null) {
                v0 v0Var = u0Var.f19189g;
                if (v0Var.d != j10) {
                    u0Var.f19189g = v0Var.a(j10);
                }
            }
            n1[] n1VarArr = this.f19121a;
            w0 w0Var = this.I;
            u0 u0Var2 = w0Var.f19217i;
            if (u0Var2 == w0Var.f19218j && u0Var2 != null) {
                a3.y yVar2 = u0Var2.f19196o;
                int i10 = 0;
                boolean z16 = false;
                while (true) {
                    if (i10 < n1VarArr.length) {
                        if (yVar2.b(i10)) {
                            if (n1VarArr[i10].f19114a.f18889b != 1) {
                                z13 = false;
                                break;
                            } else if (yVar2.f144b[i10].f19086a != 0) {
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
                if (z14 != this.f19136k0) {
                    this.f19136k0 = z14;
                    if (!z14 && this.Y.f19018p) {
                        this.f19138n.f(2);
                    }
                }
            }
        } else if (!f0Var.equals(g1Var.f19006b)) {
            q1Var = x2.q1.d;
            yVar = this.f19128e;
            list = s1.f13749e;
        }
        x2.q1 q1Var2 = q1Var;
        a3.y yVar3 = yVar;
        List list2 = list;
        if (z10) {
            l0 l0Var = this.Z;
            if (l0Var.d && l0Var.f19068e != 5) {
                if (i7 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ja.f(z12);
            } else {
                l0Var.f19067c = true;
                l0Var.d = true;
                l0Var.f19068e = i7;
            }
        }
        g1 g1Var2 = this.Y;
        return g1Var2.d(f0Var, j3, j10, j11, p(g1Var2.f19019q), q1Var2, yVar3, list2);
    }

    public final void y0(x2.f0 r10, a3.y r11) {
        throw new UnsupportedOperationException("Method not decompiled: l2.o0.y0(x2.f0, a3.y):void");
    }

    public final void z0(List list, int i7, int i10) {
        boolean z10;
        boolean z11 = true;
        this.Z.f(1);
        f1 f1Var = this.J;
        f1Var.getClass();
        ArrayList arrayList = f1Var.f18990b;
        if (i7 >= 0 && i7 <= i10 && i10 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        if (list.size() != i10 - i7) {
            z11 = false;
        }
        ja.f(z11);
        for (int i11 = i7; i11 < i10; i11++) {
            ((e1) arrayList.get(i11)).f18932a.t((e2.l0) list.get(i11 - i7));
        }
        v(f1Var.b(), false);
    }
}
