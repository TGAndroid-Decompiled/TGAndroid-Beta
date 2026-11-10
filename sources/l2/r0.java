package l2;

import a8.ia;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import bi.c9;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class r0 implements Handler.Callback, x2.c0, l1, d3.w {
    public static final long f18004w0 = h2.m0.h0(10000);
    public final i D;
    public final ArrayList E;
    public final h2.g0 F;
    public final v G;
    public final a1 H;
    public final j1 I;
    public final f J;
    public final long K;
    public final m2.j L;
    public final m2.e M;
    public final h2.i0 N;
    public final boolean O;
    public final f2.d P;
    public final boolean Q;
    public t1 R;
    public s1 S;
    public boolean T;
    public boolean U;
    public q0 V;
    public int W;
    public k1 X;
    public o0 Y;
    public boolean Z;
    public final r1[] f18005a;
    public boolean f18006a0;
    public final b[] f18007b;
    public boolean f18008b0;
    public final boolean[] f18009c;
    public boolean f18010c0;
    public final a3.x d;
    public long f18011d0;
    public final a3.y f18012e;
    public boolean f18013e0;
    public final t0 f18014f;
    public int f18015f0;
    public boolean f18016g0;
    public final b3.d h;
    public boolean f18017h0;
    public boolean f18018i0;
    public boolean f18019j0;
    public int f18020k0;
    public q0 f18021l0;
    public long m0;
    public final h2.i0 f18022n;
    public long f18023n0;
    public int f18024o0;
    public boolean f18025p0;
    public l f18026q0;
    public final m6.n f18027r;
    public long f18028r0;
    public final Looper f18029s;
    public o f18030s0;
    public long f18031t0;
    public boolean f18032u0;
    public float f18033v0;
    public final e2.k1 f18034w;
    public final e2.i1 f18035x;
    public final long f18036y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, a3.x xVar, a3.y yVar, t0 t0Var, b3.d dVar, int i7, boolean z9, m2.e eVar, t1 t1Var, f fVar, long j3, Looper looper, h2.g0 g0Var, v vVar, m2.j jVar, final d3.w wVar, boolean z10) {
        o oVar = o.f17974a;
        this.f18031t0 = -9223372036854775807L;
        this.G = vVar;
        this.d = xVar;
        this.f18012e = yVar;
        this.f18014f = t0Var;
        this.h = dVar;
        this.f18015f0 = i7;
        this.f18016g0 = z9;
        this.R = t1Var;
        this.J = fVar;
        this.K = j3;
        this.f18006a0 = false;
        this.F = g0Var;
        this.L = jVar;
        this.f18030s0 = oVar;
        this.M = eVar;
        this.f18033v0 = 1.0f;
        this.S = s1.f18048b;
        this.Q = z10;
        this.f18028r0 = -9223372036854775807L;
        this.f18011d0 = -9223372036854775807L;
        this.f18036y = ((h) t0Var).f17838n;
        e2.h1 h1Var = e2.l1.f10359a;
        k1 k10 = k1.k(yVar);
        this.X = k10;
        this.Y = new o0(k10);
        this.f18007b = new b[bVarArr.length];
        this.f18009c = new boolean[bVarArr.length];
        a3.s sVar = (a3.s) xVar;
        sVar.getClass();
        this.f18005a = new r1[bVarArr.length];
        boolean z11 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.f17763e = i10;
            bVar.f17764f = jVar;
            bVar.h = g0Var;
            this.f18007b[i10] = bVar;
            b bVar2 = this.f18007b[i10];
            synchronized (bVar2.f17760a) {
                bVar2.H = sVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.f17763e = i10;
                bVar3.f17764f = jVar;
                bVar3.h = g0Var;
                z11 = true;
            }
            this.f18005a[i10] = new r1(bVarArr[i10], bVar3, i10);
        }
        this.O = z11;
        this.D = new i(this, g0Var);
        this.E = new ArrayList();
        this.f18034w = new e2.k1();
        this.f18035x = new e2.i1();
        ia.p(xVar.f140a == null);
        xVar.f140a = this;
        xVar.f141b = dVar;
        this.f18025p0 = true;
        h2.i0 a10 = g0Var.a(looper, null);
        this.N = a10;
        this.H = new a1(eVar, a10, new x(this, 3));
        this.I = new j1(this, eVar, a10, jVar);
        m6.n nVar = new m6.n(7);
        this.f18027r = nVar;
        Looper d = nVar.d();
        this.f18029s = d;
        h2.i0 a11 = g0Var.a(d, this);
        this.f18022n = a11;
        this.P = new f2.d(context, d, this);
        a11.b(35, new d3.w() {
            @Override
            public final void b(long j10, long j11, e2.u uVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                wVar.b(j10, j11, uVar, mediaFormat);
                r0Var.b(j10, j11, uVar, mediaFormat);
            }
        }).b();
        a11.b(39, new k0(this)).b();
    }

    public static boolean A(x0 x0Var) {
        x2.b1[] b1VarArr;
        long e10;
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.f18075a;
                if (!x0Var.f18078e) {
                    r12.i();
                } else {
                    for (x2.b1 b1Var : x0Var.f18077c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                }
                if (!x0Var.f18078e) {
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

    public static Pair T(e2.l1 l1Var, q0 q0Var, boolean z9, int i7, boolean z10, e2.k1 k1Var, e2.i1 i1Var) {
        e2.l1 l1Var2;
        int U;
        e2.l1 l1Var3 = q0Var.f17997a;
        if (!l1Var.p()) {
            if (l1Var3.p()) {
                l1Var2 = l1Var;
            } else {
                l1Var2 = l1Var3;
            }
            try {
                Pair i10 = l1Var2.i(k1Var, i1Var, q0Var.f17998b, q0Var.f17999c);
                if (!l1Var.equals(l1Var2)) {
                    if (l1Var.b(i10.first) != -1) {
                        if (l1Var2.g(i10.first, i1Var).f10289f && l1Var2.m(i1Var.f10287c, k1Var, 0L).f10340n == l1Var2.b(i10.first)) {
                            return l1Var.i(k1Var, i1Var, l1Var.g(i10.first, i1Var).f10287c, q0Var.f17999c);
                        }
                    } else if (z9 && (U = U(k1Var, i1Var, i7, z10, i10.first, l1Var2, l1Var)) != -1) {
                        return l1Var.i(k1Var, i1Var, U, -9223372036854775807L);
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

    public static int U(e2.k1 k1Var, e2.i1 i1Var, int i7, boolean z9, Object obj, e2.l1 l1Var, e2.l1 l1Var2) {
        e2.k1 k1Var2 = k1Var;
        e2.l1 l1Var3 = l1Var;
        Object obj2 = l1Var3.m(l1Var3.g(obj, i1Var).f10287c, k1Var, 0L).f10329a;
        for (int i10 = 0; i10 < l1Var2.o(); i10++) {
            if (l1Var2.m(i10, k1Var, 0L).f10329a.equals(obj2)) {
                return i10;
            }
        }
        int b10 = l1Var3.b(obj);
        int h = l1Var3.h();
        int i11 = -1;
        int i12 = 0;
        while (i12 < h && i11 == -1) {
            e2.l1 l1Var4 = l1Var3;
            int d = l1Var4.d(b10, i1Var, k1Var2, i7, z9);
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
        return l1Var2.f(i11, i1Var, false).f10287c;
    }

    public static void h(n1 n1Var) {
        try {
            synchronized (n1Var) {
                synchronized (n1Var) {
                }
                n1Var.f17969a.c(n1Var.f17971c, n1Var.d);
                return;
            }
            n1Var.f17969a.c(n1Var.f17971c, n1Var.d);
            return;
        } finally {
            n1Var.a(true);
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.A0():void");
    }

    public final boolean B(int i7, x2.f0 f0Var) {
        boolean z9;
        boolean z10;
        a1 a1Var = this.H;
        x0 x0Var = a1Var.f17753k;
        if (x0Var != null && x0Var.f18080g.f18091a.equals(f0Var)) {
            r1 r1Var = this.f18005a[i7];
            x0 x0Var2 = a1Var.f17753k;
            int i10 = r1Var.d;
            if ((i10 == 2 || i10 == 4) && r1Var.d(x0Var2) == r1Var.f18037a) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (r1Var.d == 3 && r1Var.d(x0Var2) == r1Var.f18039c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 || z10) {
                return true;
            }
        }
        return false;
    }

    public final void B0(int i7, int i10, int i11, boolean z9) {
        boolean z10;
        a3.u[] uVarArr;
        if (z9 && i7 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z11 = this.T;
        if (i7 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            if (z11) {
                i10 = 4;
            } else {
                i10 = 0;
            }
        }
        k1 k1Var = this.X;
        if (k1Var.f17924l != z10 || k1Var.f17926n != i10 || k1Var.f17925m != i11) {
            this.X = k1Var.e(i11, i10, z10);
            E0(false, false);
            a1 a1Var = this.H;
            for (x0 x0Var = a1Var.f17751i; x0Var != null; x0Var = x0Var.f18085m) {
                for (a3.u uVar : x0Var.f18087o.f145c) {
                    if (uVar != null) {
                        uVar.f(z10);
                    }
                }
            }
            if (!s0()) {
                w0();
                C0();
                k1 k1Var2 = this.X;
                if (k1Var2.f17928p) {
                    this.X = k1Var2.i(false);
                }
                a1Var.m(this.m0);
                return;
            }
            int i12 = this.X.f17918e;
            h2.i0 i0Var = this.f18022n;
            if (i12 == 3) {
                i iVar = this.D;
                iVar.f17849b = true;
                ((u1) iVar.f17850c).d();
                u0();
                i0Var.f(2);
            } else if (i12 == 2) {
                i0Var.f(2);
            }
        }
    }

    public final boolean C() {
        x0 x0Var = this.H.f17751i;
        long j3 = x0Var.f18080g.f18095f;
        if (x0Var.f18078e) {
            if (j3 == -9223372036854775807L || this.X.f17931s < j3 || !s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C0() {
        long j3;
        boolean z9;
        long j10;
        long max;
        long j11;
        float f10;
        x0 x0Var = this.H.f17751i;
        if (x0Var != null) {
            if (x0Var.f18078e) {
                j3 = x0Var.f18075a.n();
            } else {
                j3 = -9223372036854775807L;
            }
            if (j3 != -9223372036854775807L) {
                if (!x0Var.g()) {
                    this.H.n(x0Var);
                    v(false);
                    D();
                }
                R(j3, true);
                if (j3 != this.X.f17931s) {
                    k1 k1Var = this.X;
                    this.X = z(k1Var.f17916b, j3, k1Var.f17917c, j3, true, 5);
                }
            } else {
                i iVar = this.D;
                if (x0Var != this.H.f17752j) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                u1 u1Var = (u1) iVar.f17850c;
                b bVar = (b) iVar.f17851e;
                if (bVar != null && !bVar.l() && ((!z9 || ((b) iVar.f17851e).f17765n == 2) && (((b) iVar.f17851e).m() || (!z9 && !((b) iVar.f17851e).k())))) {
                    w0 w0Var = (w0) iVar.f17852f;
                    w0Var.getClass();
                    long a10 = w0Var.a();
                    if (iVar.f17848a) {
                        if (a10 < u1Var.a()) {
                            if (u1Var.f18064c) {
                                u1Var.c(u1Var.a());
                                u1Var.f18064c = false;
                            }
                        } else {
                            iVar.f17848a = false;
                            if (iVar.f17849b) {
                                u1Var.d();
                            }
                        }
                    }
                    u1Var.c(a10);
                    e2.w0 j12 = w0Var.j();
                    if (!j12.equals((e2.w0) u1Var.f18065e)) {
                        u1Var.e(j12);
                        ((r0) iVar.d).f18022n.b(16, j12).b();
                    }
                } else {
                    iVar.f17848a = true;
                    if (iVar.f17849b) {
                        u1Var.d();
                    }
                }
                long a11 = iVar.a();
                this.m0 = a11;
                long j13 = a11 - x0Var.f18088p;
                long j14 = this.X.f17931s;
                ArrayList arrayList = this.E;
                if (!arrayList.isEmpty() && !this.X.f17916b.b()) {
                    if (this.f18025p0) {
                        this.f18025p0 = false;
                    }
                    k1 k1Var2 = this.X;
                    k1Var2.f17915a.b(k1Var2.f17916b.f58342a);
                    int min = Math.min(this.f18024o0, arrayList.size());
                    if (min > 0 && arrayList.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < arrayList.size() && arrayList.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f18024o0 = min;
                }
                if (this.D.b()) {
                    boolean z10 = !this.Y.d;
                    k1 k1Var3 = this.X;
                    this.X = z(k1Var3.f17916b, j13, k1Var3.f17917c, j13, z10, 6);
                } else {
                    k1 k1Var4 = this.X;
                    k1Var4.f17931s = j13;
                    k1Var4.f17932t = SystemClock.elapsedRealtime();
                }
            }
            this.X.f17929q = this.H.f17754l.d();
            k1 k1Var5 = this.X;
            k1Var5.f17930r = q(k1Var5.f17929q);
            k1 k1Var6 = this.X;
            if (k1Var6.f17924l && k1Var6.f17918e == 3 && t0(k1Var6.f17915a, k1Var6.f17916b)) {
                k1 k1Var7 = this.X;
                float f11 = 1.0f;
                if (k1Var7.f17927o.f10643a == 1.0f) {
                    f fVar = this.J;
                    long n10 = n(k1Var7.f17915a, k1Var7.f17916b.f58342a, k1Var7.f17931s);
                    long j15 = this.X.f17930r;
                    if (fVar.f17805c != -9223372036854775807L) {
                        long j16 = n10 - j15;
                        if (fVar.f17813m == -9223372036854775807L) {
                            fVar.f17813m = j16;
                            fVar.f17814n = 0L;
                        } else {
                            fVar.f17813m = Math.max(j16, (((float) j16) * 9.999871E-4f) + (((float) j10) * 0.999f));
                            fVar.f17814n = (9.999871E-4f * ((float) Math.abs(j16 - max))) + (((float) fVar.f17814n) * 0.999f);
                        }
                        if (fVar.f17812l != -9223372036854775807L) {
                            j11 = 1000;
                            if (SystemClock.elapsedRealtime() - fVar.f17812l < 1000) {
                                f11 = fVar.f17811k;
                            }
                        } else {
                            j11 = 1000;
                        }
                        fVar.f17812l = SystemClock.elapsedRealtime();
                        long j17 = (fVar.f17814n * 3) + fVar.f17813m;
                        if (fVar.h > j17) {
                            float S = (float) h2.m0.S(j11);
                            f10 = 1.0E-7f;
                            long[] jArr = {j17, fVar.f17806e, fVar.h - (((fVar.f17811k - 1.0f) * S) + ((fVar.f17809i - 1.0f) * S))};
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
                            long j20 = h2.m0.j(n10 - (Math.max(0.0f, fVar.f17811k - 1.0f) / 1.0E-7f), fVar.h, j17);
                            fVar.h = j20;
                            long j21 = fVar.f17808g;
                            if (j21 != -9223372036854775807L && j20 > j21) {
                                fVar.h = j21;
                            }
                        }
                        long j22 = n10 - fVar.h;
                        if (Math.abs(j22) < fVar.f17803a) {
                            fVar.f17811k = 1.0f;
                        } else {
                            fVar.f17811k = h2.m0.h((f10 * ((float) j22)) + 1.0f, fVar.f17810j, fVar.f17809i);
                        }
                        f11 = fVar.f17811k;
                    }
                    if (this.D.j().f10643a != f11) {
                        e2.w0 w0Var2 = new e2.w0(f11, this.X.f17927o.f10644b);
                        this.f18022n.e(16);
                        this.D.e(w0Var2);
                        y(this.X.f17927o, this.D.j().f10643a, false, false);
                    }
                }
            }
        }
    }

    public final void D() {
        long e10;
        long j3;
        boolean b10;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (!A(this.H.f17754l)) {
            b10 = false;
        } else {
            x0 x0Var = this.H.f17754l;
            if (!x0Var.f18078e) {
                e10 = 0;
            } else {
                e10 = x0Var.f18075a.e();
            }
            long q10 = q(e10);
            x0 x0Var2 = this.H.f17751i;
            if (t0(this.X.f17915a, x0Var.f18080g.f18091a)) {
                j3 = this.J.h;
            } else {
                j3 = -9223372036854775807L;
            }
            m2.j jVar = this.L;
            e2.l1 l1Var = this.X.f17915a;
            x2.f0 f0Var = x0Var.f18080g.f18091a;
            float f10 = this.D.j().f10643a;
            boolean z12 = this.X.f17924l;
            s0 s0Var = new s0(jVar, l1Var, f0Var, q10, f10, this.f18010c0, j3);
            b10 = ((h) this.f18014f).b(s0Var);
            x0 x0Var3 = this.H.f17751i;
            if (!b10 && x0Var3.f18078e && q10 < 500000 && this.f18036y > 0) {
                x0Var3.f18075a.k(this.X.f17931s);
                b10 = ((h) this.f18014f).b(s0Var);
            }
        }
        this.f18013e0 = b10;
        if (b10) {
            x0 x0Var4 = this.H.f17754l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.f18059a = this.m0 - x0Var4.f18088p;
            float f11 = this.D.j().f10643a;
            if (f11 <= 0.0f && f11 != -3.4028235E38f) {
                z9 = false;
            } else {
                z9 = true;
            }
            ia.f(z9);
            u0Var.f18060b = f11;
            long j10 = this.f18011d0;
            if (j10 < 0 && j10 != -9223372036854775807L) {
                z10 = false;
            } else {
                z10 = true;
            }
            ia.f(z10);
            u0Var.f18061c = j10;
            v0 v0Var = new v0(u0Var);
            if (x0Var4.f18085m == null) {
                z11 = true;
            }
            ia.p(z11);
            x0Var4.f18075a.c(v0Var);
        }
        x0();
    }

    public final void D0(e2.l1 l1Var, x2.f0 f0Var, e2.l1 l1Var2, x2.f0 f0Var2, long j3, boolean z9) {
        Object obj;
        e2.w0 w0Var;
        boolean t02 = t0(l1Var, f0Var);
        Object obj2 = f0Var.f58342a;
        if (!t02) {
            if (f0Var.b()) {
                w0Var = e2.w0.d;
            } else {
                w0Var = this.X.f17927o;
            }
            i iVar = this.D;
            if (!iVar.j().equals(w0Var)) {
                this.f18022n.e(16);
                iVar.e(w0Var);
                y(this.X.f17927o, w0Var.f10643a, false, false);
                return;
            }
            return;
        }
        e2.i1 i1Var = this.f18035x;
        int i7 = l1Var.g(obj2, i1Var).f10287c;
        e2.k1 k1Var = this.f18034w;
        l1Var.n(i7, k1Var);
        e2.f0 f0Var3 = k1Var.f10336j;
        f fVar = this.J;
        fVar.getClass();
        fVar.f17805c = h2.m0.S(f0Var3.f10246a);
        fVar.f17807f = h2.m0.S(f0Var3.f10247b);
        fVar.f17808g = h2.m0.S(f0Var3.f10248c);
        float f10 = f0Var3.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        fVar.f17810j = f10;
        float f11 = f0Var3.f10249e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        fVar.f17809i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            fVar.f17805c = -9223372036854775807L;
        }
        fVar.a();
        if (j3 != -9223372036854775807L) {
            fVar.d = n(l1Var, obj2, j3);
            fVar.a();
            return;
        }
        Object obj3 = k1Var.f10329a;
        if (!l1Var2.p()) {
            obj = l1Var2.m(l1Var2.g(f0Var2.f58342a, i1Var).f10287c, k1Var, 0L).f10329a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z9) {
            return;
        }
        fVar.d = -9223372036854775807L;
        fVar.a();
    }

    public final void E() {
        boolean z9;
        boolean z10;
        a1 a1Var = this.H;
        a1Var.k();
        x0 x0Var = a1Var.f17755m;
        if (x0Var != null) {
            ?? r12 = x0Var.f18075a;
            if ((!x0Var.d || x0Var.f18078e) && !r12.g()) {
                e2.l1 l1Var = this.X.f17915a;
                if (x0Var.f18078e) {
                    r12.p();
                }
                for (g gVar : ((h) this.f18014f).f17840p.values()) {
                    if (gVar.f17820b) {
                        return;
                    }
                }
                boolean z11 = true;
                if (!x0Var.d) {
                    long j3 = x0Var.f18080g.f18092b;
                    x0Var.d = true;
                    r12.q(this, j3);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.f18059a = this.m0 - x0Var.f18088p;
                float f10 = this.D.j().f10643a;
                if (f10 <= 0.0f && f10 != -3.4028235E38f) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                ia.f(z9);
                u0Var.f18060b = f10;
                long j10 = this.f18011d0;
                if (j10 < 0 && j10 != -9223372036854775807L) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ia.f(z10);
                u0Var.f18061c = j10;
                v0 v0Var = new v0(u0Var);
                if (x0Var.f18085m != null) {
                    z11 = false;
                }
                ia.p(z11);
                r12.c(v0Var);
            }
        }
    }

    public final void E0(boolean z9, boolean z10) {
        long j3;
        this.f18010c0 = z9;
        if (z9 && !z10) {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = -9223372036854775807L;
        }
        this.f18011d0 = j3;
    }

    public final void F() {
        boolean z9;
        o0 o0Var = this.Y;
        k1 k1Var = this.X;
        boolean z10 = o0Var.f17977c;
        if (((k1) o0Var.f17979f) != k1Var) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        o0Var.f17977c = z11;
        o0Var.f17979f = k1Var;
        if (z11) {
            i0 i0Var = this.G.f18067b;
            i0Var.f17868j.d(new ha.b(23, i0Var, o0Var));
            this.Y = new o0(this.X);
        }
    }

    public final void G(int i7) {
        r1 r1Var = this.f18005a[i7];
        try {
            x0 x0Var = this.H.f17751i;
            x0Var.getClass();
            b d = r1Var.d(x0Var);
            d.getClass();
            x2.b1 b1Var = d.f17766r;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = r1Var.f18037a.f17761b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            a3.y yVar = this.H.f17751i.f18087o;
            h2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + e2.u.c(yVar.f145c[i7].n()), e10);
            a3.y yVar2 = new a3.y((q1[]) yVar.f144b.clone(), (a3.u[]) yVar.f145c.clone(), yVar.d, yVar.f146e);
            yVar2.f144b[i7] = null;
            yVar2.f145c[i7] = null;
            j(i7);
            x0 x0Var2 = this.H.f17751i;
            x0Var2.a(yVar2, this.X.f17931s, false, new boolean[x0Var2.f18082j.length]);
        }
    }

    public final void H(int i7, boolean z9) {
        boolean[] zArr = this.f18009c;
        if (zArr[i7] != z9) {
            zArr[i7] = z9;
            this.N.d(new c9(this, i7, z9, 1));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(n0 n0Var) {
        boolean z9;
        e2.l1 b10;
        this.Y.f(1);
        int i7 = n0Var.f17966a;
        int i10 = n0Var.f17967b;
        int i11 = n0Var.f17968c;
        x2.g1 g1Var = n0Var.d;
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.f17904b;
        if (i7 >= 0 && i7 <= i10 && i10 <= arrayList.size() && i11 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        j1Var.f17910j = g1Var;
        if (i7 != i10 && i7 != i11) {
            int min = Math.min(i7, i11);
            int max = Math.max(((i10 - i7) + i11) - 1, i10 - 1);
            int i12 = ((i1) arrayList.get(min)).d;
            h2.m0.R(i7, i10, i11, arrayList);
            while (min <= max) {
                i1 i1Var = (i1) arrayList.get(min);
                i1Var.d = i12;
                i12 += i1Var.f17894a.f58287o.f58462e.o();
                min++;
            }
            b10 = j1Var.b();
        } else {
            b10 = j1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        boolean z9;
        int i7;
        int i10;
        this.Y.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f18014f;
        ConcurrentHashMap concurrentHashMap = hVar.f17840p;
        long id2 = Thread.currentThread().getId();
        long j3 = hVar.f17841q;
        if (j3 != -1 && j3 != id2) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z9);
        hVar.f17841q = id2;
        m2.j jVar = this.L;
        g gVar = (g) concurrentHashMap.get(jVar);
        if (gVar == null) {
            ?? obj = new Object();
            obj.f17819a = 1;
            concurrentHashMap.put(jVar, obj);
        } else {
            gVar.f17819a++;
        }
        g gVar2 = (g) concurrentHashMap.get(jVar);
        gVar2.getClass();
        Integer num = (Integer) hVar.f17839o.get(jVar.f19567a);
        if (num != null && num.intValue() != -1) {
            i7 = num.intValue();
        } else {
            i7 = hVar.f17836l;
        }
        if (i7 == -1) {
            i7 = 13107200;
        }
        gVar2.f17821c = i7;
        gVar2.f17820b = false;
        if (this.X.f17915a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        o0(i10);
        k1 k1Var = this.X;
        boolean z10 = k1Var.f17924l;
        B0(this.P.d(k1Var.f17918e, z10), k1Var.f17926n, k1Var.f17925m, z10);
        b3.g gVar3 = (b3.g) this.h;
        gVar3.getClass();
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.f17904b;
        ia.p(!j1Var.f17911k);
        j1Var.f17912l = gVar3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i1 i1Var = (i1) arrayList.get(i11);
            j1Var.e(i1Var);
            j1Var.f17908g.add(i1Var);
        }
        j1Var.f17911k = true;
        this.f18022n.f(2);
    }

    public final void L(h2.i iVar) {
        m6.n nVar = this.f18027r;
        h2.i0 i0Var = this.f18022n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f18014f;
            m2.j jVar = this.L;
            h hVar = (h) t0Var;
            ConcurrentHashMap concurrentHashMap = hVar.f17840p;
            g gVar = (g) concurrentHashMap.get(jVar);
            if (gVar != null) {
                int i7 = gVar.f17819a - 1;
                gVar.f17819a = i7;
                if (i7 == 0) {
                    concurrentHashMap.remove(jVar);
                    hVar.c();
                }
            }
            if (hVar.f17840p.isEmpty()) {
                hVar.f17841q = -1L;
            }
            f2.d dVar = this.P;
            dVar.f10900c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.f14098a.removeCallbacksAndMessages(null);
            nVar.g();
            iVar.e();
        }
    }

    public final void M() {
        boolean z9;
        for (int i7 = 0; i7 < this.f18005a.length; i7++) {
            b bVar = this.f18007b[i7];
            synchronized (bVar.f17760a) {
                bVar.H = null;
            }
            r1 r1Var = this.f18005a[i7];
            b bVar2 = r1Var.f18037a;
            boolean z10 = true;
            if (bVar2.f17765n == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            bVar2.q();
            r1Var.f18040e = false;
            b bVar3 = r1Var.f18039c;
            if (bVar3 != null) {
                if (bVar3.f17765n != 0) {
                    z10 = false;
                }
                ia.p(z10);
                bVar3.q();
                r1Var.f18041f = false;
            }
        }
    }

    public final void N(int i7, int i10, x2.g1 g1Var) {
        boolean z9 = true;
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        if (i7 < 0 || i7 > i10 || i10 > j1Var.f17904b.size()) {
            z9 = false;
        }
        ia.f(z9);
        j1Var.f17910j = g1Var;
        j1Var.g(i7, i10);
        w(j1Var.b(), false);
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.O():void");
    }

    public final void P(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.P(boolean, boolean, boolean, boolean):void");
    }

    public final void Q() {
        boolean z9;
        x0 x0Var = this.H.f17751i;
        if (x0Var != null && x0Var.f18080g.f18098j && this.f18006a0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f18008b0 = z9;
    }

    public final void R(long j3, boolean z9) {
        a1 a1Var;
        long j10;
        r1[] r1VarArr;
        a3.u[] uVarArr;
        x0 x0Var = this.H.f17751i;
        if (x0Var == null) {
            j10 = 1000000000000L;
        } else {
            j10 = x0Var.f18088p;
        }
        long j11 = j3 + j10;
        this.m0 = j11;
        ((u1) this.D.f17850c).c(j11);
        for (r1 r1Var : this.f18005a) {
            long j12 = this.m0;
            b d = r1Var.d(x0Var);
            if (d != null) {
                d.z(j12, false, z9);
            }
        }
        for (x0 x0Var2 = a1Var.f17751i; x0Var2 != null; x0Var2 = x0Var2.f18085m) {
            for (a3.u uVar : x0Var2.f18087o.f145c) {
                if (uVar != null) {
                    uVar.s();
                }
            }
        }
    }

    public final void S(e2.l1 l1Var, e2.l1 l1Var2) {
        if (l1Var.p() && l1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a8.p0.A(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j3) {
        r1[] r1VarArr;
        x0 x0Var;
        long j10;
        boolean z9 = this.T;
        long j11 = 1000;
        long j12 = f18004w0;
        if (z9) {
            this.S.getClass();
            if (this.X.f17918e != 3) {
                j11 = j12;
            }
            for (r1 r1Var : this.f18005a) {
                long j13 = this.m0;
                long j14 = this.f18023n0;
                b bVar = r1Var.f18039c;
                b bVar2 = r1Var.f18037a;
                if (r1.h(bVar2)) {
                    j10 = bVar2.g(j13, j14);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (bVar != null && bVar.f17765n != 0) {
                    j10 = Math.min(j10, bVar.g(j13, j14));
                }
                j11 = Math.min(j11, h2.m0.h0(j10));
            }
            if (this.X.m()) {
                x0 x0Var2 = this.H.f17751i;
                if (x0Var2 != null) {
                    x0Var = x0Var2.f18085m;
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    if ((((float) h2.m0.S(j11)) * this.X.f17927o.f10643a) + ((float) this.m0) >= ((float) x0Var.e())) {
                        j11 = Math.min(j11, j12);
                    }
                }
            }
        } else if (this.X.f17918e != 3 || s0()) {
            j11 = j12;
        }
        this.f18022n.f14098a.sendEmptyMessageAtTime(2, j3 + j11);
    }

    public final void W(boolean z9) {
        x2.f0 f0Var = this.H.f17751i.f18080g.f18091a;
        long Y = Y(f0Var, this.X.f17931s, true, false);
        if (Y != this.X.f17931s) {
            k1 k1Var = this.X;
            this.X = z(f0Var, Y, k1Var.f17917c, k1Var.d, z9, 5);
        }
    }

    public final void X(l2.q0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.X(l2.q0):void");
    }

    public final long Y(x2.f0 f0Var, long j3, boolean z9, boolean z10) {
        a1 a1Var;
        r1[] r1VarArr;
        boolean z11;
        r1[] r1VarArr2;
        int i7;
        w0();
        boolean z12 = true;
        E0(false, true);
        if (z10 || this.X.f17918e == 3) {
            o0(2);
        }
        x0 x0Var = this.H.f17751i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !f0Var.equals(x0Var2.f18080g.f18091a)) {
            x0Var2 = x0Var2.f18085m;
        }
        if (z9 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.f18088p + j3 < 0)) {
            for (int i10 = 0; i10 < this.f18005a.length; i10++) {
                j(i10);
            }
            this.f18031t0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    a1Var = this.H;
                    if (a1Var.f17751i == x0Var2) {
                        break;
                    }
                    a1Var.a();
                }
                a1Var.n(x0Var2);
                x0Var2.f18088p = 1000000000000L;
                m(this.H.f17752j.e(), new boolean[this.f18005a.length]);
                x0Var2.h = true;
            }
        }
        i();
        if (this.T) {
            for (r1 r1Var : this.f18005a) {
                if (r1Var.g() && ((i7 = r1Var.f18037a.f17761b) == 2 || i7 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.H.n(x0Var2);
            if (!x0Var2.f18078e) {
                x0Var2.f18080g = x0Var2.f18080g.b(j3, -9223372036854775807L);
            } else if (x0Var2.f18079f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.f17915a.p() && x0Var2.f18080g.f18091a.equals(this.X.f17916b)) {
                        long j10 = x0Var2.f18088p + j3;
                        boolean z13 = true;
                        for (r1 r1Var2 : this.f18005a) {
                            if (r1Var2.g()) {
                                b d = r1Var2.d(x0Var2);
                                if (d != null && d.E(j10)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z13 &= z11;
                            }
                        }
                        if (z13) {
                            ?? r10 = x0Var2.f18075a;
                            long j11 = this.X.f17931s;
                            t1 t1Var = t1.f18053e;
                            if (r10.h(j11, t1Var) == x0Var2.f18075a.h(j3, t1Var)) {
                                z12 = false;
                            }
                        }
                    }
                }
                j3 = x0Var2.f18075a.j(j3);
                x0Var2.f18075a.k(j3 - this.f18036y);
            }
            R(j3, z12);
            D();
        } else {
            this.H.b();
            R(j3, true);
        }
        v(false);
        this.f18022n.f(2);
        return j3;
    }

    public final void Z(n1 n1Var) {
        n1Var.getClass();
        Looper looper = n1Var.f17972e;
        Looper looper2 = this.f18029s;
        h2.i0 i0Var = this.f18022n;
        if (looper == looper2) {
            h(n1Var);
            int i7 = this.X.f17918e;
            if (i7 != 3 && i7 != 2) {
                return;
            }
            i0Var.f(2);
            return;
        }
        i0Var.b(15, n1Var).b();
    }

    @Override
    public final void a(x2.d0 d0Var) {
        this.f18022n.b(8, d0Var).b();
    }

    public final void a0(n1 n1Var) {
        Looper looper = n1Var.f17972e;
        if (!looper.getThread().isAlive()) {
            h2.a.l("TAG", "Trying to send message on a dead thread.");
            n1Var.a(false);
            return;
        }
        this.F.a(looper, null).d(new a0(this, n1Var));
    }

    @Override
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        if (this.U) {
            this.f18022n.a(37).b();
        }
    }

    public final void b0(e2.e r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.b0(e2.e, boolean):void");
    }

    public final void c(m0 m0Var, int i7) {
        this.Y.f(1);
        j1 j1Var = this.I;
        if (i7 == -1) {
            i7 = j1Var.f17904b.size();
        }
        w(j1Var.a(i7, m0Var.f17940a, m0Var.f17941b), false);
    }

    public final void c0(boolean z9, h2.i iVar) {
        if (this.f18017h0 != z9) {
            this.f18017h0 = z9;
            if (!z9) {
                for (r1 r1Var : this.f18005a) {
                    r1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override
    public final void d(x2.d1 d1Var) {
        this.f18022n.b(9, (x2.d0) d1Var).b();
    }

    public final void d0(k0 k0Var) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f18005a) {
            b bVar = r1Var.f18037a;
            if (bVar.f17761b == 4) {
                bVar.c(23, k0Var);
                b bVar2 = r1Var.f18039c;
                if (bVar2 != null) {
                    bVar2.c(23, k0Var);
                }
            }
        }
    }

    public final void e() {
        r1[] r1VarArr;
        s1 s1Var;
        for (r1 r1Var : this.f18005a) {
            if (this.T) {
                s1Var = this.S;
            } else {
                s1Var = null;
            }
            r1Var.f18037a.c(18, s1Var);
            b bVar = r1Var.f18039c;
            if (bVar != null) {
                bVar.c(18, s1Var);
            }
        }
    }

    public final void e0(m0 m0Var) {
        this.Y.f(1);
        int i7 = m0Var.f17942c;
        x2.g1 g1Var = m0Var.f17941b;
        ArrayList arrayList = m0Var.f17940a;
        if (i7 != -1) {
            this.f18021l0 = new q0(new p1(arrayList, g1Var), m0Var.f17942c, m0Var.d);
        }
        j1 j1Var = this.I;
        ArrayList arrayList2 = j1Var.f17904b;
        j1Var.g(0, arrayList2.size());
        w(j1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final boolean f() {
        if (!this.O) {
            return false;
        }
        for (r1 r1Var : this.f18005a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(boolean z9) {
        this.f18006a0 = z9;
        Q();
        if (this.f18008b0) {
            a1 a1Var = this.H;
            if (a1Var.f17752j != a1Var.f17751i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g() {
        O();
        W(true);
    }

    public final void g0(e2.w0 w0Var) {
        this.f18022n.e(16);
        i iVar = this.D;
        iVar.e(w0Var);
        e2.w0 j3 = iVar.j();
        y(j3, j3.f10643a, true, true);
    }

    public final void h0(o oVar) {
        this.f18030s0 = oVar;
        e2.l1 l1Var = this.X.f17915a;
        a1 a1Var = this.H;
        a1Var.getClass();
        oVar.getClass();
        if (!a1Var.f17759q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < a1Var.f17759q.size(); i7++) {
                ((x0) a1Var.f17759q.get(i7)).i();
            }
            a1Var.f17759q = arrayList;
            a1Var.f17755m = null;
            a1Var.k();
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7;
        x0 x0Var;
        x2.f0 f0Var;
        x0 x0Var2;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i12 = message.arg2;
                    this.Y.f(1);
                    B0(this.P.d(this.X.f17918e, z9), i12 >> 4, i12 & 15, z9);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((e2.w0) message.obj);
                    break;
                case 5:
                    l0((t1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((h2.i) message.obj);
                    return true;
                case 8:
                    x((x2.d0) message.obj);
                    break;
                case 9:
                    t((x2.d0) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    i0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m0(z10);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c0(z11, (h2.i) message.obj);
                    break;
                case 14:
                    Z((n1) message.obj);
                    break;
                case 15:
                    a0((n1) message.obj);
                    break;
                case 16:
                    e2.w0 w0Var = (e2.w0) message.obj;
                    y(w0Var, w0Var.f10643a, true, false);
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
                    N(message.arg1, message.arg2, (x2.g1) message.obj);
                    break;
                case 21:
                    n0((x2.g1) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f0(z12);
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
                    q0(pair.first, (h2.i) pair.second);
                    break;
                case 31:
                    e2.e eVar = (e2.e) message.obj;
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b0(eVar, z13);
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
                    p0((d3.w) message.obj);
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
                    k0((s1) message.obj);
                    break;
                case 39:
                    d0((k0) message.obj);
                    break;
            }
        } catch (e2.t0 e10) {
            boolean z14 = e10.f10576a;
            int i13 = e10.f10577b;
            if (i13 == 1) {
                if (z14) {
                    i10 = 3001;
                } else {
                    i10 = 3003;
                }
            } else {
                if (i13 == 4) {
                    if (z14) {
                        i10 = 3002;
                    } else {
                        i10 = 3004;
                    }
                }
                u(e10, i11);
            }
            i11 = i10;
            u(e10, i11);
        } catch (j2.j e11) {
            u(e11, e11.f16437a);
        } catch (IOException e12) {
            u(e12, 2000);
        } catch (RuntimeException e13) {
            l lVar = new l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1004);
            h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
            v0(true, false);
            this.X = this.X.f(lVar);
        } catch (l e14) {
            e = e14;
            int i14 = e.f17933s;
            a1 a1Var = this.H;
            if (i14 == 1 && (x0Var2 = a1Var.f17752j) != null && e.E == null) {
                e = e.a(x0Var2.f18080g.f18091a);
            }
            int i15 = e.f17933s;
            h2.i0 i0Var = this.f18022n;
            if (i15 == 1 && (f0Var = e.E) != null && B(e.f17935x, f0Var)) {
                this.f18032u0 = true;
                i();
                x0 g10 = a1Var.g();
                x0 x0Var3 = a1Var.f17751i;
                if (x0Var3 != g10) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.f18085m;
                        if (x0Var4 == g10) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                a1Var.n(x0Var3);
                if (this.X.f17918e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                l lVar2 = this.f18026q0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.f18026q0;
                }
                if (e.f17933s == 1 && a1Var.f17751i != a1Var.f17752j) {
                    while (true) {
                        x0Var = a1Var.f17751i;
                        if (x0Var == a1Var.f17752j) {
                            break;
                        }
                        a1Var.a();
                    }
                    ia.l(x0Var);
                    F();
                    y0 y0Var = x0Var.f18080g;
                    x2.f0 f0Var2 = y0Var.f18091a;
                    long j3 = y0Var.f18092b;
                    this.X = z(f0Var2, j3, y0Var.d, j3, true, 0);
                }
                if (e.F && (this.f18026q0 == null || (i7 = e.f10634a) == 5004 || i7 == 5003)) {
                    h2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f18026q0 == null) {
                        this.f18026q0 = e;
                    }
                    h2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.f14098a;
                    Message message2 = b10.f14094a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    h2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.X = this.X.f(e);
                }
            }
        } catch (q2.f e15) {
            u(e15, e15.f53742a);
        } catch (x2.b e16) {
            u(e16, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        r1[] r1VarArr;
        boolean z9;
        b bVar;
        if (this.O && f()) {
            for (r1 r1Var : this.f18005a) {
                int c10 = r1Var.c();
                i iVar = this.D;
                if (r1Var.f()) {
                    int i7 = r1Var.d;
                    int i10 = 1;
                    if (i7 != 4 && i7 != 2) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (i7 != 4) {
                        i10 = 0;
                    }
                    if (z9) {
                        try {
                            bVar = r1Var.f18037a;
                        } catch (RuntimeException e10) {
                            h2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = r1Var.f18039c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, iVar);
                    try {
                        r1Var.i(z9);
                    } catch (RuntimeException e11) {
                        h2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    r1Var.d = i10;
                }
                this.f18020k0 -= c10 - r1Var.c();
            }
            this.f18031t0 = -9223372036854775807L;
        }
    }

    public final void i0(int i7) {
        this.f18015f0 = i7;
        e2.l1 l1Var = this.X.f17915a;
        a1 a1Var = this.H;
        a1Var.f17750g = i7;
        int r10 = a1Var.r(l1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final void j(int i7) {
        boolean z9;
        r1[] r1VarArr = this.f18005a;
        int c10 = r1VarArr[i7].c();
        r1 r1Var = r1VarArr[i7];
        b bVar = r1Var.f18037a;
        i iVar = this.D;
        r1Var.a(bVar, iVar);
        b bVar2 = r1Var.f18039c;
        if (bVar2 != null) {
            if (bVar2.f17765n != 0 && r1Var.d != 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            r1Var.a(bVar2, iVar);
            r1Var.i(false);
            if (z9) {
                b bVar3 = r1Var.f18037a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i7, false);
        this.f18020k0 -= c10;
    }

    public final void j0(boolean z9) {
        if (!z9) {
            q0 q0Var = this.V;
            h2.i0 i0Var = this.f18022n;
            if (q0Var != null && this.U && !i0Var.f14098a.hasMessages(37)) {
                this.W++;
            }
            int i7 = this.W;
            if (i7 > 0) {
                this.N.d(new bg.m0(this, i7, 13));
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
        this.T = z9;
        e();
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.k():void");
    }

    public final void k0(s1 s1Var) {
        this.S = s1Var;
        e();
    }

    public final void l(x0 x0Var, int i7, boolean z9, long j3) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        r1 r1Var = this.f18005a[i7];
        boolean g10 = r1Var.g();
        b bVar = r1Var.f18037a;
        if (!g10) {
            if (x0Var == this.H.f17751i) {
                z10 = true;
            } else {
                z10 = false;
            }
            a3.y yVar = x0Var.f18087o;
            q1 q1Var = yVar.f144b[i7];
            a3.u uVar = yVar.f145c[i7];
            if (s0() && this.X.f17918e == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z9 && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f18020k0++;
            x2.b1 b1Var = x0Var.f18077c[i7];
            long j10 = x0Var.f18088p;
            x2.f0 f0Var = x0Var.f18080g.f18091a;
            b bVar2 = r1Var.f18039c;
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
            int i12 = r1Var.d;
            i iVar = this.D;
            if (i12 != 0 && i12 != 2 && i12 != 4) {
                r1Var.f18041f = true;
                bVar2.getClass();
                if (bVar2.f17765n == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                ia.p(z14);
                bVar2.d = q1Var;
                bVar2.G = f0Var;
                bVar2.f17765n = 1;
                bVar2.o(z12, z10);
                bVar2.y(uVarArr, b1Var, j3, j10, f0Var);
                bVar2.z(j3, z12, true);
                iVar.h(bVar2);
            } else {
                r1Var.f18040e = true;
                if (bVar.f17765n == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ia.p(z13);
                bVar.d = q1Var;
                bVar.G = f0Var;
                bVar.f17765n = 1;
                bVar.o(z12, z10);
                bVar.y(uVarArr, b1Var, j3, j10, f0Var);
                bVar.z(j3, z12, true);
                iVar.h(bVar);
            }
            l0 l0Var = new l0(this);
            b d = r1Var.d(x0Var);
            d.getClass();
            d.c(11, l0Var);
            if (z11 && z10) {
                r1Var.m();
            }
        }
    }

    public final void l0(t1 t1Var) {
        this.R = t1Var;
    }

    public final void m(long j3, boolean[] zArr) {
        r1[] r1VarArr;
        long j10;
        x0 x0Var = this.H.f17752j;
        a3.y yVar = x0Var.f18087o;
        int i7 = 0;
        while (true) {
            r1VarArr = this.f18005a;
            if (i7 >= r1VarArr.length) {
                break;
            }
            if (!yVar.b(i7)) {
                r1VarArr[i7].k();
            }
            i7++;
        }
        int i10 = 0;
        while (i10 < r1VarArr.length) {
            if (!yVar.b(i10) || r1VarArr[i10].d(x0Var) != null) {
                j10 = j3;
            } else {
                j10 = j3;
                l(x0Var, i10, zArr[i10], j10);
            }
            i10++;
            j3 = j10;
        }
    }

    public final void m0(boolean z9) {
        this.f18016g0 = z9;
        e2.l1 l1Var = this.X.f17915a;
        a1 a1Var = this.H;
        a1Var.h = z9;
        int r10 = a1Var.r(l1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final long n(e2.l1 l1Var, Object obj, long j3) {
        e2.i1 i1Var = this.f18035x;
        int i7 = l1Var.g(obj, i1Var).f10287c;
        e2.k1 k1Var = this.f18034w;
        l1Var.n(i7, k1Var);
        if (k1Var.f10333f == -9223372036854775807L || !k1Var.a() || !k1Var.f10335i) {
            return -9223372036854775807L;
        }
        return h2.m0.S(h2.m0.C(k1Var.f10334g) - k1Var.f10333f) - (j3 + i1Var.f10288e);
    }

    public final void n0(x2.g1 g1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        int size = j1Var.f17904b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.i().f(0, size);
        }
        j1Var.f17910j = g1Var;
        w(j1Var.b(), false);
    }

    public final long o(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j3 = x0Var.f18088p;
        if (!x0Var.f18078e) {
            return j3;
        }
        int i7 = 0;
        while (true) {
            r1[] r1VarArr = this.f18005a;
            if (i7 < r1VarArr.length) {
                if (r1VarArr[i7].d(x0Var) != null) {
                    b d = r1VarArr[i7].d(x0Var);
                    Objects.requireNonNull(d);
                    long j10 = d.f17770y;
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

    public final void o0(int i7) {
        k1 k1Var = this.X;
        if (k1Var.f17918e != i7) {
            if (i7 != 2) {
                this.f18028r0 = -9223372036854775807L;
            }
            if (i7 != 3 && k1Var.f17928p) {
                this.X = k1Var.i(false);
            }
            this.X = this.X.h(i7);
        }
    }

    public final Pair p(e2.l1 l1Var) {
        long j3 = 0;
        if (l1Var.p()) {
            return Pair.create(k1.f17914u, 0L);
        }
        int a10 = l1Var.a(this.f18016g0);
        Pair i7 = l1Var.i(this.f18034w, this.f18035x, a10, -9223372036854775807L);
        x2.f0 p10 = this.H.p(l1Var, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (p10.b()) {
            Object obj = p10.f58342a;
            e2.i1 i1Var = this.f18035x;
            l1Var.g(obj, i1Var);
            if (p10.f58344c == i1Var.e(p10.f58343b)) {
                i1Var.f10290g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j3));
    }

    public final void p0(d3.w wVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f18005a) {
            b bVar = r1Var.f18037a;
            if (bVar.f17761b == 2) {
                bVar.c(7, wVar);
                b bVar2 = r1Var.f18039c;
                if (bVar2 != null) {
                    bVar2.c(7, wVar);
                }
            }
        }
    }

    public final long q(long j3) {
        x0 x0Var = this.H.f17754l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.m0 - x0Var.f18088p));
    }

    public final void q0(Object obj, h2.i iVar) {
        r1[] r1VarArr;
        for (r1 r1Var : this.f18005a) {
            b bVar = r1Var.f18037a;
            if (bVar.f17761b == 2) {
                int i7 = r1Var.d;
                if (i7 != 4 && i7 != 1) {
                    bVar.c(1, obj);
                } else {
                    b bVar2 = r1Var.f18039c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                }
            }
        }
        int i10 = this.X.f17918e;
        if (i10 == 3 || i10 == 2) {
            this.f18022n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r(int i7) {
        k1 k1Var = this.X;
        B0(i7, k1Var.f17926n, k1Var.f17925m, k1Var.f17924l);
    }

    public final void r0(float f10) {
        r1[] r1VarArr;
        this.f18033v0 = f10;
        float f11 = f10 * this.P.f10903g;
        for (r1 r1Var : this.f18005a) {
            b bVar = r1Var.f18037a;
            if (bVar.f17761b == 1) {
                bVar.c(2, Float.valueOf(f11));
                b bVar2 = r1Var.f18039c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void s() {
        r0(this.f18033v0);
    }

    public final boolean s0() {
        k1 k1Var = this.X;
        if (k1Var.f17924l && k1Var.f17926n == 0) {
            return true;
        }
        return false;
    }

    public final void t(x2.d0 d0Var) {
        a1 a1Var = this.H;
        x0 x0Var = a1Var.f17754l;
        if (x0Var != null && x0Var.f18075a == d0Var) {
            a1Var.m(this.m0);
            D();
            return;
        }
        x0 x0Var2 = a1Var.f17755m;
        if (x0Var2 != null && x0Var2.f18075a == d0Var) {
            E();
        }
    }

    public final boolean t0(e2.l1 l1Var, x2.f0 f0Var) {
        if (!f0Var.b() && !l1Var.p()) {
            int i7 = l1Var.g(f0Var.f58342a, this.f18035x).f10287c;
            e2.k1 k1Var = this.f18034w;
            l1Var.n(i7, k1Var);
            if (k1Var.a() && k1Var.f10335i && k1Var.f10333f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(IOException iOException, int i7) {
        l lVar = new l(0, iOException, i7);
        x0 x0Var = this.H.f17751i;
        if (x0Var != null) {
            lVar = lVar.a(x0Var.f18080g.f18091a);
        }
        h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.X = this.X.f(lVar);
    }

    public final void u0() {
        x0 x0Var = this.H.f17751i;
        if (x0Var != null) {
            a3.y yVar = x0Var.f18087o;
            int i7 = 0;
            while (true) {
                r1[] r1VarArr = this.f18005a;
                if (i7 < r1VarArr.length) {
                    if (yVar.b(i7)) {
                        r1VarArr[i7].m();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(boolean z9) {
        x2.f0 f0Var;
        long d;
        x0 x0Var = this.H.f17754l;
        if (x0Var == null) {
            f0Var = this.X.f17916b;
        } else {
            f0Var = x0Var.f18080g.f18091a;
        }
        boolean equals = this.X.f17923k.equals(f0Var);
        if (!equals) {
            this.X = this.X.c(f0Var);
        }
        k1 k1Var = this.X;
        if (x0Var == null) {
            d = k1Var.f17931s;
        } else {
            d = x0Var.d();
        }
        k1Var.f17929q = d;
        k1 k1Var2 = this.X;
        k1Var2.f17930r = q(k1Var2.f17929q);
        if ((!equals || z9) && x0Var != null && x0Var.f18078e) {
            y0(x0Var.f18080g.f18091a, x0Var.f18087o);
        }
    }

    public final void v0(boolean z9, boolean z10) {
        boolean z11;
        if (!z9 && this.f18017h0) {
            z11 = false;
        } else {
            z11 = true;
        }
        P(z11, false, true, false);
        this.Y.f(z10 ? 1 : 0);
        h hVar = (h) this.f18014f;
        ConcurrentHashMap concurrentHashMap = hVar.f17840p;
        m2.j jVar = this.L;
        g gVar = (g) concurrentHashMap.get(jVar);
        if (gVar != null) {
            int i7 = gVar.f17819a - 1;
            gVar.f17819a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(jVar);
                hVar.c();
            }
        }
        this.P.d(1, this.X.f17924l);
        o0(1);
    }

    public final void w(e2.l1 r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.w(e2.l1, boolean):void");
    }

    public final void w0() {
        r1[] r1VarArr;
        i iVar = this.D;
        iVar.f17849b = false;
        u1 u1Var = (u1) iVar.f17850c;
        if (u1Var.f18064c) {
            u1Var.c(u1Var.a());
            u1Var.f18064c = false;
        }
        for (r1 r1Var : this.f18005a) {
            b bVar = r1Var.f18039c;
            b bVar2 = r1Var.f18037a;
            if (r1.h(bVar2)) {
                r1.b(bVar2);
            }
            if (bVar != null && bVar.f17765n != 0) {
                r1.b(bVar);
            }
        }
    }

    public final void x(x2.d0 d0Var) {
        x0 x0Var;
        a1 a1Var = this.H;
        x0 x0Var2 = a1Var.f17754l;
        i iVar = this.D;
        if (x0Var2 != null && x0Var2.f18075a == d0Var) {
            x0Var2.getClass();
            if (!x0Var2.f18078e) {
                float f10 = iVar.j().f10643a;
                k1 k1Var = this.X;
                x0Var2.f(f10, k1Var.f17915a, k1Var.f17924l);
            }
            y0(x0Var2.f18080g.f18091a, x0Var2.f18087o);
            if (x0Var2 == a1Var.f17751i) {
                R(x0Var2.f18080g.f18092b, true);
                m(a1Var.f17752j.e(), new boolean[this.f18005a.length]);
                x0Var2.h = true;
                k1 k1Var2 = this.X;
                x2.f0 f0Var = k1Var2.f17916b;
                long j3 = x0Var2.f18080g.f18092b;
                this.X = z(f0Var, j3, k1Var2.f17917c, j3, false, 5);
            }
            D();
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 < a1Var.f17759q.size()) {
                x0Var = (x0) a1Var.f17759q.get(i7);
                if (x0Var.f18075a == d0Var) {
                    break;
                }
                i7++;
            } else {
                x0Var = null;
                break;
            }
        }
        if (x0Var != null) {
            ia.p(true ^ x0Var.f18078e);
            float f11 = iVar.j().f10643a;
            k1 k1Var3 = this.X;
            x0Var.f(f11, k1Var3.f17915a, k1Var3.f17924l);
            x0 x0Var3 = a1Var.f17755m;
            if (x0Var3 != null && x0Var3.f18075a == d0Var) {
                E();
            }
        }
    }

    public final void x0() {
        boolean z9;
        x0 x0Var = this.H.f17754l;
        if (!this.f18013e0 && (x0Var == null || !x0Var.f18075a.g())) {
            z9 = false;
        } else {
            z9 = true;
        }
        k1 k1Var = this.X;
        if (z9 != k1Var.f17920g) {
            this.X = k1Var.b(z9);
        }
    }

    public final void y(e2.w0 w0Var, float f10, boolean z9, boolean z10) {
        int i7;
        if (z9) {
            if (z10) {
                this.Y.f(1);
            }
            this.X = this.X.g(w0Var);
        }
        float f11 = w0Var.f10643a;
        x0 x0Var = this.H.f17751i;
        while (true) {
            i7 = 0;
            if (x0Var == null) {
                break;
            }
            a3.u[] uVarArr = x0Var.f18087o.f145c;
            int length = uVarArr.length;
            while (i7 < length) {
                a3.u uVar = uVarArr[i7];
                if (uVar != null) {
                    uVar.q(f11);
                }
                i7++;
            }
            x0Var = x0Var.f18085m;
        }
        r1[] r1VarArr = this.f18005a;
        int length2 = r1VarArr.length;
        while (i7 < length2) {
            r1 r1Var = r1VarArr[i7];
            float f12 = w0Var.f10643a;
            r1Var.f18037a.A(f10, f12);
            b bVar = r1Var.f18039c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i7++;
        }
    }

    public final void y0(x2.f0 r10, a3.y r11) {
        throw new UnsupportedOperationException("Method not decompiled: l2.r0.y0(x2.f0, a3.y):void");
    }

    public final k1 z(x2.f0 f0Var, long j3, long j10, long j11, boolean z9, int i7) {
        boolean z10;
        boolean z11;
        h9.t1 t1Var;
        boolean z12;
        boolean z13;
        if (!this.f18025p0 && j3 == this.X.f17931s && f0Var.equals(this.X.f17916b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f18025p0 = z10;
        Q();
        k1 k1Var = this.X;
        x2.p1 p1Var = k1Var.h;
        a3.y yVar = k1Var.f17921i;
        List list = k1Var.f17922j;
        if (this.I.f17911k) {
            x0 x0Var = this.H.f17751i;
            if (x0Var == null) {
                p1Var = x2.p1.d;
            } else {
                p1Var = x0Var.f18086n;
            }
            if (x0Var == null) {
                yVar = this.f18012e;
            } else {
                yVar = x0Var.f18087o;
            }
            a3.u[] uVarArr = yVar.f145c;
            ?? b0Var = new h9.b0(4);
            boolean z14 = false;
            for (a3.u uVar : uVarArr) {
                if (uVar != null) {
                    e2.q0 q0Var = uVar.g(0).f10613l;
                    if (q0Var == null) {
                        b0Var.c(new e2.q0(new e2.p0[0]));
                    } else {
                        b0Var.c(q0Var);
                        z14 = true;
                    }
                }
            }
            if (z14) {
                t1Var = b0Var.f();
            } else {
                h9.g0 g0Var = h9.i0.f14331b;
                t1Var = h9.t1.f14399e;
            }
            list = t1Var;
            if (x0Var != null) {
                y0 y0Var = x0Var.f18080g;
                if (y0Var.d != j10) {
                    x0Var.f18080g = y0Var.a(j10);
                }
            }
            r1[] r1VarArr = this.f18005a;
            a1 a1Var = this.H;
            x0 x0Var2 = a1Var.f17751i;
            if (x0Var2 == a1Var.f17752j && x0Var2 != null) {
                a3.y yVar2 = x0Var2.f18087o;
                int i10 = 0;
                boolean z15 = false;
                while (true) {
                    if (i10 < r1VarArr.length) {
                        if (yVar2.b(i10)) {
                            if (r1VarArr[i10].f18037a.f17761b != 1) {
                                z12 = false;
                                break;
                            } else if (yVar2.f144b[i10].f18001a != 0) {
                                z15 = true;
                            }
                        }
                        i10++;
                    } else {
                        z12 = true;
                        break;
                    }
                }
                if (z15 && z12) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 != this.f18019j0) {
                    this.f18019j0 = z13;
                    if (!z13 && this.X.f17928p) {
                        this.f18022n.f(2);
                    }
                }
            }
        } else if (!f0Var.equals(k1Var.f17916b)) {
            p1Var = x2.p1.d;
            yVar = this.f18012e;
            list = h9.t1.f14399e;
        }
        x2.p1 p1Var2 = p1Var;
        a3.y yVar3 = yVar;
        List list2 = list;
        if (z9) {
            o0 o0Var = this.Y;
            if (o0Var.d && o0Var.f17978e != 5) {
                if (i7 == 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ia.f(z11);
            } else {
                o0Var.f17977c = true;
                o0Var.d = true;
                o0Var.f17978e = i7;
            }
        }
        k1 k1Var2 = this.X;
        return k1Var2.d(f0Var, j3, j10, j11, q(k1Var2.f17929q), p1Var2, yVar3, list2);
    }

    public final void z0(List list, int i7, int i10) {
        boolean z9;
        boolean z10 = true;
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        ArrayList arrayList = j1Var.f17904b;
        if (i7 >= 0 && i7 <= i10 && i10 <= arrayList.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (list.size() != i10 - i7) {
            z10 = false;
        }
        ia.f(z10);
        for (int i11 = i7; i11 < i10; i11++) {
            ((i1) arrayList.get(i11)).f17894a.t((e2.l0) list.get(i11 - i7));
        }
        w(j1Var.b(), false);
    }
}
