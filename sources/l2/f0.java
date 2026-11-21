package l2;

import a8.la;
import ai.t1;
import ai.u1;
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
import hi.e9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.b61;
import x2.r1;
public final class f0 extends com.google.android.gms.common.api.q implements p {
    public final ei.a A;
    public final long B;
    public final h2.c C;
    public final h2.e0 D;
    public final e0 E;
    public final ji.l F;
    public final ji.l G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final o1 M;
    public p1 N;
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
    public e2.e f19340a0;
    public final a3.y f19341b;
    public float f19342b0;
    public final e2.y0 f19343c;
    public float f19344c0;
    public final h2.i d;
    public boolean f19345d0;
    public final Context f19346e;
    public g2.c f19347e0;
    public final f0 f19348f;
    public final boolean f19349f0;
    public final b[] f19350g;
    public boolean f19351g0;
    public final b[] h;
    public final int f19352h0;
    public final a3.x f19353i;
    public boolean f19354i0;
    public final h2.i0 f19355j;
    public final e2.o f19356j0;
    public final u f19357k;
    public x1 f19358k0;
    public final o0 f19359l;
    public final long f19360l0;
    public final h2.r f19361m;
    public final long m0;
    public final CopyOnWriteArraySet f19362n;
    public final long f19363n0;
    public final e2.i1 f19364o;
    public e2.o0 f19365o0;
    public final ArrayList f19366p;
    public g1 f19367p0;
    public final boolean f19368q;
    public int f19369q0;
    public final x2.f0 f19370r;
    public long f19371r0;
    public final m2.d f19372s;
    public b61 f19373s0;
    public final Looper f19374t;
    public final ArrayList f19375t0;
    public final b3.d f19376u;
    public final h2.g0 v;
    public final z f19377w;
    public final a0 f19378x;
    public final ab.q f19379y;
    public final h2.o0 f19380z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    public f0(l2.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: l2.f0.<init>(l2.n):void");
    }

    public static long m1(g1 g1Var) {
        e2.k1 k1Var = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        g1Var.f19397a.g(g1Var.f19398b.f60129a, i1Var);
        long j3 = g1Var.f19399c;
        if (j3 == -9223372036854775807L) {
            return g1Var.f19397a.m(i1Var.f10462c, k1Var, 0L).f10513l;
        }
        return i1Var.f10463e + j3;
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
        return this.f19374t;
    }

