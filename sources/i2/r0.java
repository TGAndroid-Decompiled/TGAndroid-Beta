package i2;

import ai.z8;
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
public final class r0 implements Handler.Callback, u2.d0, k1, a3.y {
    public static final long f12541w0 = e2.m0.h0(10000);
    public final ArrayList E;
    public final e2.g0 F;
    public final x G;
    public final z0 H;
    public final i1 I;
    public final h J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.e P;
    public final boolean Q;
    public s1 R;
    public r1 S;
    public boolean T;
    public boolean U;
    public q0 V;
    public int W;
    public j1 X;
    public o0 Y;
    public boolean Z;
    public final q1[] f12542a;
    public boolean f12543a0;
    public final b[] f12544b;
    public boolean f12545b0;
    public final boolean[] f12546c;
    public boolean f12547c0;
    public final x2.s d;
    public long f12548d0;
    public final x2.t e;
    public boolean f12549e0;
    public final t0 f12550f;
    public int f12551f0;
    public boolean f12552g0;
    public final y2.c h;
    public boolean f12553h0;
    public boolean f12554i0;
    public boolean f12555j0;
    public int f12556k0;
    public q0 f12557l0;
    public long m0;
    public final e2.i0 f12558n;
    public long f12559n0;
    public int f12560o0;
    public boolean f12561p0;
    public n f12562q0;
    public final j6.l f12563r;
    public long f12564r0;
    public final Looper f12565s;
    public q f12566s0;
    public long f12567t0;
    public boolean f12568u0;
    public final b2.n1 v;
    public float f12569v0;
    public final b2.l1 f12570w;
    public final long f12571x;
    public final k f12572y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, x2.s sVar, x2.t tVar, t0 t0Var, y2.c cVar, int i10, boolean z10, j2.f fVar, s1 s1Var, h hVar, long j10, Looper looper, e2.g0 g0Var, x xVar, j2.k kVar, final a3.y yVar, boolean z11) {
        q qVar = q.f12533a;
        this.f12567t0 = -9223372036854775807L;
        this.G = xVar;
        this.d = sVar;
        this.e = tVar;
        this.f12550f = t0Var;
        this.h = cVar;
        this.f12551f0 = i10;
        this.f12552g0 = z10;
        this.R = s1Var;
        this.J = hVar;
        this.K = j10;
        this.f12543a0 = false;
        this.F = g0Var;
        this.L = kVar;
        this.f12566s0 = qVar;
        this.M = fVar;
        this.f12569v0 = 1.0f;
        this.S = r1.f12573b;
        this.Q = z11;
        this.f12564r0 = -9223372036854775807L;
        this.f12548d0 = -9223372036854775807L;
        this.f12571x = ((j) t0Var).f12442n;
        b2.k1 k1Var = b2.o1.f3890a;
        j1 k10 = j1.k(tVar);
        this.X = k10;
        this.Y = new o0(k10);
        this.f12544b = new b[bVarArr.length];
        this.f12546c = new boolean[bVarArr.length];
        x2.n nVar = (x2.n) sVar;
        nVar.getClass();
        this.f12542a = new q1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f12314f = kVar;
            bVar.h = g0Var;
            this.f12544b[i11] = bVar;
            b bVar2 = this.f12544b[i11];
            synchronized (bVar2.f12311a) {
                bVar2.H = nVar;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f12314f = kVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f12542a[i11] = new q1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.f12572y = new k(this, g0Var);
        this.E = new ArrayList();
        this.v = new b2.n1();
        this.f12570w = new b2.l1();
        u6.p(sVar.f49176a == null);
        sVar.f49176a = this;
        sVar.f49177b = cVar;
        this.f12561p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new z0(fVar, a2, new e1.c(this, 19));
        this.I = new i1(this, fVar, a2, kVar);
        j6.l lVar = new j6.l(7);
        this.f12563r = lVar;
        Looper d = lVar.d();
        this.f12565s = d;
        e2.i0 a10 = g0Var.a(d, this);
        this.f12558n = a10;
        this.P = new c2.e(context, d, this);
        a10.b(35, new a3.y() {
            @Override
            public final void b(long j11, long j12, b2.w wVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                yVar.b(j11, j12, wVar, mediaFormat);
                r0Var.b(j11, j12, wVar, mediaFormat);
            }
        }).b();
        a10.b(39, new k0(this)).b();
    }

    public static boolean A(x0 x0Var) {
        u2.d1[] d1VarArr;
        long d;
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.f12603a;
                if (!x0Var.e) {
                    r12.i();
                } else {
                    for (u2.d1 d1Var : x0Var.f12605c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                }
                if (!x0Var.e) {
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

    public static Pair T(b2.o1 o1Var, q0 q0Var, boolean z10, int i10, boolean z11, b2.n1 n1Var, b2.l1 l1Var) {
        b2.o1 o1Var2;
        int U;
        b2.o1 o1Var3 = q0Var.f12534a;
        if (!o1Var.p()) {
            if (o1Var3.p()) {
                o1Var2 = o1Var;
            } else {
                o1Var2 = o1Var3;
            }
            try {
                Pair i11 = o1Var2.i(n1Var, l1Var, q0Var.f12535b, q0Var.f12536c);
                if (!o1Var.equals(o1Var2)) {
                    if (o1Var.b(i11.first) != -1) {
                        if (o1Var2.g(i11.first, l1Var).f3823f && o1Var2.m(l1Var.f3822c, n1Var, 0L).f3877n == o1Var2.b(i11.first)) {
                            return o1Var.i(n1Var, l1Var, o1Var.g(i11.first, l1Var).f3822c, q0Var.f12536c);
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
        Object obj2 = o1Var3.m(o1Var3.g(obj, l1Var).f3822c, n1Var, 0L).f3867a;
        for (int i11 = 0; i11 < o1Var2.o(); i11++) {
            if (o1Var2.m(i11, n1Var, 0L).f3867a.equals(obj2)) {
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
        return o1Var2.f(i12, l1Var, false).f3822c;
    }

    public static void g(m1 m1Var) {
        try {
            synchronized (m1Var) {
                synchronized (m1Var) {
                }
                m1Var.f12478a.c(m1Var.f12480c, m1Var.d);
                return;
            }
            m1Var.f12478a.c(m1Var.f12480c, m1Var.d);
            return;
        } finally {
            m1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.A0():void");
    }

    public final boolean B(int i10, u2.g0 g0Var) {
        boolean z10;
        boolean z11;
        z0 z0Var = this.H;
        x0 x0Var = z0Var.f12635k;
        if (x0Var != null && x0Var.f12607g.f12618a.equals(g0Var)) {
            q1 q1Var = this.f12542a[i10];
            x0 x0Var2 = z0Var.f12635k;
            int i11 = q1Var.d;
            if ((i11 == 2 || i11 == 4) && q1Var.d(x0Var2) == q1Var.f12537a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (q1Var.d == 3 && q1Var.d(x0Var2) == q1Var.f12539c) {
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
        j1 j1Var = this.X;
        if (j1Var.f12457l != z11 || j1Var.f12459n != i11 || j1Var.f12458m != i12) {
            this.X = j1Var.e(i12, i11, z11);
            E0(false, false);
            z0 z0Var = this.H;
            for (x0 x0Var = z0Var.f12633i; x0Var != null; x0Var = x0Var.f12612m) {
                for (x2.p pVar : x0Var.f12614o.f49181c) {
                    if (pVar != null) {
                        pVar.e(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                j1 j1Var2 = this.X;
                if (j1Var2.f12461p) {
                    this.X = j1Var2.i(false);
                }
                z0Var.m(this.m0);
                return;
            }
            int i13 = this.X.e;
            e2.i0 i0Var = this.f12558n;
            if (i13 == 3) {
                k kVar = this.f12572y;
                kVar.f12469f = true;
                kVar.f12466a.d();
                u0();
                i0Var.f(2);
            } else if (i13 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final boolean C() {
        x0 x0Var = this.H.f12633i;
        long j10 = x0Var.f12607g.f12621f;
        if (x0Var.e) {
            if (j10 == -9223372036854775807L || this.X.f12464s < j10 || !s0()) {
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
        x0 x0Var = this.H.f12633i;
        if (x0Var != null) {
            if (x0Var.e) {
                j10 = x0Var.f12603a.o();
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L) {
                if (!x0Var.g()) {
                    this.H.n(x0Var);
                    v(false);
                    D();
                }
                R(j10, true);
                if (j10 != this.X.f12464s) {
                    j1 j1Var = this.X;
                    this.X = z(j1Var.f12450b, j10, j1Var.f12451c, j10, true, 5);
                }
            } else {
                k kVar = this.f12572y;
                if (x0Var != this.H.f12634j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t1 t1Var = kVar.f12466a;
                b bVar = kVar.f12468c;
                if (bVar != null && !bVar.l() && ((!z10 || kVar.f12468c.f12315n == 2) && (kVar.f12468c.m() || (!z10 && !kVar.f12468c.k())))) {
                    w0 w0Var = kVar.d;
                    w0Var.getClass();
                    long a2 = w0Var.a();
                    if (kVar.e) {
                        if (a2 < t1Var.a()) {
                            if (t1Var.f12588c) {
                                t1Var.c(t1Var.a());
                                t1Var.f12588c = false;
                            }
                        } else {
                            kVar.e = false;
                            if (kVar.f12469f) {
                                t1Var.d();
                            }
                        }
                    }
                    t1Var.c(a2);
                    b2.z0 h = w0Var.h();
                    if (!h.equals((b2.z0) t1Var.e)) {
                        t1Var.f(h);
                        kVar.f12467b.f12558n.b(16, h).b();
                    }
                } else {
                    kVar.e = true;
                    if (kVar.f12469f) {
                        t1Var.d();
                    }
                }
                long a10 = kVar.a();
                this.m0 = a10;
                long j13 = a10 - x0Var.f12615p;
                long j14 = this.X.f12464s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f12450b.b()) {
                    if (this.f12561p0) {
                        this.f12561p0 = false;
                    }
                    j1 j1Var2 = this.X;
                    j1Var2.f12449a.b(j1Var2.f12450b.f47306a);
                    int min = Math.min(this.f12560o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f12560o0 = min;
                }
                if (this.f12572y.b()) {
                    boolean z11 = !this.Y.d;
                    j1 j1Var3 = this.X;
                    this.X = z(j1Var3.f12450b, j13, j1Var3.f12451c, j13, z11, 6);
                } else {
                    j1 j1Var4 = this.X;
                    j1Var4.f12464s = j13;
                    j1Var4.f12465t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f12462q = this.H.f12636l.d();
            j1 j1Var5 = this.X;
            j1Var5.f12463r = q(j1Var5.f12462q);
            j1 j1Var6 = this.X;
            if (j1Var6.f12457l && j1Var6.e == 3 && t0(j1Var6.f12449a, j1Var6.f12450b)) {
                j1 j1Var7 = this.X;
                float f10 = 1.0f;
                if (j1Var7.f12460o.f4152a == 1.0f) {
                    h hVar = this.J;
                    long n10 = n(j1Var7.f12449a, j1Var7.f12450b.f47306a, j1Var7.f12464s);
                    long j15 = this.X.f12463r;
                    if (hVar.f12364c != -9223372036854775807L) {
                        long j16 = n10 - j15;
                        if (hVar.f12371m == -9223372036854775807L) {
                            hVar.f12371m = j16;
                            hVar.f12372n = 0L;
                        } else {
                            hVar.f12371m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            hVar.f12372n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) hVar.f12372n) * 0.999f);
                        }
                        if (hVar.f12370l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - hVar.f12370l < 1000) {
                                f10 = hVar.f12369k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        hVar.f12370l = SystemClock.elapsedRealtime();
                        long j17 = (hVar.f12372n * 3) + hVar.f12371m;
                        if (hVar.h > j17) {
                            float S = (float) e2.m0.S(j12);
                            f7 = 1.0E-7f;
                            long[] jArr = {j17, hVar.e, hVar.h - (((hVar.f12369k - 1.0f) * S) + ((hVar.f12367i - 1.0f) * S))};
                            long j18 = jArr[0];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j19 = jArr[i10];
                                if (j19 > j18) {
                                    j18 = j19;
                                }
                            }
                            hVar.h = j18;
                        } else {
                            f7 = 1.0E-7f;
                            long j20 = e2.m0.j(n10 - (Math.max(0.0f, hVar.f12369k - 1.0f) / 1.0E-7f), hVar.h, j17);
                            hVar.h = j20;
                            long j21 = hVar.f12366g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                hVar.h = j21;
                            }
                        }
                        long j22 = n10 - hVar.h;
                        if (Math.abs(j22) < hVar.f12362a) {
                            hVar.f12369k = 1.0f;
                        } else {
                            hVar.f12369k = e2.m0.h((f7 * ((float) j22)) + 1.0f, hVar.f12368j, hVar.f12367i);
                        }
                        f10 = hVar.f12369k;
                    }
                    if (this.f12572y.h().f4152a != f10) {
                        b2.z0 z0Var = new b2.z0(f10, this.X.f12460o.f4153b);
                        this.f12558n.e(16);
                        this.f12572y.f(z0Var);
                        y(this.X.f12460o, this.f12572y.h().f4152a, false, false);
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
        if (!A(this.H.f12636l)) {
            b10 = false;
        } else {
            x0 x0Var = this.H.f12636l;
            if (!x0Var.e) {
                d = 0;
            } else {
                d = x0Var.f12603a.d();
            }
            long q6 = q(d);
            x0 x0Var2 = this.H.f12633i;
            if (t0(this.X.f12449a, x0Var.f12607g.f12618a)) {
                j10 = this.J.h;
            } else {
                j10 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.o1 o1Var = this.X.f12449a;
            u2.g0 g0Var = x0Var.f12607g.f12618a;
            float f7 = this.f12572y.h().f4152a;
            boolean z13 = this.X.f12457l;
            s0 s0Var = new s0(kVar, o1Var, g0Var, q6, f7, this.f12547c0, j10);
            b10 = ((j) this.f12550f).b(s0Var);
            x0 x0Var3 = this.H.f12633i;
            if (!b10 && x0Var3.e && q6 < 500000 && this.f12571x > 0) {
                x0Var3.f12603a.l(this.X.f12464s);
                b10 = ((j) this.f12550f).b(s0Var);
            }
        }
        this.f12549e0 = b10;
        if (b10) {
            x0 x0Var4 = this.H.f12636l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.f12591a = this.m0 - x0Var4.f12615p;
            float f10 = this.f12572y.h().f4152a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            u6.g(z10);
            u0Var.f12592b = f10;
            long j11 = this.f12548d0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            u6.g(z11);
            u0Var.f12593c = j11;
            v0 v0Var = new v0(u0Var);
            if (x0Var4.f12612m == null) {
                z12 = true;
            }
            u6.p(z12);
            x0Var4.f12603a.p(v0Var);
        }
        x0();
    }

    public final void D0(b2.o1 o1Var, u2.g0 g0Var, b2.o1 o1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        Object obj;
        b2.z0 z0Var;
        boolean t02 = t0(o1Var, g0Var);
        Object obj2 = g0Var.f47306a;
        if (!t02) {
            if (g0Var.b()) {
                z0Var = b2.z0.d;
            } else {
                z0Var = this.X.f12460o;
            }
            k kVar = this.f12572y;
            if (!kVar.h().equals(z0Var)) {
                this.f12558n.e(16);
                kVar.f(z0Var);
                y(this.X.f12460o, z0Var.f4152a, false, false);
                return;
            }
            return;
        }
        b2.l1 l1Var = this.f12570w;
        int i10 = o1Var.g(obj2, l1Var).f3822c;
        b2.n1 n1Var = this.v;
        o1Var.n(i10, n1Var);
        b2.i0 i0Var = n1Var.f3873j;
        h hVar = this.J;
        hVar.getClass();
        hVar.f12364c = e2.m0.S(i0Var.f3781a);
        hVar.f12365f = e2.m0.S(i0Var.f3782b);
        hVar.f12366g = e2.m0.S(i0Var.f3783c);
        float f7 = i0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        hVar.f12368j = f7;
        float f10 = i0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        hVar.f12367i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            hVar.f12364c = -9223372036854775807L;
        }
        hVar.a();
        if (j10 != -9223372036854775807L) {
            hVar.d = n(o1Var, obj2, j10);
            hVar.a();
            return;
        }
        Object obj3 = n1Var.f3867a;
        if (!o1Var2.p()) {
            obj = o1Var2.m(o1Var2.g(g0Var2.f47306a, l1Var).f3822c, n1Var, 0L).f3867a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        hVar.d = -9223372036854775807L;
        hVar.a();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        z0 z0Var = this.H;
        z0Var.k();
        x0 x0Var = z0Var.f12637m;
        if (x0Var != null) {
            ?? r12 = x0Var.f12603a;
            if ((!x0Var.d || x0Var.e) && !r12.c()) {
                b2.o1 o1Var = this.X.f12449a;
                if (x0Var.e) {
                    r12.s();
                }
                for (i iVar : ((j) this.f12550f).f12444p.values()) {
                    if (iVar.f12380b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!x0Var.d) {
                    long j10 = x0Var.f12607g.f12619b;
                    x0Var.d = true;
                    r12.n(this, j10);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.f12591a = this.m0 - x0Var.f12615p;
                float f7 = this.f12572y.h().f4152a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u6.g(z10);
                u0Var.f12592b = f7;
                long j11 = this.f12548d0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                u6.g(z11);
                u0Var.f12593c = j11;
                v0 v0Var = new v0(u0Var);
                if (x0Var.f12612m != null) {
                    z12 = false;
                }
                u6.p(z12);
                r12.p(v0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f12547c0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f12548d0 = j10;
    }

    public final void F() {
        boolean z10;
        o0 o0Var = this.Y;
        j1 j1Var = this.X;
        boolean z11 = o0Var.f12494c;
        if (((j1) o0Var.f12495f) != j1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        o0Var.f12494c = z12;
        o0Var.f12495f = j1Var;
        if (z12) {
            i0 i0Var = this.G.f12602b;
            i0Var.f12396j.d(new hi.t(1, i0Var, o0Var));
            this.Y = new o0(this.X);
        }
    }

    public final void G(int i10) {
        q1 q1Var = this.f12542a[i10];
        try {
            x0 x0Var = this.H.f12633i;
            x0Var.getClass();
            b d = q1Var.d(x0Var);
            d.getClass();
            u2.d1 d1Var = d.f12316r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = q1Var.f12537a.f12312b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.t tVar = this.H.f12633i.f12614o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.w.c(tVar.f49181c[i10].m()), e);
            x2.t tVar2 = new x2.t((p1[]) tVar.f49180b.clone(), (x2.p[]) tVar.f49181c.clone(), tVar.d, tVar.e);
            tVar2.f49180b[i10] = null;
            tVar2.f49181c[i10] = null;
            j(i10);
            x0 x0Var2 = this.H.f12633i;
            x0Var2.a(tVar2, this.X.f12464s, false, new boolean[x0Var2.f12609j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f12546c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new z8(this, i10, z10, 1));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(n0 n0Var) {
        boolean z10;
        b2.o1 b10;
        this.Y.f(1);
        int i10 = n0Var.f12486a;
        int i11 = n0Var.f12487b;
        int i12 = n0Var.f12488c;
        u2.i1 i1Var = n0Var.d;
        i1 i1Var2 = this.I;
        ArrayList arrayList = i1Var2.f12423b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        i1Var2.f12428j = i1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((h1) arrayList.get(min)).d;
            e2.m0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                h1 h1Var = (h1) arrayList.get(min);
                h1Var.d = i13;
                i13 += h1Var.f12376a.f47255o.e.o();
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
        int i10;
        int i11;
        this.Y.f(1);
        P(false, false, false, true);
        j jVar = (j) this.f12550f;
        ConcurrentHashMap concurrentHashMap = jVar.f12444p;
        long id2 = Thread.currentThread().getId();
        long j10 = jVar.f12445q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        jVar.f12445q = id2;
        j2.k kVar = this.L;
        i iVar = (i) concurrentHashMap.get(kVar);
        if (iVar == null) {
            ?? obj = new Object();
            obj.f12379a = 1;
            concurrentHashMap.put(kVar, obj);
        } else {
            iVar.f12379a++;
        }
        i iVar2 = (i) concurrentHashMap.get(kVar);
        iVar2.getClass();
        Integer num = (Integer) jVar.f12443o.get(kVar.f13969a);
        if (num != null && num.intValue() != -1) {
            i10 = num.intValue();
        } else {
            i10 = jVar.f12440l;
        }
        if (i10 == -1) {
            i10 = 13107200;
        }
        iVar2.f12381c = i10;
        iVar2.f12380b = false;
        if (this.X.f12449a.p()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        o0(i11);
        j1 j1Var = this.X;
        boolean z11 = j1Var.f12457l;
        B0(this.P.d(j1Var.e, z11), j1Var.f12459n, j1Var.f12458m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        i1 i1Var = this.I;
        ArrayList arrayList = i1Var.f12423b;
        u6.p(!i1Var.f12429k);
        i1Var.f12430l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            h1 h1Var = (h1) arrayList.get(i12);
            i1Var.e(h1Var);
            i1Var.f12426g.add(h1Var);
        }
        i1Var.f12429k = true;
        this.f12558n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.l lVar = this.f12563r;
        e2.i0 i0Var = this.f12558n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f12550f;
            j2.k kVar = this.L;
            j jVar = (j) t0Var;
            ConcurrentHashMap concurrentHashMap = jVar.f12444p;
            i iVar2 = (i) concurrentHashMap.get(kVar);
            if (iVar2 != null) {
                int i10 = iVar2.f12379a - 1;
                iVar2.f12379a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(kVar);
                    jVar.c();
                }
            }
            if (jVar.f12444p.isEmpty()) {
                jVar.f12445q = -1L;
            }
            c2.e eVar = this.P;
            eVar.f4497c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f8237a.removeCallbacksAndMessages(null);
            lVar.g();
            iVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f12542a.length; i10++) {
            b bVar = this.f12544b[i10];
            synchronized (bVar.f12311a) {
                bVar.H = null;
            }
            q1 q1Var = this.f12542a[i10];
            b bVar2 = q1Var.f12537a;
            boolean z11 = true;
            if (bVar2.f12315n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            bVar2.q();
            q1Var.e = false;
            b bVar3 = q1Var.f12539c;
            if (bVar3 != null) {
                if (bVar3.f12315n != 0) {
                    z11 = false;
                }
                u6.p(z11);
                bVar3.q();
                q1Var.f12540f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        boolean z10 = true;
        this.Y.f(1);
        i1 i1Var2 = this.I;
        i1Var2.getClass();
        if (i10 < 0 || i10 > i11 || i11 > i1Var2.f12423b.size()) {
            z10 = false;
        }
        u6.g(z10);
        i1Var2.f12428j = i1Var;
        i1Var2.g(i10, i11);
        w(i1Var2.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        x0 x0Var = this.H.f12633i;
        if (x0Var != null && x0Var.f12607g.f12624j && this.f12543a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12545b0 = z10;
    }

    public final void R(long j10, boolean z10) {
        z0 z0Var;
        long j11;
        q1[] q1VarArr;
        x2.p[] pVarArr;
        x0 x0Var = this.H.f12633i;
        if (x0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = x0Var.f12615p;
        }
        long j12 = j10 + j11;
        this.m0 = j12;
        this.f12572y.f12466a.c(j12);
        for (q1 q1Var : this.f12542a) {
            long j13 = this.m0;
            b d = q1Var.d(x0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (x0 x0Var2 = z0Var.f12633i; x0Var2 != null; x0Var2 = x0Var2.f12612m) {
            for (x2.p pVar : x0Var2.f12614o.f49181c) {
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
        q1[] q1VarArr;
        x0 x0Var;
        long j11;
        boolean z10 = this.T;
        long j12 = 1000;
        long j13 = f12541w0;
        if (z10) {
            this.S.getClass();
            if (this.X.e != 3) {
                j12 = j13;
            }
            for (q1 q1Var : this.f12542a) {
                long j14 = this.m0;
                long j15 = this.f12559n0;
                b bVar = q1Var.f12539c;
                b bVar2 = q1Var.f12537a;
                if (q1.h(bVar2)) {
                    j11 = bVar2.g(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f12315n != 0) {
                    j11 = Math.min(j11, bVar.g(j14, j15));
                }
                j12 = Math.min(j12, e2.m0.h0(j11));
            }
            if (this.X.m()) {
                x0 x0Var2 = this.H.f12633i;
                if (x0Var2 != null) {
                    x0Var = x0Var2.f12612m;
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    if ((((float) e2.m0.S(j12)) * this.X.f12460o.f4152a) + ((float) this.m0) >= ((float) x0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            j12 = j13;
        }
        this.f12558n.f8237a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.f12633i.f12607g.f12618a;
        long Y = Y(g0Var, this.X.f12464s, true, false);
        if (Y != this.X.f12464s) {
            j1 j1Var = this.X;
            this.X = z(g0Var, Y, j1Var.f12451c, j1Var.d, z10, 5);
        }
    }

    public final void X(i2.q0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.X(i2.q0):void");
    }

    public final long Y(u2.g0 g0Var, long j10, boolean z10, boolean z11) {
        z0 z0Var;
        q1[] q1VarArr;
        boolean z12;
        q1[] q1VarArr2;
        int i10;
        w0();
        boolean z13 = true;
        E0(false, true);
        if (z11 || this.X.e == 3) {
            o0(2);
        }
        x0 x0Var = this.H.f12633i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !g0Var.equals(x0Var2.f12607g.f12618a)) {
            x0Var2 = x0Var2.f12612m;
        }
        if (z10 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.f12615p + j10 < 0)) {
            for (int i11 = 0; i11 < this.f12542a.length; i11++) {
                j(i11);
            }
            this.f12567t0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    z0Var = this.H;
                    if (z0Var.f12633i == x0Var2) {
                        break;
                    }
                    z0Var.a();
                }
                z0Var.n(x0Var2);
                x0Var2.f12615p = 1000000000000L;
                m(this.H.f12634j.e(), new boolean[this.f12542a.length]);
                x0Var2.h = true;
            }
        }
        i();
        if (this.T) {
            for (q1 q1Var : this.f12542a) {
                if (q1Var.g() && ((i10 = q1Var.f12537a.f12312b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.H.n(x0Var2);
            if (!x0Var2.e) {
                x0Var2.f12607g = x0Var2.f12607g.b(j10, -9223372036854775807L);
            } else if (x0Var2.f12606f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f12449a.p() && x0Var2.f12607g.f12618a.equals(this.X.f12450b)) {
                        long j11 = x0Var2.f12615p + j10;
                        boolean z14 = true;
                        for (q1 q1Var2 : this.f12542a) {
                            if (q1Var2.g()) {
                                b d = q1Var2.d(x0Var2);
                                if (d != null && d.E(j11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = x0Var2.f12603a;
                            long j12 = this.X.f12464s;
                            s1 s1Var = s1.e;
                            if (r10.t(j12, s1Var) == x0Var2.f12603a.t(j10, s1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = x0Var2.f12603a.j(j10);
                x0Var2.f12603a.l(j10 - this.f12571x);
            }
            R(j10, z13);
            D();
        } else {
            this.H.b();
            R(j10, true);
        }
        v(false);
        this.f12558n.f(2);
        return j10;
    }

    public final void Z(m1 m1Var) {
        m1Var.getClass();
        Looper looper = m1Var.e;
        Looper looper2 = this.f12565s;
        e2.i0 i0Var = this.f12558n;
        if (looper == looper2) {
            g(m1Var);
            int i10 = this.X.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, m1Var).b();
    }

    @Override
    public final void a(u2.e0 e0Var) {
        this.f12558n.b(8, e0Var).b();
    }

    public final void a0(m1 m1Var) {
        Looper looper = m1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            m1Var.a(false);
            return;
        }
        this.F.a(looper, null).d(new bc(this, m1Var));
    }

    @Override
    public final void b(long j10, long j11, b2.w wVar, MediaFormat mediaFormat) {
        if (this.U) {
            this.f12558n.a(37).b();
        }
    }

    public final void b0(b2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.b0(b2.f, boolean):void");
    }

    public final void c(m0 m0Var, int i10) {
        this.Y.f(1);
        i1 i1Var = this.I;
        if (i10 == -1) {
            i10 = i1Var.f12423b.size();
        }
        w(i1Var.a(i10, m0Var.f12475a, m0Var.f12476b), false);
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.f12553h0 != z10) {
            this.f12553h0 = z10;
            if (!z10) {
                for (q1 q1Var : this.f12542a) {
                    q1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void d() {
        q1[] q1VarArr;
        r1 r1Var;
        for (q1 q1Var : this.f12542a) {
            if (this.T) {
                r1Var = this.S;
            } else {
                r1Var = null;
            }
            q1Var.f12537a.c(18, r1Var);
            b bVar = q1Var.f12539c;
            if (bVar != null) {
                bVar.c(18, r1Var);
            }
        }
    }

    public final void d0(k0 k0Var) {
        q1[] q1VarArr;
        for (q1 q1Var : this.f12542a) {
            b bVar = q1Var.f12537a;
            if (bVar.f12312b == 4) {
                bVar.c(23, k0Var);
                b bVar2 = q1Var.f12539c;
                if (bVar2 != null) {
                    bVar2.c(23, k0Var);
                }
            }
        }
    }

    public final boolean e() {
        if (!this.O) {
            return false;
        }
        for (q1 q1Var : this.f12542a) {
            if (q1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(m0 m0Var) {
        this.Y.f(1);
        int i10 = m0Var.f12477c;
        u2.i1 i1Var = m0Var.f12476b;
        ArrayList arrayList = m0Var.f12475a;
        if (i10 != -1) {
            this.f12557l0 = new q0(new o1(arrayList, i1Var), m0Var.f12477c, m0Var.d);
        }
        i1 i1Var2 = this.I;
        ArrayList arrayList2 = i1Var2.f12423b;
        i1Var2.g(0, arrayList2.size());
        w(i1Var2.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(boolean z10) {
        this.f12543a0 = z10;
        Q();
        if (this.f12545b0) {
            z0 z0Var = this.H;
            if (z0Var.f12634j != z0Var.f12633i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g0(b2.z0 z0Var) {
        this.f12558n.e(16);
        k kVar = this.f12572y;
        kVar.f(z0Var);
        b2.z0 h = kVar.h();
        y(h, h.f4152a, true, true);
    }

    @Override
    public final void h(u2.f1 f1Var) {
        this.f12558n.b(9, (u2.e0) f1Var).b();
    }

    public final void h0(q qVar) {
        this.f12566s0 = qVar;
        b2.o1 o1Var = this.X.f12449a;
        z0 z0Var = this.H;
        z0Var.getClass();
        qVar.getClass();
        if (!z0Var.f12641q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < z0Var.f12641q.size(); i10++) {
                ((x0) z0Var.f12641q.get(i10)).i();
            }
            z0Var.f12641q = arrayList;
            z0Var.f12637m = null;
            z0Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        x0 x0Var;
        u2.g0 g0Var;
        x0 x0Var2;
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
                    k();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((b2.z0) message.obj);
                    break;
                case 5:
                    l0((s1) message.obj);
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
                    t((u2.e0) message.obj);
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
                    Z((m1) message.obj);
                    break;
                case 15:
                    a0((m1) message.obj);
                    break;
                case 16:
                    b2.z0 z0Var = (b2.z0) message.obj;
                    y(z0Var, z0Var.f4152a, true, false);
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
                    f();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    z0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    h0((q) message.obj);
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
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    p0((a3.y) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.U = false;
                    q0 q0Var = this.V;
                    if (q0Var != null) {
                        X(q0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((r1) message.obj);
                    break;
                case 39:
                    d0((k0) message.obj);
                    break;
            }
        } catch (b2.w0 e) {
            boolean z15 = e.f4135a;
            int i14 = e.f4136b;
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
                u(e, i12);
            }
            i12 = i11;
            u(e, i12);
        } catch (g2.j e7) {
            u(e7, e7.f10781a);
        } catch (n e10) {
            e = e10;
            int i15 = e.f12482s;
            z0 z0Var2 = this.H;
            if (i15 == 1 && (x0Var2 = z0Var2.f12634j) != null && e.E == null) {
                e = e.a(x0Var2.f12607g.f12618a);
            }
            int i16 = e.f12482s;
            e2.i0 i0Var = this.f12558n;
            if (i16 == 1 && (g0Var = e.E) != null && B(e.f12483w, g0Var)) {
                this.f12568u0 = true;
                i();
                x0 g10 = z0Var2.g();
                x0 x0Var3 = z0Var2.f12633i;
                if (x0Var3 != g10) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.f12612m;
                        if (x0Var4 == g10) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                z0Var2.n(x0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                n nVar = this.f12562q0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f12562q0;
                }
                if (e.f12482s == 1 && z0Var2.f12633i != z0Var2.f12634j) {
                    while (true) {
                        x0Var = z0Var2.f12633i;
                        if (x0Var == z0Var2.f12634j) {
                            break;
                        }
                        z0Var2.a();
                    }
                    u6.k(x0Var);
                    F();
                    y0 y0Var = x0Var.f12607g;
                    u2.g0 g0Var2 = y0Var.f12618a;
                    long j10 = y0Var.f12619b;
                    this.X = z(g0Var2, j10, y0Var.d, j10, true, 0);
                }
                if (e.F && (this.f12562q0 == null || (i10 = e.f4147a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f12562q0 == null) {
                        this.f12562q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f8237a;
                    Message message2 = b10.f8233a;
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
            u(e11, 2000);
        } catch (RuntimeException e12) {
            n nVar2 = new n(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.d("ExoPlayerImplInternal", "Playback error", nVar2);
            v0(true, false);
            this.X = this.X.f(nVar2);
        } catch (n2.g e13) {
            u(e13, e13.f17051a);
        } catch (u2.b e14) {
            u(e14, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        q1[] q1VarArr;
        boolean z10;
        b bVar;
        if (this.O && e()) {
            for (q1 q1Var : this.f12542a) {
                int c10 = q1Var.c();
                k kVar = this.f12572y;
                if (q1Var.f()) {
                    int i10 = q1Var.d;
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
                            bVar = q1Var.f12537a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = q1Var.f12539c;
                        bVar.getClass();
                    }
                    q1Var.a(bVar, kVar);
                    try {
                        q1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    q1Var.d = i11;
                }
                this.f12556k0 -= c10 - q1Var.c();
            }
            this.f12567t0 = -9223372036854775807L;
        }
    }

    public final void i0(int i10) {
        this.f12551f0 = i10;
        b2.o1 o1Var = this.X.f12449a;
        z0 z0Var = this.H;
        z0Var.f12632g = i10;
        int r10 = z0Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final void j(int i10) {
        boolean z10;
        q1[] q1VarArr = this.f12542a;
        int c10 = q1VarArr[i10].c();
        q1 q1Var = q1VarArr[i10];
        b bVar = q1Var.f12537a;
        k kVar = this.f12572y;
        q1Var.a(bVar, kVar);
        b bVar2 = q1Var.f12539c;
        if (bVar2 != null) {
            if (bVar2.f12315n != 0 && q1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            q1Var.a(bVar2, kVar);
            q1Var.i(false);
            if (z10) {
                b bVar3 = q1Var.f12537a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        q1Var.d = 0;
        H(i10, false);
        this.f12556k0 -= c10;
    }

    public final void j0(boolean z10) {
        if (!z10) {
            q0 q0Var = this.V;
            e2.i0 i0Var = this.f12558n;
            if (q0Var != null && this.U && !i0Var.f8237a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new ah.g(this, i10, 11));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            q0 q0Var2 = this.V;
            if (q0Var2 != null) {
                X(q0Var2);
                this.V = null;
                this.U = false;
            }
        }
        this.T = z10;
        d();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.k():void");
    }

    public final void k0(r1 r1Var) {
        this.S = r1Var;
        d();
    }

    public final void l(x0 x0Var, int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        q1 q1Var = this.f12542a[i10];
        boolean g10 = q1Var.g();
        b bVar = q1Var.f12537a;
        if (!g10) {
            if (x0Var == this.H.f12633i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.t tVar = x0Var.f12614o;
            p1 p1Var = tVar.f49180b[i10];
            x2.p pVar = tVar.f49181c[i10];
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
            this.f12556k0++;
            u2.d1 d1Var = x0Var.f12605c[i10];
            long j11 = x0Var.f12615p;
            u2.g0 g0Var = x0Var.f12607g.f12618a;
            b bVar2 = q1Var.f12539c;
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
            int i13 = q1Var.d;
            k kVar = this.f12572y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                q1Var.f12540f = true;
                bVar2.getClass();
                if (bVar2.f12315n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                u6.p(z15);
                bVar2.d = p1Var;
                bVar2.G = g0Var;
                bVar2.f12315n = 1;
                bVar2.o(z13, z11);
                bVar2.y(wVarArr, d1Var, j10, j11, g0Var);
                bVar2.z(j10, z13, true);
                kVar.c(bVar2);
            } else {
                q1Var.e = true;
                if (bVar.f12315n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                u6.p(z14);
                bVar.d = p1Var;
                bVar.G = g0Var;
                bVar.f12315n = 1;
                bVar.o(z13, z11);
                bVar.y(wVarArr, d1Var, j10, j11, g0Var);
                bVar.z(j10, z13, true);
                kVar.c(bVar);
            }
            l0 l0Var = new l0(this);
            b d = q1Var.d(x0Var);
            d.getClass();
            d.c(11, l0Var);
            if (z12 && z11) {
                q1Var.m();
            }
        }
    }

    public final void l0(s1 s1Var) {
        this.R = s1Var;
    }

    public final void m(long j10, boolean[] zArr) {
        q1[] q1VarArr;
        long j11;
        x0 x0Var = this.H.f12634j;
        x2.t tVar = x0Var.f12614o;
        int i10 = 0;
        while (true) {
            q1VarArr = this.f12542a;
            if (i10 >= q1VarArr.length) {
                break;
            }
            if (!tVar.b(i10)) {
                q1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < q1VarArr.length) {
            if (!tVar.b(i11) || q1VarArr[i11].d(x0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                l(x0Var, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public final void m0(boolean z10) {
        this.f12552g0 = z10;
        b2.o1 o1Var = this.X.f12449a;
        z0 z0Var = this.H;
        z0Var.h = z10;
        int r10 = z0Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final long n(b2.o1 o1Var, Object obj, long j10) {
        b2.l1 l1Var = this.f12570w;
        int i10 = o1Var.g(obj, l1Var).f3822c;
        b2.n1 n1Var = this.v;
        o1Var.n(i10, n1Var);
        if (n1Var.f3870f == -9223372036854775807L || !n1Var.a() || !n1Var.f3872i) {
            return -9223372036854775807L;
        }
        return e2.m0.S(e2.m0.C(n1Var.f3871g) - n1Var.f3870f) - (j10 + l1Var.e);
    }

    public final void n0(u2.i1 i1Var) {
        this.Y.f(1);
        i1 i1Var2 = this.I;
        int size = i1Var2.f12423b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        i1Var2.f12428j = i1Var;
        w(i1Var2.b(), false);
    }

    public final long o(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j10 = x0Var.f12615p;
        if (!x0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            q1[] q1VarArr = this.f12542a;
            if (i10 < q1VarArr.length) {
                if (q1VarArr[i10].d(x0Var) != null) {
                    b d = q1VarArr[i10].d(x0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f12319x;
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

    public final void o0(int i10) {
        j1 j1Var = this.X;
        if (j1Var.e != i10) {
            if (i10 != 2) {
                this.f12564r0 = -9223372036854775807L;
            }
            if (i10 != 3 && j1Var.f12461p) {
                this.X = j1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final Pair p(b2.o1 o1Var) {
        long j10 = 0;
        if (o1Var.p()) {
            return Pair.create(j1.f12448u, 0L);
        }
        int a2 = o1Var.a(this.f12552g0);
        Pair i10 = o1Var.i(this.v, this.f12570w, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(o1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f47306a;
            b2.l1 l1Var = this.f12570w;
            o1Var.g(obj, l1Var);
            if (p5.f47308c == l1Var.e(p5.f47307b)) {
                l1Var.f3824g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j10));
    }

    public final void p0(a3.y yVar) {
        q1[] q1VarArr;
        for (q1 q1Var : this.f12542a) {
            b bVar = q1Var.f12537a;
            if (bVar.f12312b == 2) {
                bVar.c(7, yVar);
                b bVar2 = q1Var.f12539c;
                if (bVar2 != null) {
                    bVar2.c(7, yVar);
                }
            }
        }
    }

    public final long q(long j10) {
        x0 x0Var = this.H.f12636l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - x0Var.f12615p));
    }

    public final void q0(Object obj, e2.i iVar) {
        q1[] q1VarArr;
        for (q1 q1Var : this.f12542a) {
            b bVar = q1Var.f12537a;
            if (bVar.f12312b == 2) {
                int i10 = q1Var.d;
                if (i10 != 4 && i10 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = q1Var.f12539c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.f12558n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r(int i10) {
        j1 j1Var = this.X;
        B0(i10, j1Var.f12459n, j1Var.f12458m, j1Var.f12457l);
    }

    public final void r0(float f7) {
        q1[] q1VarArr;
        this.f12569v0 = f7;
        float f10 = f7 * this.P.f4499g;
        for (q1 q1Var : this.f12542a) {
            b bVar = q1Var.f12537a;
            if (bVar.f12312b == 1) {
                bVar.c(2, Float.valueOf(f10));
                b bVar2 = q1Var.f12539c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s() {
        r0(this.f12569v0);
    }

    public final boolean s0() {
        j1 j1Var = this.X;
        if (j1Var.f12457l && j1Var.f12459n == 0) {
            return true;
        }
        return false;
    }

    public final void t(u2.e0 e0Var) {
        z0 z0Var = this.H;
        x0 x0Var = z0Var.f12636l;
        if (x0Var != null && x0Var.f12603a == e0Var) {
            z0Var.m(this.m0);
            D();
            return;
        }
        x0 x0Var2 = z0Var.f12637m;
        if (x0Var2 != null && x0Var2.f12603a == e0Var) {
            E();
        }
    }

    public final boolean t0(b2.o1 o1Var, u2.g0 g0Var) {
        if (!g0Var.b() && !o1Var.p()) {
            int i10 = o1Var.g(g0Var.f47306a, this.f12570w).f3822c;
            b2.n1 n1Var = this.v;
            o1Var.n(i10, n1Var);
            if (n1Var.a() && n1Var.f3872i && n1Var.f3870f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        x0 x0Var = this.H.f12633i;
        if (x0Var != null) {
            nVar = nVar.a(x0Var.f12607g.f12618a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", nVar);
        v0(false, false);
        this.X = this.X.f(nVar);
    }

    public final void u0() {
        x0 x0Var = this.H.f12633i;
        if (x0Var != null) {
            x2.t tVar = x0Var.f12614o;
            int i10 = 0;
            while (true) {
                q1[] q1VarArr = this.f12542a;
                if (i10 < q1VarArr.length) {
                    if (tVar.b(i10)) {
                        q1VarArr[i10].m();
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
        x0 x0Var = this.H.f12636l;
        if (x0Var == null) {
            g0Var = this.X.f12450b;
        } else {
            g0Var = x0Var.f12607g.f12618a;
        }
        boolean equals = this.X.f12456k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        j1 j1Var = this.X;
        if (x0Var == null) {
            d = j1Var.f12464s;
        } else {
            d = x0Var.d();
        }
        j1Var.f12462q = d;
        j1 j1Var2 = this.X;
        j1Var2.f12463r = q(j1Var2.f12462q);
        if ((!equals || z10) && x0Var != null && x0Var.e) {
            y0(x0Var.f12607g.f12618a, x0Var.f12614o);
        }
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f12553h0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        j jVar = (j) this.f12550f;
        ConcurrentHashMap concurrentHashMap = jVar.f12444p;
        j2.k kVar = this.L;
        i iVar = (i) concurrentHashMap.get(kVar);
        if (iVar != null) {
            int i10 = iVar.f12379a - 1;
            iVar.f12379a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(kVar);
                jVar.c();
            }
        }
        this.P.d(1, this.X.f12457l);
        o0(1);
    }

    public final void w(b2.o1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.w(b2.o1, boolean):void");
    }

    public final void w0() {
        q1[] q1VarArr;
        k kVar = this.f12572y;
        kVar.f12469f = false;
        t1 t1Var = kVar.f12466a;
        if (t1Var.f12588c) {
            t1Var.c(t1Var.a());
            t1Var.f12588c = false;
        }
        for (q1 q1Var : this.f12542a) {
            b bVar = q1Var.f12539c;
            b bVar2 = q1Var.f12537a;
            if (q1.h(bVar2)) {
                q1.b(bVar2);
            }
            if (bVar != null && bVar.f12315n != 0) {
                q1.b(bVar);
            }
        }
    }

    public final void x(u2.e0 e0Var) {
        x0 x0Var;
        z0 z0Var = this.H;
        x0 x0Var2 = z0Var.f12636l;
        k kVar = this.f12572y;
        if (x0Var2 != null && x0Var2.f12603a == e0Var) {
            x0Var2.getClass();
            if (!x0Var2.e) {
                float f7 = kVar.h().f4152a;
                j1 j1Var = this.X;
                x0Var2.f(f7, j1Var.f12449a, j1Var.f12457l);
            }
            y0(x0Var2.f12607g.f12618a, x0Var2.f12614o);
            if (x0Var2 == z0Var.f12633i) {
                R(x0Var2.f12607g.f12619b, true);
                m(z0Var.f12634j.e(), new boolean[this.f12542a.length]);
                x0Var2.h = true;
                j1 j1Var2 = this.X;
                u2.g0 g0Var = j1Var2.f12450b;
                long j10 = x0Var2.f12607g.f12619b;
                this.X = z(g0Var, j10, j1Var2.f12451c, j10, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < z0Var.f12641q.size()) {
                x0Var = (x0) z0Var.f12641q.get(i10);
                if (x0Var.f12603a == e0Var) {
                    break;
                }
                i10++;
            } else {
                x0Var = null;
                break;
            }
        }
        if (x0Var != null) {
            u6.p(true ^ x0Var.e);
            float f10 = kVar.h().f4152a;
            j1 j1Var3 = this.X;
            x0Var.f(f10, j1Var3.f12449a, j1Var3.f12457l);
            x0 x0Var3 = z0Var.f12637m;
            if (x0Var3 != null && x0Var3.f12603a == e0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z10;
        x0 x0Var = this.H.f12636l;
        if (!this.f12549e0 && (x0Var == null || !x0Var.f12603a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        j1 j1Var = this.X;
        if (z10 != j1Var.f12453g) {
            this.X = j1Var.b(z10);
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
        float f10 = z0Var.f4152a;
        x0 x0Var = this.H.f12633i;
        while (true) {
            i10 = 0;
            if (x0Var == null) {
                break;
            }
            x2.p[] pVarArr = x0Var.f12614o.f49181c;
            int length = pVarArr.length;
            while (i10 < length) {
                x2.p pVar = pVarArr[i10];
                if (pVar != null) {
                    pVar.p(f10);
                }
                i10++;
            }
            x0Var = x0Var.f12612m;
        }
        q1[] q1VarArr = this.f12542a;
        int length2 = q1VarArr.length;
        while (i10 < length2) {
            q1 q1Var = q1VarArr[i10];
            float f11 = z0Var.f4152a;
            q1Var.f12537a.A(f7, f11);
            b bVar = q1Var.f12539c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(u2.g0 r10, x2.t r11) {
        throw new UnsupportedOperationException("Method not decompiled: i2.r0.y0(u2.g0, x2.t):void");
    }

    public final j1 z(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        x1 x1Var;
        boolean z13;
        boolean z14;
        if (!this.f12561p0 && j10 == this.X.f12464s && g0Var.equals(this.X.f12450b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f12561p0 = z11;
        Q();
        j1 j1Var = this.X;
        u2.r1 r1Var = j1Var.h;
        x2.t tVar = j1Var.f12454i;
        List list = j1Var.f12455j;
        if (this.I.f12429k) {
            x0 x0Var = this.H.f12633i;
            if (x0Var == null) {
                r1Var = u2.r1.d;
            } else {
                r1Var = x0Var.f12613n;
            }
            if (x0Var == null) {
                tVar = this.e;
            } else {
                tVar = x0Var.f12614o;
            }
            x2.p[] pVarArr = tVar.f49181c;
            ?? g0Var2 = new e9.g0(4);
            boolean z15 = false;
            for (x2.p pVar : pVarArr) {
                if (pVar != null) {
                    b2.t0 t0Var = pVar.f(0).f4121l;
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
                e9.l0 l0Var = e9.n0.f8474b;
                x1Var = x1.e;
            }
            list = x1Var;
            if (x0Var != null) {
                y0 y0Var = x0Var.f12607g;
                if (y0Var.d != j11) {
                    x0Var.f12607g = y0Var.a(j11);
                }
            }
            q1[] q1VarArr = this.f12542a;
            z0 z0Var = this.H;
            x0 x0Var2 = z0Var.f12633i;
            if (x0Var2 == z0Var.f12634j && x0Var2 != null) {
                x2.t tVar2 = x0Var2.f12614o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < q1VarArr.length) {
                        if (tVar2.b(i11)) {
                            if (q1VarArr[i11].f12537a.f12312b != 1) {
                                z13 = false;
                                break;
                            } else if (tVar2.f49180b[i11].f12531a != 0) {
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
                if (z14 != this.f12555j0) {
                    this.f12555j0 = z14;
                    if (!z14 && this.X.f12461p) {
                        this.f12558n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(j1Var.f12450b)) {
            r1Var = u2.r1.d;
            tVar = this.e;
            list = x1.e;
        }
        u2.r1 r1Var2 = r1Var;
        x2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            o0 o0Var = this.Y;
            if (o0Var.d && o0Var.e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.g(z12);
            } else {
                o0Var.f12494c = true;
                o0Var.d = true;
                o0Var.e = i10;
            }
        }
        j1 j1Var2 = this.X;
        return j1Var2.d(g0Var, j10, j11, j12, q(j1Var2.f12462q), r1Var2, tVar3, list2);
    }

    public final void z0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.Y.f(1);
        i1 i1Var = this.I;
        i1Var.getClass();
        ArrayList arrayList = i1Var.f12423b;
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
            ((h1) arrayList.get(i12)).f12376a.t((b2.o0) list.get(i12 - i10));
        }
        w(i1Var.b(), false);
    }
}
