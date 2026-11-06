package l2;

import a8.ia;
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
import di.q4;
import e2.x1;
import hi.x3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import jg.a2;
import org.telegram.ui.Components.f51;
public final class i0 extends bi.b1 implements p {
    public final ci.a A;
    public final long B;
    public final h2.c C;
    public final h2.e0 D;
    public final h0 E;
    public final j2.n F;
    public final j2.n G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final s1 M;
    public t1 N;
    public x2.h1 O;
    public e2.y0 P;
    public e2.o0 Q;
    public e2.o0 R;
    public e2.u S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public h2.y Z;
    public e2.e f17849a0;
    public final a3.y f17850b;
    public float f17851b0;
    public final e2.y0 f17852c;
    public float f17853c0;
    public final h2.i d;
    public boolean f17854d0;
    public final Context f17855e;
    public g2.d f17856e0;
    public final i0 f17857f;
    public final boolean f17858f0;
    public final b[] f17859g;
    public boolean f17860g0;
    public final b[] h;
    public final int f17861h0;
    public final a3.x f17862i;
    public boolean f17863i0;
    public final h2.i0 f17864j;
    public final e2.o f17865j0;
    public final v f17866k;
    public x1 f17867k0;
    public final r0 f17868l;
    public final long f17869l0;
    public final h2.r f17870m;
    public final long m0;
    public final CopyOnWriteArraySet f17871n;
    public final long f17872n0;
    public final e2.i1 f17873o;
    public e2.o0 f17874o0;
    public final ArrayList f17875p;
    public k1 f17876p0;
    public final boolean f17877q;
    public int f17878q0;
    public final x2.f0 f17879r;
    public long f17880r0;
    public final m2.e f17881s;
    public f51 f17882s0;
    public final Looper f17883t;
    public final ArrayList f17884t0;
    public final b3.d f17885u;
    public final h2.g0 v;
    public final c0 f17886w;
    public final d0 f17887x;
    public final ab.q f17888y;
    public final h2.p0 f17889z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    public i0(l2.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: l2.i0.<init>(l2.n):void");
    }

    public static long m1(k1 k1Var) {
        e2.k1 k1Var2 = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        k1Var.f17911a.g(k1Var.f17912b.f58210a, i1Var);
        long j3 = k1Var.f17913c;
        if (j3 == -9223372036854775807L) {
            return k1Var.f17911a.m(i1Var.f10282c, k1Var2, 0L).f10333l;
        }
        return i1Var.f10283e + j3;
    }

