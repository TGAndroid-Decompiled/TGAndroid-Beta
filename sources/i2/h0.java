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
public final class h0 extends ai.c1 implements q {
    public final bi.a A;
    public final long B;
    public final e2.c C;
    public final e2.e0 D;
    public final g0 E;
    public final n4.s F;
    public final n4.s G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final r1 M;
    public s1 N;
    public u2.k1 O;
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
    public b2.f f12411a0;
    public final x2.t f12412b;
    public float f12413b0;
    public final b2.b1 f12414c;
    public float f12415c0;
    public final e2.i d;
    public boolean f12416d0;
    public final Context e;
    public d2.c f12417e0;
    public final h0 f12418f;
    public final boolean f12419f0;
    public final b[] f12420g;
    public boolean f12421g0;
    public final b[] h;
    public final int f12422h0;
    public final x2.s f12423i;
    public boolean f12424i0;
    public final e2.i0 f12425j;
    public final b2.p f12426j0;
    public final w f12427k;
    public a2 f12428k0;
    public final q0 f12429l;
    public final long f12430l0;
    public final e2.r f12431m;
    public final long m0;
    public final CopyOnWriteArraySet f12432n;
    public final long f12433n0;
    public final b2.l1 f12434o;
    public b2.r0 f12435o0;
    public final ArrayList f12436p;
    public i1 f12437p0;
    public final boolean f12438q;
    public int f12439q0;
    public final u2.g0 f12440r;
    public long f12441r0;
    public final j2.e f12442s;
    public org.telegram.messenger.g1 f12443s0;
    public final Looper f12444t;
    public final ArrayList f12445t0;
    public final y2.c f12446u;
    public final e2.g0 v;
    public final b0 f12447w;
    public final c0 f12448x;
    public final c2.b f12449y;
    public final ac.a f12450z;

    static {
        b2.p0.a("media3.exoplayer");
    }

    public h0(i2.o r34) {
        throw new UnsupportedOperationException("Method not decompiled: i2.h0.<init>(i2.o):void");
    }

    public static long m1(i1 i1Var) {
        b2.n1 n1Var = new b2.n1();
        b2.l1 l1Var = new b2.l1();
        i1Var.f12478a.g(i1Var.f12479b.f47767a, l1Var);
        long j10 = i1Var.f12480c;
        if (j10 == -9223372036854775807L) {
            return i1Var.f12478a.m(l1Var.f3829c, n1Var, 0L).f3882l;
        }
        return l1Var.e + j10;
    }

