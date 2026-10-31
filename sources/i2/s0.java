package i2;

import ag.d3;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import e9.x1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.t6;
public final class s0 implements Handler.Callback, u2.d0, n1, a3.y {
    public static final long f8046w0 = e2.l0.h0(10000);
    public final i D;
    public final ArrayList E;
    public final e2.g0 F;
    public final x G;
    public final a1 H;
    public final l1 I;
    public final f J;
    public final long K;
    public final j2.l L;
    public final j2.g M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.d P;
    public final boolean Q;
    public v1 R;
    public u1 S;
    public boolean T;
    public boolean U;
    public r0 V;
    public int W;
    public m1 X;
    public p0 Y;
    public boolean Z;
    public final t1[] f8047a;
    public boolean f8048a0;
    public final b[] f8049b;
    public boolean f8050b0;
    public final boolean[] f8051c;
    public boolean f8052c0;
    public final x2.t d;
    public long f8053d0;
    public final x2.u e;
    public boolean f8054e0;
    public final u0 f8055f;
    public int f8056f0;
    public boolean f8057g0;
    public final y2.c h;
    public boolean f8058h0;
    public boolean f8059i0;
    public boolean f8060j0;
    public int f8061k0;
    public r0 f8062l0;
    public long m0;
    public final e2.i0 f8063n;
    public long f8064n0;
    public int f8065o0;
    public boolean f8066p0;
    public l f8067q0;
    public final j6.m f8068r;
    public long f8069r0;
    public final Looper f8070s;
    public o f8071s0;
    public long f8072t0;
    public boolean f8073u0;
    public float f8074v0;
    public final b2.n1 f8075w;
    public final b2.l1 f8076x;
    public final long f8077y;

