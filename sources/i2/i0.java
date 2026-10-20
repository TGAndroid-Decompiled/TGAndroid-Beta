package i2;

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
import b2.a2;
import b2.v1;
import e9.x1;
import ei.bc;
import hg.b2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.u6;
public final class i0 extends ai.c1 implements r {
    public final bi.a A;
    public final long B;
    public final e2.c C;
    public final e2.e0 D;
    public final h0 E;
    public final n4.s F;
    public final n4.s G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final r1 M;
    public s1 N;
    public u2.j1 O;
    public b2.b1 P;
    public b2.r0 Q;
    public b2.r0 R;
    public b2.w S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public e2.y Z;
    public b2.f f12382a0;
    public final x2.t f12383b;
    public float f12384b0;
    public final b2.b1 f12385c;
    public float f12386c0;
    public final e2.i d;
    public boolean f12387d0;
    public final Context e;
    public d2.c f12388e0;
    public final i0 f12389f;
    public final boolean f12390f0;
    public final b[] f12391g;
    public boolean f12392g0;
    public final b[] h;
    public final int f12393h0;
    public final x2.s f12394i;
    public boolean f12395i0;
    public final e2.i0 f12396j;
    public final b2.p f12397j0;
    public final x f12398k;
    public a2 f12399k0;
    public final r0 f12400l;
    public final long f12401l0;
    public final e2.r f12402m;
    public final long m0;
    public final CopyOnWriteArraySet f12403n;
    public final long f12404n0;
    public final b2.l1 f12405o;
    public b2.r0 f12406o0;
    public final ArrayList f12407p;
    public j1 f12408p0;
    public final boolean f12409q;
    public int f12410q0;
    public final u2.f0 f12411r;
    public long f12412r0;
    public final j2.f f12413s;
    public org.telegram.messenger.g1 f12414s0;
    public final Looper f12415t;
    public final ArrayList f12416t0;
    public final y2.c f12417u;
    public final e2.g0 v;
    public final c0 f12418w;
    public final d0 f12419x;
    public final c2.b f12420y;
    public final ac.a f12421z;

    static {
        b2.p0.a("media3.exoplayer");
    }

    public i0(i2.p r34) {
        throw new UnsupportedOperationException("Method not decompiled: i2.i0.<init>(i2.p):void");
    }

    public static long m1(j1 j1Var) {
        b2.n1 n1Var = new b2.n1();
        b2.l1 l1Var = new b2.l1();
        j1Var.f12449a.g(j1Var.f12450b.f47314a, l1Var);
        long j10 = j1Var.f12451c;
        if (j10 == -9223372036854775807L) {
            return j1Var.f12449a.m(l1Var.f3822c, n1Var, 0L).f3875l;
        }
        return l1Var.e + j10;
    }

