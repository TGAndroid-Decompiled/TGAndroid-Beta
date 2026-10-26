package i2;

import a8.yb;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.b2;
import b2.w1;
import fi.ua;
import hi.u2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k81;
public final class j0 extends b2.h implements q {
    public final c3.m0 A;
    public final long B;
    public final e2.c C;
    public final e2.e0 D;
    public final i0 E;
    public final rf.b F;
    public final rf.b G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final s1 M;
    public t1 N;
    public u2.i1 O;
    public b2.c1 P;
    public b2.s0 Q;
    public b2.s0 R;
    public b2.x S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public e2.y Z;
    public b2.f f13583a0;
    public final x2.u f13584b;
    public float f13585b0;
    public final b2.c1 f13586c;
    public float f13587c0;
    public final e2.i d;
    public boolean f13588d0;
    public final Context e;
    public d2.c f13589e0;
    public final j0 f13590f;
    public final boolean f13591f0;
    public final b[] f13592g;
    public boolean f13593g0;
    public final b[] h;
    public final int f13594h0;
    public final x2.t f13595i;
    public boolean f13596i0;
    public final e2.i0 f13597j;
    public final b2.q f13598j0;
    public final x f13599k;
    public b2 f13600k0;
    public final s0 f13601l;
    public final long f13602l0;
    public final e2.r f13603m;
    public final long m0;
    public final CopyOnWriteArraySet f13604n;
    public final long f13605n0;
    public final b2.m1 f13606o;
    public b2.s0 f13607o0;
    public final ArrayList f13608p;
    public k1 f13609p0;
    public final boolean f13610q;
    public int f13611q0;
    public final u2.f0 f13612r;
    public long f13613r0;
    public final j2.e f13614s;
    public k81 f13615s0;
    public final Looper f13616t;
    public final ArrayList f13617t0;
    public final y2.c f13618u;
    public final e2.g0 v;
    public final d0 f13619w;
    public final e0 f13620x;
    public final c2.b f13621y;
    public final bc.a f13622z;

    static {
        b2.q0.a("media3.exoplayer");
    }

    public j0(i2.o r34) {
        throw new UnsupportedOperationException("Method not decompiled: i2.j0.<init>(i2.o):void");
    }

    public static long m1(k1 k1Var) {
        b2.o1 o1Var = new b2.o1();
        b2.m1 m1Var = new b2.m1();
        k1Var.f13638a.g(k1Var.f13639b.f49297a, m1Var);
        long j10 = k1Var.f13640c;
        if (j10 == -9223372036854775807L) {
            return k1Var.f13638a.m(m1Var.f3280c, o1Var, 0L).f3333l;
        }
        return m1Var.e + j10;
    }

