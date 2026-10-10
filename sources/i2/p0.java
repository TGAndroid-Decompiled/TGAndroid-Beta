package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import ei.c5;
import gg.w1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public final class p0 implements Handler.Callback, u2.c0, i1, a3.y {
    public static final long f11835u0 = e2.d0.d0(10000);
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
    public final o1[] f11836a;
    public boolean f11837a0;
    public final f[] f11838b;
    public long f11839b0;
    public final boolean[] f11840c;
    public boolean f11841c0;
    public final x2.u d;
    public int f11842d0;
    public final x2.v f11843e;
    public boolean f11844e0;
    public final k f11845f;
    public boolean f11846f0;
    public boolean f11847g0;
    public final y2.c h;
    public boolean f11848h0;
    public int f11849i0;
    public o0 f11850j0;
    public long f11851k0;
    public long f11852l0;
    public int m0;
    public final e2.z f11853n;
    public boolean f11854n0;
    public n f11855o0;
    public long f11856p0;
    public q f11857q0;
    public final j6.l f11858r;
    public long f11859r0;
    public final Looper f11860s;
    public boolean f11861s0;
    public float f11862t0;
    public final b2.j1 v;
    public final b2.h1 f11863w;
    public final long f11864x;
    public final a3.q f11865y;

    public p0(Context context, f[] fVarArr, f[] fVarArr2, x2.u uVar, x2.v vVar, k kVar, y2.c cVar, int i10, boolean z10, j2.f fVar, q1 q1Var, i iVar, long j3, Looper looper, e2.x xVar, x xVar2, j2.k kVar2, final a3.y yVar) {
        q qVar = q.f11868a;
        this.f11859r0 = -9223372036854775807L;
        this.G = xVar2;
        this.d = uVar;
        this.f11843e = vVar;
        this.f11845f = kVar;
        this.h = cVar;
        this.f11842d0 = i10;
        this.f11844e0 = z10;
        this.Q = q1Var;
        this.J = iVar;
        this.K = j3;
        this.Y = false;
        this.F = xVar;
        this.L = kVar2;
        this.f11857q0 = qVar;
        this.M = fVar;
        this.f11862t0 = 1.0f;
        this.R = p1.f11866b;
        this.f11856p0 = -9223372036854775807L;
        this.f11839b0 = -9223372036854775807L;
        this.f11864x = kVar.f11764g;
        b2.g1 g1Var = b2.k1.f3404a;
        h1 k10 = h1.k(vVar);
        this.V = k10;
        this.W = new m0(k10);
        this.f11838b = new f[fVarArr.length];
        this.f11840c = new boolean[fVarArr.length];
        x2.p pVar = (x2.p) uVar;
        pVar.getClass();
        this.f11836a = new o1[fVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar2 = fVarArr[i11];
            fVar2.f11647e = i11;
            fVar2.f11648f = kVar2;
            fVar2.h = xVar;
            this.f11838b[i11] = fVar2;
            f fVar3 = this.f11838b[i11];
            synchronized (fVar3.f11644a) {
                fVar3.H = pVar;
            }
            f fVar4 = fVarArr2[i11];
            if (fVar4 != null) {
                fVar4.f11647e = i11;
                fVar4.f11648f = kVar2;
                fVar4.h = xVar;
                z11 = true;
            }
            this.f11836a[i11] = new o1(fVarArr[i11], fVar4, i11);
        }
        this.O = z11;
        this.f11865y = new a3.q(this, xVar);
        this.E = new ArrayList();
        this.v = new b2.j1();
        this.f11863w = new b2.h1();
        e2.d.g(uVar.f50585a == null);
        uVar.f50585a = this;
        uVar.f50586b = cVar;
        this.f11854n0 = true;
        e2.z a2 = xVar.a(looper, null);
        this.N = a2;
        this.H = new w0(fVar, a2, new c5(this, 12));
        this.I = new g1(this, fVar, a2, kVar2);
        j6.l lVar = new j6.l(8);
        this.f11858r = lVar;
        Looper e7 = lVar.e();
        this.f11860s = e7;
        e2.z a10 = xVar.a(e7, this);
        this.f11853n = a10;
        this.P = new e(context, e7, this);
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

    public static Pair T(b2.k1 k1Var, o0 o0Var, boolean z10, int i10, boolean z11, b2.j1 j1Var, b2.h1 h1Var) {
        b2.k1 k1Var2;
        int U;
        b2.k1 k1Var3 = o0Var.f11807a;
        if (!k1Var.p()) {
            if (k1Var3.p()) {
                k1Var2 = k1Var;
            } else {
                k1Var2 = k1Var3;
            }
            try {
                Pair i11 = k1Var2.i(j1Var, h1Var, o0Var.f11808b, o0Var.f11809c);
                if (!k1Var.equals(k1Var2)) {
                    if (k1Var.b(i11.first) != -1) {
                        if (k1Var2.g(i11.first, h1Var).f3331f && k1Var2.m(h1Var.f3329c, j1Var, 0L).f3390n == k1Var2.b(i11.first)) {
                            return k1Var.i(j1Var, h1Var, k1Var.g(i11.first, h1Var).f3329c, o0Var.f11809c);
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
        Object obj2 = k1Var3.m(k1Var3.g(obj, h1Var).f3329c, j1Var, 0L).f3379a;
        for (int i11 = 0; i11 < k1Var2.o(); i11++) {
            if (k1Var2.m(i11, j1Var, 0L).f3379a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = k1Var3.b(obj);
        int h = k1Var3.h();
        int i12 = -1;
        int i13 = 0;
        while (i13 < h && i12 == -1) {
            b2.k1 k1Var4 = k1Var3;
            int d = k1Var4.d(b10, h1Var, j1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i12 = k1Var2.b(k1Var4.l(d));
            i13++;
            k1Var3 = k1Var4;
            b10 = d;
            j1Var2 = j1Var;
        }
        if (i12 == -1) {
            return -1;
        }
        return k1Var2.f(i12, h1Var, false).f3329c;
    }

    public static void f(k1 k1Var) {
        try {
            synchronized (k1Var) {
                synchronized (k1Var) {
                }
                k1Var.f11769a.c(k1Var.f11771c, k1Var.d);
                return;
            }
            k1Var.f11769a.c(k1Var.f11771c, k1Var.d);
            return;
        } finally {
            k1Var.a(true);
        }
    }

    public static boolean z(u0 u0Var) {
        u2.b1[] b1VarArr;
        long d;
        if (u0Var != null) {
            try {
                ?? r12 = u0Var.f11892a;
                if (!u0Var.f11895e) {
                    r12.g();
                } else {
                    for (u2.b1 b1Var : u0Var.f11894c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                }
                if (!u0Var.f11895e) {
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

    public final boolean A(int i10, u2.f0 f0Var) {
        boolean z10;
        boolean z11;
        w0 w0Var = this.H;
        u0 u0Var = w0Var.f11926k;
        if (u0Var != null && u0Var.f11897g.f11908a.equals(f0Var)) {
            o1 o1Var = this.f11836a[i10];
            u0 u0Var2 = w0Var.f11926k;
            int i11 = o1Var.d;
            if ((i11 == 2 || i11 == 4) && o1Var.d(u0Var2) == o1Var.f11810a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (o1Var.d == 3 && o1Var.d(u0Var2) == o1Var.f11812c) {
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
        long j3;
        boolean z10;
        long j10;
        long max;
        long j11;
        float f7;
        u0 u0Var = this.H.f11924i;
        if (u0Var != null) {
            if (u0Var.f11895e) {
                j3 = u0Var.f11892a.l();
            } else {
                j3 = -9223372036854775807L;
            }
            if (j3 != -9223372036854775807L) {
                if (!u0Var.g()) {
                    this.H.n(u0Var);
                    u(false);
                    C();
                }
                R(j3);
                if (j3 != this.V.f11740s) {
                    h1 h1Var = this.V;
                    this.V = y(h1Var.f11725b, j3, h1Var.f11726c, j3, true, 5);
                }
            } else {
                a3.q qVar = this.f11865y;
                if (u0Var != this.H.f11925j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r1 r1Var = (r1) qVar.f197c;
                f fVar = (f) qVar.f198e;
                if (fVar != null && !fVar.l() && ((!z10 || ((f) qVar.f198e).f11649n == 2) && (((f) qVar.f198e).m() || (!z10 && !((f) qVar.f198e).k())))) {
                    t0 t0Var = (t0) qVar.f199f;
                    t0Var.getClass();
                    long a2 = t0Var.a();
                    if (qVar.f195a) {
                        if (a2 < r1Var.a()) {
                            if (r1Var.f11881c) {
                                r1Var.c(r1Var.a());
                                r1Var.f11881c = false;
                            }
                        } else {
                            qVar.f195a = false;
                            if (qVar.f196b) {
                                r1Var.d();
                            }
                        }
                    }
                    r1Var.c(a2);
                    b2.v0 h = t0Var.h();
                    if (!h.equals((b2.v0) r1Var.f11882e)) {
                        r1Var.f(h);
                        ((p0) qVar.d).f11853n.a(16, h).b();
                    }
                } else {
                    qVar.f195a = true;
                    if (qVar.f196b) {
                        r1Var.d();
                    }
                }
                long a10 = qVar.a();
                this.f11851k0 = a10;
                long j12 = a10 - u0Var.f11905p;
                long j13 = this.V.f11740s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.V.f11725b.b()) {
                    if (this.f11854n0) {
                        this.f11854n0 = false;
                    }
                    h1 h1Var2 = this.V;
                    h1Var2.f11724a.b(h1Var2.f11725b.f48616a);
                    int min = Math.min(this.m0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.m0 = min;
                }
                if (this.f11865y.b()) {
                    boolean z11 = !this.W.d;
                    h1 h1Var3 = this.V;
                    this.V = y(h1Var3.f11725b, j12, h1Var3.f11726c, j12, z11, 6);
                } else {
                    h1 h1Var4 = this.V;
                    h1Var4.f11740s = j12;
                    h1Var4.f11741t = SystemClock.elapsedRealtime();
                }
            }
            this.V.f11738q = this.H.f11927l.d();
            h1 h1Var5 = this.V;
            h1Var5.f11739r = p(h1Var5.f11738q);
            h1 h1Var6 = this.V;
            if (h1Var6.f11733l && h1Var6.f11727e == 3 && s0(h1Var6.f11724a, h1Var6.f11725b)) {
                h1 h1Var7 = this.V;
                float f10 = 1.0f;
                if (h1Var7.f11736o.f3673a == 1.0f) {
                    i iVar = this.J;
                    long l4 = l(h1Var7.f11724a, h1Var7.f11725b.f48616a, h1Var7.f11740s);
                    long j14 = this.V.f11739r;
                    if (iVar.f11744c != -9223372036854775807L) {
                        long j15 = l4 - j14;
                        if (iVar.f11752m == -9223372036854775807L) {
                            iVar.f11752m = j15;
                            iVar.f11753n = 0L;
                        } else {
                            iVar.f11752m = Math.max(j15, (((float) j15) * 9.999871E-4f) + (((float) j10) * 0.999f));
                            iVar.f11753n = (9.999871E-4f * ((float) Math.abs(j15 - max))) + (((float) iVar.f11753n) * 0.999f);
                        }
                        if (iVar.f11751l != -9223372036854775807L) {
                            j11 = 1000;
                            if (SystemClock.elapsedRealtime() - iVar.f11751l < 1000) {
                                f10 = iVar.f11750k;
                            }
                        } else {
                            j11 = 1000;
                        }
                        iVar.f11751l = SystemClock.elapsedRealtime();
                        long j16 = (iVar.f11753n * 3) + iVar.f11752m;
                        if (iVar.h > j16) {
                            float P = (float) e2.d0.P(j11);
                            f7 = 1.0E-7f;
                            long[] jArr = {j16, iVar.f11745e, iVar.h - (((iVar.f11750k - 1.0f) * P) + ((iVar.f11748i - 1.0f) * P))};
                            long j17 = jArr[0];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j18 = jArr[i10];
                                if (j18 > j17) {
                                    j17 = j18;
                                }
                            }
                            iVar.h = j17;
                        } else {
                            f7 = 1.0E-7f;
                            long i11 = e2.d0.i(l4 - (Math.max(0.0f, iVar.f11750k - 1.0f) / 1.0E-7f), iVar.h, j16);
                            iVar.h = i11;
                            long j19 = iVar.f11747g;
                            if (j19 != -9223372036854775807L && i11 > j19) {
                                iVar.h = j19;
                            }
                        }
                        long j20 = l4 - iVar.h;
                        if (Math.abs(j20) < iVar.f11742a) {
                            iVar.f11750k = 1.0f;
                        } else {
                            iVar.f11750k = e2.d0.g((f7 * ((float) j20)) + 1.0f, iVar.f11749j, iVar.f11748i);
                        }
                        f10 = iVar.f11750k;
                    }
                    if (this.f11865y.h().f3673a != f10) {
                        b2.v0 v0Var = new b2.v0(f10, this.V.f11736o.f3674b);
                        this.f11853n.d(16);
                        this.f11865y.f(v0Var);
                        x(this.V.f11736o, this.f11865y.h().f3673a, false, false);
                    }
                }
            }
        }
    }

    public final boolean B() {
        u0 u0Var = this.H.f11924i;
        long j3 = u0Var.f11897g.f11911e;
        if (u0Var.f11895e) {
            if (j3 == -9223372036854775807L || this.V.f11740s < j3 || !r0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0(b2.k1 k1Var, u2.f0 f0Var, b2.k1 k1Var2, u2.f0 f0Var2, long j3, boolean z10) {
        Object obj;
        b2.v0 v0Var;
        boolean s02 = s0(k1Var, f0Var);
        Object obj2 = f0Var.f48616a;
        if (!s02) {
            if (f0Var.b()) {
                v0Var = b2.v0.d;
            } else {
                v0Var = this.V.f11736o;
            }
            a3.q qVar = this.f11865y;
            if (!qVar.h().equals(v0Var)) {
                this.f11853n.d(16);
                qVar.f(v0Var);
                x(this.V.f11736o, v0Var.f3673a, false, false);
                return;
            }
            return;
        }
        b2.h1 h1Var = this.f11863w;
        int i10 = k1Var.g(obj2, h1Var).f3329c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        b2.e0 e0Var = j1Var.f3386j;
        i iVar = this.J;
        iVar.getClass();
        iVar.f11744c = e2.d0.P(e0Var.f3288a);
        iVar.f11746f = e2.d0.P(e0Var.f3289b);
        iVar.f11747g = e2.d0.P(e0Var.f3290c);
        float f7 = e0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        iVar.f11749j = f7;
        float f10 = e0Var.f3291e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.f11748i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            iVar.f11744c = -9223372036854775807L;
        }
        iVar.a();
        if (j3 != -9223372036854775807L) {
            iVar.d = l(k1Var, obj2, j3);
            iVar.a();
            return;
        }
        Object obj3 = j1Var.f3379a;
        if (!k1Var2.p()) {
            obj = k1Var2.m(k1Var2.g(f0Var2.f48616a, h1Var).f3329c, j1Var, 0L).f3379a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z10) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    public final void C() {
        long d;
        long j3;
        boolean c10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!z(this.H.f11927l)) {
            c10 = false;
        } else {
            u0 u0Var = this.H.f11927l;
            if (!u0Var.f11895e) {
                d = 0;
            } else {
                d = u0Var.f11892a.d();
            }
            long p5 = p(d);
            u0 u0Var2 = this.H.f11924i;
            if (s0(this.V.f11724a, u0Var.f11897g.f11908a)) {
                j3 = this.J.h;
            } else {
                j3 = -9223372036854775807L;
            }
            j2.k kVar = this.L;
            b2.k1 k1Var = this.V.f11724a;
            float f7 = this.f11865y.h().f3673a;
            boolean z13 = this.V.f11733l;
            q0 q0Var = new q0(kVar, p5, f7, this.f11837a0, j3);
            c10 = this.f11845f.c(q0Var);
            u0 u0Var3 = this.H.f11924i;
            if (!c10 && u0Var3.f11895e && p5 < 500000 && this.f11864x > 0) {
                u0Var3.f11892a.i(this.V.f11740s);
                c10 = this.f11845f.c(q0Var);
            }
        }
        this.f11841c0 = c10;
        if (c10) {
            u0 u0Var4 = this.H.f11927l;
            u0Var4.getClass();
            r0 r0Var = new r0();
            r0Var.f11876a = this.f11851k0 - u0Var4.f11905p;
            float f10 = this.f11865y.h().f3673a;
            if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                z10 = false;
            } else {
                z10 = true;
            }
            e2.d.b(z10);
            r0Var.f11877b = f10;
            long j10 = this.f11839b0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z11 = false;
            } else {
                z11 = true;
            }
            e2.d.b(z11);
            r0Var.f11878c = j10;
            s0 s0Var = new s0(r0Var);
            if (u0Var4.f11902m == null) {
                z12 = true;
            }
            e2.d.g(z12);
            u0Var4.f11892a.n(s0Var);
        }
        w0();
    }

    public final void C0(boolean z10, boolean z11) {
        long j3;
        this.f11837a0 = z10;
        if (z10 && !z11) {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f11839b0 = j3;
    }

    @Override
    public final void D(u2.d1 d1Var) {
        this.f11853n.a(9, (u2.d0) d1Var).b();
    }

    public final void E() {
        boolean z10;
        boolean z11;
        w0 w0Var = this.H;
        w0Var.k();
        u0 u0Var = w0Var.f11928m;
        if (u0Var != null) {
            ?? r12 = u0Var.f11892a;
            if ((!u0Var.d || u0Var.f11895e) && !r12.c()) {
                b2.k1 k1Var = this.V.f11724a;
                if (u0Var.f11895e) {
                    r12.q();
                }
                for (j jVar : this.f11845f.h.values()) {
                    if (jVar.f11756a) {
                        return;
                    }
                }
                boolean z12 = true;
                if (!u0Var.d) {
                    long j3 = u0Var.f11897g.f11909b;
                    u0Var.d = true;
                    r12.k(this, j3);
                    return;
                }
                r0 r0Var = new r0();
                r0Var.f11876a = this.f11851k0 - u0Var.f11905p;
                float f7 = this.f11865y.h().f3673a;
                if (f7 <= 0.0f && f7 != -3.4028235E38f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                e2.d.b(z10);
                r0Var.f11877b = f7;
                long j10 = this.f11839b0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                e2.d.b(z11);
                r0Var.f11878c = j10;
                s0 s0Var = new s0(r0Var);
                if (u0Var.f11902m != null) {
                    z12 = false;
                }
                e2.d.g(z12);
                r12.n(s0Var);
            }
        }
    }

    public final void F() {
        boolean z10;
        m0 m0Var = this.W;
        h1 h1Var = this.V;
        boolean z11 = m0Var.f11784c;
        if (((h1) m0Var.f11786f) != h1Var) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        m0Var.f11784c = z12;
        m0Var.f11786f = h1Var;
        if (z12) {
            f0 f0Var = this.G.f11934b;
            f0Var.f11670j.c(new w1(9, f0Var, m0Var));
            this.W = new m0(this.V);
        }
    }

    public final void G(int i10) {
        o1 o1Var = this.f11836a[i10];
        try {
            u0 u0Var = this.H.f11924i;
            u0Var.getClass();
            f d = o1Var.d(u0Var);
            d.getClass();
            u2.b1 b1Var = d.f11650r;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e7) {
            int i11 = o1Var.f11810a.f11645b;
            if (i11 != 3 && i11 != 5) {
                throw e7;
            }
            x2.v vVar = this.H.f11924i.f11904o;
            e2.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + b2.s.c(vVar.f50590c[i10].m()), e7);
            x2.v vVar2 = new x2.v((n1[]) vVar.f50589b.clone(), (x2.r[]) vVar.f50590c.clone(), vVar.d, vVar.f50591e);
            vVar2.f50589b[i10] = null;
            vVar2.f50590c[i10] = null;
            h(i10);
            u0 u0Var2 = this.H.f11924i;
            u0Var2.a(vVar2, this.V.f11740s, false, new boolean[u0Var2.f11899j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.f11840c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.c(new g0(this, i10, z10, 0));
        }
    }

    public final void I() {
        v(this.I.b(), true);
    }

    public final void J(l0 l0Var) {
        boolean z10;
        b2.k1 b10;
        this.W.f(1);
        int i10 = l0Var.f11777a;
        int i11 = l0Var.f11778b;
        int i12 = l0Var.f11779c;
        u2.g1 g1Var = l0Var.d;
        g1 g1Var2 = this.I;
        ArrayList arrayList = g1Var2.f11708b;
        if (i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        g1Var2.f11714j = g1Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((f1) arrayList.get(min)).d;
            e2.d0.O(i10, i11, i12, arrayList);
            while (min <= max) {
                f1 f1Var = (f1) arrayList.get(min);
                f1Var.d = i13;
                i13 += f1Var.f11690a.f48562o.f48735e.o();
                min++;
            }
            b10 = g1Var2.b();
        } else {
            b10 = g1Var2.b();
        }
        v(b10, false);
    }

    public final void K() {
        boolean z10;
        int i10;
        this.W.f(1);
        P(false, false, false, true);
        k kVar = this.f11845f;
        HashMap hashMap = kVar.h;
        long id2 = Thread.currentThread().getId();
        long j3 = kVar.f11765i;
        if (j3 != -1 && j3 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        e2.d.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z10);
        kVar.f11765i = id2;
        j2.k kVar2 = this.L;
        if (!hashMap.containsKey(kVar2)) {
            hashMap.put(kVar2, new Object());
        }
        j jVar = (j) hashMap.get(kVar2);
        jVar.getClass();
        int i11 = kVar.f11763f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        jVar.f11757b = i11;
        jVar.f11756a = false;
        if (this.V.f11724a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        n0(i10);
        h1 h1Var = this.V;
        boolean z11 = h1Var.f11733l;
        z0(this.P.d(h1Var.f11727e, z11), h1Var.f11735n, h1Var.f11734m, z11);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        g1 g1Var = this.I;
        ArrayList arrayList = g1Var.f11708b;
        e2.d.g(!g1Var.f11715k);
        g1Var.f11716l = fVar;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            f1 f1Var = (f1) arrayList.get(i12);
            g1Var.e(f1Var);
            g1Var.f11712g.add(f1Var);
        }
        g1Var.f11715k = true;
        this.f11853n.e(2);
    }

    public final void L(e2.g gVar) {
        j6.l lVar = this.f11858r;
        e2.z zVar = this.f11853n;
        try {
            P(true, false, true, false);
            M();
            k kVar = this.f11845f;
            if (kVar.h.remove(this.L) != null) {
                kVar.d();
            }
            if (kVar.h.isEmpty()) {
                kVar.f11765i = -1L;
            }
            e eVar = this.P;
            eVar.f11634c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            zVar.f8593a.removeCallbacksAndMessages(null);
            lVar.h();
            gVar.e();
        }
    }

    public final void M() {
        boolean z10;
        for (int i10 = 0; i10 < this.f11836a.length; i10++) {
            f fVar = this.f11838b[i10];
            synchronized (fVar.f11644a) {
                fVar.H = null;
            }
            o1 o1Var = this.f11836a[i10];
            f fVar2 = o1Var.f11810a;
            boolean z11 = true;
            if (fVar2.f11649n == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            fVar2.r();
            o1Var.f11813e = false;
            f fVar3 = o1Var.f11812c;
            if (fVar3 != null) {
                if (fVar3.f11649n != 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                fVar3.r();
                o1Var.f11814f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.g1 g1Var) {
        boolean z10 = true;
        this.W.f(1);
        g1 g1Var2 = this.I;
        g1Var2.getClass();
        if (i10 < 0 || i10 > i11 || i11 > g1Var2.f11708b.size()) {
            z10 = false;
        }
        e2.d.b(z10);
        g1Var2.f11714j = g1Var;
        g1Var2.g(i10, i11);
        v(g1Var2.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z10;
        u0 u0Var = this.H.f11924i;
        if (u0Var != null && u0Var.f11897g.f11914i && this.Y) {
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
        u0 u0Var = this.H.f11924i;
        if (u0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = u0Var.f11905p;
        }
        long j11 = j3 + j10;
        this.f11851k0 = j11;
        ((r1) this.f11865y.f197c).c(j11);
        for (o1 o1Var : this.f11836a) {
            long j12 = this.f11851k0;
            f d = o1Var.d(u0Var);
            if (d != null) {
                d.f11654y = false;
                d.f11652w = j12;
                d.f11653x = j12;
                d.q(j12, false);
            }
        }
        for (u0 u0Var2 = w0Var.f11924i; u0Var2 != null; u0Var2 = u0Var2.f11902m) {
            for (x2.r rVar : u0Var2.f11904o.f50590c) {
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
            a1.g.z(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j3) {
        o1[] o1VarArr;
        u0 u0Var;
        long j10;
        boolean z10 = this.S;
        long j11 = 1000;
        long j12 = f11835u0;
        if (z10) {
            this.R.getClass();
            if (this.V.f11727e != 3) {
                j11 = j12;
            }
            for (o1 o1Var : this.f11836a) {
                long j13 = this.f11851k0;
                long j14 = this.f11852l0;
                f fVar = o1Var.f11812c;
                f fVar2 = o1Var.f11810a;
                if (o1.h(fVar2)) {
                    j10 = fVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (fVar != null && fVar.f11649n != 0) {
                    j10 = Math.min(j10, fVar.g(j13, j14));
                }
                j11 = Math.min(j11, e2.d0.d0(j10));
            }
            if (this.V.m()) {
                u0 u0Var2 = this.H.f11924i;
                if (u0Var2 != null) {
                    u0Var = u0Var2.f11902m;
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    if ((((float) e2.d0.P(j11)) * this.V.f11736o.f3673a) + ((float) this.f11851k0) >= ((float) u0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.V.f11727e != 3 || r0()) {
            j11 = j12;
        }
        this.f11853n.f8593a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void W(boolean z10) {
        u2.f0 f0Var = this.H.f11924i.f11897g.f11908a;
        long Y = Y(f0Var, this.V.f11740s, true, false);
        if (Y != this.V.f11740s) {
            h1 h1Var = this.V;
            this.V = y(f0Var, Y, h1Var.f11726c, h1Var.d, z10, 5);
        }
    }

    public final void X(i2.o0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.X(i2.o0, boolean):void");
    }

    public final long Y(u2.f0 f0Var, long j3, boolean z10, boolean z11) {
        o1[] o1VarArr;
        v0();
        C0(false, true);
        if (z11 || this.V.f11727e == 3) {
            n0(2);
        }
        w0 w0Var = this.H;
        u0 u0Var = w0Var.f11924i;
        u0 u0Var2 = u0Var;
        while (u0Var2 != null && !f0Var.equals(u0Var2.f11897g.f11908a)) {
            u0Var2 = u0Var2.f11902m;
        }
        if (z10 || u0Var != u0Var2 || (u0Var2 != null && u0Var2.f11905p + j3 < 0)) {
            int i10 = 0;
            while (true) {
                o1VarArr = this.f11836a;
                if (i10 >= o1VarArr.length) {
                    break;
                }
                h(i10);
                i10++;
            }
            this.f11859r0 = -9223372036854775807L;
            if (u0Var2 != null) {
                while (w0Var.f11924i != u0Var2) {
                    w0Var.a();
                }
                w0Var.n(u0Var2);
                u0Var2.f11905p = 1000000000000L;
                k(w0Var.f11925j.e(), new boolean[o1VarArr.length]);
                u0Var2.h = true;
            }
        }
        g();
        if (u0Var2 != null) {
            ?? r10 = u0Var2.f11892a;
            w0Var.n(u0Var2);
            if (!u0Var2.f11895e) {
                u0Var2.f11897g = u0Var2.f11897g.b(j3);
            } else if (u0Var2.f11896f) {
                j3 = r10.h(j3);
                r10.i(j3 - this.f11864x);
            }
            R(j3);
            C();
        } else {
            w0Var.b();
            R(j3);
        }
        u(false);
        this.f11853n.e(2);
        return j3;
    }

    public final void Z(k1 k1Var) {
        k1Var.getClass();
        Looper looper = k1Var.f11772e;
        Looper looper2 = this.f11860s;
        e2.z zVar = this.f11853n;
        if (looper == looper2) {
            f(k1Var);
            int i10 = this.V.f11727e;
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
            e2.z zVar = this.f11853n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.f8591a = zVar.f8593a.obtainMessage(37);
            b10.b();
        }
    }

    public final void a0(k1 k1Var) {
        Looper looper = k1Var.f11772e;
        if (!looper.getThread().isAlive()) {
            e2.a.n("TAG", "Trying to send message on a dead thread.");
            k1Var.a(false);
            return;
        }
        this.F.a(looper, null).c(new h0(this, k1Var));
    }

    public final void b(k0 k0Var, int i10) {
        this.W.f(1);
        g1 g1Var = this.I;
        if (i10 == -1) {
            i10 = g1Var.f11708b.size();
        }
        v(g1Var.a(i10, k0Var.f11766a, k0Var.f11767b), false);
    }

    public final void b0(b2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.b0(b2.e, boolean):void");
    }

    public final void c() {
        o1[] o1VarArr;
        p1 p1Var;
        for (o1 o1Var : this.f11836a) {
            if (this.S) {
                p1Var = this.R;
            } else {
                p1Var = null;
            }
            o1Var.f11810a.c(18, p1Var);
            f fVar = o1Var.f11812c;
            if (fVar != null) {
                fVar.c(18, p1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.g gVar) {
        if (this.f11846f0 != z10) {
            this.f11846f0 = z10;
            if (!z10) {
                for (o1 o1Var : this.f11836a) {
                    o1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final boolean d() {
        if (!this.O) {
            return false;
        }
        for (o1 o1Var : this.f11836a) {
            if (o1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(k0 k0Var) {
        this.W.f(1);
        int i10 = k0Var.f11768c;
        u2.g1 g1Var = k0Var.f11767b;
        ArrayList arrayList = k0Var.f11766a;
        if (i10 != -1) {
            this.f11850j0 = new o0(new m1(arrayList, g1Var), k0Var.f11768c, k0Var.d);
        }
        g1 g1Var2 = this.I;
        ArrayList arrayList2 = g1Var2.f11708b;
        g1Var2.g(0, arrayList2.size());
        v(g1Var2.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final void e() {
        O();
        W(true);
    }

    public final void e0(boolean z10) {
        this.Y = z10;
        Q();
        if (this.Z) {
            w0 w0Var = this.H;
            if (w0Var.f11925j != w0Var.f11924i) {
                W(true);
                u(false);
            }
        }
    }

    public final void f0(b2.v0 v0Var) {
        this.f11853n.d(16);
        a3.q qVar = this.f11865y;
        qVar.f(v0Var);
        b2.v0 h = qVar.h();
        x(h, h.f3673a, true, true);
    }

    public final void g() {
        o1[] o1VarArr;
        boolean z10;
        f fVar;
        if (this.O && d()) {
            for (o1 o1Var : this.f11836a) {
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
                        fVar = o1Var.f11810a;
                    } else {
                        fVar = o1Var.f11812c;
                        fVar.getClass();
                    }
                    o1Var.a(fVar, this.f11865y);
                    o1Var.i(z10);
                    o1Var.d = i11;
                }
                this.f11849i0 -= c10 - o1Var.c();
            }
            this.f11859r0 = -9223372036854775807L;
        }
    }

    public final void g0(q qVar) {
        this.f11857q0 = qVar;
        b2.k1 k1Var = this.V.f11724a;
        w0 w0Var = this.H;
        w0Var.getClass();
        qVar.getClass();
        if (!w0Var.f11932q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < w0Var.f11932q.size(); i10++) {
                ((u0) w0Var.f11932q.get(i10)).i();
            }
            w0Var.f11932q = arrayList;
            w0Var.f11928m = null;
            w0Var.k();
        }
    }

    public final void h(int i10) {
        boolean z10;
        o1[] o1VarArr = this.f11836a;
        int c10 = o1VarArr[i10].c();
        o1 o1Var = o1VarArr[i10];
        f fVar = o1Var.f11810a;
        a3.q qVar = this.f11865y;
        o1Var.a(fVar, qVar);
        f fVar2 = o1Var.f11812c;
        if (fVar2 != null) {
            if (fVar2.f11649n != 0 && o1Var.d != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            o1Var.a(fVar2, qVar);
            o1Var.i(false);
            if (z10) {
                f fVar3 = o1Var.f11810a;
                fVar2.getClass();
                fVar2.c(17, fVar3);
            }
        }
        o1Var.d = 0;
        H(i10, false);
        this.f11849i0 -= c10;
    }

    public final void h0(int i10) {
        this.f11842d0 = i10;
        b2.k1 k1Var = this.V.f11724a;
        w0 w0Var = this.H;
        w0Var.f11923g = i10;
        int r10 = w0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10;
        u0 u0Var;
        u2.f0 f0Var;
        u0 u0Var2;
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
                    this.W.f(1);
                    z0(this.P.d(this.V.f11727e, z10), i13 >> 4, i13 & 15, z10);
                    break;
                case 2:
                    i();
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
                    w((u2.d0) message.obj);
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
                    Z((k1) message.obj);
                    break;
                case 15:
                    a0((k1) message.obj);
                    break;
                case 16:
                    b2.v0 v0Var = (b2.v0) message.obj;
                    x(v0Var, v0Var.f3673a, true, false);
                    break;
                case 17:
                    d0((k0) message.obj);
                    break;
                case 18:
                    b((k0) message.obj, message.arg1);
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
                    e();
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
        } catch (b2.s0 e7) {
            boolean z15 = e7.f3651a;
            int i14 = e7.f3652b;
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
                t(e7, i12);
            }
            i12 = i11;
            t(e7, i12);
        } catch (g2.j e10) {
            t(e10, e10.f10255a);
        } catch (n e11) {
            e = e11;
            int i15 = e.f11793s;
            w0 w0Var = this.H;
            if (i15 == 1 && (u0Var2 = w0Var.f11925j) != null && e.E == null) {
                e = e.a(u0Var2.f11897g.f11908a);
            }
            int i16 = e.f11793s;
            e2.z zVar = this.f11853n;
            if (i16 == 1 && (f0Var = e.E) != null && A(e.f11794w, f0Var)) {
                this.f11861s0 = true;
                g();
                u0 g10 = w0Var.g();
                u0 u0Var3 = w0Var.f11924i;
                if (u0Var3 != g10) {
                    while (u0Var3 != null) {
                        u0 u0Var4 = u0Var3.f11902m;
                        if (u0Var4 == g10) {
                            break;
                        }
                        u0Var3 = u0Var4;
                    }
                }
                w0Var.n(u0Var3);
                if (this.V.f11727e != 4) {
                    C();
                    zVar.e(2);
                }
            } else {
                n nVar = this.f11855o0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.f11855o0;
                }
                if (e.f11793s == 1 && w0Var.f11924i != w0Var.f11925j) {
                    while (true) {
                        u0Var = w0Var.f11924i;
                        if (u0Var == w0Var.f11925j) {
                            break;
                        }
                        w0Var.a();
                    }
                    e2.d.d(u0Var);
                    F();
                    v0 v0Var2 = u0Var.f11897g;
                    u2.f0 f0Var2 = v0Var2.f11908a;
                    long j3 = v0Var2.f11909b;
                    this.V = y(f0Var2, j3, v0Var2.f11910c, j3, true, 0);
                }
                if (e.F && (this.f11855o0 == null || (i10 = e.f3668a) == 5004 || i10 == 5003)) {
                    e2.a.o("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f11855o0 == null) {
                        this.f11855o0 = e;
                    }
                    e2.y a2 = zVar.a(25, e);
                    Handler handler = zVar.f8593a;
                    Message message2 = a2.f8591a;
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
            t(e12, 2000);
        } catch (RuntimeException e13) {
            n nVar2 = new n(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            e2.a.f("ExoPlayerImplInternal", "Playback error", nVar2);
            u0(true, false);
            this.V = this.V.f(nVar2);
        } catch (n2.f e14) {
            t(e14, e14.f16516a);
        } catch (u2.b e15) {
            t(e15, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.i():void");
    }

    public final void i0(boolean z10) {
        if (!z10) {
            this.T = false;
            this.f11853n.d(37);
            o0 o0Var = this.U;
            if (o0Var != null) {
                X(o0Var, false);
                this.U = null;
            }
        }
        this.S = z10;
        c();
    }

    public final void j(u0 u0Var, int i10, boolean z10, long j3) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        o1 o1Var = this.f11836a[i10];
        boolean g10 = o1Var.g();
        f fVar = o1Var.f11810a;
        if (!g10) {
            if (u0Var == this.H.f11924i) {
                z11 = true;
            } else {
                z11 = false;
            }
            x2.v vVar = u0Var.f11904o;
            n1 n1Var = vVar.f50589b[i10];
            x2.r rVar = vVar.f50590c[i10];
            if (r0() && this.V.f11727e == 3) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10 && z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f11849i0++;
            u2.b1 b1Var = u0Var.f11894c[i10];
            long j10 = u0Var.f11905p;
            u2.f0 f0Var = u0Var.f11897g.f11908a;
            f fVar2 = o1Var.f11812c;
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
            a3.q qVar = this.f11865y;
            if (i13 != 0 && i13 != 2 && i13 != 4) {
                o1Var.f11814f = true;
                fVar2.getClass();
                if (fVar2.f11649n == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                e2.d.g(z15);
                fVar2.d = n1Var;
                fVar2.G = f0Var;
                fVar2.f11649n = 1;
                fVar2.p(z13, z11);
                fVar2.y(sVarArr, b1Var, j3, j10, f0Var);
                fVar2.f11654y = false;
                fVar2.f11652w = j3;
                fVar2.f11653x = j3;
                fVar2.q(j3, z13);
                qVar.c(fVar2);
            } else {
                o1Var.f11813e = true;
                if (fVar.f11649n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                e2.d.g(z14);
                fVar.d = n1Var;
                fVar.G = f0Var;
                fVar.f11649n = 1;
                fVar.p(z13, z11);
                fVar.y(sVarArr, b1Var, j3, j10, f0Var);
                fVar.f11654y = false;
                fVar.f11652w = j3;
                fVar.f11653x = j3;
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

    public final void j0(p1 p1Var) {
        this.R = p1Var;
        c();
    }

    public final void k(long j3, boolean[] zArr) {
        o1[] o1VarArr;
        long j10;
        u0 u0Var = this.H.f11925j;
        x2.v vVar = u0Var.f11904o;
        int i10 = 0;
        while (true) {
            o1VarArr = this.f11836a;
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
                j(u0Var, i11, zArr[i11], j10);
            }
            i11++;
            j3 = j10;
        }
    }

    public final void k0(q1 q1Var) {
        this.Q = q1Var;
    }

    public final long l(b2.k1 k1Var, Object obj, long j3) {
        b2.h1 h1Var = this.f11863w;
        int i10 = k1Var.g(obj, h1Var).f3329c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        if (j1Var.f3383f == -9223372036854775807L || !j1Var.a() || !j1Var.f3385i) {
            return -9223372036854775807L;
        }
        return e2.d0.P(e2.d0.z(j1Var.f3384g) - j1Var.f3383f) - (j3 + h1Var.f3330e);
    }

    public final void l0(boolean z10) {
        this.f11844e0 = z10;
        b2.k1 k1Var = this.V.f11724a;
        w0 w0Var = this.H;
        w0Var.h = z10;
        int r10 = w0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    @Override
    public final void m(u2.d0 d0Var) {
        this.f11853n.a(8, d0Var).b();
    }

    public final void m0(u2.g1 g1Var) {
        this.W.f(1);
        g1 g1Var2 = this.I;
        int size = g1Var2.f11708b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.h().e(0, size);
        }
        g1Var2.f11714j = g1Var;
        v(g1Var2.b(), false);
    }

    public final long n(u0 u0Var) {
        if (u0Var == null) {
            return 0L;
        }
        long j3 = u0Var.f11905p;
        if (!u0Var.f11895e) {
            return j3;
        }
        int i10 = 0;
        while (true) {
            o1[] o1VarArr = this.f11836a;
            if (i10 < o1VarArr.length) {
                if (o1VarArr[i10].d(u0Var) != null) {
                    f d = o1VarArr[i10].d(u0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f11653x;
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
        h1 h1Var = this.V;
        if (h1Var.f11727e != i10) {
            if (i10 != 2) {
                this.f11856p0 = -9223372036854775807L;
            }
            if (i10 != 3 && h1Var.f11737p) {
                this.V = h1Var.i(false);
            }
            this.V = this.V.h(i10);
        }
    }

    public final Pair o(b2.k1 k1Var) {
        long j3 = 0;
        if (k1Var.p()) {
            return Pair.create(h1.f11723u, 0L);
        }
        int a2 = k1Var.a(this.f11844e0);
        Pair i10 = k1Var.i(this.v, this.f11863w, a2, -9223372036854775807L);
        u2.f0 p5 = this.H.p(k1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.f48616a;
            b2.h1 h1Var = this.f11863w;
            k1Var.g(obj, h1Var);
            if (p5.f48618c == h1Var.e(p5.f48617b)) {
                h1Var.f3332g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j3));
    }

    public final void o0(a3.y yVar) {
        o1[] o1VarArr;
        for (o1 o1Var : this.f11836a) {
            f fVar = o1Var.f11810a;
            if (fVar.f11645b == 2) {
                fVar.c(7, yVar);
                f fVar2 = o1Var.f11812c;
                if (fVar2 != null) {
                    fVar2.c(7, yVar);
                }
            }
        }
    }

    public final long p(long j3) {
        u0 u0Var = this.H.f11927l;
        if (u0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.f11851k0 - u0Var.f11905p));
    }

    public final void p0(Object obj, e2.g gVar) {
        o1[] o1VarArr;
        for (o1 o1Var : this.f11836a) {
            f fVar = o1Var.f11810a;
            if (fVar.f11645b == 2) {
                int i10 = o1Var.d;
                if (i10 != 4 && i10 != 1) {
                    fVar.c(1, obj);
                } else {
                    f fVar2 = o1Var.f11812c;
                    fVar2.getClass();
                    fVar2.c(1, obj);
                }
            }
        }
        int i11 = this.V.f11727e;
        if (i11 == 3 || i11 == 2) {
            this.f11853n.e(2);
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void q(int i10) {
        h1 h1Var = this.V;
        z0(i10, h1Var.f11735n, h1Var.f11734m, h1Var.f11733l);
    }

    public final void q0(float f7) {
        o1[] o1VarArr;
        this.f11862t0 = f7;
        float f10 = f7 * this.P.f11637g;
        for (o1 o1Var : this.f11836a) {
            f fVar = o1Var.f11810a;
            if (fVar.f11645b == 1) {
                fVar.c(2, Float.valueOf(f10));
                f fVar2 = o1Var.f11812c;
                if (fVar2 != null) {
                    fVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void r() {
        q0(this.f11862t0);
    }

    public final boolean r0() {
        h1 h1Var = this.V;
        if (h1Var.f11733l && h1Var.f11735n == 0) {
            return true;
        }
        return false;
    }

    public final void s(u2.d0 d0Var) {
        w0 w0Var = this.H;
        u0 u0Var = w0Var.f11927l;
        if (u0Var != null && u0Var.f11892a == d0Var) {
            w0Var.m(this.f11851k0);
            C();
            return;
        }
        u0 u0Var2 = w0Var.f11928m;
        if (u0Var2 != null && u0Var2.f11892a == d0Var) {
            E();
        }
    }

    public final boolean s0(b2.k1 k1Var, u2.f0 f0Var) {
        if (!f0Var.b() && !k1Var.p()) {
            int i10 = k1Var.g(f0Var.f48616a, this.f11863w).f3329c;
            b2.j1 j1Var = this.v;
            k1Var.n(i10, j1Var);
            if (j1Var.a() && j1Var.f3385i && j1Var.f3383f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        u0 u0Var = this.H.f11924i;
        if (u0Var != null) {
            nVar = nVar.a(u0Var.f11897g.f11908a);
        }
        e2.a.f("ExoPlayerImplInternal", "Playback error", nVar);
        u0(false, false);
        this.V = this.V.f(nVar);
    }

    public final void t0() {
        u0 u0Var = this.H.f11924i;
        if (u0Var != null) {
            x2.v vVar = u0Var.f11904o;
            int i10 = 0;
            while (true) {
                o1[] o1VarArr = this.f11836a;
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

    public final void u(boolean z10) {
        u2.f0 f0Var;
        long d;
        u0 u0Var = this.H.f11927l;
        if (u0Var == null) {
            f0Var = this.V.f11725b;
        } else {
            f0Var = u0Var.f11897g.f11908a;
        }
        boolean equals = this.V.f11732k.equals(f0Var);
        if (!equals) {
            this.V = this.V.c(f0Var);
        }
        h1 h1Var = this.V;
        if (u0Var == null) {
            d = h1Var.f11740s;
        } else {
            d = u0Var.d();
        }
        h1Var.f11738q = d;
        h1 h1Var2 = this.V;
        h1Var2.f11739r = p(h1Var2.f11738q);
        if ((!equals || z10) && u0Var != null && u0Var.f11895e) {
            x0(u0Var.f11904o);
        }
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f11846f0) {
            z12 = false;
        } else {
            z12 = true;
        }
        P(z12, false, true, false);
        this.W.f(z11 ? 1 : 0);
        k kVar = this.f11845f;
        if (kVar.h.remove(this.L) != null) {
            kVar.d();
        }
        this.P.d(1, this.V.f11733l);
        n0(1);
    }

    public final void v(b2.k1 r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: i2.p0.v(b2.k1, boolean):void");
    }

    public final void v0() {
        o1[] o1VarArr;
        a3.q qVar = this.f11865y;
        qVar.f196b = false;
        r1 r1Var = (r1) qVar.f197c;
        if (r1Var.f11881c) {
            r1Var.c(r1Var.a());
            r1Var.f11881c = false;
        }
        for (o1 o1Var : this.f11836a) {
            f fVar = o1Var.f11812c;
            f fVar2 = o1Var.f11810a;
            if (o1.h(fVar2)) {
                o1.b(fVar2);
            }
            if (fVar != null && fVar.f11649n != 0) {
                o1.b(fVar);
            }
        }
    }

    public final void w(u2.d0 d0Var) {
        u0 u0Var;
        w0 w0Var = this.H;
        u0 u0Var2 = w0Var.f11927l;
        a3.q qVar = this.f11865y;
        if (u0Var2 != null && u0Var2.f11892a == d0Var) {
            u0Var2.getClass();
            if (!u0Var2.f11895e) {
                float f7 = qVar.h().f3673a;
                h1 h1Var = this.V;
                u0Var2.f(f7, h1Var.f11724a, h1Var.f11733l);
            }
            x0(u0Var2.f11904o);
            if (u0Var2 == w0Var.f11924i) {
                R(u0Var2.f11897g.f11909b);
                k(w0Var.f11925j.e(), new boolean[this.f11836a.length]);
                u0Var2.h = true;
                h1 h1Var2 = this.V;
                u2.f0 f0Var = h1Var2.f11725b;
                long j3 = u0Var2.f11897g.f11909b;
                this.V = y(f0Var, j3, h1Var2.f11726c, j3, false, 5);
            }
            C();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 < w0Var.f11932q.size()) {
                u0Var = (u0) w0Var.f11932q.get(i10);
                if (u0Var.f11892a == d0Var) {
                    break;
                }
                i10++;
            } else {
                u0Var = null;
                break;
            }
        }
        if (u0Var != null) {
            e2.d.g(true ^ u0Var.f11895e);
            float f10 = qVar.h().f3673a;
            h1 h1Var3 = this.V;
            u0Var.f(f10, h1Var3.f11724a, h1Var3.f11733l);
            u0 u0Var3 = w0Var.f11928m;
            if (u0Var3 != null && u0Var3.f11892a == d0Var) {
                E();
            }
        }
    }

    public final void w0() {
        boolean z10;
        u0 u0Var = this.H.f11927l;
        if (!this.f11841c0 && (u0Var == null || !u0Var.f11892a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        h1 h1Var = this.V;
        if (z10 != h1Var.f11729g) {
            this.V = h1Var.b(z10);
        }
    }

    public final void x(b2.v0 v0Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.W.f(1);
            }
            this.V = this.V.g(v0Var);
        }
        float f10 = v0Var.f3673a;
        u0 u0Var = this.H.f11924i;
        while (true) {
            i10 = 0;
            if (u0Var == null) {
                break;
            }
            x2.r[] rVarArr = u0Var.f11904o.f50590c;
            int length = rVarArr.length;
            while (i10 < length) {
                x2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f10);
                }
                i10++;
            }
            u0Var = u0Var.f11902m;
        }
        o1[] o1VarArr = this.f11836a;
        int length2 = o1VarArr.length;
        while (i10 < length2) {
            o1 o1Var = o1VarArr[i10];
            float f11 = v0Var.f3673a;
            o1Var.f11810a.z(f7, f11);
            f fVar = o1Var.f11812c;
            if (fVar != null) {
                fVar.z(f7, f11);
            }
            i10++;
        }
    }

    public final void x0(x2.v vVar) {
        u0 u0Var = this.H.f11927l;
        u0Var.getClass();
        p(u0Var.d());
        if (s0(this.V.f11724a, u0Var.f11897g.f11908a)) {
            long j3 = this.J.h;
        }
        b2.k1 k1Var = this.V.f11724a;
        float f7 = this.f11865y.h().f3673a;
        boolean z10 = this.V.f11733l;
        x2.r[] rVarArr = vVar.f50590c;
        k kVar = this.f11845f;
        j jVar = (j) kVar.h.get(this.L);
        jVar.getClass();
        int i10 = kVar.f11763f;
        if (i10 == -1) {
            int length = rVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    x2.r rVar = rVarArr[i11];
                    if (rVar != null) {
                        switch (rVar.b().f3417c) {
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
        jVar.f11757b = i10;
        kVar.d();
    }

    public final h1 y(u2.f0 f0Var, long j3, long j10, long j11, boolean z10, int i10) {
        boolean z11;
        boolean z12;
        e9.a1 a1Var;
        boolean z13;
        boolean z14;
        if (!this.f11854n0 && j3 == this.V.f11740s && f0Var.equals(this.V.f11725b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f11854n0 = z11;
        Q();
        h1 h1Var = this.V;
        u2.o1 o1Var = h1Var.h;
        x2.v vVar = h1Var.f11730i;
        List list = h1Var.f11731j;
        if (this.I.f11715k) {
            u0 u0Var = this.H.f11924i;
            if (u0Var == null) {
                o1Var = u2.o1.d;
            } else {
                o1Var = u0Var.f11903n;
            }
            if (u0Var == null) {
                vVar = this.f11843e;
            } else {
                vVar = u0Var.f11904o;
            }
            x2.r[] rVarArr = vVar.f50590c;
            ?? wVar = new com.google.android.gms.common.api.internal.w(4);
            boolean z15 = false;
            for (x2.r rVar : rVarArr) {
                if (rVar != null) {
                    b2.p0 p0Var = rVar.f(0).f3637l;
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
                e9.g0 g0Var = e9.i0.f8752b;
                a1Var = e9.a1.f8715e;
            }
            list = a1Var;
            if (u0Var != null) {
                v0 v0Var = u0Var.f11897g;
                if (v0Var.f11910c != j10) {
                    u0Var.f11897g = v0Var.a(j10);
                }
            }
            o1[] o1VarArr = this.f11836a;
            w0 w0Var = this.H;
            u0 u0Var2 = w0Var.f11924i;
            if (u0Var2 == w0Var.f11925j && u0Var2 != null) {
                x2.v vVar2 = u0Var2.f11904o;
                int i11 = 0;
                boolean z16 = false;
                while (true) {
                    if (i11 < o1VarArr.length) {
                        if (vVar2.b(i11)) {
                            if (o1VarArr[i11].f11810a.f11645b != 1) {
                                z13 = false;
                                break;
                            } else if (vVar2.f50589b[i11].f11803a != 0) {
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
                if (z14 != this.f11848h0) {
                    this.f11848h0 = z14;
                    if (!z14 && this.V.f11737p) {
                        this.f11853n.e(2);
                    }
                }
            }
        } else if (!f0Var.equals(h1Var.f11725b)) {
            o1Var = u2.o1.d;
            vVar = this.f11843e;
            list = e9.a1.f8715e;
        }
        u2.o1 o1Var2 = o1Var;
        x2.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            m0 m0Var = this.W;
            if (m0Var.d && m0Var.f11785e != 5) {
                if (i10 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e2.d.b(z12);
            } else {
                m0Var.f11784c = true;
                m0Var.d = true;
                m0Var.f11785e = i10;
            }
        }
        h1 h1Var2 = this.V;
        return h1Var2.d(f0Var, j3, j10, j11, p(h1Var2.f11738q), o1Var2, vVar3, list2);
    }

    public final void y0(int i10, int i11, List list) {
        boolean z10;
        boolean z11 = true;
        this.W.f(1);
        g1 g1Var = this.I;
        g1Var.getClass();
        ArrayList arrayList = g1Var.f11708b;
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
            ((f1) arrayList.get(i12)).f11690a.t((b2.k0) list.get(i12 - i10));
        }
        v(g1Var.b(), false);
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
        if (h1Var.f11733l != z11 || h1Var.f11735n != i11 || h1Var.f11734m != i12) {
            this.V = h1Var.e(i12, i11, z11);
            C0(false, false);
            w0 w0Var = this.H;
            for (u0 u0Var = w0Var.f11924i; u0Var != null; u0Var = u0Var.f11902m) {
                for (x2.r rVar : u0Var.f11904o.f50590c) {
                    if (rVar != null) {
                        rVar.e(z11);
                    }
                }
            }
            if (!r0()) {
                v0();
                A0();
                h1 h1Var2 = this.V;
                if (h1Var2.f11737p) {
                    this.V = h1Var2.i(false);
                }
                w0Var.m(this.f11851k0);
                return;
            }
            int i13 = this.V.f11727e;
            e2.z zVar = this.f11853n;
            if (i13 == 3) {
                a3.q qVar = this.f11865y;
                qVar.f196b = true;
                ((r1) qVar.f197c).d();
                t0();
                zVar.e(2);
            } else if (i13 == 2) {
                zVar.e(2);
            }
        }
    }
}