    public static i1 n1(i1 i1Var, int i10) {
        i1 h = i1Var.h(i10);
        if (i10 != 1 && i10 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final int A() {
        F1();
        if (this.f12437p0.f12478a.p()) {
            int i10 = this.f12439q0;
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }
        i1 i1Var = this.f12437p0;
        return i1Var.f12478a.b(i1Var.f12479b.f47767a);
    }

    @Override
    public final Looper A0() {
        return this.f12444t;
    }

    public final void A1(m mVar) {
        i1 i1Var = this.f12437p0;
        i1 c10 = i1Var.c(i1Var.f12479b);
        c10.f12491q = c10.f12493s;
        c10.f12492r = 0L;
        i1 n12 = n1(c10, 1);
        if (mVar != null) {
            n12 = n12.f(mVar);
        }
        this.J++;
        this.f12429l.f12583n.a(6).b();
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
        this.f12431m.e(15, new w(this, 4));
    }

    @Override
    public final void B0() {
        F1();
        if (this.f12413b0 != 0.0f) {
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
        String str = e2.m0.f8259a;
        h0 h0Var = this.f12418f;
        boolean n10 = h0Var.n();
        boolean e02 = h0Var.e0();
        boolean T0 = h0Var.T0();
        boolean S0 = h0Var.S0();
        boolean P0 = h0Var.P0();
        boolean v02 = h0Var.v0();
        boolean p5 = h0Var.y0().p();
        ?? obj = new Object();
        obj.f3697a = new b2.t();
        b2.t tVar = (b2.t) obj.f3697a;
        tVar.c(this.f12414c.f3707a);
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
            this.f12431m.c(13, new w(this, 3));
        }
    }

    @Override
    public final void C(b2.d1 d1Var) {
        boolean z10;
        F1();
        d1Var.getClass();
        e2.r rVar = this.f12431m;
        if (rVar.f8284i) {
            if (Thread.currentThread() == rVar.f8279a) {
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
            if (qVar.f8276a.equals(d1Var)) {
                e2.p pVar = rVar.f8281c;
                qVar.d = true;
                if (pVar != null && qVar.f8278c) {
                    qVar.f8278c = false;
                    pVar.a(qVar.f8276a, qVar.f8277b.d());
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
        i1 i1Var = this.f12437p0;
        int i12 = i1Var.f12488n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i1Var.f12486l == z10 && i12 == i11 && i1Var.f12487m == i10) {
            return;
        }
        this.J++;
        if (i1Var.f12490p) {
            i1Var = i1Var.a();
        }
        i1 e = i1Var.e(i10, i11, z10);
        e2.i0 i0Var = this.f12429l.f12583n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8240a = i0Var.f8244a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final a2 D() {
        F1();
        return this.f12428k0;
    }

    @Override
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final i1 i1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.o0 o0Var;
        boolean z12;
        boolean z13;
        boolean z14;
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
        i1 i1Var2 = this.f12437p0;
        this.f12437p0 = i1Var;
        boolean equals = i1Var2.f12478a.equals(i1Var.f12478a);
        b2.n1 n1Var = (b2.n1) this.f1069a;
        b2.l1 l1Var = this.f12434o;
        b2.o1 o1Var = i1Var2.f12478a;
        u2.h0 h0Var = i1Var2.f12479b;
        b2.o1 o1Var2 = i1Var.f12478a;
        u2.h0 h0Var2 = i1Var.f12479b;
        if (o1Var2.p() && o1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o1Var2.p() != o1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!o1Var.m(o1Var.g(h0Var.f47767a, l1Var).f3829c, n1Var, 0L).f3874a.equals(o1Var2.m(o1Var2.g(h0Var2.f47767a, l1Var).f3829c, n1Var, 0L).f3874a)) {
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
        } else if (z10 && i11 == 0 && h0Var.d < h0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i11 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            o0Var = !i1Var.f12478a.p() ? i1Var.f12478a.m(i1Var.f12478a.g(i1Var.f12479b.f47767a, this.f12434o).f3829c, (b2.n1) this.f1069a, 0L).f3876c : null;
            this.f12435o0 = b2.r0.L;
        } else {
            o0Var = null;
        }
        if (booleanValue || !i1Var2.f12484j.equals(i1Var.f12484j)) {
            b2.q0 a2 = this.f12435o0.a();
            List list = i1Var.f12484j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.t0 t0Var = (b2.t0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.s0[] s0VarArr = t0Var.f4014a;
                    if (i17 < s0VarArr.length) {
                        s0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.f12435o0 = new b2.r0(a2);
        }
        b2.r0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z15 = i1Var2.f12486l != i1Var.f12486l;
        boolean z16 = i1Var2.e != i1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = i1Var2.f12482g != i1Var.f12482g;
        if (!equals) {
            this.f12431m.c(0, new r(i1Var, i10, 0));
        }
        if (z10) {
            b2.l1 l1Var2 = new b2.l1();
            if (i1Var2.f12478a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                i15 = i14;
                obj = null;
                o0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = i1Var2.f12479b.f47767a;
                i1Var2.f12478a.g(obj5, l1Var2);
                int i18 = l1Var2.f3829c;
                int b10 = i1Var2.f12478a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = i1Var2.f12478a.m(i18, (b2.n1) this.f1069a, 0L).f3874a;
                o0Var2 = ((b2.n1) this.f1069a).f3876c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            }
            if (i11 == 0) {
                if (i1Var2.f12479b.b()) {
                    u2.h0 h0Var3 = i1Var2.f12479b;
                    j13 = l1Var2.a(h0Var3.f47768b, h0Var3.f47769c);
                    m12 = m1(i1Var2);
                } else if (i1Var2.f12479b.e != -1) {
                    j13 = m1(this.f12437p0);
                    m12 = j13;
                } else {
                    j11 = l1Var2.e;
                    j12 = l1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (i1Var2.f12479b.b()) {
                j13 = i1Var2.f12493s;
                m12 = m1(i1Var2);
            } else {
                j11 = l1Var2.e;
                j12 = i1Var2.f12493s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.m0.h0(j13);
            long h03 = e2.m0.h0(m12);
            u2.h0 h0Var4 = i1Var2.f12479b;
            b2.e1 e1Var = new b2.e1(obj, i14, o0Var2, obj2, i15, h02, h03, h0Var4.f47768b, h0Var4.f47769c);
            b2.n1 n1Var2 = (b2.n1) this.f1069a;
            int n02 = n0();
            int A = A();
            if (this.f12437p0.f12478a.p()) {
                obj3 = null;
                o0Var3 = null;
                obj4 = null;
            } else {
                i1 i1Var3 = this.f12437p0;
                Object obj6 = i1Var3.f12479b.f47767a;
                i1Var3.f12478a.g(obj6, this.f12434o);
                A = this.f12437p0.f12478a.b(obj6);
                Object obj7 = this.f12437p0.f12478a.m(n02, n1Var2, 0L).f3874a;
                o0Var3 = n1Var2.f3876c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i19 = A;
            long h04 = e2.m0.h0(j10);
            long h05 = this.f12437p0.f12479b.b() ? e2.m0.h0(m1(this.f12437p0)) : h04;
            u2.h0 h0Var5 = this.f12437p0.f12479b;
            this.f12431m.c(11, new b2(i11, e1Var, new b2.e1(obj3, n02, o0Var3, obj4, i19, h04, h05, h0Var5.f47768b, h0Var5.f47769c), 1));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.f12431m.c(1, new r(o0Var, intValue, 1));
        }
        if (i1Var2.f12481f != i1Var.f12481f) {
            this.f12431m.c(10, new e2.o() {
                @Override
                public final void invoke(Object obj8) {
                    b2.d1 d1Var = (b2.d1) obj8;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
            if (i1Var.f12481f != null) {
                this.f12431m.c(10, new e2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.d1 d1Var = (b2.d1) obj8;
                        switch (r2) {
                            case 0:
                                i1 i1Var4 = i1Var;
                                d1Var.onLoadingChanged(i1Var4.f12482g);
                                d1Var.onIsLoadingChanged(i1Var4.f12482g);
                                return;
                            case 1:
                                i1 i1Var5 = i1Var;
                                d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                                return;
                            case 2:
                                d1Var.onPlaybackStateChanged(i1Var.e);
                                return;
                            case 3:
                                i1 i1Var6 = i1Var;
                                d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                                return;
                            case 4:
                                d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                                return;
                            case 5:
                                d1Var.onIsPlayingChanged(i1Var.m());
                                return;
                            case 6:
                                d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                                return;
                            case 7:
                                d1Var.onPlayerErrorChanged(i1Var.f12481f);
                                return;
                            case 8:
                                d1Var.onPlayerError(i1Var.f12481f);
                                return;
                            default:
                                d1Var.onTracksChanged(i1Var.f12483i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.t tVar = i1Var2.f12483i;
        x2.t tVar2 = i1Var.f12483i;
        if (tVar != tVar2) {
            x2.s sVar = this.f12423i;
            Object obj8 = tVar2.e;
            sVar.getClass();
            sVar.f49629c = (x2.r) obj8;
            this.f12431m.c(2, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (!z13) {
            this.f12431m.c(14, new s(this.Q));
        }
        if (z17) {
            this.f12431m.c(3, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (z14 || z15) {
            this.f12431m.c(-1, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (z14) {
            this.f12431m.c(4, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (z15 || i1Var2.f12487m != i1Var.f12487m) {
            this.f12431m.c(5, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (i1Var2.f12488n != i1Var.f12488n) {
            this.f12431m.c(6, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (i1Var2.m() != i1Var.m()) {
            this.f12431m.c(7, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        if (!i1Var2.f12489o.equals(i1Var.f12489o)) {
            this.f12431m.c(12, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.f12482g);
                            d1Var.onIsLoadingChanged(i1Var4.f12482g);
                            return;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.f12486l, i1Var5.e);
                            return;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            return;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.f12486l, i1Var6.f12487m);
                            return;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.f12488n);
                            return;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            return;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.f12489o);
                            return;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f12481f);
                            return;
                        case 8:
                            d1Var.onPlayerError(i1Var.f12481f);
                            return;
                        default:
                            d1Var.onTracksChanged(i1Var.f12483i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f12431m.b();
        if (i1Var2.f12490p != i1Var.f12490p) {
            Iterator it = this.f12432n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).f12353a.E1();
            }
        }
    }

    @Override
    public final b2.t1 E0() {
        F1();
        return ((x2.n) this.f12423i).j();
    }

    public final void E1() {
        int d = d();
        bi.a aVar = this.A;
        ac.a aVar2 = this.f12450z;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f12437p0.f12490p;
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
        return this.f12413b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f12437p0.f12478a.p()) {
            return this.f12441r0;
        }
        i1 i1Var = this.f12437p0;
        long j10 = 0;
        if (i1Var.f12485k.d != i1Var.f12479b.d) {
            return e2.m0.h0(i1Var.f12478a.m(n0(), (b2.n1) this.f1069a, 0L).f3883m);
        }
        long j11 = i1Var.f12491q;
        if (this.f12437p0.f12485k.b()) {
            i1 i1Var2 = this.f12437p0;
            i1Var2.f12478a.g(i1Var2.f12485k.f47767a, this.f12434o).d(this.f12437p0.f12485k.f47768b);
        } else {
            j10 = j11;
        }
        i1 i1Var3 = this.f12437p0;
        b2.o1 o1Var = i1Var3.f12478a;
        Object obj = i1Var3.f12485k.f47767a;
        b2.l1 l1Var = this.f12434o;
        o1Var.g(obj, l1Var);
        return e2.m0.h0(j10 + l1Var.e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f12444t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.m0.f8259a;
            Locale locale = Locale.US;
            String l4 = org.telegram.ui.Cells.b1.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f12419f0) {
                if (this.f12421g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.m("ExoPlayerImpl", l4, illegalStateException);
                this.f12421g0 = true;
                return;
            }
            throw new IllegalStateException(l4);
        }
    }

    @Override
    public final void G0(int i10) {
        F1();
    }

    @Override
    public final b2.f H() {
        F1();
        return this.f12411a0;
    }

    @Override
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override
    public final b2.p J() {
        F1();
        return this.f12426j0;
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
        return e2.m0.h0(j1(this.f12437p0));
    }

    @Override
    public final int N() {
        F1();
        if (n()) {
            return this.f12437p0.f12479b.f47769c;
        }
        return -1;
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        F1();
        if (this.f12424i0) {
            return;
        }
        boolean equals = Objects.equals(this.f12411a0, fVar);
        e2.r rVar = this.f12431m;
        if (!equals) {
            this.f12411a0 = fVar;
            t1(1, 3, fVar);
            rVar.c(20, new e1.c(fVar, 14));
        }
        b2.f fVar2 = this.f12411a0;
        e2.i0 i0Var = this.f12429l.f12583n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8240a = i0Var.f8244a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final void O(int i10, int i11, List list) {
        boolean z10;
        u2.s1 s1Var;
        F1();
        boolean z11 = false;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        ArrayList arrayList = this.f12436p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((d0) arrayList.get(i12)).f12366b.f47912k.a((b2.o0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.f12429l.f12583n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8240a = i0Var.f8244a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                b2.o1 o1Var = d0Var.f12367c;
                b2.o0 o0Var = (b2.o0) list.get(i13 - i10);
                if (o1Var instanceof u2.s1) {
                    s1Var = new u2.s1(((u2.s1) o1Var).e, o0Var);
                } else {
                    s1Var = new u2.s1(o1Var, o0Var);
                }
                d0Var.f12367c = s1Var;
            }
            D1(this.f12437p0.j(new n1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f12437p0.f12478a.p()) {
            if (this.f12439q0 == -1) {
                z11 = true;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        i1 r12 = r1(e1(this.f12437p0, min, g12), i10, min);
        D1(r12, 0, !r12.f12479b.f47767a.equals(this.f12437p0.f12479b.f47767a), 4, j1(r12), -1, false);
    }

    @Override
    public final long O0() {
        F1();
        return this.f12430l0;
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
        int size = this.f12436p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            i1 r12 = r1(this.f12437p0, i10, min);
            D1(r12, 0, !r12.f12479b.f47767a.equals(this.f12437p0.f12479b.f47767a), 4, j1(r12), -1, false);
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
        surfaceHolder.addCallback(this.f12447w);
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
        float f10 = this.f12413b0;
        if (f10 == h) {
            return;
        }
        if (h != 0.0f) {
            f10 = h;
        }
        this.f12415c0 = f10;
        this.f12413b0 = h;
        this.f12429l.f12583n.b(32, Float.valueOf(h)).b();
        this.f12431m.e(22, new u(h, 0));
    }

    @Override
    public final b2.y0 W() {
        F1();
        return this.f12437p0.f12481f;
    }

    @Override
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8259a + "] [" + b2.p0.b() + "]");
        F1();
        this.f12449y.w();
        this.f12450z.c(false);
        this.A.a(false);
        g0 g0Var = this.E;
        if (g0Var != null && Build.VERSION.SDK_INT >= 34) {
            g0.a(g0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f8224f.f8244a.removeCallbacksAndMessages(null);
        e0Var.f8221a.C(e0Var.f8222b);
        q0 q0Var = this.f12429l;
        if (!q0Var.Z && q0Var.f12590s.getThread().isAlive()) {
            q0Var.Z = true;
            e2.i iVar = new e2.i(q0Var.F);
            q0Var.f12583n.b(7, iVar).b();
            z10 = iVar.c(q0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f12431m.e(10, new fh.b(26));
        }
        this.f12431m.d();
        this.f12425j.f8244a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f12446u;
        j2.e eVar = this.f12442s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f50357c.f47443b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f50342b == eVar) {
                bVar.f50343c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        i1 i1Var = this.f12437p0;
        if (i1Var.f12490p) {
            this.f12437p0 = i1Var.a();
        }
        i1 n12 = n1(this.f12437p0, 1);
        this.f12437p0 = n12;
        i1 c10 = n12.c(n12.f12479b);
        this.f12437p0 = c10;
        c10.f12491q = c10.f12493s;
        this.f12437p0.f12492r = 0L;
        j2.e eVar2 = this.f12442s;
        e2.i0 i0Var = eVar2.f13988n;
        i0Var.getClass();
        i0Var.d(new bc(eVar2, 25));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f12417e0 = d2.c.d;
        this.f12424i0 = true;
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
            b2.o1 o1Var = this.f12437p0.f12478a;
            if (!o1Var.p() && i10 >= o1Var.o()) {
                return;
            }
            j2.e eVar = this.f12442s;
            if (!eVar.f13989r) {
                j2.a l4 = eVar.l();
                eVar.f13989r = true;
                eVar.q(l4, -1, new e1.c(l4, 25));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                n0 n0Var = new n0(this.f12437p0);
                n0Var.f(1);
                h0 h0Var = this.f12427k.f12631b;
                h0Var.f12425j.d(new hi.t(1, h0Var, n0Var));
                return;
            }
            i1 i1Var = this.f12437p0;
            int i11 = i1Var.e;
            if (i11 == 3 || (i11 == 4 && !o1Var.p())) {
                i1Var = this.f12437p0.h(2);
            }
            int n02 = n0();
            i1 o12 = o1(i1Var, o1Var, p1(o1Var, i10, j10));
            this.f12429l.f12583n.b(3, new p0(o1Var, i10, e2.m0.S(j10))).b();
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
        return i1(this.f12437p0);
    }

    @Override
    public final void b() {
        int i10;
        F1();
        i1 i1Var = this.f12437p0;
        if (i1Var.e != 1) {
            return;
        }
        i1 f7 = i1Var.f(null);
        if (f7.f12478a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        i1 n12 = n1(f7, i10);
        this.J++;
        this.f12429l.f12583n.a(29).b();
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
        int min = Math.min(i10, this.f12436p.size());
        if (this.f12437p0.f12478a.p()) {
            if (this.f12439q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        D1(e1(this.f12437p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final boolean c() {
        F1();
        return this.f12437p0.f12482g;
    }

    @Override
    public final void c0() {
        F1();
        if (this.f12413b0 == 0.0f) {
            float f7 = this.f12415c0;
            if (f7 != 0.0f) {
                U(f7);
            }
        }
    }

    @Override
    public final int d() {
        F1();
        return this.f12437p0.e;
    }

    @Override
    public final long d0() {
        F1();
        if (n()) {
            i1 i1Var = this.f12437p0;
            if (i1Var.f12485k.equals(i1Var.f12479b)) {
                return e2.m0.h0(this.f12437p0.f12491q);
            }
            return getDuration();
        }
        return F0();
    }

    public final i1 e1(i1 i1Var, int i10, ArrayList arrayList) {
        b2.o1 o1Var = i1Var.f12478a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f12436p;
            if (i11 < size) {
                g1 g1Var = new g1((u2.a) arrayList.get(i11), this.f12438q);
                arrayList2.add(g1Var);
                arrayList3.add(i11 + i10, new d0(g1Var.f12406b, g1Var.f12405a));
                i11++;
            } else {
                this.O = this.O.f(i10, arrayList2.size());
                n1 n1Var = new n1(arrayList3, this.O);
                i1 o12 = o1(i1Var, n1Var, l1(o1Var, n1Var, k1(i1Var), i1(i1Var)));
                u2.k1 k1Var = this.O;
                e2.i0 i0Var = this.f12429l.f12583n;
                l0 l0Var = new l0(arrayList2, k1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.f8240a = i0Var.f8244a.obtainMessage(18, i10, 0, l0Var);
                c10.b();
                return o12;
            }
        }
    }

    @Override
    public final void f(b2.z0 z0Var) {
        F1();
        if (this.f12437p0.f12489o.equals(z0Var)) {
            return;
        }
        i1 g10 = this.f12437p0.g(z0Var);
        this.J++;
        this.f12429l.f12583n.b(4, z0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.r0 f1() {
        boolean z10;
        b2.o1 y02 = y0();
        if (y02.p()) {
            return this.f12435o0;
        }
        b2.o0 o0Var = y02.m(n0(), (b2.n1) this.f1069a, 0L).f3876c;
        b2.q0 a2 = this.f12435o0.a();
        b2.r0 r0Var = o0Var.d;
        if (r0Var != null) {
            e9.n0 n0Var = r0Var.K;
            byte[] bArr = r0Var.f3966k;
            CharSequence charSequence = r0Var.f3959a;
            if (charSequence != null) {
                a2.f3911a = charSequence;
            }
            CharSequence charSequence2 = r0Var.f3960b;
            if (charSequence2 != null) {
                a2.f3912b = charSequence2;
            }
            CharSequence charSequence3 = r0Var.f3961c;
            if (charSequence3 != null) {
                a2.f3913c = charSequence3;
            }
            CharSequence charSequence4 = r0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = r0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = r0Var.f3962f;
            if (charSequence6 != null) {
                a2.f3914f = charSequence6;
            }
            CharSequence charSequence7 = r0Var.f3963g;
            if (charSequence7 != null) {
                a2.f3915g = charSequence7;
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
            b2.g1 g1Var = r0Var.f3964i;
            if (g1Var != null) {
                a2.f3916i = g1Var;
            }
            b2.g1 g1Var2 = r0Var.f3965j;
            if (g1Var2 != null) {
                a2.f3917j = g1Var2;
            }
            Uri uri = r0Var.f3969n;
            if (uri != null || bArr != null) {
                a2.f3921n = uri;
                a2.b(bArr, r0Var.f3968m);
                a2.f3919l = r0Var.f3967l;
            }
            Integer num = r0Var.f3970o;
            if (num != null) {
                a2.f3922o = num;
            }
            Integer num2 = r0Var.f3971p;
            if (num2 != null) {
                a2.f3923p = num2;
            }
            Integer num3 = r0Var.f3972q;
            if (num3 != null) {
                a2.f3924q = num3;
            }
            Boolean bool = r0Var.f3973r;
            if (bool != null) {
                a2.f3925r = bool;
            }
            Boolean bool2 = r0Var.f3974s;
            if (bool2 != null) {
                a2.f3926s = bool2;
            }
            Integer num4 = r0Var.f3975t;
            if (num4 != null) {
                a2.f3927t = num4;
            }
            Integer num5 = r0Var.f3976u;
            if (num5 != null) {
                a2.f3927t = num5;
            }
            Integer num6 = r0Var.v;
            if (num6 != null) {
                a2.f3928u = num6;
            }
            Integer num7 = r0Var.f3977w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = r0Var.f3978x;
            if (num8 != null) {
                a2.f3929w = num8;
            }
            Integer num9 = r0Var.f3979y;
            if (num9 != null) {
                a2.f3930x = num9;
            }
            Integer num10 = r0Var.f3980z;
            if (num10 != null) {
                a2.f3931y = num10;
            }
            CharSequence charSequence8 = r0Var.A;
            if (charSequence8 != null) {
                a2.f3932z = charSequence8;
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
            arrayList.add(this.f12440r.a((b2.o0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (n()) {
            i1 i1Var = this.f12437p0;
            u2.h0 h0Var = i1Var.f12479b;
            b2.o1 o1Var = i1Var.f12478a;
            Object obj = h0Var.f47767a;
            b2.l1 l1Var = this.f12434o;
            o1Var.g(obj, l1Var);
            return e2.m0.h0(l1Var.a(h0Var.f47768b, h0Var.f47769c));
        }
        return z();
    }

    @Override
    public final b2.z0 h() {
        F1();
        return this.f12437p0.f12489o;
    }

    @Override
    public final v1 h0() {
        F1();
        return this.f12437p0.f12483i.d;
    }

    public final l1 h1(k1 k1Var) {
        int k12 = k1(this.f12437p0);
        b2.o1 o1Var = this.f12437p0.f12478a;
        if (k12 == -1) {
            k12 = 0;
        }
        q0 q0Var = this.f12429l;
        return new l1(q0Var, k1Var, o1Var, k12, q0Var.f12590s);
    }

    @Override
    public final b2.r0 i0() {
        F1();
        return this.R;
    }

    public final long i1(i1 i1Var) {
        u2.h0 h0Var = i1Var.f12479b;
        long j10 = i1Var.f12480c;
        b2.o1 o1Var = i1Var.f12478a;
        if (h0Var.b()) {
            Object obj = i1Var.f12479b.f47767a;
            b2.l1 l1Var = this.f12434o;
            o1Var.g(obj, l1Var);
            if (j10 == -9223372036854775807L) {
                return e2.m0.h0(o1Var.m(k1(i1Var), (b2.n1) this.f1069a, 0L).f3882l);
            }
            return e2.m0.h0(j10) + e2.m0.h0(l1Var.e);
        }
        return e2.m0.h0(j1(i1Var));
    }

    @Override
    public final void j(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.f12429l.f12583n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8240a = i0Var.f8244a.obtainMessage(11, i10, 0);
            c10.b();
            v vVar = new v(i10, 0);
            e2.r rVar = this.f12431m;
            rVar.c(8, vVar);
            B1();
            rVar.b();
        }
    }

    public final long j1(i1 i1Var) {
        long j10;
        if (i1Var.f12478a.p()) {
            return e2.m0.S(this.f12441r0);
        }
        if (i1Var.f12490p) {
            j10 = i1Var.l();
        } else {
            j10 = i1Var.f12493s;
        }
        if (i1Var.f12479b.b()) {
            return j10;
        }
        b2.o1 o1Var = i1Var.f12478a;
        Object obj = i1Var.f12479b.f47767a;
        b2.l1 l1Var = this.f12434o;
        o1Var.g(obj, l1Var);
        return j10 + l1Var.e;
    }

    @Override
    public final d2.c k0() {
        F1();
        return this.f12417e0;
    }

    public final int k1(i1 i1Var) {
        if (i1Var.f12478a.p()) {
            return this.f12439q0;
        }
        return i1Var.f12478a.g(i1Var.f12479b.f47767a, this.f12434o).f3829c;
    }

    @Override
    public final int l() {
        F1();
        return this.H;
    }

    public final Pair l1(b2.o1 o1Var, n1 n1Var, int i10, long j10) {
        boolean z10;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        if (!o1Var.p() && !n1Var.p()) {
            Pair i12 = o1Var.i((b2.n1) this.f1069a, this.f12434o, i10, e2.m0.S(j10));
            Object obj = i12.first;
            if (n1Var.b(obj) != -1) {
                return i12;
            }
            int U = q0.U((b2.n1) this.f1069a, this.f12434o, this.H, this.I, obj, o1Var, n1Var);
            if (U != -1) {
                b2.n1 n1Var2 = (b2.n1) this.f1069a;
                n1Var.m(U, n1Var2, 0L);
                return p1(n1Var, U, e2.m0.h0(n1Var2.f3882l));
            }
            return p1(n1Var, -1, -9223372036854775807L);
        }
        if (!o1Var.p() && n1Var.p()) {
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
        return p1(n1Var, i11, j11);
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
            return this.f12437p0.f12479b.f47768b;
        }
        return -1;
    }

    @Override
    public final boolean n() {
        F1();
        return this.f12437p0.f12479b.b();
    }

    @Override
    public final int n0() {
        F1();
        int k12 = k1(this.f12437p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final i1 o1(i1 i1Var, b2.o1 o1Var, Pair pair) {
        boolean z10;
        u2.h0 h0Var;
        u2.t1 t1Var;
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
        b2.o1 o1Var2 = i1Var.f12478a;
        long i12 = i1(i1Var);
        i1 j11 = i1Var.j(o1Var);
        if (o1Var.p()) {
            u2.h0 h0Var2 = i1.f12477u;
            long S = e2.m0.S(this.f12441r0);
            i1 c10 = j11.d(h0Var2, S, S, S, 0L, u2.t1.d, this.f12412b, x1.e).c(h0Var2);
            c10.f12491q = c10.f12493s;
            return c10;
        }
        Object obj = j11.f12479b.f47767a;
        String str = e2.m0.f8259a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            h0Var = new u2.h0(pair.first);
        } else {
            h0Var = j11.f12479b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.m0.S(i12);
        if (!o1Var2.p()) {
            S2 -= o1Var2.g(obj, this.f12434o).e;
            if (equals && S2 - longValue == 1 && S2 == o1Var2.g(obj, this.f12434o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.h0 h0Var3 = h0Var;
            u6.p(!h0Var3.b());
            if (!equals) {
                t1Var = u2.t1.d;
            } else {
                t1Var = j11.h;
            }
            u2.t1 t1Var2 = t1Var;
            if (!equals) {
                tVar = this.f12412b;
            } else {
                tVar = j11.f12483i;
            }
            x2.t tVar2 = tVar;
            if (!equals) {
                e9.l0 l0Var = e9.n0.f8481b;
                list = x1.e;
            } else {
                list = j11.f12484j;
            }
            i1 c11 = j11.d(h0Var3, longValue, longValue, longValue, 0L, t1Var2, tVar2, list).c(h0Var3);
            c11.f12491q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = o1Var.b(j11.f12485k.f47767a);
            if (b10 != -1 && o1Var.f(b10, this.f12434o, false).f3829c == o1Var.g(h0Var.f47767a, this.f12434o).f3829c) {
                return j11;
            }
            o1Var.g(h0Var.f47767a, this.f12434o);
            if (h0Var.b()) {
                j10 = this.f12434o.a(h0Var.f47768b, h0Var.f47769c);
            } else {
                j10 = this.f12434o.d;
            }
            u2.h0 h0Var4 = h0Var;
            i1 c12 = j11.d(h0Var4, j11.f12493s, j11.f12493s, j11.d, j10 - j11.f12493s, j11.h, j11.f12483i, j11.f12484j).c(h0Var4);
            c12.f12491q = j10;
            return c12;
        } else {
            u2.h0 h0Var5 = h0Var;
            u6.p(!h0Var5.b());
            long max = Math.max(0L, j11.f12492r - (longValue - S2));
            long j12 = j11.f12491q;
            if (j11.f12485k.equals(j11.f12479b)) {
                j12 = longValue + max;
            }
            i1 d = j11.d(h0Var5, longValue, longValue, longValue, max, j11.h, j11.f12483i, j11.f12484j);
            d.f12491q = j12;
            return d;
        }
    }

    @Override
    public final void p(b2.t1 t1Var) {
        F1();
        x2.s sVar = this.f12423i;
        sVar.getClass();
        b2.t1 E0 = E0();
        if (!t1Var.equals(((x2.n) sVar).j())) {
            sVar.b(t1Var);
        }
        if (!E0.equals(t1Var)) {
            this.f12431m.e(19, new e1.c(t1Var, 15));
        }
    }

    @Override
    public final void p0(b2.d1 d1Var) {
        d1Var.getClass();
        this.f12431m.a(d1Var);
    }

    public final Pair p1(b2.o1 o1Var, int i10, long j10) {
        if (o1Var.p()) {
            this.f12439q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f12441r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= o1Var.o()) {
            i10 = o1Var.a(this.I);
            j10 = e2.m0.h0(o1Var.m(i10, (b2.n1) this.f1069a, 0L).f3882l);
        }
        return o1Var.i((b2.n1) this.f1069a, this.f12434o, i10, e2.m0.S(j10));
    }

    @Override
    public final long q() {
        F1();
        return e2.m0.h0(this.f12437p0.f12492r);
    }

    @Override
    public final void q0(boolean z10) {
        F1();
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.f8302a && i11 == yVar.f8303b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        org.telegram.messenger.g1 g1Var = this.f12443s0;
        if (g1Var != null) {
            g1Var.execute(new hg.n(this, i10, i11, 1));
            return;
        }
        this.f12431m.e(24, new eh.c(i10, i11, 1));
        t1(2, 14, new e2.y(i10, i11));
    }

    public final i1 r1(i1 i1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(i1Var);
        long i12 = i1(i1Var);
        b2.o1 o1Var = i1Var.f12478a;
        this.J++;
        int i13 = i11 - 1;
        while (true) {
            arrayList = this.f12436p;
            if (i13 < i10) {
                break;
            }
            arrayList.remove(i13);
            i13--;
        }
        this.O = this.O.a(i10, i11);
        n1 n1Var = new n1(arrayList, this.O);
        i1 o12 = o1(i1Var, n1Var, l1(o1Var, n1Var, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (q0.U((b2.n1) this.f1069a, this.f12434o, this.H, this.I, i1Var.f12479b.f47767a, o1Var, n1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.k1 k1Var = this.O;
        e2.i0 i0Var = this.f12429l.f12583n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8240a = i0Var.f8244a.obtainMessage(20, i10, i11, k1Var);
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
        b0 b0Var = this.f12447w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != b0Var) {
                e2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(b0Var);
            this.V = null;
        }
    }

    @Override
    public final void stop() {
        F1();
        A1(null);
        this.f12417e0 = new d2.c(this.f12437p0.f12493s, x1.e);
    }

    @Override
    public final boolean t() {
        F1();
        return this.f12437p0.f12486l;
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
        ArrayList arrayList = this.f12436p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.o1 y02 = y0();
            this.J++;
            e2.m0.R(i10, min, min2, arrayList);
            this.O = this.O.g();
            n1 n1Var = new n1(arrayList, this.O);
            i1 i1Var = this.f12437p0;
            i1 o12 = o1(i1Var, n1Var, l1(y02, n1Var, k1(i1Var), i1(this.f12437p0)));
            u2.k1 k1Var = this.O;
            q0 q0Var = this.f12429l;
            q0Var.getClass();
            q0Var.f12583n.b(19, new m0(i10, min, min2, k1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(int i10, int i11, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f12420g) {
            if (i10 == -1 || bVar.f12344b == i10) {
                l1 h12 = h1(bVar);
                u6.p(!h12.f12510f);
                h12.f12509c = i11;
                u6.p(!h12.f12510f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.f12344b == i10)) {
                l1 h13 = h1(bVar2);
                u6.p(!h13.f12510f);
                h13.f12509c = i11;
                u6.p(!h13.f12510f);
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
        throw new UnsupportedOperationException("Method not decompiled: i2.h0.v1(long, java.util.List, boolean, int):void");
    }

    @Override
    public final void w(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            e2.i0 i0Var = this.f12429l.f12583n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8240a = i0Var.f8244a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            x xVar = new x(0, z10);
            e2.r rVar = this.f12431m;
            rVar.c(9, xVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final int w0() {
        F1();
        return this.f12437p0.f12488n;
    }

    public final void w1(s1 s1Var) {
        F1();
        if (s1Var == null) {
            s1Var = s1.f12612f;
        }
        if (!this.N.equals(s1Var)) {
            this.N = s1Var;
            this.f12429l.f12583n.b(5, s1Var).b();
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
        q0 q0Var = this.f12429l;
        if (!q0Var.Z && q0Var.f12590s.getThread().isAlive()) {
            e2.i iVar = new e2.i(q0Var.F);
            q0Var.f12583n.b(30, new Pair(surface, iVar)).b();
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
        return this.f12433n0;
    }

    @Override
    public final b2.o1 y0() {
        F1();
        return this.f12437p0.f12478a;
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
        textureView.setSurfaceTextureListener(this.f12447w);
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