    public static j1 n1(j1 j1Var, int i10) {
        j1 h = j1Var.h(i10);
        if (i10 != 1 && i10 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final int A() {
        F1();
        if (this.f12408p0.f12449a.p()) {
            int i10 = this.f12410q0;
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }
        j1 j1Var = this.f12408p0;
        return j1Var.f12449a.b(j1Var.f12450b.f47314a);
    }

    @Override
    public final Looper A0() {
        return this.f12415t;
    }

    public final void A1(n nVar) {
        j1 j1Var = this.f12408p0;
        j1 c10 = j1Var.c(j1Var.f12450b);
        c10.f12462q = c10.f12464s;
        c10.f12463r = 0L;
        j1 n12 = n1(c10, 1);
        if (nVar != null) {
            n12 = n12.f(nVar);
        }
        this.J++;
        this.f12400l.f12558n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void B(b2.r0 r0Var) {
        F1();
        r0Var.getClass();
        if (r0Var.equals(this.R)) {
            return;
        }
        this.R = r0Var;
        this.f12402m.e(15, new x(this, 4));
    }

    @Override
    public final void B0() {
        F1();
        if (this.f12384b0 != 0.0f) {
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
        b2.b1 b1Var = this.P;
        String str = e2.m0.f8252a;
        i0 i0Var = this.f12389f;
        boolean n10 = i0Var.n();
        boolean e02 = i0Var.e0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean v02 = i0Var.v0();
        boolean p5 = i0Var.y0().p();
        ?? obj = new Object();
        obj.f3690a = new b2.t();
        b2.t tVar = (b2.t) obj.f3690a;
        tVar.c(this.f12385c.f3700a);
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
        if (!p5 && ((T0 || !P0 || e02) && !n10)) {
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
        if (!p5 && ((S0 || (P0 && v02)) && !n10)) {
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
        b2.b1 b1Var2 = new b2.b1(tVar.d());
        this.P = b1Var2;
        if (!b1Var2.equals(b1Var)) {
            this.f12402m.c(13, new x(this, 3));
        }
    }

    @Override
    public final void C(b2.d1 d1Var) {
        boolean z10;
        F1();
        d1Var.getClass();
        e2.r rVar = this.f12402m;
        if (rVar.f8277i) {
            if (Thread.currentThread() == rVar.f8272a) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.q qVar = (e2.q) it.next();
            if (qVar.f8269a.equals(d1Var)) {
                e2.p pVar = rVar.f8274c;
                qVar.d = true;
                if (pVar != null && qVar.f8271c) {
                    qVar.f8271c = false;
                    pVar.c(qVar.f8269a, qVar.f8270b.d());
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
        j1 j1Var = this.f12408p0;
        int i12 = j1Var.f12459n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (j1Var.f12457l == z10 && i12 == i11 && j1Var.f12458m == i10) {
            return;
        }
        this.J++;
        if (j1Var.f12461p) {
            j1Var = j1Var.a();
        }
        j1 e = j1Var.e(i10, i11, z10);
        e2.i0 i0Var = this.f12400l.f12558n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8233a = i0Var.f8237a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final a2 D() {
        F1();
        return this.f12399k0;
    }

    @Override
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final j1 j1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.o0 o0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        int i15;
        Object obj;
        b2.o0 o0Var2;
        Object obj2;
        long j11;
        long j12;
        long j13;
        long m12;
        Object obj3;
        b2.o0 o0Var3;
        Object obj4;
        long j14;
        j1 j1Var2 = this.f12408p0;
        this.f12408p0 = j1Var;
        boolean equals = j1Var2.f12449a.equals(j1Var.f12449a);
        b2.n1 n1Var = (b2.n1) this.f1067a;
        b2.l1 l1Var = this.f12405o;
        b2.o1 o1Var = j1Var2.f12449a;
        u2.g0 g0Var = j1Var2.f12450b;
        b2.o1 o1Var2 = j1Var.f12449a;
        u2.g0 g0Var2 = j1Var.f12450b;
        if (o1Var2.p() && o1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o1Var2.p() != o1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!o1Var.m(o1Var.g(g0Var.f47314a, l1Var).f3822c, n1Var, 0L).f3867a.equals(o1Var2.m(o1Var2.g(g0Var2.f47314a, l1Var).f3822c, n1Var, 0L).f3867a)) {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else if (!equals) {
                i13 = 3;
            } else {
                throw new IllegalStateException();
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
            if (!j1Var.f12449a.p()) {
                o0Var = j1Var.f12449a.m(j1Var.f12449a.g(j1Var.f12450b.f47314a, this.f12405o).f3822c, (b2.n1) this.f1067a, 0L).f3869c;
            } else {
                o0Var = null;
            }
            this.f12406o0 = b2.r0.L;
        } else {
            o0Var = null;
        }
        if (booleanValue || !j1Var2.f12455j.equals(j1Var.f12455j)) {
            b2.q0 a2 = this.f12406o0.a();
            List list = j1Var.f12455j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.t0 t0Var = (b2.t0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.s0[] s0VarArr = t0Var.f4007a;
                    if (i17 < s0VarArr.length) {
                        s0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.f12406o0 = new b2.r0(a2);
        }
        b2.r0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (j1Var2.f12457l != j1Var.f12457l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j1Var2.e != j1Var.e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (j1Var2.f12453g != j1Var.f12453g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f12402m.c(0, new s(j1Var, i10, 0));
        }
        if (z10) {
            b2.l1 l1Var2 = new b2.l1();
            if (!j1Var2.f12449a.p()) {
                Object obj5 = j1Var2.f12450b.f47314a;
                j1Var2.f12449a.g(obj5, l1Var2);
                int i18 = l1Var2.f3822c;
                int b10 = j1Var2.f12449a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = j1Var2.f12449a.m(i18, (b2.n1) this.f1067a, 0L).f3867a;
                o0Var2 = ((b2.n1) this.f1067a).f3869c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            } else {
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                i14 = i12;
                i15 = i14;
                obj = null;
                o0Var2 = null;
                obj2 = null;
            }
            if (i11 == 0) {
                if (j1Var2.f12450b.b()) {
                    u2.g0 g0Var3 = j1Var2.f12450b;
                    j13 = l1Var2.a(g0Var3.f47315b, g0Var3.f47316c);
                    m12 = m1(j1Var2);
                } else if (j1Var2.f12450b.e != -1) {
                    j13 = m1(this.f12408p0);
                    m12 = j13;
                } else {
                    j11 = l1Var2.e;
                    j12 = l1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (j1Var2.f12450b.b()) {
                j13 = j1Var2.f12464s;
                m12 = m1(j1Var2);
            } else {
                j11 = l1Var2.e;
                j12 = j1Var2.f12464s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.m0.h0(j13);
            long h03 = e2.m0.h0(m12);
            u2.g0 g0Var4 = j1Var2.f12450b;
            b2.e1 e1Var = new b2.e1(obj, i14, o0Var2, obj2, i15, h02, h03, g0Var4.f47315b, g0Var4.f47316c);
            b2.n1 n1Var2 = (b2.n1) this.f1067a;
            int n02 = n0();
            int A = A();
            if (!this.f12408p0.f12449a.p()) {
                j1 j1Var3 = this.f12408p0;
                Object obj6 = j1Var3.f12450b.f47314a;
                j1Var3.f12449a.g(obj6, this.f12405o);
                A = this.f12408p0.f12449a.b(obj6);
                Object obj7 = this.f12408p0.f12449a.m(n02, n1Var2, 0L).f3867a;
                o0Var3 = n1Var2.f3869c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                o0Var3 = null;
                obj4 = null;
            }
            int i19 = A;
            long h04 = e2.m0.h0(j10);
            if (this.f12408p0.f12450b.b()) {
                j14 = e2.m0.h0(m1(this.f12408p0));
            } else {
                j14 = h04;
            }
            u2.g0 g0Var5 = this.f12408p0.f12450b;
            this.f12402m.c(11, new b2(i11, e1Var, new b2.e1(obj3, n02, o0Var3, obj4, i19, h04, j14, g0Var5.f47315b, g0Var5.f47316c), 1));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f12402m.c(1, new s(o0Var, intValue, 1));
        }
        if (j1Var2.f12452f != j1Var.f12452f) {
            this.f12402m.c(10, new e2.o() {
                @Override
                public final void invoke(Object obj8) {
                    b2.d1 d1Var = (b2.d1) obj8;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
            if (j1Var.f12452f != null) {
                this.f12402m.c(10, new e2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.d1 d1Var = (b2.d1) obj8;
                        switch (r2) {
                            case 0:
                                j1 j1Var4 = j1Var;
                                d1Var.onLoadingChanged(j1Var4.f12453g);
                                d1Var.onIsLoadingChanged(j1Var4.f12453g);
                                return;
                            case 1:
                                j1 j1Var5 = j1Var;
                                d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                                return;
                            case 2:
                                d1Var.onPlaybackStateChanged(j1Var.e);
                                return;
                            case 3:
                                j1 j1Var6 = j1Var;
                                d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                                return;
                            case 4:
                                d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                                return;
                            case 5:
                                d1Var.onIsPlayingChanged(j1Var.m());
                                return;
                            case 6:
                                d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                                return;
                            case 7:
                                d1Var.onPlayerErrorChanged(j1Var.f12452f);
                                return;
                            case 8:
                                d1Var.onPlayerError(j1Var.f12452f);
                                return;
                            default:
                                d1Var.onTracksChanged(j1Var.f12454i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.t tVar = j1Var2.f12454i;
        x2.t tVar2 = j1Var.f12454i;
        if (tVar != tVar2) {
            x2.s sVar = this.f12394i;
            Object obj8 = tVar2.e;
            sVar.getClass();
            sVar.f49183c = (x2.r) obj8;
            this.f12402m.c(2, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f12402m.c(14, new t(this.Q));
        }
        if (z14) {
            this.f12402m.c(3, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f12402m.c(-1, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f12402m.c(4, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || j1Var2.f12458m != j1Var.f12458m) {
            this.f12402m.c(5, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (j1Var2.f12459n != j1Var.f12459n) {
            this.f12402m.c(6, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (j1Var2.m() != j1Var.m()) {
            this.f12402m.c(7, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        if (!j1Var2.f12460o.equals(j1Var.f12460o)) {
            this.f12402m.c(12, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            d1Var.onLoadingChanged(j1Var4.f12453g);
                            d1Var.onIsLoadingChanged(j1Var4.f12453g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            d1Var.onPlayerStateChanged(j1Var5.f12457l, j1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(j1Var.e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            d1Var.onPlayWhenReadyChanged(j1Var6.f12457l, j1Var6.f12458m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(j1Var.f12459n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(j1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(j1Var.f12460o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(j1Var.f12452f);
                            return;
                        case 8:
                            d1Var.onPlayerError(j1Var.f12452f);
                            return;
                        default:
                            d1Var.onTracksChanged(j1Var.f12454i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f12402m.b();
        if (j1Var2.f12461p != j1Var.f12461p) {
            Iterator it = this.f12403n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f12325a.E1();
            }
        }
    }

    @Override
    public final b2.t1 E0() {
        F1();
        return ((x2.n) this.f12394i).j();
    }

    public final void E1() {
        int d = d();
        bi.a aVar = this.A;
        ac.a aVar2 = this.f12421z;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f12408p0.f12461p;
                if (t() && !z11) {
                    z10 = true;
                }
                aVar2.c(z10);
                aVar.a(t());
                return;
            }
        }
        aVar2.c(false);
        aVar.a(false);
    }

    @Override
    public final float F() {
        F1();
        return this.f12384b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f12408p0.f12449a.p()) {
            return this.f12412r0;
        }
        j1 j1Var = this.f12408p0;
        long j10 = 0;
        if (j1Var.f12456k.d != j1Var.f12450b.d) {
            return e2.m0.h0(j1Var.f12449a.m(n0(), (b2.n1) this.f1067a, 0L).f3876m);
        }
        long j11 = j1Var.f12462q;
        if (this.f12408p0.f12456k.b()) {
            j1 j1Var2 = this.f12408p0;
            j1Var2.f12449a.g(j1Var2.f12456k.f47314a, this.f12405o).d(this.f12408p0.f12456k.f47315b);
        } else {
            j10 = j11;
        }
        j1 j1Var3 = this.f12408p0;
        b2.o1 o1Var = j1Var3.f12449a;
        Object obj = j1Var3.f12456k.f47314a;
        b2.l1 l1Var = this.f12405o;
        o1Var.g(obj, l1Var);
        return e2.m0.h0(j10 + l1Var.e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f12415t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.m0.f8252a;
            Locale locale = Locale.US;
            String k10 = org.telegram.ui.Cells.c1.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f12390f0) {
                if (this.f12392g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.m("ExoPlayerImpl", k10, illegalStateException);
                this.f12392g0 = true;
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
        return this.f12382a0;
    }

    @Override
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override
    public final b2.p J() {
        F1();
        return this.f12397j0;
    }

    @Override
    public final void K() {
        F1();
    }

    @Override
    public final b2.r0 K0() {
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
        return e2.m0.h0(j1(this.f12408p0));
    }

    @Override
    public final int N() {
        F1();
        if (n()) {
            return this.f12408p0.f12450b.f47316c;
        }
        return -1;
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        F1();
        if (this.f12395i0) {
            return;
        }
        boolean equals = Objects.equals(this.f12382a0, fVar);
        e2.r rVar = this.f12402m;
        if (!equals) {
            this.f12382a0 = fVar;
            t1(1, 3, fVar);
            rVar.c(20, new e1.c(fVar, 14));
        }
        b2.f fVar2 = this.f12382a0;
        e2.i0 i0Var = this.f12400l.f12558n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8233a = i0Var.f8237a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final void O(int i10, int i11, List list) {
        boolean z10;
        u2.r1 r1Var;
        F1();
        boolean z11 = false;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        ArrayList arrayList = this.f12407p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((e0) arrayList.get(i12)).f12337b.f47454k.a((b2.o0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.f12400l.f12558n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8233a = i0Var.f8237a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                b2.o1 o1Var = e0Var.f12338c;
                b2.o0 o0Var = (b2.o0) list.get(i13 - i10);
                if (o1Var instanceof u2.r1) {
                    r1Var = new u2.r1(((u2.r1) o1Var).e, o0Var);
                } else {
                    r1Var = new u2.r1(o1Var, o0Var);
                }
                e0Var.f12338c = r1Var;
            }
            D1(this.f12408p0.j(new o1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f12408p0.f12449a.p()) {
            if (this.f12410q0 == -1) {
                z11 = true;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        j1 r12 = r1(e1(this.f12408p0, min, g12), i10, min);
        D1(r12, 0, !r12.f12450b.f47314a.equals(this.f12408p0.f12450b.f47314a), 4, j1(r12), -1, false);
    }

    @Override
    public final long O0() {
        F1();
        return this.f12401l0;
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
        u6.g(z10);
        int size = this.f12407p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            j1 r12 = r1(this.f12408p0, i10, min);
            D1(r12, 0, !r12.f12450b.f47314a.equals(this.f12408p0.f12450b.f47314a), 4, j1(r12), -1, false);
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
        surfaceHolder.addCallback(this.f12418w);
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
        float h = e2.m0.h(f7, 0.0f, 1.0f);
        float f10 = this.f12384b0;
        if (f10 == h) {
            return;
        }
        if (h != 0.0f) {
            f10 = h;
        }
        this.f12386c0 = f10;
        this.f12384b0 = h;
        this.f12400l.f12558n.b(32, Float.valueOf(h)).b();
        this.f12402m.e(22, new v(h, 0));
    }

    @Override
    public final b2.y0 W() {
        F1();
        return this.f12408p0.f12452f;
    }

    @Override
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8252a + "] [" + b2.p0.b() + "]");
        F1();
        this.f12420y.w();
        this.f12421z.c(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f8217f.f8237a.removeCallbacksAndMessages(null);
        e0Var.f8214a.C(e0Var.f8215b);
        r0 r0Var = this.f12400l;
        if (!r0Var.Z && r0Var.f12565s.getThread().isAlive()) {
            r0Var.Z = true;
            e2.i iVar = new e2.i(r0Var.F);
            r0Var.f12558n.b(7, iVar).b();
            z10 = iVar.c(r0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f12402m.e(10, new fh.b(22));
        }
        this.f12402m.d();
        this.f12396j.f8237a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f12417u;
        j2.f fVar = this.f12413s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f49913c.f47004b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f49898b == fVar) {
                bVar.f49899c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        j1 j1Var = this.f12408p0;
        if (j1Var.f12461p) {
            this.f12408p0 = j1Var.a();
        }
        j1 n12 = n1(this.f12408p0, 1);
        this.f12408p0 = n12;
        j1 c10 = n12.c(n12.f12450b);
        this.f12408p0 = c10;
        c10.f12462q = c10.f12464s;
        this.f12408p0.f12463r = 0L;
        j2.f fVar2 = this.f12413s;
        e2.i0 i0Var = fVar2.f13943n;
        i0Var.getClass();
        i0Var.d(new bc(fVar2, 25));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f12388e0 = d2.c.d;
        this.f12395i0 = true;
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
            u6.g(z11);
            b2.o1 o1Var = this.f12408p0.f12449a;
            if (!o1Var.p() && i10 >= o1Var.o()) {
                return;
            }
            j2.f fVar = this.f12413s;
            if (!fVar.f13944r) {
                j2.a l4 = fVar.l();
                fVar.f13944r = true;
                fVar.q(l4, -1, new e1.c(l4, 25));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.f12408p0);
                o0Var.f(1);
                i0 i0Var = this.f12398k.f12602b;
                i0Var.f12396j.d(new hi.t(1, i0Var, o0Var));
                return;
            }
            j1 j1Var = this.f12408p0;
            int i11 = j1Var.e;
            if (i11 == 3 || (i11 == 4 && !o1Var.p())) {
                j1Var = this.f12408p0.h(2);
            }
            int n02 = n0();
            j1 o12 = o1(j1Var, o1Var, p1(o1Var, i10, j10));
            this.f12400l.f12558n.b(3, new q0(o1Var, i10, e2.m0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), n02, z10);
        }
    }

    @Override
    public final long Z() {
        F1();
        return this.m0;
    }

    @Override
    public final long a0() {
        F1();
        return i1(this.f12408p0);
    }

    @Override
    public final void b() {
        int i10;
        F1();
        j1 j1Var = this.f12408p0;
        if (j1Var.e != 1) {
            return;
        }
        j1 f7 = j1Var.f(null);
        if (f7.f12449a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        j1 n12 = n1(f7, i10);
        this.J++;
        this.f12400l.f12558n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
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
        u6.g(z10);
        int min = Math.min(i10, this.f12407p.size());
        if (this.f12408p0.f12449a.p()) {
            if (this.f12410q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        D1(e1(this.f12408p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final boolean c() {
        F1();
        return this.f12408p0.f12453g;
    }

    @Override
    public final void c0() {
        F1();
        if (this.f12384b0 == 0.0f) {
            float f7 = this.f12386c0;
            if (f7 != 0.0f) {
                U(f7);
            }
        }
    }

    @Override
    public final int d() {
        F1();
        return this.f12408p0.e;
    }

    @Override
    public final long d0() {
        F1();
        if (n()) {
            j1 j1Var = this.f12408p0;
            if (j1Var.f12456k.equals(j1Var.f12450b)) {
                return e2.m0.h0(this.f12408p0.f12462q);
            }
            return getDuration();
        }
        return F0();
    }

    public final j1 e1(j1 j1Var, int i10, ArrayList arrayList) {
        b2.o1 o1Var = j1Var.f12449a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f12407p;
            if (i11 < size) {
                h1 h1Var = new h1((u2.a) arrayList.get(i11), this.f12409q);
                arrayList2.add(h1Var);
                arrayList3.add(i11 + i10, new e0(h1Var.f12377b, h1Var.f12376a));
                i11++;
            } else {
                this.O = this.O.f(i10, arrayList2.size());
                o1 o1Var2 = new o1(arrayList3, this.O);
                j1 o12 = o1(j1Var, o1Var2, l1(o1Var, o1Var2, k1(j1Var), i1(j1Var)));
                u2.j1 j1Var2 = this.O;
                e2.i0 i0Var = this.f12400l.f12558n;
                m0 m0Var = new m0(arrayList2, j1Var2, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.f8233a = i0Var.f8237a.obtainMessage(18, i10, 0, m0Var);
                c10.b();
                return o12;
            }
        }
    }

    @Override
    public final void f(b2.z0 z0Var) {
        F1();
        if (this.f12408p0.f12460o.equals(z0Var)) {
            return;
        }
        j1 g10 = this.f12408p0.g(z0Var);
        this.J++;
        this.f12400l.f12558n.b(4, z0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.r0 f1() {
        boolean z10;
        b2.o1 y02 = y0();
        if (y02.p()) {
            return this.f12406o0;
        }
        b2.o0 o0Var = y02.m(n0(), (b2.n1) this.f1067a, 0L).f3869c;
        b2.q0 a2 = this.f12406o0.a();
        b2.r0 r0Var = o0Var.d;
        if (r0Var != null) {
            e9.n0 n0Var = r0Var.K;
            byte[] bArr = r0Var.f3959k;
            CharSequence charSequence = r0Var.f3952a;
            if (charSequence != null) {
                a2.f3904a = charSequence;
            }
            CharSequence charSequence2 = r0Var.f3953b;
            if (charSequence2 != null) {
                a2.f3905b = charSequence2;
            }
            CharSequence charSequence3 = r0Var.f3954c;
            if (charSequence3 != null) {
                a2.f3906c = charSequence3;
            }
            CharSequence charSequence4 = r0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = r0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = r0Var.f3955f;
            if (charSequence6 != null) {
                a2.f3907f = charSequence6;
            }
            CharSequence charSequence7 = r0Var.f3956g;
            if (charSequence7 != null) {
                a2.f3908g = charSequence7;
            }
            Long l4 = r0Var.h;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.g(z10);
                a2.h = l4;
            }
            b2.g1 g1Var = r0Var.f3957i;
            if (g1Var != null) {
                a2.f3909i = g1Var;
            }
            b2.g1 g1Var2 = r0Var.f3958j;
            if (g1Var2 != null) {
                a2.f3910j = g1Var2;
            }
            Uri uri = r0Var.f3962n;
            if (uri != null || bArr != null) {
                a2.f3914n = uri;
                a2.b(bArr, r0Var.f3961m);
                a2.f3912l = r0Var.f3960l;
            }
            Integer num = r0Var.f3963o;
            if (num != null) {
                a2.f3915o = num;
            }
            Integer num2 = r0Var.f3964p;
            if (num2 != null) {
                a2.f3916p = num2;
            }
            Integer num3 = r0Var.f3965q;
            if (num3 != null) {
                a2.f3917q = num3;
            }
            Boolean bool = r0Var.f3966r;
            if (bool != null) {
                a2.f3918r = bool;
            }
            Boolean bool2 = r0Var.f3967s;
            if (bool2 != null) {
                a2.f3919s = bool2;
            }
            Integer num4 = r0Var.f3968t;
            if (num4 != null) {
                a2.f3920t = num4;
            }
            Integer num5 = r0Var.f3969u;
            if (num5 != null) {
                a2.f3920t = num5;
            }
            Integer num6 = r0Var.v;
            if (num6 != null) {
                a2.f3921u = num6;
            }
            Integer num7 = r0Var.f3970w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = r0Var.f3971x;
            if (num8 != null) {
                a2.f3922w = num8;
            }
            Integer num9 = r0Var.f3972y;
            if (num9 != null) {
                a2.f3923x = num9;
            }
            Integer num10 = r0Var.f3973z;
            if (num10 != null) {
                a2.f3924y = num10;
            }
            CharSequence charSequence8 = r0Var.A;
            if (charSequence8 != null) {
                a2.f3925z = charSequence8;
            }
            CharSequence charSequence9 = r0Var.B;
            if (charSequence9 != null) {
                a2.A = charSequence9;
            }
            CharSequence charSequence10 = r0Var.C;
            if (charSequence10 != null) {
                a2.B = charSequence10;
            }
            Integer num11 = r0Var.D;
            if (num11 != null) {
                a2.C = num11;
            }
            Integer num12 = r0Var.E;
            if (num12 != null) {
                a2.D = num12;
            }
            CharSequence charSequence11 = r0Var.F;
            if (charSequence11 != null) {
                a2.E = charSequence11;
            }
            CharSequence charSequence12 = r0Var.G;
            if (charSequence12 != null) {
                a2.F = charSequence12;
            }
            CharSequence charSequence13 = r0Var.H;
            if (charSequence13 != null) {
                a2.G = charSequence13;
            }
            Integer num13 = r0Var.I;
            if (num13 != null) {
                a2.H = num13;
            }
            Bundle bundle = r0Var.J;
            if (bundle != null) {
                a2.I = bundle;
            }
            if (!n0Var.isEmpty()) {
                a2.J = e9.n0.u(n0Var);
            }
        }
        return new b2.r0(a2);
    }

    @Override
    public final void g0(int i10) {
        F1();
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f12411r.a((b2.o0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (n()) {
            j1 j1Var = this.f12408p0;
            u2.g0 g0Var = j1Var.f12450b;
            b2.o1 o1Var = j1Var.f12449a;
            Object obj = g0Var.f47314a;
            b2.l1 l1Var = this.f12405o;
            o1Var.g(obj, l1Var);
            return e2.m0.h0(l1Var.a(g0Var.f47315b, g0Var.f47316c));
        }
        return z();
    }

    @Override
    public final b2.z0 h() {
        F1();
        return this.f12408p0.f12460o;
    }

    @Override
    public final v1 h0() {
        F1();
        return this.f12408p0.f12454i.d;
    }

    public final m1 h1(l1 l1Var) {
        int k12 = k1(this.f12408p0);
        b2.o1 o1Var = this.f12408p0.f12449a;
        if (k12 == -1) {
            k12 = 0;
        }
        r0 r0Var = this.f12400l;
        return new m1(r0Var, l1Var, o1Var, k12, r0Var.f12565s);
    }

    @Override
    public final b2.r0 i0() {
        F1();
        return this.R;
    }

    public final long i1(j1 j1Var) {
        u2.g0 g0Var = j1Var.f12450b;
        long j10 = j1Var.f12451c;
        b2.o1 o1Var = j1Var.f12449a;
        if (g0Var.b()) {
            Object obj = j1Var.f12450b.f47314a;
            b2.l1 l1Var = this.f12405o;
            o1Var.g(obj, l1Var);
            if (j10 == -9223372036854775807L) {
                return e2.m0.h0(o1Var.m(k1(j1Var), (b2.n1) this.f1067a, 0L).f3875l);
            }
            return e2.m0.h0(j10) + e2.m0.h0(l1Var.e);
        }
        return e2.m0.h0(j1(j1Var));
    }

    @Override
    public final void j(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.f12400l.f12558n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8233a = i0Var.f8237a.obtainMessage(11, i10, 0);
            c10.b();
            w wVar = new w(i10, 0);
            e2.r rVar = this.f12402m;
            rVar.c(8, wVar);
            B1();
            rVar.b();
        }
    }

    public final long j1(j1 j1Var) {
        long j10;
        if (j1Var.f12449a.p()) {
            return e2.m0.S(this.f12412r0);
        }
        if (j1Var.f12461p) {
            j10 = j1Var.l();
        } else {
            j10 = j1Var.f12464s;
        }
        if (j1Var.f12450b.b()) {
            return j10;
        }
        b2.o1 o1Var = j1Var.f12449a;
        Object obj = j1Var.f12450b.f47314a;
        b2.l1 l1Var = this.f12405o;
        o1Var.g(obj, l1Var);
        return j10 + l1Var.e;
    }

    @Override
    public final d2.c k0() {
        F1();
        return this.f12388e0;
    }

    public final int k1(j1 j1Var) {
        if (j1Var.f12449a.p()) {
            return this.f12410q0;
        }
        return j1Var.f12449a.g(j1Var.f12450b.f47314a, this.f12405o).f3822c;
    }

    @Override
    public final int l() {
        F1();
        return this.H;
    }

    public final Pair l1(b2.o1 o1Var, o1 o1Var2, int i10, long j10) {
        boolean z10;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        if (!o1Var.p() && !o1Var2.p()) {
            Pair i12 = o1Var.i((b2.n1) this.f1067a, this.f12405o, i10, e2.m0.S(j10));
            Object obj = i12.first;
            if (o1Var2.b(obj) != -1) {
                return i12;
            }
            int U = r0.U((b2.n1) this.f1067a, this.f12405o, this.H, this.I, obj, o1Var, o1Var2);
            if (U != -1) {
                b2.n1 n1Var = (b2.n1) this.f1067a;
                o1Var2.m(U, n1Var, 0L);
                return p1(o1Var2, U, e2.m0.h0(n1Var.f3875l));
            }
            return p1(o1Var2, -1, -9223372036854775807L);
        }
        if (!o1Var.p() && o1Var2.p()) {
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
        return p1(o1Var2, i11, j11);
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
            return this.f12408p0.f12450b.f47315b;
        }
        return -1;
    }

    @Override
    public final boolean n() {
        F1();
        return this.f12408p0.f12450b.b();
    }

    @Override
    public final int n0() {
        F1();
        int k12 = k1(this.f12408p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final j1 o1(j1 j1Var, b2.o1 o1Var, Pair pair) {
        boolean z10;
        u2.g0 g0Var;
        u2.s1 s1Var;
        x2.t tVar;
        List list;
        int i10;
        long j10;
        if (!o1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        b2.o1 o1Var2 = j1Var.f12449a;
        long i12 = i1(j1Var);
        j1 j11 = j1Var.j(o1Var);
        if (o1Var.p()) {
            u2.g0 g0Var2 = j1.f12448u;
            long S = e2.m0.S(this.f12412r0);
            j1 c10 = j11.d(g0Var2, S, S, S, 0L, u2.s1.d, this.f12383b, x1.e).c(g0Var2);
            c10.f12462q = c10.f12464s;
            return c10;
        }
        Object obj = j11.f12450b.f47314a;
        String str = e2.m0.f8252a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new u2.g0(pair.first);
        } else {
            g0Var = j11.f12450b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.m0.S(i12);
        if (!o1Var2.p()) {
            S2 -= o1Var2.g(obj, this.f12405o).e;
            if (equals && S2 - longValue == 1 && S2 == o1Var2.g(obj, this.f12405o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.g0 g0Var3 = g0Var;
            u6.p(!g0Var3.b());
            if (!equals) {
                s1Var = u2.s1.d;
            } else {
                s1Var = j11.h;
            }
            u2.s1 s1Var2 = s1Var;
            if (!equals) {
                tVar = this.f12383b;
            } else {
                tVar = j11.f12454i;
            }
            x2.t tVar2 = tVar;
            if (!equals) {
                e9.l0 l0Var = e9.n0.f8474b;
                list = x1.e;
            } else {
                list = j11.f12455j;
            }
            j1 c11 = j11.d(g0Var3, longValue, longValue, longValue, 0L, s1Var2, tVar2, list).c(g0Var3);
            c11.f12462q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = o1Var.b(j11.f12456k.f47314a);
            if (b10 != -1 && o1Var.f(b10, this.f12405o, false).f3822c == o1Var.g(g0Var.f47314a, this.f12405o).f3822c) {
                return j11;
            }
            o1Var.g(g0Var.f47314a, this.f12405o);
            if (g0Var.b()) {
                j10 = this.f12405o.a(g0Var.f47315b, g0Var.f47316c);
            } else {
                j10 = this.f12405o.d;
            }
            u2.g0 g0Var4 = g0Var;
            j1 c12 = j11.d(g0Var4, j11.f12464s, j11.f12464s, j11.d, j10 - j11.f12464s, j11.h, j11.f12454i, j11.f12455j).c(g0Var4);
            c12.f12462q = j10;
            return c12;
        } else {
            u2.g0 g0Var5 = g0Var;
            u6.p(!g0Var5.b());
            long max = Math.max(0L, j11.f12463r - (longValue - S2));
            long j12 = j11.f12462q;
            if (j11.f12456k.equals(j11.f12450b)) {
                j12 = longValue + max;
            }
            j1 d = j11.d(g0Var5, longValue, longValue, longValue, max, j11.h, j11.f12454i, j11.f12455j);
            d.f12462q = j12;
            return d;
        }
    }

    @Override
    public final void p(b2.t1 t1Var) {
        F1();
        x2.s sVar = this.f12394i;
        sVar.getClass();
        b2.t1 E0 = E0();
        if (!t1Var.equals(((x2.n) sVar).j())) {
            sVar.b(t1Var);
        }
        if (!E0.equals(t1Var)) {
            this.f12402m.e(19, new e1.c(t1Var, 15));
        }
    }

    @Override
    public final void p0(b2.d1 d1Var) {
        d1Var.getClass();
        this.f12402m.a(d1Var);
    }

    public final Pair p1(b2.o1 o1Var, int i10, long j10) {
        if (o1Var.p()) {
            this.f12410q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f12412r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= o1Var.o()) {
            i10 = o1Var.a(this.I);
            j10 = e2.m0.h0(o1Var.m(i10, (b2.n1) this.f1067a, 0L).f3875l);
        }
        return o1Var.i((b2.n1) this.f1067a, this.f12405o, i10, e2.m0.S(j10));
    }

    @Override
    public final long q() {
        F1();
        return e2.m0.h0(this.f12408p0.f12463r);
    }

    @Override
    public final void q0(boolean z10) {
        F1();
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.f8295a && i11 == yVar.f8296b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        org.telegram.messenger.g1 g1Var = this.f12414s0;
        if (g1Var != null) {
            g1Var.execute(new hg.n(this, i10, i11, 1));
            return;
        }
        this.f12402m.e(24, new eh.c(i10, i11, 1));
        t1(2, 14, new e2.y(i10, i11));
    }

    public final j1 r1(j1 j1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(j1Var);
        long i12 = i1(j1Var);
        b2.o1 o1Var = j1Var.f12449a;
        this.J++;
        int i13 = i11 - 1;
        while (true) {
            arrayList = this.f12407p;
            if (i13 < i10) {
                break;
            }
            arrayList.remove(i13);
            i13--;
        }
        this.O = this.O.a(i10, i11);
        o1 o1Var2 = new o1(arrayList, this.O);
        j1 o12 = o1(j1Var, o1Var2, l1(o1Var, o1Var2, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (r0.U((b2.n1) this.f1067a, this.f12405o, this.H, this.I, j1Var.f12450b.f47314a, o1Var, o1Var2) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.j1 j1Var2 = this.O;
        e2.i0 i0Var = this.f12400l.f12558n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8233a = i0Var.f8237a.obtainMessage(20, i10, i11, j1Var2);
        c10.b();
        return o12;
    }

    @Override
    public final b2.b1 s() {
        F1();
        return this.P;
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.f12418w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                e2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c0Var);
            this.V = null;
        }
    }

    @Override
    public final void stop() {
        F1();
        A1(null);
        this.f12388e0 = new d2.c(this.f12408p0.f12464s, x1.e);
    }

    @Override
    public final boolean t() {
        F1();
        return this.f12408p0.f12457l;
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
        u6.g(z10);
        ArrayList arrayList = this.f12407p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.o1 y02 = y0();
            this.J++;
            e2.m0.R(i10, min, min2, arrayList);
            this.O = this.O.g();
            o1 o1Var = new o1(arrayList, this.O);
            j1 j1Var = this.f12408p0;
            j1 o12 = o1(j1Var, o1Var, l1(y02, o1Var, k1(j1Var), i1(this.f12408p0)));
            u2.j1 j1Var2 = this.O;
            r0 r0Var = this.f12400l;
            r0Var.getClass();
            r0Var.f12558n.b(19, new n0(i10, min, min2, j1Var2)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(int i10, int i11, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f12391g) {
            if (i10 == -1 || bVar.f12312b == i10) {
                m1 h12 = h1(bVar);
                u6.p(!h12.f12481f);
                h12.f12480c = i11;
                u6.p(!h12.f12481f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.f12312b == i10)) {
                m1 h13 = h1(bVar2);
                u6.p(!h13.f12481f);
                h13.f12480c = i11;
                u6.p(!h13.f12481f);
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
        throw new UnsupportedOperationException("Method not decompiled: i2.i0.v1(long, java.util.List, boolean, int):void");
    }

    @Override
    public final void w(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            e2.i0 i0Var = this.f12400l.f12558n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8233a = i0Var.f8237a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            y yVar = new y(0, z10);
            e2.r rVar = this.f12402m;
            rVar.c(9, yVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final int w0() {
        F1();
        return this.f12408p0.f12459n;
    }

    public final void w1(s1 s1Var) {
        F1();
        if (s1Var == null) {
            s1Var = s1.f12582f;
        }
        if (!this.N.equals(s1Var)) {
            this.N = s1Var;
            this.f12400l.f12558n.b(5, s1Var).b();
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
        r0 r0Var = this.f12400l;
        if (!r0Var.Z && r0Var.f12565s.getThread().isAlive()) {
            e2.i iVar = new e2.i(r0Var.F);
            r0Var.f12558n.b(30, new Pair(surface, iVar)).b();
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
            A1(new n(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final long y() {
        F1();
        return this.f12404n0;
    }

    @Override
    public final b2.o1 y0() {
        F1();
        return this.f12408p0.f12449a;
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
        textureView.setSurfaceTextureListener(this.f12418w);
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
