package l2;

import a8.ja;
import ai.r1;
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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kg.t1;
import org.telegram.ui.Components.n51;
public final class f0 extends com.google.android.gms.common.api.q implements p {
    public final ei.a A;
    public final long B;
    public final h2.c C;
    public final h2.e0 D;
    public final e0 E;
    public final ji.j F;
    public final ji.j G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final o1 M;
    public p1 N;
    public x2.g1 O;
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
    public e2.e f18948a0;
    public final a3.y f18949b;
    public float f18950b0;
    public final e2.y0 f18951c;
    public float f18952c0;
    public final h2.i d;
    public boolean f18953d0;
    public final Context f18954e;
    public g2.c f18955e0;
    public final f0 f18956f;
    public final boolean f18957f0;
    public final b[] f18958g;
    public boolean f18959g0;
    public final b[] h;
    public final int f18960h0;
    public final a3.x f18961i;
    public boolean f18962i0;
    public final h2.i0 f18963j;
    public final e2.o f18964j0;
    public final u f18965k;
    public x1 f18966k0;
    public final o0 f18967l;
    public final long f18968l0;
    public final h2.r f18969m;
    public final long m0;
    public final CopyOnWriteArraySet f18970n;
    public final long f18971n0;
    public final e2.i1 f18972o;
    public e2.o0 f18973o0;
    public final ArrayList f18974p;
    public g1 f18975p0;
    public final boolean f18976q;
    public int f18977q0;
    public final x2.e0 f18978r;
    public long f18979r0;
    public final m2.e f18980s;
    public n51 f18981s0;
    public final Looper f18982t;
    public final ArrayList f18983t0;
    public final b3.d f18984u;
    public final h2.g0 v;
    public final z f18985w;
    public final a0 f18986x;
    public final ab.q f18987y;
    public final h2.o0 f18988z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    public f0(l2.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: l2.f0.<init>(l2.n):void");
    }

    public static long m1(g1 g1Var) {
        e2.k1 k1Var = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        g1Var.f19005a.g(g1Var.f19006b.f59523a, i1Var);
        long j3 = g1Var.f19007c;
        if (j3 == -9223372036854775807L) {
            return g1Var.f19005a.m(i1Var.f10118c, k1Var, 0L).f10169l;
        }
        return i1Var.f10119e + j3;
    }

