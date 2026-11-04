package k2;

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
import b8.zb;
import d2.a2;
import d2.v1;
import ei.y8;
import gi.f6;
import ii.y3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.e51;
public final class i0 extends ci.u0 implements p {
    public final di.a A;
    public final long B;
    public final g2.d C;
    public final g2.f0 D;
    public final h0 E;
    public final p4.q F;
    public final p4.q G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final s1 M;
    public t1 N;
    public w2.i1 O;
    public d2.a1 P;
    public d2.q0 Q;
    public d2.q0 R;
    public d2.v S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public g2.z Z;
    public d2.f f16540a0;
    public final z2.t f16541b;
    public float f16542b0;
    public final d2.a1 f16543c;
    public float f16544c0;
    public final g2.j d;
    public boolean f16545d0;
    public final Context f16546e;
    public f2.c f16547e0;
    public final i0 f16548f;
    public final boolean f16549f0;
    public final b[] f16550g;
    public boolean f16551g0;
    public final b[] h;
    public final int f16552h0;
    public final z2.s f16553i;
    public boolean f16554i0;
    public final g2.j0 f16555j;
    public final d2.p f16556j0;
    public final w f16557k;
    public a2 f16558k0;
    public final r0 f16559l;
    public final long f16560l0;
    public final g2.s f16561m;
    public final long m0;
    public final CopyOnWriteArraySet f16562n;
    public final long f16563n0;
    public final d2.k1 f16564o;
    public d2.q0 f16565o0;
    public final ArrayList f16566p;
    public j1 f16567p0;
    public final boolean f16568q;
    public int f16569q0;
    public final w2.f0 f16570r;
    public long f16571r0;
    public final l2.f f16572s;
    public e51 f16573s0;
    public final Looper f16574t;
    public final ArrayList f16575t0;
    public final a3.d f16576u;
    public final g2.h0 v;
    public final c0 f16577w;
    public final d0 f16578x;
    public final b4.n f16579y;
    public final g2.q0 f16580z;

    static {
        d2.o0.a("media3.exoplayer");
    }

    public i0(k2.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: k2.i0.<init>(k2.n):void");
    }

    public static long m1(j1 j1Var) {
        d2.m1 m1Var = new d2.m1();
        d2.k1 k1Var = new d2.k1();
        j1Var.f16597a.g(j1Var.f16598b.f57081a, k1Var);
        long j10 = j1Var.f16599c;
        if (j10 == -9223372036854775807L) {
            return j1Var.f16597a.m(k1Var.f8163c, m1Var, 0L).f8217l;
        }
        return k1Var.f8164e + j10;
    }

