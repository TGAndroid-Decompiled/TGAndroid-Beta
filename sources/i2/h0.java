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
import b2.b2;
import b2.w1;
import e9.x1;
import fi.c2;
import fi.q3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.u6;
public final class h0 extends b2.h implements q {
    public final ai.a A;
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
    public b2.f f10985a0;
    public final x2.t f10986b;
    public float f10987b0;
    public final b2.c1 f10988c;
    public float f10989c0;
    public final e2.i d;
    public boolean f10990d0;
    public final Context e;
    public d2.c f10991e0;
    public final h0 f10992f;
    public final boolean f10993f0;
    public final b[] f10994g;
    public boolean f10995g0;
    public final b[] h;
    public final int f10996h0;
    public final x2.s f10997i;
    public boolean f10998i0;
    public final e2.i0 f10999j;
    public final b2.q f11000j0;
    public final w f11001k;
    public b2 f11002k0;
    public final r0 f11003l;
    public final long f11004l0;
    public final e2.r f11005m;
    public final long m0;
    public final CopyOnWriteArraySet f11006n;
    public final long f11007n0;
    public final b2.m1 f11008o;
    public b2.s0 f11009o0;
    public final ArrayList f11010p;
    public k1 f11011p0;
    public final boolean f11012q;
    public int f11013q0;
    public final u2.f0 f11014r;
    public long f11015r0;
    public final j2.f f11016s;
    public org.telegram.messenger.f1 f11017s0;
    public final Looper f11018t;
    public final ArrayList f11019t0;
    public final y2.c f11020u;
    public final e2.g0 v;
    public final b0 f11021w;
    public final c0 f11022x;
    public final c2.b f11023y;
    public final ac.a f11024z;

    static {
        b2.q0.a("media3.exoplayer");
    }

    public h0(i2.o r34) {
        throw new UnsupportedOperationException("Method not decompiled: i2.h0.<init>(i2.o):void");
    }

