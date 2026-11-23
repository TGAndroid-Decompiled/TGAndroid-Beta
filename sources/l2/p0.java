package l2;

import a8.ma;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import di.x7;
import h9.s1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class p0 implements Handler.Callback, x2.d0, i1, d3.v {
    public static final long f19585x0 = h2.l0.h0(10000);
    public final j E;
    public final ArrayList F;
    public final h2.g0 G;
    public final v H;
    public final x0 I;
    public final g1 J;
    public final g K;
    public final long L;
    public final m2.i M;
    public final m2.d N;
    public final h2.i0 O;
    public final boolean P;
    public final f2.e Q;
    public final boolean R;
    public q1 S;
    public p1 T;
    public boolean U;
    public boolean V;
    public o0 W;
    public int X;
    public h1 Y;
    public m0 Z;
    public final o1[] f19586a;
    public boolean f19587a0;
    public final b[] f19588b;
    public boolean f19589b0;
    public final boolean[] f19590c;
    public boolean f19591c0;
    public final a3.x d;
    public boolean f19592d0;
    public final a3.y f19593e;
    public long f19594e0;
    public final r0 f19595f;
    public boolean f19596f0;
    public int f19597g0;
    public final b3.d h;
    public boolean f19598h0;
    public boolean f19599i0;
    public boolean f19600j0;
    public boolean f19601k0;
    public int f19602l0;
    public o0 m0;
    public final h2.i0 f19603n;
    public long f19604n0;
    public long f19605o0;
    public int f19606p0;
    public boolean f19607q0;
    public final m6.n f19608r;
    public m f19609r0;
    public final Looper f19610s;
    public long f19611s0;
    public p f19612t0;
    public long f19613u0;
    public boolean f19614v0;
    public final e2.k1 f19615w;
    public float f19616w0;
    public final e2.i1 f19617x;
    public final long f19618y;

    public p0(Context context, b[] bVarArr, b[] bVarArr2, a3.x xVar, a3.y yVar, r0 r0Var, b3.d dVar, int i7, boolean z10, m2.d dVar2, q1 q1Var, g gVar, long j3, Looper looper, h2.g0 g0Var, v vVar, m2.i iVar, final d3.v vVar2, boolean z11) {
        p pVar = p.f19584a;
        this.f19613u0 = -9223372036854775807L;
        this.H = vVar;
        this.d = xVar;
        this.f19593e = yVar;
        this.f19595f = r0Var;
        this.h = dVar;
        this.f19597g0 = i7;
        this.f19598h0 = z10;
        this.S = q1Var;
        this.K = gVar;
        this.L = j3;
        this.f19589b0 = false;
        this.G = g0Var;
        this.M = iVar;
        this.f19612t0 = pVar;
        this.N = dVar2;
        this.f19616w0 = 1.0f;
        this.T = p1.f19619b;
        this.R = z11;
        this.f19611s0 = -9223372036854775807L;
        this.f19594e0 = -9223372036854775807L;
        this.f19618y = ((i) r0Var).f19500n;
        e2.h1 h1Var = e2.l1.f10498a;
        h1 k10 = h1.k(yVar);
        this.Y = k10;
        this.Z = new m0(k10);
        this.f19588b = new b[bVarArr.length];
        this.f19590c = new boolean[bVarArr.length];
        a3.s sVar = (a3.s) xVar;
        sVar.getClass();
        this.f19586a = new o1[bVarArr.length];
        boolean z12 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.f19349e = i10;
            bVar.f19350f = iVar;
            bVar.h = g0Var;
            this.f19588b[i10] = bVar;
            b bVar2 = this.f19588b[i10];
            synchronized (bVar2.f19346a) {
                bVar2.I = sVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.f19349e = i10;
                bVar3.f19350f = iVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f19586a[i10] = new o1(bVarArr[i10], bVar3, i10);
        }
        this.P = z12;
        this.E = new j(this, g0Var);
        this.F = new ArrayList();
        this.f19615w = new e2.k1();
        this.f19617x = new e2.i1();
        ma.p(xVar.f140a == null);
        xVar.f140a = this;
        xVar.f141b = dVar;
        this.f19607q0 = true;
        h2.i0 a10 = g0Var.a(looper, null);
        this.O = a10;
        this.I = new x0(dVar2, a10, new kg.f1(this, 12));
        this.J = new g1(this, dVar2, a10, iVar);
        m6.n nVar = new m6.n(7);
        this.f19608r = nVar;
        Looper d = nVar.d();
        this.f19610s = d;
        h2.i0 a11 = g0Var.a(d, this);
        this.f19603n = a11;
        this.Q = new f2.e(context, d, this);
        a11.b(35, new d3.v() {
            @Override
            public final void a(long j10, long j11, e2.u uVar, MediaFormat mediaFormat) {
                p0 p0Var = p0.this;
                p0Var.getClass();
                vVar2.a(j10, j11, uVar, mediaFormat);
                p0Var.a(j10, j11, uVar, mediaFormat);
            }
        }).b();
        a11.b(39, new i0(this)).b();
    }

    public static Pair R(e2.l1 l1Var, o0 o0Var, boolean z10, int i7, boolean z11, e2.k1 k1Var, e2.i1 i1Var) {
        e2.l1 l1Var2;
        int S;
        e2.l1 l1Var3 = o0Var.f19576a;
        if (!l1Var.p()) {
            if (l1Var3.p()) {
                l1Var2 = l1Var;
            } else {
                l1Var2 = l1Var3;
            }
            try {
                Pair i10 = l1Var2.i(k1Var, i1Var, o0Var.f19577b, o0Var.f19578c);
                if (!l1Var.equals(l1Var2)) {
                    if (l1Var.b(i10.first) != -1) {
                        if (l1Var2.g(i10.first, i1Var).f10428f && l1Var2.m(i1Var.f10426c, k1Var, 0L).f10479n == l1Var2.b(i10.first)) {
                            return l1Var.i(k1Var, i1Var, l1Var.g(i10.first, i1Var).f10426c, o0Var.f19578c);
                        }
                    } else if (z10 && (S = S(k1Var, i1Var, i7, z11, i10.first, l1Var2, l1Var)) != -1) {
                        return l1Var.i(k1Var, i1Var, S, -9223372036854775807L);
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

    public static int S(e2.k1 k1Var, e2.i1 i1Var, int i7, boolean z10, Object obj, e2.l1 l1Var, e2.l1 l1Var2) {
        e2.k1 k1Var2 = k1Var;
        e2.l1 l1Var3 = l1Var;
        Object obj2 = l1Var3.m(l1Var3.g(obj, i1Var).f10426c, k1Var, 0L).f10468a;
        for (int i10 = 0; i10 < l1Var2.o(); i10++) {
            if (l1Var2.m(i10, k1Var, 0L).f10468a.equals(obj2)) {
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
        return l1Var2.f(i11, i1Var, false).f10426c;
    }

    public static void f(k1 k1Var) {
        try {
            synchronized (k1Var) {
                synchronized (k1Var) {
                }
                k1Var.f19517a.c(k1Var.f19519c, k1Var.d);
                return;
            }
            k1Var.f19517a.c(k1Var.f19519c, k1Var.d);
            return;
        } finally {
            k1Var.a(true);
        }
    }

    public static boolean y(v0 v0Var) {
        x2.d1[] d1VarArr;
        long f10;
        if (v0Var != null) {
            try {
                ?? r12 = v0Var.f19649a;
                if (!v0Var.f19652e) {
                    r12.j();
                } else {
                    for (x2.d1 d1Var : v0Var.f19651c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                }
                if (!v0Var.f19652e) {
                    f10 = 0;
                } else {
                    f10 = r12.f();
                }
                if (f10 != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        v0 v0Var = this.I.f19682i;
        long j3 = v0Var.f19654g.f19669f;
        if (v0Var.f19652e) {
            if (j3 == -9223372036854775807L || this.Y.f19486s < j3 || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A0(int i7, int i10, int i11, boolean z10) {
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
        h1 h1Var = this.Y;
        if (h1Var.f19479l != z11 || h1Var.f19481n != i10 || h1Var.f19480m != i11) {
            this.Y = h1Var.e(i11, i10, z11);
            D0(false, false);
            x0 x0Var = this.I;
            for (v0 v0Var = x0Var.f19682i; v0Var != null; v0Var = v0Var.f19659m) {
                for (a3.u uVar : v0Var.f19661o.f145c) {
                    if (uVar != null) {
                        uVar.f(z11);
                    }
                }
            }
            if (!r0()) {
                v0();
                B0();
                h1 h1Var2 = this.Y;
                if (h1Var2.f19483p) {
                    this.Y = h1Var2.i(false);
                }
                x0Var.m(this.f19604n0);
                return;
            }
            int i12 = this.Y.f19473e;
            h2.i0 i0Var = this.f19603n;
            if (i12 == 3) {
                j jVar = this.E;
                jVar.f19506b = true;
                ((r1) jVar.f19507c).d();
                t0();
                i0Var.f(2);
            } else if (i12 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final void B() {
        long f10;
        long j3;
        boolean b10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!y(this.I.f19685l)) {
            b10 = false;
        } else {
            v0 v0Var = this.I.f19685l;
            if (!v0Var.f19652e) {
                f10 = 0;
            } else {
                f10 = v0Var.f19649a.f();
            }
            long o4 = o(f10);
            v0 v0Var2 = this.I.f19682i;
            if (s0(this.Y.f19470a, v0Var.f19654g.f19665a)) {
                j3 = this.K.h;
            } else {
                j3 = -9223372036854775807L;
            }
            m2.i iVar = this.M;
            e2.l1 l1Var = this.Y.f19470a;
            x2.g0 g0Var = v0Var.f19654g.f19665a;
            float f11 = this.E.l().f10782a;
            boolean z13 = this.Y.f19479l;
            q0 q0Var = new q0(iVar, l1Var, g0Var, o4, f11, this.f19592d0, j3);
            b10 = ((i) this.f19595f).b(q0Var);
            v0 v0Var3 = this.I.f19682i;
            if (!b10 && v0Var3.f19652e && o4 < 500000 && this.f19618y > 0) {
                v0Var3.f19649a.n(this.Y.f19486s);
                b10 = ((i) this.f19595f).b(q0Var);
            }
        }
        this.f19596f0 = b10;
        if (b10) {
            v0 v0Var4 = this.I.f19685l;
            v0Var4.getClass();
            s0 s0Var = new s0();
            s0Var.f19637a = this.f19604n0 - v0Var4.f19662p;
            float f12 = this.E.l().f10782a;
            if (f12 <= 0.0f && f12 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            ma.f(z10);
            s0Var.f19638b = f12;
            long j10 = this.f19594e0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            ma.f(z11);
            s0Var.f19639c = j10;
            t0 t0Var = new t0(s0Var);
            if (v0Var4.f19659m == null) {
                z12 = true;
            }
            ma.p(z12);
            v0Var4.f19649a.d(t0Var);
        }
        w0();
    }

    public final void B0() {
        long j3;
        boolean z10;
        long j10;
        long max;
        long j11;
        float f10;
        v0 v0Var = this.I.f19682i;
        if (v0Var != null) {
            if (v0Var.f19652e) {
                j3 = v0Var.f19649a.p();
            } else {
                j3 = -9223372036854775807L;
            }
            if (j3 != -9223372036854775807L) {
                if (!v0Var.g()) {
                    this.I.n(v0Var);
                    t(false);
                    B();
                }
                P(j3, true);
                if (j3 != this.Y.f19486s) {
                    h1 h1Var = this.Y;
                    this.Y = x(h1Var.f19471b, j3, h1Var.f19472c, j3, true, 5);
                }
            } else {
                j jVar = this.E;
                if (v0Var != this.I.f19683j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r1 r1Var = (r1) jVar.f19507c;
                b bVar = (b) jVar.f19508e;
                if (bVar != null && !bVar.k() && ((!z10 || ((b) jVar.f19508e).f19351n == 2) && (((b) jVar.f19508e).m() || (!z10 && !((b) jVar.f19508e).j())))) {
                    u0 u0Var = (u0) jVar.f19509f;
                    u0Var.getClass();
                    long a10 = u0Var.a();
                    if (jVar.f19505a) {
                        if (a10 < r1Var.a()) {
                            if (r1Var.f19633c) {
                                r1Var.c(r1Var.a());
                                r1Var.f19633c = false;
                            }
                        } else {
                            jVar.f19505a = false;
                            if (jVar.f19506b) {
                                r1Var.d();
                            }
                        }
                    }
                    r1Var.c(a10);
                    e2.w0 l10 = u0Var.l();
                    if (!l10.equals((e2.w0) r1Var.f19634e)) {
                        r1Var.e(l10);
                        ((p0) jVar.d).f19603n.b(16, l10).b();
                    }
                } else {
                    jVar.f19505a = true;
                    if (jVar.f19506b) {
                        r1Var.d();
                    }
                }
                long a11 = jVar.a();
                this.f19604n0 = a11;
                long j12 = a11 - v0Var.f19662p;
                long j13 = this.Y.f19486s;
                ArrayList arrayList = this.F;
                if (!arrayList.isEmpty() && !this.Y.f19471b.b()) {
                    if (this.f19607q0) {
                        this.f19607q0 = false;
                    }
                    h1 h1Var2 = this.Y;
                    h1Var2.f19470a.b(h1Var2.f19471b.f60216a);
                    int min = Math.min(this.f19606p0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f19606p0 = min;
                }
                if (this.E.b()) {
                    boolean z11 = !this.Z.d;
                    h1 h1Var3 = this.Y;
                    this.Y = x(h1Var3.f19471b, j12, h1Var3.f19472c, j12, z11, 6);
                } else {
                    h1 h1Var4 = this.Y;
                    h1Var4.f19486s = j12;
                    h1Var4.f19487t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.f19484q = this.I.f19685l.d();
            h1 h1Var5 = this.Y;
            h1Var5.f19485r = o(h1Var5.f19484q);
            h1 h1Var6 = this.Y;
            if (h1Var6.f19479l && h1Var6.f19473e == 3 && s0(h1Var6.f19470a, h1Var6.f19471b)) {
                h1 h1Var7 = this.Y;
                float f11 = 1.0f;
                if (h1Var7.f19482o.f10782a == 1.0f) {
                    g gVar = this.K;
                    long l11 = l(h1Var7.f19470a, h1Var7.f19471b.f60216a, h1Var7.f19486s);
                    long j14 = this.Y.f19485r;
                    if (gVar.f19403c != -9223372036854775807L) {
                        long j15 = l11 - j14;
                        if (gVar.f19411m == -9223372036854775807L) {
                            gVar.f19411m = j15;
                            gVar.f19412n = 0L;
                        } else {
                            gVar.f19411m = Math.max(j15, (((float) j15) * 9.999871E-4f) + (((float) j10) * 0.999f));
                            gVar.f19412n = (9.999871E-4f * ((float) Math.abs(j15 - max))) + (((float) gVar.f19412n) * 0.999f);
                        }
                        if (gVar.f19410l != -9223372036854775807L) {
                            j11 = 1000;
                            if (SystemClock.elapsedRealtime() - gVar.f19410l < 1000) {
                                f11 = gVar.f19409k;
                            }
                        } else {
                            j11 = 1000;
                        }
                        gVar.f19410l = SystemClock.elapsedRealtime();
                        long j16 = (gVar.f19412n * 3) + gVar.f19411m;
                        if (gVar.h > j16) {
                            float S = (float) h2.l0.S(j11);
                            f10 = 1.0E-7f;
                            long[] jArr = {j16, gVar.f19404e, gVar.h - (((gVar.f19409k - 1.0f) * S) + ((gVar.f19407i - 1.0f) * S))};
                            long j17 = jArr[0];
                            for (int i7 = 1; i7 < 3; i7++) {
                                long j18 = jArr[i7];
                                if (j18 > j17) {
                                    j17 = j18;
                                }
                            }
                            gVar.h = j17;
                        } else {
                            f10 = 1.0E-7f;
                            long j19 = h2.l0.j(l11 - (Math.max(0.0f, gVar.f19409k - 1.0f) / 1.0E-7f), gVar.h, j16);
                            gVar.h = j19;
                            long j20 = gVar.f19406g;
                            if (j20 != -9223372036854775807L && j19 > j20) {
                                gVar.h = j20;
                            }
                        }
                        long j21 = l11 - gVar.h;
                        if (Math.abs(j21) < gVar.f19401a) {
                            gVar.f19409k = 1.0f;
                        } else {
                            gVar.f19409k = h2.l0.h((f10 * ((float) j21)) + 1.0f, gVar.f19408j, gVar.f19407i);
                        }
                        f11 = gVar.f19409k;
                    }
                    if (this.E.l().f10782a != f11) {
                        e2.w0 w0Var = new e2.w0(f11, this.Y.f19482o.f10783b);
                        this.f19603n.e(16);
                        this.E.e(w0Var);
                        w(this.Y.f19482o, this.E.l().f10782a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        boolean z10;
        boolean z11;
        x0 x0Var = this.I;
        x0Var.k();
        v0 v0Var = x0Var.f19686m;
        if (v0Var != null) {
            ?? r12 = v0Var.f19649a;
            if ((!v0Var.d || v0Var.f19652e) && !r12.g()) {
                e2.l1 l1Var = this.Y.f19470a;
                if (v0Var.f19652e) {
                    r12.r();
                }
                for (h hVar : ((i) this.f19595f).f19502p.values()) {
                    if (hVar.f19465b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!v0Var.d) {
                    long j3 = v0Var.f19654g.f19666b;
                    v0Var.d = true;
                    r12.s(this, j3);
                    return;
                }
                s0 s0Var = new s0();
                s0Var.f19637a = this.f19604n0 - v0Var.f19662p;
                float f10 = this.E.l().f10782a;
                if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ma.f(z10);
                s0Var.f19638b = f10;
                long j10 = this.f19594e0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                ma.f(z11);
                s0Var.f19639c = j10;
                t0 t0Var = new t0(s0Var);
                if (v0Var.f19659m != null) {
                    z12 = false;
                }
                ma.p(z12);
                r12.d(t0Var);
            }
        }
    }

    public final void C0(e2.l1 l1Var, x2.g0 g0Var, e2.l1 l1Var2, x2.g0 g0Var2, long j3, boolean z10) {
        Object obj;
        e2.w0 w0Var;
        boolean s02 = s0(l1Var, g0Var);
        Object obj2 = g0Var.f60216a;
        if (!s02) {
            if (g0Var.b()) {
                w0Var = e2.w0.d;
            } else {
                w0Var = this.Y.f19482o;
            }
            j jVar = this.E;
            if (!jVar.l().equals(w0Var)) {
                this.f19603n.e(16);
                jVar.e(w0Var);
                w(this.Y.f19482o, w0Var.f10782a, false, false);
                return;
            }
            return;
        }
        e2.i1 i1Var = this.f19617x;
        int i7 = l1Var.g(obj2, i1Var).f10426c;
        e2.k1 k1Var = this.f19615w;
        l1Var.n(i7, k1Var);
        e2.f0 f0Var = k1Var.f10475j;
        g gVar = this.K;
        gVar.getClass();
        gVar.f19403c = h2.l0.S(f0Var.f10385a);
        gVar.f19405f = h2.l0.S(f0Var.f10386b);
        gVar.f19406g = h2.l0.S(f0Var.f10387c);
        float f10 = f0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        gVar.f19408j = f10;
        float f11 = f0Var.f10388e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        gVar.f19407i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            gVar.f19403c = -9223372036854775807L;
        }
        gVar.a();
        if (j3 != -9223372036854775807L) {
            gVar.d = l(l1Var, obj2, j3);
            gVar.a();
            return;
        }
        Object obj3 = k1Var.f10468a;
        if (!l1Var2.p()) {
            obj = l1Var2.m(l1Var2.g(g0Var2.f60216a, i1Var).f10426c, k1Var, 0L).f10468a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        gVar.d = -9223372036854775807L;
        gVar.a();
    }

    public final void D() {
        boolean z10;
        m0 m0Var = this.Z;
        h1 h1Var = this.Y;
        boolean z11 = m0Var.f19532c;
        if (((h1) m0Var.f19534f) != h1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        m0Var.f19532c = z12;
        m0Var.f19534f = h1Var;
        if (z12) {
            g0 g0Var = this.H.f19648b;
            g0Var.f19428j.d(new ji.f(18, g0Var, m0Var));
            this.Z = new m0(this.Y);
        }
    }

    public final void D0(boolean z10, boolean z11) {
        long j3;
        this.f19592d0 = z10;
        if (z10 && !z11) {
            this.G.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f19594e0 = j3;
    }

    public final void E(int i7) {
        o1 o1Var = this.f19586a[i7];
        try {
            v0 v0Var = this.I.f19682i;
            v0Var.getClass();
            b d = o1Var.d(v0Var);
            d.getClass();
            x2.d1 d1Var = d.f19352r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = o1Var.f19579a.f19347b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            a3.y yVar = this.I.f19682i.f19661o;
            h2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + e2.u.c(yVar.f145c[i7].n()), e10);
            a3.y yVar2 = new a3.y((n1[]) yVar.f144b.clone(), (a3.u[]) yVar.f145c.clone(), yVar.d, yVar.f146e);
            yVar2.f144b[i7] = null;
            yVar2.f145c[i7] = null;
            h(i7);
            v0 v0Var2 = this.I.f19682i;
            v0Var2.a(yVar2, this.Y.f19486s, false, new boolean[v0Var2.f19656j.length]);
        }
    }

    public final void F(int i7, boolean z10) {
        boolean[] zArr = this.f19590c;
        if (zArr[i7] != z10) {
            zArr[i7] = z10;
            this.O.d(new x7(this, i7, z10, 1));
        }
    }

    public final void G() {
        u(this.J.b(), true);
    }

    public final void H(l0 l0Var) {
        boolean z10;
        e2.l1 b10;
        this.Z.f(1);
        int i7 = l0Var.f19522a;
        int i10 = l0Var.f19523b;
        int i11 = l0Var.f19524c;
        x2.i1 i1Var = l0Var.d;
        g1 g1Var = this.J;
        ArrayList arrayList = g1Var.f19455b;
        if (i7 >= 0 && i7 <= i10 && i10 <= arrayList.size() && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        g1Var.f19461j = i1Var;
        if (i7 != i10 && i7 != i11) {
            int min = Math.min(i7, i11);
            int max = Math.max(((i10 - i7) + i11) - 1, i10 - 1);
            int i12 = ((f1) arrayList.get(min)).d;
            h2.l0.R(i7, i10, i11, arrayList);
            while (min <= max) {
                f1 f1Var = (f1) arrayList.get(min);
                f1Var.d = i12;
                i12 += f1Var.f19397a.f60164o.f60344e.o();
                min++;
            }
            b10 = g1Var.b();
        } else {
            b10 = g1Var.b();
        }
        u(b10, false);
    }

    public final void I() {
        boolean z10;
        int i7;
        int i10;
        this.Z.f(1);
        N(false, false, false, true);
        i iVar = (i) this.f19595f;
        ConcurrentHashMap concurrentHashMap = iVar.f19502p;
        long id2 = Thread.currentThread().getId();
        long j3 = iVar.f19503q;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        iVar.f19503q = id2;
        m2.i iVar2 = this.M;
        h hVar = (h) concurrentHashMap.get(iVar2);
        if (hVar == null) {
            ?? obj = new Object();
            obj.f19464a = 1;
            concurrentHashMap.put(iVar2, obj);
        } else {
            hVar.f19464a++;
        }
        h hVar2 = (h) concurrentHashMap.get(iVar2);
        hVar2.getClass();
        Integer num = (Integer) iVar.f19501o.get(iVar2.f20612a);
        if (num != null && num.intValue() != -1) {
            i7 = num.intValue();
        } else {
            i7 = iVar.f19498l;
        }
        if (i7 == -1) {
            i7 = 13107200;
        }
        hVar2.f19466c = i7;
        hVar2.f19465b = false;
        if (this.Y.f19470a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        n0(i10);
        h1 h1Var = this.Y;
        boolean z11 = h1Var.f19479l;
        A0(this.Q.d(h1Var.f19473e, z11), h1Var.f19481n, h1Var.f19480m, z11);
        b3.g gVar = (b3.g) this.h;
        gVar.getClass();
        g1 g1Var = this.J;
        ArrayList arrayList = g1Var.f19455b;
        ma.p(!g1Var.f19462k);
        g1Var.f19463l = gVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            g1Var.e(f1Var);
            g1Var.f19459g.add(f1Var);
        }
        g1Var.f19462k = true;
        this.f19603n.f(2);
    }

    public final void J(h2.i iVar) {
        m6.n nVar = this.f19608r;
        h2.i0 i0Var = this.f19603n;
        try {
            N(true, false, true, false);
            K();
            r0 r0Var = this.f19595f;
            m2.i iVar2 = this.M;
            i iVar3 = (i) r0Var;
            ConcurrentHashMap concurrentHashMap = iVar3.f19502p;
            h hVar = (h) concurrentHashMap.get(iVar2);
            if (hVar != null) {
                int i7 = hVar.f19464a - 1;
                hVar.f19464a = i7;
                if (i7 == 0) {
                    concurrentHashMap.remove(iVar2);
                    iVar3.c();
                }
            }
            if (iVar3.f19502p.isEmpty()) {
                iVar3.f19503q = -1L;
            }
            f2.e eVar = this.Q;
            eVar.f11023c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            i0Var.f13763a.removeCallbacksAndMessages(null);
            nVar.f();
            iVar.e();
        }
    }

    public final void K() {
        boolean z10;
        for (int i7 = 0; i7 < this.f19586a.length; i7++) {
            b bVar = this.f19588b[i7];
            synchronized (bVar.f19346a) {
                bVar.I = null;
            }
            o1 o1Var = this.f19586a[i7];
            b bVar2 = o1Var.f19579a;
            boolean z11 = true;
            if (bVar2.f19351n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            bVar2.q();
            o1Var.f19582e = false;
            b bVar3 = o1Var.f19581c;
            if (bVar3 != null) {
                if (bVar3.f19351n != 0) {
                    z11 = false;
                }
                ma.p(z11);
                bVar3.q();
                o1Var.f19583f = false;
            }
        }
    }

    public final void L(int i7, int i10, x2.i1 i1Var) {
        boolean z10 = true;
        this.Z.f(1);
        g1 g1Var = this.J;
        g1Var.getClass();
        if (i7 < 0 || i7 > i10 || i10 > g1Var.f19455b.size()) {
            z10 = false;
        }
        ma.f(z10);
        g1Var.f19461j = i1Var;
        g1Var.g(i7, i10);
        u(g1Var.b(), false);
    }

    public final void M() {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.M():void");
    }

    public final void N(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.N(boolean, boolean, boolean, boolean):void");
    }

    public final void O() {
        boolean z10;
        v0 v0Var = this.I.f19682i;
        if (v0Var != null && v0Var.f19654g.f19672j && this.f19589b0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19591c0 = z10;
    }

    public final void P(long j3, boolean z10) {
        x0 x0Var;
        long j10;
        o1[] o1VarArr;
        a3.u[] uVarArr;
        v0 v0Var = this.I.f19682i;
        if (v0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = v0Var.f19662p;
        }
        long j11 = j3 + j10;
        this.f19604n0 = j11;
        ((r1) this.E.f19507c).c(j11);
        for (o1 o1Var : this.f19586a) {
            long j12 = this.f19604n0;
            b d = o1Var.d(v0Var);
            if (d != null) {
                d.z(j12, false, z10);
            }
        }
        for (v0 v0Var2 = x0Var.f19682i; v0Var2 != null; v0Var2 = v0Var2.f19659m) {
            for (a3.u uVar : v0Var2.f19661o.f145c) {
                if (uVar != null) {
                    uVar.s();
                }
            }
        }
    }

    public final void Q(e2.l1 l1Var, e2.l1 l1Var2) {
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

    public final void T(long j3) {
        o1[] o1VarArr;
        v0 v0Var;
        long j10;
        boolean z10 = this.U;
        long j11 = 1000;
        long j12 = f19585x0;
        if (z10) {
            this.T.getClass();
            if (this.Y.f19473e != 3) {
                j11 = j12;
            }
            for (o1 o1Var : this.f19586a) {
                long j13 = this.f19604n0;
                long j14 = this.f19605o0;
                b bVar = o1Var.f19581c;
                b bVar2 = o1Var.f19579a;
                if (o1.h(bVar2)) {
                    j10 = bVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f19351n != 0) {
                    j10 = Math.min(j10, bVar.g(j13, j14));
                }
                j11 = Math.min(j11, h2.l0.h0(j10));
            }
            if (this.Y.m()) {
                v0 v0Var2 = this.I.f19682i;
                if (v0Var2 != null) {
                    v0Var = v0Var2.f19659m;
                } else {
                    v0Var = null;
                }
                if (v0Var != null) {
                    if ((((float) h2.l0.S(j11)) * this.Y.f19482o.f10782a) + ((float) this.f19604n0) >= ((float) v0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.Y.f19473e != 3 || r0()) {
            j11 = j12;
        }
        this.f19603n.f13763a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void U(boolean z10) {
        x2.g0 g0Var = this.I.f19682i.f19654g.f19665a;
        long X = X(g0Var, this.Y.f19486s, true, false);
        if (X != this.Y.f19486s) {
            h1 h1Var = this.Y;
            this.Y = x(g0Var, X, h1Var.f19472c, h1Var.d, z10, 5);
        }
    }

    @Override
    public final void V(x2.e0 e0Var) {
        this.f19603n.b(8, e0Var).b();
    }

    public final void W(l2.o0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.W(l2.o0):void");
    }

    public final long X(x2.g0 g0Var, long j3, boolean z10, boolean z11) {
        x0 x0Var;
        o1[] o1VarArr;
        boolean z12;
        o1[] o1VarArr2;
        int i7;
        v0();
        boolean z13 = true;
        D0(false, true);
        if (z11 || this.Y.f19473e == 3) {
            n0(2);
        }
        v0 v0Var = this.I.f19682i;
        v0 v0Var2 = v0Var;
        while (v0Var2 != null && !g0Var.equals(v0Var2.f19654g.f19665a)) {
            v0Var2 = v0Var2.f19659m;
        }
        if (z10 || v0Var != v0Var2 || (v0Var2 != null && v0Var2.f19662p + j3 < 0)) {
            for (int i10 = 0; i10 < this.f19586a.length; i10++) {
                h(i10);
            }
            this.f19613u0 = -9223372036854775807L;
            if (v0Var2 != null) {
                while (true) {
                    x0Var = this.I;
                    if (x0Var.f19682i == v0Var2) {
                        break;
                    }
                    x0Var.a();
                }
                x0Var.n(v0Var2);
                v0Var2.f19662p = 1000000000000L;
                k(this.I.f19683j.e(), new boolean[this.f19586a.length]);
                v0Var2.h = true;
            }
        }
        g();
        if (this.U) {
            for (o1 o1Var : this.f19586a) {
                if (o1Var.g() && ((i7 = o1Var.f19579a.f19347b) == 2 || i7 == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        if (v0Var2 != null) {
            this.I.n(v0Var2);
            if (!v0Var2.f19652e) {
                v0Var2.f19654g = v0Var2.f19654g.b(j3, -9223372036854775807L);
            } else if (v0Var2.f19653f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.f19470a.p() && v0Var2.f19654g.f19665a.equals(this.Y.f19471b)) {
                        long j10 = v0Var2.f19662p + j3;
                        boolean z14 = true;
                        for (o1 o1Var2 : this.f19586a) {
                            if (o1Var2.g()) {
                                b d = o1Var2.d(v0Var2);
                                if (d != null && d.E(j10)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = v0Var2.f19649a;
                            long j11 = this.Y.f19486s;
                            q1 q1Var = q1.f19626e;
                            if (r10.i(j11, q1Var) == v0Var2.f19649a.i(j3, q1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j3 = v0Var2.f19649a.l(j3);
                v0Var2.f19649a.n(j3 - this.f19618y);
            }
            P(j3, z13);
            B();
        } else {
            this.I.b();
            P(j3, true);
        }
        t(false);
        this.f19603n.f(2);
        return j3;
    }

    public final void Y(k1 k1Var) {
        k1Var.getClass();
        Looper looper = k1Var.f19520e;
        Looper looper2 = this.f19610s;
        h2.i0 i0Var = this.f19603n;
        if (looper == looper2) {
            f(k1Var);
            int i7 = this.Y.f19473e;
            if (i7 != 3 && i7 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, k1Var).b();
    }

    public final void Z(k1 k1Var) {
        Looper looper = k1Var.f19520e;
        if (!looper.getThread().isAlive()) {
            h2.a.l("TAG", "Trying to send message on a dead thread.");
            k1Var.a(false);
            return;
        }
        this.G.a(looper, null).d(new kg.i0(this, k1Var));
    }

    @Override
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        if (this.V) {
            this.f19603n.a(37).b();
        }
    }

    public final void a0(e2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.a0(e2.e, boolean):void");
    }

    public final void b(k0 k0Var, int i7) {
        this.Z.f(1);
        g1 g1Var = this.J;
        if (i7 == -1) {
            i7 = g1Var.f19455b.size();
        }
        u(g1Var.a(i7, k0Var.f19514a, k0Var.f19515b), false);
    }

    public final void b0(boolean z10, h2.i iVar) {
        if (this.f19599i0 != z10) {
            this.f19599i0 = z10;
            if (!z10) {
                for (o1 o1Var : this.f19586a) {
                    o1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void c() {
        o1[] o1VarArr;
        p1 p1Var;
        for (o1 o1Var : this.f19586a) {
            if (this.U) {
                p1Var = this.T;
            } else {
                p1Var = null;
            }
            o1Var.f19579a.c(18, p1Var);
            b bVar = o1Var.f19581c;
            if (bVar != null) {
                bVar.c(18, p1Var);
            }
        }
    }

    public final void c0(i0 i0Var) {
        o1[] o1VarArr;
        for (o1 o1Var : this.f19586a) {
            b bVar = o1Var.f19579a;
            if (bVar.f19347b == 4) {
                bVar.c(23, i0Var);
                b bVar2 = o1Var.f19581c;
                if (bVar2 != null) {
                    bVar2.c(23, i0Var);
                }
            }
        }
    }

    public final boolean d() {
        if (!this.P) {
            return false;
        }
        for (o1 o1Var : this.f19586a) {
            if (o1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(k0 k0Var) {
        this.Z.f(1);
        int i7 = k0Var.f19516c;
        x2.i1 i1Var = k0Var.f19515b;
        ArrayList arrayList = k0Var.f19514a;
        if (i7 != -1) {
            this.m0 = new o0(new m1(arrayList, i1Var), k0Var.f19516c, k0Var.d);
        }
        g1 g1Var = this.J;
        ArrayList arrayList2 = g1Var.f19455b;
        g1Var.g(0, arrayList2.size());
        u(g1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void e() {
        M();
        U(true);
    }

    public final void e0(boolean z10) {
        this.f19589b0 = z10;
        O();
        if (this.f19591c0) {
            x0 x0Var = this.I;
            if (x0Var.f19683j != x0Var.f19682i) {
                U(true);
                t(false);
            }
        }
    }

    public final void f0(e2.w0 w0Var) {
        this.f19603n.e(16);
        j jVar = this.E;
        jVar.e(w0Var);
        e2.w0 l10 = jVar.l();
        w(l10, l10.f10782a, true, true);
    }

    public final void g() {
        o1[] o1VarArr;
        boolean z10;
        b bVar;
        if (this.P && d()) {
            for (o1 o1Var : this.f19586a) {
                int c10 = o1Var.c();
                j jVar = this.E;
                if (o1Var.f()) {
                    int i7 = o1Var.d;
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
                            bVar = o1Var.f19579a;
                        } catch (RuntimeException e10) {
                            h2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = o1Var.f19581c;
                        bVar.getClass();
                    }
                    o1Var.a(bVar, jVar);
                    try {
                        o1Var.i(z10);
                    } catch (RuntimeException e11) {
                        h2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    o1Var.d = i10;
                }
                this.f19602l0 -= c10 - o1Var.c();
            }
            this.f19613u0 = -9223372036854775807L;
        }
    }

    public final void g0(p pVar) {
        this.f19612t0 = pVar;
        e2.l1 l1Var = this.Y.f19470a;
        x0 x0Var = this.I;
        x0Var.getClass();
        pVar.getClass();
        if (!x0Var.f19690q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < x0Var.f19690q.size(); i7++) {
                ((v0) x0Var.f19690q.get(i7)).i();
            }
            x0Var.f19690q = arrayList;
            x0Var.f19686m = null;
            x0Var.k();
        }
    }

    public final void h(int i7) {
        boolean z10;
        o1[] o1VarArr = this.f19586a;
        int c10 = o1VarArr[i7].c();
        o1 o1Var = o1VarArr[i7];
        b bVar = o1Var.f19579a;
        j jVar = this.E;
        o1Var.a(bVar, jVar);
        b bVar2 = o1Var.f19581c;
        if (bVar2 != null) {
            if (bVar2.f19351n != 0 && o1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            o1Var.a(bVar2, jVar);
            o1Var.i(false);
            if (z10) {
                b bVar3 = o1Var.f19579a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        o1Var.d = 0;
        F(i7, false);
        this.f19602l0 -= c10;
    }

    public final void h0(int i7) {
        this.f19597g0 = i7;
        e2.l1 l1Var = this.Y.f19470a;
        x0 x0Var = this.I;
        x0Var.f19681g = i7;
        int r10 = x0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            U(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7;
        v0 v0Var;
        x2.g0 g0Var;
        v0 v0Var2;
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
                    A0(this.Q.d(this.Y.f19473e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((o0) message.obj);
                    break;
                case 4:
                    f0((e2.w0) message.obj);
                    break;
                case 5:
                    k0((q1) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    J((h2.i) message.obj);
                    return true;
                case 8:
                    v((x2.e0) message.obj);
                    break;
                case 9:
                    r((x2.e0) message.obj);
                    break;
                case 10:
                    M();
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
                    b0(z12, (h2.i) message.obj);
                    break;
                case 14:
                    Y((k1) message.obj);
                    break;
                case 15:
                    Z((k1) message.obj);
                    break;
                case 16:
                    e2.w0 w0Var = (e2.w0) message.obj;
                    w(w0Var, w0Var.f10782a, true, false);
                    break;
                case 17:
                    d0((k0) message.obj);
                    break;
                case 18:
                    b((k0) message.obj, message.arg1);
                    break;
                case 19:
                    H((l0) message.obj);
                    break;
                case 20:
                    L(message.arg1, message.arg2, (x2.i1) message.obj);
                    break;
                case 21:
                    m0((x2.i1) message.obj);
                    break;
                case 22:
                    G();
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
                    M();
                    U(true);
                    break;
                case 27:
                    y0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    g0((p) message.obj);
                    break;
                case 29:
                    I();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (h2.i) pair.second);
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
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    o0((d3.v) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    o0 o0Var = this.W;
                    if (o0Var != null) {
                        W(o0Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    j0((p1) message.obj);
                    break;
                case 39:
                    c0((i0) message.obj);
                    break;
            }
        } catch (e2.t0 e10) {
            boolean z15 = e10.f10715a;
            int i13 = e10.f10716b;
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
                s(e10, i11);
            }
            i11 = i10;
            s(e10, i11);
        } catch (j2.j e11) {
            s(e11, e11.f17264a);
        } catch (IOException e12) {
            s(e12, 2000);
        } catch (RuntimeException e13) {
            m mVar = new m(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            h2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
            u0(true, false);
            this.Y = this.Y.f(mVar);
        } catch (m e14) {
            e = e14;
            int i14 = e.f19526s;
            x0 x0Var = this.I;
            if (i14 == 1 && (v0Var2 = x0Var.f19683j) != null && e.F == null) {
                e = e.a(v0Var2.f19654g.f19665a);
            }
            int i15 = e.f19526s;
            h2.i0 i0Var = this.f19603n;
            if (i15 == 1 && (g0Var = e.F) != null && z(e.f19528x, g0Var)) {
                this.f19614v0 = true;
                g();
                v0 g10 = x0Var.g();
                v0 v0Var3 = x0Var.f19682i;
                if (v0Var3 != g10) {
                    while (v0Var3 != null) {
                        v0 v0Var4 = v0Var3.f19659m;
                        if (v0Var4 == g10) {
                            break;
                        }
                        v0Var3 = v0Var4;
                    }
                }
                x0Var.n(v0Var3);
                if (this.Y.f19473e != 4) {
                    B();
                    i0Var.f(2);
                }
            } else {
                m mVar2 = this.f19609r0;
                if (mVar2 != null) {
                    mVar2.addSuppressed(e);
                    e = this.f19609r0;
                }
                if (e.f19526s == 1 && x0Var.f19682i != x0Var.f19683j) {
                    while (true) {
                        v0Var = x0Var.f19682i;
                        if (v0Var == x0Var.f19683j) {
                            break;
                        }
                        x0Var.a();
                    }
                    ma.l(v0Var);
                    D();
                    w0 w0Var2 = v0Var.f19654g;
                    x2.g0 g0Var2 = w0Var2.f19665a;
                    long j3 = w0Var2.f19666b;
                    this.Y = x(g0Var2, j3, w0Var2.d, j3, true, 0);
                }
                if (e.G && (this.f19609r0 == null || (i7 = e.f10773a) == 5004 || i7 == 5003)) {
                    h2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f19609r0 == null) {
                        this.f19609r0 = e;
                    }
                    h2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f13763a;
                    Message message2 = b10.f13759a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    h2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (q2.f e15) {
            s(e15, e15.f55876a);
        } catch (x2.b e16) {
            s(e16, 1002);
        }
        D();
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.i():void");
    }

    public final void i0(boolean z10) {
        if (!z10) {
            o0 o0Var = this.W;
            h2.i0 i0Var = this.f19603n;
            if (o0Var != null && this.V && !i0Var.f13763a.hasMessages(37)) {
                this.X++;
            }
            int i7 = this.X;
            if (i7 > 0) {
                this.O.d(new ai.u0(this, i7, 19));
            }
            this.X = 0;
            this.V = false;
            i0Var.e(37);
            o0 o0Var2 = this.W;
            if (o0Var2 != null) {
                W(o0Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z10;
        c();
    }

    @Override
    public final void i2(x2.f1 f1Var) {
        this.f19603n.b(9, (x2.e0) f1Var).b();
    }

    public final void j(v0 v0Var, int i7, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        o1 o1Var = this.f19586a[i7];
        boolean g10 = o1Var.g();
        b bVar = o1Var.f19579a;
        if (!g10) {
            if (v0Var == this.I.f19682i) {
                z11 = true;
            } else {
                z11 = false;
            }
            a3.y yVar = v0Var.f19661o;
            n1 n1Var = yVar.f144b[i7];
            a3.u uVar = yVar.f145c[i7];
            if (r0() && this.Y.f19473e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f19602l0++;
            x2.d1 d1Var = v0Var.f19651c[i7];
            long j10 = v0Var.f19662p;
            x2.g0 g0Var = v0Var.f19654g.f19665a;
            b bVar2 = o1Var.f19581c;
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
            int i12 = o1Var.d;
            j jVar = this.E;
            if (i12 != 0 && i12 != 2 && i12 != 4) {
                o1Var.f19583f = true;
                bVar2.getClass();
                if (bVar2.f19351n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                ma.p(z15);
                bVar2.d = n1Var;
                bVar2.H = g0Var;
                bVar2.f19351n = 1;
                bVar2.o(z13, z11);
                bVar2.y(uVarArr, d1Var, j3, j10, g0Var);
                bVar2.z(j3, z13, true);
                jVar.h(bVar2);
            } else {
                o1Var.f19582e = true;
                if (bVar.f19351n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ma.p(z14);
                bVar.d = n1Var;
                bVar.H = g0Var;
                bVar.f19351n = 1;
                bVar.o(z13, z11);
                bVar.y(uVarArr, d1Var, j3, j10, g0Var);
                bVar.z(j3, z13, true);
                jVar.h(bVar);
            }
            j0 j0Var = new j0(this);
            b d = o1Var.d(v0Var);
            d.getClass();
            d.c(11, j0Var);
            if (z12 && z11) {
                o1Var.m();
            }
        }
    }

    public final void j0(p1 p1Var) {
        this.T = p1Var;
        c();
    }

    public final void k(long j3, boolean[] zArr) {
        o1[] o1VarArr;
        long j10;
        v0 v0Var = this.I.f19683j;
        a3.y yVar = v0Var.f19661o;
        int i7 = 0;
        while (true) {
            o1VarArr = this.f19586a;
            if (i7 >= o1VarArr.length) {
                break;
            }
            if (!yVar.b(i7)) {
                o1VarArr[i7].k();
            }
            i7++;
        }
        int i10 = 0;
        while (i10 < o1VarArr.length) {
            if (!yVar.b(i10) || o1VarArr[i10].d(v0Var) != null) {
                j10 = j3;
            } else {
                j10 = j3;
                j(v0Var, i10, zArr[i10], j10);
            }
            i10++;
            j3 = j10;
        }
    }

    public final void k0(q1 q1Var) {
        this.S = q1Var;
    }

    public final long l(e2.l1 l1Var, Object obj, long j3) {
        e2.i1 i1Var = this.f19617x;
        int i7 = l1Var.g(obj, i1Var).f10426c;
        e2.k1 k1Var = this.f19615w;
        l1Var.n(i7, k1Var);
        if (k1Var.f10472f == -9223372036854775807L || !k1Var.a() || !k1Var.f10474i) {
            return -9223372036854775807L;
        }
        return h2.l0.S(h2.l0.C(k1Var.f10473g) - k1Var.f10472f) - (j3 + i1Var.f10427e);
    }

    public final void l0(boolean z10) {
        this.f19598h0 = z10;
        e2.l1 l1Var = this.Y.f19470a;
        x0 x0Var = this.I;
        x0Var.h = z10;
        int r10 = x0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            U(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long m(v0 v0Var) {
        if (v0Var == null) {
            return 0L;
        }
        long j3 = v0Var.f19662p;
        if (!v0Var.f19652e) {
            return j3;
        }
        int i7 = 0;
        while (true) {
            o1[] o1VarArr = this.f19586a;
            if (i7 < o1VarArr.length) {
                if (o1VarArr[i7].d(v0Var) != null) {
                    b d = o1VarArr[i7].d(v0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f19356y;
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

    public final void m0(x2.i1 i1Var) {
        this.Z.f(1);
        g1 g1Var = this.J;
        int size = g1Var.f19455b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        g1Var.f19461j = i1Var;
        u(g1Var.b(), false);
    }

    public final Pair n(e2.l1 l1Var) {
        long j3 = 0;
        if (l1Var.p()) {
            return Pair.create(h1.f19469u, 0L);
        }
        int a10 = l1Var.a(this.f19598h0);
        Pair i7 = l1Var.i(this.f19615w, this.f19617x, a10, -9223372036854775807L);
        x2.g0 p10 = this.I.p(l1Var, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (p10.b()) {
            Object obj = p10.f60216a;
            e2.i1 i1Var = this.f19617x;
            l1Var.g(obj, i1Var);
            if (p10.f60218c == i1Var.e(p10.f60217b)) {
                i1Var.f10429g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j3));
    }

    public final void n0(int i7) {
        h1 h1Var = this.Y;
        if (h1Var.f19473e != i7) {
            if (i7 != 2) {
                this.f19611s0 = -9223372036854775807L;
            }
            if (i7 != 3 && h1Var.f19483p) {
                this.Y = h1Var.i(false);
            }
            this.Y = this.Y.h(i7);
        }
    }

    public final long o(long j3) {
        v0 v0Var = this.I.f19685l;
        if (v0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f19604n0 - v0Var.f19662p));
    }

    public final void o0(d3.v vVar) {
        o1[] o1VarArr;
        for (o1 o1Var : this.f19586a) {
            b bVar = o1Var.f19579a;
            if (bVar.f19347b == 2) {
                bVar.c(7, vVar);
                b bVar2 = o1Var.f19581c;
                if (bVar2 != null) {
                    bVar2.c(7, vVar);
                }
            }
        }
    }

    public final void p(int i7) {
        h1 h1Var = this.Y;
        A0(i7, h1Var.f19481n, h1Var.f19480m, h1Var.f19479l);
    }

    public final void p0(Object obj, h2.i iVar) {
        o1[] o1VarArr;
        for (o1 o1Var : this.f19586a) {
            b bVar = o1Var.f19579a;
            if (bVar.f19347b == 2) {
                int i7 = o1Var.d;
                if (i7 != 4 && i7 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = o1Var.f19581c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i10 = this.Y.f19473e;
        if (i10 == 3 || i10 == 2) {
            this.f19603n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void q() {
        q0(this.f19616w0);
    }

    public final void q0(float f10) {
        o1[] o1VarArr;
        this.f19616w0 = f10;
        float f11 = f10 * this.Q.f11026g;
        for (o1 o1Var : this.f19586a) {
            b bVar = o1Var.f19579a;
            if (bVar.f19347b == 1) {
                bVar.c(2, Float.valueOf(f11));
                b bVar2 = o1Var.f19581c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void r(x2.e0 e0Var) {
        x0 x0Var = this.I;
        v0 v0Var = x0Var.f19685l;
        if (v0Var != null && v0Var.f19649a == e0Var) {
            x0Var.m(this.f19604n0);
            B();
            return;
        }
        v0 v0Var2 = x0Var.f19686m;
        if (v0Var2 != null && v0Var2.f19649a == e0Var) {
            C();
        }
    }

    public final boolean r0() {
        h1 h1Var = this.Y;
        if (h1Var.f19479l && h1Var.f19481n == 0) {
            return true;
        }
        return false;
    }

    public final void s(IOException iOException, int i7) {
        m mVar = new m(0, iOException, i7);
        v0 v0Var = this.I.f19682i;
        if (v0Var != null) {
            mVar = mVar.a(v0Var.f19654g.f19665a);
        }
        h2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
        u0(false, false);
        this.Y = this.Y.f(mVar);
    }

    public final boolean s0(e2.l1 l1Var, x2.g0 g0Var) {
        if (!g0Var.b() && !l1Var.p()) {
            int i7 = l1Var.g(g0Var.f60216a, this.f19617x).f10426c;
            e2.k1 k1Var = this.f19615w;
            l1Var.n(i7, k1Var);
            if (k1Var.a() && k1Var.f10474i && k1Var.f10472f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(boolean z10) {
        x2.g0 g0Var;
        long d;
        v0 v0Var = this.I.f19685l;
        if (v0Var == null) {
            g0Var = this.Y.f19471b;
        } else {
            g0Var = v0Var.f19654g.f19665a;
        }
        boolean equals = this.Y.f19478k.equals(g0Var);
        if (!equals) {
            this.Y = this.Y.c(g0Var);
        }
        h1 h1Var = this.Y;
        if (v0Var == null) {
            d = h1Var.f19486s;
        } else {
            d = v0Var.d();
        }
        h1Var.f19484q = d;
        h1 h1Var2 = this.Y;
        h1Var2.f19485r = o(h1Var2.f19484q);
        if ((!equals || z10) && v0Var != null && v0Var.f19652e) {
            x0(v0Var.f19654g.f19665a, v0Var.f19661o);
        }
    }

    public final void t0() {
        v0 v0Var = this.I.f19682i;
        if (v0Var != null) {
            a3.y yVar = v0Var.f19661o;
            int i7 = 0;
            while (true) {
                o1[] o1VarArr = this.f19586a;
                if (i7 < o1VarArr.length) {
                    if (yVar.b(i7)) {
                        o1VarArr[i7].m();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void u(e2.l1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.u(e2.l1, boolean):void");
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f19599i0) {
            z12 = false;
        } else {
            z12 = true;
        }
        N(z12, false, true, false);
        this.Z.f(z11 ? 1 : 0);
        i iVar = (i) this.f19595f;
        ConcurrentHashMap concurrentHashMap = iVar.f19502p;
        m2.i iVar2 = this.M;
        h hVar = (h) concurrentHashMap.get(iVar2);
        if (hVar != null) {
            int i7 = hVar.f19464a - 1;
            hVar.f19464a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(iVar2);
                iVar.c();
            }
        }
        this.Q.d(1, this.Y.f19479l);
        n0(1);
    }

    public final void v(x2.e0 e0Var) {
        v0 v0Var;
        x0 x0Var = this.I;
        v0 v0Var2 = x0Var.f19685l;
        j jVar = this.E;
        if (v0Var2 != null && v0Var2.f19649a == e0Var) {
            v0Var2.getClass();
            if (!v0Var2.f19652e) {
                float f10 = jVar.l().f10782a;
                h1 h1Var = this.Y;
                v0Var2.f(f10, h1Var.f19470a, h1Var.f19479l);
            }
            x0(v0Var2.f19654g.f19665a, v0Var2.f19661o);
            if (v0Var2 == x0Var.f19682i) {
                P(v0Var2.f19654g.f19666b, true);
                k(x0Var.f19683j.e(), new boolean[this.f19586a.length]);
                v0Var2.h = true;
                h1 h1Var2 = this.Y;
                x2.g0 g0Var = h1Var2.f19471b;
                long j3 = v0Var2.f19654g.f19666b;
                this.Y = x(g0Var, j3, h1Var2.f19472c, j3, false, 5);
            }
            B();
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 < x0Var.f19690q.size()) {
                v0Var = (v0) x0Var.f19690q.get(i7);
                if (v0Var.f19649a == e0Var) {
                    break;
                }
                i7++;
            } else {
                v0Var = null;
                break;
            }
        }
        if (v0Var != null) {
            ma.p(true ^ v0Var.f19652e);
            float f11 = jVar.l().f10782a;
            h1 h1Var3 = this.Y;
            v0Var.f(f11, h1Var3.f19470a, h1Var3.f19479l);
            v0 v0Var3 = x0Var.f19686m;
            if (v0Var3 != null && v0Var3.f19649a == e0Var) {
                C();
            }
        }
    }

    public final void v0() {
        o1[] o1VarArr;
        j jVar = this.E;
        jVar.f19506b = false;
        r1 r1Var = (r1) jVar.f19507c;
        if (r1Var.f19633c) {
            r1Var.c(r1Var.a());
            r1Var.f19633c = false;
        }
        for (o1 o1Var : this.f19586a) {
            b bVar = o1Var.f19581c;
            b bVar2 = o1Var.f19579a;
            if (o1.h(bVar2)) {
                o1.b(bVar2);
            }
            if (bVar != null && bVar.f19351n != 0) {
                o1.b(bVar);
            }
        }
    }

    public final void w(e2.w0 w0Var, float f10, boolean z10, boolean z11) {
        int i7;
        if (z10) {
            if (z11) {
                this.Z.f(1);
            }
            this.Y = this.Y.g(w0Var);
        }
        float f11 = w0Var.f10782a;
        v0 v0Var = this.I.f19682i;
        while (true) {
            i7 = 0;
            if (v0Var == null) {
                break;
            }
            a3.u[] uVarArr = v0Var.f19661o.f145c;
            int length = uVarArr.length;
            while (i7 < length) {
                a3.u uVar = uVarArr[i7];
                if (uVar != null) {
                    uVar.q(f11);
                }
                i7++;
            }
            v0Var = v0Var.f19659m;
        }
        o1[] o1VarArr = this.f19586a;
        int length2 = o1VarArr.length;
        while (i7 < length2) {
            o1 o1Var = o1VarArr[i7];
            float f12 = w0Var.f10782a;
            o1Var.f19579a.A(f10, f12);
            b bVar = o1Var.f19581c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i7++;
        }
    }

    public final void w0() {
        boolean z10;
        v0 v0Var = this.I.f19685l;
        if (!this.f19596f0 && (v0Var == null || !v0Var.f19649a.g())) {
            z10 = false;
        } else {
            z10 = true;
        }
        h1 h1Var = this.Y;
        if (z10 != h1Var.f19475g) {
            this.Y = h1Var.b(z10);
        }
    }

    public final h1 x(x2.g0 g0Var, long j3, long j10, long j11, boolean z10, int i7) {
        boolean z11;
        boolean z12;
        s1 s1Var;
        boolean z13;
        boolean z14;
        if (!this.f19607q0 && j3 == this.Y.f19486s && g0Var.equals(this.Y.f19471b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f19607q0 = z11;
        O();
        h1 h1Var = this.Y;
        x2.r1 r1Var = h1Var.h;
        a3.y yVar = h1Var.f19476i;
        List list = h1Var.f19477j;
        if (this.J.f19462k) {
            v0 v0Var = this.I.f19682i;
            if (v0Var == null) {
                r1Var = x2.r1.d;
            } else {
                r1Var = v0Var.f19660n;
            }
            if (v0Var == null) {
                yVar = this.f19593e;
            } else {
                yVar = v0Var.f19661o;
            }
            a3.u[] uVarArr = yVar.f145c;
            ?? b0Var = new h9.b0(4);
            boolean z15 = false;
            for (a3.u uVar : uVarArr) {
                if (uVar != null) {
                    e2.q0 q0Var = uVar.g(0).f10752l;
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
                h9.g0 g0Var2 = h9.i0.f13995b;
                s1Var = s1.f14058e;
            }
            list = s1Var;
            if (v0Var != null) {
                w0 w0Var = v0Var.f19654g;
                if (w0Var.d != j10) {
                    v0Var.f19654g = w0Var.a(j10);
                }
            }
            o1[] o1VarArr = this.f19586a;
            x0 x0Var = this.I;
            v0 v0Var2 = x0Var.f19682i;
            if (v0Var2 == x0Var.f19683j && v0Var2 != null) {
                a3.y yVar2 = v0Var2.f19661o;
                int i10 = 0;
                boolean z16 = false;
                while (true) {
                    if (i10 < o1VarArr.length) {
                        if (yVar2.b(i10)) {
                            if (o1VarArr[i10].f19579a.f19347b != 1) {
                                z13 = false;
                                break;
                            } else if (yVar2.f144b[i10].f19551a != 0) {
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
                if (z14 != this.f19601k0) {
                    this.f19601k0 = z14;
                    if (!z14 && this.Y.f19483p) {
                        this.f19603n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(h1Var.f19471b)) {
            r1Var = x2.r1.d;
            yVar = this.f19593e;
            list = s1.f14058e;
        }
        x2.r1 r1Var2 = r1Var;
        a3.y yVar3 = yVar;
        List list2 = list;
        if (z10) {
            m0 m0Var = this.Z;
            if (m0Var.d && m0Var.f19533e != 5) {
                if (i7 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ma.f(z12);
            } else {
                m0Var.f19532c = true;
                m0Var.d = true;
                m0Var.f19533e = i7;
            }
        }
        h1 h1Var2 = this.Y;
        return h1Var2.d(g0Var, j3, j10, j11, o(h1Var2.f19484q), r1Var2, yVar3, list2);
    }

    public final void x0(x2.g0 r10, a3.y r11) {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.x0(x2.g0, a3.y):void");
    }

    public final void y0(List list, int i7, int i10) {
        boolean z10;
        boolean z11 = true;
        this.Z.f(1);
        g1 g1Var = this.J;
        g1Var.getClass();
        ArrayList arrayList = g1Var.f19455b;
        if (i7 >= 0 && i7 <= i10 && i10 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        if (list.size() != i10 - i7) {
            z11 = false;
        }
        ma.f(z11);
        for (int i11 = i7; i11 < i10; i11++) {
            ((f1) arrayList.get(i11)).f19397a.t((e2.l0) list.get(i11 - i7));
        }
        u(g1Var.b(), false);
    }

    public final boolean z(int i7, x2.g0 g0Var) {
        boolean z10;
        boolean z11;
        x0 x0Var = this.I;
        v0 v0Var = x0Var.f19684k;
        if (v0Var != null && v0Var.f19654g.f19665a.equals(g0Var)) {
            o1 o1Var = this.f19586a[i7];
            v0 v0Var2 = x0Var.f19684k;
            int i10 = o1Var.d;
            if ((i10 == 2 || i10 == 4) && o1Var.d(v0Var2) == o1Var.f19579a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (o1Var.d == 3 && o1Var.d(v0Var2) == o1Var.f19581c) {
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

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: l2.p0.z0():void");
    }
}
