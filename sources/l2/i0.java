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
import di.r4;
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
import org.telegram.ui.Components.l51;
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
    public e2.e f17853a0;
    public final a3.y f17854b;
    public float f17855b0;
    public final e2.y0 f17856c;
    public float f17857c0;
    public final h2.i d;
    public boolean f17858d0;
    public final Context f17859e;
    public g2.d f17860e0;
    public final i0 f17861f;
    public final boolean f17862f0;
    public final b[] f17863g;
    public boolean f17864g0;
    public final b[] h;
    public final int f17865h0;
    public final a3.x f17866i;
    public boolean f17867i0;
    public final h2.i0 f17868j;
    public final e2.o f17869j0;
    public final v f17870k;
    public x1 f17871k0;
    public final r0 f17872l;
    public final long f17873l0;
    public final h2.r f17874m;
    public final long m0;
    public final CopyOnWriteArraySet f17875n;
    public final long f17876n0;
    public final e2.i1 f17877o;
    public e2.o0 f17878o0;
    public final ArrayList f17879p;
    public k1 f17880p0;
    public final boolean f17881q;
    public int f17882q0;
    public final x2.e0 f17883r;
    public long f17884r0;
    public final m2.e f17885s;
    public l51 f17886s0;
    public final Looper f17887t;
    public final ArrayList f17888t0;
    public final b3.d f17889u;
    public final h2.g0 v;
    public final c0 f17890w;
    public final d0 f17891x;
    public final ab.q f17892y;
    public final h2.p0 f17893z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    public i0(l2.n r35) {
        throw new UnsupportedOperationException("Method not decompiled: l2.i0.<init>(l2.n):void");
    }

    public static long m1(k1 k1Var) {
        e2.k1 k1Var2 = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        k1Var.f17915a.g(k1Var.f17916b.f58342a, i1Var);
        long j3 = k1Var.f17917c;
        if (j3 == -9223372036854775807L) {
            return k1Var.f17915a.m(i1Var.f10287c, k1Var2, 0L).f10338l;
        }
        return i1Var.f10288e + j3;
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
        return this.f17887t;
    }

    public final void A1(l lVar) {
        k1 k1Var = this.f17880p0;
        k1 c10 = k1Var.c(k1Var.f17916b);
        c10.f17929q = c10.f17931s;
        c10.f17930r = 0L;
        k1 n1 = n1(c10, 1);
        if (lVar != null) {
            n1 = n1.f(lVar);
        }
        this.J++;
        this.f17872l.f18022n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final int B() {
        F1();
        if (this.f17880p0.f17915a.p()) {
            int i7 = this.f17882q0;
            if (i7 == -1) {
                return 0;
            }
            return i7;
        }
        k1 k1Var = this.f17880p0;
        return k1Var.f17915a.b(k1Var.f17916b.f58342a);
    }

    @Override
    public final void B0() {
        F1();
        if (this.f17855b0 != 0.0f) {
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
        String str = h2.m0.f14114a;
        i0 i0Var = this.f17861f;
        boolean p10 = i0Var.p();
        boolean e02 = i0Var.e0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean v02 = i0Var.v0();
        boolean p11 = i0Var.y0().p();
        ?? obj = new Object();
        obj.f10650a = new ca.i();
        ca.i iVar = (ca.i) obj.f10650a;
        iVar.c(this.f17856c.f10661a);
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
            this.f17874m.c(13, new v(this, 2));
        }
    }

    @Override
    public final x1 C() {
        F1();
        return this.f17871k0;
    }

    @Override
    public final void C0() {
        F1();
    }

    public final void C1(int i7, boolean z9) {
        int i10;
        k1 k1Var = this.f17880p0;
        int i11 = k1Var.f17926n;
        if (i11 == 1 && !z9) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (k1Var.f17924l == z9 && i11 == i10 && k1Var.f17925m == i7) {
            return;
        }
        this.J++;
        if (k1Var.f17928p) {
            k1Var = k1Var.a();
        }
        k1 e10 = k1Var.e(i7, i10, z9);
        h2.i0 i0Var = this.f17872l.f18022n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f14094a = i0Var.f14098a.obtainMessage(1, z9 ? 1 : 0, i7 | (i10 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void D(e2.e eVar, boolean z9) {
        F1();
        if (this.f17867i0) {
            return;
        }
        boolean equals = Objects.equals(this.f17853a0, eVar);
        h2.r rVar = this.f17874m;
        if (!equals) {
            this.f17853a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new r4(eVar, 28));
        }
        e2.e eVar2 = this.f17853a0;
        h2.i0 i0Var = this.f17872l.f18022n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f14094a = i0Var.f14098a.obtainMessage(31, z9 ? 1 : 0, 0, eVar2);
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
        k1 k1Var2 = this.f17880p0;
        this.f17880p0 = k1Var;
        boolean equals = k1Var2.f17915a.equals(k1Var.f17915a);
        e2.k1 k1Var3 = (e2.k1) this.f3503a;
        e2.i1 i1Var = this.f17877o;
        e2.l1 l1Var = k1Var2.f17915a;
        x2.f0 f0Var = k1Var2.f17916b;
        e2.l1 l1Var2 = k1Var.f17915a;
        x2.f0 f0Var2 = k1Var.f17916b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!l1Var.m(l1Var.g(f0Var.f58342a, i1Var).f10287c, k1Var3, 0L).f10329a.equals(l1Var2.m(l1Var2.g(f0Var2.f58342a, i1Var).f10287c, k1Var3, 0L).f10329a)) {
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
        } else if (z9 && i10 == 0 && f0Var.d < f0Var2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else if (z9 && i10 == 1 && z10) {
            pair = new Pair(Boolean.TRUE, 2);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            if (!k1Var.f17915a.p()) {
                l0Var = k1Var.f17915a.m(k1Var.f17915a.g(k1Var.f17916b.f58342a, this.f17877o).f10287c, (e2.k1) this.f3503a, 0L).f10331c;
            } else {
                l0Var = null;
            }
            this.f17878o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !k1Var2.f17922j.equals(k1Var.f17922j)) {
            e2.n0 a10 = this.f17878o0.a();
            List list = k1Var.f17922j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                e2.q0 q0Var = (e2.q0) list.get(i15);
                int i16 = 0;
                while (true) {
                    e2.p0[] p0VarArr = q0Var.f10489a;
                    if (i16 < p0VarArr.length) {
                        p0VarArr[i16].b(a10);
                        i16++;
                    }
                }
            }
            this.f17878o0 = new e2.o0(a10);
        }
        e2.o0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (k1Var2.f17924l != k1Var.f17924l) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (k1Var2.f17918e != k1Var.f17918e) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 || z11) {
            E1();
        }
        if (k1Var2.f17920g != k1Var.f17920g) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!equals) {
            this.f17874m.c(0, new q(k1Var, i7, 0));
        }
        if (z9) {
            e2.i1 i1Var2 = new e2.i1();
            if (!k1Var2.f17915a.p()) {
                Object obj5 = k1Var2.f17916b.f58342a;
                k1Var2.f17915a.g(obj5, i1Var2);
                int i17 = i1Var2.f10287c;
                int b10 = k1Var2.f17915a.b(obj5);
                z14 = booleanValue;
                z15 = equals2;
                z16 = z12;
                obj = k1Var2.f17915a.m(i17, (e2.k1) this.f3503a, 0L).f10329a;
                l0Var2 = ((e2.k1) this.f3503a).f10331c;
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
                if (k1Var2.f17916b.b()) {
                    x2.f0 f0Var3 = k1Var2.f17916b;
                    j12 = i1Var2.a(f0Var3.f58343b, f0Var3.f58344c);
                    m12 = m1(k1Var2);
                } else if (k1Var2.f17916b.f58345e != -1) {
                    j12 = m1(this.f17880p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.f10288e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (k1Var2.f17916b.b()) {
                j12 = k1Var2.f17931s;
                m12 = m1(k1Var2);
            } else {
                j10 = i1Var2.f10288e;
                j11 = k1Var2.f17931s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.m0.h0(j12);
            long h03 = h2.m0.h0(m12);
            x2.f0 f0Var4 = k1Var2.f17916b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, f0Var4.f58343b, f0Var4.f58344c);
            e2.k1 k1Var4 = (e2.k1) this.f3503a;
            int o02 = o0();
            int B = B();
            if (!this.f17880p0.f17915a.p()) {
                k1 k1Var5 = this.f17880p0;
                Object obj6 = k1Var5.f17916b.f58342a;
                k1Var5.f17915a.g(obj6, this.f17877o);
                B = this.f17880p0.f17915a.b(obj6);
                Object obj7 = this.f17880p0.f17915a.m(o02, k1Var4, 0L).f10329a;
                l0Var3 = k1Var4.f10331c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            }
            int i18 = B;
            long h04 = h2.m0.h0(j3);
            if (this.f17880p0.f17916b.b()) {
                j13 = h2.m0.h0(m1(this.f17880p0));
            } else {
                j13 = h04;
            }
            x2.f0 f0Var5 = this.f17880p0.f17916b;
            this.f17874m.c(11, new a2(i10, b1Var, new e2.b1(obj3, o02, l0Var3, obj4, i18, h04, j13, f0Var5.f58343b, f0Var5.f58344c), 2));
        } else {
            z14 = booleanValue;
            z15 = equals2;
            z16 = z12;
        }
        if (z14) {
            this.f17874m.c(1, new q(l0Var, intValue, 1));
        }
        if (k1Var2.f17919f != k1Var.f17919f) {
            this.f17874m.c(10, new h2.o() {
                @Override
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
            if (k1Var.f17919f != null) {
                this.f17874m.c(10, new h2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (r2) {
                            case 0:
                                k1 k1Var6 = k1Var;
                                a1Var.h(k1Var6.f17920g);
                                a1Var.j(k1Var6.f17920g);
                                return;
                            case 1:
                                k1 k1Var7 = k1Var;
                                a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                                return;
                            case 2:
                                a1Var.m(k1Var.f17918e);
                                return;
                            case 3:
                                k1 k1Var8 = k1Var;
                                a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                                return;
                            case 4:
                                a1Var.g(k1Var.f17926n);
                                return;
                            case 5:
                                a1Var.P(k1Var.m());
                                return;
                            case 6:
                                a1Var.H(k1Var.f17927o);
                                return;
                            case 7:
                                a1Var.q(k1Var.f17919f);
                                return;
                            case 8:
                                a1Var.y(k1Var.f17919f);
                                return;
                            default:
                                a1Var.u(k1Var.f17921i.d);
                                return;
                        }
                    }
                });
            }
        }
        a3.y yVar = k1Var2.f17921i;
        a3.y yVar2 = k1Var.f17921i;
        if (yVar != yVar2) {
            a3.x xVar = this.f17866i;
            Object obj8 = yVar2.f146e;
            xVar.getClass();
            xVar.f142c = (a3.w) obj8;
            this.f17874m.c(2, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (!z15) {
            this.f17874m.c(14, new r(this.Q));
        }
        if (z13) {
            this.f17874m.c(3, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (z16 || z11) {
            this.f17874m.c(-1, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (z16) {
            this.f17874m.c(4, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (z11 || k1Var2.f17925m != k1Var.f17925m) {
            this.f17874m.c(5, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.f17926n != k1Var.f17926n) {
            this.f17874m.c(6, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (k1Var2.m() != k1Var.m()) {
            this.f17874m.c(7, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        if (!k1Var2.f17927o.equals(k1Var.f17927o)) {
            this.f17874m.c(12, new h2.o() {
                @Override
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (r2) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.f17920g);
                            a1Var.j(k1Var6.f17920g);
                            return;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.f17918e, k1Var7.f17924l);
                            return;
                        case 2:
                            a1Var.m(k1Var.f17918e);
                            return;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.f17925m, k1Var8.f17924l);
                            return;
                        case 4:
                            a1Var.g(k1Var.f17926n);
                            return;
                        case 5:
                            a1Var.P(k1Var.m());
                            return;
                        case 6:
                            a1Var.H(k1Var.f17927o);
                            return;
                        case 7:
                            a1Var.q(k1Var.f17919f);
                            return;
                        case 8:
                            a1Var.y(k1Var.f17919f);
                            return;
                        default:
                            a1Var.u(k1Var.f17921i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f17874m.b();
        if (k1Var2.f17928p != k1Var.f17928p) {
            Iterator it = this.f17875n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f17775a.E1();
            }
        }
    }

    @Override
    public final e2.q1 E0() {
        F1();
        return ((a3.s) this.f17866i).j();
    }

    public final void E1() {
        int i7 = i();
        ci.a aVar = this.A;
        h2.p0 p0Var = this.f17893z;
        boolean z9 = false;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z10 = this.f17880p0.f17928p;
                if (u() && !z10) {
                    z9 = true;
                }
                p0Var.b(z9);
                aVar.a(u());
                return;
            }
        }
        p0Var.b(false);
        aVar.a(false);
    }

    @Override
    public final float F() {
        F1();
        return this.f17855b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f17880p0.f17915a.p()) {
            return this.f17884r0;
        }
        k1 k1Var = this.f17880p0;
        long j3 = 0;
        if (k1Var.f17923k.d != k1Var.f17916b.d) {
            return h2.m0.h0(k1Var.f17915a.m(o0(), (e2.k1) this.f3503a, 0L).f10339m);
        }
        long j10 = k1Var.f17929q;
        if (this.f17880p0.f17923k.b()) {
            k1 k1Var2 = this.f17880p0;
            k1Var2.f17915a.g(k1Var2.f17923k.f58342a, this.f17877o).d(this.f17880p0.f17923k.f58343b);
        } else {
            j3 = j10;
        }
        k1 k1Var3 = this.f17880p0;
        e2.l1 l1Var = k1Var3.f17915a;
        Object obj = k1Var3.f17923k.f58342a;
        e2.i1 i1Var = this.f17877o;
        l1Var.g(obj, i1Var);
        return h2.m0.h0(j3 + i1Var.f10288e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f17887t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.m0.f14114a;
            Locale locale = Locale.US;
            String m10 = org.telegram.ui.Cells.f1.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f17862f0) {
                if (this.f17864g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                h2.a.m("ExoPlayerImpl", m10, illegalStateException);
                this.f17864g0 = true;
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
        return this.f17853a0;
    }

    @Override
    public final void I0(e2.a1 a1Var) {
        a1Var.getClass();
        this.f17874m.a(a1Var);
    }

    @Override
    public final void J(int i7, boolean z9) {
        F1();
    }

    @Override
    public final e2.o K() {
        F1();
        return this.f17869j0;
    }

    @Override
    public final void K0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.f17874m.e(15, new v(this, 3));
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
            return this.f17880p0.f17916b.f58344c;
        }
        return -1;
    }

    @Override
    public final long O0() {
        F1();
        return this.f17873l0;
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
        int size = this.f17879p.size();
        int min = Math.min(i10, size);
        if (i7 < size && i7 != min) {
            k1 r12 = r1(this.f17880p0, i7, min);
            D1(r12, 0, !r12.f17916b.f58342a.equals(this.f17880p0.f17916b.f58342a), 4, j1(r12), -1, false);
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
        surfaceHolder.addCallback(this.f17890w);
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
        float f11 = this.f17855b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.f17857c0 = f11;
        this.f17855b0 = h;
        this.f17872l.f18022n.b(32, Float.valueOf(h)).b();
        this.f17874m.e(22, new t(h, 0));
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
        return this.f17880p0.f17919f;
    }

    @Override
    public final void X(boolean z9) {
        F1();
        C1(1, z9);
    }

    @Override
    public final void X0() {
        boolean z9;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.f14114a + "] [" + e2.m0.b() + "]");
        F1();
        this.f17892y.y();
        this.f17893z.b(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        h2.e0 e0Var = this.D;
        ((h2.i0) e0Var.f14078f).f14098a.removeCallbacksAndMessages(null);
        ((i0) e0Var.f14074a).h0((h2.z) e0Var.f14075b);
        r0 r0Var = this.f17872l;
        if (!r0Var.Z && r0Var.f18029s.getThread().isAlive()) {
            r0Var.Z = true;
            h2.i iVar = new h2.i(r0Var.F);
            r0Var.f18022n.b(7, iVar).b();
            z9 = iVar.c(r0Var.K);
        } else {
            z9 = true;
        }
        if (!z9) {
            this.f17874m.e(10, new x3(19));
        }
        this.f17874m.d();
        this.f17868j.f14098a.removeCallbacksAndMessages(null);
        b3.d dVar = this.f17889u;
        m2.e eVar = this.f17885s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).f2936c.f825b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.f2920b == eVar) {
                cVar.f2921c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        k1 k1Var = this.f17880p0;
        if (k1Var.f17928p) {
            this.f17880p0 = k1Var.a();
        }
        k1 n1 = n1(this.f17880p0, 1);
        this.f17880p0 = n1;
        k1 c10 = n1.c(n1.f17916b);
        this.f17880p0 = c10;
        c10.f17929q = c10.f17931s;
        this.f17880p0.f17930r = 0L;
        m2.e eVar2 = this.f17885s;
        h2.i0 i0Var = eVar2.f19538n;
        i0Var.getClass();
        i0Var.d(new a0(eVar2, 8));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f17860e0 = g2.d.d;
        this.f17867i0 = true;
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
            e2.l1 l1Var = this.f17880p0.f17915a;
            if (!l1Var.p() && i7 >= l1Var.o()) {
                return;
            }
            m2.e eVar = this.f17885s;
            if (!eVar.f19539r) {
                m2.a Q = eVar.Q();
                eVar.f19539r = true;
                eVar.V(Q, -1, new x(Q, 14));
            }
            this.J++;
            if (p()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.f17880p0);
                o0Var.f(1);
                i0 i0Var = this.f17870k.f18067b;
                i0Var.f17868j.d(new ha.b(23, i0Var, o0Var));
                return;
            }
            k1 k1Var = this.f17880p0;
            int i10 = k1Var.f17918e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                k1Var = this.f17880p0.h(2);
            }
            int o02 = o0();
            k1 o12 = o1(k1Var, l1Var, p1(l1Var, i7, j3));
            this.f17872l.f18022n.b(3, new q0(l1Var, i7, h2.m0.S(j3))).b();
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
        k1 k1Var = this.f17880p0;
        if (k1Var.f17918e != 1) {
            return;
        }
        k1 f10 = k1Var.f(null);
        if (f10.f17915a.p()) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        k1 n1 = n1(f10, i7);
        this.J++;
        this.f17872l.f18022n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long a0() {
        F1();
        return i1(this.f17880p0);
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
        int min = Math.min(i7, this.f17879p.size());
        if (this.f17880p0.f17915a.p()) {
            if (this.f17882q0 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
            return;
        }
        D1(e1(this.f17880p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void c0() {
        F1();
        if (this.f17855b0 == 0.0f) {
            float f10 = this.f17857c0;
            if (f10 != 0.0f) {
                T(f10);
            }
        }
    }

    @Override
    public final long d0() {
        F1();
        if (p()) {
            k1 k1Var = this.f17880p0;
            if (k1Var.f17923k.equals(k1Var.f17916b)) {
                return h2.m0.h0(this.f17880p0.f17929q);
            }
            return getDuration();
        }
        return F0();
    }

    @Override
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.f17880p0.f17927o.equals(w0Var)) {
            return;
        }
        k1 g10 = this.f17880p0.g(w0Var);
        this.J++;
        this.f17872l.f18022n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final k1 e1(k1 k1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = k1Var.f17915a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f17879p;
            if (i10 < size) {
                i1 i1Var = new i1((x2.a) arrayList.get(i10), this.f17881q);
                arrayList2.add(i1Var);
                arrayList3.add(i10 + i7, new e0(i1Var.f17895b, i1Var.f17894a));
                i10++;
            } else {
                this.O = this.O.f(i7, arrayList2.size());
                p1 p1Var = new p1(arrayList3, this.O);
                k1 o12 = o1(k1Var, p1Var, l1(l1Var, p1Var, k1(k1Var), i1(k1Var)));
                x2.g1 g1Var = this.O;
                h2.i0 i0Var = this.f17872l.f18022n;
                m0 m0Var = new m0(arrayList2, g1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.f14094a = i0Var.f14098a.obtainMessage(18, i7, 0, m0Var);
                c10.b();
                return o12;
            }
        }
    }

    public final e2.o0 f1() {
        boolean z9;
        e2.l1 y02 = y0();
        if (y02.p()) {
            return this.f17878o0;
        }
        e2.l0 l0Var = y02.m(o0(), (e2.k1) this.f3503a, 0L).f10331c;
        e2.n0 a10 = this.f17878o0.a();
        e2.o0 o0Var = l0Var.d;
        if (o0Var != null) {
            h9.i0 i0Var = o0Var.K;
            byte[] bArr = o0Var.f10440k;
            CharSequence charSequence = o0Var.f10432a;
            if (charSequence != null) {
                a10.f10382a = charSequence;
            }
            CharSequence charSequence2 = o0Var.f10433b;
            if (charSequence2 != null) {
                a10.f10383b = charSequence2;
            }
            CharSequence charSequence3 = o0Var.f10434c;
            if (charSequence3 != null) {
                a10.f10384c = charSequence3;
            }
            CharSequence charSequence4 = o0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = o0Var.f10435e;
            if (charSequence5 != null) {
                a10.f10385e = charSequence5;
            }
            CharSequence charSequence6 = o0Var.f10436f;
            if (charSequence6 != null) {
                a10.f10386f = charSequence6;
            }
            CharSequence charSequence7 = o0Var.f10437g;
            if (charSequence7 != null) {
                a10.f10387g = charSequence7;
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
            e2.d1 d1Var = o0Var.f10438i;
            if (d1Var != null) {
                a10.f10388i = d1Var;
            }
            e2.d1 d1Var2 = o0Var.f10439j;
            if (d1Var2 != null) {
                a10.f10389j = d1Var2;
            }
            Uri uri = o0Var.f10443n;
            if (uri != null || bArr != null) {
                a10.f10393n = uri;
                a10.b(bArr, o0Var.f10442m);
                a10.f10391l = o0Var.f10441l;
            }
            Integer num = o0Var.f10444o;
            if (num != null) {
                a10.f10394o = num;
            }
            Integer num2 = o0Var.f10445p;
            if (num2 != null) {
                a10.f10395p = num2;
            }
            Integer num3 = o0Var.f10446q;
            if (num3 != null) {
                a10.f10396q = num3;
            }
            Boolean bool = o0Var.f10447r;
            if (bool != null) {
                a10.f10397r = bool;
            }
            Boolean bool2 = o0Var.f10448s;
            if (bool2 != null) {
                a10.f10398s = bool2;
            }
            Integer num4 = o0Var.f10449t;
            if (num4 != null) {
                a10.f10399t = num4;
            }
            Integer num5 = o0Var.f10450u;
            if (num5 != null) {
                a10.f10399t = num5;
            }
            Integer num6 = o0Var.v;
            if (num6 != null) {
                a10.f10400u = num6;
            }
            Integer num7 = o0Var.f10451w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = o0Var.f10452x;
            if (num8 != null) {
                a10.f10401w = num8;
            }
            Integer num9 = o0Var.f10453y;
            if (num9 != null) {
                a10.f10402x = num9;
            }
            Integer num10 = o0Var.f10454z;
            if (num10 != null) {
                a10.f10403y = num10;
            }
            CharSequence charSequence8 = o0Var.A;
            if (charSequence8 != null) {
                a10.f10404z = charSequence8;
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
        return this.f17880p0.f17920g;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.f17883r.b((e2.l0) list.get(i7)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (p()) {
            k1 k1Var = this.f17880p0;
            x2.f0 f0Var = k1Var.f17916b;
            e2.l1 l1Var = k1Var.f17915a;
            Object obj = f0Var.f58342a;
            e2.i1 i1Var = this.f17877o;
            l1Var.g(obj, i1Var);
            return h2.m0.h0(i1Var.a(f0Var.f58343b, f0Var.f58344c));
        }
        return A();
    }

    @Override
    public final void h0(e2.a1 a1Var) {
        boolean z9;
        F1();
        a1Var.getClass();
        h2.r rVar = this.f17874m;
        if (rVar.f14147i) {
            if (Thread.currentThread() == rVar.f14141a) {
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
            if (qVar.f14138a.equals(a1Var)) {
                h2.p pVar = rVar.f14143c;
                qVar.d = true;
                if (pVar != null && qVar.f14140c) {
                    qVar.f14140c = false;
                    pVar.h(qVar.f14138a, qVar.f14139b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final n1 h1(m1 m1Var) {
        int k12 = k1(this.f17880p0);
        e2.l1 l1Var = this.f17880p0.f17915a;
        if (k12 == -1) {
            k12 = 0;
        }
        r0 r0Var = this.f17872l;
        return new n1(r0Var, m1Var, l1Var, k12, r0Var.f18029s);
    }

    @Override
    public final int i() {
        F1();
        return this.f17880p0.f17918e;
    }

    @Override
    public final void i0(int i7) {
        F1();
    }

    public final long i1(k1 k1Var) {
        x2.f0 f0Var = k1Var.f17916b;
        long j3 = k1Var.f17917c;
        e2.l1 l1Var = k1Var.f17915a;
        if (f0Var.b()) {
            Object obj = k1Var.f17916b.f58342a;
            e2.i1 i1Var = this.f17877o;
            l1Var.g(obj, i1Var);
            if (j3 == -9223372036854775807L) {
                return h2.m0.h0(l1Var.m(k1(k1Var), (e2.k1) this.f3503a, 0L).f10338l);
            }
            return h2.m0.h0(j3) + h2.m0.h0(i1Var.f10288e);
        }
        return h2.m0.h0(j1(k1Var));
    }

    @Override
    public final e2.w0 j() {
        F1();
        return this.f17880p0.f17927o;
    }

    @Override
    public final e2.s1 j0() {
        F1();
        return this.f17880p0.f17921i.d;
    }

    public final long j1(k1 k1Var) {
        long j3;
        if (k1Var.f17915a.p()) {
            return h2.m0.S(this.f17884r0);
        }
        if (k1Var.f17928p) {
            j3 = k1Var.l();
        } else {
            j3 = k1Var.f17931s;
        }
        if (k1Var.f17916b.b()) {
            return j3;
        }
        e2.l1 l1Var = k1Var.f17915a;
        Object obj = k1Var.f17916b.f58342a;
        e2.i1 i1Var = this.f17877o;
        l1Var.g(obj, i1Var);
        return j3 + i1Var.f10288e;
    }

    @Override
    public final void k(int i7) {
        F1();
        if (this.H != i7) {
            this.H = i7;
            h2.i0 i0Var = this.f17872l.f18022n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f14094a = i0Var.f14098a.obtainMessage(11, i7, 0);
            c10.b();
            u uVar = new u(i7, 0);
            h2.r rVar = this.f17874m;
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
        if (k1Var.f17915a.p()) {
            return this.f17882q0;
        }
        return k1Var.f17915a.g(k1Var.f17916b.f58342a, this.f17877o).f10287c;
    }

    @Override
    public final long l() {
        F1();
        return h2.m0.h0(j1(this.f17880p0));
    }

    @Override
    public final g2.d l0() {
        F1();
        return this.f17860e0;
    }

    public final Pair l1(e2.l1 l1Var, p1 p1Var, int i7, long j3) {
        boolean z9;
        long j10 = -9223372036854775807L;
        int i10 = -1;
        if (!l1Var.p() && !p1Var.p()) {
            Pair i11 = l1Var.i((e2.k1) this.f3503a, this.f17877o, i7, h2.m0.S(j3));
            Object obj = i11.first;
            if (p1Var.b(obj) != -1) {
                return i11;
            }
            int U = r0.U((e2.k1) this.f3503a, this.f17877o, this.H, this.I, obj, l1Var, p1Var);
            if (U != -1) {
                e2.k1 k1Var = (e2.k1) this.f3503a;
                p1Var.m(U, k1Var, 0L);
                return p1(p1Var, U, h2.m0.h0(k1Var.f10338l));
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
            return this.f17880p0.f17916b.f58343b;
        }
        return -1;
    }

    @Override
    public final int o0() {
        F1();
        int k12 = k1(this.f17880p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final k1 o1(k1 k1Var, e2.l1 l1Var, Pair pair) {
        boolean z9;
        x2.f0 f0Var;
        x2.p1 p1Var;
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
        e2.l1 l1Var2 = k1Var.f17915a;
        long i12 = i1(k1Var);
        k1 j10 = k1Var.j(l1Var);
        if (l1Var.p()) {
            x2.f0 f0Var2 = k1.f17914u;
            long S = h2.m0.S(this.f17884r0);
            k1 c10 = j10.d(f0Var2, S, S, S, 0L, x2.p1.d, this.f17854b, h9.t1.f14399e).c(f0Var2);
            c10.f17929q = c10.f17931s;
            return c10;
        }
        Object obj = j10.f17916b.f58342a;
        String str = h2.m0.f14114a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            f0Var = new x2.f0(pair.first);
        } else {
            f0Var = j10.f17916b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.m0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.f17877o).f10288e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.f17877o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.f0 f0Var3 = f0Var;
            ia.p(!f0Var3.b());
            if (!equals) {
                p1Var = x2.p1.d;
            } else {
                p1Var = j10.h;
            }
            x2.p1 p1Var2 = p1Var;
            if (!equals) {
                yVar = this.f17854b;
            } else {
                yVar = j10.f17921i;
            }
            a3.y yVar2 = yVar;
            if (!equals) {
                h9.g0 g0Var = h9.i0.f14331b;
                list = h9.t1.f14399e;
            } else {
                list = j10.f17922j;
            }
            k1 c11 = j10.d(f0Var3, longValue, longValue, longValue, 0L, p1Var2, yVar2, list).c(f0Var3);
            c11.f17929q = longValue;
            return c11;
        } else if (i7 == 0) {
            int b10 = l1Var.b(j10.f17923k.f58342a);
            if (b10 != -1 && l1Var.f(b10, this.f17877o, false).f10287c == l1Var.g(f0Var.f58342a, this.f17877o).f10287c) {
                return j10;
            }
            l1Var.g(f0Var.f58342a, this.f17877o);
            if (f0Var.b()) {
                j3 = this.f17877o.a(f0Var.f58343b, f0Var.f58344c);
            } else {
                j3 = this.f17877o.d;
            }
            x2.f0 f0Var4 = f0Var;
            k1 c12 = j10.d(f0Var4, j10.f17931s, j10.f17931s, j10.d, j3 - j10.f17931s, j10.h, j10.f17921i, j10.f17922j).c(f0Var4);
            c12.f17929q = j3;
            return c12;
        } else {
            x2.f0 f0Var5 = f0Var;
            ia.p(!f0Var5.b());
            long max = Math.max(0L, j10.f17930r - (longValue - S2));
            long j11 = j10.f17929q;
            if (j10.f17923k.equals(j10.f17916b)) {
                j11 = longValue + max;
            }
            k1 d = j10.d(f0Var5, longValue, longValue, longValue, max, j10.h, j10.f17921i, j10.f17922j);
            d.f17929q = j11;
            return d;
        }
    }

    @Override
    public final boolean p() {
        F1();
        return this.f17880p0.f17916b.b();
    }

    public final Pair p1(e2.l1 l1Var, int i7, long j3) {
        if (l1Var.p()) {
            this.f17882q0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f17884r0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= l1Var.o()) {
            i7 = l1Var.a(this.I);
            j3 = h2.m0.h0(l1Var.m(i7, (e2.k1) this.f3503a, 0L).f10338l);
        }
        return l1Var.i((e2.k1) this.f3503a, this.f17877o, i7, h2.m0.S(j3));
    }

    @Override
    public final void q0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.f17866i;
        xVar.getClass();
        e2.q1 E0 = E0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (!E0.equals(q1Var)) {
            this.f17874m.e(19, new r4(q1Var, 29));
        }
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.f14168a && i10 == yVar.f14169b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        l51 l51Var = this.f17886s0;
        if (l51Var != null) {
            l51Var.execute(new jg.r(this, i7, i10, 1));
            return;
        }
        this.f17874m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override
    public final long r() {
        F1();
        return h2.m0.h0(this.f17880p0.f17930r);
    }

    @Override
    public final void r0(boolean z9) {
        F1();
    }

    public final k1 r1(k1 k1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(k1Var);
        long i12 = i1(k1Var);
        e2.l1 l1Var = k1Var.f17915a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.f17879p;
            if (i11 < i7) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i7, i10);
        p1 p1Var = new p1(arrayList, this.O);
        k1 o12 = o1(k1Var, p1Var, l1(l1Var, p1Var, k12, i12));
        int i13 = o12.f17918e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (r0.U((e2.k1) this.f3503a, this.f17877o, this.H, this.I, k1Var.f17916b.f58342a, l1Var, p1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.g1 g1Var = this.O;
        h2.i0 i0Var = this.f17872l.f18022n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.f14094a = i0Var.f14098a.obtainMessage(20, i7, i10, g1Var);
        c10.b();
        return o12;
    }

    @Override
    public final void s0(List list, int i7, int i10) {
        boolean z9;
        x2.o1 o1Var;
        F1();
        boolean z10 = true;
        if (i7 >= 0 && i10 >= i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        ArrayList arrayList = this.f17879p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((e0) arrayList.get(i11)).f17797b.f58466k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.f17872l.f18022n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f14094a = i0Var.f14098a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                e0 e0Var = (e0) arrayList.get(i12);
                e2.l1 l1Var = e0Var.f17798c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                if (l1Var instanceof x2.o1) {
                    o1Var = new x2.o1(((x2.o1) l1Var).f58462e, l0Var);
                } else {
                    o1Var = new x2.o1(l1Var, l0Var);
                }
                e0Var.f17798c = o1Var;
            }
            D1(this.f17880p0.j(new p1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f17880p0.f17915a.p()) {
            if (this.f17882q0 != -1) {
                z10 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
            return;
        }
        k1 r12 = r1(e1(this.f17880p0, min, g12), i7, min);
        D1(r12, 0, !r12.f17916b.f58342a.equals(this.f17880p0.f17916b.f58342a), 4, j1(r12), -1, false);
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.f17890w;
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
        this.f17860e0 = new g2.d(this.f17880p0.f17931s, h9.t1.f14399e);
    }

    @Override
    public final e2.y0 t() {
        F1();
        return this.P;
    }

    public final void t1(int i7, int i10, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f17863g) {
            if (i7 == -1 || bVar.f17761b == i7) {
                n1 h12 = h1(bVar);
                ia.p(!h12.f17973f);
                h12.f17971c = i10;
                ia.p(!h12.f17973f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.f17761b == i7)) {
                n1 h13 = h1(bVar2);
                ia.p(!h13.f17973f);
                h13.f17971c = i10;
                ia.p(!h13.f17973f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final boolean u() {
        F1();
        return this.f17880p0.f17924l;
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
        ArrayList arrayList = this.f17879p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 < size && i7 != min && i7 != min2) {
            e2.l1 y02 = y0();
            this.J++;
            h2.m0.R(i7, min, min2, arrayList);
            this.O = this.O.g();
            p1 p1Var = new p1(arrayList, this.O);
            k1 k1Var = this.f17880p0;
            k1 o12 = o1(k1Var, p1Var, l1(y02, p1Var, k1(k1Var), i1(this.f17880p0)));
            x2.g1 g1Var = this.O;
            r0 r0Var = this.f17872l;
            r0Var.getClass();
            r0Var.f18022n.b(19, new n0(i7, min, min2, g1Var)).b();
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
        int k12 = k1(this.f17880p0);
        long l10 = l();
        this.J++;
        ArrayList arrayList = this.f17879p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i1 i1Var = new i1((x2.a) list.get(i11), this.f17881q);
            arrayList2.add(i1Var);
            arrayList.add(i11, new e0(i1Var.f17895b, i1Var.f17894a));
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
        k1 o12 = o1(this.f17880p0, p1Var, p1(p1Var, i10, j10));
        int i13 = o12.f17918e;
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
        this.f17872l.f18022n.b(17, new m0(arrayList2, this.O, i10, h2.m0.S(j10))).b();
        if (!this.f17880p0.f17916b.f58342a.equals(n1.f17916b.f58342a) && !this.f17880p0.f17915a.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        D1(n1, 0, z10, 4, j1(n1), -1, false);
    }

    @Override
    public final int w0() {
        F1();
        return this.f17880p0.f17926n;
    }

    public final void w1(t1 t1Var) {
        F1();
        if (t1Var == null) {
            t1Var = t1.f18054f;
        }
        if (!this.N.equals(t1Var)) {
            this.N = t1Var;
            this.f17872l.f18022n.b(5, t1Var).b();
        }
    }

    @Override
    public final void x(boolean z9) {
        F1();
        if (this.I != z9) {
            this.I = z9;
            h2.i0 i0Var = this.f17872l.f18022n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.f14094a = i0Var.f14098a.obtainMessage(12, z9 ? 1 : 0, 0);
            c10.b();
            w wVar = new w(0, z9);
            h2.r rVar = this.f17874m;
            rVar.c(9, wVar);
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
        r0 r0Var = this.f17872l;
        if (!r0Var.Z && r0Var.f18029s.getThread().isAlive()) {
            h2.i iVar = new h2.i(r0Var.F);
            r0Var.f18022n.b(30, new Pair(surface, iVar)).b();
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
        return this.f17880p0.f17915a;
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
        return this.f17876n0;
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
        textureView.setSurfaceTextureListener(this.f17890w);
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
