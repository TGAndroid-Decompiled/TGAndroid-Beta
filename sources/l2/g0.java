package l2;

import a8.ma;
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
import e2.s1;
import e2.x1;
import hi.z9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.a61;
public final class g0 extends com.google.android.gms.common.api.q implements q {
    public final ei.a A;
    public final long B;
    public final h2.c C;
    public final h2.e0 D;
    public final f0 E;
    public final j6.k F;
    public final j6.k G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final p1 M;
    public q1 N;
    public x2.i1 O;
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
    public e2.e f19413a0;
    public final a3.y f19414b;
    public float f19415b0;
    public final e2.y0 f19416c;
    public float f19417c0;
    public final h2.i d;
    public boolean f19418d0;
    public final Context f19419e;
    public g2.c f19420e0;
    public final g0 f19421f;
    public final boolean f19422f0;
    public final b[] f19423g;
    public boolean f19424g0;
    public final b[] h;
    public final int f19425h0;
    public final a3.x f19426i;
    public boolean f19427i0;
    public final h2.i0 f19428j;
    public final e2.o f19429j0;
    public final v f19430k;
    public x1 f19431k0;
    public final p0 f19432l;
    public final long f19433l0;
    public final h2.r f19434m;
    public final long m0;
    public final CopyOnWriteArraySet f19435n;
    public final long f19436n0;
    public final e2.i1 f19437o;
    public e2.o0 f19438o0;
    public final ArrayList f19439p;
    public h1 f19440p0;
    public final boolean f19441q;
    public int f19442q0;
    public final x2.f0 f19443r;
    public long f19444r0;
    public final m2.d f19445s;
    public a61 f19446s0;
    public final Looper f19447t;
    public final ArrayList f19448t0;
    public final b3.d f19449u;
    public final h2.g0 v;
    public final a0 f19450w;
    public final b0 f19451x;
    public final ab.q f19452y;
    public final h2.o0 f19453z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    public g0(l2.o r35) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g0.<init>(l2.o):void");
    }

    public static long m1(h1 h1Var) {
        e2.k1 k1Var = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        h1Var.f19470a.g(h1Var.f19471b.f60216a, i1Var);
        long j3 = h1Var.f19472c;
        if (j3 == -9223372036854775807L) {
            return h1Var.f19470a.m(i1Var.f10426c, k1Var, 0L).f10477l;
        }
        return i1Var.f10427e + j3;
    }

    public static h1 n1(h1 h1Var, int i7) {
        h1 h = h1Var.h(i7);
        if (i7 != 1 && i7 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final long A() {
        F1();
        return this.f19436n0;
    }

    @Override
    public final boolean A0() {
        F1();
        return false;
    }

    public final void A1(m mVar) {
        h1 h1Var = this.f19440p0;
        h1 c10 = h1Var.c(h1Var.f19471b);
        c10.f19484q = c10.f19486s;
        c10.f19485r = 0L;
        h1 n1 = n1(c10, 1);
        if (mVar != null) {
            n1 = n1.f(mVar);
        }
        this.J++;
        this.f19432l.f19603n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final Looper B0() {
        return this.f19447t;
    }

    public final void B1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        e2.y0 y0Var = this.P;
        String str = h2.l0.f13778a;
        g0 g0Var = this.f19421f;
        boolean q10 = g0Var.q();
        boolean f02 = g0Var.f0();
        boolean T0 = g0Var.T0();
        boolean S0 = g0Var.S0();
        boolean Q0 = g0Var.Q0();
        boolean w02 = g0Var.w0();
        boolean p10 = g0Var.z0().p();
        ?? obj = new Object();
        obj.f10789a = new ca.i();
        ca.i iVar = (ca.i) obj.f10789a;
        iVar.c(this.f19416c.f10800a);
        boolean z16 = !q10;
        obj.a(4, z16);
        boolean z17 = false;
        if (f02 && !q10) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(5, z10);
        if (T0 && !q10) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(6, z11);
        if (!p10 && ((T0 || !Q0 || f02) && !q10)) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(7, z12);
        if (S0 && !q10) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(8, z13);
        if (!p10 && ((S0 || (Q0 && w02)) && !q10)) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(9, z14);
        obj.a(10, z16);
        if (f02 && !q10) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (f02 && !q10) {
            z17 = true;
        }
        obj.a(12, z17);
        e2.y0 y0Var2 = new e2.y0(iVar.d());
        this.P = y0Var2;
        if (!y0Var2.equals(y0Var)) {
            this.f19434m.c(13, new v(this, 2));
        }
    }

    @Override
    public final int C() {
        F1();
        if (this.f19440p0.f19470a.p()) {
            int i7 = this.f19442q0;
            if (i7 == -1) {
                return 0;
            }
            return i7;
        }
        h1 h1Var = this.f19440p0;
        return h1Var.f19470a.b(h1Var.f19471b.f60216a);
    }

    @Override
    public final void C0() {
        F1();
        if (this.f19415b0 != 0.0f) {
            U(0.0f);
        }
    }

    public final void C1(int i7, boolean z10) {
        int i10;
        h1 h1Var = this.f19440p0;
        int i11 = h1Var.f19481n;
        if (i11 == 1 && !z10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (h1Var.f19479l == z10 && i11 == i10 && h1Var.f19480m == i7) {
            return;
        }
        this.J++;
        if (h1Var.f19483p) {
            h1Var = h1Var.a();
        }
        h1 e10 = h1Var.e(i7, i10, z10);
        h2.i0 i0Var = this.f19432l.f19603n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13759a = i0Var.f13763a.obtainMessage(1, z10 ? 1 : 0, i7 | (i10 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final x1 D() {
        F1();
        return this.f19431k0;
    }

    @Override
    public final void D0() {
        F1();
    }

    public final void D1(final h1 h1Var, int i7, boolean z10, int i10, long j3, int i11, boolean z11) {
        Pair pair;
        int i12;
        e2.l0 l0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
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
        h1 h1Var2 = this.f19440p0;
        this.f19440p0 = h1Var;
        boolean equals = h1Var2.f19470a.equals(h1Var.f19470a);
        e2.k1 k1Var = (e2.k1) this.f6389a;
        e2.i1 i1Var = this.f19437o;
        e2.l1 l1Var = h1Var2.f19470a;
        x2.g0 g0Var = h1Var2.f19471b;
        e2.l1 l1Var2 = h1Var.f19470a;
        x2.g0 g0Var2 = h1Var.f19471b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!l1Var.m(l1Var.g(g0Var.f60216a, i1Var).f10426c, k1Var, 0L).f10468a.equals(l1Var2.m(l1Var2.g(g0Var2.f60216a, i1Var).f10426c, k1Var, 0L).f10468a)) {
            if (z10 && i10 == 0) {
                i12 = 1;
            } else if (z10 && i10 == 1) {
                i12 = 2;
            } else if (!equals) {
                i12 = 3;
            } else {
                throw new IllegalStateException();
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
        } else if (z10 && i10 == 0 && g0Var.d < g0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i10 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!h1Var.f19470a.p()) {
                l0Var = h1Var.f19470a.m(h1Var.f19470a.g(h1Var.f19471b.f60216a, this.f19437o).f10426c, (e2.k1) this.f6389a, 0L).f10470c;
            } else {
                l0Var = null;
            }
            this.f19438o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !h1Var2.f19477j.equals(h1Var.f19477j)) {
            e2.n0 a10 = this.f19438o0.a();
            List list = h1Var.f19477j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                e2.q0 q0Var = (e2.q0) list.get(i15);
                int i16 = 0;
                while (true) {
                    e2.p0[] p0VarArr = q0Var.f10628a;
                    if (i16 < p0VarArr.length) {
                        p0VarArr[i16].b(a10);
                        i16++;
                    }
                }
            }
            this.f19438o0 = new e2.o0(a10);
        }
        e2.o0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (h1Var2.f19479l != h1Var.f19479l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (h1Var2.f19473e != h1Var.f19473e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (h1Var2.f19475g != h1Var.f19475g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f19434m.c(0, new ai.n1(h1Var, i7, 2));
        }
        if (z10) {
            e2.i1 i1Var2 = new e2.i1();
            if (!h1Var2.f19470a.p()) {
                Object obj5 = h1Var2.f19471b.f60216a;
                h1Var2.f19470a.g(obj5, i1Var2);
                int i17 = i1Var2.f10426c;
                int b10 = h1Var2.f19470a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = h1Var2.f19470a.m(i17, (e2.k1) this.f6389a, 0L).f10468a;
                l0Var2 = ((e2.k1) this.f6389a).f10470c;
                obj2 = obj5;
                i13 = i17;
                i14 = b10;
            } else {
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                i13 = i11;
                i14 = i13;
                obj = null;
                l0Var2 = null;
                obj2 = null;
            }
            if (i10 == 0) {
                if (h1Var2.f19471b.b()) {
                    x2.g0 g0Var3 = h1Var2.f19471b;
                    j12 = i1Var2.a(g0Var3.f60217b, g0Var3.f60218c);
                    m12 = m1(h1Var2);
                } else if (h1Var2.f19471b.f60219e != -1) {
                    j12 = m1(this.f19440p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.f10427e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (h1Var2.f19471b.b()) {
                j12 = h1Var2.f19486s;
                m12 = m1(h1Var2);
            } else {
                j10 = i1Var2.f10427e;
                j11 = h1Var2.f19486s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.l0.h0(j12);
            long h03 = h2.l0.h0(m12);
            x2.g0 g0Var4 = h1Var2.f19471b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, g0Var4.f60217b, g0Var4.f60218c);
            e2.k1 k1Var2 = (e2.k1) this.f6389a;
            int p02 = p0();
            int C = C();
            if (!this.f19440p0.f19470a.p()) {
                h1 h1Var3 = this.f19440p0;
                Object obj6 = h1Var3.f19471b.f60216a;
                h1Var3.f19470a.g(obj6, this.f19437o);
                C = this.f19440p0.f19470a.b(obj6);
                Object obj7 = this.f19440p0.f19470a.m(p02, k1Var2, 0L).f10468a;
                l0Var3 = k1Var2.f10470c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            }
            int i18 = C;
            long h04 = h2.l0.h0(j3);
            if (this.f19440p0.f19471b.b()) {
                j13 = h2.l0.h0(m1(this.f19440p0));
            } else {
                j13 = h04;
            }
            x2.g0 g0Var5 = this.f19440p0.f19471b;
            this.f19434m.c(11, new ai.o1(i10, b1Var, new e2.b1(obj3, p02, l0Var3, obj4, i18, h04, j13, g0Var5.f60217b, g0Var5.f60218c), 4));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f19434m.c(1, new ai.n1(l0Var, intValue, 3));
        }
        if (h1Var2.f19474f != h1Var.f19474f) {
            this.f19434m.c(10, new h2.o() {
                @Override
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
            if (h1Var.f19474f != null) {
                this.f19434m.c(10, new h2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (r2) {
                            case 0:
                                h1 h1Var4 = h1Var;
                                a1Var.f(h1Var4.f19475g);
                                a1Var.h(h1Var4.f19475g);
                                return;
                            case 1:
                                h1 h1Var5 = h1Var;
                                a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                                return;
                            case 2:
                                a1Var.m(h1Var.f19473e);
                                return;
                            case 3:
                                h1 h1Var6 = h1Var;
                                a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                                return;
                            case 4:
                                a1Var.d(h1Var.f19481n);
                                return;
                            case 5:
                                a1Var.P(h1Var.m());
                                return;
                            case 6:
                                a1Var.H(h1Var.f19482o);
                                return;
                            case 7:
                                a1Var.q(h1Var.f19474f);
                                return;
                            case 8:
                                a1Var.y(h1Var.f19474f);
                                return;
                            default:
                                a1Var.u(h1Var.f19476i.d);
                                return;
                        }
                    }
                });
            }
        }
        a3.y yVar = h1Var2.f19476i;
        a3.y yVar2 = h1Var.f19476i;
        if (yVar != yVar2) {
            a3.x xVar = this.f19426i;
            Object obj8 = yVar2.f146e;
            xVar.getClass();
            xVar.f142c = (a3.w) obj8;
            this.f19434m.c(2, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f19434m.c(14, new r(this.Q));
        }
        if (z14) {
            this.f19434m.c(3, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f19434m.c(-1, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f19434m.c(4, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || h1Var2.f19480m != h1Var.f19480m) {
            this.f19434m.c(5, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (h1Var2.f19481n != h1Var.f19481n) {
            this.f19434m.c(6, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (h1Var2.m() != h1Var.m()) {
            this.f19434m.c(7, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        if (!h1Var2.f19482o.equals(h1Var.f19482o)) {
            this.f19434m.c(12, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.f19475g);
                            a1Var.h(h1Var4.f19475g);
                            return;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.f19473e, h1Var5.f19479l);
                            return;
                        case 2:
                            a1Var.m(h1Var.f19473e);
                            return;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.f19480m, h1Var6.f19479l);
                            return;
                        case 4:
                            a1Var.d(h1Var.f19481n);
                            return;
                        case 5:
                            a1Var.P(h1Var.m());
                            return;
                        case 6:
                            a1Var.H(h1Var.f19482o);
                            return;
                        case 7:
                            a1Var.q(h1Var.f19474f);
                            return;
                        case 8:
                            a1Var.y(h1Var.f19474f);
                            return;
                        default:
                            a1Var.u(h1Var.f19476i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f19434m.b();
        if (h1Var2.f19483p != h1Var.f19483p) {
            Iterator it = this.f19435n.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).f19342a.E1();
            }
        }
    }

    @Override
    public final void E(e2.e eVar, boolean z10) {
        F1();
        if (this.f19427i0) {
            return;
        }
        boolean equals = Objects.equals(this.f19413a0, eVar);
        h2.r rVar = this.f19434m;
        if (!equals) {
            this.f19413a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new kg.f1(eVar, 7));
        }
        e2.e eVar2 = this.f19413a0;
        h2.i0 i0Var = this.f19432l.f19603n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13759a = i0Var.f13763a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final boolean E0() {
        F1();
        return this.I;
    }

    public final void E1() {
        int i7 = i();
        ei.a aVar = this.A;
        h2.o0 o0Var = this.f19453z;
        boolean z10 = false;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f19440p0.f19483p;
                if (v() && !z11) {
                    z10 = true;
                }
                o0Var.b(z10);
                aVar.a(v());
                return;
            }
        }
        o0Var.b(false);
        aVar.a(false);
    }

    @Override
    public final e2.q1 F0() {
        F1();
        return ((a3.s) this.f19426i).j();
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f19447t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.l0.f13778a;
            Locale locale = Locale.US;
            String l10 = p5.c.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f19422f0) {
                if (this.f19424g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                h2.a.m("ExoPlayerImpl", l10, illegalStateException);
                this.f19424g0 = true;
                return;
            }
            throw new IllegalStateException(l10);
        }
    }

    @Override
    public final float G() {
        F1();
        return this.f19415b0;
    }

    @Override
    public final long G0() {
        F1();
        if (this.f19440p0.f19470a.p()) {
            return this.f19444r0;
        }
        h1 h1Var = this.f19440p0;
        long j3 = 0;
        if (h1Var.f19478k.d != h1Var.f19471b.d) {
            return h2.l0.h0(h1Var.f19470a.m(p0(), (e2.k1) this.f6389a, 0L).f10478m);
        }
        long j10 = h1Var.f19484q;
        if (this.f19440p0.f19478k.b()) {
            h1 h1Var2 = this.f19440p0;
            h1Var2.f19470a.g(h1Var2.f19478k.f60216a, this.f19437o).d(this.f19440p0.f19478k.f60217b);
        } else {
            j3 = j10;
        }
        h1 h1Var3 = this.f19440p0;
        e2.l1 l1Var = h1Var3.f19470a;
        Object obj = h1Var3.f19478k.f60216a;
        e2.i1 i1Var = this.f19437o;
        l1Var.g(obj, i1Var);
        return h2.l0.h0(j3 + i1Var.f10427e);
    }

    @Override
    public final void H0(int i7) {
        F1();
    }

    @Override
    public final e2.e I() {
        F1();
        return this.f19413a0;
    }

    @Override
    public final void J0(e2.a1 a1Var) {
        a1Var.getClass();
        this.f19434m.a(a1Var);
    }

    @Override
    public final void K(int i7, boolean z10) {
        F1();
    }

    @Override
    public final e2.o L() {
        F1();
        return this.f19429j0;
    }

    @Override
    public final void L0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.f19434m.e(15, new v(this, 3));
    }

    @Override
    public final void M() {
        F1();
    }

    @Override
    public final void N(int i7, int i10) {
        F1();
    }

    @Override
    public final e2.o0 N0() {
        F1();
        return this.Q;
    }

    @Override
    public final void O(int i7) {
        F1();
    }

    @Override
    public final void O0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override
    public final int P() {
        F1();
        if (q()) {
            return this.f19440p0.f19471b.f60218c;
        }
        return -1;
    }

    @Override
    public final long P0() {
        F1();
        return this.f19433l0;
    }

    @Override
    public final void S(int i7, int i10) {
        boolean z10;
        F1();
        if (i7 >= 0 && i10 >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        int size = this.f19439p.size();
        int min = Math.min(i10, size);
        if (i7 < size && i7 != min) {
            h1 r12 = r1(this.f19440p0, i7, min);
            D1(r12, 0, !r12.f19471b.f60216a.equals(this.f19440p0.f19471b.f60216a), 4, j1(r12), -1, false);
        }
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
        surfaceHolder.addCallback(this.f19450w);
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
    public final void U(float f10) {
        F1();
        float h = h2.l0.h(f10, 0.0f, 1.0f);
        float f11 = this.f19415b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.f19417c0 = f11;
        this.f19415b0 = h;
        this.f19432l.f19603n.b(32, Float.valueOf(h)).b();
        this.f19434m.e(22, new t(h, 0));
    }

    @Override
    public final void W(List list, int i7, long j3) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i7, j3, g12, false);
    }

    @Override
    public final e2.v0 X() {
        F1();
        return this.f19440p0.f19474f;
    }

    @Override
    public final void X0() {
        boolean z10;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13778a + "] [" + e2.m0.b() + "]");
        F1();
        this.f19452y.A();
        this.f19453z.b(false);
        this.A.a(false);
        f0 f0Var = this.E;
        if (f0Var != null && Build.VERSION.SDK_INT >= 34) {
            f0.a(f0Var);
        }
        h2.e0 e0Var = this.D;
        ((h2.i0) e0Var.f13743f).f13763a.removeCallbacksAndMessages(null);
        ((g0) e0Var.f13739a).i0((h2.z) e0Var.f13740b);
        p0 p0Var = this.f19432l;
        if (!p0Var.f19587a0 && p0Var.f19610s.getThread().isAlive()) {
            p0Var.f19587a0 = true;
            h2.i iVar = new h2.i(p0Var.G);
            p0Var.f19603n.b(7, iVar).b();
            z10 = iVar.c(p0Var.L);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f19434m.e(10, new z9(24));
        }
        this.f19434m.d();
        this.f19428j.f13763a.removeCallbacksAndMessages(null);
        b3.d dVar = this.f19449u;
        m2.d dVar2 = this.f19445s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).f2856c.f5146b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.f2840b == dVar2) {
                cVar.f2841c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        h1 h1Var = this.f19440p0;
        if (h1Var.f19483p) {
            this.f19440p0 = h1Var.a();
        }
        h1 n1 = n1(this.f19440p0, 1);
        this.f19440p0 = n1;
        h1 c10 = n1.c(n1.f19471b);
        this.f19440p0 = c10;
        c10.f19484q = c10.f19486s;
        this.f19440p0.f19485r = 0L;
        m2.d dVar3 = this.f19445s;
        h2.i0 i0Var = dVar3.f20583n;
        i0Var.getClass();
        i0Var.d(new kg.i0(dVar3, 19));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f19420e0 = g2.c.d;
        this.f19427i0 = true;
    }

    @Override
    public final void Y(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void Y0(int i7, long j3, boolean z10) {
        boolean z11;
        F1();
        if (i7 != -1) {
            if (i7 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ma.f(z11);
            e2.l1 l1Var = this.f19440p0.f19470a;
            if (!l1Var.p() && i7 >= l1Var.o()) {
                return;
            }
            m2.d dVar = this.f19445s;
            if (!dVar.f20584r) {
                m2.a Q = dVar.Q();
                dVar.f20584r = true;
                dVar.V(Q, -1, new kg.f1(Q, 14));
            }
            this.J++;
            if (q()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                m0 m0Var = new m0(this.f19440p0);
                m0Var.f(1);
                g0 g0Var = this.f19430k.f19648b;
                g0Var.f19428j.d(new ji.f(18, g0Var, m0Var));
                return;
            }
            h1 h1Var = this.f19440p0;
            int i10 = h1Var.f19473e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                h1Var = this.f19440p0.h(2);
            }
            int p02 = p0();
            h1 o12 = o1(h1Var, l1Var, p1(l1Var, i7, j3));
            this.f19432l.f19603n.b(3, new o0(l1Var, i7, h2.l0.S(j3))).b();
            D1(o12, 0, true, 1, j1(o12), p02, z10);
        }
    }

    @Override
    public final void a() {
        int i7;
        F1();
        h1 h1Var = this.f19440p0;
        if (h1Var.f19473e != 1) {
            return;
        }
        h1 f10 = h1Var.f(null);
        if (f10.f19470a.p()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        h1 n1 = n1(f10, i7);
        this.J++;
        this.f19432l.f19603n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long a0() {
        F1();
        return this.m0;
    }

    @Override
    public final long b0() {
        F1();
        return i1(this.f19440p0);
    }

    @Override
    public final void c0(int i7, List list) {
        boolean z10;
        boolean z11;
        F1();
        ArrayList g12 = g1(list);
        F1();
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        int min = Math.min(i7, this.f19439p.size());
        if (this.f19440p0.f19470a.p()) {
            if (this.f19442q0 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        D1(e1(this.f19440p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void d0() {
        F1();
        if (this.f19415b0 == 0.0f) {
            float f10 = this.f19417c0;
            if (f10 != 0.0f) {
                U(f10);
            }
        }
    }

    @Override
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.f19440p0.f19482o.equals(w0Var)) {
            return;
        }
        h1 g10 = this.f19440p0.g(w0Var);
        this.J++;
        this.f19432l.f19603n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long e0() {
        F1();
        if (q()) {
            h1 h1Var = this.f19440p0;
            if (h1Var.f19478k.equals(h1Var.f19471b)) {
                return h2.l0.h0(this.f19440p0.f19484q);
            }
            return getDuration();
        }
        return G0();
    }

    public final h1 e1(h1 h1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = h1Var.f19470a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f19439p;
            if (i10 < size) {
                f1 f1Var = new f1((x2.a) arrayList.get(i10), this.f19441q);
                arrayList2.add(f1Var);
                arrayList3.add(i10 + i7, new c0(f1Var.f19398b, f1Var.f19397a));
                i10++;
            } else {
                this.O = this.O.f(i7, arrayList2.size());
                m1 m1Var = new m1(arrayList3, this.O);
                h1 o12 = o1(h1Var, m1Var, l1(l1Var, m1Var, k1(h1Var), i1(h1Var)));
                x2.i1 i1Var = this.O;
                h2.i0 i0Var = this.f19432l.f19603n;
                k0 k0Var = new k0(arrayList2, i1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.f13759a = i0Var.f13763a.obtainMessage(18, i7, 0, k0Var);
                c10.b();
                return o12;
            }
        }
    }

    public final e2.o0 f1() {
        boolean z10;
        e2.l1 z02 = z0();
        if (z02.p()) {
            return this.f19438o0;
        }
        e2.l0 l0Var = z02.m(p0(), (e2.k1) this.f6389a, 0L).f10470c;
        e2.n0 a10 = this.f19438o0.a();
        e2.o0 o0Var = l0Var.d;
        if (o0Var != null) {
            h9.i0 i0Var = o0Var.K;
            byte[] bArr = o0Var.f10579k;
            CharSequence charSequence = o0Var.f10571a;
            if (charSequence != null) {
                a10.f10521a = charSequence;
            }
            CharSequence charSequence2 = o0Var.f10572b;
            if (charSequence2 != null) {
                a10.f10522b = charSequence2;
            }
            CharSequence charSequence3 = o0Var.f10573c;
            if (charSequence3 != null) {
                a10.f10523c = charSequence3;
            }
            CharSequence charSequence4 = o0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = o0Var.f10574e;
            if (charSequence5 != null) {
                a10.f10524e = charSequence5;
            }
            CharSequence charSequence6 = o0Var.f10575f;
            if (charSequence6 != null) {
                a10.f10525f = charSequence6;
            }
            CharSequence charSequence7 = o0Var.f10576g;
            if (charSequence7 != null) {
                a10.f10526g = charSequence7;
            }
            Long l10 = o0Var.h;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.f(z10);
                a10.h = l10;
            }
            e2.d1 d1Var = o0Var.f10577i;
            if (d1Var != null) {
                a10.f10527i = d1Var;
            }
            e2.d1 d1Var2 = o0Var.f10578j;
            if (d1Var2 != null) {
                a10.f10528j = d1Var2;
            }
            Uri uri = o0Var.f10582n;
            if (uri != null || bArr != null) {
                a10.f10532n = uri;
                a10.b(bArr, o0Var.f10581m);
                a10.f10530l = o0Var.f10580l;
            }
            Integer num = o0Var.f10583o;
            if (num != null) {
                a10.f10533o = num;
            }
            Integer num2 = o0Var.f10584p;
            if (num2 != null) {
                a10.f10534p = num2;
            }
            Integer num3 = o0Var.f10585q;
            if (num3 != null) {
                a10.f10535q = num3;
            }
            Boolean bool = o0Var.f10586r;
            if (bool != null) {
                a10.f10536r = bool;
            }
            Boolean bool2 = o0Var.f10587s;
            if (bool2 != null) {
                a10.f10537s = bool2;
            }
            Integer num4 = o0Var.f10588t;
            if (num4 != null) {
                a10.f10538t = num4;
            }
            Integer num5 = o0Var.f10589u;
            if (num5 != null) {
                a10.f10538t = num5;
            }
            Integer num6 = o0Var.v;
            if (num6 != null) {
                a10.f10539u = num6;
            }
            Integer num7 = o0Var.f10590w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = o0Var.f10591x;
            if (num8 != null) {
                a10.f10540w = num8;
            }
            Integer num9 = o0Var.f10592y;
            if (num9 != null) {
                a10.f10541x = num9;
            }
            Integer num10 = o0Var.f10593z;
            if (num10 != null) {
                a10.f10542y = num10;
            }
            CharSequence charSequence8 = o0Var.A;
            if (charSequence8 != null) {
                a10.f10543z = charSequence8;
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
        return this.f19440p0.f19475g;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f19443r.b((e2.l0) list.get(i7)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (q()) {
            h1 h1Var = this.f19440p0;
            x2.g0 g0Var = h1Var.f19471b;
            e2.l1 l1Var = h1Var.f19470a;
            Object obj = g0Var.f60216a;
            e2.i1 i1Var = this.f19437o;
            l1Var.g(obj, i1Var);
            return h2.l0.h0(i1Var.a(g0Var.f60217b, g0Var.f60218c));
        }
        return B();
    }

    public final k1 h1(j1 j1Var) {
        int k12 = k1(this.f19440p0);
        e2.l1 l1Var = this.f19440p0.f19470a;
        if (k12 == -1) {
            k12 = 0;
        }
        p0 p0Var = this.f19432l;
        return new k1(p0Var, j1Var, l1Var, k12, p0Var.f19610s);
    }

    @Override
    public final int i() {
        F1();
        return this.f19440p0.f19473e;
    }

    @Override
    public final void i0(e2.a1 a1Var) {
        boolean z10;
        F1();
        a1Var.getClass();
        h2.r rVar = this.f19434m;
        if (rVar.f13811i) {
            if (Thread.currentThread() == rVar.f13805a) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h2.q qVar = (h2.q) it.next();
            if (qVar.f13802a.equals(a1Var)) {
                h2.p pVar = rVar.f13807c;
                qVar.d = true;
                if (pVar != null && qVar.f13804c) {
                    qVar.f13804c = false;
                    pVar.f(qVar.f13802a, qVar.f13803b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final long i1(h1 h1Var) {
        x2.g0 g0Var = h1Var.f19471b;
        long j3 = h1Var.f19472c;
        e2.l1 l1Var = h1Var.f19470a;
        if (g0Var.b()) {
            Object obj = h1Var.f19471b.f60216a;
            e2.i1 i1Var = this.f19437o;
            l1Var.g(obj, i1Var);
            if (j3 == -9223372036854775807L) {
                return h2.l0.h0(l1Var.m(k1(h1Var), (e2.k1) this.f6389a, 0L).f10477l);
            }
            return h2.l0.h0(j3) + h2.l0.h0(i1Var.f10427e);
        }
        return h2.l0.h0(j1(h1Var));
    }

    @Override
    public final void j0(int i7) {
        F1();
    }

    public final long j1(h1 h1Var) {
        long j3;
        if (h1Var.f19470a.p()) {
            return h2.l0.S(this.f19444r0);
        }
        if (h1Var.f19483p) {
            j3 = h1Var.l();
        } else {
            j3 = h1Var.f19486s;
        }
        if (h1Var.f19471b.b()) {
            return j3;
        }
        e2.l1 l1Var = h1Var.f19470a;
        Object obj = h1Var.f19471b.f60216a;
        e2.i1 i1Var = this.f19437o;
        l1Var.g(obj, i1Var);
        return j3 + i1Var.f10427e;
    }

    @Override
    public final void k(int i7) {
        F1();
        if (this.H != i7) {
            this.H = i7;
            h2.i0 i0Var = this.f19432l.f19603n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13759a = i0Var.f13763a.obtainMessage(11, i7, 0);
            c10.b();
            u uVar = new u(i7, 0);
            h2.r rVar = this.f19434m;
            rVar.c(8, uVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final s1 k0() {
        F1();
        return this.f19440p0.f19476i.d;
    }

    public final int k1(h1 h1Var) {
        if (h1Var.f19470a.p()) {
            return this.f19442q0;
        }
        return h1Var.f19470a.g(h1Var.f19471b.f60216a, this.f19437o).f10426c;
    }

    @Override
    public final e2.w0 l() {
        F1();
        return this.f19440p0.f19482o;
    }

    @Override
    public final e2.o0 l0() {
        F1();
        return this.R;
    }

    public final Pair l1(e2.l1 l1Var, m1 m1Var, int i7, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        if (!l1Var.p() && !m1Var.p()) {
            Pair i11 = l1Var.i((e2.k1) this.f6389a, this.f19437o, i7, h2.l0.S(j3));
            Object obj = i11.first;
            if (m1Var.b(obj) != -1) {
                return i11;
            }
            int S = p0.S((e2.k1) this.f6389a, this.f19437o, this.H, this.I, obj, l1Var, m1Var);
            if (S != -1) {
                e2.k1 k1Var = (e2.k1) this.f6389a;
                m1Var.m(S, k1Var, 0L);
                return p1(m1Var, S, h2.l0.h0(k1Var.f10477l));
            }
            return p1(m1Var, -1, -9223372036854775807L);
        }
        if (!l1Var.p() && m1Var.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = i7;
        }
        if (!z10) {
            j10 = j3;
        }
        return p1(m1Var, i10, j10);
    }

    @Override
    public final int m() {
        F1();
        return this.H;
    }

    @Override
    public final g2.c m0() {
        F1();
        return this.f19420e0;
    }

    @Override
    public final long n() {
        F1();
        return h2.l0.h0(j1(this.f19440p0));
    }

    @Override
    public final int o() {
        F1();
        return 0;
    }

    @Override
    public final int o0() {
        F1();
        if (q()) {
            return this.f19440p0.f19471b.f60217b;
        }
        return -1;
    }

    public final h1 o1(h1 h1Var, e2.l1 l1Var, Pair pair) {
        boolean z10;
        x2.g0 g0Var;
        x2.r1 r1Var;
        a3.y yVar;
        List list;
        int i7;
        long j3;
        if (!l1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.f(z10);
        e2.l1 l1Var2 = h1Var.f19470a;
        long i12 = i1(h1Var);
        h1 j10 = h1Var.j(l1Var);
        if (l1Var.p()) {
            x2.g0 g0Var2 = h1.f19469u;
            long S = h2.l0.S(this.f19444r0);
            h1 c10 = j10.d(g0Var2, S, S, S, 0L, x2.r1.d, this.f19414b, h9.s1.f14058e).c(g0Var2);
            c10.f19484q = c10.f19486s;
            return c10;
        }
        Object obj = j10.f19471b.f60216a;
        String str = h2.l0.f13778a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new x2.g0(pair.first);
        } else {
            g0Var = j10.f19471b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.l0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.f19437o).f10427e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.f19437o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.g0 g0Var3 = g0Var;
            ma.p(!g0Var3.b());
            if (!equals) {
                r1Var = x2.r1.d;
            } else {
                r1Var = j10.h;
            }
            x2.r1 r1Var2 = r1Var;
            if (!equals) {
                yVar = this.f19414b;
            } else {
                yVar = j10.f19476i;
            }
            a3.y yVar2 = yVar;
            if (!equals) {
                h9.g0 g0Var4 = h9.i0.f13995b;
                list = h9.s1.f14058e;
            } else {
                list = j10.f19477j;
            }
            h1 c11 = j10.d(g0Var3, longValue, longValue, longValue, 0L, r1Var2, yVar2, list).c(g0Var3);
            c11.f19484q = longValue;
            return c11;
        } else if (i7 == 0) {
            int b10 = l1Var.b(j10.f19478k.f60216a);
            if (b10 != -1 && l1Var.f(b10, this.f19437o, false).f10426c == l1Var.g(g0Var.f60216a, this.f19437o).f10426c) {
                return j10;
            }
            l1Var.g(g0Var.f60216a, this.f19437o);
            if (g0Var.b()) {
                j3 = this.f19437o.a(g0Var.f60217b, g0Var.f60218c);
            } else {
                j3 = this.f19437o.d;
            }
            x2.g0 g0Var5 = g0Var;
            h1 c12 = j10.d(g0Var5, j10.f19486s, j10.f19486s, j10.d, j3 - j10.f19486s, j10.h, j10.f19476i, j10.f19477j).c(g0Var5);
            c12.f19484q = j3;
            return c12;
        } else {
            x2.g0 g0Var6 = g0Var;
            ma.p(!g0Var6.b());
            long max = Math.max(0L, j10.f19485r - (longValue - S2));
            long j11 = j10.f19484q;
            if (j10.f19478k.equals(j10.f19471b)) {
                j11 = longValue + max;
            }
            h1 d = j10.d(g0Var6, longValue, longValue, longValue, max, j10.h, j10.f19476i, j10.f19477j);
            d.f19484q = j11;
            return d;
        }
    }

    @Override
    public final int p0() {
        F1();
        int k12 = k1(this.f19440p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final Pair p1(e2.l1 l1Var, int i7, long j3) {
        if (l1Var.p()) {
            this.f19442q0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f19444r0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= l1Var.o()) {
            i7 = l1Var.a(this.I);
            j3 = h2.l0.h0(l1Var.m(i7, (e2.k1) this.f6389a, 0L).f10477l);
        }
        return l1Var.i((e2.k1) this.f6389a, this.f19437o, i7, h2.l0.S(j3));
    }

    @Override
    public final boolean q() {
        F1();
        return this.f19440p0.f19471b.b();
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.f13832a && i10 == yVar.f13833b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        a61 a61Var = this.f19446s0;
        if (a61Var != null) {
            a61Var.execute(new jg.q(this, i7, i10, 1));
            return;
        }
        this.f19434m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override
    public final void r0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.f19426i;
        xVar.getClass();
        e2.q1 F0 = F0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (!F0.equals(q1Var)) {
            this.f19434m.e(19, new kg.f1(q1Var, 8));
        }
    }

    public final h1 r1(h1 h1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(h1Var);
        long i12 = i1(h1Var);
        e2.l1 l1Var = h1Var.f19470a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.f19439p;
            if (i11 < i7) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i7, i10);
        m1 m1Var = new m1(arrayList, this.O);
        h1 o12 = o1(h1Var, m1Var, l1(l1Var, m1Var, k12, i12));
        int i13 = o12.f19473e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (p0.S((e2.k1) this.f6389a, this.f19437o, this.H, this.I, h1Var.f19471b.f60216a, l1Var, m1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.i1 i1Var = this.O;
        h2.i0 i0Var = this.f19432l.f19603n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13759a = i0Var.f13763a.obtainMessage(20, i7, i10, i1Var);
        c10.b();
        return o12;
    }

    @Override
    public final long s() {
        F1();
        return h2.l0.h0(this.f19440p0.f19485r);
    }

    @Override
    public final void s0(boolean z10) {
        F1();
    }

    public final void s1() {
        TextureView textureView = this.X;
        a0 a0Var = this.f19450w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != a0Var) {
                h2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(a0Var);
            this.V = null;
        }
    }

    @Override
    public final void stop() {
        F1();
        A1(null);
        this.f19420e0 = new g2.c(this.f19440p0.f19486s, h9.s1.f14058e);
    }

    @Override
    public final void t0(List list, int i7, int i10) {
        boolean z10;
        x2.q1 q1Var;
        F1();
        boolean z11 = true;
        if (i7 >= 0 && i10 >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        ArrayList arrayList = this.f19439p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((c0) arrayList.get(i11)).f19365b.f60364k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.f19432l.f19603n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13759a = i0Var.f13763a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                c0 c0Var = (c0) arrayList.get(i12);
                e2.l1 l1Var = c0Var.f19366c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                if (l1Var instanceof x2.q1) {
                    q1Var = new x2.q1(((x2.q1) l1Var).f60344e, l0Var);
                } else {
                    q1Var = new x2.q1(l1Var, l0Var);
                }
                c0Var.f19366c = q1Var;
            }
            D1(this.f19440p0.j(new m1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f19440p0.f19470a.p()) {
            if (this.f19442q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        h1 r12 = r1(e1(this.f19440p0, min, g12), i7, min);
        D1(r12, 0, !r12.f19471b.f60216a.equals(this.f19440p0.f19471b.f60216a), 4, j1(r12), -1, false);
    }

    public final void t1(int i7, int i10, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f19423g) {
            if (i7 == -1 || bVar.f19347b == i7) {
                k1 h12 = h1(bVar);
                ma.p(!h12.f19521f);
                h12.f19519c = i10;
                ma.p(!h12.f19521f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.f19347b == i7)) {
                k1 h13 = h1(bVar2);
                ma.p(!h13.f19521f);
                h13.f19519c = i10;
                ma.p(!h13.f19521f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final e2.y0 u() {
        F1();
        return this.P;
    }

    public final void u1(x2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    @Override
    public final boolean v() {
        F1();
        return this.f19440p0.f19479l;
    }

    @Override
    public final void v0(int i7, int i10, int i11) {
        boolean z10;
        F1();
        if (i7 >= 0 && i7 <= i10 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        ArrayList arrayList = this.f19439p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 < size && i7 != min && i7 != min2) {
            e2.l1 z02 = z0();
            this.J++;
            h2.l0.R(i7, min, min2, arrayList);
            this.O = this.O.g();
            m1 m1Var = new m1(arrayList, this.O);
            h1 h1Var = this.f19440p0;
            h1 o12 = o1(h1Var, m1Var, l1(z02, m1Var, k1(h1Var), i1(this.f19440p0)));
            x2.i1 i1Var = this.O;
            p0 p0Var = this.f19432l;
            p0Var.getClass();
            p0Var.f19603n.b(19, new l0(i7, min, min2, i1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void v1(int i7, long j3, List list, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        int k12 = k1(this.f19440p0);
        long n10 = n();
        this.J++;
        ArrayList arrayList = this.f19439p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f1 f1Var = new f1((x2.a) list.get(i11), this.f19441q);
            arrayList2.add(f1Var);
            arrayList.add(i11, new c0(f1Var.f19398b, f1Var.f19397a));
        }
        this.O = this.O.c(arrayList2.size());
        m1 m1Var = new m1(arrayList, this.O);
        boolean p10 = m1Var.p();
        int i12 = m1Var.h;
        if (!p10 && i7 >= i12) {
            throw new IllegalStateException();
        }
        if (z10) {
            j10 = -9223372036854775807L;
            i10 = m1Var.a(this.I);
        } else if (i7 == -1) {
            i10 = k12;
            j10 = n10;
        } else {
            i10 = i7;
            j10 = j3;
        }
        h1 o12 = o1(this.f19440p0, m1Var, p1(m1Var, i10, j10));
        int i13 = o12.f19473e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!m1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        h1 n1 = n1(o12, i13);
        this.f19432l.f19603n.b(17, new k0(arrayList2, this.O, i10, h2.l0.S(j10))).b();
        if (!this.f19440p0.f19471b.f60216a.equals(n1.f19471b.f60216a) && !this.f19440p0.f19470a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        D1(n1, 0, z11, 4, j1(n1), -1, false);
    }

    public final void w1(q1 q1Var) {
        F1();
        if (q1Var == null) {
            q1Var = q1.f19627f;
        }
        if (!this.N.equals(q1Var)) {
            this.N = q1Var;
            this.f19432l.f19603n.b(5, q1Var).b();
        }
    }

    @Override
    public final int x0() {
        F1();
        return this.f19440p0.f19481n;
    }

    public final void x1(Surface surface) {
        boolean z10;
        long j3;
        Object obj = this.T;
        boolean z11 = true;
        if (obj != null && obj != surface) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j3 = this.B;
        } else {
            j3 = -9223372036854775807L;
        }
        p0 p0Var = this.f19432l;
        if (!p0Var.f19587a0 && p0Var.f19610s.getThread().isAlive()) {
            h2.i iVar = new h2.i(p0Var.G);
            p0Var.f19603n.b(30, new Pair(surface, iVar)).b();
            if (j3 != -9223372036854775807L) {
                z11 = iVar.c(j3);
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
    public final void y(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            h2.i0 i0Var = this.f19432l.f19603n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13759a = i0Var.f13763a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            w wVar = new w(0, z10);
            h2.r rVar = this.f19434m;
            rVar.c(9, wVar);
            B1();
            rVar.b();
        }
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
    public final e2.l1 z0() {
        F1();
        return this.f19440p0.f19470a;
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
        textureView.setSurfaceTextureListener(this.f19450w);
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