    public static k1 n1(k1 k1Var, int i10) {
        k1 h = k1Var.h(i10);
        if (i10 != 1 && i10 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final int A() {
        F1();
        if (this.f13609p0.f13638a.p()) {
            int i10 = this.f13611q0;
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }
        k1 k1Var = this.f13609p0;
        return k1Var.f13638a.b(k1Var.f13639b.f49297a);
    }

    @Override
    public final Looper A0() {
        return this.f13616t;
    }

    public final void A1(m mVar) {
        k1 k1Var = this.f13609p0;
        k1 c10 = k1Var.c(k1Var.f13639b);
        c10.f13651q = c10.f13653s;
        c10.f13652r = 0L;
        k1 n12 = n1(c10, 1);
        if (mVar != null) {
            n12 = n12.f(mVar);
        }
        this.J++;
        this.f13601l.f13744n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void B(b2.s0 s0Var) {
        F1();
        s0Var.getClass();
        if (s0Var.equals(this.R)) {
            return;
        }
        this.R = s0Var;
        this.f13603m.e(15, new x(this, 4));
    }

    @Override
    public final void B0() {
        F1();
        if (this.f13585b0 != 0.0f) {
            U(0.0f);
        }
    }

    public final void B1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        b2.c1 c1Var = this.P;
        String str = e2.n0.f9692a;
        j0 j0Var = this.f13590f;
        boolean n10 = j0Var.n();
        boolean e02 = j0Var.e0();
        boolean T0 = j0Var.T0();
        boolean S0 = j0Var.S0();
        boolean P0 = j0Var.P0();
        boolean v02 = j0Var.v0();
        boolean p10 = j0Var.y0().p();
        ?? obj = new Object();
        obj.f3147a = new b2.u();
        b2.u uVar = (b2.u) obj.f3147a;
        uVar.c(this.f13586c.f3160a);
        boolean z16 = !n10;
        obj.a(4, z16);
        boolean z17 = false;
        if (e02 && !n10) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(5, z10);
        if (T0 && !n10) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(6, z11);
        if (!p10 && ((T0 || !P0 || e02) && !n10)) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(7, z12);
        if (S0 && !n10) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(8, z13);
        if (!p10 && ((S0 || (P0 && v02)) && !n10)) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(9, z14);
        obj.a(10, z16);
        if (e02 && !n10) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (e02 && !n10) {
            z17 = true;
        }
        obj.a(12, z17);
        b2.c1 c1Var2 = new b2.c1(uVar.d());
        this.P = c1Var2;
        if (!c1Var2.equals(c1Var)) {
            this.f13603m.c(13, new x(this, 3));
        }
    }

    @Override
    public final void C(b2.e1 e1Var) {
        boolean z10;
        F1();
        e1Var.getClass();
        e2.r rVar = this.f13603m;
        if (rVar.f9718i) {
            if (Thread.currentThread() == rVar.f9713a) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.q qVar = (e2.q) it.next();
            if (qVar.f9707a.equals(e1Var)) {
                e2.p pVar = rVar.f9715c;
                qVar.d = true;
                if (pVar != null && qVar.f9709c) {
                    qVar.f9709c = false;
                    pVar.f(qVar.f9707a, qVar.f9708b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    @Override
    public final void C0() {
        F1();
    }

    public final void C1(int i10, boolean z10) {
        int i11;
        k1 k1Var = this.f13609p0;
        int i12 = k1Var.f13648n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (k1Var.f13646l == z10 && i12 == i11 && k1Var.f13647m == i10) {
            return;
        }
        this.J++;
        if (k1Var.f13650p) {
            k1Var = k1Var.a();
        }
        k1 e = k1Var.e(i10, i11, z10);
        e2.i0 i0Var = this.f13601l.f13744n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f9668a = i0Var.f9672a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final b2 D() {
        F1();
        return this.f13600k0;
    }

    @Override
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final k1 k1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.p0 p0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        Object obj;
        b2.p0 p0Var2;
        Object obj2;
        long j11;
        long j12;
        long j13;
        long m12;
        Object obj3;
        b2.p0 p0Var3;
        Object obj4;
        k1 k1Var2 = this.f13609p0;
        this.f13609p0 = k1Var;
        boolean equals = k1Var2.f13638a.equals(k1Var.f13638a);
        b2.o1 o1Var = (b2.o1) this.f3212a;
        b2.m1 m1Var = this.f13606o;
        b2.p1 p1Var = k1Var2.f13638a;
        u2.g0 g0Var = k1Var2.f13639b;
        b2.p1 p1Var2 = k1Var.f13638a;
        u2.g0 g0Var2 = k1Var.f13639b;
        if (p1Var2.p() && p1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (p1Var2.p() != p1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!p1Var.m(p1Var.g(g0Var.f49297a, m1Var).f3280c, o1Var, 0L).f3325a.equals(p1Var2.m(p1Var2.g(g0Var2.f49297a, m1Var).f3280c, o1Var, 0L).f3325a)) {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else if (equals) {
                throw new IllegalStateException();
            } else {
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        } else if (z10 && i11 == 0 && g0Var.d < g0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i11 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            p0Var = !k1Var.f13638a.p() ? k1Var.f13638a.m(k1Var.f13638a.g(k1Var.f13639b.f49297a, this.f13606o).f3280c, (b2.o1) this.f3212a, 0L).f3327c : null;
            this.f13607o0 = b2.s0.L;
        } else {
            p0Var = null;
        }
        if (booleanValue || !k1Var2.f13644j.equals(k1Var.f13644j)) {
            b2.r0 a2 = this.f13607o0.a();
            List list = k1Var.f13644j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.u0 u0Var = (b2.u0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.t0[] t0VarArr = u0Var.f3465a;
                    if (i17 < t0VarArr.length) {
                        t0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.f13607o0 = new b2.s0(a2);
        }
        b2.s0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z15 = k1Var2.f13646l != k1Var.f13646l;
        boolean z16 = k1Var2.e != k1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = k1Var2.f13642g != k1Var.f13642g;
        if (!equals) {
            this.f13603m.c(0, new r(k1Var, i10, 0));
        }
        if (z10) {
            b2.m1 m1Var2 = new b2.m1();
            if (k1Var2.f13638a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                i15 = i14;
                obj = null;
                p0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = k1Var2.f13639b.f49297a;
                k1Var2.f13638a.g(obj5, m1Var2);
                int i18 = m1Var2.f3280c;
                int b10 = k1Var2.f13638a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = k1Var2.f13638a.m(i18, (b2.o1) this.f3212a, 0L).f3325a;
                p0Var2 = ((b2.o1) this.f3212a).f3327c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            }
            if (i11 == 0) {
                if (k1Var2.f13639b.b()) {
                    u2.g0 g0Var3 = k1Var2.f13639b;
                    j13 = m1Var2.a(g0Var3.f49298b, g0Var3.f49299c);
                    m12 = m1(k1Var2);
                } else if (k1Var2.f13639b.e != -1) {
                    j13 = m1(this.f13609p0);
                    m12 = j13;
                } else {
                    j11 = m1Var2.e;
                    j12 = m1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (k1Var2.f13639b.b()) {
                j13 = k1Var2.f13653s;
                m12 = m1(k1Var2);
            } else {
                j11 = m1Var2.e;
                j12 = k1Var2.f13653s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.n0.h0(j13);
            long h03 = e2.n0.h0(m12);
            u2.g0 g0Var4 = k1Var2.f13639b;
            b2.f1 f1Var = new b2.f1(obj, i14, p0Var2, obj2, i15, h02, h03, g0Var4.f49298b, g0Var4.f49299c);
            b2.o1 o1Var2 = (b2.o1) this.f3212a;
            int n02 = n0();
            int A = A();
            if (this.f13609p0.f13638a.p()) {
                obj3 = null;
                p0Var3 = null;
                obj4 = null;
            } else {
                k1 k1Var3 = this.f13609p0;
                Object obj6 = k1Var3.f13639b.f49297a;
                k1Var3.f13638a.g(obj6, this.f13606o);
                A = this.f13609p0.f13638a.b(obj6);
                Object obj7 = this.f13609p0.f13638a.m(n02, o1Var2, 0L).f3325a;
                p0Var3 = o1Var2.f3327c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i19 = A;
            long h04 = e2.n0.h0(j10);
            long h05 = this.f13609p0.f13639b.b() ? e2.n0.h0(m1(this.f13609p0)) : h04;
            u2.g0 g0Var5 = this.f13609p0.f13639b;
            this.f13603m.c(11, new z(i11, f1Var, new b2.f1(obj3, n02, p0Var3, obj4, i19, h04, h05, g0Var5.f49298b, g0Var5.f49299c), 0));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.f13603m.c(1, new r(p0Var, intValue, 1));
        }
        if (k1Var2.f13641f != k1Var.f13641f) {
            this.f13603m.c(10, new e2.o() {
                @Override
                public final void invoke(Object obj8) {
                    b2.e1 e1Var = (b2.e1) obj8;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
            if (k1Var.f13641f != null) {
                this.f13603m.c(10, new e2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.e1 e1Var = (b2.e1) obj8;
                        switch (r2) {
                            case 0:
                                k1 k1Var4 = k1Var;
                                e1Var.onLoadingChanged(k1Var4.f13642g);
                                e1Var.onIsLoadingChanged(k1Var4.f13642g);
                                return;
                            case 1:
                                k1 k1Var5 = k1Var;
                                e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                                return;
                            case 2:
                                e1Var.onPlaybackStateChanged(k1Var.e);
                                return;
                            case 3:
                                k1 k1Var6 = k1Var;
                                e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                                return;
                            case 4:
                                e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                                return;
                            case 5:
                                e1Var.onIsPlayingChanged(k1Var.m());
                                return;
                            case 6:
                                e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                                return;
                            case 7:
                                e1Var.onPlayerErrorChanged(k1Var.f13641f);
                                return;
                            case 8:
                                e1Var.onPlayerError(k1Var.f13641f);
                                return;
                            default:
                                e1Var.onTracksChanged(k1Var.f13643i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.u uVar = k1Var2.f13643i;
        x2.u uVar2 = k1Var.f13643i;
        if (uVar != uVar2) {
            x2.t tVar = this.f13595i;
            Object obj8 = uVar2.e;
            tVar.getClass();
            tVar.f51360c = (x2.s) obj8;
            this.f13603m.c(2, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (!z13) {
            this.f13603m.c(14, new s(this.Q));
        }
        if (z17) {
            this.f13603m.c(3, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (z14 || z15) {
            this.f13603m.c(-1, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (z14) {
            this.f13603m.c(4, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (z15 || k1Var2.f13647m != k1Var.f13647m) {
            this.f13603m.c(5, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.f13648n != k1Var.f13648n) {
            this.f13603m.c(6, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.m() != k1Var.m()) {
            this.f13603m.c(7, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        if (!k1Var2.f13649o.equals(k1Var.f13649o)) {
            this.f13603m.c(12, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f13642g);
                            e1Var.onIsLoadingChanged(k1Var4.f13642g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f13646l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f13646l, k1Var6.f13647m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f13648n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f13649o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f13641f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f13641f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f13643i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f13603m.b();
        if (k1Var2.f13650p != k1Var.f13650p) {
            Iterator it = this.f13604n.iterator();
            while (it.hasNext()) {
                ((d0) it.next()).f13509a.E1();
            }
        }
    }

    @Override
    public final b2.u1 E0() {
        F1();
        return ((x2.o) this.f13595i).j();
    }

    public final void E1() {
        int d = d();
        c3.m0 m0Var = this.A;
        bc.a aVar = this.f13622z;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f13609p0.f13650p;
                if (t() && !z11) {
                    z10 = true;
                }
                aVar.c(z10);
                m0Var.a(t());
                return;
            }
        }
        aVar.c(false);
        m0Var.a(false);
    }

    @Override
    public final float F() {
        F1();
        return this.f13585b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f13609p0.f13638a.p()) {
            return this.f13613r0;
        }
        k1 k1Var = this.f13609p0;
        long j10 = 0;
        if (k1Var.f13645k.d != k1Var.f13639b.d) {
            return e2.n0.h0(k1Var.f13638a.m(n0(), (b2.o1) this.f3212a, 0L).f3334m);
        }
        long j11 = k1Var.f13651q;
        if (this.f13609p0.f13645k.b()) {
            k1 k1Var2 = this.f13609p0;
            k1Var2.f13638a.g(k1Var2.f13645k.f49297a, this.f13606o).d(this.f13609p0.f13645k.f49298b);
        } else {
            j10 = j11;
        }
        k1 k1Var3 = this.f13609p0;
        b2.p1 p1Var = k1Var3.f13638a;
        Object obj = k1Var3.f13645k.f49297a;
        b2.m1 m1Var = this.f13606o;
        p1Var.g(obj, m1Var);
        return e2.n0.h0(j10 + m1Var.e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f13616t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.n0.f9692a;
            Locale locale = Locale.US;
            String k10 = b10.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f13591f0) {
                if (this.f13593g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.m("ExoPlayerImpl", k10, illegalStateException);
                this.f13593g0 = true;
                return;
            }
            throw new IllegalStateException(k10);
        }
    }

    @Override
    public final void G0(int i10) {
        F1();
    }

    @Override
    public final b2.f H() {
        F1();
        return this.f13583a0;
    }

    @Override
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override
    public final b2.q J() {
        F1();
        return this.f13598j0;
    }

    @Override
    public final void K() {
        F1();
    }

    @Override
    public final b2.s0 K0() {
        F1();
        return this.Q;
    }

    @Override
    public final void L(int i10, int i11) {
        F1();
    }

    @Override
    public final void L0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-9223372036854775807L, g12, true, -1);
    }

    @Override
    public final void M(int i10) {
        F1();
    }

    @Override
    public final long M0() {
        F1();
        return e2.n0.h0(j1(this.f13609p0));
    }

    @Override
    public final int N() {
        F1();
        if (n()) {
            return this.f13609p0.f13639b.f49299c;
        }
        return -1;
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        F1();
        if (this.f13596i0) {
            return;
        }
        boolean equals = Objects.equals(this.f13583a0, fVar);
        e2.r rVar = this.f13603m;
        if (!equals) {
            this.f13583a0 = fVar;
            t1(1, 3, fVar);
            rVar.c(20, new e1.c(fVar, 18));
        }
        b2.f fVar2 = this.f13583a0;
        e2.i0 i0Var = this.f13601l.f13744n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f9668a = i0Var.f9672a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final void O(int i10, int i11, List list) {
        boolean z10;
        u2.q1 q1Var;
        F1();
        boolean z11 = false;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        ArrayList arrayList = this.f13608p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((f0) arrayList.get(i12)).f13531b.f49434k.a((b2.p0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.f13601l.f13744n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f9668a = i0Var.f9672a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                f0 f0Var = (f0) arrayList.get(i13);
                b2.p1 p1Var = f0Var.f13532c;
                b2.p0 p0Var = (b2.p0) list.get(i13 - i10);
                if (p1Var instanceof u2.q1) {
                    q1Var = new u2.q1(((u2.q1) p1Var).e, p0Var);
                } else {
                    q1Var = new u2.q1(p1Var, p0Var);
                }
                f0Var.f13532c = q1Var;
            }
            D1(this.f13609p0.j(new p1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f13609p0.f13638a.p()) {
            if (this.f13611q0 == -1) {
                z11 = true;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        k1 r12 = r1(e1(this.f13609p0, min, g12), i10, min);
        D1(r12, 0, !r12.f13639b.f49297a.equals(this.f13609p0.f13639b.f49297a), 4, j1(r12), -1, false);
    }

    @Override
    public final long O0() {
        F1();
        return this.f13602l0;
    }

    @Override
    public final void R(int i10, int i11) {
        boolean z10;
        F1();
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        int size = this.f13608p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            k1 r12 = r1(this.f13609p0, i10, min);
            D1(r12, 0, !r12.f13639b.f49297a.equals(this.f13609p0.f13639b.f49297a), 4, j1(r12), -1, false);
        }
    }

    @Override
    public final void S(long j10, int i10, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(j10, g12, false, i10);
    }

    @Override
    public final void T(SurfaceHolder surfaceHolder) {
        F1();
        if (surfaceHolder == null) {
            F1();
            s1();
            x1(null);
            q1(0, 0);
            return;
        }
        s1();
        this.W = true;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.f13619w);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            x1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            q1(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        x1(null);
        q1(0, 0);
    }

    @Override
    public final void U(float f7) {
        F1();
        float h = e2.n0.h(f7, 0.0f, 1.0f);
        float f10 = this.f13585b0;
        if (f10 == h) {
            return;
        }
        if (h != 0.0f) {
            f10 = h;
        }
        this.f13587c0 = f10;
        this.f13585b0 = h;
        this.f13601l.f13744n.b(32, Float.valueOf(h)).b();
        this.f13603m.e(22, new u(h, 0));
    }

    @Override
    public final b2.z0 W() {
        F1();
        return this.f13609p0.f13641f;
    }

    @Override
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.n0.f9692a + "] [" + b2.q0.b() + "]");
        F1();
        this.f13621y.w();
        this.f13622z.c(false);
        this.A.a(false);
        i0 i0Var = this.E;
        if (i0Var != null && Build.VERSION.SDK_INT >= 34) {
            i0.a(i0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f9652f.f9672a.removeCallbacksAndMessages(null);
        e0Var.f9649a.C(e0Var.f9650b);
        s0 s0Var = this.f13601l;
        if (!s0Var.Z && s0Var.f13751s.getThread().isAlive()) {
            s0Var.Z = true;
            e2.i iVar = new e2.i(s0Var.F);
            s0Var.f13744n.b(7, iVar).b();
            z10 = iVar.c(s0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f13603m.e(10, new gh.a(24));
        }
        this.f13603m.d();
        this.f13597j.f9672a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f13618u;
        j2.e eVar = this.f13614s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f51946c.f47816a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f51931b == eVar) {
                bVar.f51932c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        k1 k1Var = this.f13609p0;
        if (k1Var.f13650p) {
            this.f13609p0 = k1Var.a();
        }
        k1 n12 = n1(this.f13609p0, 1);
        this.f13609p0 = n12;
        k1 c10 = n12.c(n12.f13639b);
        this.f13609p0 = c10;
        c10.f13651q = c10.f13653s;
        this.f13609p0.f13652r = 0L;
        j2.e eVar2 = this.f13614s;
        e2.i0 i0Var2 = eVar2.f15201n;
        i0Var2.getClass();
        i0Var2.d(new ua(eVar2, 21));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f13589e0 = d2.c.d;
        this.f13596i0 = true;
    }

    @Override
    public final void Y0(int i10, long j10, boolean z10) {
        boolean z11;
        F1();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            yb.g(z11);
            b2.p1 p1Var = this.f13609p0.f13638a;
            if (!p1Var.p() && i10 >= p1Var.o()) {
                return;
            }
            j2.e eVar = this.f13614s;
            if (!eVar.f15202r) {
                j2.a l4 = eVar.l();
                eVar.f15202r = true;
                eVar.q(l4, -1, new e1.c(l4, 25));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                p0 p0Var = new p0(this.f13609p0);
                p0Var.f(1);
                j0 j0Var = this.f13599k.f13787b;
                j0Var.f13597j.d(new u2(5, j0Var, p0Var));
                return;
            }
            k1 k1Var = this.f13609p0;
            int i11 = k1Var.e;
            if (i11 == 3 || (i11 == 4 && !p1Var.p())) {
                k1Var = this.f13609p0.h(2);
            }
            int n02 = n0();
            k1 o12 = o1(k1Var, p1Var, p1(p1Var, i10, j10));
            this.f13601l.f13744n.b(3, new r0(p1Var, i10, e2.n0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), n02, z10);
        }
    }

    @Override
    public final long Z() {
        F1();
        return this.m0;
    }

    @Override
    public final void a() {
        int i10;
        F1();
        k1 k1Var = this.f13609p0;
        if (k1Var.e != 1) {
            return;
        }
        k1 f7 = k1Var.f(null);
        if (f7.f13638a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        k1 n12 = n1(f7, i10);
        this.J++;
        this.f13601l.f13744n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long a0() {
        F1();
        return i1(this.f13609p0);
    }

    @Override
    public final void b0(int i10, List list) {
        boolean z10;
        F1();
        ArrayList g12 = g1(list);
        F1();
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        int min = Math.min(i10, this.f13608p.size());
        if (this.f13609p0.f13638a.p()) {
            if (this.f13611q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        D1(e1(this.f13609p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final boolean c() {
        F1();
        return this.f13609p0.f13642g;
    }

    @Override
    public final void c0() {
        F1();
        if (this.f13585b0 == 0.0f) {
            float f7 = this.f13587c0;
            if (f7 != 0.0f) {
                U(f7);
            }
        }
    }

    @Override
    public final int d() {
        F1();
        return this.f13609p0.e;
    }

    @Override
    public final long d0() {
        F1();
        if (n()) {
            k1 k1Var = this.f13609p0;
            if (k1Var.f13645k.equals(k1Var.f13639b)) {
                return e2.n0.h0(this.f13609p0.f13651q);
            }
            return getDuration();
        }
        return F0();
    }

    public final k1 e1(k1 k1Var, int i10, ArrayList arrayList) {
        b2.p1 p1Var = k1Var.f13638a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f13608p;
            if (i11 < size) {
                i1 i1Var = new i1((u2.a) arrayList.get(i11), this.f13610q);
                arrayList2.add(i1Var);
                arrayList3.add(i11 + i10, new f0(i1Var.f13577b, i1Var.f13576a));
                i11++;
            } else {
                this.O = this.O.f(i10, arrayList2.size());
                p1 p1Var2 = new p1(arrayList3, this.O);
                k1 o12 = o1(k1Var, p1Var2, l1(p1Var, p1Var2, k1(k1Var), i1(k1Var)));
                u2.i1 i1Var2 = this.O;
                e2.i0 i0Var = this.f13601l.f13744n;
                n0 n0Var = new n0(arrayList2, i1Var2, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.f9668a = i0Var.f9672a.obtainMessage(18, i10, 0, n0Var);
                c10.b();
                return o12;
            }
        }
    }

    @Override
    public final void f(b2.a1 a1Var) {
        F1();
        if (this.f13609p0.f13649o.equals(a1Var)) {
            return;
        }
        k1 g7 = this.f13609p0.g(a1Var);
        this.J++;
        this.f13601l.f13744n.b(4, a1Var).b();
        D1(g7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.s0 f1() {
        boolean z10;
        b2.p1 y02 = y0();
        if (y02.p()) {
            return this.f13607o0;
        }
        b2.p0 p0Var = y02.m(n0(), (b2.o1) this.f3212a, 0L).f3327c;
        b2.r0 a2 = this.f13607o0.a();
        b2.s0 s0Var = p0Var.d;
        if (s0Var != null) {
            f9.i0 i0Var = s0Var.K;
            byte[] bArr = s0Var.f3417k;
            CharSequence charSequence = s0Var.f3410a;
            if (charSequence != null) {
                a2.f3362a = charSequence;
            }
            CharSequence charSequence2 = s0Var.f3411b;
            if (charSequence2 != null) {
                a2.f3363b = charSequence2;
            }
            CharSequence charSequence3 = s0Var.f3412c;
            if (charSequence3 != null) {
                a2.f3364c = charSequence3;
            }
            CharSequence charSequence4 = s0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = s0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = s0Var.f3413f;
            if (charSequence6 != null) {
                a2.f3365f = charSequence6;
            }
            CharSequence charSequence7 = s0Var.f3414g;
            if (charSequence7 != null) {
                a2.f3366g = charSequence7;
            }
            Long l4 = s0Var.h;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.g(z10);
                a2.h = l4;
            }
            b2.h1 h1Var = s0Var.f3415i;
            if (h1Var != null) {
                a2.f3367i = h1Var;
            }
            b2.h1 h1Var2 = s0Var.f3416j;
            if (h1Var2 != null) {
                a2.f3368j = h1Var2;
            }
            Uri uri = s0Var.f3420n;
            if (uri != null || bArr != null) {
                a2.f3372n = uri;
                a2.b(bArr, s0Var.f3419m);
                a2.f3370l = s0Var.f3418l;
            }
            Integer num = s0Var.f3421o;
            if (num != null) {
                a2.f3373o = num;
            }
            Integer num2 = s0Var.f3422p;
            if (num2 != null) {
                a2.f3374p = num2;
            }
            Integer num3 = s0Var.f3423q;
            if (num3 != null) {
                a2.f3375q = num3;
            }
            Boolean bool = s0Var.f3424r;
            if (bool != null) {
                a2.f3376r = bool;
            }
            Boolean bool2 = s0Var.f3425s;
            if (bool2 != null) {
                a2.f3377s = bool2;
            }
            Integer num4 = s0Var.f3426t;
            if (num4 != null) {
                a2.f3378t = num4;
            }
            Integer num5 = s0Var.f3427u;
            if (num5 != null) {
                a2.f3378t = num5;
            }
            Integer num6 = s0Var.v;
            if (num6 != null) {
                a2.f3379u = num6;
            }
            Integer num7 = s0Var.f3428w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = s0Var.f3429x;
            if (num8 != null) {
                a2.f3380w = num8;
            }
            Integer num9 = s0Var.f3430y;
            if (num9 != null) {
                a2.f3381x = num9;
            }
            Integer num10 = s0Var.f3431z;
            if (num10 != null) {
                a2.f3382y = num10;
            }
            CharSequence charSequence8 = s0Var.A;
            if (charSequence8 != null) {
                a2.f3383z = charSequence8;
            }
            CharSequence charSequence9 = s0Var.B;
            if (charSequence9 != null) {
                a2.A = charSequence9;
            }
            CharSequence charSequence10 = s0Var.C;
            if (charSequence10 != null) {
                a2.B = charSequence10;
            }
            Integer num11 = s0Var.D;
            if (num11 != null) {
                a2.C = num11;
            }
            Integer num12 = s0Var.E;
            if (num12 != null) {
                a2.D = num12;
            }
            CharSequence charSequence11 = s0Var.F;
            if (charSequence11 != null) {
                a2.E = charSequence11;
            }
            CharSequence charSequence12 = s0Var.G;
            if (charSequence12 != null) {
                a2.F = charSequence12;
            }
            CharSequence charSequence13 = s0Var.H;
            if (charSequence13 != null) {
                a2.G = charSequence13;
            }
            Integer num13 = s0Var.I;
            if (num13 != null) {
                a2.H = num13;
            }
            Bundle bundle = s0Var.J;
            if (bundle != null) {
                a2.I = bundle;
            }
            if (!i0Var.isEmpty()) {
                a2.J = f9.i0.u(i0Var);
            }
        }
        return new b2.s0(a2);
    }

    @Override
    public final void g0(int i10) {
        F1();
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f13612r.a((b2.p0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (n()) {
            k1 k1Var = this.f13609p0;
            u2.g0 g0Var = k1Var.f13639b;
            b2.p1 p1Var = k1Var.f13638a;
            Object obj = g0Var.f49297a;
            b2.m1 m1Var = this.f13606o;
            p1Var.g(obj, m1Var);
            return e2.n0.h0(m1Var.a(g0Var.f49298b, g0Var.f49299c));
        }
        return z();
    }

    @Override
    public final b2.a1 h() {
        F1();
        return this.f13609p0.f13649o;
    }

    @Override
    public final w1 h0() {
        F1();
        return this.f13609p0.f13643i.d;
    }

    public final n1 h1(m1 m1Var) {
        int k12 = k1(this.f13609p0);
        b2.p1 p1Var = this.f13609p0.f13638a;
        if (k12 == -1) {
            k12 = 0;
        }
        s0 s0Var = this.f13601l;
        return new n1(s0Var, m1Var, p1Var, k12, s0Var.f13751s);
    }

    @Override
    public final b2.s0 i0() {
        F1();
        return this.R;
    }

    public final long i1(k1 k1Var) {
        u2.g0 g0Var = k1Var.f13639b;
        long j10 = k1Var.f13640c;
        b2.p1 p1Var = k1Var.f13638a;
        if (g0Var.b()) {
            Object obj = k1Var.f13639b.f49297a;
            b2.m1 m1Var = this.f13606o;
            p1Var.g(obj, m1Var);
            if (j10 == -9223372036854775807L) {
                return e2.n0.h0(p1Var.m(k1(k1Var), (b2.o1) this.f3212a, 0L).f3333l);
            }
            return e2.n0.h0(j10) + e2.n0.h0(m1Var.e);
        }
        return e2.n0.h0(j1(k1Var));
    }

    @Override
    public final void j(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.f13601l.f13744n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f9668a = i0Var.f9672a.obtainMessage(11, i10, 0);
            c10.b();
            w wVar = new w(i10, 0);
            e2.r rVar = this.f13603m;
            rVar.c(8, wVar);
            B1();
            rVar.b();
        }
    }

    public final long j1(k1 k1Var) {
        long j10;
        if (k1Var.f13638a.p()) {
            return e2.n0.S(this.f13613r0);
        }
        if (k1Var.f13650p) {
            j10 = k1Var.l();
        } else {
            j10 = k1Var.f13653s;
        }
        if (k1Var.f13639b.b()) {
            return j10;
        }
        b2.p1 p1Var = k1Var.f13638a;
        Object obj = k1Var.f13639b.f49297a;
        b2.m1 m1Var = this.f13606o;
        p1Var.g(obj, m1Var);
        return j10 + m1Var.e;
    }

    @Override
    public final d2.c k0() {
        F1();
        return this.f13589e0;
    }

    public final int k1(k1 k1Var) {
        if (k1Var.f13638a.p()) {
            return this.f13611q0;
        }
        return k1Var.f13638a.g(k1Var.f13639b.f49297a, this.f13606o).f3280c;
    }

    @Override
    public final int l() {
        F1();
        return this.H;
    }

    public final Pair l1(b2.p1 p1Var, p1 p1Var2, int i10, long j10) {
        boolean z10;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        if (!p1Var.p() && !p1Var2.p()) {
            Pair i12 = p1Var.i((b2.o1) this.f3212a, this.f13606o, i10, e2.n0.S(j10));
            Object obj = i12.first;
            if (p1Var2.b(obj) != -1) {
                return i12;
            }
            int U = s0.U((b2.o1) this.f3212a, this.f13606o, this.H, this.I, obj, p1Var, p1Var2);
            if (U != -1) {
                b2.o1 o1Var = (b2.o1) this.f3212a;
                p1Var2.m(U, o1Var, 0L);
                return p1(p1Var2, U, e2.n0.h0(o1Var.f3333l));
            }
            return p1(p1Var2, -1, -9223372036854775807L);
        }
        if (!p1Var.p() && p1Var2.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = i10;
        }
        if (!z10) {
            j11 = j10;
        }
        return p1(p1Var2, i11, j11);
    }

    @Override
    public final int m() {
        F1();
        return 0;
    }

    @Override
    public final int m0() {
        F1();
        if (n()) {
            return this.f13609p0.f13639b.f49298b;
        }
        return -1;
    }

    @Override
    public final boolean n() {
        F1();
        return this.f13609p0.f13639b.b();
    }

    @Override
    public final int n0() {
        F1();
        int k12 = k1(this.f13609p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final k1 o1(k1 k1Var, b2.p1 p1Var, Pair pair) {
        boolean z10;
        u2.g0 g0Var;
        u2.r1 r1Var;
        x2.u uVar;
        List list;
        int i10;
        long j10;
        if (!p1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.g(z10);
        b2.p1 p1Var2 = k1Var.f13638a;
        long i12 = i1(k1Var);
        k1 j11 = k1Var.j(p1Var);
        if (p1Var.p()) {
            u2.g0 g0Var2 = k1.f13637u;
            long S = e2.n0.S(this.f13613r0);
            k1 c10 = j11.d(g0Var2, S, S, S, 0L, u2.r1.d, this.f13584b, f9.s1.e).c(g0Var2);
            c10.f13651q = c10.f13653s;
            return c10;
        }
        Object obj = j11.f13639b.f49297a;
        String str = e2.n0.f9692a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new u2.g0(pair.first);
        } else {
            g0Var = j11.f13639b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.n0.S(i12);
        if (!p1Var2.p()) {
            S2 -= p1Var2.g(obj, this.f13606o).e;
            if (equals && S2 - longValue == 1 && S2 == p1Var2.g(obj, this.f13606o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.g0 g0Var3 = g0Var;
            yb.p(!g0Var3.b());
            if (!equals) {
                r1Var = u2.r1.d;
            } else {
                r1Var = j11.h;
            }
            u2.r1 r1Var2 = r1Var;
            if (!equals) {
                uVar = this.f13584b;
            } else {
                uVar = j11.f13643i;
            }
            x2.u uVar2 = uVar;
            if (!equals) {
                f9.g0 g0Var4 = f9.i0.f10287b;
                list = f9.s1.e;
            } else {
                list = j11.f13644j;
            }
            k1 c11 = j11.d(g0Var3, longValue, longValue, longValue, 0L, r1Var2, uVar2, list).c(g0Var3);
            c11.f13651q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = p1Var.b(j11.f13645k.f49297a);
            if (b10 != -1 && p1Var.f(b10, this.f13606o, false).f3280c == p1Var.g(g0Var.f49297a, this.f13606o).f3280c) {
                return j11;
            }
            p1Var.g(g0Var.f49297a, this.f13606o);
            if (g0Var.b()) {
                j10 = this.f13606o.a(g0Var.f49298b, g0Var.f49299c);
            } else {
                j10 = this.f13606o.d;
            }
            u2.g0 g0Var5 = g0Var;
            k1 c12 = j11.d(g0Var5, j11.f13653s, j11.f13653s, j11.d, j10 - j11.f13653s, j11.h, j11.f13643i, j11.f13644j).c(g0Var5);
            c12.f13651q = j10;
            return c12;
        } else {
            u2.g0 g0Var6 = g0Var;
            yb.p(!g0Var6.b());
            long max = Math.max(0L, j11.f13652r - (longValue - S2));
            long j12 = j11.f13651q;
            if (j11.f13645k.equals(j11.f13639b)) {
                j12 = longValue + max;
            }
            k1 d = j11.d(g0Var6, longValue, longValue, longValue, max, j11.h, j11.f13643i, j11.f13644j);
            d.f13651q = j12;
            return d;
        }
    }

    @Override
    public final void p(b2.u1 u1Var) {
        F1();
        x2.t tVar = this.f13595i;
        tVar.getClass();
        b2.u1 E0 = E0();
        if (!u1Var.equals(((x2.o) tVar).j())) {
            tVar.b(u1Var);
        }
        if (!E0.equals(u1Var)) {
            this.f13603m.e(19, new e1.c(u1Var, 19));
        }
    }

    @Override
    public final void p0(b2.e1 e1Var) {
        e1Var.getClass();
        this.f13603m.a(e1Var);
    }

    public final Pair p1(b2.p1 p1Var, int i10, long j10) {
        if (p1Var.p()) {
            this.f13611q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f13613r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= p1Var.o()) {
            i10 = p1Var.a(this.I);
            j10 = e2.n0.h0(p1Var.m(i10, (b2.o1) this.f3212a, 0L).f3333l);
        }
        return p1Var.i((b2.o1) this.f3212a, this.f13606o, i10, e2.n0.S(j10));
    }

    @Override
    public final long q() {
        F1();
        return e2.n0.h0(this.f13609p0.f13652r);
    }

    @Override
    public final void q0(boolean z10) {
        F1();
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.f9736a && i11 == yVar.f9737b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        k81 k81Var = this.f13615s0;
        if (k81Var != null) {
            k81Var.execute(new v(this, i10, i11, 0));
            return;
        }
        this.f13603m.e(24, new fh.c(i10, i11, 1));
        t1(2, 14, new e2.y(i10, i11));
    }

    public final k1 r1(k1 k1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(k1Var);
        long i12 = i1(k1Var);
        b2.p1 p1Var = k1Var.f13638a;
        this.J++;
        int i13 = i11 - 1;
        while (true) {
            arrayList = this.f13608p;
            if (i13 < i10) {
                break;
            }
            arrayList.remove(i13);
            i13--;
        }
        this.O = this.O.a(i10, i11);
        p1 p1Var2 = new p1(arrayList, this.O);
        k1 o12 = o1(k1Var, p1Var2, l1(p1Var, p1Var2, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (s0.U((b2.o1) this.f3212a, this.f13606o, this.H, this.I, k1Var.f13639b.f49297a, p1Var, p1Var2) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.i1 i1Var = this.O;
        e2.i0 i0Var = this.f13601l.f13744n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f9668a = i0Var.f9672a.obtainMessage(20, i10, i11, i1Var);
        c10.b();
        return o12;
    }

    @Override
    public final b2.c1 s() {
        F1();
        return this.P;
    }

    public final void s1() {
        TextureView textureView = this.X;
        d0 d0Var = this.f13619w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != d0Var) {
                e2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(d0Var);
            this.V = null;
        }
    }

    @Override
    public final void stop() {
        F1();
        A1(null);
        this.f13589e0 = new d2.c(this.f13609p0.f13653s, f9.s1.e);
    }

    @Override
    public final boolean t() {
        F1();
        return this.f13609p0.f13646l;
    }

    @Override
    public final void t0(int i10, int i11, int i12) {
        boolean z10;
        F1();
        if (i10 >= 0 && i10 <= i11 && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        ArrayList arrayList = this.f13608p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.p1 y02 = y0();
            this.J++;
            e2.n0.R(i10, min, min2, arrayList);
            this.O = this.O.g();
            p1 p1Var = new p1(arrayList, this.O);
            k1 k1Var = this.f13609p0;
            k1 o12 = o1(k1Var, p1Var, l1(y02, p1Var, k1(k1Var), i1(this.f13609p0)));
            u2.i1 i1Var = this.O;
            s0 s0Var = this.f13601l;
            s0Var.getClass();
            s0Var.f13744n.b(19, new o0(i10, min, min2, i1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(int i10, int i11, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f13592g) {
            if (i10 == -1 || bVar.f13491b == i10) {
                n1 h12 = h1(bVar);
                yb.p(!h12.f13669f);
                h12.f13668c = i11;
                yb.p(!h12.f13669f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.f13491b == i10)) {
                n1 h13 = h1(bVar2);
                yb.p(!h13.f13669f);
                h13.f13668c = i11;
                yb.p(!h13.f13669f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    public final void u1(u2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-9223372036854775807L, singletonList, z10, -1);
    }

    public final void v1(long r15, java.util.List r17, boolean r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: i2.j0.v1(long, java.util.List, boolean, int):void");
    }

    @Override
    public final void w(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            e2.i0 i0Var = this.f13601l.f13744n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f9668a = i0Var.f9672a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            y yVar = new y(0, z10);
            e2.r rVar = this.f13603m;
            rVar.c(9, yVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final int w0() {
        F1();
        return this.f13609p0.f13648n;
    }

    public final void w1(t1 t1Var) {
        F1();
        if (t1Var == null) {
            t1Var = t1.f13767f;
        }
        if (!this.N.equals(t1Var)) {
            this.N = t1Var;
            this.f13601l.f13744n.b(5, t1Var).b();
        }
    }

    public final void x1(Surface surface) {
        boolean z10;
        long j10;
        Object obj = this.T;
        boolean z11 = true;
        if (obj != null && obj != surface) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j10 = this.B;
        } else {
            j10 = -9223372036854775807L;
        }
        s0 s0Var = this.f13601l;
        if (!s0Var.Z && s0Var.f13751s.getThread().isAlive()) {
            e2.i iVar = new e2.i(s0Var.F);
            s0Var.f13744n.b(30, new Pair(surface, iVar)).b();
            if (j10 != -9223372036854775807L) {
                z11 = iVar.c(j10);
            }
        }
        if (z10) {
            Object obj2 = this.T;
            Surface surface2 = this.U;
            if (obj2 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused) {
                }
                this.U = null;
            }
        }
        this.T = surface;
        if (!z11) {
            A1(new m(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final long y() {
        F1();
        return this.f13605n0;
    }

    @Override
    public final b2.p1 y0() {
        F1();
        return this.f13609p0.f13638a;
    }

    public final void y1(Surface surface) {
        int i10;
        F1();
        s1();
        x1(surface);
        if (surface == null) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        q1(i10, i10);
    }

    @Override
    public final boolean z0() {
        F1();
        return false;
    }

    public final void z1(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        F1();
        if (textureView == null) {
            F1();
            s1();
            x1(null);
            q1(0, 0);
            return;
        }
        s1();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            e2.a.l("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f13619w);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            x1(null);
            q1(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        x1(surface);
        this.U = surface;
        q1(textureView.getWidth(), textureView.getHeight());
    }
}