    public static long m1(k1 k1Var) {
        b2.o1 o1Var = new b2.o1();
        b2.m1 m1Var = new b2.m1();
        k1Var.f11069a.g(k1Var.f11070b.f45920a, m1Var);
        long j10 = k1Var.f11071c;
        if (j10 == -9223372036854775807L) {
            return k1Var.f11069a.m(m1Var.f2217c, o1Var, 0L).f2270l;
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
        if (this.f11011p0.f11069a.p()) {
            int i10 = this.f11013q0;
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }
        k1 k1Var = this.f11011p0;
        return k1Var.f11069a.b(k1Var.f11070b.f45920a);
    }

    @Override
    public final Looper A0() {
        return this.f11018t;
    }

    public final void A1(m mVar) {
        k1 k1Var = this.f11011p0;
        k1 c10 = k1Var.c(k1Var.f11070b);
        c10.f11082q = c10.f11084s;
        c10.f11083r = 0L;
        k1 n12 = n1(c10, 1);
        if (mVar != null) {
            n12 = n12.f(mVar);
        }
        this.J++;
        this.f11003l.f11169n.a(6).b();
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
        this.f11005m.e(15, new w(this, 4));
    }

    @Override
    public final void B0() {
        F1();
        if (this.f10987b0 != 0.0f) {
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
        String str = e2.m0.f8375a;
        h0 h0Var = this.f10992f;
        boolean n10 = h0Var.n();
        boolean e02 = h0Var.e0();
        boolean T0 = h0Var.T0();
        boolean S0 = h0Var.S0();
        boolean P0 = h0Var.P0();
        boolean v02 = h0Var.v0();
        boolean p5 = h0Var.y0().p();
        ?? obj = new Object();
        obj.f2084a = new b2.u();
        b2.u uVar = (b2.u) obj.f2084a;
        uVar.c(this.f10988c.f2097a);
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
        b2.c1 c1Var2 = new b2.c1(uVar.d());
        this.P = c1Var2;
        if (!c1Var2.equals(c1Var)) {
            this.f11005m.c(13, new w(this, 3));
        }
    }

    @Override
    public final void C(b2.e1 e1Var) {
        boolean z10;
        F1();
        e1Var.getClass();
        e2.r rVar = this.f11005m;
        if (rVar.f8400i) {
            if (Thread.currentThread() == rVar.f8395a) {
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
            if (qVar.f8392a.equals(e1Var)) {
                e2.p pVar = rVar.f8397c;
                qVar.d = true;
                if (pVar != null && qVar.f8394c) {
                    qVar.f8394c = false;
                    pVar.c(qVar.f8392a, qVar.f8393b.d());
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
        k1 k1Var = this.f11011p0;
        int i12 = k1Var.f11079n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (k1Var.f11077l == z10 && i12 == i11 && k1Var.f11078m == i10) {
            return;
        }
        this.J++;
        if (k1Var.f11081p) {
            k1Var = k1Var.a();
        }
        k1 e = k1Var.e(i10, i11, z10);
        e2.i0 i0Var = this.f11003l.f11169n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8356a = i0Var.f8360a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final b2 D() {
        F1();
        return this.f11002k0;
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
        k1 k1Var2 = this.f11011p0;
        this.f11011p0 = k1Var;
        boolean equals = k1Var2.f11069a.equals(k1Var.f11069a);
        b2.o1 o1Var = (b2.o1) this.f2149a;
        b2.m1 m1Var = this.f11008o;
        b2.p1 p1Var = k1Var2.f11069a;
        u2.g0 g0Var = k1Var2.f11070b;
        b2.p1 p1Var2 = k1Var.f11069a;
        u2.g0 g0Var2 = k1Var.f11070b;
        if (p1Var2.p() && p1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (p1Var2.p() != p1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!p1Var.m(p1Var.g(g0Var.f45920a, m1Var).f2217c, o1Var, 0L).f2262a.equals(p1Var2.m(p1Var2.g(g0Var2.f45920a, m1Var).f2217c, o1Var, 0L).f2262a)) {
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
            p0Var = !k1Var.f11069a.p() ? k1Var.f11069a.m(k1Var.f11069a.g(k1Var.f11070b.f45920a, this.f11008o).f2217c, (b2.o1) this.f2149a, 0L).f2264c : null;
            this.f11009o0 = b2.s0.L;
        } else {
            p0Var = null;
        }
        if (booleanValue || !k1Var2.f11075j.equals(k1Var.f11075j)) {
            b2.r0 a2 = this.f11009o0.a();
            List list = k1Var.f11075j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.u0 u0Var = (b2.u0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.t0[] t0VarArr = u0Var.f2402a;
                    if (i17 < t0VarArr.length) {
                        t0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.f11009o0 = new b2.s0(a2);
        }
        b2.s0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z15 = k1Var2.f11077l != k1Var.f11077l;
        boolean z16 = k1Var2.e != k1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = k1Var2.f11073g != k1Var.f11073g;
        if (!equals) {
            this.f11005m.c(0, new r(k1Var, i10, 0));
        }
        if (z10) {
            b2.m1 m1Var2 = new b2.m1();
            if (k1Var2.f11069a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                i15 = i14;
                obj = null;
                p0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = k1Var2.f11070b.f45920a;
                k1Var2.f11069a.g(obj5, m1Var2);
                int i18 = m1Var2.f2217c;
                int b10 = k1Var2.f11069a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = k1Var2.f11069a.m(i18, (b2.o1) this.f2149a, 0L).f2262a;
                p0Var2 = ((b2.o1) this.f2149a).f2264c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            }
            if (i11 == 0) {
                if (k1Var2.f11070b.b()) {
                    u2.g0 g0Var3 = k1Var2.f11070b;
                    j13 = m1Var2.a(g0Var3.f45921b, g0Var3.f45922c);
                    m12 = m1(k1Var2);
                } else if (k1Var2.f11070b.e != -1) {
                    j13 = m1(this.f11011p0);
                    m12 = j13;
                } else {
                    j11 = m1Var2.e;
                    j12 = m1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (k1Var2.f11070b.b()) {
                j13 = k1Var2.f11084s;
                m12 = m1(k1Var2);
            } else {
                j11 = m1Var2.e;
                j12 = k1Var2.f11084s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.m0.h0(j13);
            long h03 = e2.m0.h0(m12);
            u2.g0 g0Var4 = k1Var2.f11070b;
            b2.f1 f1Var = new b2.f1(obj, i14, p0Var2, obj2, i15, h02, h03, g0Var4.f45921b, g0Var4.f45922c);
            b2.o1 o1Var2 = (b2.o1) this.f2149a;
            int n02 = n0();
            int A = A();
            if (this.f11011p0.f11069a.p()) {
                obj3 = null;
                p0Var3 = null;
                obj4 = null;
            } else {
                k1 k1Var3 = this.f11011p0;
                Object obj6 = k1Var3.f11070b.f45920a;
                k1Var3.f11069a.g(obj6, this.f11008o);
                A = this.f11011p0.f11069a.b(obj6);
                Object obj7 = this.f11011p0.f11069a.m(n02, o1Var2, 0L).f2262a;
                p0Var3 = o1Var2.f2264c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i19 = A;
            long h04 = e2.m0.h0(j10);
            long h05 = this.f11011p0.f11070b.b() ? e2.m0.h0(m1(this.f11011p0)) : h04;
            u2.g0 g0Var5 = this.f11011p0.f11070b;
            this.f11005m.c(11, new hg.b2(i11, f1Var, new b2.f1(obj3, n02, p0Var3, obj4, i19, h04, h05, g0Var5.f45921b, g0Var5.f45922c), 1));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.f11005m.c(1, new r(p0Var, intValue, 1));
        }
        if (k1Var2.f11072f != k1Var.f11072f) {
            this.f11005m.c(10, new e2.o() {
                @Override
                public final void invoke(Object obj8) {
                    b2.e1 e1Var = (b2.e1) obj8;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
            if (k1Var.f11072f != null) {
                this.f11005m.c(10, new e2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.e1 e1Var = (b2.e1) obj8;
                        switch (r2) {
                            case 0:
                                k1 k1Var4 = k1Var;
                                e1Var.onLoadingChanged(k1Var4.f11073g);
                                e1Var.onIsLoadingChanged(k1Var4.f11073g);
                                return;
                            case 1:
                                k1 k1Var5 = k1Var;
                                e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                                return;
                            case 2:
                                e1Var.onPlaybackStateChanged(k1Var.e);
                                return;
                            case 3:
                                k1 k1Var6 = k1Var;
                                e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                                return;
                            case 4:
                                e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                                return;
                            case 5:
                                e1Var.onIsPlayingChanged(k1Var.m());
                                return;
                            case 6:
                                e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                                return;
                            case 7:
                                e1Var.onPlayerErrorChanged(k1Var.f11072f);
                                return;
                            case 8:
                                e1Var.onPlayerError(k1Var.f11072f);
                                return;
                            default:
                                e1Var.onTracksChanged(k1Var.f11074i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.t tVar = k1Var2.f11074i;
        x2.t tVar2 = k1Var.f11074i;
        if (tVar != tVar2) {
            x2.s sVar = this.f10997i;
            Object obj8 = tVar2.e;
            sVar.getClass();
            sVar.f47790c = (x2.r) obj8;
            this.f11005m.c(2, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (!z13) {
            this.f11005m.c(14, new s(this.Q));
        }
        if (z17) {
            this.f11005m.c(3, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (z14 || z15) {
            this.f11005m.c(-1, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (z14) {
            this.f11005m.c(4, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (z15 || k1Var2.f11078m != k1Var.f11078m) {
            this.f11005m.c(5, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.f11079n != k1Var.f11079n) {
            this.f11005m.c(6, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.m() != k1Var.m()) {
            this.f11005m.c(7, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        if (!k1Var2.f11080o.equals(k1Var.f11080o)) {
            this.f11005m.c(12, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.f11073g);
                            e1Var.onIsLoadingChanged(k1Var4.f11073g);
                            return;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.f11077l, k1Var5.e);
                            return;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            return;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.f11077l, k1Var6.f11078m);
                            return;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.f11079n);
                            return;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            return;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.f11080o);
                            return;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f11072f);
                            return;
                        case 8:
                            e1Var.onPlayerError(k1Var.f11072f);
                            return;
                        default:
                            e1Var.onTracksChanged(k1Var.f11074i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f11005m.b();
        if (k1Var2.f11081p != k1Var.f11081p) {
            Iterator it = this.f11006n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).f10929a.E1();
            }
        }
    }

    @Override
    public final b2.u1 E0() {
        F1();
        return ((x2.n) this.f10997i).j();
    }

    public final void E1() {
        int d = d();
        ai.a aVar = this.A;
        ac.a aVar2 = this.f11024z;
        boolean z10 = false;
        if (d != 1) {
            if (d != 2 && d != 3) {
                if (d != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f11011p0.f11081p;
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
        return this.f10987b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f11011p0.f11069a.p()) {
            return this.f11015r0;
        }
        k1 k1Var = this.f11011p0;
        long j10 = 0;
        if (k1Var.f11076k.d != k1Var.f11070b.d) {
            return e2.m0.h0(k1Var.f11069a.m(n0(), (b2.o1) this.f2149a, 0L).f2271m);
        }
        long j11 = k1Var.f11082q;
        if (this.f11011p0.f11076k.b()) {
            k1 k1Var2 = this.f11011p0;
            k1Var2.f11069a.g(k1Var2.f11076k.f45920a, this.f11008o).d(this.f11011p0.f11076k.f45921b);
        } else {
            j10 = j11;
        }
        k1 k1Var3 = this.f11011p0;
        b2.p1 p1Var = k1Var3.f11069a;
        Object obj = k1Var3.f11076k.f45920a;
        b2.m1 m1Var = this.f11008o;
        p1Var.g(obj, m1Var);
        return e2.m0.h0(j10 + m1Var.e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f11018t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.m0.f8375a;
            Locale locale = Locale.US;
            String i10 = org.telegram.ui.Cells.c1.i("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f10993f0) {
                if (this.f10995g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.m("ExoPlayerImpl", i10, illegalStateException);
                this.f10995g0 = true;
                return;
            }
            throw new IllegalStateException(i10);
        }
    }

    @Override
    public final void G0(int i10) {
        F1();
    }

    @Override
    public final b2.f H() {
        F1();
        return this.f10985a0;
    }

    @Override
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override
    public final b2.q J() {
        F1();
        return this.f11000j0;
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
        return e2.m0.h0(j1(this.f11011p0));
    }

    @Override
    public final int N() {
        F1();
        if (n()) {
            return this.f11011p0.f11070b.f45922c;
        }
        return -1;
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        F1();
        if (this.f10998i0) {
            return;
        }
        boolean equals = Objects.equals(this.f10985a0, fVar);
        e2.r rVar = this.f11005m;
        if (!equals) {
            this.f10985a0 = fVar;
            t1(1, 3, fVar);
            rVar.c(20, new f1.a(fVar, 5));
        }
        b2.f fVar2 = this.f10985a0;
        e2.i0 i0Var = this.f11003l.f11169n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8356a = i0Var.f8360a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
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
        u6.g(z10);
        ArrayList arrayList = this.f11010p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((d0) arrayList.get(i12)).f10939b.f46052k.a((b2.p0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.f11003l.f11169n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8356a = i0Var.f8360a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                b2.p1 p1Var = d0Var.f10940c;
                b2.p0 p0Var = (b2.p0) list.get(i13 - i10);
                if (p1Var instanceof u2.q1) {
                    q1Var = new u2.q1(((u2.q1) p1Var).e, p0Var);
                } else {
                    q1Var = new u2.q1(p1Var, p0Var);
                }
                d0Var.f10940c = q1Var;
            }
            D1(this.f11011p0.j(new p1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f11011p0.f11069a.p()) {
            if (this.f11013q0 == -1) {
                z11 = true;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        k1 r12 = r1(e1(this.f11011p0, min, g12), i10, min);
        D1(r12, 0, !r12.f11070b.f45920a.equals(this.f11011p0.f11070b.f45920a), 4, j1(r12), -1, false);
    }

    @Override
    public final long O0() {
        F1();
        return this.f11004l0;
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
        int size = this.f11010p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            k1 r12 = r1(this.f11011p0, i10, min);
            D1(r12, 0, !r12.f11070b.f45920a.equals(this.f11011p0.f11070b.f45920a), 4, j1(r12), -1, false);
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
        surfaceHolder.addCallback(this.f11021w);
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
        float f10 = this.f10987b0;
        if (f10 == h) {
            return;
        }
        if (h != 0.0f) {
            f10 = h;
        }
        this.f10989c0 = f10;
        this.f10987b0 = h;
        this.f11003l.f11169n.b(32, Float.valueOf(h)).b();
        this.f11005m.e(22, new u(h, 0));
    }

    @Override
    public final b2.z0 W() {
        F1();
        return this.f11011p0.f11072f;
    }

    @Override
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.f8375a + "] [" + b2.q0.b() + "]");
        F1();
        this.f11023y.w();
        this.f11024z.c(false);
        this.A.a(false);
        g0 g0Var = this.E;
        if (g0Var != null && Build.VERSION.SDK_INT >= 34) {
            g0.a(g0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f8340f.f8360a.removeCallbacksAndMessages(null);
        e0Var.f8337a.C(e0Var.f8338b);
        r0 r0Var = this.f11003l;
        if (!r0Var.Z && r0Var.f11176s.getThread().isAlive()) {
            r0Var.Z = true;
            e2.i iVar = new e2.i(r0Var.F);
            r0Var.f11169n.b(7, iVar).b();
            z10 = iVar.c(r0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f11005m.e(10, new c2(20));
        }
        this.f11005m.d();
        this.f10999j.f8360a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f11020u;
        j2.f fVar = this.f11016s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f48524c.f46466a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f48509b == fVar) {
                bVar.f48510c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        k1 k1Var = this.f11011p0;
        if (k1Var.f11081p) {
            this.f11011p0 = k1Var.a();
        }
        k1 n12 = n1(this.f11011p0, 1);
        this.f11011p0 = n12;
        k1 c10 = n12.c(n12.f11070b);
        this.f11011p0 = c10;
        c10.f11082q = c10.f11084s;
        this.f11011p0.f11083r = 0L;
        j2.f fVar2 = this.f11016s;
        e2.i0 i0Var = fVar2.f12533n;
        i0Var.getClass();
        i0Var.d(new ig.t0(fVar2, 5));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f10991e0 = d2.c.d;
        this.f10998i0 = true;
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
            b2.p1 p1Var = this.f11011p0.f11069a;
            if (!p1Var.p() && i10 >= p1Var.o()) {
                return;
            }
            j2.f fVar = this.f11016s;
            if (!fVar.f12534r) {
                j2.a l4 = fVar.l();
                fVar.f12534r = true;
                fVar.q(l4, -1, new f1.a(l4, 16));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.f11011p0);
                o0Var.f(1);
                h0 h0Var = this.f11001k.f11214b;
                h0Var.f10999j.d(new q3(12, h0Var, o0Var));
                return;
            }
            k1 k1Var = this.f11011p0;
            int i11 = k1Var.e;
            if (i11 == 3 || (i11 == 4 && !p1Var.p())) {
                k1Var = this.f11011p0.h(2);
            }
            int n02 = n0();
            k1 o12 = o1(k1Var, p1Var, p1(p1Var, i10, j10));
            this.f11003l.f11169n.b(3, new q0(p1Var, i10, e2.m0.S(j10))).b();
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
        return i1(this.f11011p0);
    }

    @Override
    public final void b() {
        int i10;
        F1();
        k1 k1Var = this.f11011p0;
        if (k1Var.e != 1) {
            return;
        }
        k1 f7 = k1Var.f(null);
        if (f7.f11069a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        k1 n12 = n1(f7, i10);
        this.J++;
        this.f11003l.f11169n.a(29).b();
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
        int min = Math.min(i10, this.f11010p.size());
        if (this.f11011p0.f11069a.p()) {
            if (this.f11013q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-9223372036854775807L, g12, z11, -1);
            return;
        }
        D1(e1(this.f11011p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final boolean c() {
        F1();
        return this.f11011p0.f11073g;
    }

    @Override
    public final void c0() {
        F1();
        if (this.f10987b0 == 0.0f) {
            float f7 = this.f10989c0;
            if (f7 != 0.0f) {
                U(f7);
            }
        }
    }

    @Override
    public final int d() {
        F1();
        return this.f11011p0.e;
    }

    @Override
    public final long d0() {
        F1();
        if (n()) {
            k1 k1Var = this.f11011p0;
            if (k1Var.f11076k.equals(k1Var.f11070b)) {
                return e2.m0.h0(this.f11011p0.f11082q);
            }
            return getDuration();
        }
        return F0();
    }

    public final k1 e1(k1 k1Var, int i10, ArrayList arrayList) {
        b2.p1 p1Var = k1Var.f11069a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f11010p;
            if (i11 < size) {
                i1 i1Var = new i1((u2.a) arrayList.get(i11), this.f11012q);
                arrayList2.add(i1Var);
                arrayList3.add(i11 + i10, new d0(i1Var.f11047b, i1Var.f11046a));
                i11++;
            } else {
                this.O = this.O.f(i10, arrayList2.size());
                p1 p1Var2 = new p1(arrayList3, this.O);
                k1 o12 = o1(k1Var, p1Var2, l1(p1Var, p1Var2, k1(k1Var), i1(k1Var)));
                u2.i1 i1Var2 = this.O;
                e2.i0 i0Var = this.f11003l.f11169n;
                m0 m0Var = new m0(arrayList2, i1Var2, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.f8356a = i0Var.f8360a.obtainMessage(18, i10, 0, m0Var);
                c10.b();
                return o12;
            }
        }
    }

    @Override
    public final void f(b2.a1 a1Var) {
        F1();
        if (this.f11011p0.f11080o.equals(a1Var)) {
            return;
        }
        k1 g10 = this.f11011p0.g(a1Var);
        this.J++;
        this.f11003l.f11169n.b(4, a1Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.s0 f1() {
        boolean z10;
        b2.p1 y02 = y0();
        if (y02.p()) {
            return this.f11009o0;
        }
        b2.p0 p0Var = y02.m(n0(), (b2.o1) this.f2149a, 0L).f2264c;
        b2.r0 a2 = this.f11009o0.a();
        b2.s0 s0Var = p0Var.d;
        if (s0Var != null) {
            e9.n0 n0Var = s0Var.K;
            byte[] bArr = s0Var.f2354k;
            CharSequence charSequence = s0Var.f2347a;
            if (charSequence != null) {
                a2.f2299a = charSequence;
            }
            CharSequence charSequence2 = s0Var.f2348b;
            if (charSequence2 != null) {
                a2.f2300b = charSequence2;
            }
            CharSequence charSequence3 = s0Var.f2349c;
            if (charSequence3 != null) {
                a2.f2301c = charSequence3;
            }
            CharSequence charSequence4 = s0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = s0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = s0Var.f2350f;
            if (charSequence6 != null) {
                a2.f2302f = charSequence6;
            }
            CharSequence charSequence7 = s0Var.f2351g;
            if (charSequence7 != null) {
                a2.f2303g = charSequence7;
            }
            Long l4 = s0Var.h;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.g(z10);
                a2.h = l4;
            }
            b2.h1 h1Var = s0Var.f2352i;
            if (h1Var != null) {
                a2.f2304i = h1Var;
            }
            b2.h1 h1Var2 = s0Var.f2353j;
            if (h1Var2 != null) {
                a2.f2305j = h1Var2;
            }
            Uri uri = s0Var.f2357n;
            if (uri != null || bArr != null) {
                a2.f2309n = uri;
                a2.b(bArr, s0Var.f2356m);
                a2.f2307l = s0Var.f2355l;
            }
            Integer num = s0Var.f2358o;
            if (num != null) {
                a2.f2310o = num;
            }
            Integer num2 = s0Var.f2359p;
            if (num2 != null) {
                a2.f2311p = num2;
            }
            Integer num3 = s0Var.f2360q;
            if (num3 != null) {
                a2.f2312q = num3;
            }
            Boolean bool = s0Var.f2361r;
            if (bool != null) {
                a2.f2313r = bool;
            }
            Boolean bool2 = s0Var.f2362s;
            if (bool2 != null) {
                a2.f2314s = bool2;
            }
            Integer num4 = s0Var.f2363t;
            if (num4 != null) {
                a2.f2315t = num4;
            }
            Integer num5 = s0Var.f2364u;
            if (num5 != null) {
                a2.f2315t = num5;
            }
            Integer num6 = s0Var.v;
            if (num6 != null) {
                a2.f2316u = num6;
            }
            Integer num7 = s0Var.f2365w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = s0Var.f2366x;
            if (num8 != null) {
                a2.f2317w = num8;
            }
            Integer num9 = s0Var.f2367y;
            if (num9 != null) {
                a2.f2318x = num9;
            }
            Integer num10 = s0Var.f2368z;
            if (num10 != null) {
                a2.f2319y = num10;
            }
            CharSequence charSequence8 = s0Var.A;
            if (charSequence8 != null) {
                a2.f2320z = charSequence8;
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
            if (!n0Var.isEmpty()) {
                a2.J = e9.n0.u(n0Var);
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
            arrayList.add(this.f11014r.a((b2.p0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (n()) {
            k1 k1Var = this.f11011p0;
            u2.g0 g0Var = k1Var.f11070b;
            b2.p1 p1Var = k1Var.f11069a;
            Object obj = g0Var.f45920a;
            b2.m1 m1Var = this.f11008o;
            p1Var.g(obj, m1Var);
            return e2.m0.h0(m1Var.a(g0Var.f45921b, g0Var.f45922c));
        }
        return z();
    }

    @Override
    public final b2.a1 h() {
        F1();
        return this.f11011p0.f11080o;
    }

    @Override
    public final w1 h0() {
        F1();
        return this.f11011p0.f11074i.d;
    }

    public final n1 h1(m1 m1Var) {
        int k12 = k1(this.f11011p0);
        b2.p1 p1Var = this.f11011p0.f11069a;
        if (k12 == -1) {
            k12 = 0;
        }
        r0 r0Var = this.f11003l;
        return new n1(r0Var, m1Var, p1Var, k12, r0Var.f11176s);
    }

    @Override
    public final b2.s0 i0() {
        F1();
        return this.R;
    }

    public final long i1(k1 k1Var) {
        u2.g0 g0Var = k1Var.f11070b;
        long j10 = k1Var.f11071c;
        b2.p1 p1Var = k1Var.f11069a;
        if (g0Var.b()) {
            Object obj = k1Var.f11070b.f45920a;
            b2.m1 m1Var = this.f11008o;
            p1Var.g(obj, m1Var);
            if (j10 == -9223372036854775807L) {
                return e2.m0.h0(p1Var.m(k1(k1Var), (b2.o1) this.f2149a, 0L).f2270l);
            }
            return e2.m0.h0(j10) + e2.m0.h0(m1Var.e);
        }
        return e2.m0.h0(j1(k1Var));
    }

    @Override
    public final void j(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.f11003l.f11169n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8356a = i0Var.f8360a.obtainMessage(11, i10, 0);
            c10.b();
            v vVar = new v(i10, 0);
            e2.r rVar = this.f11005m;
            rVar.c(8, vVar);
            B1();
            rVar.b();
        }
    }

    public final long j1(k1 k1Var) {
        long j10;
        if (k1Var.f11069a.p()) {
            return e2.m0.S(this.f11015r0);
        }
        if (k1Var.f11081p) {
            j10 = k1Var.l();
        } else {
            j10 = k1Var.f11084s;
        }
        if (k1Var.f11070b.b()) {
            return j10;
        }
        b2.p1 p1Var = k1Var.f11069a;
        Object obj = k1Var.f11070b.f45920a;
        b2.m1 m1Var = this.f11008o;
        p1Var.g(obj, m1Var);
        return j10 + m1Var.e;
    }

    @Override
    public final d2.c k0() {
        F1();
        return this.f10991e0;
    }

    public final int k1(k1 k1Var) {
        if (k1Var.f11069a.p()) {
            return this.f11013q0;
        }
        return k1Var.f11069a.g(k1Var.f11070b.f45920a, this.f11008o).f2217c;
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
            Pair i12 = p1Var.i((b2.o1) this.f2149a, this.f11008o, i10, e2.m0.S(j10));
            Object obj = i12.first;
            if (p1Var2.b(obj) != -1) {
                return i12;
            }
            int U = r0.U((b2.o1) this.f2149a, this.f11008o, this.H, this.I, obj, p1Var, p1Var2);
            if (U != -1) {
                b2.o1 o1Var = (b2.o1) this.f2149a;
                p1Var2.m(U, o1Var, 0L);
                return p1(p1Var2, U, e2.m0.h0(o1Var.f2270l));
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
            return this.f11011p0.f11070b.f45921b;
        }
        return -1;
    }

    @Override
    public final boolean n() {
        F1();
        return this.f11011p0.f11070b.b();
    }

    @Override
    public final int n0() {
        F1();
        int k12 = k1(this.f11011p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final k1 o1(k1 k1Var, b2.p1 p1Var, Pair pair) {
        boolean z10;
        u2.g0 g0Var;
        u2.r1 r1Var;
        x2.t tVar;
        List list;
        int i10;
        long j10;
        if (!p1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        b2.p1 p1Var2 = k1Var.f11069a;
        long i12 = i1(k1Var);
        k1 j11 = k1Var.j(p1Var);
        if (p1Var.p()) {
            u2.g0 g0Var2 = k1.f11068u;
            long S = e2.m0.S(this.f11015r0);
            k1 c10 = j11.d(g0Var2, S, S, S, 0L, u2.r1.d, this.f10986b, x1.e).c(g0Var2);
            c10.f11082q = c10.f11084s;
            return c10;
        }
        Object obj = j11.f11070b.f45920a;
        String str = e2.m0.f8375a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new u2.g0(pair.first);
        } else {
            g0Var = j11.f11070b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.m0.S(i12);
        if (!p1Var2.p()) {
            S2 -= p1Var2.g(obj, this.f11008o).e;
            if (equals && S2 - longValue == 1 && S2 == p1Var2.g(obj, this.f11008o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.g0 g0Var3 = g0Var;
            u6.p(!g0Var3.b());
            if (!equals) {
                r1Var = u2.r1.d;
            } else {
                r1Var = j11.h;
            }
            u2.r1 r1Var2 = r1Var;
            if (!equals) {
                tVar = this.f10986b;
            } else {
                tVar = j11.f11074i;
            }
            x2.t tVar2 = tVar;
            if (!equals) {
                e9.l0 l0Var = e9.n0.f8595b;
                list = x1.e;
            } else {
                list = j11.f11075j;
            }
            k1 c11 = j11.d(g0Var3, longValue, longValue, longValue, 0L, r1Var2, tVar2, list).c(g0Var3);
            c11.f11082q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = p1Var.b(j11.f11076k.f45920a);
            if (b10 != -1 && p1Var.f(b10, this.f11008o, false).f2217c == p1Var.g(g0Var.f45920a, this.f11008o).f2217c) {
                return j11;
            }
            p1Var.g(g0Var.f45920a, this.f11008o);
            if (g0Var.b()) {
                j10 = this.f11008o.a(g0Var.f45921b, g0Var.f45922c);
            } else {
                j10 = this.f11008o.d;
            }
            u2.g0 g0Var4 = g0Var;
            k1 c12 = j11.d(g0Var4, j11.f11084s, j11.f11084s, j11.d, j10 - j11.f11084s, j11.h, j11.f11074i, j11.f11075j).c(g0Var4);
            c12.f11082q = j10;
            return c12;
        } else {
            u2.g0 g0Var5 = g0Var;
            u6.p(!g0Var5.b());
            long max = Math.max(0L, j11.f11083r - (longValue - S2));
            long j12 = j11.f11082q;
            if (j11.f11076k.equals(j11.f11070b)) {
                j12 = longValue + max;
            }
            k1 d = j11.d(g0Var5, longValue, longValue, longValue, max, j11.h, j11.f11074i, j11.f11075j);
            d.f11082q = j12;
            return d;
        }
    }

    @Override
    public final void p(b2.u1 u1Var) {
        F1();
        x2.s sVar = this.f10997i;
        sVar.getClass();
        b2.u1 E0 = E0();
        if (!u1Var.equals(((x2.n) sVar).j())) {
            sVar.b(u1Var);
        }
        if (!E0.equals(u1Var)) {
            this.f11005m.e(19, new f1.a(u1Var, 6));
        }
    }

    @Override
    public final void p0(b2.e1 e1Var) {
        e1Var.getClass();
        this.f11005m.a(e1Var);
    }

    public final Pair p1(b2.p1 p1Var, int i10, long j10) {
        if (p1Var.p()) {
            this.f11013q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f11015r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= p1Var.o()) {
            i10 = p1Var.a(this.I);
            j10 = e2.m0.h0(p1Var.m(i10, (b2.o1) this.f2149a, 0L).f2270l);
        }
        return p1Var.i((b2.o1) this.f2149a, this.f11008o, i10, e2.m0.S(j10));
    }

    @Override
    public final long q() {
        F1();
        return e2.m0.h0(this.f11011p0.f11083r);
    }

    @Override
    public final void q0(boolean z10) {
        F1();
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.f8418a && i11 == yVar.f8419b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        org.telegram.messenger.f1 f1Var = this.f11017s0;
        if (f1Var != null) {
            f1Var.execute(new hg.n(this, i10, i11, 1));
            return;
        }
        this.f11005m.e(24, new eh.c(i10, i11, 1));
        t1(2, 14, new e2.y(i10, i11));
    }

    public final k1 r1(k1 k1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(k1Var);
        long i12 = i1(k1Var);
        b2.p1 p1Var = k1Var.f11069a;
        this.J++;
        int i13 = i11 - 1;
        while (true) {
            arrayList = this.f11010p;
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
            if (r0.U((b2.o1) this.f2149a, this.f11008o, this.H, this.I, k1Var.f11070b.f45920a, p1Var, p1Var2) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.i1 i1Var = this.O;
        e2.i0 i0Var = this.f11003l.f11169n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f8356a = i0Var.f8360a.obtainMessage(20, i10, i11, i1Var);
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
        b0 b0Var = this.f11021w;
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
        this.f10991e0 = new d2.c(this.f11011p0.f11084s, x1.e);
    }

    @Override
    public final boolean t() {
        F1();
        return this.f11011p0.f11077l;
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
        ArrayList arrayList = this.f11010p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.p1 y02 = y0();
            this.J++;
            e2.m0.R(i10, min, min2, arrayList);
            this.O = this.O.g();
            p1 p1Var = new p1(arrayList, this.O);
            k1 k1Var = this.f11011p0;
            k1 o12 = o1(k1Var, p1Var, l1(y02, p1Var, k1(k1Var), i1(this.f11011p0)));
            u2.i1 i1Var = this.O;
            r0 r0Var = this.f11003l;
            r0Var.getClass();
            r0Var.f11169n.b(19, new n0(i10, min, min2, i1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void t1(int i10, int i11, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f10994g) {
            if (i10 == -1 || bVar.f10920b == i10) {
                n1 h12 = h1(bVar);
                u6.p(!h12.f11102f);
                h12.f11101c = i11;
                u6.p(!h12.f11102f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.f10920b == i10)) {
                n1 h13 = h1(bVar2);
                u6.p(!h13.f11102f);
                h13.f11101c = i11;
                u6.p(!h13.f11102f);
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
            e2.i0 i0Var = this.f11003l.f11169n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f8356a = i0Var.f8360a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            x xVar = new x(0, z10);
            e2.r rVar = this.f11005m;
            rVar.c(9, xVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final int w0() {
        F1();
        return this.f11011p0.f11079n;
    }

    public final void w1(t1 t1Var) {
        F1();
        if (t1Var == null) {
            t1Var = t1.f11197f;
        }
        if (!this.N.equals(t1Var)) {
            this.N = t1Var;
            this.f11003l.f11169n.b(5, t1Var).b();
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
        r0 r0Var = this.f11003l;
        if (!r0Var.Z && r0Var.f11176s.getThread().isAlive()) {
            e2.i iVar = new e2.i(r0Var.F);
            r0Var.f11169n.b(30, new Pair(surface, iVar)).b();
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
        return this.f11007n0;
    }

    @Override
    public final b2.p1 y0() {
        F1();
        return this.f11011p0.f11069a;
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
        textureView.setSurfaceTextureListener(this.f11021w);
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