    public s0(Context context, b[] bVarArr, b[] bVarArr2, x2.t tVar, x2.u uVar, u0 u0Var, y2.c cVar, int i10, boolean z10, j2.g gVar, v1 v1Var, f fVar, long j10, Looper looper, e2.g0 g0Var, x xVar, j2.l lVar, final a3.y yVar, boolean z11) {
        o oVar = o.f8012a;
        this.f8072t0 = -9223372036854775807L;
        this.G = xVar;
        this.d = tVar;
        this.e = uVar;
        this.f8055f = u0Var;
        this.h = cVar;
        this.f8056f0 = i10;
        this.f8057g0 = z10;
        this.R = v1Var;
        this.J = fVar;
        this.K = j10;
        this.f8048a0 = false;
        this.F = g0Var;
        this.L = lVar;
        this.f8071s0 = oVar;
        this.M = gVar;
        this.f8074v0 = 1.0f;
        this.S = u1.f8093b;
        this.Q = z11;
        this.f8069r0 = -9223372036854775807L;
        this.f8053d0 = -9223372036854775807L;
        this.f8077y = ((h) u0Var).f7881n;
        b2.k1 k1Var = b2.o1.f2172a;
        m1 k10 = m1.k(uVar);
        this.X = k10;
        this.Y = new p0(k10);
        this.f8049b = new b[bVarArr.length];
        this.f8051c = new boolean[bVarArr.length];
        x2.o oVar2 = (x2.o) tVar;
        oVar2.getClass();
        this.f8047a = new t1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f7810f = lVar;
            bVar.h = g0Var;
            this.f8049b[i11] = bVar;
            b bVar2 = this.f8049b[i11];
            synchronized (bVar2.f7807a) {
                bVar2.H = oVar2;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f7810f = lVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.f8047a[i11] = new t1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.D = new i(this, g0Var);
        this.E = new ArrayList();
        this.f8075w = new b2.n1();
        this.f8076x = new b2.l1();
        t6.p(tVar.f52953a == null);
        tVar.f52953a = this;
        tVar.f52954b = cVar;
        this.f8066p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new a1(gVar, a2, new a1.c(this, 29));
        this.I = new l1(this, gVar, a2, lVar);
        j6.m mVar = new j6.m(5);
        this.f8068r = mVar;
        Looper e = mVar.e();
        this.f8070s = e;
        e2.i0 a10 = g0Var.a(e, this);
        this.f8063n = a10;
        this.P = new c2.d(context, e, this);
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
        long c10;
        if (y0Var != null) {
            try {
                ?? r12 = y0Var.f8117a;
                if (!y0Var.e) {
                    r12.f();
                } else {
                    for (u2.d1 d1Var : y0Var.f8119c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                }
                if (!y0Var.e) {
                    c10 = 0;
                } else {
                    c10 = r12.c();
                }
                if (c10 != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(b2.o1 o1Var, r0 r0Var, boolean z10, int i10, boolean z11, b2.n1 n1Var, b2.l1 l1Var) {
        b2.o1 o1Var2;
        int U;
        b2.o1 o1Var3 = r0Var.f8035a;
        if (!o1Var.p()) {
            if (o1Var3.p()) {
                o1Var2 = o1Var;
            } else {
                o1Var2 = o1Var3;
            }
            try {
                Pair i11 = o1Var2.i(n1Var, l1Var, r0Var.f8036b, r0Var.f8037c);
                if (!o1Var.equals(o1Var2)) {
                    if (o1Var.b(i11.first) != -1) {
                        if (o1Var2.g(i11.first, l1Var).f2110f && o1Var2.m(l1Var.f2109c, n1Var, 0L).f2147n == o1Var2.b(i11.first)) {
                            return o1Var.i(n1Var, l1Var, o1Var.g(i11.first, l1Var).f2109c, r0Var.f8037c);
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
        Object obj2 = o1Var3.m(o1Var3.g(obj, l1Var).f2109c, n1Var, 0L).f2137a;
        for (int i11 = 0; i11 < o1Var2.o(); i11++) {
            if (o1Var2.m(i11, n1Var, 0L).f2137a.equals(obj2)) {
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
        return o1Var2.f(i12, l1Var, false).f2109c;
    }

    public static void g(p1 p1Var) {
        try {
            synchronized (p1Var) {
                synchronized (p1Var) {
                }
                p1Var.f8020a.d(p1Var.f8022c, p1Var.d);
                return;
            }
            p1Var.f8020a.d(p1Var.f8022c, p1Var.d);
            return;
        } finally {
            p1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.A0():void");
    }

    public final boolean B(int i10, u2.g0 g0Var) {
        boolean z10;
        boolean z11;
        a1 a1Var = this.H;
        y0 y0Var = a1Var.f7800k;
        if (y0Var != null && y0Var.f8121g.f8132a.equals(g0Var)) {
            t1 t1Var = this.f8047a[i10];
            y0 y0Var2 = a1Var.f7800k;
            int i11 = t1Var.d;
            if ((i11 == 2 || i11 == 4) && t1Var.d(y0Var2) == t1Var.f8086a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (t1Var.d == 3 && t1Var.d(y0Var2) == t1Var.f8088c) {
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
        m1 m1Var = this.X;
        if (m1Var.f7978l != z11 || m1Var.f7980n != i11 || m1Var.f7979m != i12) {
            this.X = m1Var.e(i12, i11, z11);
            E0(false, false);
            a1 a1Var = this.H;
            for (y0 y0Var = a1Var.f7798i; y0Var != null; y0Var = y0Var.f8126m) {
                for (x2.q qVar : y0Var.f8128o.f52958c) {
                    if (qVar != null) {
                        qVar.e(z11);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                m1 m1Var2 = this.X;
                if (m1Var2.f7982p) {
                    this.X = m1Var2.i(false);
                }
                a1Var.m(this.m0);
                return;
            }
            int i13 = this.X.e;
            e2.i0 i0Var = this.f8063n;
            if (i13 == 3) {
                i iVar = this.D;
                iVar.f7895f = true;
                iVar.f7892a.e();
                u0();
                i0Var.f(2);
            } else if (i13 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final boolean C() {
        y0 y0Var = this.H.f7798i;
        long j10 = y0Var.f8121g.f8135f;
        if (y0Var.e) {
            if (j10 == -9223372036854775807L || this.X.f7985s < j10 || !s0()) {
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
        y0 y0Var = this.H.f7798i;
        if (y0Var != null) {
            if (y0Var.e) {
                j10 = y0Var.f8117a.k();
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
                if (j10 != this.X.f7985s) {
                    m1 m1Var = this.X;
                    this.X = z(m1Var.f7971b, j10, m1Var.f7972c, j10, true, 5);
                }
            } else {
                i iVar = this.D;
                if (y0Var != this.H.f7799j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w1 w1Var = iVar.f7892a;
                b bVar = iVar.f7894c;
                if (bVar != null && !bVar.l() && ((!z10 || iVar.f7894c.f7811n == 2) && (iVar.f7894c.m() || (!z10 && !iVar.f7894c.k())))) {
                    x0 x0Var = iVar.d;
                    x0Var.getClass();
                    long a2 = x0Var.a();
                    if (iVar.e) {
                        if (a2 < w1Var.a()) {
                            if (w1Var.f8112c) {
                                w1Var.d(w1Var.a());
                                w1Var.f8112c = false;
                            }
                        } else {
                            iVar.e = false;
                            if (iVar.f7895f) {
                                w1Var.e();
                            }
                        }
                    }
                    w1Var.d(a2);
                    b2.z0 g10 = x0Var.g();
                    if (!g10.equals((b2.z0) w1Var.e)) {
                        w1Var.c(g10);
                        iVar.f7893b.f8063n.b(16, g10).b();
                    }
                } else {
                    iVar.e = true;
                    if (iVar.f7895f) {
                        w1Var.e();
                    }
                }
                long a10 = iVar.a();
                this.m0 = a10;
                long j13 = a10 - y0Var.f8129p;
                long j14 = this.X.f7985s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f7971b.b()) {
                    if (this.f8066p0) {
                        this.f8066p0 = false;
                    }
                    m1 m1Var2 = this.X;
                    m1Var2.f7970a.b(m1Var2.f7971b.f49875a);
                    int min = Math.min(this.f8065o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f8065o0 = min;
                }
                if (this.D.b()) {
                    boolean z11 = !this.Y.d;
                    m1 m1Var3 = this.X;
                    this.X = z(m1Var3.f7971b, j13, m1Var3.f7972c, j13, z11, 6);
                } else {
                    m1 m1Var4 = this.X;
                    m1Var4.f7985s = j13;
                    m1Var4.f7986t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f7983q = this.H.f7801l.d();
            m1 m1Var5 = this.X;
            m1Var5.f7984r = p(m1Var5.f7983q);
            m1 m1Var6 = this.X;
            if (m1Var6.f7978l && m1Var6.e == 3 && t0(m1Var6.f7970a, m1Var6.f7971b)) {
                m1 m1Var7 = this.X;
                float f10 = 1.0f;
                if (m1Var7.f7981o.f2443a == 1.0f) {
                    f fVar = this.J;
                    long m10 = m(m1Var7.f7970a, m1Var7.f7971b.f49875a, m1Var7.f7985s);
                    long j15 = this.X.f7984r;
                    if (fVar.f7848c != -9223372036854775807L) {
                        long j16 = m10 - j15;
                        if (fVar.f7855m == -9223372036854775807L) {
                            fVar.f7855m = j16;
                            fVar.f7856n = 0L;
                        } else {
                            fVar.f7855m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j11) * 0.999f));
                            fVar.f7856n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) fVar.f7856n) * 0.999f);
                        }
                        if (fVar.f7854l != -9223372036854775807L) {
                            j12 = 1000;
                            if (SystemClock.elapsedRealtime() - fVar.f7854l < 1000) {
                                f10 = fVar.f7853k;
                            }
                        } else {
                            j12 = 1000;
                        }
                        fVar.f7854l = SystemClock.elapsedRealtime();
                        long j17 = (fVar.f7856n * 3) + fVar.f7855m;
                        if (fVar.h > j17) {
                            float S = (float) e2.l0.S(j12);
                            f7 = 1.0E-7f;
                            long[] jArr = {j17, fVar.e, fVar.h - (((fVar.f7853k - 1.0f) * S) + ((fVar.f7851i - 1.0f) * S))};
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
                            long j20 = e2.l0.j(m10 - (Math.max(0.0f, fVar.f7853k - 1.0f) / 1.0E-7f), fVar.h, j17);
                            fVar.h = j20;
                            long j21 = fVar.f7850g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                fVar.h = j21;
                            }
                        }
                        long j22 = m10 - fVar.h;
                        if (Math.abs(j22) < fVar.f7846a) {
                            fVar.f7853k = 1.0f;
                        } else {
                            fVar.f7853k = e2.l0.h((f7 * ((float) j22)) + 1.0f, fVar.f7852j, fVar.f7851i);
                        }
                        f10 = fVar.f7853k;
                    }
                    if (this.D.g().f2443a != f10) {
                        b2.z0 z0Var = new b2.z0(f10, this.X.f7981o.f2444b);
                        this.f8063n.e(16);
                        this.D.c(z0Var);
                        y(this.X.f7981o, this.D.g().f2443a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        long c10;
        long j10;
        boolean b10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!A(this.H.f7801l)) {
            b10 = false;
        } else {
            y0 y0Var = this.H.f7801l;
            if (!y0Var.e) {
                c10 = 0;
            } else {
                c10 = y0Var.f8117a.c();
            }
            long p5 = p(c10);
            y0 y0Var2 = this.H.f7798i;
            if (t0(this.X.f7970a, y0Var.f8121g.f8132a)) {
                j10 = this.J.h;
            } else {
                j10 = -9223372036854775807L;
            }
            j2.l lVar = this.L;
            b2.o1 o1Var = this.X.f7970a;
            u2.g0 g0Var = y0Var.f8121g.f8132a;
            float f7 = this.D.g().f2443a;
            boolean z13 = this.X.f7978l;
            t0 t0Var = new t0(lVar, o1Var, g0Var, p5, f7, this.f8052c0, j10);
            b10 = ((h) this.f8055f).b(t0Var);
            y0 y0Var3 = this.H.f7798i;
            if (!b10 && y0Var3.e && p5 < 500000 && this.f8077y > 0) {
                y0Var3.f8117a.h(this.X.f7985s);
                b10 = ((h) this.f8055f).b(t0Var);
            }
        }
        this.f8054e0 = b10;
        if (b10) {
            y0 y0Var4 = this.H.f7801l;
            y0Var4.getClass();
            v0 v0Var = new v0();
            v0Var.f8098a = this.m0 - y0Var4.f8129p;
            float f10 = this.D.g().f2443a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            t6.f(z10);
            v0Var.f8099b = f10;
            long j11 = this.f8053d0;
            if (j11 < 0 && j11 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            t6.f(z11);
            v0Var.f8100c = j11;
            w0 w0Var = new w0(v0Var);
            if (y0Var4.f8126m == null) {
                z12 = true;
            }
            t6.p(z12);
            y0Var4.f8117a.m(w0Var);
        }
        x0();
    }

    public final void D0(b2.o1 o1Var, u2.g0 g0Var, b2.o1 o1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        Object obj;
        b2.z0 z0Var;
        boolean t02 = t0(o1Var, g0Var);
        Object obj2 = g0Var.f49875a;
        if (!t02) {
            if (g0Var.b()) {
                z0Var = b2.z0.d;
            } else {
                z0Var = this.X.f7981o;
            }
            i iVar = this.D;
            if (!iVar.g().equals(z0Var)) {
                this.f8063n.e(16);
                iVar.c(z0Var);
                y(this.X.f7981o, z0Var.f2443a, false, false);
                return;
            }
            return;
        }
        b2.l1 l1Var = this.f8076x;
        int i10 = o1Var.g(obj2, l1Var).f2109c;
        b2.n1 n1Var = this.f8075w;
        o1Var.n(i10, n1Var);
        b2.j0 j0Var = n1Var.f2143j;
        f fVar = this.J;
        fVar.getClass();
        fVar.f7848c = e2.l0.S(j0Var.f2077a);
        fVar.f7849f = e2.l0.S(j0Var.f2078b);
        fVar.f7850g = e2.l0.S(j0Var.f2079c);
        float f7 = j0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        fVar.f7852j = f7;
        float f10 = j0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        fVar.f7851i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            fVar.f7848c = -9223372036854775807L;
        }
        fVar.a();
        if (j10 != -9223372036854775807L) {
            fVar.d = m(o1Var, obj2, j10);
            fVar.a();
            return;
        }
        Object obj3 = n1Var.f2137a;
        if (!o1Var2.p()) {
            obj = o1Var2.m(o1Var2.g(g0Var2.f49875a, l1Var).f2109c, n1Var, 0L).f2137a;
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
        a1 a1Var = this.H;
        a1Var.k();
        y0 y0Var = a1Var.f7802m;
        if (y0Var != null) {
            ?? r12 = y0Var.f8117a;
            if ((!y0Var.d || y0Var.e) && !r12.d()) {
                b2.o1 o1Var = this.X.f7970a;
                if (y0Var.e) {
                    r12.s();
                }
                for (g gVar : ((h) this.f8055f).f7883p.values()) {
                    if (gVar.f7862b) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!y0Var.d) {
                    long j10 = y0Var.f8121g.f8133b;
                    y0Var.d = true;
                    r12.j(this, j10);
                    return;
                }
                v0 v0Var = new v0();
                v0Var.f8098a = this.m0 - y0Var.f8129p;
                float f7 = this.D.g().f2443a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                t6.f(z10);
                v0Var.f8099b = f7;
                long j11 = this.f8053d0;
                if (j11 < 0 && j11 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                t6.f(z11);
                v0Var.f8100c = j11;
                w0 w0Var = new w0(v0Var);
                if (y0Var.f8126m != null) {
                    z12 = false;
                }
                t6.p(z12);
                r12.m(w0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.f8052c0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = -9223372036854775807L;
        }
        this.f8053d0 = j10;
    }

    public final void F() {
        boolean z10;
        p0 p0Var = this.Y;
        m1 m1Var = this.X;
        boolean z11 = p0Var.f8018c;
        if (((m1) p0Var.f8019f) != m1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        p0Var.f8018c = z12;
        p0Var.f8019f = m1Var;
        if (z12) {
            i0 i0Var = this.G.f8114b;
            i0Var.f7910j.d(new d1.e(15, i0Var, p0Var));
            this.Y = new p0(this.X);
        }
    }

    public final void G(int i10) {
        t1 t1Var = this.f8047a[i10];
        try {
            y0 y0Var = this.H.f7798i;
            y0Var.getClass();
            b d = t1Var.d(y0Var);
            d.getClass();
            u2.d1 d1Var = d.f7812r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = t1Var.f8086a.f7808b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.u uVar = this.H.f7798i.f8128o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.x.c(uVar.f52958c[i10].m()), e);
            x2.u uVar2 = new x2.u((s1[]) uVar.f52957b.clone(), (x2.q[]) uVar.f52958c.clone(), uVar.d, uVar.e);
            uVar2.f52957b[i10] = null;
            uVar2.f52958c[i10] = null;
            i(i10);
            y0 y0Var2 = this.H.f7798i;
            y0Var2.a(uVar2, this.X.f7985s, false, new boolean[y0Var2.f8123j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f8051c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new j0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(o0 o0Var) {
        boolean z10;
        b2.o1 b10;
        this.Y.f(1);
        int i10 = o0Var.f8013a;
        int i11 = o0Var.f8014b;
        int i12 = o0Var.f8015c;
        u2.i1 i1Var = o0Var.d;
        l1 l1Var = this.I;
        ArrayList arrayList = l1Var.f7958b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        l1Var.f7963j = i1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((k1) arrayList.get(min)).d;
            e2.l0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                k1 k1Var = (k1) arrayList.get(min);
                k1Var.d = i13;
                i13 += k1Var.f7949a.f49827o.e.o();
                min++;
            }
            b10 = l1Var.b();
        } else {
            b10 = l1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        int i11;
        this.Y.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f8055f;
        ConcurrentHashMap concurrentHashMap = hVar.f7883p;
        long id2 = Thread.currentThread().getId();
        long j10 = hVar.f7884q;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        hVar.f7884q = id2;
        j2.l lVar = this.L;
        g gVar = (g) concurrentHashMap.get(lVar);
        if (gVar == null) {
            ?? obj = new Object();
            obj.f7861a = 1;
            concurrentHashMap.put(lVar, obj);
        } else {
            gVar.f7861a++;
        }
        g gVar2 = (g) concurrentHashMap.get(lVar);
        gVar2.getClass();
        Integer num = (Integer) hVar.f7882o.get(lVar.f9381a);
        if (num != null && num.intValue() != -1) {
            i10 = num.intValue();
        } else {
            i10 = hVar.f7879l;
        }
        if (i10 == -1) {
            i10 = 13107200;
        }
        gVar2.f7863c = i10;
        gVar2.f7862b = false;
        if (this.X.f7970a.p()) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        o0(i11);
        m1 m1Var = this.X;
        boolean z11 = m1Var.f7978l;
        B0(this.P.d(m1Var.e, z11), m1Var.f7980n, m1Var.f7979m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        l1 l1Var = this.I;
        ArrayList arrayList = l1Var.f7958b;
        t6.p(!l1Var.f7964k);
        l1Var.f7965l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            k1 k1Var = (k1) arrayList.get(i12);
            l1Var.e(k1Var);
            l1Var.f7961g.add(k1Var);
        }
        l1Var.f7964k = true;
        this.f8063n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.m mVar = this.f8068r;
        e2.i0 i0Var = this.f8063n;
        try {
            P(true, false, true, false);
            M();
            u0 u0Var = this.f8055f;
            j2.l lVar = this.L;
            h hVar = (h) u0Var;
            ConcurrentHashMap concurrentHashMap = hVar.f7883p;
            g gVar = (g) concurrentHashMap.get(lVar);
            if (gVar != null) {
                int i10 = gVar.f7861a - 1;
                gVar.f7861a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(lVar);
                    hVar.c();
                }
            }
            if (hVar.f7883p.isEmpty()) {
                hVar.f7884q = -1L;
            }
            c2.d dVar = this.P;
            dVar.f3531c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f6151a.removeCallbacksAndMessages(null);
            mVar.g();
            iVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f8047a.length; i10++) {
            b bVar = this.f8049b[i10];
            synchronized (bVar.f7807a) {
                bVar.H = null;
            }
            t1 t1Var = this.f8047a[i10];
            b bVar2 = t1Var.f8086a;
            boolean z11 = true;
            if (bVar2.f7811n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
            bVar2.q();
            t1Var.e = false;
            b bVar3 = t1Var.f8088c;
            if (bVar3 != null) {
                if (bVar3.f7811n != 0) {
                    z11 = false;
                }
                t6.p(z11);
                bVar3.q();
                t1Var.f8089f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        boolean z10 = true;
        this.Y.f(1);
        l1 l1Var = this.I;
        l1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > l1Var.f7958b.size()) {
            z10 = false;
        }
        t6.f(z10);
        l1Var.f7963j = i1Var;
        l1Var.g(i10, i11);
        w(l1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        y0 y0Var = this.H.f7798i;
        if (y0Var != null && y0Var.f8121g.f8138j && this.f8048a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8050b0 = z10;
    }

    public final void R(long j10, boolean z10) {
        a1 a1Var;
        long j11;
        t1[] t1VarArr;
        x2.q[] qVarArr;
        y0 y0Var = this.H.f7798i;
        if (y0Var == null) {
            j11 = 1000000000000L;
        } else {
            j11 = y0Var.f8129p;
        }
        long j12 = j10 + j11;
        this.m0 = j12;
        this.D.f7892a.d(j12);
        for (t1 t1Var : this.f8047a) {
            long j13 = this.m0;
            b d = t1Var.d(y0Var);
            if (d != null) {
                d.z(j13, false, z10);
            }
        }
        for (y0 y0Var2 = a1Var.f7798i; y0Var2 != null; y0Var2 = y0Var2.f8126m) {
            for (x2.q qVar : y0Var2.f8128o.f52958c) {
                if (qVar != null) {
                    qVar.r();
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
            a1.g.y(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j10) {
        t1[] t1VarArr;
        y0 y0Var;
        long j11;
        boolean z10 = this.T;
        long j12 = 1000;
        long j13 = f8046w0;
        if (z10) {
            this.S.getClass();
            if (this.X.e != 3) {
                j12 = j13;
            }
            for (t1 t1Var : this.f8047a) {
                long j14 = this.m0;
                long j15 = this.f8064n0;
                b bVar = t1Var.f8088c;
                b bVar2 = t1Var.f8086a;
                if (t1.h(bVar2)) {
                    j11 = bVar2.h(j14, j15);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f7811n != 0) {
                    j11 = Math.min(j11, bVar.h(j14, j15));
                }
                j12 = Math.min(j12, e2.l0.h0(j11));
            }
            if (this.X.m()) {
                y0 y0Var2 = this.H.f7798i;
                if (y0Var2 != null) {
                    y0Var = y0Var2.f8126m;
                } else {
                    y0Var = null;
                }
                if (y0Var != null) {
                    if ((((float) e2.l0.S(j12)) * this.X.f7981o.f2443a) + ((float) this.m0) >= ((float) y0Var.e())) {
                        j12 = Math.min(j12, j13);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            j12 = j13;
        }
        this.f8063n.f6151a.sendEmptyMessageAtTime(2, j10 + j12);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.f7798i.f8121g.f8132a;
        long Y = Y(g0Var, this.X.f7985s, true, false);
        if (Y != this.X.f7985s) {
            m1 m1Var = this.X;
            this.X = z(g0Var, Y, m1Var.f7972c, m1Var.d, z10, 5);
        }
    }

    public final void X(i2.r0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.X(i2.r0):void");
    }

    public final long Y(u2.g0 g0Var, long j10, boolean z10, boolean z11) {
        a1 a1Var;
        t1[] t1VarArr;
        boolean z12;
        t1[] t1VarArr2;
        int i10;
        w0();
        boolean z13 = true;
        E0(false, true);
        if (z11 || this.X.e == 3) {
            o0(2);
        }
        y0 y0Var = this.H.f7798i;
        y0 y0Var2 = y0Var;
        while (y0Var2 != null && !g0Var.equals(y0Var2.f8121g.f8132a)) {
            y0Var2 = y0Var2.f8126m;
        }
        if (z10 || y0Var != y0Var2 || (y0Var2 != null && y0Var2.f8129p + j10 < 0)) {
            for (int i11 = 0; i11 < this.f8047a.length; i11++) {
                i(i11);
            }
            this.f8072t0 = -9223372036854775807L;
            if (y0Var2 != null) {
                while (true) {
                    a1Var = this.H;
                    if (a1Var.f7798i == y0Var2) {
                        break;
                    }
                    a1Var.a();
                }
                a1Var.n(y0Var2);
                y0Var2.f8129p = 1000000000000L;
                l(this.H.f7799j.e(), new boolean[this.f8047a.length]);
                y0Var2.h = true;
            }
        }
        h();
        if (this.T) {
            for (t1 t1Var : this.f8047a) {
                if (t1Var.g() && ((i10 = t1Var.f8086a.f7808b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (y0Var2 != null) {
            this.H.n(y0Var2);
            if (!y0Var2.e) {
                y0Var2.f8121g = y0Var2.f8121g.b(j10, -9223372036854775807L);
            } else if (y0Var2.f8120f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f7970a.p() && y0Var2.f8121g.f8132a.equals(this.X.f7971b)) {
                        long j11 = y0Var2.f8129p + j10;
                        boolean z14 = true;
                        for (t1 t1Var2 : this.f8047a) {
                            if (t1Var2.g()) {
                                b d = t1Var2.d(y0Var2);
                                if (d != null && d.E(j11)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z14 &= z12;
                            }
                        }
                        if (z14) {
                            ?? r10 = y0Var2.f8117a;
                            long j12 = this.X.f7985s;
                            v1 v1Var = v1.e;
                            if (r10.t(j12, v1Var) == y0Var2.f8117a.t(j10, v1Var)) {
                                z13 = false;
                            }
                        }
                    }
                }
                j10 = y0Var2.f8117a.g(j10);
                y0Var2.f8117a.h(j10 - this.f8077y);
            }
            R(j10, z13);
            D();
        } else {
            this.H.b();
            R(j10, true);
        }
        v(false);
        this.f8063n.f(2);
        return j10;
    }

    public final void Z(p1 p1Var) {
        p1Var.getClass();
        Looper looper = p1Var.e;
        Looper looper2 = this.f8070s;
        e2.i0 i0Var = this.f8063n;
        if (looper == looper2) {
            g(p1Var);
            int i10 = this.X.e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, p1Var).b();
    }

    @Override
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        if (this.U) {
            this.f8063n.a(37).b();
        }
    }

    public final void a0(p1 p1Var) {
        Looper looper = p1Var.e;
        if (!looper.getThread().isAlive()) {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            p1Var.a(false);
            return;
        }
        this.F.a(looper, null).d(new gg.c(this, p1Var));
    }

    public final void b(n0 n0Var, int i10) {
        this.Y.f(1);
        l1 l1Var = this.I;
        if (i10 == -1) {
            i10 = l1Var.f7958b.size();
        }
        w(l1Var.a(i10, n0Var.f8009a, n0Var.f8010b), false);
    }

    public final void b0(b2.f r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.b0(b2.f, boolean):void");
    }

    public final void c() {
        t1[] t1VarArr;
        u1 u1Var;
        for (t1 t1Var : this.f8047a) {
            if (this.T) {
                u1Var = this.S;
            } else {
                u1Var = null;
            }
            t1Var.f8086a.d(18, u1Var);
            b bVar = t1Var.f8088c;
            if (bVar != null) {
                bVar.d(18, u1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.f8058h0 != z10) {
            this.f8058h0 = z10;
            if (!z10) {
                for (t1 t1Var : this.f8047a) {
                    t1Var.k();
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
        for (t1 t1Var : this.f8047a) {
            if (t1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(l0 l0Var) {
        t1[] t1VarArr;
        for (t1 t1Var : this.f8047a) {
            b bVar = t1Var.f8086a;
            if (bVar.f7808b == 4) {
                bVar.d(23, l0Var);
                b bVar2 = t1Var.f8088c;
                if (bVar2 != null) {
                    bVar2.d(23, l0Var);
                }
            }
        }
    }

    @Override
    public final void e(u2.e0 e0Var) {
        this.f8063n.b(8, e0Var).b();
    }

    public final void e0(n0 n0Var) {
        this.Y.f(1);
        int i10 = n0Var.f8011c;
        u2.i1 i1Var = n0Var.f8010b;
        ArrayList arrayList = n0Var.f8009a;
        if (i10 != -1) {
            this.f8062l0 = new r0(new r1(arrayList, i1Var), n0Var.f8011c, n0Var.d);
        }
        l1 l1Var = this.I;
        ArrayList arrayList2 = l1Var.f7958b;
        l1Var.g(0, arrayList2.size());
        w(l1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(boolean z10) {
        this.f8048a0 = z10;
        Q();
        if (this.f8050b0) {
            a1 a1Var = this.H;
            if (a1Var.f7799j != a1Var.f7798i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g0(b2.z0 z0Var) {
        this.f8063n.e(16);
        i iVar = this.D;
        iVar.c(z0Var);
        b2.z0 g10 = iVar.g();
        y(g10, g10.f2443a, true, true);
    }

    public final void h() {
        t1[] t1VarArr;
        boolean z10;
        b bVar;
        if (this.O && d()) {
            for (t1 t1Var : this.f8047a) {
                int c10 = t1Var.c();
                i iVar = this.D;
                if (t1Var.f()) {
                    int i10 = t1Var.d;
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
                            bVar = t1Var.f8086a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = t1Var.f8088c;
                        bVar.getClass();
                    }
                    t1Var.a(bVar, iVar);
                    try {
                        t1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    t1Var.d = i11;
                }
                this.f8061k0 -= c10 - t1Var.c();
            }
            this.f8072t0 = -9223372036854775807L;
        }
    }

    public final void h0(o oVar) {
        this.f8071s0 = oVar;
        b2.o1 o1Var = this.X.f7970a;
        a1 a1Var = this.H;
        a1Var.getClass();
        oVar.getClass();
        if (!a1Var.f7806q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < a1Var.f7806q.size(); i10++) {
                ((y0) a1Var.f7806q.get(i10)).i();
            }
            a1Var.f7806q = arrayList;
            a1Var.f7802m = null;
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
                    j();
                    break;
                case 3:
                    X((r0) message.obj);
                    break;
                case 4:
                    g0((b2.z0) message.obj);
                    break;
                case 5:
                    l0((v1) message.obj);
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
                    Z((p1) message.obj);
                    break;
                case 15:
                    a0((p1) message.obj);
                    break;
                case 16:
                    b2.z0 z0Var = (b2.z0) message.obj;
                    y(z0Var, z0Var.f2443a, true, false);
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
                    r0 r0Var = this.V;
                    if (r0Var != null) {
                        X(r0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((u1) message.obj);
                    break;
                case 39:
                    d0((l0) message.obj);
                    break;
            }
        } catch (b2.w0 e) {
            boolean z15 = e.f2378a;
            int i14 = e.f2379b;
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
        } catch (g2.k e7) {
            u(e7, e7.f7304a);
        } catch (l e10) {
            e = e10;
            int i15 = e.f7952s;
            a1 a1Var = this.H;
            if (i15 == 1 && (y0Var2 = a1Var.f7799j) != null && e.E == null) {
                e = e.a(y0Var2.f8121g.f8132a);
            }
            int i16 = e.f7952s;
            e2.i0 i0Var = this.f8063n;
            if (i16 == 1 && (g0Var = e.E) != null && B(e.f7954x, g0Var)) {
                this.f8073u0 = true;
                h();
                y0 g10 = a1Var.g();
                y0 y0Var3 = a1Var.f7798i;
                if (y0Var3 != g10) {
                    while (y0Var3 != null) {
                        y0 y0Var4 = y0Var3.f8126m;
                        if (y0Var4 == g10) {
                            break;
                        }
                        y0Var3 = y0Var4;
                    }
                }
                a1Var.n(y0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                l lVar = this.f8067q0;
                if (lVar != null) {
                    lVar.addSuppressed(e);
                    e = this.f8067q0;
                }
                if (e.f7952s == 1 && a1Var.f7798i != a1Var.f7799j) {
                    while (true) {
                        y0Var = a1Var.f7798i;
                        if (y0Var == a1Var.f7799j) {
                            break;
                        }
                        a1Var.a();
                    }
                    t6.k(y0Var);
                    F();
                    z0 z0Var2 = y0Var.f8121g;
                    u2.g0 g0Var2 = z0Var2.f8132a;
                    long j10 = z0Var2.f8133b;
                    this.X = z(g0Var2, j10, z0Var2.d, j10, true, 0);
                }
                if (e.F && (this.f8067q0 == null || (i10 = e.f2437a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f8067q0 == null) {
                        this.f8067q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f6151a;
                    Message message2 = b10.f6147a;
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
            l lVar2 = new l(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.d("ExoPlayerImplInternal", "Playback error", lVar2);
            v0(true, false);
            this.X = this.X.f(lVar2);
        } catch (n2.f e13) {
            u(e13, e13.f13455a);
        } catch (u2.b e14) {
            u(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        boolean z10;
        t1[] t1VarArr = this.f8047a;
        int c10 = t1VarArr[i10].c();
        t1 t1Var = t1VarArr[i10];
        b bVar = t1Var.f8086a;
        i iVar = this.D;
        t1Var.a(bVar, iVar);
        b bVar2 = t1Var.f8088c;
        if (bVar2 != null) {
            if (bVar2.f7811n != 0 && t1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            t1Var.a(bVar2, iVar);
            t1Var.i(false);
            if (z10) {
                b bVar3 = t1Var.f8086a;
                bVar2.getClass();
                bVar2.d(17, bVar3);
            }
        }
        t1Var.d = 0;
        H(i10, false);
        this.f8061k0 -= c10;
    }

    public final void i0(int i10) {
        this.f8056f0 = i10;
        b2.o1 o1Var = this.X.f7970a;
        a1 a1Var = this.H;
        a1Var.f7797g = i10;
        int r10 = a1Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    public final void j() {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.j():void");
    }

    public final void j0(boolean z10) {
        if (!z10) {
            r0 r0Var = this.V;
            e2.i0 i0Var = this.f8063n;
            if (r0Var != null && this.U && !i0Var.f6151a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new d3(this, i10, 5));
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

    public final void k(y0 y0Var, int i10, boolean z10, long j10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        t1 t1Var = this.f8047a[i10];
        boolean g10 = t1Var.g();
        b bVar = t1Var.f8086a;
        if (!g10) {
            if (y0Var == this.H.f7798i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.u uVar = y0Var.f8128o;
            s1 s1Var = uVar.f52957b[i10];
            x2.q qVar = uVar.f52958c[i10];
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
            this.f8061k0++;
            u2.d1 d1Var = y0Var.f8119c[i10];
            long j11 = y0Var.f8129p;
            u2.g0 g0Var = y0Var.f8121g.f8132a;
            b bVar2 = t1Var.f8088c;
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
            int i13 = t1Var.d;
            i iVar = this.D;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                t1Var.f8089f = true;
                bVar2.getClass();
                if (bVar2.f7811n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                t6.p(z15);
                bVar2.d = s1Var;
                bVar2.G = g0Var;
                bVar2.f7811n = 1;
                bVar2.o(z13, z11);
                bVar2.y(xVarArr, d1Var, j10, j11, g0Var);
                bVar2.z(j10, z13, true);
                iVar.d(bVar2);
            } else {
                t1Var.e = true;
                if (bVar.f7811n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                t6.p(z14);
                bVar.d = s1Var;
                bVar.G = g0Var;
                bVar.f7811n = 1;
                bVar.o(z13, z11);
                bVar.y(xVarArr, d1Var, j10, j11, g0Var);
                bVar.z(j10, z13, true);
                iVar.d(bVar);
            }
            m0 m0Var = new m0(this);
            b d = t1Var.d(y0Var);
            d.getClass();
            d.d(11, m0Var);
            if (z12 && z11) {
                t1Var.m();
            }
        }
    }

    public final void k0(u1 u1Var) {
        this.S = u1Var;
        c();
    }

    public final void l(long j10, boolean[] zArr) {
        t1[] t1VarArr;
        long j11;
        y0 y0Var = this.H.f7799j;
        x2.u uVar = y0Var.f8128o;
        int i10 = 0;
        while (true) {
            t1VarArr = this.f8047a;
            if (i10 >= t1VarArr.length) {
                break;
            }
            if (!uVar.b(i10)) {
                t1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < t1VarArr.length) {
            if (!uVar.b(i11) || t1VarArr[i11].d(y0Var) != null) {
                j11 = j10;
            } else {
                j11 = j10;
                k(y0Var, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    public final void l0(v1 v1Var) {
        this.R = v1Var;
    }

    public final long m(b2.o1 o1Var, Object obj, long j10) {
        b2.l1 l1Var = this.f8076x;
        int i10 = o1Var.g(obj, l1Var).f2109c;
        b2.n1 n1Var = this.f8075w;
        o1Var.n(i10, n1Var);
        if (n1Var.f2140f == -9223372036854775807L || !n1Var.a() || !n1Var.f2142i) {
            return -9223372036854775807L;
        }
        return e2.l0.S(e2.l0.C(n1Var.f2141g) - n1Var.f2140f) - (j10 + l1Var.e);
    }

    public final void m0(boolean z10) {
        this.f8057g0 = z10;
        b2.o1 o1Var = this.X.f7970a;
        a1 a1Var = this.H;
        a1Var.h = z10;
        int r10 = a1Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    public final long n(y0 y0Var) {
        if (y0Var == null) {
            return 0L;
        }
        long j10 = y0Var.f8129p;
        if (!y0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            t1[] t1VarArr = this.f8047a;
            if (i10 < t1VarArr.length) {
                if (t1VarArr[i10].d(y0Var) != null) {
                    b d = t1VarArr[i10].d(y0Var);
                    Objects.requireNonNull(d);
                    long j11 = d.f7816y;
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
        l1 l1Var = this.I;
        int size = l1Var.f7958b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        l1Var.f7963j = i1Var;
        w(l1Var.b(), false);
    }

    public final Pair o(b2.o1 o1Var) {
        long j10 = 0;
        if (o1Var.p()) {
            return Pair.create(m1.f7969u, 0L);
        }
        int a2 = o1Var.a(this.f8057g0);
        Pair i10 = o1Var.i(this.f8075w, this.f8076x, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(o1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f49875a;
            b2.l1 l1Var = this.f8076x;
            o1Var.g(obj, l1Var);
            if (p5.f49877c == l1Var.e(p5.f49876b)) {
                l1Var.f2111g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j10));
    }

    public final void o0(int i10) {
        m1 m1Var = this.X;
        if (m1Var.e != i10) {
            if (i10 != 2) {
                this.f8069r0 = -9223372036854775807L;
            }
            if (i10 != 3 && m1Var.f7982p) {
                this.X = m1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final long p(long j10) {
        y0 y0Var = this.H.f7801l;
        if (y0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - y0Var.f8129p));
    }

    public final void p0(a3.y yVar) {
        t1[] t1VarArr;
        for (t1 t1Var : this.f8047a) {
            b bVar = t1Var.f8086a;
            if (bVar.f7808b == 2) {
                bVar.d(7, yVar);
                b bVar2 = t1Var.f8088c;
                if (bVar2 != null) {
                    bVar2.d(7, yVar);
                }
            }
        }
    }

    public final void q(int i10) {
        m1 m1Var = this.X;
        B0(i10, m1Var.f7980n, m1Var.f7979m, m1Var.f7978l);
    }

    public final void q0(Object obj, e2.i iVar) {
        t1[] t1VarArr;
        for (t1 t1Var : this.f8047a) {
            b bVar = t1Var.f8086a;
            if (bVar.f7808b == 2) {
                int i10 = t1Var.d;
                if (i10 != 4 && i10 != 1) {
                    bVar.d(1, obj);
                } else {
                    b bVar2 = t1Var.f8088c;
                    bVar2.getClass();
                    bVar2.d(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.f8063n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override
    public final void r(u2.f1 f1Var) {
        this.f8063n.b(9, (u2.e0) f1Var).b();
    }

    public final void r0(float f7) {
        t1[] t1VarArr;
        this.f8074v0 = f7;
        float f10 = f7 * this.P.f3533g;
        for (t1 t1Var : this.f8047a) {
            b bVar = t1Var.f8086a;
            if (bVar.f7808b == 1) {
                bVar.d(2, Float.valueOf(f10));
                b bVar2 = t1Var.f8088c;
                if (bVar2 != null) {
                    bVar2.d(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s() {
        r0(this.f8074v0);
    }

    public final boolean s0() {
        m1 m1Var = this.X;
        if (m1Var.f7978l && m1Var.f7980n == 0) {
            return true;
        }
        return false;
    }

    public final void t(u2.e0 e0Var) {
        a1 a1Var = this.H;
        y0 y0Var = a1Var.f7801l;
        if (y0Var != null && y0Var.f8117a == e0Var) {
            a1Var.m(this.m0);
            D();
            return;
        }
        y0 y0Var2 = a1Var.f7802m;
        if (y0Var2 != null && y0Var2.f8117a == e0Var) {
            E();
        }
    }

    public final boolean t0(b2.o1 o1Var, u2.g0 g0Var) {
        if (!g0Var.b() && !o1Var.p()) {
            int i10 = o1Var.g(g0Var.f49875a, this.f8076x).f2109c;
            b2.n1 n1Var = this.f8075w;
            o1Var.n(i10, n1Var);
            if (n1Var.a() && n1Var.f2142i && n1Var.f2140f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(IOException iOException, int i10) {
        l lVar = new l(0, iOException, i10);
        y0 y0Var = this.H.f7798i;
        if (y0Var != null) {
            lVar = lVar.a(y0Var.f8121g.f8132a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.X = this.X.f(lVar);
    }

    public final void u0() {
        y0 y0Var = this.H.f7798i;
        if (y0Var != null) {
            x2.u uVar = y0Var.f8128o;
            int i10 = 0;
            while (true) {
                t1[] t1VarArr = this.f8047a;
                if (i10 < t1VarArr.length) {
                    if (uVar.b(i10)) {
                        t1VarArr[i10].m();
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
        y0 y0Var = this.H.f7801l;
        if (y0Var == null) {
            g0Var = this.X.f7971b;
        } else {
            g0Var = y0Var.f8121g.f8132a;
        }
        boolean equals = this.X.f7977k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        m1 m1Var = this.X;
        if (y0Var == null) {
            d = m1Var.f7985s;
        } else {
            d = y0Var.d();
        }
        m1Var.f7983q = d;
        m1 m1Var2 = this.X;
        m1Var2.f7984r = p(m1Var2.f7983q);
        if ((!equals || z10) && y0Var != null && y0Var.e) {
            y0(y0Var.f8121g.f8132a, y0Var.f8128o);
        }
    }

    public final void v0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f8058h0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        h hVar = (h) this.f8055f;
        ConcurrentHashMap concurrentHashMap = hVar.f7883p;
        j2.l lVar = this.L;
        g gVar = (g) concurrentHashMap.get(lVar);
        if (gVar != null) {
            int i10 = gVar.f7861a - 1;
            gVar.f7861a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(lVar);
                hVar.c();
            }
        }
        this.P.d(1, this.X.f7978l);
        o0(1);
    }

    public final void w(b2.o1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.w(b2.o1, boolean):void");
    }

    public final void w0() {
        t1[] t1VarArr;
        i iVar = this.D;
        iVar.f7895f = false;
        w1 w1Var = iVar.f7892a;
        if (w1Var.f8112c) {
            w1Var.d(w1Var.a());
            w1Var.f8112c = false;
        }
        for (t1 t1Var : this.f8047a) {
            b bVar = t1Var.f8088c;
            b bVar2 = t1Var.f8086a;
            if (t1.h(bVar2)) {
                t1.b(bVar2);
            }
            if (bVar != null && bVar.f7811n != 0) {
                t1.b(bVar);
            }
        }
    }

    public final void x(u2.e0 e0Var) {
        y0 y0Var;
        a1 a1Var = this.H;
        y0 y0Var2 = a1Var.f7801l;
        i iVar = this.D;
        if (y0Var2 != null && y0Var2.f8117a == e0Var) {
            y0Var2.getClass();
            if (!y0Var2.e) {
                float f7 = iVar.g().f2443a;
                m1 m1Var = this.X;
                y0Var2.f(f7, m1Var.f7970a, m1Var.f7978l);
            }
            y0(y0Var2.f8121g.f8132a, y0Var2.f8128o);
            if (y0Var2 == a1Var.f7798i) {
                R(y0Var2.f8121g.f8133b, true);
                l(a1Var.f7799j.e(), new boolean[this.f8047a.length]);
                y0Var2.h = true;
                m1 m1Var2 = this.X;
                u2.g0 g0Var = m1Var2.f7971b;
                long j10 = y0Var2.f8121g.f8133b;
                this.X = z(g0Var, j10, m1Var2.f7972c, j10, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < a1Var.f7806q.size()) {
                y0Var = (y0) a1Var.f7806q.get(i10);
                if (y0Var.f8117a == e0Var) {
                    break;
                }
                i10++;
            } else {
                y0Var = null;
                break;
            }
        }
        if (y0Var != null) {
            t6.p(true ^ y0Var.e);
            float f10 = iVar.g().f2443a;
            m1 m1Var3 = this.X;
            y0Var.f(f10, m1Var3.f7970a, m1Var3.f7978l);
            y0 y0Var3 = a1Var.f7802m;
            if (y0Var3 != null && y0Var3.f8117a == e0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z10;
        y0 y0Var = this.H.f7801l;
        if (!this.f8054e0 && (y0Var == null || !y0Var.f8117a.d())) {
            z10 = false;
        } else {
            z10 = true;
        }
        m1 m1Var = this.X;
        if (z10 != m1Var.f7974g) {
            this.X = m1Var.b(z10);
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
        float f10 = z0Var.f2443a;
        y0 y0Var = this.H.f7798i;
        while (true) {
            i10 = 0;
            if (y0Var == null) {
                break;
            }
            x2.q[] qVarArr = y0Var.f8128o.f52958c;
            int length = qVarArr.length;
            while (i10 < length) {
                x2.q qVar = qVarArr[i10];
                if (qVar != null) {
                    qVar.p(f10);
                }
                i10++;
            }
            y0Var = y0Var.f8126m;
        }
        t1[] t1VarArr = this.f8047a;
        int length2 = t1VarArr.length;
        while (i10 < length2) {
            t1 t1Var = t1VarArr[i10];
            float f11 = z0Var.f2443a;
            t1Var.f8086a.A(f7, f11);
            b bVar = t1Var.f8088c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(u2.g0 r10, x2.u r11) {
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.y0(u2.g0, x2.u):void");
    }

    public final m1 z(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        x1 x1Var;
        boolean z13;
        boolean z14;
        if (!this.f8066p0 && j10 == this.X.f7985s && g0Var.equals(this.X.f7971b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f8066p0 = z11;
        Q();
        m1 m1Var = this.X;
        u2.r1 r1Var = m1Var.h;
        x2.u uVar = m1Var.f7975i;
        List list = m1Var.f7976j;
        if (this.I.f7964k) {
            y0 y0Var = this.H.f7798i;
            if (y0Var == null) {
                r1Var = u2.r1.d;
            } else {
                r1Var = y0Var.f8127n;
            }
            if (y0Var == null) {
                uVar = this.e;
            } else {
                uVar = y0Var.f8128o;
            }
            x2.q[] qVarArr = uVar.f52958c;
            ?? g0Var2 = new e9.g0(4);
            boolean z15 = false;
            for (x2.q qVar : qVarArr) {
                if (qVar != null) {
                    b2.u0 u0Var = qVar.f(0).f2416l;
                    if (u0Var == null) {
                        g0Var2.c(new b2.u0(new b2.t0[0]));
                    } else {
                        g0Var2.c(u0Var);
                        z15 = true;
                    }
                }
            }
            if (z15) {
                x1Var = g0Var2.f();
            } else {
                e9.l0 l0Var = e9.n0.f6390b;
                x1Var = x1.e;
            }
            list = x1Var;
            if (y0Var != null) {
                z0 z0Var = y0Var.f8121g;
                if (z0Var.d != j11) {
                    y0Var.f8121g = z0Var.a(j11);
                }
            }
            t1[] t1VarArr = this.f8047a;
            a1 a1Var = this.H;
            y0 y0Var2 = a1Var.f7798i;
            if (y0Var2 == a1Var.f7799j && y0Var2 != null) {
                x2.u uVar2 = y0Var2.f8128o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < t1VarArr.length) {
                        if (uVar2.b(i11)) {
                            if (t1VarArr[i11].f8086a.f7808b != 1) {
                                z13 = false;
                                break;
                            } else if (uVar2.f52957b[i11].f8079a != 0) {
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
                if (z14 != this.f8060j0) {
                    this.f8060j0 = z14;
                    if (!z14 && this.X.f7982p) {
                        this.f8063n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(m1Var.f7971b)) {
            r1Var = u2.r1.d;
            uVar = this.e;
            list = x1.e;
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
                t6.f(z12);
            } else {
                p0Var.f8018c = true;
                p0Var.d = true;
                p0Var.e = i10;
            }
        }
        m1 m1Var2 = this.X;
        return m1Var2.d(g0Var, j10, j11, j12, p(m1Var2.f7983q), r1Var2, uVar3, list2);
    }

    public final void z0(List list, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        this.Y.f(1);
        l1 l1Var = this.I;
        l1Var.getClass();
        ArrayList arrayList = l1Var.f7958b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        if (list.size() != i11 - i10) {
            z11 = false;
        }
        t6.f(z11);
        for (int i12 = i10; i12 < i11; i12++) {
            ((k1) arrayList.get(i12)).f7949a.t((b2.p0) list.get(i12 - i10));
        }
        w(l1Var.b(), false);
    }
}
