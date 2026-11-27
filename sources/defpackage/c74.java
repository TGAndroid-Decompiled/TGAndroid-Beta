package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
public final class c74 implements Handler.Callback, wt6, sec {
    public static final long x0 = gcc.i0(10000);
    public final ArrayList E;
    public final vgb F;
    public final j64 G;
    public final au6 H;
    public final i07 I;
    public final cc3 J;
    public final short K;
    public final ig8 L;
    public final boolean M;
    public final ea3 N;
    public final xgb O;
    public final boolean P;
    public final d00 Q;
    public boolean R;
    public az9 S;
    public fv9 T;
    public boolean U;
    public boolean V;
    public b74 W;
    public int X;
    public nf8 Y;
    public z64 Z;
    public final ra9[] a;
    public boolean a0;
    public final vg0[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final ld3 d;
    public boolean d0;
    public final d2c e;
    public long e0;
    public final ec3 f;
    public boolean f0;
    public int g0;
    public final xgb h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public b74 m0;
    public final ykf n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final Looper r;
    public e64 r0;
    public final zrb s;
    public long s0;
    public g64 t0;
    public long u0;
    public boolean v0;
    public final xrb w;
    public float w0;
    public final long x;
    public final fc3 y;

    public c74(Context context, vg0[] vg0VarArr, vg0[] vg0VarArr2, ld3 ld3Var, d2c d2cVar, ec3 ec3Var, la3 la3Var, int i, boolean z, ea3 ea3Var, az9 az9Var, cc3 cc3Var, long j, boolean z2, Looper looper, vgb vgbVar, j64 j64Var, ig8 ig8Var, final sec secVar, boolean z3) {
        g64 g64Var = g64.a;
        this.u0 = -9223372036854775807L;
        this.G = j64Var;
        this.d = ld3Var;
        this.e = d2cVar;
        this.f = ec3Var;
        this.g0 = i;
        this.h0 = z;
        this.S = az9Var;
        this.J = cc3Var;
        this.K = (int) j;
        this.b0 = false;
        this.M = z2;
        this.F = vgbVar;
        this.L = ig8Var;
        this.t0 = g64Var;
        this.N = ea3Var;
        this.w0 = 1.0f;
        this.T = fv9.b;
        this.R = z3;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.x = ec3Var.m;
        wrb wrbVar = asb.a;
        nf8 k = nf8.k(d2cVar);
        this.Y = k;
        this.Z = new z64(k);
        this.b = new vg0[vg0VarArr.length];
        this.c = new boolean[vg0VarArr.length];
        ld3Var.getClass();
        this.a = new ra9[vg0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < vg0VarArr.length; i2++) {
            vg0 vg0Var = vg0VarArr[i2];
            vg0Var.e = i2;
            vg0Var.f = ig8Var;
            vg0Var.h = vgbVar;
            this.b[i2] = vg0Var;
            vg0 vg0Var2 = this.b[i2];
            synchronized (vg0Var2.a) {
                vg0Var2.J = ld3Var;
            }
            vg0 vg0Var3 = vg0VarArr2[i2];
            if (vg0Var3 != null) {
                vg0Var3.e = i2;
                vg0Var3.f = ig8Var;
                vg0Var3.h = vgbVar;
                z4 = true;
            }
            this.a[i2] = new ra9(vg0VarArr[i2], vg0Var3, i2);
        }
        this.P = z4;
        this.y = new fc3(this, vgbVar);
        this.E = new ArrayList();
        this.s = new zrb();
        this.w = new xrb();
        yve.p(ld3Var.a == null);
        ld3Var.a = this;
        ld3Var.b = la3Var;
        ld3Var.g = ld3Var.f;
        this.q0 = true;
        xgb a = vgbVar.a(looper, null);
        this.O = a;
        this.H = new au6(ea3Var, a, new lu3(this, (byte) 14), vg0VarArr.length);
        this.I = new i07(this, ea3Var, a, ig8Var, la3Var);
        ykf ykfVar = new ykf((byte) 2);
        this.n = ykfVar;
        Looper p = ykfVar.p();
        this.r = p;
        xgb a2 = vgbVar.a(p, this);
        this.h = a2;
        this.Q = new d00(context, p, this);
        a2.c(35, new sec() {
            @Override
            public final void b(long j2, long j3, ko4 ko4Var, MediaFormat mediaFormat) {
                secVar.b(j2, j3, ko4Var, mediaFormat);
                c74.this.b(j2, j3, ko4Var, mediaFormat);
            }
        }).b();
        a2.c(39, new v64(this)).b();
    }

    public static Pair S(asb asbVar, b74 b74Var, boolean z, int i, boolean z2, zrb zrbVar, xrb xrbVar) {
        asb asbVar2;
        int T;
        asb asbVar3 = b74Var.a;
        if (!asbVar.p()) {
            if (asbVar3.p()) {
                asbVar2 = asbVar;
            } else {
                asbVar2 = asbVar3;
            }
            try {
                Pair i2 = asbVar2.i(zrbVar, xrbVar, b74Var.b, b74Var.c);
                if (!asbVar.equals(asbVar2)) {
                    if (asbVar.b(i2.first) != -1) {
                        if (asbVar2.g(i2.first, xrbVar).f && asbVar2.m(xrbVar.c, zrbVar, 0L).m == asbVar2.b(i2.first)) {
                            return asbVar.i(zrbVar, xrbVar, asbVar.g(i2.first, xrbVar).c, b74Var.c);
                        }
                    } else if (z && (T = T(zrbVar, xrbVar, i, z2, i2.first, asbVar2, asbVar)) != -1) {
                        return asbVar.i(zrbVar, xrbVar, T, -9223372036854775807L);
                    } else {
                        return null;
                    }
                }
                return i2;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static int T(zrb zrbVar, xrb xrbVar, int i, boolean z, Object obj, asb asbVar, asb asbVar2) {
        zrb zrbVar2 = zrbVar;
        asb asbVar3 = asbVar;
        Object obj2 = asbVar3.m(asbVar3.g(obj, xrbVar).c, zrbVar, 0L).a;
        for (int i2 = 0; i2 < asbVar2.o(); i2++) {
            if (asbVar2.m(i2, zrbVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = asbVar3.b(obj);
        int h = asbVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            asb asbVar4 = asbVar3;
            int d = asbVar4.d(b, xrbVar, zrbVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = asbVar2.b(asbVar4.l(d));
            i4++;
            asbVar3 = asbVar4;
            b = d;
            zrbVar2 = zrbVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return asbVar2.f(i3, xrbVar, false).c;
    }

    public static boolean y(yt6 yt6Var) {
        at9[] at9VarArr;
        long h;
        if (yt6Var != null) {
            try {
                jl6 jl6Var = yt6Var.a;
                if (!yt6Var.e) {
                    jl6Var.l();
                } else {
                    for (at9 at9Var : yt6Var.c) {
                        if (at9Var != null) {
                            at9Var.g();
                        }
                    }
                }
                if (!yt6Var.e) {
                    h = 0;
                } else {
                    h = jl6Var.h();
                }
                if (h != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, vz6 vz6Var) {
        au6 au6Var = this.H;
        yt6 yt6Var = au6Var.k[i];
        if (yt6Var != null && yt6Var.g.a.equals(vz6Var)) {
            return this.a[i].h(au6Var.k[i]);
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2;
        e74[] e74VarArr;
        if (z && i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.U;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            if (z3) {
                i2 = 4;
            } else {
                i2 = 0;
            }
        }
        nf8 nf8Var = this.Y;
        if (nf8Var.l != z2 || nf8Var.n != i2 || nf8Var.m != i3) {
            this.Y = nf8Var.e(i3, i2, z2);
            D0(false, false);
            au6 au6Var = this.H;
            for (yt6 yt6Var = au6Var.i; yt6Var != null; yt6Var = yt6Var.m) {
                for (e74 e74Var : (e74[]) yt6Var.o.d) {
                    if (e74Var != null) {
                        e74Var.h(z2);
                    }
                }
            }
            if (!s0()) {
                w0();
                B0();
                nf8 nf8Var2 = this.Y;
                if (nf8Var2.p) {
                    this.Y = nf8Var2.i(false);
                }
                au6Var.r(this.n0);
                return;
            }
            int i4 = this.Y.e;
            xgb xgbVar = this.h;
            if (i4 == 3) {
                fc3 fc3Var = this.y;
                fc3Var.b = true;
                ((ze2) fc3Var.c).b();
                u0();
                xgbVar.h(2);
            } else if (i4 == 2) {
                xgbVar.h(2);
            }
        }
    }

    public final boolean B() {
        yt6 yt6Var = this.H.i;
        long j = yt6Var.g.e;
        if (yt6Var.e) {
            if (j == -9223372036854775807L || this.Y.s < j || !s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        long j;
        long j2;
        long max;
        long j3;
        float f;
        long j4;
        yt6 yt6Var = this.H.i;
        if (yt6Var != null) {
            if (yt6Var.e) {
                j = yt6Var.a.p();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                if (!yt6Var.g()) {
                    this.H.s(yt6Var);
                    g();
                    t(false);
                    C();
                }
                Q(j, true);
                if (j != this.Y.s) {
                    nf8 nf8Var = this.Y;
                    this.Y = x(nf8Var.b, j, nf8Var.c, j, true, 5);
                }
            } else {
                fc3 fc3Var = this.y;
                boolean z = z();
                ze2 ze2Var = (ze2) fc3Var.c;
                vg0 vg0Var = (vg0) fc3Var.e;
                if (vg0Var != null && !vg0Var.n() && ((!z || ((vg0) fc3Var.e).n == 2) && (((vg0) fc3Var.e).o() || (!z && !((vg0) fc3Var.e).m())))) {
                    hm6 hm6Var = (hm6) fc3Var.f;
                    hm6Var.getClass();
                    long g = hm6Var.g();
                    if (fc3Var.a) {
                        if (g < ze2Var.g()) {
                            if (ze2Var.c) {
                                ze2Var.a(ze2Var.g());
                                ze2Var.c = false;
                            }
                        } else {
                            fc3Var.a = false;
                            if (fc3Var.b) {
                                ze2Var.b();
                            }
                        }
                    }
                    ze2Var.a(g);
                    of8 f2 = hm6Var.f();
                    if (!f2.equals((of8) ze2Var.e)) {
                        ze2Var.c(f2);
                        ((c74) fc3Var.d).h.c(16, f2).b();
                    }
                } else {
                    fc3Var.a = true;
                    if (fc3Var.b) {
                        ze2Var.b();
                    }
                }
                long g2 = fc3Var.g();
                this.n0 = g2;
                long j5 = g2 - yt6Var.p;
                long j6 = this.Y.s;
                if (!this.E.isEmpty() && !this.Y.b.c()) {
                    if (this.q0) {
                        this.q0 = false;
                    }
                    nf8 nf8Var2 = this.Y;
                    nf8Var2.a.b(nf8Var2.b.a);
                    int min = Math.min(this.p0, this.E.size());
                    if (min > 0 && this.E.get(min - 1) != null) {
                        grb.o();
                        return;
                    } else if (min < this.E.size() && this.E.get(min) != null) {
                        grb.o();
                        return;
                    } else {
                        this.p0 = min;
                    }
                }
                if (this.y.h()) {
                    boolean z2 = !this.Z.d;
                    nf8 nf8Var3 = this.Y;
                    this.Y = x(nf8Var3.b, j5, nf8Var3.c, j5, z2, 6);
                } else {
                    nf8 nf8Var4 = this.Y;
                    nf8Var4.s = j5;
                    nf8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.q = this.H.l.d();
            nf8 nf8Var5 = this.Y;
            nf8Var5.r = o(nf8Var5.q);
            nf8 nf8Var6 = this.Y;
            if (nf8Var6.l && nf8Var6.e == 3 && t0(nf8Var6.a, nf8Var6.b)) {
                nf8 nf8Var7 = this.Y;
                float f3 = 1.0f;
                if (nf8Var7.o.a == 1.0f) {
                    cc3 cc3Var = this.J;
                    long l = l(nf8Var7.a, nf8Var7.b.a, nf8Var7.s);
                    long j7 = this.Y.r;
                    if (cc3Var.c != -9223372036854775807L) {
                        long j8 = l - j7;
                        if (cc3Var.m == -9223372036854775807L) {
                            cc3Var.m = j8;
                            cc3Var.n = 0L;
                        } else {
                            cc3Var.m = Math.max(j8, (((float) j8) * 9.999871E-4f) + (((float) j2) * 0.999f));
                            cc3Var.n = (9.999871E-4f * ((float) Math.abs(j8 - max))) + (((float) cc3Var.n) * 0.999f);
                        }
                        if (cc3Var.l != -9223372036854775807L) {
                            j3 = 1000;
                            if (SystemClock.elapsedRealtime() - cc3Var.l < 1000) {
                                f3 = cc3Var.k;
                            }
                        } else {
                            j3 = 1000;
                        }
                        cc3Var.l = SystemClock.elapsedRealtime();
                        long j9 = (cc3Var.n * 3) + cc3Var.m;
                        if (cc3Var.h > j9) {
                            float T = (float) gcc.T(j3);
                            f = 1.0E-7f;
                            long[] jArr = {j9, cc3Var.e, cc3Var.h - (((cc3Var.k - 1.0f) * T) + ((cc3Var.i - 1.0f) * T))};
                            j4 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j4) {
                                    j4 = j10;
                                }
                            }
                            cc3Var.h = j4;
                        } else {
                            f = 1.0E-7f;
                            j4 = gcc.j(l - (Math.max(0.0f, cc3Var.k - 1.0f) / 1.0E-7f), cc3Var.h, j9);
                            cc3Var.h = j4;
                            long j11 = cc3Var.g;
                            if (j11 != -9223372036854775807L && j4 > j11) {
                                cc3Var.h = j11;
                                j4 = j11;
                            }
                        }
                        long j12 = l - j4;
                        if (Math.abs(j12) < cc3Var.a) {
                            cc3Var.k = 1.0f;
                        } else {
                            f3 = gcc.h((f * ((float) j12)) + 1.0f, cc3Var.j, cc3Var.i);
                            cc3Var.k = f3;
                        }
                    }
                    if (this.y.f().a != f3) {
                        of8 of8Var = new of8(f3, this.Y.o.b);
                        this.h.g(16);
                        this.y.c(of8Var);
                        w(this.Y.o, this.y.f().a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        long h;
        long j;
        boolean c;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!y(this.H.l)) {
            c = false;
        } else {
            yt6 yt6Var = this.H.l;
            if (!yt6Var.e) {
                h = 0;
            } else {
                h = yt6Var.a.h();
            }
            long o = o(h);
            yt6 yt6Var2 = this.H.i;
            if (t0(this.Y.a, yt6Var.g.a)) {
                j = this.J.h;
            } else {
                j = -9223372036854775807L;
            }
            ig8 ig8Var = this.L;
            asb asbVar = this.Y.a;
            vz6 vz6Var = yt6Var.g.a;
            float f = this.y.f().a;
            boolean z4 = this.Y.l;
            fa6 fa6Var = new fa6(ig8Var, asbVar, vz6Var, o, f, this.d0, j);
            c = this.f.c(fa6Var);
            yt6 yt6Var3 = this.H.i;
            if (!c && yt6Var3.e && o < 500000 && this.x > 0) {
                yt6Var3.a.n(this.Y.s);
                c = this.f.c(fa6Var);
            }
        }
        this.f0 = c;
        if (c) {
            yt6 yt6Var4 = this.H.l;
            yt6Var4.getClass();
            wa6 wa6Var = new wa6();
            wa6Var.a = this.n0 - yt6Var4.p;
            float f2 = this.y.f().a;
            if (f2 <= 0.0f && f2 != -3.4028235E38f) {
                z = false;
            } else {
                z = true;
            }
            yve.f(z);
            wa6Var.b = f2;
            long j2 = this.e0;
            if (j2 < 0 && j2 != -9223372036854775807L) {
                z2 = false;
            } else {
                z2 = true;
            }
            yve.f(z2);
            wa6Var.c = j2;
            xa6 xa6Var = new xa6(wa6Var);
            if (yt6Var4.m == null) {
                z3 = true;
            }
            yve.p(z3);
            yt6Var4.a.s(xa6Var);
        }
        x0();
    }

    public final void C0(asb asbVar, vz6 vz6Var, asb asbVar2, vz6 vz6Var2, long j, boolean z) {
        Object obj;
        of8 of8Var;
        boolean t0 = t0(asbVar, vz6Var);
        Object obj2 = vz6Var.a;
        if (!t0) {
            if (vz6Var.c()) {
                of8Var = of8.d;
            } else {
                of8Var = this.Y.o;
            }
            fc3 fc3Var = this.y;
            if (!fc3Var.f().equals(of8Var)) {
                this.h.g(16);
                fc3Var.c(of8Var);
                w(this.Y.o, of8Var.a, false, false);
                return;
            }
            return;
        }
        xrb xrbVar = this.w;
        int i = asbVar.g(obj2, xrbVar).c;
        zrb zrbVar = this.s;
        asbVar.n(i, zrbVar);
        at6 at6Var = zrbVar.i;
        String str = gcc.a;
        cc3 cc3Var = this.J;
        cc3Var.getClass();
        cc3Var.c = gcc.T(at6Var.a);
        cc3Var.f = gcc.T(at6Var.b);
        cc3Var.g = gcc.T(at6Var.c);
        float f = at6Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cc3Var.j = f;
        float f2 = at6Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cc3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cc3Var.c = -9223372036854775807L;
        }
        cc3Var.a();
        if (j != -9223372036854775807L) {
            cc3Var.d = l(asbVar, obj2, j);
            cc3Var.a();
            return;
        }
        Object obj3 = zrbVar.a;
        if (!asbVar2.p()) {
            obj = asbVar2.m(asbVar2.g(vz6Var2.a, xrbVar).c, zrbVar, 0L).a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj3) && !z) {
            return;
        }
        cc3Var.d = -9223372036854775807L;
        cc3Var.a();
    }

    public final void D() {
        boolean z;
        boolean z2;
        au6 au6Var = this.H;
        au6Var.p();
        yt6 yt6Var = au6Var.m;
        if (yt6Var != null) {
            jl6 jl6Var = yt6Var.a;
            if ((!yt6Var.d || yt6Var.e) && !jl6Var.e()) {
                asb asbVar = this.Y.a;
                if (yt6Var.e) {
                    jl6Var.t();
                }
                for (dc3 dc3Var : this.f.o.values()) {
                    if (dc3Var.b) {
                        return;
                    }
                }
                boolean z3 = true;
                if (!yt6Var.d) {
                    long j = yt6Var.g.b;
                    yt6Var.d = true;
                    jl6Var.q(this, j);
                    return;
                }
                wa6 wa6Var = new wa6();
                wa6Var.a = this.n0 - yt6Var.p;
                float f = this.y.f().a;
                if (f <= 0.0f && f != -3.4028235E38f) {
                    z = false;
                } else {
                    z = true;
                }
                yve.f(z);
                wa6Var.b = f;
                long j2 = this.e0;
                if (j2 < 0 && j2 != -9223372036854775807L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                yve.f(z2);
                wa6Var.c = j2;
                xa6 xa6Var = new xa6(wa6Var);
                if (yt6Var.m != null) {
                    z3 = false;
                }
                yve.p(z3);
                jl6Var.s(xa6Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long j;
        this.d0 = z;
        if (z && !z2) {
            this.F.getClass();
            j = SystemClock.elapsedRealtime();
        } else {
            j = -9223372036854775807L;
        }
        this.e0 = j;
    }

    public final void E(int i) {
        boolean z;
        boolean z2;
        z64 z64Var = this.Z;
        nf8 nf8Var = this.Y;
        boolean z3 = z64Var.a;
        if (z64Var.b != nf8Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z3 | z;
        z64Var.a = z4;
        z64Var.b = nf8Var;
        if (z4) {
            if (!nf8Var.a.p()) {
                nf8 nf8Var2 = this.Y;
                if (nf8Var2.a.b(nf8Var2.b.a) != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Locale locale = Locale.US;
                nf8 nf8Var3 = this.Y;
                yve.o(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", nf8Var3.b.a, nf8Var3.a.getClass().getName(), Integer.valueOf(this.Y.a.o()), Integer.valueOf(i)), z2);
            }
            z64 z64Var2 = this.Z;
            s64 s64Var = this.G.b;
            s64Var.j.e(new vx3(s64Var, z64Var2, (byte) 9));
            this.Z = new z64(this.Y);
        }
    }

    public final void F(int i) {
        ra9 ra9Var = this.a[i];
        try {
            yt6 yt6Var = this.H.i;
            yt6Var.getClass();
            vg0 d = ra9Var.d(yt6Var);
            d.getClass();
            at9 at9Var = d.r;
            at9Var.getClass();
            at9Var.g();
        } catch (IOException | RuntimeException e) {
            byte b = ra9Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            d2c d2cVar = this.H.i.o;
            efd.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(ko4.c(((e74[]) d2cVar.d)[i].n())), e);
            d2c d2cVar2 = new d2c((qa9[]) ((qa9[]) d2cVar.c).clone(), (e74[]) ((e74[]) d2cVar.d).clone(), (f2c) d2cVar.e, (lo) d2cVar.f);
            ((qa9[]) d2cVar2.c)[i] = null;
            ((e74[]) d2cVar2.d)[i] = null;
            h(i);
            yt6 yt6Var2 = this.H.i;
            yt6Var2.a(d2cVar2, this.Y.s, false, new boolean[yt6Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.O.e(new t64(this, i, z, (byte) 0));
        }
    }

    public final void H() {
        u(this.I.b(), true);
    }

    public final void I(y64 y64Var) {
        boolean z;
        asb b;
        this.Z.a(1);
        int i = y64Var.a;
        int i2 = y64Var.b;
        int i3 = y64Var.c;
        pka pkaVar = y64Var.d;
        i07 i07Var = this.I;
        ArrayList arrayList = i07Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        i07Var.k = pkaVar;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((h07) arrayList.get(min)).d;
            gcc.S(i, i2, i3, arrayList);
            while (min <= max) {
                h07 h07Var = (h07) arrayList.get(min);
                h07Var.d = i4;
                i4 += h07Var.a.o.e.o();
                min++;
            }
            b = i07Var.b();
        } else {
            b = i07Var.b();
        }
        u(b, false);
    }

    public final void J() {
        boolean z;
        int i;
        int i2;
        this.Z.a(1);
        O(false, false, false, true);
        ec3 ec3Var = this.f;
        ConcurrentHashMap concurrentHashMap = ec3Var.o;
        long id = Thread.currentThread().getId();
        long j = ec3Var.p;
        if (j != -1 && j != id) {
            z = false;
        } else {
            z = true;
        }
        yve.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", z);
        ec3Var.p = id;
        ig8 ig8Var = this.L;
        dc3 dc3Var = (dc3) concurrentHashMap.get(ig8Var);
        if (dc3Var == null) {
            ?? obj = new Object();
            obj.a = 1;
            concurrentHashMap.put(ig8Var, obj);
        } else {
            dc3Var.a++;
        }
        dc3 dc3Var2 = (dc3) concurrentHashMap.get(ig8Var);
        dc3Var2.getClass();
        Integer num = (Integer) ec3Var.n.get(ig8Var.a);
        if (num != null && num.intValue() != -1) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (i == -1) {
            i = 13107200;
        }
        dc3Var2.c = i;
        dc3Var2.b = false;
        if (this.Y.a.p()) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        o0(i2);
        nf8 nf8Var = this.Y;
        boolean z2 = nf8Var.l;
        A0(this.Q.c(nf8Var.e, z2), nf8Var.n, nf8Var.m, z2);
        i07 i07Var = this.I;
        ArrayList arrayList = i07Var.c;
        yve.p(!i07Var.l);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            h07 h07Var = (h07) arrayList.get(i3);
            i07Var.e(h07Var);
            i07Var.h.add(h07Var);
        }
        i07Var.l = true;
        this.h.h(2);
    }

    public final void K(or2 or2Var) {
        moa moaVar;
        try {
            O(true, false, true, false);
            L();
            ec3 ec3Var = this.f;
            ig8 ig8Var = this.L;
            ConcurrentHashMap concurrentHashMap = ec3Var.o;
            dc3 dc3Var = (dc3) concurrentHashMap.get(ig8Var);
            if (dc3Var != null) {
                int i = dc3Var.a - 1;
                dc3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(ig8Var);
                    ec3Var.d();
                }
            }
            if (ec3Var.o.isEmpty()) {
                ec3Var.p = -1L;
            }
            d00 d00Var = this.Q;
            d00Var.c = null;
            d00Var.a();
            d00Var.b(0);
            ld3 ld3Var = this.d;
            if (ld3Var.h != null) {
                yve.o("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(ld3Var.h));
            }
            if (Build.VERSION.SDK_INT >= 32 && (moaVar = ld3Var.i) != null) {
                moaVar.e();
                ld3Var.i = null;
            }
            ld3Var.a = null;
            ld3Var.b = null;
            o0(1);
        } finally {
            this.h.f();
            this.n.r();
            or2Var.e();
        }
    }

    public final void L() {
        boolean z;
        for (int i = 0; i < this.a.length; i++) {
            vg0 vg0Var = this.b[i];
            synchronized (vg0Var.a) {
                vg0Var.J = null;
            }
            ra9 ra9Var = this.a[i];
            vg0 vg0Var2 = ra9Var.a;
            boolean z2 = true;
            if (vg0Var2.n == 0) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            vg0Var2.t();
            ra9Var.e = false;
            vg0 vg0Var3 = ra9Var.c;
            if (vg0Var3 != null) {
                if (vg0Var3.n != 0) {
                    z2 = false;
                }
                yve.p(z2);
                vg0Var3.t();
                ra9Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, pka pkaVar) {
        boolean z = true;
        this.Z.a(1);
        i07 i07Var = this.I;
        i07Var.getClass();
        if (i < 0 || i > i2 || i2 > i07Var.c.size()) {
            z = false;
        }
        yve.f(z);
        i07Var.k = pkaVar;
        i07Var.f(i, i2);
        u(i07Var.b(), false);
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.N():void");
    }

    public final void O(boolean r36, boolean r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.O(boolean, boolean, boolean, boolean):void");
    }

    public final void P() {
        boolean z;
        yt6 yt6Var = this.H.i;
        if (yt6Var != null && yt6Var.g.h && this.b0) {
            z = true;
        } else {
            z = false;
        }
        this.c0 = z;
    }

    public final void Q(long j, boolean z) {
        au6 au6Var;
        long j2;
        ra9[] ra9VarArr;
        e74[] e74VarArr;
        yt6 yt6Var = this.H.i;
        if (yt6Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = yt6Var.p;
        }
        long j3 = j + j2;
        this.n0 = j3;
        ((ze2) this.y.c).a(j3);
        for (ra9 ra9Var : this.a) {
            long j4 = this.n0;
            vg0 d = ra9Var.d(yt6Var);
            if (d != null) {
                d.D(j4, false, z);
            }
        }
        for (yt6 yt6Var2 = au6Var.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            for (e74 e74Var : (e74[]) yt6Var2.o.d) {
                if (e74Var != null) {
                    e74Var.s();
                }
            }
        }
    }

    public final void R(asb asbVar, asb asbVar2) {
        if (asbVar.p() && asbVar2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            bs2.u(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        ra9[] ra9VarArr;
        yt6 yt6Var;
        long j2;
        boolean z = this.M;
        long j3 = 1000;
        long j4 = x0;
        if (!z) {
            if (this.U) {
                this.T.getClass();
            } else {
                if (this.Y.e != 3 || s0()) {
                    j3 = j4;
                }
                this.h.a.sendEmptyMessageAtTime(2, j + j3);
            }
        }
        if (this.Y.e != 3) {
            j3 = j4;
        }
        for (ra9 ra9Var : this.a) {
            long j5 = this.n0;
            long j6 = this.o0;
            vg0 vg0Var = ra9Var.c;
            vg0 vg0Var2 = ra9Var.a;
            if (ra9.k(vg0Var2)) {
                j2 = vg0Var2.j(j5, j6);
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (vg0Var != null && vg0Var.n != 0) {
                j2 = Math.min(j2, vg0Var.j(j5, j6));
            }
            j3 = Math.min(j3, gcc.i0(j2));
        }
        if (this.Y.m()) {
            yt6 yt6Var2 = this.H.i;
            if (yt6Var2 != null) {
                yt6Var = yt6Var2.m;
            } else {
                yt6Var = null;
            }
            if (yt6Var != null) {
                if ((((float) gcc.T(j3)) * this.Y.o.a) + ((float) this.n0) >= ((float) yt6Var.e())) {
                    j3 = Math.min(j3, j4);
                }
            }
        }
        this.h.a.sendEmptyMessageAtTime(2, j + j3);
    }

    public final void V(boolean z) {
        vz6 vz6Var = this.H.i.g.a;
        long X = X(vz6Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            nf8 nf8Var = this.Y;
            this.Y = x(vz6Var, X, nf8Var.c, nf8Var.d, z, 5);
        }
    }

    public final void W(defpackage.b74 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.W(b74):void");
    }

    public final long X(vz6 vz6Var, long j, boolean z, boolean z2) {
        au6 au6Var;
        ra9[] ra9VarArr;
        boolean z3;
        ra9[] ra9VarArr2;
        byte b;
        w0();
        boolean z4 = true;
        D0(false, true);
        if (z2 || this.Y.e == 3) {
            o0(2);
        }
        yt6 yt6Var = this.H.i;
        yt6 yt6Var2 = yt6Var;
        while (yt6Var2 != null && !vz6Var.equals(yt6Var2.g.a)) {
            yt6Var2 = yt6Var2.m;
        }
        if (z || yt6Var != yt6Var2 || (yt6Var2 != null && yt6Var2.p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.u0 = -9223372036854775807L;
            if (yt6Var2 != null) {
                while (true) {
                    au6Var = this.H;
                    if (au6Var.i == yt6Var2) {
                        break;
                    }
                    au6Var.a();
                }
                au6Var.s(yt6Var2);
                yt6Var2.p = 1000000000000L;
                yve.p(!z());
                k(this.H.d().e(), new boolean[this.a.length]);
                a0(yt6Var2);
            }
        }
        g();
        if (this.U) {
            for (ra9 ra9Var : this.a) {
                if (ra9Var.j() && ((b = ra9Var.a.b) == 2 || b == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        au6 au6Var2 = this.H;
        if (yt6Var2 != null) {
            au6Var2.s(yt6Var2);
            if (!yt6Var2.e) {
                yt6Var2.g = yt6Var2.g.b(j, -9223372036854775807L);
            } else if (yt6Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && yt6Var2.g.a.equals(this.Y.b)) {
                        long j2 = yt6Var2.p + j;
                        boolean z5 = true;
                        for (ra9 ra9Var2 : this.a) {
                            if (ra9Var2.j()) {
                                vg0 d = ra9Var2.d(yt6Var2);
                                if (d != null && d.I(j2)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z5 &= z3;
                            }
                        }
                        if (z5) {
                            jl6 jl6Var = yt6Var2.a;
                            long j3 = this.Y.s;
                            az9 az9Var = az9.e;
                            if (jl6Var.j(j3, az9Var) == yt6Var2.a.j(j, az9Var)) {
                                z4 = false;
                            }
                        }
                    }
                }
                j = yt6Var2.a.m(j);
                yt6Var2.a.n(j - this.x);
            }
            Q(j, z4);
            C();
        } else {
            au6Var2.b();
            Q(j, true);
        }
        t(false);
        this.h.h(2);
        return j;
    }

    public final void Y(mg8 mg8Var) {
        mg8Var.getClass();
        xgb xgbVar = this.h;
        if (mg8Var.e == this.r) {
            synchronized (mg8Var) {
            }
            try {
                mg8Var.a.d(mg8Var.c, mg8Var.d);
                mg8Var.a(true);
                int i = this.Y.e;
                if (i != 3 && i != 2) {
                    return;
                }
                xgbVar.h(2);
                return;
            } catch (Throwable th) {
                mg8Var.a(true);
                throw th;
            }
        }
        xgbVar.c(15, mg8Var).b();
    }

    public final void Z(mg8 mg8Var) {
        Looper looper = mg8Var.e;
        if (!looper.getThread().isAlive()) {
            efd.f("TAG", "Trying to send message on a dead thread.");
            mg8Var.a(false);
            return;
        }
        this.F.a(looper, null).e(new lw3(this, mg8Var));
    }

    @Override
    public final void a(xt6 xt6Var) {
        this.h.c(8, xt6Var).b();
    }

    public final void a0(yt6 yt6Var) {
        for (int i = 0; i < this.a.length; i++) {
            yt6Var.h[i] = true;
        }
    }

    @Override
    public final void b(long j, long j2, ko4 ko4Var, MediaFormat mediaFormat) {
        if (this.V) {
            this.h.a(37).b();
        }
    }

    public final void b0(defpackage.oz r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.b0(oz, boolean):void");
    }

    public final void c(x64 x64Var, int i) {
        this.Z.a(1);
        i07 i07Var = this.I;
        if (i == -1) {
            i = i07Var.c.size();
        }
        u(i07Var.a(i, x64Var.a, x64Var.b), false);
    }

    public final void c0(int i) {
        ra9[] ra9VarArr;
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            byte b = vg0Var.b;
            if (b == 1 || b == 2) {
                vg0Var.d(10, Integer.valueOf(i));
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d() {
        ra9[] ra9VarArr;
        fv9 fv9Var;
        for (ra9 ra9Var : this.a) {
            if (this.U) {
                fv9Var = this.T;
            } else {
                fv9Var = null;
            }
            ra9Var.a.d(18, fv9Var);
            vg0 vg0Var = ra9Var.c;
            if (vg0Var != null) {
                vg0Var.d(18, fv9Var);
            }
        }
    }

    public final void d0(boolean z, or2 or2Var) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z) {
                for (ra9 ra9Var : this.a) {
                    ra9Var.n();
                }
            }
        }
        if (or2Var != null) {
            or2Var.e();
        }
    }

    public final boolean e() {
        if (this.P) {
            for (ra9 ra9Var : this.a) {
                if (ra9Var.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e0(v64 v64Var) {
        ra9[] ra9VarArr;
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            if (vg0Var.b == 4) {
                vg0Var.d(23, v64Var);
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(23, v64Var);
                }
            }
        }
    }

    @Override
    public final void f(i8a i8aVar) {
        this.h.c(9, (xt6) i8aVar).b();
    }

    public final void f0(x64 x64Var) {
        this.Z.a(1);
        int i = x64Var.c;
        pka pkaVar = x64Var.b;
        ArrayList arrayList = x64Var.a;
        if (i != -1) {
            this.m0 = new b74(new rg8(arrayList, pkaVar), x64Var.c, x64Var.d);
        }
        i07 i07Var = this.I;
        ArrayList arrayList2 = i07Var.c;
        i07Var.f(0, arrayList2.size());
        u(i07Var.a(arrayList2.size(), arrayList, pkaVar), false);
    }

    public final void g() {
        ra9[] ra9VarArr;
        boolean z;
        vg0 vg0Var;
        if (this.P && e()) {
            for (ra9 ra9Var : this.a) {
                int c = ra9Var.c();
                fc3 fc3Var = this.y;
                if (ra9Var.g()) {
                    byte b = ra9Var.d;
                    byte b2 = 1;
                    if (b != 5 && b != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (b != 5 && b != 3) {
                        b2 = 0;
                    }
                    if (z) {
                        try {
                            vg0Var = ra9Var.a;
                        } catch (RuntimeException e) {
                            efd.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        vg0Var = ra9Var.c;
                        vg0Var.getClass();
                    }
                    ra9Var.a(vg0Var, fc3Var);
                    try {
                        ra9Var.l(z);
                    } catch (RuntimeException e2) {
                        efd.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    ra9Var.d = b2;
                }
                this.l0 -= c - ra9Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void g0(boolean z) {
        this.b0 = z;
        P();
        if (this.c0 && z()) {
            V(true);
            t(false);
        }
    }

    public final void h(int i) {
        ra9[] ra9VarArr = this.a;
        int c = ra9VarArr[i].c();
        ra9 ra9Var = ra9VarArr[i];
        vg0 vg0Var = ra9Var.a;
        fc3 fc3Var = this.y;
        ra9Var.a(vg0Var, fc3Var);
        vg0 vg0Var2 = ra9Var.c;
        if (vg0Var2 != null) {
            byte b = ra9Var.d;
            boolean z = true;
            if (b != 5 && b != 1 && b != 3) {
                z = false;
            }
            ra9Var.a(vg0Var2, fc3Var);
            ra9Var.l(false);
            if (z) {
                vg0 vg0Var3 = ra9Var.a;
                vg0Var2.getClass();
                vg0Var2.d(17, vg0Var3);
            }
        }
        ra9Var.d = (byte) 0;
        G(i, false);
        this.l0 -= c;
    }

    public final void h0(of8 of8Var) {
        this.h.g(16);
        fc3 fc3Var = this.y;
        fc3Var.c(of8Var);
        of8 f = fc3Var.f();
        w(f, f.a, true, true);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i;
        xgb xgbVar;
        int i2;
        yt6 yt6Var;
        vz6 vz6Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = message.arg2;
                    this.Z.a(1);
                    A0(this.Q.c(this.Y.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((b74) message.obj);
                    break;
                case 4:
                    h0((of8) message.obj);
                    break;
                case 5:
                    this.S = (az9) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((or2) message.obj);
                    return true;
                case 8:
                    v((xt6) message.obj);
                    break;
                case 9:
                    r((xt6) message.obj);
                    break;
                case 10:
                    this.d.i((c2c) message.obj);
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    d0(z3, (or2) message.obj);
                    break;
                case 14:
                    Y((mg8) message.obj);
                    break;
                case 15:
                    Z((mg8) message.obj);
                    break;
                case 16:
                    of8 of8Var = (of8) message.obj;
                    w(of8Var, of8Var.a, true, false);
                    break;
                case 17:
                    f0((x64) message.obj);
                    break;
                case 18:
                    c((x64) message.obj, message.arg1);
                    break;
                case 19:
                    I((y64) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (pka) message.obj);
                    break;
                case 21:
                    n0((pka) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    g0(z4);
                    break;
                case 24:
                    if (message.arg1 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.R = z5;
                    break;
                case 25:
                    N();
                    V(true);
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    i0((g64) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (or2) pair.second);
                    break;
                case 31:
                    oz ozVar = (oz) message.obj;
                    if (message.arg1 != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    b0(ozVar, z6);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    p0((sec) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    b74 b74Var = this.W;
                    if (b74Var != null) {
                        W(b74Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    l0((fv9) message.obj);
                    break;
                case 39:
                    e0((v64) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (e64 e) {
            e = e;
            byte b = e.d;
            au6 au6Var = this.H;
            if (b == 1 && e.r == null) {
                ra9 ra9Var = this.a[e.f];
                yt6 yt6Var2 = au6Var.i;
                while (true) {
                    if (yt6Var2 != null) {
                        if (ra9Var.i(yt6Var2)) {
                            break;
                        }
                        yt6Var2 = yt6Var2.m;
                    } else {
                        yt6Var2 = au6Var.d();
                        break;
                    }
                }
                if (yt6Var2 != null) {
                    e = e.a(yt6Var2.g.a);
                }
            }
            int i5 = e.f;
            byte b2 = e.d;
            xgb xgbVar2 = this.h;
            if (b2 == 1 && (vz6Var = e.r) != null && A(i5, vz6Var)) {
                this.v0 = true;
                g();
                yt6 k = au6Var.k(i5);
                yt6 yt6Var3 = au6Var.i;
                if (yt6Var3 != k) {
                    while (yt6Var3 != null) {
                        yt6 yt6Var4 = yt6Var3.m;
                        if (yt6Var4 == k) {
                            break;
                        }
                        yt6Var3 = yt6Var4;
                    }
                }
                au6Var.s(yt6Var3);
                if (this.Y.e != 4) {
                    C();
                    xgbVar2.h(2);
                }
            } else {
                e64 e64Var = this.r0;
                if (e64Var != null) {
                    e64Var.addSuppressed(e);
                    e = this.r0;
                }
                if (e.d == 1 && au6Var.i != au6Var.f()) {
                    yt6 yt6Var5 = au6Var.i;
                    while (true) {
                        if (yt6Var5 != null) {
                            if (yt6Var5.g.a.equals(e.r)) {
                                break;
                            }
                            yt6Var5 = yt6Var5.m;
                        } else {
                            yt6Var5 = au6Var.d();
                            break;
                        }
                    }
                    while (true) {
                        yt6Var = au6Var.i;
                        if (yt6Var == yt6Var5) {
                            break;
                        }
                        au6Var.a();
                    }
                    yve.k(yt6Var);
                    E(message.what);
                    zt6 zt6Var = yt6Var.g;
                    vz6 vz6Var2 = zt6Var.a;
                    long j = zt6Var.b;
                    xgbVar = xgbVar2;
                    this.Y = x(vz6Var2, j, zt6Var.d, j, true, 0);
                } else {
                    xgbVar = xgbVar2;
                }
                if (e.s && (this.r0 == null || (i2 = e.a) == 5004 || i2 == 5003)) {
                    efd.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    wgb c = xgbVar.c(25, e);
                    Handler handler = xgbVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    efd.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (hy7 e2) {
            boolean z7 = e2.a;
            byte b3 = e2.b;
            if (b3 == 1) {
                if (z7) {
                    i = 3001;
                } else {
                    i = 3003;
                }
            } else {
                if (b3 == 4) {
                    if (z7) {
                        i = 3002;
                    } else {
                        i = 3004;
                    }
                }
                s(e2, i3);
            }
            i3 = i;
            s(e2, i3);
        } catch (ir3 e3) {
            s(e3, e3.a);
        } catch (IOException e4) {
            s(e4, 2000);
        } catch (RuntimeException e5) {
            e64 e64Var2 = new e64(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? 1004 : 1004);
            efd.d("ExoPlayerImplInternal", "Playback error", e64Var2);
            v0(true, false);
            this.Y = this.Y.f(e64Var2);
        } catch (k73 e6) {
            s(e6, e6.a);
        } catch (kh0 e7) {
            s(e7, 1002);
        }
        E(message.what);
        return true;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.i():void");
    }

    public final void i0(g64 g64Var) {
        this.t0 = g64Var;
        asb asbVar = this.Y.a;
        au6 au6Var = this.H;
        au6Var.getClass();
        g64Var.getClass();
        if (!au6Var.q.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < au6Var.q.size(); i++) {
                ((yt6) au6Var.q.get(i)).i();
            }
            au6Var.q = arrayList;
            au6Var.m = null;
            au6Var.p();
        }
    }

    public final void j(yt6 yt6Var, int i, boolean z, long j) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        ra9 ra9Var = this.a[i];
        boolean j2 = ra9Var.j();
        vg0 vg0Var = ra9Var.a;
        if (!j2) {
            if (yt6Var == this.H.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            d2c d2cVar = yt6Var.o;
            qa9 qa9Var = ((qa9[]) d2cVar.c)[i];
            e74 e74Var = ((e74[]) d2cVar.d)[i];
            if (s0() && this.Y.e == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.l0++;
            at9 at9Var = yt6Var.c[i];
            long j3 = yt6Var.p;
            vz6 vz6Var = yt6Var.g.a;
            vg0 vg0Var2 = ra9Var.c;
            if (e74Var != null) {
                i2 = e74Var.length();
            } else {
                i2 = 0;
            }
            ko4[] ko4VarArr = new ko4[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                e74Var.getClass();
                ko4VarArr[i3] = e74Var.i(i3);
            }
            byte b = ra9Var.d;
            fc3 fc3Var = this.y;
            if (b != 0 && b != 2 && b != 5) {
                ra9Var.f = true;
                vg0Var2.getClass();
                if (vg0Var2.n == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                yve.p(z6);
                vg0Var2.d = qa9Var;
                vg0Var2.H = vz6Var;
                vg0Var2.n = (byte) 1;
                vg0Var2.r(z4, z2);
                vg0Var2.C(ko4VarArr, at9Var, j, j3, vz6Var);
                vg0Var2.D(j, z4, true);
                fc3Var.i(vg0Var2);
            } else {
                ra9Var.e = true;
                if (vg0Var.n == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                yve.p(z5);
                vg0Var.d = qa9Var;
                vg0Var.H = vz6Var;
                vg0Var.n = (byte) 1;
                vg0Var.r(z4, z2);
                vg0Var.C(ko4VarArr, at9Var, j, j3, vz6Var);
                vg0Var.D(j, z4, true);
                fc3Var.i(vg0Var);
            }
            w64 w64Var = new w64(this);
            vg0 d = ra9Var.d(yt6Var);
            d.getClass();
            d.d(11, w64Var);
            if (z3 && z2) {
                ra9Var.p();
            }
        }
    }

    public final void j0(int i) {
        this.g0 = i;
        asb asbVar = this.Y.a;
        au6 au6Var = this.H;
        au6Var.g = i;
        int w = au6Var.w(asbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(long j, boolean[] zArr) {
        ra9[] ra9VarArr;
        c74 c74Var;
        long j2;
        yve.p(!z());
        yt6 d = this.H.d();
        d2c d2cVar = d.o;
        int i = 0;
        while (true) {
            ra9VarArr = this.a;
            if (i >= ra9VarArr.length) {
                break;
            }
            if (!d2cVar.q(i)) {
                ra9VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ra9VarArr.length) {
            if (d2cVar.q(i2) && !ra9VarArr[i2].i(d)) {
                c74Var = this;
                j2 = j;
                c74Var.j(d, i2, zArr[i2], j2);
            } else {
                c74Var = this;
                j2 = j;
            }
            i2++;
            this = c74Var;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        if (!z) {
            b74 b74Var = this.W;
            xgb xgbVar = this.h;
            if (b74Var != null && this.V && !xgbVar.a.hasMessages(37)) {
                this.X++;
            }
            int i = this.X;
            if (i > 0) {
                this.O.e(new hl3(this, i, (byte) 6));
            }
            this.X = 0;
            this.V = false;
            xgbVar.g(37);
            b74 b74Var2 = this.W;
            if (b74Var2 != null) {
                W(b74Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z;
        d();
    }

    public final long l(asb asbVar, Object obj, long j) {
        xrb xrbVar = this.w;
        int i = asbVar.g(obj, xrbVar).c;
        zrb zrbVar = this.s;
        asbVar.n(i, zrbVar);
        if (zrbVar.e == -9223372036854775807L || !zrbVar.a() || !zrbVar.h) {
            return -9223372036854775807L;
        }
        return gcc.T(gcc.E(zrbVar.f) - zrbVar.e) - (j + xrbVar.e);
    }

    public final void l0(fv9 fv9Var) {
        this.T = fv9Var;
        d();
    }

    public final Pair m(asb asbVar) {
        long j = 0;
        if (asbVar.p()) {
            return Pair.create(nf8.u, 0L);
        }
        int a = asbVar.a(this.h0);
        Pair i = asbVar.i(this.s, this.w, a, -9223372036854775807L);
        vz6 u = this.H.u(this.Y, asbVar, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            xrb xrbVar = this.w;
            asbVar.g(obj, xrbVar);
            if (u.c == xrbVar.e(u.b)) {
                ea eaVar = ea.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.h0 = z;
        asb asbVar = this.Y.a;
        au6 au6Var = this.H;
        au6Var.h = z;
        int w = au6Var.w(asbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(yt6 yt6Var, int i) {
        if (yt6Var == null) {
            return 0L;
        }
        if (yt6Var.e) {
            ra9[] ra9VarArr = this.a;
            if (ra9VarArr[i].i(yt6Var)) {
                vg0 d = ra9VarArr[i].d(yt6Var);
                Objects.requireNonNull(d);
                return d.y;
            }
        }
        return yt6Var.p;
    }

    public final void n0(pka pkaVar) {
        this.Z.a(1);
        i07 i07Var = this.I;
        int size = i07Var.c.size();
        if (pkaVar.c() != size) {
            pkaVar = pkaVar.a().b(0, size);
        }
        i07Var.k = pkaVar;
        u(i07Var.b(), false);
    }

    public final long o(long j) {
        yt6 yt6Var = this.H.l;
        if (yt6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.n0 - yt6Var.p));
    }

    public final void o0(int i) {
        nf8 nf8Var = this.Y;
        if (nf8Var.e != i) {
            if (i != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i != 3 && nf8Var.p) {
                nf8Var = nf8Var.i(false);
                this.Y = nf8Var;
            }
            this.Y = nf8Var.h(i);
        }
    }

    public final void p(int i) {
        nf8 nf8Var = this.Y;
        A0(i, nf8Var.n, nf8Var.m, nf8Var.l);
    }

    public final void p0(sec secVar) {
        ra9[] ra9VarArr;
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            byte b = vg0Var.b;
            if (b == 2 || b == 4) {
                vg0Var.d(7, secVar);
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(7, secVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.w0);
    }

    public final void q0(Object obj, or2 or2Var) {
        ra9[] ra9VarArr;
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            if (vg0Var.b == 2) {
                byte b = ra9Var.d;
                if (b != 5 && b != 3 && b != 1) {
                    vg0Var.d(1, obj);
                } else {
                    vg0 vg0Var2 = ra9Var.c;
                    vg0Var2.getClass();
                    vg0Var2.d(1, obj);
                }
            }
        }
        int i = this.Y.e;
        if (i == 3 || i == 2) {
            this.h.h(2);
        }
        if (or2Var != null) {
            or2Var.e();
        }
    }

    public final void r(xt6 xt6Var) {
        au6 au6Var = this.H;
        yt6 yt6Var = au6Var.l;
        if (yt6Var != null && yt6Var.a == xt6Var) {
            au6Var.r(this.n0);
            C();
            return;
        }
        yt6 yt6Var2 = au6Var.m;
        if (yt6Var2 != null && yt6Var2.a == xt6Var) {
            D();
        }
    }

    public final void r0(float f) {
        ra9[] ra9VarArr;
        this.w0 = f;
        float f2 = f * this.Q.g;
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            if (vg0Var.b == 1) {
                vg0Var.d(2, Float.valueOf(f2));
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        e64 e64Var = new e64(0, iOException, i);
        yt6 yt6Var = this.H.i;
        if (yt6Var != null) {
            e64Var = e64Var.a(yt6Var.g.a);
        }
        efd.d("ExoPlayerImplInternal", "Playback error", e64Var);
        v0(false, false);
        this.Y = this.Y.f(e64Var);
    }

    public final boolean s0() {
        nf8 nf8Var = this.Y;
        if (nf8Var.l && nf8Var.n == 0) {
            return true;
        }
        return false;
    }

    public final void t(boolean z) {
        vz6 vz6Var;
        long d;
        yt6 yt6Var = this.H.l;
        if (yt6Var == null) {
            vz6Var = this.Y.b;
        } else {
            vz6Var = yt6Var.g.a;
        }
        boolean equals = this.Y.k.equals(vz6Var);
        if (!equals) {
            this.Y = this.Y.c(vz6Var);
        }
        nf8 nf8Var = this.Y;
        if (yt6Var == null) {
            d = nf8Var.s;
        } else {
            d = yt6Var.d();
        }
        nf8Var.q = d;
        nf8 nf8Var2 = this.Y;
        nf8Var2.r = o(nf8Var2.q);
        if ((!equals || z) && yt6Var != null && yt6Var.e) {
            y0(yt6Var.g.a, yt6Var.o);
        }
    }

    public final boolean t0(asb asbVar, vz6 vz6Var) {
        if (!vz6Var.c() && !asbVar.p()) {
            int i = asbVar.g(vz6Var.a, this.w).c;
            zrb zrbVar = this.s;
            asbVar.n(i, zrbVar);
            if (zrbVar.a() && zrbVar.h && zrbVar.e != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u(defpackage.asb r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.u(asb, boolean):void");
    }

    public final void u0() {
        yt6 yt6Var = this.H.i;
        if (yt6Var != null) {
            d2c d2cVar = yt6Var.o;
            int i = 0;
            while (true) {
                ra9[] ra9VarArr = this.a;
                if (i < ra9VarArr.length) {
                    if (d2cVar.q(i)) {
                        ra9VarArr[i].p();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v(xt6 xt6Var) {
        yt6 yt6Var;
        c74 c74Var;
        au6 au6Var = this.H;
        yt6 yt6Var2 = au6Var.l;
        fc3 fc3Var = this.y;
        if (yt6Var2 != null && yt6Var2.a == xt6Var) {
            yt6Var2.getClass();
            if (!yt6Var2.e) {
                float f = fc3Var.f().a;
                nf8 nf8Var = this.Y;
                yt6Var2.f(f, nf8Var.a, nf8Var.l);
            }
            y0(yt6Var2.g.a, yt6Var2.o);
            if (yt6Var2 == au6Var.i) {
                Q(yt6Var2.g.b, true);
                yve.p(!z());
                k(au6Var.d().e(), new boolean[this.a.length]);
                a0(yt6Var2);
                nf8 nf8Var2 = this.Y;
                vz6 vz6Var = nf8Var2.b;
                long j = yt6Var2.g.b;
                c74Var = this;
                c74Var.Y = x(vz6Var, j, nf8Var2.c, j, false, 5);
            } else {
                c74Var = this;
            }
            c74Var.C();
            return;
        }
        int i = 0;
        while (true) {
            if (i < au6Var.q.size()) {
                yt6Var = (yt6) au6Var.q.get(i);
                if (yt6Var.a == xt6Var) {
                    break;
                }
                i++;
            } else {
                yt6Var = null;
                break;
            }
        }
        if (yt6Var != null) {
            yve.p(!yt6Var.e);
            float f2 = fc3Var.f().a;
            nf8 nf8Var3 = this.Y;
            yt6Var.f(f2, nf8Var3.a, nf8Var3.l);
            yt6 yt6Var3 = au6Var.m;
            if (yt6Var3 != null && yt6Var3.a == xt6Var) {
                D();
            }
        }
    }

    public final void v0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.i0) {
            z3 = false;
        } else {
            z3 = true;
        }
        O(z3, false, true, false);
        this.Z.a(z2 ? 1 : 0);
        ec3 ec3Var = this.f;
        ConcurrentHashMap concurrentHashMap = ec3Var.o;
        ig8 ig8Var = this.L;
        dc3 dc3Var = (dc3) concurrentHashMap.get(ig8Var);
        if (dc3Var != null) {
            int i = dc3Var.a - 1;
            dc3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(ig8Var);
                ec3Var.d();
            }
        }
        this.Q.c(1, this.Y.l);
        o0(1);
    }

    public final void w(of8 of8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.Z.a(1);
            }
            this.Y = this.Y.g(of8Var);
        }
        float f2 = of8Var.a;
        yt6 yt6Var = this.H.i;
        while (true) {
            i = 0;
            if (yt6Var == null) {
                break;
            }
            e74[] e74VarArr = (e74[]) yt6Var.o.d;
            int length = e74VarArr.length;
            while (i < length) {
                e74 e74Var = e74VarArr[i];
                if (e74Var != null) {
                    e74Var.q(f2);
                }
                i++;
            }
            yt6Var = yt6Var.m;
        }
        ra9[] ra9VarArr = this.a;
        int length2 = ra9VarArr.length;
        while (i < length2) {
            ra9 ra9Var = ra9VarArr[i];
            float f3 = of8Var.a;
            ra9Var.a.E(f, f3);
            vg0 vg0Var = ra9Var.c;
            if (vg0Var != null) {
                vg0Var.E(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        ra9[] ra9VarArr;
        fc3 fc3Var = this.y;
        fc3Var.b = false;
        ze2 ze2Var = (ze2) fc3Var.c;
        if (ze2Var.c) {
            ze2Var.a(ze2Var.g());
            ze2Var.c = false;
        }
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.c;
            vg0 vg0Var2 = ra9Var.a;
            if (ra9.k(vg0Var2)) {
                ra9.b(vg0Var2);
            }
            if (vg0Var != null && vg0Var.n != 0) {
                ra9.b(vg0Var);
            }
        }
    }

    public final nf8 x(vz6 vz6Var, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        boolean z3;
        j99 j99Var;
        yt6 yt6Var;
        boolean z4;
        boolean z5;
        if (!this.q0 && j == this.Y.s && vz6Var.equals(this.Y.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.q0 = z2;
        P();
        nf8 nf8Var = this.Y;
        u1c u1cVar = nf8Var.h;
        d2c d2cVar = nf8Var.i;
        List list = nf8Var.j;
        if (this.I.l) {
            yt6 yt6Var2 = this.H.i;
            if (yt6Var2 == null) {
                u1cVar = u1c.d;
                d2cVar = this.e;
            } else {
                u1cVar = yt6Var2.n;
                d2cVar = yt6Var2.o;
            }
            e74[] e74VarArr = (e74[]) d2cVar.d;
            ?? ho5Var = new ho5(4);
            boolean z6 = false;
            for (e74 e74Var : e74VarArr) {
                if (e74Var != null) {
                    uf7 uf7Var = e74Var.i(0).m;
                    if (uf7Var == null) {
                        ho5Var.c(new uf7(new sf7[0]));
                    } else {
                        ho5Var.c(uf7Var);
                        z6 = true;
                    }
                }
            }
            if (z6) {
                j99Var = ho5Var.f();
            } else {
                no5 no5Var = po5.b;
                j99Var = j99.e;
            }
            list = j99Var;
            if (yt6Var2 != null) {
                zt6 zt6Var = yt6Var2.g;
                if (zt6Var.d != j2) {
                    yt6Var2.g = zt6Var.a(j2);
                }
            }
            ra9[] ra9VarArr = this.a;
            if (!z() && (yt6Var = this.H.i) != null) {
                d2c d2cVar2 = yt6Var.o;
                int i2 = 0;
                boolean z7 = false;
                while (true) {
                    if (i2 < ra9VarArr.length) {
                        if (d2cVar2.q(i2)) {
                            if (ra9VarArr[i2].a.b != 1) {
                                z4 = false;
                                break;
                            } else if (((qa9[]) d2cVar2.c)[i2].a != 0) {
                                z7 = true;
                            }
                        }
                        i2++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                if (z7 && z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 != this.k0) {
                    this.k0 = z5;
                    if (!z5 && this.Y.p) {
                        this.h.h(2);
                    }
                }
            }
        } else if (!vz6Var.equals(nf8Var.b)) {
            u1cVar = u1c.d;
            d2cVar = this.e;
            no5 no5Var2 = po5.b;
            list = j99.e;
        }
        d2c d2cVar3 = d2cVar;
        List list2 = list;
        u1c u1cVar2 = u1cVar;
        if (z) {
            z64 z64Var = this.Z;
            if (z64Var.d && z64Var.e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                yve.f(z3);
            } else {
                z64Var.a = true;
                z64Var.d = true;
                z64Var.e = i;
            }
        }
        nf8 nf8Var2 = this.Y;
        return nf8Var2.d(vz6Var, j, j2, j3, o(nf8Var2.q), u1cVar2, d2cVar3, list2);
    }

    public final void x0() {
        boolean z;
        yt6 yt6Var = this.H.l;
        if (!this.f0 && (yt6Var == null || !yt6Var.a.e())) {
            z = false;
        } else {
            z = true;
        }
        nf8 nf8Var = this.Y;
        if (z != nf8Var.g) {
            this.Y = nf8Var.b(z);
        }
    }

    public final void y0(defpackage.vz6 r9, defpackage.d2c r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c74.y0(vz6, d2c):void");
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            au6 au6Var = this.H;
            if (au6Var.i != au6Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(List list, int i, int i2) {
        boolean z;
        boolean z2 = true;
        this.Z.a(1);
        i07 i07Var = this.I;
        i07Var.getClass();
        ArrayList arrayList = i07Var.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size()) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        if (list.size() != i2 - i) {
            z2 = false;
        }
        yve.f(z2);
        for (int i3 = i; i3 < i2; i3++) {
            ((h07) arrayList.get(i3)).a.t((ft6) list.get(i3 - i));
        }
        u(i07Var.b(), false);
    }
}