    public static g1 n1(g1 g1Var, int i7) {
        g1 h = g1Var.h(i7);
        if (i7 != 1 && i7 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final Looper A0() {
        return this.f18982t;
    }

    public final void A1(l lVar) {
        g1 g1Var = this.f18975p0;
        g1 c10 = g1Var.c(g1Var.f19006b);
        c10.f19019q = c10.f19021s;
        c10.f19020r = 0L;
        g1 n1 = n1(c10, 1);
        if (lVar != null) {
            n1 = n1.f(lVar);
        }
        this.J++;
        this.f18967l.f19138n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int B() {
        F1();
        if (this.f18975p0.f19005a.p()) {
            int i7 = this.f18977q0;
            if (i7 == -1) {
                return 0;
            }
            return i7;
        }
        g1 g1Var = this.f18975p0;
        return g1Var.f19005a.b(g1Var.f19006b.f59523a);
    }

    @Override
    public final void B0() {
        F1();
        if (this.f18950b0 != 0.0f) {
            T(0.0f);
        }
    }

    public final void B1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        e2.y0 y0Var = this.P;
        String str = h2.l0.f13471a;
        f0 f0Var = this.f18956f;
        boolean p10 = f0Var.p();
        boolean e02 = f0Var.e0();
        boolean T0 = f0Var.T0();
        boolean S0 = f0Var.S0();
        boolean P0 = f0Var.P0();
        boolean v02 = f0Var.v0();
        boolean p11 = f0Var.y0().p();
        ?? obj = new Object();
        obj.f10481a = new ca.i();
        ca.i iVar = (ca.i) obj.f10481a;
        iVar.c(this.f18951c.f10492a);
        boolean z16 = !p10;
        obj.a(4, z16);
        boolean z17 = false;
        if (e02 && !p10) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(5, z10);
        if (T0 && !p10) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(6, z11);
        if (!p11 && ((T0 || !P0 || e02) && !p10)) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(7, z12);
        if (S0 && !p10) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(8, z13);
        if (!p11 && ((S0 || (P0 && v02)) && !p10)) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(9, z14);
        obj.a(10, z16);
        if (e02 && !p10) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (e02 && !p10) {
            z17 = true;
        }
        obj.a(12, z17);
        e2.y0 y0Var2 = new e2.y0(iVar.d());
        this.P = y0Var2;
        if (!y0Var2.equals(y0Var)) {
            this.f18969m.c(13, new u(this, 2));
        }
    }

    @Override
    public final x1 C() {
        F1();
        return this.f18966k0;
    }

    @Override
    public final void C0() {
        F1();
    }

    public final void C1(int i7, boolean z10) {
        int i10;
        g1 g1Var = this.f18975p0;
        int i11 = g1Var.f19016n;
        if (i11 == 1 && !z10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (g1Var.f19014l == z10 && i11 == i10 && g1Var.f19015m == i7) {
            return;
        }
        this.J++;
        if (g1Var.f19018p) {
            g1Var = g1Var.a();
        }
        g1 e10 = g1Var.e(i7, i10, z10);
        h2.i0 i0Var = this.f18967l.f19138n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13452a = i0Var.f13456a.obtainMessage(1, z10 ? 1 : 0, i7 | (i10 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void D(e2.e eVar, boolean z10) {
        F1();
        if (this.f18962i0) {
            return;
        }
        boolean equals = Objects.equals(this.f18948a0, eVar);
        h2.r rVar = this.f18969m;
        if (!equals) {
            this.f18948a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new ki.e(eVar, 3));
        }
        e2.e eVar2 = this.f18948a0;
        h2.i0 i0Var = this.f18967l.f19138n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13452a = i0Var.f13456a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final g1 g1Var, int i7, boolean z10, int i10, long j3, int i11, boolean z11) {
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
        g1 g1Var2 = this.f18975p0;
        this.f18975p0 = g1Var;
        boolean equals = g1Var2.f19005a.equals(g1Var.f19005a);
        e2.k1 k1Var = (e2.k1) this.f6112a;
        e2.i1 i1Var = this.f18972o;
        e2.l1 l1Var = g1Var2.f19005a;
        x2.f0 f0Var = g1Var2.f19006b;
        e2.l1 l1Var2 = g1Var.f19005a;
        x2.f0 f0Var2 = g1Var.f19006b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!l1Var.m(l1Var.g(f0Var.f59523a, i1Var).f10118c, k1Var, 0L).f10160a.equals(l1Var2.m(l1Var2.g(f0Var2.f59523a, i1Var).f10118c, k1Var, 0L).f10160a)) {
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
        } else if (z10 && i10 == 0 && f0Var.d < f0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z10 && i10 == 1 && z11) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!g1Var.f19005a.p()) {
                l0Var = g1Var.f19005a.m(g1Var.f19005a.g(g1Var.f19006b.f59523a, this.f18972o).f10118c, (e2.k1) this.f6112a, 0L).f10162c;
            } else {
                l0Var = null;
            }
            this.f18973o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !g1Var2.f19012j.equals(g1Var.f19012j)) {
            e2.n0 a10 = this.f18973o0.a();
            List list = g1Var.f19012j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                e2.q0 q0Var = (e2.q0) list.get(i15);
                int i16 = 0;
                while (true) {
                    e2.p0[] p0VarArr = q0Var.f10320a;
                    if (i16 < p0VarArr.length) {
                        p0VarArr[i16].b(a10);
                        i16++;
                    }
                }
            }
            this.f18973o0 = new e2.o0(a10);
        }
        e2.o0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (g1Var2.f19014l != g1Var.f19014l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g1Var2.f19008e != g1Var.f19008e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (g1Var2.f19010g != g1Var.f19010g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f18969m.c(0, new r1(g1Var, i7, 3));
        }
        if (z10) {
            e2.i1 i1Var2 = new e2.i1();
            if (!g1Var2.f19005a.p()) {
                Object obj5 = g1Var2.f19006b.f59523a;
                g1Var2.f19005a.g(obj5, i1Var2);
                int i17 = i1Var2.f10118c;
                int b10 = g1Var2.f19005a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = g1Var2.f19005a.m(i17, (e2.k1) this.f6112a, 0L).f10160a;
                l0Var2 = ((e2.k1) this.f6112a).f10162c;
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
                if (g1Var2.f19006b.b()) {
                    x2.f0 f0Var3 = g1Var2.f19006b;
                    j12 = i1Var2.a(f0Var3.f59524b, f0Var3.f59525c);
                    m12 = m1(g1Var2);
                } else if (g1Var2.f19006b.f59526e != -1) {
                    j12 = m1(this.f18975p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.f10119e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (g1Var2.f19006b.b()) {
                j12 = g1Var2.f19021s;
                m12 = m1(g1Var2);
            } else {
                j10 = i1Var2.f10119e;
                j11 = g1Var2.f19021s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.l0.h0(j12);
            long h03 = h2.l0.h0(m12);
            x2.f0 f0Var4 = g1Var2.f19006b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, f0Var4.f59524b, f0Var4.f59525c);
            e2.k1 k1Var2 = (e2.k1) this.f6112a;
            int o02 = o0();
            int B = B();
            if (!this.f18975p0.f19005a.p()) {
                g1 g1Var3 = this.f18975p0;
                Object obj6 = g1Var3.f19006b.f59523a;
                g1Var3.f19005a.g(obj6, this.f18972o);
                B = this.f18975p0.f19005a.b(obj6);
                Object obj7 = this.f18975p0.f19005a.m(o02, k1Var2, 0L).f10160a;
                l0Var3 = k1Var2.f10162c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            }
            int i18 = B;
            long h04 = h2.l0.h0(j3);
            if (this.f18975p0.f19006b.b()) {
                j13 = h2.l0.h0(m1(this.f18975p0));
            } else {
                j13 = h04;
            }
            x2.f0 f0Var5 = this.f18975p0.f19006b;
            this.f18969m.c(11, new ai.q1(i10, b1Var, new e2.b1(obj3, o02, l0Var3, obj4, i18, h04, j13, f0Var5.f59524b, f0Var5.f59525c), 3));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f18969m.c(1, new r1(l0Var, intValue, 4));
        }
        if (g1Var2.f19009f != g1Var.f19009f) {
            this.f18969m.c(10, new h2.o() {
                @Override
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
            if (g1Var.f19009f != null) {
                this.f18969m.c(10, new h2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (r2) {
                            case 0:
                                g1 g1Var4 = g1Var;
                                a1Var.f(g1Var4.f19010g);
                                a1Var.h(g1Var4.f19010g);
                                return;
                            case 1:
                                g1 g1Var5 = g1Var;
                                a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                                return;
                            case 2:
                                a1Var.l(g1Var.f19008e);
                                return;
                            case 3:
                                g1 g1Var6 = g1Var;
                                a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                                return;
                            case 4:
                                a1Var.d(g1Var.f19016n);
                                return;
                            case 5:
                                a1Var.P(g1Var.m());
                                return;
                            case 6:
                                a1Var.H(g1Var.f19017o);
                                return;
                            case 7:
                                a1Var.q(g1Var.f19009f);
                                return;
                            case 8:
                                a1Var.y(g1Var.f19009f);
                                return;
                            default:
                                a1Var.u(g1Var.f19011i.d);
                                return;
                        }
                    }
                });
            }
        }
        a3.y yVar = g1Var2.f19011i;
        a3.y yVar2 = g1Var.f19011i;
        if (yVar != yVar2) {
            a3.x xVar = this.f18961i;
            Object obj8 = yVar2.f146e;
            xVar.getClass();
            xVar.f142c = (a3.w) obj8;
            this.f18969m.c(2, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f18969m.c(14, new q(this.Q));
        }
        if (z14) {
            this.f18969m.c(3, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f18969m.c(-1, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f18969m.c(4, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || g1Var2.f19015m != g1Var.f19015m) {
            this.f18969m.c(5, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.f19016n != g1Var.f19016n) {
            this.f18969m.c(6, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.m() != g1Var.m()) {
            this.f18969m.c(7, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        if (!g1Var2.f19017o.equals(g1Var.f19017o)) {
            this.f18969m.c(12, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.f(g1Var4.f19010g);
                            a1Var.h(g1Var4.f19010g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19008e, g1Var5.f19014l);
                            return;
                        case 2:
                            a1Var.l(g1Var.f19008e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.i(g1Var6.f19015m, g1Var6.f19014l);
                            return;
                        case 4:
                            a1Var.d(g1Var.f19016n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19017o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19009f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19009f);
                            return;
                        default:
                            a1Var.u(g1Var.f19011i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f18969m.b();
        if (g1Var2.f19018p != g1Var.f19018p) {
            Iterator it = this.f18970n.iterator();
            while (it.hasNext()) {
                ((z) it.next()).f19233a.E1();
            }
        }
    }

    @Override
    public final e2.q1 E0() {
        F1();
        return ((a3.s) this.f18961i).j();
    }

    public final void E1() {
        int i7 = i();
        ei.a aVar = this.A;
        h2.o0 o0Var = this.f18988z;
        boolean z10 = false;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f18975p0.f19018p;
                if (u() && !z11) {
                    z10 = true;
                }
                o0Var.b(z10);
                aVar.a(u());
                return;
            }
        }
        o0Var.b(false);
        aVar.a(false);
    }

    @Override
    public final float F() {
        F1();
        return this.f18950b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f18975p0.f19005a.p()) {
            return this.f18979r0;
        }
        g1 g1Var = this.f18975p0;
        long j3 = 0;
        if (g1Var.f19013k.d != g1Var.f19006b.d) {
            return h2.l0.h0(g1Var.f19005a.m(o0(), (e2.k1) this.f6112a, 0L).f10170m);
        }
        long j10 = g1Var.f19019q;
        if (this.f18975p0.f19013k.b()) {
            g1 g1Var2 = this.f18975p0;
            g1Var2.f19005a.g(g1Var2.f19013k.f59523a, this.f18972o).d(this.f18975p0.f19013k.f59524b);
        } else {
            j3 = j10;
        }
        g1 g1Var3 = this.f18975p0;
        e2.l1 l1Var = g1Var3.f19005a;
        Object obj = g1Var3.f19013k.f59523a;
        e2.i1 i1Var = this.f18972o;
        l1Var.g(obj, i1Var);
        return h2.l0.h0(j3 + i1Var.f10119e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f18982t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.l0.f13471a;
            Locale locale = Locale.US;
            String l10 = r.b.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f18957f0) {
                if (this.f18959g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                h2.a.m("ExoPlayerImpl", l10, illegalStateException);
                this.f18959g0 = true;
                return;
            }
            throw new IllegalStateException(l10);
        }
    }

    @Override
    public final void G0(int i7) {
        F1();
    }

    @Override
    public final e2.e H() {
        F1();
        return this.f18948a0;
    }

    @Override
    public final void I0(e2.a1 a1Var) {
        a1Var.getClass();
        this.f18969m.a(a1Var);
    }

    @Override
    public final void J(int i7, boolean z10) {
        F1();
    }

    @Override
    public final e2.o K() {
        F1();
        return this.f18964j0;
    }

    @Override
    public final void K0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.f18969m.e(15, new u(this, 3));
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
            return this.f18975p0.f19006b.f59525c;
        }
        return -1;
    }

    @Override
    public final long O0() {
        F1();
        return this.f18968l0;
    }

    @Override
    public final void R(int i7, int i10) {
        boolean z10;
        F1();
        if (i7 >= 0 && i10 >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        int size = this.f18974p.size();
        int min = Math.min(i10, size);
        if (i7 < size && i7 != min) {
            g1 r12 = r1(this.f18975p0, i7, min);
            D1(r12, 0, !r12.f19006b.f59523a.equals(this.f18975p0.f19006b.f59523a), 4, j1(r12), -1, false);
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
        surfaceHolder.addCallback(this.f18985w);
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
        float h = h2.l0.h(f10, 0.0f, 1.0f);
        float f11 = this.f18950b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.f18952c0 = f11;
        this.f18950b0 = h;
        this.f18967l.f19138n.b(32, Float.valueOf(h)).b();
        this.f18969m.e(22, new s(h, 0));
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
        return this.f18975p0.f19009f;
    }

    @Override
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13471a + "] [" + e2.m0.b() + "]");
        F1();
        this.f18987y.z();
        this.f18988z.b(false);
        this.A.a(false);
        e0 e0Var = this.E;
        if (e0Var != null && Build.VERSION.SDK_INT >= 34) {
            e0.a(e0Var);
        }
        h2.e0 e0Var2 = this.D;
        ((h2.i0) e0Var2.f13436f).f13456a.removeCallbacksAndMessages(null);
        ((f0) e0Var2.f13432a).h0((h2.z) e0Var2.f13433b);
        o0 o0Var = this.f18967l;
        if (!o0Var.f19122a0 && o0Var.f19145s.getThread().isAlive()) {
            o0Var.f19122a0 = true;
            h2.i iVar = new h2.i(o0Var.G);
            o0Var.f19138n.b(7, iVar).b();
            z10 = iVar.c(o0Var.L);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f18969m.e(10, new i0.b(23));
        }
        this.f18969m.d();
        this.f18963j.f13456a.removeCallbacksAndMessages(null);
        b3.d dVar = this.f18984u;
        m2.e eVar = this.f18980s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).f2890c.f4865b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.f2874b == eVar) {
                cVar.f2875c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        g1 g1Var = this.f18975p0;
        if (g1Var.f19018p) {
            this.f18975p0 = g1Var.a();
        }
        g1 n1 = n1(this.f18975p0, 1);
        this.f18975p0 = n1;
        g1 c10 = n1.c(n1.f19006b);
        this.f18975p0 = c10;
        c10.f19019q = c10.f19021s;
        this.f18975p0.f19020r = 0L;
        m2.e eVar2 = this.f18980s;
        h2.i0 i0Var = eVar2.f20129n;
        i0Var.getClass();
        i0Var.d(new kg.j1(eVar2, 15));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f18955e0 = g2.c.d;
        this.f18962i0 = true;
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
            ja.f(z11);
            e2.l1 l1Var = this.f18975p0.f19005a;
            if (!l1Var.p() && i7 >= l1Var.o()) {
                return;
            }
            m2.e eVar = this.f18980s;
            if (!eVar.f20130r) {
                m2.a Q = eVar.Q();
                eVar.f20130r = true;
                eVar.V(Q, -1, new ki.e(Q, 10));
            }
            this.J++;
            if (p()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                l0 l0Var = new l0(this.f18975p0);
                l0Var.f(1);
                f0 f0Var = this.f18965k.f19183b;
                f0Var.f18963j.d(new t1(11, f0Var, l0Var));
                return;
            }
            g1 g1Var = this.f18975p0;
            int i10 = g1Var.f19008e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                g1Var = this.f18975p0.h(2);
            }
            int o02 = o0();
            g1 o12 = o1(g1Var, l1Var, p1(l1Var, i7, j3));
            this.f18967l.f19138n.b(3, new n0(l1Var, i7, h2.l0.S(j3))).b();
            D1(o12, 0, true, 1, j1(o12), o02, z10);
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
        g1 g1Var = this.f18975p0;
        if (g1Var.f19008e != 1) {
            return;
        }
        g1 f10 = g1Var.f(null);
        if (f10.f19005a.p()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        g1 n1 = n1(f10, i7);
        this.J++;
        this.f18967l.f19138n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long a0() {
        F1();
        return i1(this.f18975p0);
    }

    @Override
    public final void b0(int i7, List list) {
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
        ja.f(z10);
        int min = Math.min(i7, this.f18974p.size());
        if (this.f18975p0.f19005a.p()) {
            if (this.f18977q0 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        D1(e1(this.f18975p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void c0() {
        F1();
        if (this.f18950b0 == 0.0f) {
            float f10 = this.f18952c0;
            if (f10 != 0.0f) {
                T(f10);
            }
        }
    }

    @Override
    public final long d0() {
        F1();
        if (p()) {
            g1 g1Var = this.f18975p0;
            if (g1Var.f19013k.equals(g1Var.f19006b)) {
                return h2.l0.h0(this.f18975p0.f19019q);
            }
            return getDuration();
        }
        return F0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.f18975p0.f19017o.equals(w0Var)) {
            return;
        }
        g1 g10 = this.f18975p0.g(w0Var);
        this.J++;
        this.f18967l.f19138n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final g1 e1(g1 g1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = g1Var.f19005a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f18974p;
            if (i10 < size) {
                e1 e1Var = new e1((x2.a) arrayList.get(i10), this.f18976q);
                arrayList2.add(e1Var);
                arrayList3.add(i10 + i7, new b0(e1Var.f18933b, e1Var.f18932a));
                i10++;
            } else {
                this.O = this.O.f(i7, arrayList2.size());
                l1 l1Var2 = new l1(arrayList3, this.O);
                g1 o12 = o1(g1Var, l1Var2, l1(l1Var, l1Var2, k1(g1Var), i1(g1Var)));
                x2.g1 g1Var2 = this.O;
                h2.i0 i0Var = this.f18967l.f19138n;
                j0 j0Var = new j0(arrayList2, g1Var2, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.f13452a = i0Var.f13456a.obtainMessage(18, i7, 0, j0Var);
                c10.b();
                return o12;
            }
        }
    }

    public final e2.o0 f1() {
        boolean z10;
        e2.l1 y02 = y0();
        if (y02.p()) {
            return this.f18973o0;
        }
        e2.l0 l0Var = y02.m(o0(), (e2.k1) this.f6112a, 0L).f10162c;
        e2.n0 a10 = this.f18973o0.a();
        e2.o0 o0Var = l0Var.d;
        if (o0Var != null) {
            h9.i0 i0Var = o0Var.K;
            byte[] bArr = o0Var.f10271k;
            CharSequence charSequence = o0Var.f10263a;
            if (charSequence != null) {
                a10.f10213a = charSequence;
            }
            CharSequence charSequence2 = o0Var.f10264b;
            if (charSequence2 != null) {
                a10.f10214b = charSequence2;
            }
            CharSequence charSequence3 = o0Var.f10265c;
            if (charSequence3 != null) {
                a10.f10215c = charSequence3;
            }
            CharSequence charSequence4 = o0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = o0Var.f10266e;
            if (charSequence5 != null) {
                a10.f10216e = charSequence5;
            }
            CharSequence charSequence6 = o0Var.f10267f;
            if (charSequence6 != null) {
                a10.f10217f = charSequence6;
            }
            CharSequence charSequence7 = o0Var.f10268g;
            if (charSequence7 != null) {
                a10.f10218g = charSequence7;
            }
            Long l10 = o0Var.h;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja.f(z10);
                a10.h = l10;
            }
            e2.d1 d1Var = o0Var.f10269i;
            if (d1Var != null) {
                a10.f10219i = d1Var;
            }
            e2.d1 d1Var2 = o0Var.f10270j;
            if (d1Var2 != null) {
                a10.f10220j = d1Var2;
            }
            Uri uri = o0Var.f10274n;
            if (uri != null || bArr != null) {
                a10.f10224n = uri;
                a10.b(bArr, o0Var.f10273m);
                a10.f10222l = o0Var.f10272l;
            }
            Integer num = o0Var.f10275o;
            if (num != null) {
                a10.f10225o = num;
            }
            Integer num2 = o0Var.f10276p;
            if (num2 != null) {
                a10.f10226p = num2;
            }
            Integer num3 = o0Var.f10277q;
            if (num3 != null) {
                a10.f10227q = num3;
            }
            Boolean bool = o0Var.f10278r;
            if (bool != null) {
                a10.f10228r = bool;
            }
            Boolean bool2 = o0Var.f10279s;
            if (bool2 != null) {
                a10.f10229s = bool2;
            }
            Integer num4 = o0Var.f10280t;
            if (num4 != null) {
                a10.f10230t = num4;
            }
            Integer num5 = o0Var.f10281u;
            if (num5 != null) {
                a10.f10230t = num5;
            }
            Integer num6 = o0Var.v;
            if (num6 != null) {
                a10.f10231u = num6;
            }
            Integer num7 = o0Var.f10282w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = o0Var.f10283x;
            if (num8 != null) {
                a10.f10232w = num8;
            }
            Integer num9 = o0Var.f10284y;
            if (num9 != null) {
                a10.f10233x = num9;
            }
            Integer num10 = o0Var.f10285z;
            if (num10 != null) {
                a10.f10234y = num10;
            }
            CharSequence charSequence8 = o0Var.A;
            if (charSequence8 != null) {
                a10.f10235z = charSequence8;
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
        return this.f18975p0.f19010g;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f18978r.b((e2.l0) list.get(i7)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (p()) {
            g1 g1Var = this.f18975p0;
            x2.f0 f0Var = g1Var.f19006b;
            e2.l1 l1Var = g1Var.f19005a;
            Object obj = f0Var.f59523a;
            e2.i1 i1Var = this.f18972o;
            l1Var.g(obj, i1Var);
            return h2.l0.h0(i1Var.a(f0Var.f59524b, f0Var.f59525c));
        }
        return A();
    }

    @Override
    public final void h0(e2.a1 a1Var) {
        boolean z10;
        F1();
        a1Var.getClass();
        h2.r rVar = this.f18969m;
        if (rVar.f13504i) {
            if (Thread.currentThread() == rVar.f13498a) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h2.q qVar = (h2.q) it.next();
            if (qVar.f13495a.equals(a1Var)) {
                h2.p pVar = rVar.f13500c;
                qVar.d = true;
                if (pVar != null && qVar.f13497c) {
                    qVar.f13497c = false;
                    pVar.e(qVar.f13495a, qVar.f13496b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final j1 h1(i1 i1Var) {
        int k12 = k1(this.f18975p0);
        e2.l1 l1Var = this.f18975p0.f19005a;
        if (k12 == -1) {
            k12 = 0;
        }
        o0 o0Var = this.f18967l;
        return new j1(o0Var, i1Var, l1Var, k12, o0Var.f19145s);
    }

    @Override
    public final int i() {
        F1();
        return this.f18975p0.f19008e;
    }

    @Override
    public final void i0(int i7) {
        F1();
    }

    public final long i1(g1 g1Var) {
        x2.f0 f0Var = g1Var.f19006b;
        long j3 = g1Var.f19007c;
        e2.l1 l1Var = g1Var.f19005a;
        if (f0Var.b()) {
            Object obj = g1Var.f19006b.f59523a;
            e2.i1 i1Var = this.f18972o;
            l1Var.g(obj, i1Var);
            if (j3 == -9223372036854775807L) {
                return h2.l0.h0(l1Var.m(k1(g1Var), (e2.k1) this.f6112a, 0L).f10169l);
            }
            return h2.l0.h0(j3) + h2.l0.h0(i1Var.f10119e);
        }
        return h2.l0.h0(j1(g1Var));
    }

    @Override
    public final e2.w0 j() {
        F1();
        return this.f18975p0.f19017o;
    }

    @Override
    public final s1 j0() {
        F1();
        return this.f18975p0.f19011i.d;
    }

    public final long j1(g1 g1Var) {
        long j3;
        if (g1Var.f19005a.p()) {
            return h2.l0.S(this.f18979r0);
        }
        if (g1Var.f19018p) {
            j3 = g1Var.l();
        } else {
            j3 = g1Var.f19021s;
        }
        if (g1Var.f19006b.b()) {
            return j3;
        }
        e2.l1 l1Var = g1Var.f19005a;
        Object obj = g1Var.f19006b.f59523a;
        e2.i1 i1Var = this.f18972o;
        l1Var.g(obj, i1Var);
        return j3 + i1Var.f10119e;
    }

    @Override
    public final void k(int i7) {
        F1();
        if (this.H != i7) {
            this.H = i7;
            h2.i0 i0Var = this.f18967l.f19138n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13452a = i0Var.f13456a.obtainMessage(11, i7, 0);
            c10.b();
            t tVar = new t(i7, 0);
            h2.r rVar = this.f18969m;
            rVar.c(8, tVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final e2.o0 k0() {
        F1();
        return this.R;
    }

    public final int k1(g1 g1Var) {
        if (g1Var.f19005a.p()) {
            return this.f18977q0;
        }
        return g1Var.f19005a.g(g1Var.f19006b.f59523a, this.f18972o).f10118c;
    }

    @Override
    public final long l() {
        F1();
        return h2.l0.h0(j1(this.f18975p0));
    }

    @Override
    public final g2.c l0() {
        F1();
        return this.f18955e0;
    }

    public final Pair l1(e2.l1 l1Var, l1 l1Var2, int i7, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        if (!l1Var.p() && !l1Var2.p()) {
            Pair i11 = l1Var.i((e2.k1) this.f6112a, this.f18972o, i7, h2.l0.S(j3));
            Object obj = i11.first;
            if (l1Var2.b(obj) != -1) {
                return i11;
            }
            int T = o0.T((e2.k1) this.f6112a, this.f18972o, this.H, this.I, obj, l1Var, l1Var2);
            if (T != -1) {
                e2.k1 k1Var = (e2.k1) this.f6112a;
                l1Var2.m(T, k1Var, 0L);
                return p1(l1Var2, T, h2.l0.h0(k1Var.f10169l));
            }
            return p1(l1Var2, -1, -9223372036854775807L);
        }
        if (!l1Var.p() && l1Var2.p()) {
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
        return p1(l1Var2, i10, j10);
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
            return this.f18975p0.f19006b.f59524b;
        }
        return -1;
    }

    @Override
    public final int o0() {
        F1();
        int k12 = k1(this.f18975p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final g1 o1(g1 g1Var, e2.l1 l1Var, Pair pair) {
        boolean z10;
        x2.f0 f0Var;
        x2.q1 q1Var;
        a3.y yVar;
        List list;
        int i7;
        long j3;
        if (!l1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ja.f(z10);
        e2.l1 l1Var2 = g1Var.f19005a;
        long i12 = i1(g1Var);
        g1 j10 = g1Var.j(l1Var);
        if (l1Var.p()) {
            x2.f0 f0Var2 = g1.f19004u;
            long S = h2.l0.S(this.f18979r0);
            g1 c10 = j10.d(f0Var2, S, S, S, 0L, x2.q1.d, this.f18949b, h9.s1.f13749e).c(f0Var2);
            c10.f19019q = c10.f19021s;
            return c10;
        }
        Object obj = j10.f19006b.f59523a;
        String str = h2.l0.f13471a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            f0Var = new x2.f0(pair.first);
        } else {
            f0Var = j10.f19006b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.l0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.f18972o).f10119e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.f18972o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.f0 f0Var3 = f0Var;
            ja.p(!f0Var3.b());
            if (!equals) {
                q1Var = x2.q1.d;
            } else {
                q1Var = j10.h;
            }
            x2.q1 q1Var2 = q1Var;
            if (!equals) {
                yVar = this.f18949b;
            } else {
                yVar = j10.f19011i;
            }
            a3.y yVar2 = yVar;
            if (!equals) {
                h9.g0 g0Var = h9.i0.f13686b;
                list = h9.s1.f13749e;
            } else {
                list = j10.f19012j;
            }
            g1 c11 = j10.d(f0Var3, longValue, longValue, longValue, 0L, q1Var2, yVar2, list).c(f0Var3);
            c11.f19019q = longValue;
            return c11;
        } else if (i7 == 0) {
            int b10 = l1Var.b(j10.f19013k.f59523a);
            if (b10 != -1 && l1Var.f(b10, this.f18972o, false).f10118c == l1Var.g(f0Var.f59523a, this.f18972o).f10118c) {
                return j10;
            }
            l1Var.g(f0Var.f59523a, this.f18972o);
            if (f0Var.b()) {
                j3 = this.f18972o.a(f0Var.f59524b, f0Var.f59525c);
            } else {
                j3 = this.f18972o.d;
            }
            x2.f0 f0Var4 = f0Var;
            g1 c12 = j10.d(f0Var4, j10.f19021s, j10.f19021s, j10.d, j3 - j10.f19021s, j10.h, j10.f19011i, j10.f19012j).c(f0Var4);
            c12.f19019q = j3;
            return c12;
        } else {
            x2.f0 f0Var5 = f0Var;
            ja.p(!f0Var5.b());
            long max = Math.max(0L, j10.f19020r - (longValue - S2));
            long j11 = j10.f19019q;
            if (j10.f19013k.equals(j10.f19006b)) {
                j11 = longValue + max;
            }
            g1 d = j10.d(f0Var5, longValue, longValue, longValue, max, j10.h, j10.f19011i, j10.f19012j);
            d.f19019q = j11;
            return d;
        }
    }

    @Override
    public final boolean p() {
        F1();
        return this.f18975p0.f19006b.b();
    }

    public final Pair p1(e2.l1 l1Var, int i7, long j3) {
        if (l1Var.p()) {
            this.f18977q0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f18979r0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= l1Var.o()) {
            i7 = l1Var.a(this.I);
            j3 = h2.l0.h0(l1Var.m(i7, (e2.k1) this.f6112a, 0L).f10169l);
        }
        return l1Var.i((e2.k1) this.f6112a, this.f18972o, i7, h2.l0.S(j3));
    }

    @Override
    public final void q0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.f18961i;
        xVar.getClass();
        e2.q1 E0 = E0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (!E0.equals(q1Var)) {
            this.f18969m.e(19, new ki.e(q1Var, 4));
        }
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.f13525a && i10 == yVar.f13526b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        n51 n51Var = this.f18981s0;
        if (n51Var != null) {
            n51Var.execute(new jg.q(this, i7, i10, 1));
            return;
        }
        this.f18969m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override
    public final long r() {
        F1();
        return h2.l0.h0(this.f18975p0.f19020r);
    }

    @Override
    public final void r0(boolean z10) {
        F1();
    }

    public final g1 r1(g1 g1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(g1Var);
        long i12 = i1(g1Var);
        e2.l1 l1Var = g1Var.f19005a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.f18974p;
            if (i11 < i7) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i7, i10);
        l1 l1Var2 = new l1(arrayList, this.O);
        g1 o12 = o1(g1Var, l1Var2, l1(l1Var, l1Var2, k12, i12));
        int i13 = o12.f19008e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (o0.T((e2.k1) this.f6112a, this.f18972o, this.H, this.I, g1Var.f19006b.f59523a, l1Var, l1Var2) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.g1 g1Var2 = this.O;
        h2.i0 i0Var = this.f18967l.f19138n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13452a = i0Var.f13456a.obtainMessage(20, i7, i10, g1Var2);
        c10.b();
        return o12;
    }

    @Override
    public final void s0(List list, int i7, int i10) {
        boolean z10;
        x2.o1 o1Var;
        F1();
        boolean z11 = true;
        if (i7 >= 0 && i10 >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        ArrayList arrayList = this.f18974p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((b0) arrayList.get(i11)).f18900b.f59663k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.f18967l.f19138n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13452a = i0Var.f13456a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                b0 b0Var = (b0) arrayList.get(i12);
                e2.l1 l1Var = b0Var.f18901c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                if (l1Var instanceof x2.o1) {
                    o1Var = new x2.o1(((x2.o1) l1Var).f59643e, l0Var);
                } else {
                    o1Var = new x2.o1(l1Var, l0Var);
                }
                b0Var.f18901c = o1Var;
            }
            D1(this.f18975p0.j(new l1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f18975p0.f19005a.p()) {
            if (this.f18977q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        g1 r12 = r1(e1(this.f18975p0, min, g12), i7, min);
        D1(r12, 0, !r12.f19006b.f59523a.equals(this.f18975p0.f19006b.f59523a), 4, j1(r12), -1, false);
    }

    public final void s1() {
        TextureView textureView = this.X;
        z zVar = this.f18985w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != zVar) {
                h2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(zVar);
            this.V = null;
        }
    }

    @Override
    public final void stop() {
        F1();
        A1(null);
        this.f18955e0 = new g2.c(this.f18975p0.f19021s, h9.s1.f13749e);
    }

    @Override
    public final e2.y0 t() {
        F1();
        return this.P;
    }

    public final void t1(int i7, int i10, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f18958g) {
            if (i7 == -1 || bVar.f18889b == i7) {
                j1 h12 = h1(bVar);
                ja.p(!h12.f19056f);
                h12.f19054c = i10;
                ja.p(!h12.f19056f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.f18889b == i7)) {
                j1 h13 = h1(bVar2);
                ja.p(!h13.f19056f);
                h13.f19054c = i10;
                ja.p(!h13.f19056f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final boolean u() {
        F1();
        return this.f18975p0.f19014l;
    }

    @Override
    public final void u0(int i7, int i10, int i11) {
        boolean z10;
        F1();
        if (i7 >= 0 && i7 <= i10 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        ArrayList arrayList = this.f18974p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 < size && i7 != min && i7 != min2) {
            e2.l1 y02 = y0();
            this.J++;
            h2.l0.R(i7, min, min2, arrayList);
            this.O = this.O.g();
            l1 l1Var = new l1(arrayList, this.O);
            g1 g1Var = this.f18975p0;
            g1 o12 = o1(g1Var, l1Var, l1(y02, l1Var, k1(g1Var), i1(this.f18975p0)));
            x2.g1 g1Var2 = this.O;
            o0 o0Var = this.f18967l;
            o0Var.getClass();
            o0Var.f19138n.b(19, new k0(i7, min, min2, g1Var2)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void u1(x2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    public final void v1(int i7, long j3, List list, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        int k12 = k1(this.f18975p0);
        long l10 = l();
        this.J++;
        ArrayList arrayList = this.f18974p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e1 e1Var = new e1((x2.a) list.get(i11), this.f18976q);
            arrayList2.add(e1Var);
            arrayList.add(i11, new b0(e1Var.f18933b, e1Var.f18932a));
        }
        this.O = this.O.c(arrayList2.size());
        l1 l1Var = new l1(arrayList, this.O);
        boolean p10 = l1Var.p();
        int i12 = l1Var.h;
        if (!p10 && i7 >= i12) {
            throw new IllegalStateException();
        }
        if (z10) {
            j10 = -9223372036854775807L;
            i10 = l1Var.a(this.I);
        } else if (i7 == -1) {
            i10 = k12;
            j10 = l10;
        } else {
            i10 = i7;
            j10 = j3;
        }
        g1 o12 = o1(this.f18975p0, l1Var, p1(l1Var, i10, j10));
        int i13 = o12.f19008e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!l1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        g1 n1 = n1(o12, i13);
        this.f18967l.f19138n.b(17, new j0(arrayList2, this.O, i10, h2.l0.S(j10))).b();
        if (!this.f18975p0.f19006b.f59523a.equals(n1.f19006b.f59523a) && !this.f18975p0.f19005a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        D1(n1, 0, z11, 4, j1(n1), -1, false);
    }

    @Override
    public final int w0() {
        F1();
        return this.f18975p0.f19016n;
    }

    public final void w1(p1 p1Var) {
        F1();
        if (p1Var == null) {
            p1Var = p1.f19162f;
        }
        if (!this.N.equals(p1Var)) {
            this.N = p1Var;
            this.f18967l.f19138n.b(5, p1Var).b();
        }
    }

    @Override
    public final void x(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            h2.i0 i0Var = this.f18967l.f19138n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13452a = i0Var.f13456a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            v vVar = new v(0, z10);
            h2.r rVar = this.f18969m;
            rVar.c(9, vVar);
            B1();
            rVar.b();
        }
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
        o0 o0Var = this.f18967l;
        if (!o0Var.f19122a0 && o0Var.f19145s.getThread().isAlive()) {
            h2.i iVar = new h2.i(o0Var.G);
            o0Var.f19138n.b(30, new Pair(surface, iVar)).b();
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
            A1(new l(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final e2.l1 y0() {
        F1();
        return this.f18975p0.f19005a;
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
        return this.f18971n0;
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
        textureView.setSurfaceTextureListener(this.f18985w);
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