    public static k1 n1(k1 k1Var, int i7) {
        k1 h = k1Var.h(i7);
        if (i7 != 1 && i7 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final Looper A0() {
        return this.f17883t;
    }

    public final void A1(l lVar) {
        k1 k1Var = this.f17876p0;
        k1 c10 = k1Var.c(k1Var.f17912b);
        c10.f17925q = c10.f17927s;
        c10.f17926r = 0L;
        k1 n1 = n1(c10, 1);
        if (lVar != null) {
            n1 = n1.f(lVar);
        }
        this.J++;
        this.f17868l.f18018n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int B() {
        F1();
        if (this.f17876p0.f17911a.p()) {
            int i7 = this.f17878q0;
            if (i7 == -1) {
                return 0;
            }
            return i7;
        }
        k1 k1Var = this.f17876p0;
        return k1Var.f17911a.b(k1Var.f17912b.f58210a);
    }

    @Override
    public final void B0() {
        F1();
        if (this.f17851b0 != 0.0f) {
            T(0.0f);
        }
    }

    public final void B1() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        e2.y0 y0Var = this.P;
        String str = h2.m0.f14112a;
        i0 i0Var = this.f17857f;
        boolean p10 = i0Var.p();
        boolean e02 = i0Var.e0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean v02 = i0Var.v0();
        boolean p11 = i0Var.y0().p();
        ?? obj = new Object();
        obj.f10645a = new ca.i();
        ca.i iVar = (ca.i) obj.f10645a;
        iVar.c(this.f17852c.f10656a);
        boolean z15 = !p10;
        obj.a(4, z15);
        boolean z16 = false;
        if (e02 && !p10) {
            z9 = true;
        } else {
            z9 = false;
        }
        obj.a(5, z9);
        if (T0 && !p10) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(6, z10);
        if (!p11 && ((T0 || !P0 || e02) && !p10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(7, z11);
        if (S0 && !p10) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(8, z12);
        if (!p11 && ((S0 || (P0 && v02)) && !p10)) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(9, z13);
        obj.a(10, z15);
        if (e02 && !p10) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(11, z14);
        if (e02 && !p10) {
            z16 = true;
        }
        obj.a(12, z16);
        e2.y0 y0Var2 = new e2.y0(iVar.d());
        this.P = y0Var2;
        if (!y0Var2.equals(y0Var)) {
            this.f17870m.c(13, new v(this, 2));
        }
    }

    @Override
    public final x1 C() {
        F1();
        return this.f17867k0;
    }

    @Override
    public final void C0() {
        F1();
    }

    public final void C1(int i7, boolean z9) {
        int i10;
        k1 k1Var = this.f17876p0;
        int i11 = k1Var.f17922n;
        if (i11 == 1 && !z9) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (k1Var.f17920l == z9 && i11 == i10 && k1Var.f17921m == i7) {
            return;
        }
        this.J++;
        if (k1Var.f17924p) {
            k1Var = k1Var.a();
        }
        k1 e10 = k1Var.e(i7, i10, z9);
        h2.i0 i0Var = this.f17868l.f18018n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f14092a = i0Var.f14096a.obtainMessage(1, z9 ? 1 : 0, i7 | (i10 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void D(e2.e eVar, boolean z9) {
        F1();
        if (this.f17863i0) {
            return;
        }
        boolean equals = Objects.equals(this.f17849a0, eVar);
        h2.r rVar = this.f17870m;
        if (!equals) {
            this.f17849a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new q4(eVar, 28));
        }
        e2.e eVar2 = this.f17849a0;
        h2.i0 i0Var = this.f17868l.f18018n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f14092a = i0Var.f14096a.obtainMessage(31, z9 ? 1 : 0, 0, eVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final k1 k1Var, int i7, boolean z9, int i10, long j3, int i11, boolean z10) {
        Pair pair;
        int i12;
        e2.l0 l0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i13;
        int i14;
        Object obj;
        e2.l0 l0Var2;
        Object obj2;
        long j10;
        long j11;
        long j12;
        long m12;
        Object obj3;
        e2.l0 l0Var3;
        Object obj4;
        long j13;
        k1 k1Var2 = this.f17876p0;
        this.f17876p0 = k1Var;
        boolean equals = k1Var2.f17911a.equals(k1Var.f17911a);
        e2.k1 k1Var3 = (e2.k1) this.f3500a;
        e2.i1 i1Var = this.f17873o;
        e2.l1 l1Var = k1Var2.f17911a;
        x2.g0 g0Var = k1Var2.f17912b;
        e2.l1 l1Var2 = k1Var.f17911a;
        x2.g0 g0Var2 = k1Var.f17912b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!l1Var.m(l1Var.g(g0Var.f58210a, i1Var).f10282c, k1Var3, 0L).f10324a.equals(l1Var2.m(l1Var2.g(g0Var2.f58210a, i1Var).f10282c, k1Var3, 0L).f10324a)) {
            if (z9 && i10 == 0) {
                i12 = 1;
            } else if (z9 && i10 == 1) {
                i12 = 2;
            } else if (!equals) {
                i12 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
        } else if (z9 && i10 == 0 && g0Var.d < g0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z9 && i10 == 1 && z10) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!k1Var.f17911a.p()) {
                l0Var = k1Var.f17911a.m(k1Var.f17911a.g(k1Var.f17912b.f58210a, this.f17873o).f10282c, (e2.k1) this.f3500a, 0L).f10326c;
            } else {
                l0Var = null;
            }
            this.f17874o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !k1Var2.f17918j.equals(k1Var.f17918j)) {
            e2.n0 a10 = this.f17874o0.a();
            List list = k1Var.f17918j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                e2.q0 q0Var = (e2.q0) list.get(i15);
                int i16 = 0;
                while (true) {
                    e2.p0[] p0VarArr = q0Var.f10484a;
                    if (i16 < p0VarArr.length) {
                        p0VarArr[i16].b(a10);
                        i16++;
                    }
                }
            }
            this.f17874o0 = new e2.o0(a10);
        }
        e2.o0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (k1Var2.f17920l != k1Var.f17920l) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (k1Var2.f17914e != k1Var.f17914e) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 || z11) {
            E1();
        }
        if (k1Var2.f17916g != k1Var.f17916g) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!equals) {
            this.f17870m.c(0, new q(k1Var, i7, 0));
        }
        if (z9) {
            e2.i1 i1Var2 = new e2.i1();
            if (!k1Var2.f17911a.p()) {
                Object obj5 = k1Var2.f17912b.f58210a;
                k1Var2.f17911a.g(obj5, i1Var2);
                int i17 = i1Var2.f10282c;
                int b10 = k1Var2.f17911a.b(obj5);
                z14 = booleanValue;
                z15 = equals2;
                z16 = z12;
                obj = k1Var2.f17911a.m(i17, (e2.k1) this.f3500a, 0L).f10324a;
                l0Var2 = ((e2.k1) this.f3500a).f10326c;
                obj2 = obj5;
                i13 = i17;
                i14 = b10;
            } else {
                z14 = booleanValue;
                z15 = equals2;
                z16 = z12;
                i13 = i11;
                i14 = i13;
                obj = null;
                l0Var2 = null;
                obj2 = null;
            }
            if (i10 == 0) {
                if (k1Var2.f17912b.b()) {
                    x2.g0 g0Var3 = k1Var2.f17912b;
                    j12 = i1Var2.a(g0Var3.f58211b, g0Var3.f58212c);
                    m12 = m1(k1Var2);
                } else if (k1Var2.f17912b.f58213e != -1) {
                    j12 = m1(this.f17876p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.f10283e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (k1Var2.f17912b.b()) {
                j12 = k1Var2.f17927s;
                m12 = m1(k1Var2);
            } else {
                j10 = i1Var2.f10283e;
                j11 = k1Var2.f17927s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.m0.h0(j12);
            long h03 = h2.m0.h0(m12);
            x2.g0 g0Var4 = k1Var2.f17912b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, g0Var4.f58211b, g0Var4.f58212c);
            e2.k1 k1Var4 = (e2.k1) this.f3500a;
            int o02 = o0();
            int B = B();
            if (!this.f17876p0.f17911a.p()) {
                k1 k1Var5 = this.f17876p0;
                Object obj6 = k1Var5.f17912b.f58210a;
                k1Var5.f17911a.g(obj6, this.f17873o);
                B = this.f17876p0.f17911a.b(obj6);
                Object obj7 = this.f17876p0.f17911a.m(o02, k1Var4, 0L).f10324a;
                l0Var3 = k1Var4.f10326c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            }
            int i18 = B;
            long h04 = h2.m0.h0(j3);
            if (this.f17876p0.f17912b.b()) {
                j13 = h2.m0.h0(m1(this.f17876p0));
            } else {
                j13 = h04;
            }
            x2.g0 g0Var5 = this.f17876p0.f17912b;
            this.f17870m.c(11, new a2(i10, b1Var, new e2.b1(obj3, o02, l0Var3, obj4, i18, h04, j13, g0Var5.f58211b, g0Var5.f58212c), 2));
        } else {
            z14 = booleanValue;
            z15 = equals2;
            z16 = z12;
        }
        if (z14) {
            this.f17870m.c(1, new q(l0Var, intValue, 1));
        }
        if (k1Var2.f17915f != k1Var.f17915f) {
            this.f17870m.c(10, new h2.o() {
                @Override
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
            if (k1Var.f17915f != null) {
                this.f17870m.c(10, new h2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (r2) {
                            case 0:
                                k1 k1Var6 = k1Var;
                                a1Var.h(k1Var6.f17916g);
                                a1Var.j(k1Var6.f17916g);
                                return;
                            case 1:
                                k1 k1Var7 = k1Var;
                                a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                                return;
                            case 2:
                                a1Var.m(k1Var.f17914e);
                                return;
                            case 3:
                                k1 k1Var8 = k1Var;
                                a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                                return;
                            case 4:
                                a1Var.g(k1Var.f17922n);
                                return;
                            case 5:
                                a1Var.P(k1Var.m());
                                return;
                            case 6:
                                a1Var.H(k1Var.f17923o);
                                return;
                            case 7:
                                a1Var.q(k1Var.f17915f);
                                return;
                            case 8:
                                a1Var.y(k1Var.f17915f);
                                return;
                            default:
                                a1Var.u(k1Var.f17917i.d);
                                return;
                        }
                    }
                });
            }
        }
        a3.y yVar = k1Var2.f17917i;
        a3.y yVar2 = k1Var.f17917i;
        if (yVar != yVar2) {
            a3.x xVar = this.f17862i;
            Object obj8 = yVar2.f146e;
            xVar.getClass();
            xVar.f142c = (a3.w) obj8;
            this.f17870m.c(2, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (!z15) {
            this.f17870m.c(14, new r(this.Q));
        }
        if (z13) {
            this.f17870m.c(3, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (z16 || z11) {
            this.f17870m.c(-1, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (z16) {
            this.f17870m.c(4, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (z11 || k1Var2.f17921m != k1Var.f17921m) {
            this.f17870m.c(5, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.f17922n != k1Var.f17922n) {
            this.f17870m.c(6, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.m() != k1Var.m()) {
            this.f17870m.c(7, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        if (!k1Var2.f17923o.equals(k1Var.f17923o)) {
            this.f17870m.c(12, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17916g);
                            a1Var.j(k1Var6.f17916g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17914e, k1Var7.f17920l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17914e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17921m, k1Var8.f17920l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17922n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17923o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17915f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17915f);
                            return;
                        default:
                            a1Var.u(k1Var.f17917i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f17870m.b();
        if (k1Var2.f17924p != k1Var.f17924p) {
            Iterator it = this.f17871n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f17771a.E1();
            }
        }
    }

    @Override
    public final e2.q1 E0() {
        F1();
        return ((a3.s) this.f17862i).j();
    }

    public final void E1() {
        int i7 = i();
        ci.a aVar = this.A;
        h2.p0 p0Var = this.f17889z;
        boolean z9 = false;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z10 = this.f17876p0.f17924p;
                if (u() && !z10) {
                    z9 = true;
                }
                p0Var.c(z9);
                aVar.a(u());
                return;
            }
        }
        p0Var.c(false);
        aVar.a(false);
    }

    @Override
    public final float F() {
        F1();
        return this.f17851b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f17876p0.f17911a.p()) {
            return this.f17880r0;
        }
        k1 k1Var = this.f17876p0;
        long j3 = 0;
        if (k1Var.f17919k.d != k1Var.f17912b.d) {
            return h2.m0.h0(k1Var.f17911a.m(o0(), (e2.k1) this.f3500a, 0L).f10334m);
        }
        long j10 = k1Var.f17925q;
        if (this.f17876p0.f17919k.b()) {
            k1 k1Var2 = this.f17876p0;
            k1Var2.f17911a.g(k1Var2.f17919k.f58210a, this.f17873o).d(this.f17876p0.f17919k.f58211b);
        } else {
            j3 = j10;
        }
        k1 k1Var3 = this.f17876p0;
        e2.l1 l1Var = k1Var3.f17911a;
        Object obj = k1Var3.f17919k.f58210a;
        e2.i1 i1Var = this.f17873o;
        l1Var.g(obj, i1Var);
        return h2.m0.h0(j3 + i1Var.f10283e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f17883t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.m0.f14112a;
            Locale locale = Locale.US;
            String m10 = org.telegram.ui.Cells.f1.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f17858f0) {
                if (this.f17860g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                h2.a.m("ExoPlayerImpl", m10, illegalStateException);
                this.f17860g0 = true;
                return;
            }
            throw new IllegalStateException(m10);
        }
    }

    @Override
    public final void G0(int i7) {
        F1();
    }

    @Override
    public final e2.e H() {
        F1();
        return this.f17849a0;
    }

    @Override
    public final void I0(e2.a1 a1Var) {
        a1Var.getClass();
        this.f17870m.a(a1Var);
    }

    @Override
    public final void J(int i7, boolean z9) {
        F1();
    }

    @Override
    public final e2.o K() {
        F1();
        return this.f17865j0;
    }

    @Override
    public final void K0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.f17870m.e(15, new v(this, 3));
    }

    @Override
    public final void L() {
        F1();
    }

    @Override
    public final void M(int i7, int i10) {
        F1();
    }

    @Override
    public final e2.o0 M0() {
        F1();
        return this.Q;
    }

    @Override
    public final void N(int i7) {
        F1();
    }

    @Override
    public final void N0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override
    public final int O() {
        F1();
        if (p()) {
            return this.f17876p0.f17912b.f58212c;
        }
        return -1;
    }

    @Override
    public final long O0() {
        F1();
        return this.f17869l0;
    }

    @Override
    public final void R(int i7, int i10) {
        boolean z9;
        F1();
        if (i7 >= 0 && i10 >= i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int size = this.f17875p.size();
        int min = Math.min(i10, size);
        if (i7 < size && i7 != min) {
            k1 r12 = r1(this.f17876p0, i7, min);
            D1(r12, 0, !r12.f17912b.f58210a.equals(this.f17876p0.f17912b.f58210a), 4, j1(r12), -1, false);
        }
    }

    @Override
    public final void S(SurfaceHolder surfaceHolder) {
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
        surfaceHolder.addCallback(this.f17886w);
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
    public final void T(float f10) {
        F1();
        float h = h2.m0.h(f10, 0.0f, 1.0f);
        float f11 = this.f17851b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.f17853c0 = f11;
        this.f17851b0 = h;
        this.f17868l.f18018n.b(32, Float.valueOf(h)).b();
        this.f17870m.e(22, new t(h, 0));
    }

    @Override
    public final void V(List list, int i7, long j3) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i7, j3, g12, false);
    }

    @Override
    public final e2.v0 W() {
        F1();
        return this.f17876p0.f17915f;
    }

    @Override
    public final void X(boolean z9) {
        F1();
        C1(1, z9);
    }

    @Override
    public final void X0() {
        boolean z9;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.f14112a + "] [" + e2.m0.b() + "]");
        F1();
        this.f17888y.y();
        this.f17889z.c(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        h2.e0 e0Var = this.D;
        ((h2.i0) e0Var.f14076f).f14096a.removeCallbacksAndMessages(null);
        ((i0) e0Var.f14072a).h0((h2.z) e0Var.f14073b);
        r0 r0Var = this.f17868l;
        if (!r0Var.Z && r0Var.f18025s.getThread().isAlive()) {
            r0Var.Z = true;
            h2.i iVar = new h2.i(r0Var.F);
            r0Var.f18018n.b(7, iVar).b();
            z9 = iVar.c(r0Var.K);
        } else {
            z9 = true;
        }
        if (!z9) {
            this.f17870m.e(10, new x3(19));
        }
        this.f17870m.d();
        this.f17864j.f14096a.removeCallbacksAndMessages(null);
        b3.d dVar = this.f17885u;
        m2.e eVar = this.f17881s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).f2936c.f825b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.f2920b == eVar) {
                cVar.f2921c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        k1 k1Var = this.f17876p0;
        if (k1Var.f17924p) {
            this.f17876p0 = k1Var.a();
        }
        k1 n1 = n1(this.f17876p0, 1);
        this.f17876p0 = n1;
        k1 c10 = n1.c(n1.f17912b);
        this.f17876p0 = c10;
        c10.f17925q = c10.f17927s;
        this.f17876p0.f17926r = 0L;
        m2.e eVar2 = this.f17881s;
        h2.i0 i0Var = eVar2.f19530n;
        i0Var.getClass();
        i0Var.d(new w(eVar2, 9));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f17856e0 = g2.d.d;
        this.f17863i0 = true;
    }

    @Override
    public final void Y0(int i7, long j3, boolean z9) {
        boolean z10;
        F1();
        if (i7 != -1) {
            if (i7 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ia.f(z10);
            e2.l1 l1Var = this.f17876p0.f17911a;
            if (!l1Var.p() && i7 >= l1Var.o()) {
                return;
            }
            m2.e eVar = this.f17881s;
            if (!eVar.f19531r) {
                m2.a Q = eVar.Q();
                eVar.f19531r = true;
                eVar.V(Q, -1, new y(Q, 14));
            }
            this.J++;
            if (p()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.f17876p0);
                o0Var.f(1);
                i0 i0Var = this.f17866k.f18063b;
                i0Var.f17864j.d(new ha.b(23, i0Var, o0Var));
                return;
            }
            k1 k1Var = this.f17876p0;
            int i10 = k1Var.f17914e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                k1Var = this.f17876p0.h(2);
            }
            int o02 = o0();
            k1 o12 = o1(k1Var, l1Var, p1(l1Var, i7, j3));
            this.f17868l.f18018n.b(3, new q0(l1Var, i7, h2.m0.S(j3))).b();
            D1(o12, 0, true, 1, j1(o12), o02, z9);
        }
    }

    @Override
    public final long Z() {
        F1();
        return this.m0;
    }

    @Override
    public final void a() {
        int i7;
        F1();
        k1 k1Var = this.f17876p0;
        if (k1Var.f17914e != 1) {
            return;
        }
        k1 f10 = k1Var.f(null);
        if (f10.f17911a.p()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        k1 n1 = n1(f10, i7);
        this.J++;
        this.f17868l.f18018n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long a0() {
        F1();
        return i1(this.f17876p0);
    }

    @Override
    public final void b0(int i7, List list) {
        boolean z9;
        boolean z10;
        F1();
        ArrayList g12 = g1(list);
        F1();
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int min = Math.min(i7, this.f17875p.size());
        if (this.f17876p0.f17911a.p()) {
            if (this.f17878q0 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
            return;
        }
        D1(e1(this.f17876p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void c0() {
        F1();
        if (this.f17851b0 == 0.0f) {
            float f10 = this.f17853c0;
            if (f10 != 0.0f) {
                T(f10);
            }
        }
    }

    @Override
    public final long d0() {
        F1();
        if (p()) {
            k1 k1Var = this.f17876p0;
            if (k1Var.f17919k.equals(k1Var.f17912b)) {
                return h2.m0.h0(this.f17876p0.f17925q);
            }
            return getDuration();
        }
        return F0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.f17876p0.f17923o.equals(w0Var)) {
            return;
        }
        k1 g10 = this.f17876p0.g(w0Var);
        this.J++;
        this.f17868l.f18018n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final k1 e1(k1 k1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = k1Var.f17911a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f17875p;
            if (i10 < size) {
                i1 i1Var = new i1((x2.a) arrayList.get(i10), this.f17877q);
                arrayList2.add(i1Var);
                arrayList3.add(i10 + i7, new e0(i1Var.f17891b, i1Var.f17890a));
                i10++;
            } else {
                this.O = this.O.f(i7, arrayList2.size());
                p1 p1Var = new p1(arrayList3, this.O);
                k1 o12 = o1(k1Var, p1Var, l1(l1Var, p1Var, k1(k1Var), i1(k1Var)));
                x2.h1 h1Var = this.O;
                h2.i0 i0Var = this.f17868l.f18018n;
                m0 m0Var = new m0(arrayList2, h1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.f14092a = i0Var.f14096a.obtainMessage(18, i7, 0, m0Var);
                c10.b();
                return o12;
            }
        }
    }

    public final e2.o0 f1() {
        boolean z9;
        e2.l1 y02 = y0();
        if (y02.p()) {
            return this.f17874o0;
        }
        e2.l0 l0Var = y02.m(o0(), (e2.k1) this.f3500a, 0L).f10326c;
        e2.n0 a10 = this.f17874o0.a();
        e2.o0 o0Var = l0Var.d;
        if (o0Var != null) {
            h9.i0 i0Var = o0Var.K;
            byte[] bArr = o0Var.f10435k;
            CharSequence charSequence = o0Var.f10427a;
            if (charSequence != null) {
                a10.f10377a = charSequence;
            }
            CharSequence charSequence2 = o0Var.f10428b;
            if (charSequence2 != null) {
                a10.f10378b = charSequence2;
            }
            CharSequence charSequence3 = o0Var.f10429c;
            if (charSequence3 != null) {
                a10.f10379c = charSequence3;
            }
            CharSequence charSequence4 = o0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = o0Var.f10430e;
            if (charSequence5 != null) {
                a10.f10380e = charSequence5;
            }
            CharSequence charSequence6 = o0Var.f10431f;
            if (charSequence6 != null) {
                a10.f10381f = charSequence6;
            }
            CharSequence charSequence7 = o0Var.f10432g;
            if (charSequence7 != null) {
                a10.f10382g = charSequence7;
            }
            Long l10 = o0Var.h;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.f(z9);
                a10.h = l10;
            }
            e2.d1 d1Var = o0Var.f10433i;
            if (d1Var != null) {
                a10.f10383i = d1Var;
            }
            e2.d1 d1Var2 = o0Var.f10434j;
            if (d1Var2 != null) {
                a10.f10384j = d1Var2;
            }
            Uri uri = o0Var.f10438n;
            if (uri != null || bArr != null) {
                a10.f10388n = uri;
                a10.b(bArr, o0Var.f10437m);
                a10.f10386l = o0Var.f10436l;
            }
            Integer num = o0Var.f10439o;
            if (num != null) {
                a10.f10389o = num;
            }
            Integer num2 = o0Var.f10440p;
            if (num2 != null) {
                a10.f10390p = num2;
            }
            Integer num3 = o0Var.f10441q;
            if (num3 != null) {
                a10.f10391q = num3;
            }
            Boolean bool = o0Var.f10442r;
            if (bool != null) {
                a10.f10392r = bool;
            }
            Boolean bool2 = o0Var.f10443s;
            if (bool2 != null) {
                a10.f10393s = bool2;
            }
            Integer num4 = o0Var.f10444t;
            if (num4 != null) {
                a10.f10394t = num4;
            }
            Integer num5 = o0Var.f10445u;
            if (num5 != null) {
                a10.f10394t = num5;
            }
            Integer num6 = o0Var.v;
            if (num6 != null) {
                a10.f10395u = num6;
            }
            Integer num7 = o0Var.f10446w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = o0Var.f10447x;
            if (num8 != null) {
                a10.f10396w = num8;
            }
            Integer num9 = o0Var.f10448y;
            if (num9 != null) {
                a10.f10397x = num9;
            }
            Integer num10 = o0Var.f10449z;
            if (num10 != null) {
                a10.f10398y = num10;
            }
            CharSequence charSequence8 = o0Var.A;
            if (charSequence8 != null) {
                a10.f10399z = charSequence8;
            }
            CharSequence charSequence9 = o0Var.B;
            if (charSequence9 != null) {
                a10.A = charSequence9;
            }
            CharSequence charSequence10 = o0Var.C;
            if (charSequence10 != null) {
                a10.B = charSequence10;
            }
            Integer num11 = o0Var.D;
            if (num11 != null) {
                a10.C = num11;
            }
            Integer num12 = o0Var.E;
            if (num12 != null) {
                a10.D = num12;
            }
            CharSequence charSequence11 = o0Var.F;
            if (charSequence11 != null) {
                a10.E = charSequence11;
            }
            CharSequence charSequence12 = o0Var.G;
            if (charSequence12 != null) {
                a10.F = charSequence12;
            }
            CharSequence charSequence13 = o0Var.H;
            if (charSequence13 != null) {
                a10.G = charSequence13;
            }
            Integer num13 = o0Var.I;
            if (num13 != null) {
                a10.H = num13;
            }
            Bundle bundle = o0Var.J;
            if (bundle != null) {
                a10.I = bundle;
            }
            if (!i0Var.isEmpty()) {
                a10.J = h9.i0.q(i0Var);
            }
        }
        return new e2.o0(a10);
    }

    @Override
    public final boolean g() {
        F1();
        return this.f17876p0.f17916g;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f17879r.b((e2.l0) list.get(i7)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (p()) {
            k1 k1Var = this.f17876p0;
            x2.g0 g0Var = k1Var.f17912b;
            e2.l1 l1Var = k1Var.f17911a;
            Object obj = g0Var.f58210a;
            e2.i1 i1Var = this.f17873o;
            l1Var.g(obj, i1Var);
            return h2.m0.h0(i1Var.a(g0Var.f58211b, g0Var.f58212c));
        }
        return A();
    }

    @Override
    public final void h0(e2.a1 a1Var) {
        boolean z9;
        F1();
        a1Var.getClass();
        h2.r rVar = this.f17870m;
        if (rVar.f14145i) {
            if (Thread.currentThread() == rVar.f14139a) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h2.q qVar = (h2.q) it.next();
            if (qVar.f14136a.equals(a1Var)) {
                h2.p pVar = rVar.f14141c;
                qVar.d = true;
                if (pVar != null && qVar.f14138c) {
                    qVar.f14138c = false;
                    pVar.h(qVar.f14136a, qVar.f14137b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final n1 h1(m1 m1Var) {
        int k12 = k1(this.f17876p0);
        e2.l1 l1Var = this.f17876p0.f17911a;
        if (k12 == -1) {
            k12 = 0;
        }
        r0 r0Var = this.f17868l;
        return new n1(r0Var, m1Var, l1Var, k12, r0Var.f18025s);
    }

    @Override
    public final int i() {
        F1();
        return this.f17876p0.f17914e;
    }

    @Override
    public final void i0(int i7) {
        F1();
    }

    public final long i1(k1 k1Var) {
        x2.g0 g0Var = k1Var.f17912b;
        long j3 = k1Var.f17913c;
        e2.l1 l1Var = k1Var.f17911a;
        if (g0Var.b()) {
            Object obj = k1Var.f17912b.f58210a;
            e2.i1 i1Var = this.f17873o;
            l1Var.g(obj, i1Var);
            if (j3 == -9223372036854775807L) {
                return h2.m0.h0(l1Var.m(k1(k1Var), (e2.k1) this.f3500a, 0L).f10333l);
            }
            return h2.m0.h0(j3) + h2.m0.h0(i1Var.f10283e);
        }
        return h2.m0.h0(j1(k1Var));
    }

    @Override
    public final e2.w0 j() {
        F1();
        return this.f17876p0.f17923o;
    }

    @Override
    public final e2.s1 j0() {
        F1();
        return this.f17876p0.f17917i.d;
    }

    public final long j1(k1 k1Var) {
        long j3;
        if (k1Var.f17911a.p()) {
            return h2.m0.S(this.f17880r0);
        }
        if (k1Var.f17924p) {
            j3 = k1Var.l();
        } else {
            j3 = k1Var.f17927s;
        }
        if (k1Var.f17912b.b()) {
            return j3;
        }
        e2.l1 l1Var = k1Var.f17911a;
        Object obj = k1Var.f17912b.f58210a;
        e2.i1 i1Var = this.f17873o;
        l1Var.g(obj, i1Var);
        return j3 + i1Var.f10283e;
    }

    @Override
    public final void k(int i7) {
        F1();
        if (this.H != i7) {
            this.H = i7;
            h2.i0 i0Var = this.f17868l.f18018n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f14092a = i0Var.f14096a.obtainMessage(11, i7, 0);
            c10.b();
            u uVar = new u(i7, 0);
            h2.r rVar = this.f17870m;
            rVar.c(8, uVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final e2.o0 k0() {
        F1();
        return this.R;
    }

    public final int k1(k1 k1Var) {
        if (k1Var.f17911a.p()) {
            return this.f17878q0;
        }
        return k1Var.f17911a.g(k1Var.f17912b.f58210a, this.f17873o).f10282c;
    }

    @Override
    public final long l() {
        F1();
        return h2.m0.h0(j1(this.f17876p0));
    }

    @Override
    public final g2.d l0() {
        F1();
        return this.f17856e0;
    }

    public final Pair l1(e2.l1 l1Var, p1 p1Var, int i7, long j3) {
        boolean z9;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        if (!l1Var.p() && !p1Var.p()) {
            Pair i11 = l1Var.i((e2.k1) this.f3500a, this.f17873o, i7, h2.m0.S(j3));
            Object obj = i11.first;
            if (p1Var.b(obj) != -1) {
                return i11;
            }
            int U = r0.U((e2.k1) this.f3500a, this.f17873o, this.H, this.I, obj, l1Var, p1Var);
            if (U != -1) {
                e2.k1 k1Var = (e2.k1) this.f3500a;
                p1Var.m(U, k1Var, 0L);
                return p1(p1Var, U, h2.m0.h0(k1Var.f10333l));
            }
            return p1(p1Var, -1, -9223372036854775807L);
        }
        if (!l1Var.p() && p1Var.p()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i10 = i7;
        }
        if (!z9) {
            j10 = j3;
        }
        return p1(p1Var, i10, j10);
    }

    @Override
    public final int m() {
        F1();
        return this.H;
    }

    @Override
    public final int n() {
        F1();
        return 0;
    }

    @Override
    public final int n0() {
        F1();
        if (p()) {
            return this.f17876p0.f17912b.f58211b;
        }
        return -1;
    }

    @Override
    public final int o0() {
        F1();
        int k12 = k1(this.f17876p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final k1 o1(k1 k1Var, e2.l1 l1Var, Pair pair) {
        boolean z9;
        x2.g0 g0Var;
        x2.q1 q1Var;
        a3.y yVar;
        List list;
        int i7;
        long j3;
        if (!l1Var.p() && pair == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        e2.l1 l1Var2 = k1Var.f17911a;
        long i12 = i1(k1Var);
        k1 j10 = k1Var.j(l1Var);
        if (l1Var.p()) {
            x2.g0 g0Var2 = k1.f17910u;
            long S = h2.m0.S(this.f17880r0);
            k1 c10 = j10.d(g0Var2, S, S, S, 0L, x2.q1.d, this.f17850b, h9.t1.f14397e).c(g0Var2);
            c10.f17925q = c10.f17927s;
            return c10;
        }
        Object obj = j10.f17912b.f58210a;
        String str = h2.m0.f14112a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new x2.g0(pair.first);
        } else {
            g0Var = j10.f17912b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.m0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.f17873o).f10283e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.f17873o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.g0 g0Var3 = g0Var;
            ia.p(!g0Var3.b());
            if (!equals) {
                q1Var = x2.q1.d;
            } else {
                q1Var = j10.h;
            }
            x2.q1 q1Var2 = q1Var;
            if (!equals) {
                yVar = this.f17850b;
            } else {
                yVar = j10.f17917i;
            }
            a3.y yVar2 = yVar;
            if (!equals) {
                h9.g0 g0Var4 = h9.i0.f14329b;
                list = h9.t1.f14397e;
            } else {
                list = j10.f17918j;
            }
            k1 c11 = j10.d(g0Var3, longValue, longValue, longValue, 0L, q1Var2, yVar2, list).c(g0Var3);
            c11.f17925q = longValue;
            return c11;
        } else if (i7 == 0) {
            int b10 = l1Var.b(j10.f17919k.f58210a);
            if (b10 != -1 && l1Var.f(b10, this.f17873o, false).f10282c == l1Var.g(g0Var.f58210a, this.f17873o).f10282c) {
                return j10;
            }
            l1Var.g(g0Var.f58210a, this.f17873o);
            if (g0Var.b()) {
                j3 = this.f17873o.a(g0Var.f58211b, g0Var.f58212c);
            } else {
                j3 = this.f17873o.d;
            }
            x2.g0 g0Var5 = g0Var;
            k1 c12 = j10.d(g0Var5, j10.f17927s, j10.f17927s, j10.d, j3 - j10.f17927s, j10.h, j10.f17917i, j10.f17918j).c(g0Var5);
            c12.f17925q = j3;
            return c12;
        } else {
            x2.g0 g0Var6 = g0Var;
            ia.p(!g0Var6.b());
            long max = Math.max(0L, j10.f17926r - (longValue - S2));
            long j11 = j10.f17925q;
            if (j10.f17919k.equals(j10.f17912b)) {
                j11 = longValue + max;
            }
            k1 d = j10.d(g0Var6, longValue, longValue, longValue, max, j10.h, j10.f17917i, j10.f17918j);
            d.f17925q = j11;
            return d;
        }
    }

    @Override
    public final boolean p() {
        F1();
        return this.f17876p0.f17912b.b();
    }

    public final Pair p1(e2.l1 l1Var, int i7, long j3) {
        if (l1Var.p()) {
            this.f17878q0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f17880r0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= l1Var.o()) {
            i7 = l1Var.a(this.I);
            j3 = h2.m0.h0(l1Var.m(i7, (e2.k1) this.f3500a, 0L).f10333l);
        }
        return l1Var.i((e2.k1) this.f3500a, this.f17873o, i7, h2.m0.S(j3));
    }

    @Override
    public final void q0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.f17862i;
        xVar.getClass();
        e2.q1 E0 = E0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (!E0.equals(q1Var)) {
            this.f17870m.e(19, new q4(q1Var, 29));
        }
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.f14166a && i10 == yVar.f14167b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        f51 f51Var = this.f17882s0;
        if (f51Var != null) {
            f51Var.execute(new jg.r(this, i7, i10, 1));
            return;
        }
        this.f17870m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override
    public final long r() {
        F1();
        return h2.m0.h0(this.f17876p0.f17926r);
    }

    @Override
    public final void r0(boolean z9) {
        F1();
    }

    public final k1 r1(k1 k1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(k1Var);
        long i12 = i1(k1Var);
        e2.l1 l1Var = k1Var.f17911a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.f17875p;
            if (i11 < i7) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i7, i10);
        p1 p1Var = new p1(arrayList, this.O);
        k1 o12 = o1(k1Var, p1Var, l1(l1Var, p1Var, k12, i12));
        int i13 = o12.f17914e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (r0.U((e2.k1) this.f3500a, this.f17873o, this.H, this.I, k1Var.f17912b.f58210a, l1Var, p1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.h1 h1Var = this.O;
        h2.i0 i0Var = this.f17868l.f18018n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f14092a = i0Var.f14096a.obtainMessage(20, i7, i10, h1Var);
        c10.b();
        return o12;
    }

    @Override
    public final void s0(List list, int i7, int i10) {
        boolean z9;
        x2.p1 p1Var;
        F1();
        boolean z10 = true;
        if (i7 >= 0 && i10 >= i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ArrayList arrayList = this.f17875p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((e0) arrayList.get(i11)).f17793b.f58340k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.f17868l.f18018n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f14092a = i0Var.f14096a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                e0 e0Var = (e0) arrayList.get(i12);
                e2.l1 l1Var = e0Var.f17794c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                if (l1Var instanceof x2.p1) {
                    p1Var = new x2.p1(((x2.p1) l1Var).f58336e, l0Var);
                } else {
                    p1Var = new x2.p1(l1Var, l0Var);
                }
                e0Var.f17794c = p1Var;
            }
            D1(this.f17876p0.j(new p1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f17876p0.f17911a.p()) {
            if (this.f17878q0 != -1) {
                z10 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
            return;
        }
        k1 r12 = r1(e1(this.f17876p0, min, g12), i7, min);
        D1(r12, 0, !r12.f17912b.f58210a.equals(this.f17876p0.f17912b.f58210a), 4, j1(r12), -1, false);
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.f17886w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                h2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
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
        this.f17856e0 = new g2.d(this.f17876p0.f17927s, h9.t1.f14397e);
    }

    @Override
    public final e2.y0 t() {
        F1();
        return this.P;
    }

    public final void t1(int i7, int i10, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f17859g) {
            if (i7 == -1 || bVar.f17757b == i7) {
                n1 h12 = h1(bVar);
                ia.p(!h12.f17969f);
                h12.f17967c = i10;
                ia.p(!h12.f17969f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.f17757b == i7)) {
                n1 h13 = h1(bVar2);
                ia.p(!h13.f17969f);
                h13.f17967c = i10;
                ia.p(!h13.f17969f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final boolean u() {
        F1();
        return this.f17876p0.f17920l;
    }

    @Override
    public final void u0(int i7, int i10, int i11) {
        boolean z9;
        F1();
        if (i7 >= 0 && i7 <= i10 && i11 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ArrayList arrayList = this.f17875p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 < size && i7 != min && i7 != min2) {
            e2.l1 y02 = y0();
            this.J++;
            h2.m0.R(i7, min, min2, arrayList);
            this.O = this.O.g();
            p1 p1Var = new p1(arrayList, this.O);
            k1 k1Var = this.f17876p0;
            k1 o12 = o1(k1Var, p1Var, l1(y02, p1Var, k1(k1Var), i1(this.f17876p0)));
            x2.h1 h1Var = this.O;
            r0 r0Var = this.f17868l;
            r0Var.getClass();
            r0Var.f18018n.b(19, new n0(i7, min, min2, h1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void u1(x2.a aVar, boolean z9) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z9);
    }

    public final void v1(int i7, long j3, List list, boolean z9) {
        int i10;
        long j10;
        boolean z10;
        int k12 = k1(this.f17876p0);
        long l10 = l();
        this.J++;
        ArrayList arrayList = this.f17875p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i1 i1Var = new i1((x2.a) list.get(i11), this.f17877q);
            arrayList2.add(i1Var);
            arrayList.add(i11, new e0(i1Var.f17891b, i1Var.f17890a));
        }
        this.O = this.O.c(arrayList2.size());
        p1 p1Var = new p1(arrayList, this.O);
        boolean p10 = p1Var.p();
        int i12 = p1Var.h;
        if (!p10 && i7 >= i12) {
            throw new IllegalStateException();
        }
        if (z9) {
            j10 = -9223372036854775807L;
            i10 = p1Var.a(this.I);
        } else if (i7 == -1) {
            i10 = k12;
            j10 = l10;
        } else {
            i10 = i7;
            j10 = j3;
        }
        k1 o12 = o1(this.f17876p0, p1Var, p1(p1Var, i10, j10));
        int i13 = o12.f17914e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!p1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        k1 n1 = n1(o12, i13);
        this.f17868l.f18018n.b(17, new m0(arrayList2, this.O, i10, h2.m0.S(j10))).b();
        if (!this.f17876p0.f17912b.f58210a.equals(n1.f17912b.f58210a) && !this.f17876p0.f17911a.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        D1(n1, 0, z10, 4, j1(n1), -1, false);
    }

    @Override
    public final int w0() {
        F1();
        return this.f17876p0.f17922n;
    }

    public final void w1(t1 t1Var) {
        F1();
        if (t1Var == null) {
            t1Var = t1.f18050f;
        }
        if (!this.N.equals(t1Var)) {
            this.N = t1Var;
            this.f17868l.f18018n.b(5, t1Var).b();
        }
    }

    @Override
    public final void x(boolean z9) {
        F1();
        if (this.I != z9) {
            this.I = z9;
            h2.i0 i0Var = this.f17868l.f18018n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f14092a = i0Var.f14096a.obtainMessage(12, z9 ? 1 : 0, 0);
            c10.b();
            x xVar = new x(0, z9);
            h2.r rVar = this.f17870m;
            rVar.c(9, xVar);
            B1();
            rVar.b();
        }
    }

    public final void x1(Surface surface) {
        boolean z9;
        long j3;
        Object obj = this.T;
        boolean z10 = true;
        if (obj != null && obj != surface) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j3 = this.B;
        } else {
            j3 = -9223372036854775807L;
        }
        r0 r0Var = this.f17868l;
        if (!r0Var.Z && r0Var.f18025s.getThread().isAlive()) {
            h2.i iVar = new h2.i(r0Var.F);
            r0Var.f18018n.b(30, new Pair(surface, iVar)).b();
            if (j3 != -9223372036854775807L) {
                z10 = iVar.c(j3);
            }
        }
        if (z9) {
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
        if (!z10) {
            A1(new l(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final e2.l1 y0() {
        F1();
        return this.f17876p0.f17911a;
    }

    public final void y1(Surface surface) {
        int i7;
        F1();
        s1();
        x1(surface);
        if (surface == null) {
            i7 = 0;
        } else {
            i7 = -1;
        }
        q1(i7, i7);
    }

    @Override
    public final long z() {
        F1();
        return this.f17872n0;
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
            h2.a.l("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f17886w);
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