    public static j1 n1(j1 j1Var, int i3) {
        j1 h = j1Var.h(i3);
        if (i3 != 1 && i3 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final void A0(d2.f fVar, boolean z10) {
        F1();
        if (this.f16554i0) {
            return;
        }
        boolean equals = Objects.equals(this.f16540a0, fVar);
        g2.s sVar = this.f16561m;
        if (!equals) {
            this.f16540a0 = fVar;
            t1(1, 3, fVar);
            sVar.c(20, new y8(fVar, 18));
        }
        d2.f fVar2 = this.f16540a0;
        g2.j0 j0Var = this.f16559l.f16705n;
        j0Var.getClass();
        g2.i0 c2 = g2.j0.c();
        c2.f11853a = j0Var.f11857a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c2.b();
        sVar.b();
    }

    public final void A1(l lVar) {
        j1 j1Var = this.f16567p0;
        j1 c2 = j1Var.c(j1Var.f16598b);
        c2.f16611q = c2.f16613s;
        c2.f16612r = 0L;
        j1 n12 = n1(c2, 1);
        if (lVar != null) {
            n12 = n12.f(lVar);
        }
        this.J++;
        this.f16559l.f16705n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int B() {
        F1();
        if (this.f16567p0.f16597a.p()) {
            int i3 = this.f16569q0;
            if (i3 == -1) {
                return 0;
            }
            return i3;
        }
        j1 j1Var = this.f16567p0;
        return j1Var.f16597a.b(j1Var.f16598b.f57081a);
    }

    @Override
    public final Looper B0() {
        return this.f16574t;
    }

    public final void B1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        d2.a1 a1Var = this.P;
        String str = g2.n0.f11873a;
        i0 i0Var = this.f16548f;
        boolean n4 = i0Var.n();
        boolean c02 = i0Var.c0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean s02 = i0Var.s0();
        boolean p10 = i0Var.y0().p();
        ?? obj = new Object();
        obj.f8525a = new ba.i();
        ba.i iVar = (ba.i) obj.f8525a;
        iVar.c(this.f16543c.f8026a);
        boolean z16 = !n4;
        obj.a(4, z16);
        boolean z17 = false;
        if (c02 && !n4) {
            z10 = true;
        } else {
            z10 = false;
        }
        obj.a(5, z10);
        if (T0 && !n4) {
            z11 = true;
        } else {
            z11 = false;
        }
        obj.a(6, z11);
        if (!p10 && ((T0 || !P0 || c02) && !n4)) {
            z12 = true;
        } else {
            z12 = false;
        }
        obj.a(7, z12);
        if (S0 && !n4) {
            z13 = true;
        } else {
            z13 = false;
        }
        obj.a(8, z13);
        if (!p10 && ((S0 || (P0 && s02)) && !n4)) {
            z14 = true;
        } else {
            z14 = false;
        }
        obj.a(9, z14);
        obj.a(10, z16);
        if (c02 && !n4) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (c02 && !n4) {
            z17 = true;
        }
        obj.a(12, z17);
        d2.a1 a1Var2 = new d2.a1(iVar.d());
        this.P = a1Var2;
        if (!a1Var2.equals(a1Var)) {
            this.f16561m.c(13, new w(this, 2));
        }
    }

    @Override
    public final a2 C() {
        F1();
        return this.f16558k0;
    }

    @Override
    public final void C0() {
        F1();
        if (this.f16542b0 != 0.0f) {
            R(0.0f);
        }
    }

    public final void C1(int i3, boolean z10) {
        int i10;
        j1 j1Var = this.f16567p0;
        int i11 = j1Var.f16608n;
        if (i11 == 1 && !z10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (j1Var.f16606l == z10 && i11 == i10 && j1Var.f16607m == i3) {
            return;
        }
        this.J++;
        if (j1Var.f16610p) {
            j1Var = j1Var.a();
        }
        j1 e10 = j1Var.e(i3, i10, z10);
        g2.j0 j0Var = this.f16559l.f16705n;
        j0Var.getClass();
        g2.i0 c2 = g2.j0.c();
        c2.f11853a = j0Var.f11857a.obtainMessage(1, z10 ? 1 : 0, i3 | (i10 << 4));
        c2.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void D0() {
        F1();
    }

    public final void D1(final j1 j1Var, int i3, boolean z10, int i10, long j10, int i11, boolean z11) {
        Pair pair;
        int i12;
        d2.n0 n0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        Object obj;
        d2.n0 n0Var2;
        Object obj2;
        long j11;
        long j12;
        long j13;
        long m1;
        Object obj3;
        d2.n0 n0Var3;
        Object obj4;
        long j14;
        j1 j1Var2 = this.f16567p0;
        this.f16567p0 = j1Var;
        boolean equals = j1Var2.f16597a.equals(j1Var.f16597a);
        d2.m1 m1Var = (d2.m1) this.f6076a;
        d2.k1 k1Var = this.f16564o;
        d2.n1 n1Var = j1Var2.f16597a;
        w2.g0 g0Var = j1Var2.f16598b;
        d2.n1 n1Var2 = j1Var.f16597a;
        w2.g0 g0Var2 = j1Var.f16598b;
        if (n1Var2.p() && n1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (n1Var2.p() != n1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!n1Var.m(n1Var.g(g0Var.f57081a, k1Var).f8163c, m1Var, 0L).f8208a.equals(n1Var2.m(n1Var2.g(g0Var2.f57081a, k1Var).f8163c, m1Var, 0L).f8208a)) {
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
            if (!j1Var.f16597a.p()) {
                n0Var = j1Var.f16597a.m(j1Var.f16597a.g(j1Var.f16598b.f57081a, this.f16564o).f8163c, (d2.m1) this.f6076a, 0L).f8210c;
            } else {
                n0Var = null;
            }
            this.f16565o0 = d2.q0.L;
        } else {
            n0Var = null;
        }
        if (booleanValue || !j1Var2.f16604j.equals(j1Var.f16604j)) {
            d2.p0 a10 = this.f16565o0.a();
            List list = j1Var.f16604j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                d2.s0 s0Var = (d2.s0) list.get(i15);
                int i16 = 0;
                while (true) {
                    d2.r0[] r0VarArr = s0Var.f8366a;
                    if (i16 < r0VarArr.length) {
                        r0VarArr[i16].a(a10);
                        i16++;
                    }
                }
            }
            this.f16565o0 = new d2.q0(a10);
        }
        d2.q0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (j1Var2.f16606l != j1Var.f16606l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (j1Var2.f16600e != j1Var.f16600e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (j1Var2.f16602g != j1Var.f16602g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f16561m.c(0, new q(j1Var, i3, 0));
        }
        if (z10) {
            d2.k1 k1Var2 = new d2.k1();
            if (!j1Var2.f16597a.p()) {
                Object obj5 = j1Var2.f16598b.f57081a;
                j1Var2.f16597a.g(obj5, k1Var2);
                int i17 = k1Var2.f8163c;
                int b10 = j1Var2.f16597a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = j1Var2.f16597a.m(i17, (d2.m1) this.f6076a, 0L).f8208a;
                n0Var2 = ((d2.m1) this.f6076a).f8210c;
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
                n0Var2 = null;
                obj2 = null;
            }
            if (i10 == 0) {
                if (j1Var2.f16598b.b()) {
                    w2.g0 g0Var3 = j1Var2.f16598b;
                    j13 = k1Var2.a(g0Var3.f57082b, g0Var3.f57083c);
                    m1 = m1(j1Var2);
                } else if (j1Var2.f16598b.f57084e != -1) {
                    j13 = m1(this.f16567p0);
                    m1 = j13;
                } else {
                    j11 = k1Var2.f8164e;
                    j12 = k1Var2.d;
                    j13 = j11 + j12;
                    m1 = j13;
                }
            } else if (j1Var2.f16598b.b()) {
                j13 = j1Var2.f16613s;
                m1 = m1(j1Var2);
            } else {
                j11 = k1Var2.f8164e;
                j12 = j1Var2.f16613s;
                j13 = j11 + j12;
                m1 = j13;
            }
            long h02 = g2.n0.h0(j13);
            long h03 = g2.n0.h0(m1);
            w2.g0 g0Var4 = j1Var2.f16598b;
            d2.d1 d1Var = new d2.d1(obj, i13, n0Var2, obj2, i14, h02, h03, g0Var4.f57082b, g0Var4.f57083c);
            d2.m1 m1Var2 = (d2.m1) this.f6076a;
            int l02 = l0();
            int B = B();
            if (!this.f16567p0.f16597a.p()) {
                j1 j1Var3 = this.f16567p0;
                Object obj6 = j1Var3.f16598b.f57081a;
                j1Var3.f16597a.g(obj6, this.f16564o);
                B = this.f16567p0.f16597a.b(obj6);
                Object obj7 = this.f16567p0.f16597a.m(l02, m1Var2, 0L).f8208a;
                n0Var3 = m1Var2.f8210c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                n0Var3 = null;
                obj4 = null;
            }
            int i18 = B;
            long h04 = g2.n0.h0(j10);
            if (this.f16567p0.f16598b.b()) {
                j14 = g2.n0.h0(m1(this.f16567p0));
            } else {
                j14 = h04;
            }
            w2.g0 g0Var5 = this.f16567p0.f16598b;
            this.f16561m.c(11, new y(i10, d1Var, new d2.d1(obj3, l02, n0Var3, obj4, i18, h04, j14, g0Var5.f57082b, g0Var5.f57083c), 0));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f16561m.c(1, new q(n0Var, intValue, 1));
        }
        if (j1Var2.f16601f != j1Var.f16601f) {
            this.f16561m.c(10, new g2.p() {
                @Override
                public final void invoke(Object obj8) {
                    d2.c1 c1Var = (d2.c1) obj8;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
            if (j1Var.f16601f != null) {
                this.f16561m.c(10, new g2.p() {
                    @Override
                    public final void invoke(Object obj8) {
                        d2.c1 c1Var = (d2.c1) obj8;
                        switch (r2) {
                            case 0:
                                j1 j1Var4 = j1Var;
                                c1Var.h(j1Var4.f16602g);
                                c1Var.p(j1Var4.f16602g);
                                return;
                            case 1:
                                j1 j1Var5 = j1Var;
                                c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                                return;
                            case 2:
                                c1Var.w(j1Var.f16600e);
                                return;
                            case 3:
                                j1 j1Var6 = j1Var;
                                c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                                return;
                            case 4:
                                c1Var.g(j1Var.f16608n);
                                return;
                            case 5:
                                c1Var.P(j1Var.m());
                                return;
                            case 6:
                                c1Var.H(j1Var.f16609o);
                                return;
                            case 7:
                                c1Var.l(j1Var.f16601f);
                                return;
                            case 8:
                                c1Var.o(j1Var.f16601f);
                                return;
                            default:
                                c1Var.v(j1Var.f16603i.d);
                                return;
                        }
                    }
                });
            }
        }
        z2.t tVar = j1Var2.f16603i;
        z2.t tVar2 = j1Var.f16603i;
        if (tVar != tVar2) {
            z2.s sVar = this.f16553i;
            Object obj8 = tVar2.f59649e;
            sVar.getClass();
            sVar.f59645c = (z2.r) obj8;
            this.f16561m.c(2, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f16561m.c(14, new r(this.Q));
        }
        if (z14) {
            this.f16561m.c(3, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f16561m.c(-1, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f16561m.c(4, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || j1Var2.f16607m != j1Var.f16607m) {
            this.f16561m.c(5, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (j1Var2.f16608n != j1Var.f16608n) {
            this.f16561m.c(6, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (j1Var2.m() != j1Var.m()) {
            this.f16561m.c(7, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        if (!j1Var2.f16609o.equals(j1Var.f16609o)) {
            this.f16561m.c(12, new g2.p() {
                @Override
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (r2) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.f16602g);
                            c1Var.p(j1Var4.f16602g);
                            return;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.f16600e, j1Var5.f16606l);
                            return;
                        case 2:
                            c1Var.w(j1Var.f16600e);
                            return;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.f16607m, j1Var6.f16606l);
                            return;
                        case 4:
                            c1Var.g(j1Var.f16608n);
                            return;
                        case 5:
                            c1Var.P(j1Var.m());
                            return;
                        case 6:
                            c1Var.H(j1Var.f16609o);
                            return;
                        case 7:
                            c1Var.l(j1Var.f16601f);
                            return;
                        case 8:
                            c1Var.o(j1Var.f16601f);
                            return;
                        default:
                            c1Var.v(j1Var.f16603i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f16561m.b();
        if (j1Var2.f16610p != j1Var.f16610p) {
            Iterator it = this.f16562n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f16459a.E1();
            }
        }
    }

    @Override
    public final float E() {
        F1();
        return this.f16542b0;
    }

    @Override
    public final boolean E0() {
        F1();
        return this.I;
    }

    public final void E1() {
        int h = h();
        di.a aVar = this.A;
        g2.q0 q0Var = this.f16580z;
        boolean z10 = false;
        if (h != 1) {
            if (h != 2 && h != 3) {
                if (h != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f16567p0.f16610p;
                if (u() && !z11) {
                    z10 = true;
                }
                q0Var.c(z10);
                aVar.a(u());
                return;
            }
        }
        q0Var.c(false);
        aVar.a(false);
    }

    @Override
    public final d2.s1 F0() {
        F1();
        return ((z2.n) this.f16553i).j();
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f16574t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = g2.n0.f11873a;
            Locale locale = Locale.US;
            String q10 = org.telegram.ui.Cells.f1.q("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f16549f0) {
                if (this.f16551g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                g2.a.m("ExoPlayerImpl", q10, illegalStateException);
                this.f16551g0 = true;
                return;
            }
            throw new IllegalStateException(q10);
        }
    }

    @Override
    public final d2.f G() {
        F1();
        return this.f16540a0;
    }

    @Override
    public final long G0() {
        F1();
        if (this.f16567p0.f16597a.p()) {
            return this.f16571r0;
        }
        j1 j1Var = this.f16567p0;
        long j10 = 0;
        if (j1Var.f16605k.d != j1Var.f16598b.d) {
            return g2.n0.h0(j1Var.f16597a.m(l0(), (d2.m1) this.f6076a, 0L).f8218m);
        }
        long j11 = j1Var.f16611q;
        if (this.f16567p0.f16605k.b()) {
            j1 j1Var2 = this.f16567p0;
            j1Var2.f16597a.g(j1Var2.f16605k.f57081a, this.f16564o).d(this.f16567p0.f16605k.f57082b);
        } else {
            j10 = j11;
        }
        j1 j1Var3 = this.f16567p0;
        d2.n1 n1Var = j1Var3.f16597a;
        Object obj = j1Var3.f16605k.f57081a;
        d2.k1 k1Var = this.f16564o;
        n1Var.g(obj, k1Var);
        return g2.n0.h0(j10 + k1Var.f8164e);
    }

    @Override
    public final void H(int i3, boolean z10) {
        F1();
    }

    @Override
    public final void H0(int i3) {
        F1();
    }

    @Override
    public final d2.p I() {
        F1();
        return this.f16556j0;
    }

    @Override
    public final void J() {
        F1();
    }

    @Override
    public final void K(int i3, int i10) {
        F1();
    }

    @Override
    public final void L(int i3) {
        F1();
    }

    @Override
    public final d2.q0 L0() {
        F1();
        return this.Q;
    }

    @Override
    public final int M() {
        F1();
        if (n()) {
            return this.f16567p0.f16598b.f57083c;
        }
        return -1;
    }

    @Override
    public final void M0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override
    public final long N0() {
        F1();
        return g2.n0.h0(j1(this.f16567p0));
    }

    @Override
    public final long O0() {
        F1();
        return this.f16560l0;
    }

    @Override
    public final void P(int i3, int i10) {
        boolean z10;
        F1();
        if (i3 >= 0 && i10 >= i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int size = this.f16566p.size();
        int min = Math.min(i10, size);
        if (i3 < size && i3 != min) {
            j1 r12 = r1(this.f16567p0, i3, min);
            D1(r12, 0, !r12.f16598b.f57081a.equals(this.f16567p0.f16598b.f57081a), 4, j1(r12), -1, false);
        }
    }

    @Override
    public final void Q(SurfaceHolder surfaceHolder) {
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
        surfaceHolder.addCallback(this.f16577w);
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
    public final void R(float f10) {
        F1();
        float h = g2.n0.h(f10, 0.0f, 1.0f);
        float f11 = this.f16542b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.f16544c0 = f11;
        this.f16542b0 = h;
        this.f16559l.f16705n.b(32, Float.valueOf(h)).b();
        this.f16561m.e(22, new t(h, 0));
    }

    @Override
    public final void T(List list, int i3, long j10) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i3, j10, g12, false);
    }

    @Override
    public final d2.x0 U() {
        F1();
        return this.f16567p0.f16601f;
    }

    @Override
    public final void V(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final long X() {
        F1();
        return this.m0;
    }

    @Override
    public final void X0() {
        boolean z10;
        g2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.f11873a + "] [" + d2.o0.b() + "]");
        F1();
        this.f16579y.A();
        this.f16580z.c(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        g2.f0 f0Var = this.D;
        ((g2.j0) f0Var.f11837f).f11857a.removeCallbacksAndMessages(null);
        ((i0) f0Var.f11833a).s((g2.a0) f0Var.f11834b);
        r0 r0Var = this.f16559l;
        if (!r0Var.f16689a0 && r0Var.f16712s.getThread().isAlive()) {
            r0Var.f16689a0 = true;
            g2.j jVar = new g2.j(r0Var.G);
            r0Var.f16705n.b(7, jVar).b();
            z10 = jVar.c(r0Var.L);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f16561m.e(10, new y3(7));
        }
        this.f16561m.d();
        this.f16555j.f11857a.removeCallbacksAndMessages(null);
        a3.d dVar = this.f16576u;
        l2.f fVar = this.f16572s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((a3.g) dVar).f78c.f3211b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a3.c cVar = (a3.c) it.next();
            if (cVar.f62b == fVar) {
                cVar.f63c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        j1 j1Var = this.f16567p0;
        if (j1Var.f16610p) {
            this.f16567p0 = j1Var.a();
        }
        j1 n12 = n1(this.f16567p0, 1);
        this.f16567p0 = n12;
        j1 c2 = n12.c(n12.f16598b);
        this.f16567p0 = c2;
        c2.f16611q = c2.f16613s;
        this.f16567p0.f16612r = 0L;
        l2.f fVar2 = this.f16572s;
        g2.j0 j0Var = fVar2.f17699n;
        j0Var.getClass();
        j0Var.d(new f6(fVar2, 28));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f16547e0 = f2.c.d;
        this.f16554i0 = true;
    }

    @Override
    public final long Y() {
        F1();
        return i1(this.f16567p0);
    }

    @Override
    public final void Y0(int i3, long j10, boolean z10) {
        boolean z11;
        F1();
        if (i3 != -1) {
            if (i3 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zb.f(z11);
            d2.n1 n1Var = this.f16567p0.f16597a;
            if (!n1Var.p() && i3 >= n1Var.o()) {
                return;
            }
            l2.f fVar = this.f16572s;
            if (!fVar.f17700r) {
                l2.a Q = fVar.Q();
                fVar.f17700r = true;
                fVar.V(Q, -1, new y8(Q, 25));
            }
            this.J++;
            if (n()) {
                g2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.f16567p0);
                o0Var.f(1);
                i0 i0Var = this.f16557k.f16757b;
                i0Var.f16555j.d(new ii.e(10, i0Var, o0Var));
                return;
            }
            j1 j1Var = this.f16567p0;
            int i10 = j1Var.f16600e;
            if (i10 == 3 || (i10 == 4 && !n1Var.p())) {
                j1Var = this.f16567p0.h(2);
            }
            int l02 = l0();
            j1 o12 = o1(j1Var, n1Var, p1(n1Var, i3, j10));
            this.f16559l.f16705n.b(3, new q0(n1Var, i3, g2.n0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), l02, z10);
        }
    }

    @Override
    public final void Z(int i3, List list) {
        boolean z10;
        boolean z11;
        F1();
        ArrayList g12 = g1(list);
        F1();
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int min = Math.min(i3, this.f16566p.size());
        if (this.f16567p0.f16597a.p()) {
            if (this.f16569q0 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        D1(e1(this.f16567p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void a() {
        int i3;
        F1();
        j1 j1Var = this.f16567p0;
        if (j1Var.f16600e != 1) {
            return;
        }
        j1 f10 = j1Var.f(null);
        if (f10.f16597a.p()) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        j1 n12 = n1(f10, i3);
        this.J++;
        this.f16559l.f16705n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void a0() {
        F1();
        if (this.f16542b0 == 0.0f) {
            float f10 = this.f16544c0;
            if (f10 != 0.0f) {
                R(f10);
            }
        }
    }

    @Override
    public final long b0() {
        F1();
        if (n()) {
            j1 j1Var = this.f16567p0;
            if (j1Var.f16605k.equals(j1Var.f16598b)) {
                return g2.n0.h0(this.f16567p0.f16611q);
            }
            return getDuration();
        }
        return G0();
    }

    @Override
    public final void c(d2.y0 y0Var) {
        F1();
        if (this.f16567p0.f16609o.equals(y0Var)) {
            return;
        }
        j1 g7 = this.f16567p0.g(y0Var);
        this.J++;
        this.f16559l.f16705n.b(4, y0Var).b();
        D1(g7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final boolean d() {
        F1();
        return this.f16567p0.f16602g;
    }

    @Override
    public final void e0(int i3) {
        F1();
    }

    public final j1 e1(j1 j1Var, int i3, ArrayList arrayList) {
        d2.n1 n1Var = j1Var.f16597a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f16566p;
            if (i10 < size) {
                h1 h1Var = new h1((w2.a) arrayList.get(i10), this.f16568q);
                arrayList2.add(h1Var);
                arrayList3.add(i10 + i3, new e0(h1Var.f16532b, h1Var.f16531a));
                i10++;
            } else {
                this.O = this.O.f(i3, arrayList2.size());
                o1 o1Var = new o1(arrayList3, this.O);
                j1 o12 = o1(j1Var, o1Var, l1(n1Var, o1Var, k1(j1Var), i1(j1Var)));
                w2.i1 i1Var = this.O;
                g2.j0 j0Var = this.f16559l.f16705n;
                m0 m0Var = new m0(arrayList2, i1Var, -1, -9223372036854775807L);
                j0Var.getClass();
                g2.i0 c2 = g2.j0.c();
                c2.f11853a = j0Var.f11857a.obtainMessage(18, i3, 0, m0Var);
                c2.b();
                return o12;
            }
        }
    }

    @Override
    public final v1 f0() {
        F1();
        return this.f16567p0.f16603i.d;
    }

    public final d2.q0 f1() {
        boolean z10;
        d2.n1 y02 = y0();
        if (y02.p()) {
            return this.f16565o0;
        }
        d2.n0 n0Var = y02.m(l0(), (d2.m1) this.f6076a, 0L).f8210c;
        d2.p0 a10 = this.f16565o0.a();
        d2.q0 q0Var = n0Var.d;
        if (q0Var != null) {
            g9.i0 i0Var = q0Var.K;
            byte[] bArr = q0Var.f8315k;
            CharSequence charSequence = q0Var.f8307a;
            if (charSequence != null) {
                a10.f8260a = charSequence;
            }
            CharSequence charSequence2 = q0Var.f8308b;
            if (charSequence2 != null) {
                a10.f8261b = charSequence2;
            }
            CharSequence charSequence3 = q0Var.f8309c;
            if (charSequence3 != null) {
                a10.f8262c = charSequence3;
            }
            CharSequence charSequence4 = q0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = q0Var.f8310e;
            if (charSequence5 != null) {
                a10.f8263e = charSequence5;
            }
            CharSequence charSequence6 = q0Var.f8311f;
            if (charSequence6 != null) {
                a10.f8264f = charSequence6;
            }
            CharSequence charSequence7 = q0Var.f8312g;
            if (charSequence7 != null) {
                a10.f8265g = charSequence7;
            }
            Long l10 = q0Var.h;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.f(z10);
                a10.h = l10;
            }
            d2.f1 f1Var = q0Var.f8313i;
            if (f1Var != null) {
                a10.f8266i = f1Var;
            }
            d2.f1 f1Var2 = q0Var.f8314j;
            if (f1Var2 != null) {
                a10.f8267j = f1Var2;
            }
            Uri uri = q0Var.f8318n;
            if (uri != null || bArr != null) {
                a10.f8271n = uri;
                a10.b(bArr, q0Var.f8317m);
                a10.f8269l = q0Var.f8316l;
            }
            Integer num = q0Var.f8319o;
            if (num != null) {
                a10.f8272o = num;
            }
            Integer num2 = q0Var.f8320p;
            if (num2 != null) {
                a10.f8273p = num2;
            }
            Integer num3 = q0Var.f8321q;
            if (num3 != null) {
                a10.f8274q = num3;
            }
            Boolean bool = q0Var.f8322r;
            if (bool != null) {
                a10.f8275r = bool;
            }
            Boolean bool2 = q0Var.f8323s;
            if (bool2 != null) {
                a10.f8276s = bool2;
            }
            Integer num4 = q0Var.f8324t;
            if (num4 != null) {
                a10.f8277t = num4;
            }
            Integer num5 = q0Var.f8325u;
            if (num5 != null) {
                a10.f8277t = num5;
            }
            Integer num6 = q0Var.v;
            if (num6 != null) {
                a10.f8278u = num6;
            }
            Integer num7 = q0Var.f8326w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = q0Var.f8327x;
            if (num8 != null) {
                a10.f8279w = num8;
            }
            Integer num9 = q0Var.f8328y;
            if (num9 != null) {
                a10.f8280x = num9;
            }
            Integer num10 = q0Var.f8329z;
            if (num10 != null) {
                a10.f8281y = num10;
            }
            CharSequence charSequence8 = q0Var.A;
            if (charSequence8 != null) {
                a10.f8282z = charSequence8;
            }
            CharSequence charSequence9 = q0Var.B;
            if (charSequence9 != null) {
                a10.A = charSequence9;
            }
            CharSequence charSequence10 = q0Var.C;
            if (charSequence10 != null) {
                a10.B = charSequence10;
            }
            Integer num11 = q0Var.D;
            if (num11 != null) {
                a10.C = num11;
            }
            Integer num12 = q0Var.E;
            if (num12 != null) {
                a10.D = num12;
            }
            CharSequence charSequence11 = q0Var.F;
            if (charSequence11 != null) {
                a10.E = charSequence11;
            }
            CharSequence charSequence12 = q0Var.G;
            if (charSequence12 != null) {
                a10.F = charSequence12;
            }
            CharSequence charSequence13 = q0Var.H;
            if (charSequence13 != null) {
                a10.G = charSequence13;
            }
            Integer num13 = q0Var.I;
            if (num13 != null) {
                a10.H = num13;
            }
            Bundle bundle = q0Var.J;
            if (bundle != null) {
                a10.I = bundle;
            }
            if (!i0Var.isEmpty()) {
                a10.J = g9.i0.q(i0Var);
            }
        }
        return new d2.q0(a10);
    }

    @Override
    public final d2.y0 g() {
        F1();
        return this.f16567p0.f16609o;
    }

    @Override
    public final void g0(d2.s1 s1Var) {
        F1();
        z2.s sVar = this.f16553i;
        sVar.getClass();
        d2.s1 F0 = F0();
        if (!s1Var.equals(((z2.n) sVar).j())) {
            sVar.b(s1Var);
        }
        if (!F0.equals(s1Var)) {
            this.f16561m.e(19, new y8(s1Var, 19));
        }
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(this.f16570r.c((d2.n0) list.get(i3)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (n()) {
            j1 j1Var = this.f16567p0;
            w2.g0 g0Var = j1Var.f16598b;
            d2.n1 n1Var = j1Var.f16597a;
            Object obj = g0Var.f57081a;
            d2.k1 k1Var = this.f16564o;
            n1Var.g(obj, k1Var);
            return g2.n0.h0(k1Var.a(g0Var.f57082b, g0Var.f57083c));
        }
        return A();
    }

    @Override
    public final int h() {
        F1();
        return this.f16567p0.f16600e;
    }

    @Override
    public final d2.q0 h0() {
        F1();
        return this.R;
    }

    public final m1 h1(l1 l1Var) {
        int k1 = k1(this.f16567p0);
        d2.n1 n1Var = this.f16567p0.f16597a;
        if (k1 == -1) {
            k1 = 0;
        }
        r0 r0Var = this.f16559l;
        return new m1(r0Var, l1Var, n1Var, k1, r0Var.f16712s);
    }

    @Override
    public final int i() {
        F1();
        return 0;
    }

    public final long i1(j1 j1Var) {
        w2.g0 g0Var = j1Var.f16598b;
        long j10 = j1Var.f16599c;
        d2.n1 n1Var = j1Var.f16597a;
        if (g0Var.b()) {
            Object obj = j1Var.f16598b.f57081a;
            d2.k1 k1Var = this.f16564o;
            n1Var.g(obj, k1Var);
            if (j10 == -9223372036854775807L) {
                return g2.n0.h0(n1Var.m(k1(j1Var), (d2.m1) this.f6076a, 0L).f8217l);
            }
            return g2.n0.h0(j10) + g2.n0.h0(k1Var.f8164e);
        }
        return g2.n0.h0(j1(j1Var));
    }

    @Override
    public final f2.c j0() {
        F1();
        return this.f16547e0;
    }

    public final long j1(j1 j1Var) {
        long j10;
        if (j1Var.f16597a.p()) {
            return g2.n0.S(this.f16571r0);
        }
        if (j1Var.f16610p) {
            j10 = j1Var.l();
        } else {
            j10 = j1Var.f16613s;
        }
        if (j1Var.f16598b.b()) {
            return j10;
        }
        d2.n1 n1Var = j1Var.f16597a;
        Object obj = j1Var.f16598b.f57081a;
        d2.k1 k1Var = this.f16564o;
        n1Var.g(obj, k1Var);
        return j10 + k1Var.f8164e;
    }

    @Override
    public final void k(int i3) {
        F1();
        if (this.H != i3) {
            this.H = i3;
            g2.j0 j0Var = this.f16559l.f16705n;
            j0Var.getClass();
            g2.i0 c2 = g2.j0.c();
            c2.f11853a = j0Var.f11857a.obtainMessage(11, i3, 0);
            c2.b();
            v vVar = new v(i3, 0);
            g2.s sVar = this.f16561m;
            sVar.c(8, vVar);
            B1();
            sVar.b();
        }
    }

    @Override
    public final int k0() {
        F1();
        if (n()) {
            return this.f16567p0.f16598b.f57082b;
        }
        return -1;
    }

    public final int k1(j1 j1Var) {
        if (j1Var.f16597a.p()) {
            return this.f16569q0;
        }
        return j1Var.f16597a.g(j1Var.f16598b.f57081a, this.f16564o).f8163c;
    }

    @Override
    public final void l(d2.q0 q0Var) {
        F1();
        q0Var.getClass();
        if (q0Var.equals(this.R)) {
            return;
        }
        this.R = q0Var;
        this.f16561m.e(15, new w(this, 3));
    }

    @Override
    public final int l0() {
        F1();
        int k1 = k1(this.f16567p0);
        if (k1 == -1) {
            return 0;
        }
        return k1;
    }

    public final Pair l1(d2.n1 n1Var, o1 o1Var, int i3, long j10) {
        boolean z10;
        long j11 = -9223372036854775807L;
        int i10 = -1;
        if (!n1Var.p() && !o1Var.p()) {
            Pair i11 = n1Var.i((d2.m1) this.f6076a, this.f16564o, i3, g2.n0.S(j10));
            Object obj = i11.first;
            if (o1Var.b(obj) != -1) {
                return i11;
            }
            int U = r0.U((d2.m1) this.f6076a, this.f16564o, this.H, this.I, obj, n1Var, o1Var);
            if (U != -1) {
                d2.m1 m1Var = (d2.m1) this.f6076a;
                o1Var.m(U, m1Var, 0L);
                return p1(o1Var, U, g2.n0.h0(m1Var.f8217l));
            }
            return p1(o1Var, -1, -9223372036854775807L);
        }
        if (!n1Var.p() && o1Var.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = i3;
        }
        if (!z10) {
            j11 = j10;
        }
        return p1(o1Var, i10, j11);
    }

    @Override
    public final int m() {
        F1();
        return this.H;
    }

    @Override
    public final boolean n() {
        F1();
        return this.f16567p0.f16598b.b();
    }

    @Override
    public final void o0(boolean z10) {
        F1();
    }

    public final j1 o1(j1 j1Var, d2.n1 n1Var, Pair pair) {
        boolean z10;
        w2.g0 g0Var;
        w2.r1 r1Var;
        z2.t tVar;
        List list;
        int i3;
        long j10;
        if (!n1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.f(z10);
        d2.n1 n1Var2 = j1Var.f16597a;
        long i12 = i1(j1Var);
        j1 j11 = j1Var.j(n1Var);
        if (n1Var.p()) {
            w2.g0 g0Var2 = j1.f16596u;
            long S = g2.n0.S(this.f16571r0);
            j1 c2 = j11.d(g0Var2, S, S, S, 0L, w2.r1.d, this.f16541b, g9.s1.f12146e).c(g0Var2);
            c2.f16611q = c2.f16613s;
            return c2;
        }
        Object obj = j11.f16598b.f57081a;
        String str = g2.n0.f11873a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new w2.g0(pair.first);
        } else {
            g0Var = j11.f16598b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = g2.n0.S(i12);
        if (!n1Var2.p()) {
            S2 -= n1Var2.g(obj, this.f16564o).f8164e;
            if (equals && S2 - longValue == 1 && S2 == n1Var2.g(obj, this.f16564o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            w2.g0 g0Var3 = g0Var;
            zb.p(!g0Var3.b());
            if (!equals) {
                r1Var = w2.r1.d;
            } else {
                r1Var = j11.h;
            }
            w2.r1 r1Var2 = r1Var;
            if (!equals) {
                tVar = this.f16541b;
            } else {
                tVar = j11.f16603i;
            }
            z2.t tVar2 = tVar;
            if (!equals) {
                g9.g0 g0Var4 = g9.i0.f12083b;
                list = g9.s1.f12146e;
            } else {
                list = j11.f16604j;
            }
            j1 c10 = j11.d(g0Var3, longValue, longValue, longValue, 0L, r1Var2, tVar2, list).c(g0Var3);
            c10.f16611q = longValue;
            return c10;
        } else if (i3 == 0) {
            int b10 = n1Var.b(j11.f16605k.f57081a);
            if (b10 != -1 && n1Var.f(b10, this.f16564o, false).f8163c == n1Var.g(g0Var.f57081a, this.f16564o).f8163c) {
                return j11;
            }
            n1Var.g(g0Var.f57081a, this.f16564o);
            if (g0Var.b()) {
                j10 = this.f16564o.a(g0Var.f57082b, g0Var.f57083c);
            } else {
                j10 = this.f16564o.d;
            }
            w2.g0 g0Var5 = g0Var;
            j1 c11 = j11.d(g0Var5, j11.f16613s, j11.f16613s, j11.d, j10 - j11.f16613s, j11.h, j11.f16603i, j11.f16604j).c(g0Var5);
            c11.f16611q = j10;
            return c11;
        } else {
            w2.g0 g0Var6 = g0Var;
            zb.p(!g0Var6.b());
            long max = Math.max(0L, j11.f16612r - (longValue - S2));
            long j12 = j11.f16611q;
            if (j11.f16605k.equals(j11.f16598b)) {
                j12 = longValue + max;
            }
            j1 d = j11.d(g0Var6, longValue, longValue, longValue, max, j11.h, j11.f16603i, j11.f16604j);
            d.f16611q = j12;
            return d;
        }
    }

    @Override
    public final void p0(List list, int i3, int i10) {
        boolean z10;
        w2.q1 q1Var;
        F1();
        boolean z11 = true;
        if (i3 >= 0 && i10 >= i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        ArrayList arrayList = this.f16566p;
        int size = arrayList.size();
        if (i3 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i3 == list.size()) {
            for (int i11 = i3; i11 < min; i11++) {
                if (((e0) arrayList.get(i11)).f16484b.f57229k.a((d2.n0) list.get(i11 - i3))) {
                }
            }
            this.J++;
            g2.j0 j0Var = this.f16559l.f16705n;
            j0Var.getClass();
            g2.i0 c2 = g2.j0.c();
            c2.f11853a = j0Var.f11857a.obtainMessage(27, i3, min, list);
            c2.b();
            for (int i12 = i3; i12 < min; i12++) {
                e0 e0Var = (e0) arrayList.get(i12);
                d2.n1 n1Var = e0Var.f16485c;
                d2.n0 n0Var = (d2.n0) list.get(i12 - i3);
                if (n1Var instanceof w2.q1) {
                    q1Var = new w2.q1(((w2.q1) n1Var).f57209e, n0Var);
                } else {
                    q1Var = new w2.q1(n1Var, n0Var);
                }
                e0Var.f16485c = q1Var;
            }
            D1(this.f16567p0.j(new o1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f16567p0.f16597a.p()) {
            if (this.f16569q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        j1 r12 = r1(e1(this.f16567p0, min, g12), i3, min);
        D1(r12, 0, !r12.f16598b.f57081a.equals(this.f16567p0.f16598b.f57081a), 4, j1(r12), -1, false);
    }

    public final Pair p1(d2.n1 n1Var, int i3, long j10) {
        if (n1Var.p()) {
            this.f16569q0 = i3;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f16571r0 = j10;
            return null;
        }
        if (i3 == -1 || i3 >= n1Var.o()) {
            i3 = n1Var.a(this.I);
            j10 = g2.n0.h0(n1Var.m(i3, (d2.m1) this.f6076a, 0L).f8217l);
        }
        return n1Var.i((d2.m1) this.f6076a, this.f16564o, i3, g2.n0.S(j10));
    }

    @Override
    public final long q() {
        F1();
        return g2.n0.h0(this.f16567p0.f16612r);
    }

    public final void q1(int i3, int i10) {
        g2.z zVar = this.Z;
        if (i3 == zVar.f11927a && i10 == zVar.f11928b) {
            return;
        }
        this.Z = new g2.z(i3, i10);
        e51 e51Var = this.f16573s0;
        if (e51Var != null) {
            e51Var.execute(new u(this, i3, i10, 0));
            return;
        }
        this.f16561m.e(24, new hh.c(i3, i10, 1));
        t1(2, 14, new g2.z(i3, i10));
    }

    @Override
    public final void r0(int i3, int i10, int i11) {
        boolean z10;
        F1();
        if (i3 >= 0 && i3 <= i10 && i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        ArrayList arrayList = this.f16566p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i3));
        if (i3 < size && i3 != min && i3 != min2) {
            d2.n1 y02 = y0();
            this.J++;
            g2.n0.R(i3, min, min2, arrayList);
            this.O = this.O.g();
            o1 o1Var = new o1(arrayList, this.O);
            j1 j1Var = this.f16567p0;
            j1 o12 = o1(j1Var, o1Var, l1(y02, o1Var, k1(j1Var), i1(this.f16567p0)));
            w2.i1 i1Var = this.O;
            r0 r0Var = this.f16559l;
            r0Var.getClass();
            r0Var.f16705n.b(19, new n0(i3, min, min2, i1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final j1 r1(j1 j1Var, int i3, int i10) {
        ArrayList arrayList;
        int k1 = k1(j1Var);
        long i12 = i1(j1Var);
        d2.n1 n1Var = j1Var.f16597a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.f16566p;
            if (i11 < i3) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i3, i10);
        o1 o1Var = new o1(arrayList, this.O);
        j1 o12 = o1(j1Var, o1Var, l1(n1Var, o1Var, k1, i12));
        int i13 = o12.f16600e;
        if (i13 != 1 && i13 != 4 && k1 >= i3 && k1 < i10) {
            if (r0.U((d2.m1) this.f6076a, this.f16564o, this.H, this.I, j1Var.f16598b.f57081a, n1Var, o1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        w2.i1 i1Var = this.O;
        g2.j0 j0Var = this.f16559l.f16705n;
        j0Var.getClass();
        g2.i0 c2 = g2.j0.c();
        c2.f11853a = j0Var.f11857a.obtainMessage(20, i3, i10, i1Var);
        c2.b();
        return o12;
    }

    @Override
    public final void s(d2.c1 c1Var) {
        boolean z10;
        F1();
        c1Var.getClass();
        g2.s sVar = this.f16561m;
        if (sVar.f11906i) {
            if (Thread.currentThread() == sVar.f11900a) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = sVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            g2.r rVar = (g2.r) it.next();
            if (rVar.f11897a.equals(c1Var)) {
                g2.q qVar = sVar.f11902c;
                rVar.d = true;
                if (qVar != null && rVar.f11899c) {
                    rVar.f11899c = false;
                    qVar.e(rVar.f11897a, rVar.f11898b.d());
                }
                copyOnWriteArraySet.remove(rVar);
            }
        }
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.f16577w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                g2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
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
        this.f16547e0 = new f2.c(this.f16567p0.f16613s, g9.s1.f12146e);
    }

    @Override
    public final d2.a1 t() {
        F1();
        return this.P;
    }

    @Override
    public final int t0() {
        F1();
        return this.f16567p0.f16608n;
    }

    public final void t1(int i3, int i10, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f16550g) {
            if (i3 == -1 || bVar.f16444b == i3) {
                m1 h12 = h1(bVar);
                zb.p(!h12.f16630f);
                h12.f16628c = i10;
                zb.p(!h12.f16630f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i3 == -1 || bVar2.f16444b == i3)) {
                m1 h13 = h1(bVar2);
                zb.p(!h13.f16630f);
                h13.f16628c = i10;
                zb.p(!h13.f16630f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final boolean u() {
        F1();
        return this.f16567p0.f16606l;
    }

    @Override
    public final void u0(d2.c1 c1Var) {
        c1Var.getClass();
        this.f16561m.a(c1Var);
    }

    public final void u1(w2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    public final void v1(int i3, long j10, List list, boolean z10) {
        int i10;
        long j11;
        boolean z11;
        int k1 = k1(this.f16567p0);
        long N0 = N0();
        this.J++;
        ArrayList arrayList = this.f16566p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            h1 h1Var = new h1((w2.a) list.get(i11), this.f16568q);
            arrayList2.add(h1Var);
            arrayList.add(i11, new e0(h1Var.f16532b, h1Var.f16531a));
        }
        this.O = this.O.c(arrayList2.size());
        o1 o1Var = new o1(arrayList, this.O);
        boolean p10 = o1Var.p();
        int i12 = o1Var.h;
        if (!p10 && i3 >= i12) {
            throw new IllegalStateException();
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i10 = o1Var.a(this.I);
        } else if (i3 == -1) {
            i10 = k1;
            j11 = N0;
        } else {
            i10 = i3;
            j11 = j10;
        }
        j1 o12 = o1(this.f16567p0, o1Var, p1(o1Var, i10, j11));
        int i13 = o12.f16600e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!o1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        j1 n12 = n1(o12, i13);
        this.f16559l.f16705n.b(17, new m0(arrayList2, this.O, i10, g2.n0.S(j11))).b();
        if (!this.f16567p0.f16598b.f57081a.equals(n12.f16598b.f57081a) && !this.f16567p0.f16597a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        D1(n12, 0, z11, 4, j1(n12), -1, false);
    }

    public final void w1(t1 t1Var) {
        F1();
        if (t1Var == null) {
            t1Var = t1.f16738f;
        }
        if (!this.N.equals(t1Var)) {
            this.N = t1Var;
            this.f16559l.f16705n.b(5, t1Var).b();
        }
    }

    @Override
    public final void x(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            g2.j0 j0Var = this.f16559l.f16705n;
            j0Var.getClass();
            g2.i0 c2 = g2.j0.c();
            c2.f11853a = j0Var.f11857a.obtainMessage(12, z10 ? 1 : 0, 0);
            c2.b();
            x xVar = new x(0, z10);
            g2.s sVar = this.f16561m;
            sVar.c(9, xVar);
            B1();
            sVar.b();
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
        r0 r0Var = this.f16559l;
        if (!r0Var.f16689a0 && r0Var.f16712s.getThread().isAlive()) {
            g2.j jVar = new g2.j(r0Var.G);
            r0Var.f16705n.b(30, new Pair(surface, jVar)).b();
            if (j10 != -9223372036854775807L) {
                z11 = jVar.c(j10);
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
    public final d2.n1 y0() {
        F1();
        return this.f16567p0.f16597a;
    }

    public final void y1(Surface surface) {
        int i3;
        F1();
        s1();
        x1(surface);
        if (surface == null) {
            i3 = 0;
        } else {
            i3 = -1;
        }
        q1(i3, i3);
    }

    @Override
    public final long z() {
        F1();
        return this.f16563n0;
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
            g2.a.l("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f16577w);
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