    public final void A1(l lVar) {
        g1 g1Var = this.f19367p0;
        g1 c10 = g1Var.c(g1Var.f19398b);
        c10.f19411q = c10.f19413s;
        c10.f19412r = 0L;
        g1 n1 = n1(c10, 1);
        if (lVar != null) {
            n1 = n1.f(lVar);
        }
        this.J++;
        this.f19359l.f19530n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int B() {
        F1();
        if (this.f19367p0.f19397a.p()) {
            int i7 = this.f19369q0;
            if (i7 == -1) {
                return 0;
            }
            return i7;
        }
        g1 g1Var = this.f19367p0;
        return g1Var.f19397a.b(g1Var.f19398b.f60129a);
    }

    @Override
    public final void B0() {
        F1();
        if (this.f19342b0 != 0.0f) {
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
        String str = h2.l0.f13812a;
        f0 f0Var = this.f19348f;
        boolean p10 = f0Var.p();
        boolean e02 = f0Var.e0();
        boolean T0 = f0Var.T0();
        boolean S0 = f0Var.S0();
        boolean P0 = f0Var.P0();
        boolean v02 = f0Var.v0();
        boolean p11 = f0Var.y0().p();
        ?? obj = new Object();
        obj.f10825a = new ca.i();
        ca.i iVar = (ca.i) obj.f10825a;
        iVar.c(this.f19343c.f10836a);
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
            this.f19361m.c(13, new u(this, 2));
        }
    }

    @Override
    public final x1 C() {
        F1();
        return this.f19358k0;
    }

    @Override
    public final void C0() {
        F1();
    }

    public final void C1(int i7, boolean z10) {
        int i10;
        g1 g1Var = this.f19367p0;
        int i11 = g1Var.f19408n;
        if (i11 == 1 && !z10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (g1Var.f19406l == z10 && i11 == i10 && g1Var.f19407m == i7) {
            return;
        }
        this.J++;
        if (g1Var.f19410p) {
            g1Var = g1Var.a();
        }
        g1 e10 = g1Var.e(i7, i10, z10);
        h2.i0 i0Var = this.f19359l.f19530n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13793a = i0Var.f13797a.obtainMessage(1, z10 ? 1 : 0, i7 | (i10 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void D(e2.e eVar, boolean z10) {
        F1();
        if (this.f19354i0) {
            return;
        }
        boolean equals = Objects.equals(this.f19340a0, eVar);
        h2.r rVar = this.f19361m;
        if (!equals) {
            this.f19340a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new kg.x1(eVar, 5));
        }
        e2.e eVar2 = this.f19340a0;
        h2.i0 i0Var = this.f19359l.f19530n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13793a = i0Var.f13797a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
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
        g1 g1Var2 = this.f19367p0;
        this.f19367p0 = g1Var;
        boolean equals = g1Var2.f19397a.equals(g1Var.f19397a);
        e2.k1 k1Var = (e2.k1) this.f6424a;
        e2.i1 i1Var = this.f19364o;
        e2.l1 l1Var = g1Var2.f19397a;
        x2.g0 g0Var = g1Var2.f19398b;
        e2.l1 l1Var2 = g1Var.f19397a;
        x2.g0 g0Var2 = g1Var.f19398b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!l1Var.m(l1Var.g(g0Var.f60129a, i1Var).f10462c, k1Var, 0L).f10504a.equals(l1Var2.m(l1Var2.g(g0Var2.f60129a, i1Var).f10462c, k1Var, 0L).f10504a)) {
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
            if (!g1Var.f19397a.p()) {
                l0Var = g1Var.f19397a.m(g1Var.f19397a.g(g1Var.f19398b.f60129a, this.f19364o).f10462c, (e2.k1) this.f6424a, 0L).f10506c;
            } else {
                l0Var = null;
            }
            this.f19365o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !g1Var2.f19404j.equals(g1Var.f19404j)) {
            e2.n0 a10 = this.f19365o0.a();
            List list = g1Var.f19404j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                e2.q0 q0Var = (e2.q0) list.get(i15);
                int i16 = 0;
                while (true) {
                    e2.p0[] p0VarArr = q0Var.f10664a;
                    if (i16 < p0VarArr.length) {
                        p0VarArr[i16].b(a10);
                        i16++;
                    }
                }
            }
            this.f19365o0 = new e2.o0(a10);
        }
        e2.o0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (g1Var2.f19406l != g1Var.f19406l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g1Var2.f19400e != g1Var.f19400e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (g1Var2.f19402g != g1Var.f19402g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f19361m.c(0, new u1(g1Var, i7, 3));
        }
        if (z10) {
            e2.i1 i1Var2 = new e2.i1();
            if (!g1Var2.f19397a.p()) {
                Object obj5 = g1Var2.f19398b.f60129a;
                g1Var2.f19397a.g(obj5, i1Var2);
                int i17 = i1Var2.f10462c;
                int b10 = g1Var2.f19397a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = g1Var2.f19397a.m(i17, (e2.k1) this.f6424a, 0L).f10504a;
                l0Var2 = ((e2.k1) this.f6424a).f10506c;
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
                if (g1Var2.f19398b.b()) {
                    x2.g0 g0Var3 = g1Var2.f19398b;
                    j12 = i1Var2.a(g0Var3.f60130b, g0Var3.f60131c);
                    m12 = m1(g1Var2);
                } else if (g1Var2.f19398b.f60132e != -1) {
                    j12 = m1(this.f19367p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.f10463e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (g1Var2.f19398b.b()) {
                j12 = g1Var2.f19413s;
                m12 = m1(g1Var2);
            } else {
                j10 = i1Var2.f10463e;
                j11 = g1Var2.f19413s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.l0.h0(j12);
            long h03 = h2.l0.h0(m12);
            x2.g0 g0Var4 = g1Var2.f19398b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, g0Var4.f60130b, g0Var4.f60131c);
            e2.k1 k1Var2 = (e2.k1) this.f6424a;
            int o02 = o0();
            int B = B();
            if (!this.f19367p0.f19397a.p()) {
                g1 g1Var3 = this.f19367p0;
                Object obj6 = g1Var3.f19398b.f60129a;
                g1Var3.f19397a.g(obj6, this.f19364o);
                B = this.f19367p0.f19397a.b(obj6);
                Object obj7 = this.f19367p0.f19397a.m(o02, k1Var2, 0L).f10504a;
                l0Var3 = k1Var2.f10506c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            }
            int i18 = B;
            long h04 = h2.l0.h0(j3);
            if (this.f19367p0.f19398b.b()) {
                j13 = h2.l0.h0(m1(this.f19367p0));
            } else {
                j13 = h04;
            }
            x2.g0 g0Var5 = this.f19367p0.f19398b;
            this.f19361m.c(11, new t1(i10, b1Var, new e2.b1(obj3, o02, l0Var3, obj4, i18, h04, j13, g0Var5.f60130b, g0Var5.f60131c), 4));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f19361m.c(1, new u1(l0Var, intValue, 4));
        }
        if (g1Var2.f19401f != g1Var.f19401f) {
            this.f19361m.c(10, new h2.o() {
                @Override
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
            if (g1Var.f19401f != null) {
                this.f19361m.c(10, new h2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (r2) {
                            case 0:
                                g1 g1Var4 = g1Var;
                                a1Var.h(g1Var4.f19402g);
                                a1Var.j(g1Var4.f19402g);
                                return;
                            case 1:
                                g1 g1Var5 = g1Var;
                                a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                                return;
                            case 2:
                                a1Var.m(g1Var.f19400e);
                                return;
                            case 3:
                                g1 g1Var6 = g1Var;
                                a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                                return;
                            case 4:
                                a1Var.g(g1Var.f19408n);
                                return;
                            case 5:
                                a1Var.P(g1Var.m());
                                return;
                            case 6:
                                a1Var.H(g1Var.f19409o);
                                return;
                            case 7:
                                a1Var.q(g1Var.f19401f);
                                return;
                            case 8:
                                a1Var.y(g1Var.f19401f);
                                return;
                            default:
                                a1Var.u(g1Var.f19403i.d);
                                return;
                        }
                    }
                });
            }
        }
        a3.y yVar = g1Var2.f19403i;
        a3.y yVar2 = g1Var.f19403i;
        if (yVar != yVar2) {
            a3.x xVar = this.f19353i;
            Object obj8 = yVar2.f146e;
            xVar.getClass();
            xVar.f142c = (a3.w) obj8;
            this.f19361m.c(2, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f19361m.c(14, new q(this.Q));
        }
        if (z14) {
            this.f19361m.c(3, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f19361m.c(-1, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f19361m.c(4, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || g1Var2.f19407m != g1Var.f19407m) {
            this.f19361m.c(5, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.f19408n != g1Var.f19408n) {
            this.f19361m.c(6, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (g1Var2.m() != g1Var.m()) {
            this.f19361m.c(7, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        if (!g1Var2.f19409o.equals(g1Var.f19409o)) {
            this.f19361m.c(12, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            g1 g1Var4 = g1Var;
                            a1Var.h(g1Var4.f19402g);
                            a1Var.j(g1Var4.f19402g);
                            return;
                        case 1:
                            g1 g1Var5 = g1Var;
                            a1Var.D(g1Var5.f19400e, g1Var5.f19406l);
                            return;
                        case 2:
                            a1Var.m(g1Var.f19400e);
                            return;
                        case 3:
                            g1 g1Var6 = g1Var;
                            a1Var.k(g1Var6.f19407m, g1Var6.f19406l);
                            return;
                        case 4:
                            a1Var.g(g1Var.f19408n);
                            return;
                        case 5:
                            a1Var.P(g1Var.m());
                            return;
                        case 6:
                            a1Var.H(g1Var.f19409o);
                            return;
                        case 7:
                            a1Var.q(g1Var.f19401f);
                            return;
                        case 8:
                            a1Var.y(g1Var.f19401f);
                            return;
                        default:
                            a1Var.u(g1Var.f19403i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f19361m.b();
        if (g1Var2.f19410p != g1Var.f19410p) {
            Iterator it = this.f19362n.iterator();
            while (it.hasNext()) {
                ((z) it.next()).f19625a.E1();
            }
        }
    }

    @Override
    public final e2.q1 E0() {
        F1();
        return ((a3.s) this.f19353i).j();
    }

    public final void E1() {
        int i7 = i();
        ei.a aVar = this.A;
        h2.o0 o0Var = this.f19380z;
        boolean z10 = false;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f19367p0.f19410p;
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
        return this.f19342b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f19367p0.f19397a.p()) {
            return this.f19371r0;
        }
        g1 g1Var = this.f19367p0;
        long j3 = 0;
        if (g1Var.f19405k.d != g1Var.f19398b.d) {
            return h2.l0.h0(g1Var.f19397a.m(o0(), (e2.k1) this.f6424a, 0L).f10514m);
        }
        long j10 = g1Var.f19411q;
        if (this.f19367p0.f19405k.b()) {
            g1 g1Var2 = this.f19367p0;
            g1Var2.f19397a.g(g1Var2.f19405k.f60129a, this.f19364o).d(this.f19367p0.f19405k.f60130b);
        } else {
            j3 = j10;
        }
        g1 g1Var3 = this.f19367p0;
        e2.l1 l1Var = g1Var3.f19397a;
        Object obj = g1Var3.f19405k.f60129a;
        e2.i1 i1Var = this.f19364o;
        l1Var.g(obj, i1Var);
        return h2.l0.h0(j3 + i1Var.f10463e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f19374t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.l0.f13812a;
            Locale locale = Locale.US;
            String l10 = p5.c.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f19349f0) {
                if (this.f19351g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                h2.a.m("ExoPlayerImpl", l10, illegalStateException);
                this.f19351g0 = true;
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
        return this.f19340a0;
    }

    @Override
    public final void I0(e2.a1 a1Var) {
        a1Var.getClass();
        this.f19361m.a(a1Var);
    }

    @Override
    public final void J(int i7, boolean z10) {
        F1();
    }

    @Override
    public final e2.o K() {
        F1();
        return this.f19356j0;
    }

    @Override
    public final void K0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.f19361m.e(15, new u(this, 3));
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
            return this.f19367p0.f19398b.f60131c;
        }
        return -1;
    }

    @Override
    public final long O0() {
        F1();
        return this.f19360l0;
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
        la.f(z10);
        int size = this.f19366p.size();
        int min = Math.min(i10, size);
        if (i7 < size && i7 != min) {
            g1 r12 = r1(this.f19367p0, i7, min);
            D1(r12, 0, !r12.f19398b.f60129a.equals(this.f19367p0.f19398b.f60129a), 4, j1(r12), -1, false);
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
        surfaceHolder.addCallback(this.f19377w);
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
        float f11 = this.f19342b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.f19344c0 = f11;
        this.f19342b0 = h;
        this.f19359l.f19530n.b(32, Float.valueOf(h)).b();
        this.f19361m.e(22, new s(h, 0));
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
        return this.f19367p0.f19401f;
    }

    @Override
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13812a + "] [" + e2.m0.b() + "]");
        F1();
        this.f19379y.z();
        this.f19380z.b(false);
        this.A.a(false);
        e0 e0Var = this.E;
        if (e0Var != null && Build.VERSION.SDK_INT >= 34) {
            e0.a(e0Var);
        }
        h2.e0 e0Var2 = this.D;
        ((h2.i0) e0Var2.f13777f).f13797a.removeCallbacksAndMessages(null);
        ((f0) e0Var2.f13773a).h0((h2.z) e0Var2.f13774b);
        o0 o0Var = this.f19359l;
        if (!o0Var.f19514a0 && o0Var.f19537s.getThread().isAlive()) {
            o0Var.f19514a0 = true;
            h2.i iVar = new h2.i(o0Var.G);
            o0Var.f19530n.b(7, iVar).b();
            z10 = iVar.c(o0Var.L);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f19361m.e(10, new e9(24));
        }
        this.f19361m.d();
        this.f19355j.f13797a.removeCallbacksAndMessages(null);
        b3.d dVar = this.f19376u;
        m2.d dVar2 = this.f19372s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).f2897c.f5180b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.f2881b == dVar2) {
                cVar.f2882c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        g1 g1Var = this.f19367p0;
        if (g1Var.f19410p) {
            this.f19367p0 = g1Var.a();
        }
        g1 n1 = n1(this.f19367p0, 1);
        this.f19367p0 = n1;
        g1 c10 = n1.c(n1.f19398b);
        this.f19367p0 = c10;
        c10.f19411q = c10.f19413s;
        this.f19367p0.f19412r = 0L;
        m2.d dVar3 = this.f19372s;
        h2.i0 i0Var = dVar3.f20518n;
        i0Var.getClass();
        i0Var.d(new kg.i0(dVar3, 19));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f19347e0 = g2.c.d;
        this.f19354i0 = true;
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
            la.f(z11);
            e2.l1 l1Var = this.f19367p0.f19397a;
            if (!l1Var.p() && i7 >= l1Var.o()) {
                return;
            }
            m2.d dVar = this.f19372s;
            if (!dVar.f20519r) {
                m2.a Q = dVar.Q();
                dVar.f20519r = true;
                dVar.V(Q, -1, new kg.x1(Q, 12));
            }
            this.J++;
            if (p()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                l0 l0Var = new l0(this.f19367p0);
                l0Var.f(1);
                f0 f0Var = this.f19357k.f19575b;
                f0Var.f19355j.d(new ji.i(16, f0Var, l0Var));
                return;
            }
            g1 g1Var = this.f19367p0;
            int i10 = g1Var.f19400e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                g1Var = this.f19367p0.h(2);
            }
            int o02 = o0();
            g1 o12 = o1(g1Var, l1Var, p1(l1Var, i7, j3));
            this.f19359l.f19530n.b(3, new n0(l1Var, i7, h2.l0.S(j3))).b();
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
        g1 g1Var = this.f19367p0;
        if (g1Var.f19400e != 1) {
            return;
        }
        g1 f10 = g1Var.f(null);
        if (f10.f19397a.p()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        g1 n1 = n1(f10, i7);
        this.J++;
        this.f19359l.f19530n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long a0() {
        F1();
        return i1(this.f19367p0);
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
        la.f(z10);
        int min = Math.min(i7, this.f19366p.size());
        if (this.f19367p0.f19397a.p()) {
            if (this.f19369q0 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        D1(e1(this.f19367p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void c0() {
        F1();
        if (this.f19342b0 == 0.0f) {
            float f10 = this.f19344c0;
            if (f10 != 0.0f) {
                T(f10);
            }
        }
    }

    @Override
    public final long d0() {
        F1();
        if (p()) {
            g1 g1Var = this.f19367p0;
            if (g1Var.f19405k.equals(g1Var.f19398b)) {
                return h2.l0.h0(this.f19367p0.f19411q);
            }
            return getDuration();
        }
        return F0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.f19367p0.f19409o.equals(w0Var)) {
            return;
        }
        g1 g10 = this.f19367p0.g(w0Var);
        this.J++;
        this.f19359l.f19530n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final g1 e1(g1 g1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = g1Var.f19397a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f19366p;
            if (i10 < size) {
                e1 e1Var = new e1((x2.a) arrayList.get(i10), this.f19368q);
                arrayList2.add(e1Var);
                arrayList3.add(i10 + i7, new b0(e1Var.f19325b, e1Var.f19324a));
                i10++;
            } else {
                this.O = this.O.f(i7, arrayList2.size());
                l1 l1Var2 = new l1(arrayList3, this.O);
                g1 o12 = o1(g1Var, l1Var2, l1(l1Var, l1Var2, k1(g1Var), i1(g1Var)));
                x2.i1 i1Var = this.O;
                h2.i0 i0Var = this.f19359l.f19530n;
                j0 j0Var = new j0(arrayList2, i1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.f13793a = i0Var.f13797a.obtainMessage(18, i7, 0, j0Var);
                c10.b();
                return o12;
            }
        }
    }

    public final e2.o0 f1() {
        boolean z10;
        e2.l1 y02 = y0();
        if (y02.p()) {
            return this.f19365o0;
        }
        e2.l0 l0Var = y02.m(o0(), (e2.k1) this.f6424a, 0L).f10506c;
        e2.n0 a10 = this.f19365o0.a();
        e2.o0 o0Var = l0Var.d;
        if (o0Var != null) {
            h9.i0 i0Var = o0Var.K;
            byte[] bArr = o0Var.f10615k;
            CharSequence charSequence = o0Var.f10607a;
            if (charSequence != null) {
                a10.f10557a = charSequence;
            }
            CharSequence charSequence2 = o0Var.f10608b;
            if (charSequence2 != null) {
                a10.f10558b = charSequence2;
            }
            CharSequence charSequence3 = o0Var.f10609c;
            if (charSequence3 != null) {
                a10.f10559c = charSequence3;
            }
            CharSequence charSequence4 = o0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = o0Var.f10610e;
            if (charSequence5 != null) {
                a10.f10560e = charSequence5;
            }
            CharSequence charSequence6 = o0Var.f10611f;
            if (charSequence6 != null) {
                a10.f10561f = charSequence6;
            }
            CharSequence charSequence7 = o0Var.f10612g;
            if (charSequence7 != null) {
                a10.f10562g = charSequence7;
            }
            Long l10 = o0Var.h;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.f(z10);
                a10.h = l10;
            }
            e2.d1 d1Var = o0Var.f10613i;
            if (d1Var != null) {
                a10.f10563i = d1Var;
            }
            e2.d1 d1Var2 = o0Var.f10614j;
            if (d1Var2 != null) {
                a10.f10564j = d1Var2;
            }
            Uri uri = o0Var.f10618n;
            if (uri != null || bArr != null) {
                a10.f10568n = uri;
                a10.b(bArr, o0Var.f10617m);
                a10.f10566l = o0Var.f10616l;
            }
            Integer num = o0Var.f10619o;
            if (num != null) {
                a10.f10569o = num;
            }
            Integer num2 = o0Var.f10620p;
            if (num2 != null) {
                a10.f10570p = num2;
            }
            Integer num3 = o0Var.f10621q;
            if (num3 != null) {
                a10.f10571q = num3;
            }
            Boolean bool = o0Var.f10622r;
            if (bool != null) {
                a10.f10572r = bool;
            }
            Boolean bool2 = o0Var.f10623s;
            if (bool2 != null) {
                a10.f10573s = bool2;
            }
            Integer num4 = o0Var.f10624t;
            if (num4 != null) {
                a10.f10574t = num4;
            }
            Integer num5 = o0Var.f10625u;
            if (num5 != null) {
                a10.f10574t = num5;
            }
            Integer num6 = o0Var.v;
            if (num6 != null) {
                a10.f10575u = num6;
            }
            Integer num7 = o0Var.f10626w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = o0Var.f10627x;
            if (num8 != null) {
                a10.f10576w = num8;
            }
            Integer num9 = o0Var.f10628y;
            if (num9 != null) {
                a10.f10577x = num9;
            }
            Integer num10 = o0Var.f10629z;
            if (num10 != null) {
                a10.f10578y = num10;
            }
            CharSequence charSequence8 = o0Var.A;
            if (charSequence8 != null) {
                a10.f10579z = charSequence8;
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
        return this.f19367p0.f19402g;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f19370r.b((e2.l0) list.get(i7)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (p()) {
            g1 g1Var = this.f19367p0;
            x2.g0 g0Var = g1Var.f19398b;
            e2.l1 l1Var = g1Var.f19397a;
            Object obj = g0Var.f60129a;
            e2.i1 i1Var = this.f19364o;
            l1Var.g(obj, i1Var);
            return h2.l0.h0(i1Var.a(g0Var.f60130b, g0Var.f60131c));
        }
        return A();
    }

    @Override
    public final void h0(e2.a1 a1Var) {
        boolean z10;
        F1();
        a1Var.getClass();
        h2.r rVar = this.f19361m;
        if (rVar.f13845i) {
            if (Thread.currentThread() == rVar.f13839a) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h2.q qVar = (h2.q) it.next();
            if (qVar.f13836a.equals(a1Var)) {
                h2.p pVar = rVar.f13841c;
                qVar.d = true;
                if (pVar != null && qVar.f13838c) {
                    qVar.f13838c = false;
                    pVar.i(qVar.f13836a, qVar.f13837b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final j1 h1(i1 i1Var) {
        int k12 = k1(this.f19367p0);
        e2.l1 l1Var = this.f19367p0.f19397a;
        if (k12 == -1) {
            k12 = 0;
        }
        o0 o0Var = this.f19359l;
        return new j1(o0Var, i1Var, l1Var, k12, o0Var.f19537s);
    }

    @Override
    public final int i() {
        F1();
        return this.f19367p0.f19400e;
    }

    @Override
    public final void i0(int i7) {
        F1();
    }

    public final long i1(g1 g1Var) {
        x2.g0 g0Var = g1Var.f19398b;
        long j3 = g1Var.f19399c;
        e2.l1 l1Var = g1Var.f19397a;
        if (g0Var.b()) {
            Object obj = g1Var.f19398b.f60129a;
            e2.i1 i1Var = this.f19364o;
            l1Var.g(obj, i1Var);
            if (j3 == -9223372036854775807L) {
                return h2.l0.h0(l1Var.m(k1(g1Var), (e2.k1) this.f6424a, 0L).f10513l);
            }
            return h2.l0.h0(j3) + h2.l0.h0(i1Var.f10463e);
        }
        return h2.l0.h0(j1(g1Var));
    }

    @Override
    public final e2.w0 j() {
        F1();
        return this.f19367p0.f19409o;
    }

    @Override
    public final s1 j0() {
        F1();
        return this.f19367p0.f19403i.d;
    }

    public final long j1(g1 g1Var) {
        long j3;
        if (g1Var.f19397a.p()) {
            return h2.l0.S(this.f19371r0);
        }
        if (g1Var.f19410p) {
            j3 = g1Var.l();
        } else {
            j3 = g1Var.f19413s;
        }
        if (g1Var.f19398b.b()) {
            return j3;
        }
        e2.l1 l1Var = g1Var.f19397a;
        Object obj = g1Var.f19398b.f60129a;
        e2.i1 i1Var = this.f19364o;
        l1Var.g(obj, i1Var);
        return j3 + i1Var.f10463e;
    }

    @Override
    public final void k(int i7) {
        F1();
        if (this.H != i7) {
            this.H = i7;
            h2.i0 i0Var = this.f19359l.f19530n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13793a = i0Var.f13797a.obtainMessage(11, i7, 0);
            c10.b();
            t tVar = new t(i7, 0);
            h2.r rVar = this.f19361m;
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
        if (g1Var.f19397a.p()) {
            return this.f19369q0;
        }
        return g1Var.f19397a.g(g1Var.f19398b.f60129a, this.f19364o).f10462c;
    }

    @Override
    public final long l() {
        F1();
        return h2.l0.h0(j1(this.f19367p0));
    }

    @Override
    public final g2.c l0() {
        F1();
        return this.f19347e0;
    }

    public final Pair l1(e2.l1 l1Var, l1 l1Var2, int i7, long j3) {
        boolean z10;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        if (!l1Var.p() && !l1Var2.p()) {
            Pair i11 = l1Var.i((e2.k1) this.f6424a, this.f19364o, i7, h2.l0.S(j3));
            Object obj = i11.first;
            if (l1Var2.b(obj) != -1) {
                return i11;
            }
            int T = o0.T((e2.k1) this.f6424a, this.f19364o, this.H, this.I, obj, l1Var, l1Var2);
            if (T != -1) {
                e2.k1 k1Var = (e2.k1) this.f6424a;
                l1Var2.m(T, k1Var, 0L);
                return p1(l1Var2, T, h2.l0.h0(k1Var.f10513l));
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
            return this.f19367p0.f19398b.f60130b;
        }
        return -1;
    }

    @Override
    public final int o0() {
        F1();
        int k12 = k1(this.f19367p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final g1 o1(g1 g1Var, e2.l1 l1Var, Pair pair) {
        boolean z10;
        x2.g0 g0Var;
        r1 r1Var;
        a3.y yVar;
        List list;
        int i7;
        long j3;
        if (!l1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.f(z10);
        e2.l1 l1Var2 = g1Var.f19397a;
        long i12 = i1(g1Var);
        g1 j10 = g1Var.j(l1Var);
        if (l1Var.p()) {
            x2.g0 g0Var2 = g1.f19396u;
            long S = h2.l0.S(this.f19371r0);
            g1 c10 = j10.d(g0Var2, S, S, S, 0L, r1.d, this.f19341b, h9.t1.f14100e).c(g0Var2);
            c10.f19411q = c10.f19413s;
            return c10;
        }
        Object obj = j10.f19398b.f60129a;
        String str = h2.l0.f13812a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new x2.g0(pair.first);
        } else {
            g0Var = j10.f19398b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.l0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.f19364o).f10463e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.f19364o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.g0 g0Var3 = g0Var;
            la.p(!g0Var3.b());
            if (!equals) {
                r1Var = r1.d;
            } else {
                r1Var = j10.h;
            }
            r1 r1Var2 = r1Var;
            if (!equals) {
                yVar = this.f19341b;
            } else {
                yVar = j10.f19403i;
            }
            a3.y yVar2 = yVar;
            if (!equals) {
                h9.g0 g0Var4 = h9.i0.f14032b;
                list = h9.t1.f14100e;
            } else {
                list = j10.f19404j;
            }
            g1 c11 = j10.d(g0Var3, longValue, longValue, longValue, 0L, r1Var2, yVar2, list).c(g0Var3);
            c11.f19411q = longValue;
            return c11;
        } else if (i7 == 0) {
            int b10 = l1Var.b(j10.f19405k.f60129a);
            if (b10 != -1 && l1Var.f(b10, this.f19364o, false).f10462c == l1Var.g(g0Var.f60129a, this.f19364o).f10462c) {
                return j10;
            }
            l1Var.g(g0Var.f60129a, this.f19364o);
            if (g0Var.b()) {
                j3 = this.f19364o.a(g0Var.f60130b, g0Var.f60131c);
            } else {
                j3 = this.f19364o.d;
            }
            x2.g0 g0Var5 = g0Var;
            g1 c12 = j10.d(g0Var5, j10.f19413s, j10.f19413s, j10.d, j3 - j10.f19413s, j10.h, j10.f19403i, j10.f19404j).c(g0Var5);
            c12.f19411q = j3;
            return c12;
        } else {
            x2.g0 g0Var6 = g0Var;
            la.p(!g0Var6.b());
            long max = Math.max(0L, j10.f19412r - (longValue - S2));
            long j11 = j10.f19411q;
            if (j10.f19405k.equals(j10.f19398b)) {
                j11 = longValue + max;
            }
            g1 d = j10.d(g0Var6, longValue, longValue, longValue, max, j10.h, j10.f19403i, j10.f19404j);
            d.f19411q = j11;
            return d;
        }
    }

    @Override
    public final boolean p() {
        F1();
        return this.f19367p0.f19398b.b();
    }

    public final Pair p1(e2.l1 l1Var, int i7, long j3) {
        if (l1Var.p()) {
            this.f19369q0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f19371r0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= l1Var.o()) {
            i7 = l1Var.a(this.I);
            j3 = h2.l0.h0(l1Var.m(i7, (e2.k1) this.f6424a, 0L).f10513l);
        }
        return l1Var.i((e2.k1) this.f6424a, this.f19364o, i7, h2.l0.S(j3));
    }

    @Override
    public final void q0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.f19353i;
        xVar.getClass();
        e2.q1 E0 = E0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (!E0.equals(q1Var)) {
            this.f19361m.e(19, new kg.x1(q1Var, 6));
        }
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.f13866a && i10 == yVar.f13867b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        b61 b61Var = this.f19373s0;
        if (b61Var != null) {
            b61Var.execute(new jg.q(this, i7, i10, 1));
            return;
        }
        this.f19361m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override
    public final long r() {
        F1();
        return h2.l0.h0(this.f19367p0.f19412r);
    }

    @Override
    public final void r0(boolean z10) {
        F1();
    }

    public final g1 r1(g1 g1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(g1Var);
        long i12 = i1(g1Var);
        e2.l1 l1Var = g1Var.f19397a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.f19366p;
            if (i11 < i7) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i7, i10);
        l1 l1Var2 = new l1(arrayList, this.O);
        g1 o12 = o1(g1Var, l1Var2, l1(l1Var, l1Var2, k12, i12));
        int i13 = o12.f19400e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (o0.T((e2.k1) this.f6424a, this.f19364o, this.H, this.I, g1Var.f19398b.f60129a, l1Var, l1Var2) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.i1 i1Var = this.O;
        h2.i0 i0Var = this.f19359l.f19530n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f13793a = i0Var.f13797a.obtainMessage(20, i7, i10, i1Var);
        c10.b();
        return o12;
    }

    @Override
    public final void s0(List list, int i7, int i10) {
        boolean z10;
        x2.q1 q1Var;
        F1();
        boolean z11 = true;
        if (i7 >= 0 && i10 >= i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        ArrayList arrayList = this.f19366p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((b0) arrayList.get(i11)).f19292b.f60277k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.f19359l.f19530n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13793a = i0Var.f13797a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                b0 b0Var = (b0) arrayList.get(i12);
                e2.l1 l1Var = b0Var.f19293c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                if (l1Var instanceof x2.q1) {
                    q1Var = new x2.q1(((x2.q1) l1Var).f60257e, l0Var);
                } else {
                    q1Var = new x2.q1(l1Var, l0Var);
                }
                b0Var.f19293c = q1Var;
            }
            D1(this.f19367p0.j(new l1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f19367p0.f19397a.p()) {
            if (this.f19369q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        g1 r12 = r1(e1(this.f19367p0, min, g12), i7, min);
        D1(r12, 0, !r12.f19398b.f60129a.equals(this.f19367p0.f19398b.f60129a), 4, j1(r12), -1, false);
    }

    public final void s1() {
        TextureView textureView = this.X;
        z zVar = this.f19377w;
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
        this.f19347e0 = new g2.c(this.f19367p0.f19413s, h9.t1.f14100e);
    }

    @Override
    public final e2.y0 t() {
        F1();
        return this.P;
    }

    public final void t1(int i7, int i10, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f19350g) {
            if (i7 == -1 || bVar.f19281b == i7) {
                j1 h12 = h1(bVar);
                la.p(!h12.f19448f);
                h12.f19446c = i10;
                la.p(!h12.f19448f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.f19281b == i7)) {
                j1 h13 = h1(bVar2);
                la.p(!h13.f19448f);
                h13.f19446c = i10;
                la.p(!h13.f19448f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final boolean u() {
        F1();
        return this.f19367p0.f19406l;
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
        la.f(z10);
        ArrayList arrayList = this.f19366p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 < size && i7 != min && i7 != min2) {
            e2.l1 y02 = y0();
            this.J++;
            h2.l0.R(i7, min, min2, arrayList);
            this.O = this.O.g();
            l1 l1Var = new l1(arrayList, this.O);
            g1 g1Var = this.f19367p0;
            g1 o12 = o1(g1Var, l1Var, l1(y02, l1Var, k1(g1Var), i1(this.f19367p0)));
            x2.i1 i1Var = this.O;
            o0 o0Var = this.f19359l;
            o0Var.getClass();
            o0Var.f19530n.b(19, new k0(i7, min, min2, i1Var)).b();
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
        int k12 = k1(this.f19367p0);
        long l10 = l();
        this.J++;
        ArrayList arrayList = this.f19366p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e1 e1Var = new e1((x2.a) list.get(i11), this.f19368q);
            arrayList2.add(e1Var);
            arrayList.add(i11, new b0(e1Var.f19325b, e1Var.f19324a));
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
        g1 o12 = o1(this.f19367p0, l1Var, p1(l1Var, i10, j10));
        int i13 = o12.f19400e;
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
        this.f19359l.f19530n.b(17, new j0(arrayList2, this.O, i10, h2.l0.S(j10))).b();
        if (!this.f19367p0.f19398b.f60129a.equals(n1.f19398b.f60129a) && !this.f19367p0.f19397a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        D1(n1, 0, z11, 4, j1(n1), -1, false);
    }

    @Override
    public final int w0() {
        F1();
        return this.f19367p0.f19408n;
    }

    public final void w1(p1 p1Var) {
        F1();
        if (p1Var == null) {
            p1Var = p1.f19554f;
        }
        if (!this.N.equals(p1Var)) {
            this.N = p1Var;
            this.f19359l.f19530n.b(5, p1Var).b();
        }
    }

    @Override
    public final void x(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            h2.i0 i0Var = this.f19359l.f19530n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f13793a = i0Var.f13797a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            v vVar = new v(0, z10);
            h2.r rVar = this.f19361m;
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
        o0 o0Var = this.f19359l;
        if (!o0Var.f19514a0 && o0Var.f19537s.getThread().isAlive()) {
            h2.i iVar = new h2.i(o0Var.G);
            o0Var.f19530n.b(30, new Pair(surface, iVar)).b();
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
        return this.f19367p0.f19397a;
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
        return this.f19363n0;
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
        textureView.setSurfaceTextureListener(this.f19377w);
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
