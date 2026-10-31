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
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.n61;
import v7.t6;
public final class i0 extends b2.h implements p {
    public final c3.m0 A;
    public final long B;
    public final e2.c C;
    public final e2.e0 D;
    public final h0 E;
    public final n4.q F;
    public final n4.q G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final u1 M;
    public v1 N;
    public u2.i1 O;
    public b2.b1 P;
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
    public b2.f f7896a0;
    public final x2.u f7897b;
    public float f7898b0;
    public final b2.b1 f7899c;
    public float f7900c0;
    public final e2.i d;
    public boolean f7901d0;
    public final Context e;
    public d2.d f7902e0;
    public final i0 f7903f;
    public final boolean f7904f0;
    public final b[] f7905g;
    public boolean f7906g0;
    public final b[] h;
    public final int f7907h0;
    public final x2.t f7908i;
    public boolean f7909i0;
    public final e2.i0 f7910j;
    public final b2.q f7911j0;
    public final x f7912k;
    public b2 f7913k0;
    public final s0 f7914l;
    public final long f7915l0;
    public final e2.r f7916m;
    public final long m0;
    public final CopyOnWriteArraySet f7917n;
    public final long f7918n0;
    public final b2.l1 f7919o;
    public b2.s0 f7920o0;
    public final ArrayList f7921p;
    public m1 f7922p0;
    public final boolean f7923q;
    public int f7924q0;
    public final u2.f0 f7925r;
    public long f7926r0;
    public final j2.g f7927s;
    public n61 f7928s0;
    public final Looper f7929t;
    public final ArrayList f7930t0;
    public final y2.c f7931u;
    public final e2.g0 v;
    public final c0 f7932w;
    public final d0 f7933x;
    public final ac.a f7934y;
    public final e2.o0 f7935z;

    static {
        b2.q0.a("media3.exoplayer");
    }

    public i0(i2.n r34) {
        throw new UnsupportedOperationException("Method not decompiled: i2.i0.<init>(i2.n):void");
    }

    public static long m1(m1 m1Var) {
        b2.n1 n1Var = new b2.n1();
        b2.l1 l1Var = new b2.l1();
        m1Var.f7970a.g(m1Var.f7971b.f49875a, l1Var);
        long j10 = m1Var.f7972c;
        if (j10 == -9223372036854775807L) {
            return m1Var.f7970a.m(l1Var.f2109c, n1Var, 0L).f2145l;
        }
        return l1Var.e + j10;
    }

    public static m1 n1(m1 m1Var, int i10) {
        m1 h = m1Var.h(i10);
        if (i10 != 1 && i10 != 4) {
            return h;
        }
        return h.b(false);
    }

    @Override
    public final int A() {
        F1();
        if (this.f7922p0.f7970a.p()) {
            int i10 = this.f7924q0;
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }
        m1 m1Var = this.f7922p0;
        return m1Var.f7970a.b(m1Var.f7971b.f49875a);
    }

    @Override
    public final Looper A0() {
        return this.f7929t;
    }

    public final void A1(l lVar) {
        m1 m1Var = this.f7922p0;
        m1 c10 = m1Var.c(m1Var.f7971b);
        c10.f7983q = c10.f7985s;
        c10.f7984r = 0L;
        m1 n12 = n1(c10, 1);
        if (lVar != null) {
            n12 = n12.f(lVar);
        }
        this.J++;
        this.f7914l.f8063n.a(6).b();
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
        this.f7916m.e(15, new x(this, 3));
    }

    @Override
    public final void B0() {
        F1();
        if (this.f7898b0 != 0.0f) {
            S(0.0f);
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
        String str = e2.l0.f6165a;
        i0 i0Var = this.f7903f;
        boolean n10 = i0Var.n();
        boolean d02 = i0Var.d0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean v02 = i0Var.v0();
        boolean p5 = i0Var.y0().p();
        ?? obj = new Object();
        obj.f1978a = new b2.u();
        b2.u uVar = (b2.u) obj.f1978a;
        uVar.c(this.f7899c.f1984a);
        boolean z16 = !n10;
        obj.a(4, z16);
        boolean z17 = false;
        if (d02 && !n10) {
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
        if (!p5 && ((T0 || !P0 || d02) && !n10)) {
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
        if (d02 && !n10) {
            z15 = true;
        } else {
            z15 = false;
        }
        obj.a(11, z15);
        if (d02 && !n10) {
            z17 = true;
        }
        obj.a(12, z17);
        b2.b1 b1Var2 = new b2.b1(uVar.d());
        this.P = b1Var2;
        if (!b1Var2.equals(b1Var)) {
            this.f7916m.c(13, new x(this, 2));
        }
    }

    @Override
    public final void C(b2.d1 d1Var) {
        boolean z10;
        F1();
        d1Var.getClass();
        e2.r rVar = this.f7916m;
        if (rVar.f6193i) {
            if (Thread.currentThread() == rVar.f6188a) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.q qVar = (e2.q) it.next();
            if (qVar.f6185a.equals(d1Var)) {
                e2.p pVar = rVar.f6190c;
                qVar.d = true;
                if (pVar != null && qVar.f6187c) {
                    qVar.f6187c = false;
                    pVar.c(qVar.f6185a, qVar.f6186b.d());
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
        m1 m1Var = this.f7922p0;
        int i12 = m1Var.f7980n;
        if (i12 == 1 && !z10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (m1Var.f7978l == z10 && i12 == i11 && m1Var.f7979m == i10) {
            return;
        }
        this.J++;
        if (m1Var.f7982p) {
            m1Var = m1Var.a();
        }
        m1 e = m1Var.e(i10, i11, z10);
        e2.i0 i0Var = this.f7914l.f8063n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f6147a = i0Var.f6151a.obtainMessage(1, z10 ? 1 : 0, i10 | (i11 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final b2 D() {
        F1();
        return this.f7913k0;
    }

    @Override
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final m1 m1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.p0 p0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
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
        long j14;
        m1 m1Var2 = this.f7922p0;
        this.f7922p0 = m1Var;
        boolean equals = m1Var2.f7970a.equals(m1Var.f7970a);
        b2.n1 n1Var = (b2.n1) this.f2047a;
        b2.l1 l1Var = this.f7919o;
        b2.o1 o1Var = m1Var2.f7970a;
        u2.g0 g0Var = m1Var2.f7971b;
        b2.o1 o1Var2 = m1Var.f7970a;
        u2.g0 g0Var2 = m1Var.f7971b;
        if (o1Var2.p() && o1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o1Var2.p() != o1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!o1Var.m(o1Var.g(g0Var.f49875a, l1Var).f2109c, n1Var, 0L).f2137a.equals(o1Var2.m(o1Var2.g(g0Var2.f49875a, l1Var).f2109c, n1Var, 0L).f2137a)) {
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
            if (!m1Var.f7970a.p()) {
                p0Var = m1Var.f7970a.m(m1Var.f7970a.g(m1Var.f7971b.f49875a, this.f7919o).f2109c, (b2.n1) this.f2047a, 0L).f2139c;
            } else {
                p0Var = null;
            }
            this.f7920o0 = b2.s0.L;
        } else {
            p0Var = null;
        }
        if (booleanValue || !m1Var2.f7976j.equals(m1Var.f7976j)) {
            b2.r0 a2 = this.f7920o0.a();
            List list = m1Var.f7976j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.u0 u0Var = (b2.u0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.t0[] t0VarArr = u0Var.f2302a;
                    if (i17 < t0VarArr.length) {
                        t0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.f7920o0 = new b2.s0(a2);
        }
        b2.s0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        if (m1Var2.f7978l != m1Var.f7978l) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m1Var2.e != m1Var.e) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 || z12) {
            E1();
        }
        if (m1Var2.f7974g != m1Var.f7974g) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!equals) {
            this.f7916m.c(0, new q(m1Var, i10, 0));
        }
        if (z10) {
            b2.l1 l1Var2 = new b2.l1();
            if (!m1Var2.f7970a.p()) {
                Object obj5 = m1Var2.f7971b.f49875a;
                m1Var2.f7970a.g(obj5, l1Var2);
                int i18 = l1Var2.f2109c;
                int b10 = m1Var2.f7970a.b(obj5);
                z15 = booleanValue;
                z16 = equals2;
                z17 = z13;
                obj = m1Var2.f7970a.m(i18, (b2.n1) this.f2047a, 0L).f2137a;
                p0Var2 = ((b2.n1) this.f2047a).f2139c;
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
                p0Var2 = null;
                obj2 = null;
            }
            if (i11 == 0) {
                if (m1Var2.f7971b.b()) {
                    u2.g0 g0Var3 = m1Var2.f7971b;
                    j13 = l1Var2.a(g0Var3.f49876b, g0Var3.f49877c);
                    m12 = m1(m1Var2);
                } else if (m1Var2.f7971b.e != -1) {
                    j13 = m1(this.f7922p0);
                    m12 = j13;
                } else {
                    j11 = l1Var2.e;
                    j12 = l1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (m1Var2.f7971b.b()) {
                j13 = m1Var2.f7985s;
                m12 = m1(m1Var2);
            } else {
                j11 = l1Var2.e;
                j12 = m1Var2.f7985s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.l0.h0(j13);
            long h03 = e2.l0.h0(m12);
            u2.g0 g0Var4 = m1Var2.f7971b;
            b2.e1 e1Var = new b2.e1(obj, i14, p0Var2, obj2, i15, h02, h03, g0Var4.f49876b, g0Var4.f49877c);
            b2.n1 n1Var2 = (b2.n1) this.f2047a;
            int m0 = m0();
            int A = A();
            if (!this.f7922p0.f7970a.p()) {
                m1 m1Var3 = this.f7922p0;
                Object obj6 = m1Var3.f7971b.f49875a;
                m1Var3.f7970a.g(obj6, this.f7919o);
                A = this.f7922p0.f7970a.b(obj6);
                Object obj7 = this.f7922p0.f7970a.m(m0, n1Var2, 0L).f2137a;
                p0Var3 = n1Var2.f2139c;
                obj4 = obj6;
                obj3 = obj7;
            } else {
                obj3 = null;
                p0Var3 = null;
                obj4 = null;
            }
            int i19 = A;
            long h04 = e2.l0.h0(j10);
            if (this.f7922p0.f7971b.b()) {
                j14 = e2.l0.h0(m1(this.f7922p0));
            } else {
                j14 = h04;
            }
            u2.g0 g0Var5 = this.f7922p0.f7971b;
            this.f7916m.c(11, new ag.b0(i11, e1Var, new b2.e1(obj3, m0, p0Var3, obj4, i19, h04, j14, g0Var5.f49876b, g0Var5.f49877c), 1));
        } else {
            z15 = booleanValue;
            z16 = equals2;
            z17 = z13;
        }
        if (z15) {
            this.f7916m.c(1, new q(p0Var, intValue, 1));
        }
        if (m1Var2.f7973f != m1Var.f7973f) {
            this.f7916m.c(10, new e2.o() {
                @Override
                public final void invoke(Object obj8) {
                    b2.d1 d1Var = (b2.d1) obj8;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
            if (m1Var.f7973f != null) {
                this.f7916m.c(10, new e2.o() {
                    @Override
                    public final void invoke(Object obj8) {
                        b2.d1 d1Var = (b2.d1) obj8;
                        switch (r2) {
                            case 0:
                                m1 m1Var4 = m1Var;
                                d1Var.g(m1Var4.f7974g);
                                d1Var.k(m1Var4.f7974g);
                                return;
                            case 1:
                                m1 m1Var5 = m1Var;
                                d1Var.K(m1Var5.e, m1Var5.f7978l);
                                return;
                            case 2:
                                d1Var.u(m1Var.e);
                                return;
                            case 3:
                                m1 m1Var6 = m1Var;
                                d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                                return;
                            case 4:
                                d1Var.f(m1Var.f7980n);
                                return;
                            case 5:
                                d1Var.P(m1Var.m());
                                return;
                            case 6:
                                d1Var.z(m1Var.f7981o);
                                return;
                            case 7:
                                d1Var.v(m1Var.f7973f);
                                return;
                            case 8:
                                d1Var.H(m1Var.f7973f);
                                return;
                            default:
                                d1Var.N(m1Var.f7975i.d);
                                return;
                        }
                    }
                });
            }
        }
        x2.u uVar = m1Var2.f7975i;
        x2.u uVar2 = m1Var.f7975i;
        if (uVar != uVar2) {
            x2.t tVar = this.f7908i;
            Object obj8 = uVar2.e;
            tVar.getClass();
            tVar.f52955c = (x2.s) obj8;
            this.f7916m.c(2, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (!z16) {
            this.f7916m.c(14, new r(this.Q));
        }
        if (z14) {
            this.f7916m.c(3, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (z17 || z12) {
            this.f7916m.c(-1, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (z17) {
            this.f7916m.c(4, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (z12 || m1Var2.f7979m != m1Var.f7979m) {
            this.f7916m.c(5, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (m1Var2.f7980n != m1Var.f7980n) {
            this.f7916m.c(6, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (m1Var2.m() != m1Var.m()) {
            this.f7916m.c(7, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        if (!m1Var2.f7981o.equals(m1Var.f7981o)) {
            this.f7916m.c(12, new e2.o() {
                @Override
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (r2) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.f7974g);
                            d1Var.k(m1Var4.f7974g);
                            return;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.f7978l);
                            return;
                        case 2:
                            d1Var.u(m1Var.e);
                            return;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.f7979m, m1Var6.f7978l);
                            return;
                        case 4:
                            d1Var.f(m1Var.f7980n);
                            return;
                        case 5:
                            d1Var.P(m1Var.m());
                            return;
                        case 6:
                            d1Var.z(m1Var.f7981o);
                            return;
                        case 7:
                            d1Var.v(m1Var.f7973f);
                            return;
                        case 8:
                            d1Var.H(m1Var.f7973f);
                            return;
                        default:
                            d1Var.N(m1Var.f7975i.d);
                            return;
                    }
                }
            });
        }
        B1();
        this.f7916m.b();
        if (m1Var2.f7982p != m1Var.f7982p) {
            Iterator it = this.f7917n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).f7821a.E1();
            }
        }
    }

    @Override
    public final b2.u1 E0() {
        F1();
        return ((x2.o) this.f7908i).j();
    }

    public final void E1() {
        int h = h();
        c3.m0 m0Var = this.A;
        e2.o0 o0Var = this.f7935z;
        boolean z10 = false;
        if (h != 1) {
            if (h != 2 && h != 3) {
                if (h != 4) {
                    throw new IllegalStateException();
                }
            } else {
                F1();
                boolean z11 = this.f7922p0.f7982p;
                if (t() && !z11) {
                    z10 = true;
                }
                o0Var.c(z10);
                m0Var.a(t());
                return;
            }
        }
        o0Var.c(false);
        m0Var.a(false);
    }

    @Override
    public final float F() {
        F1();
        return this.f7898b0;
    }

    @Override
    public final long F0() {
        F1();
        if (this.f7922p0.f7970a.p()) {
            return this.f7926r0;
        }
        m1 m1Var = this.f7922p0;
        long j10 = 0;
        if (m1Var.f7977k.d != m1Var.f7971b.d) {
            return e2.l0.h0(m1Var.f7970a.m(m0(), (b2.n1) this.f2047a, 0L).f2146m);
        }
        long j11 = m1Var.f7983q;
        if (this.f7922p0.f7977k.b()) {
            m1 m1Var2 = this.f7922p0;
            m1Var2.f7970a.g(m1Var2.f7977k.f49875a, this.f7919o).d(this.f7922p0.f7977k.f49876b);
        } else {
            j10 = j11;
        }
        m1 m1Var3 = this.f7922p0;
        b2.o1 o1Var = m1Var3.f7970a;
        Object obj = m1Var3.f7977k.f49875a;
        b2.l1 l1Var = this.f7919o;
        o1Var.g(obj, l1Var);
        return e2.l0.h0(j10 + l1Var.e);
    }

    public final void F1() {
        IllegalStateException illegalStateException;
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f7929t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.l0.f6165a;
            Locale locale = Locale.US;
            String o10 = org.telegram.ui.Cells.f1.o("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (!this.f7904f0) {
                if (this.f7906g0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                e2.a.m("ExoPlayerImpl", o10, illegalStateException);
                this.f7906g0 = true;
                return;
            }
            throw new IllegalStateException(o10);
        }
    }

    @Override
    public final void G0(int i10) {
        F1();
    }

    @Override
    public final b2.f H() {
        F1();
        return this.f7896a0;
    }

    @Override
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override
    public final b2.q J() {
        F1();
        return this.f7911j0;
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
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override
    public final void M(int i10) {
        F1();
    }

    @Override
    public final long M0() {
        F1();
        return e2.l0.h0(j1(this.f7922p0));
    }

    @Override
    public final int N() {
        F1();
        if (n()) {
            return this.f7922p0.f7971b.f49877c;
        }
        return -1;
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        F1();
        if (this.f7909i0) {
            return;
        }
        boolean equals = Objects.equals(this.f7896a0, fVar);
        e2.r rVar = this.f7916m;
        if (!equals) {
            this.f7896a0 = fVar;
            t1(1, 3, fVar);
            rVar.c(20, new a1.c(fVar, 24));
        }
        b2.f fVar2 = this.f7896a0;
        e2.i0 i0Var = this.f7914l.f8063n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f6147a = i0Var.f6151a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c10.b();
        rVar.b();
    }

    @Override
    public final long O0() {
        F1();
        return this.f7915l0;
    }

    @Override
    public final void Q(int i10, int i11) {
        boolean z10;
        F1();
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        int size = this.f7921p.size();
        int min = Math.min(i11, size);
        if (i10 < size && i10 != min) {
            m1 r12 = r1(this.f7922p0, i10, min);
            D1(r12, 0, !r12.f7971b.f49875a.equals(this.f7922p0.f7971b.f49875a), 4, j1(r12), -1, false);
        }
    }

    @Override
    public final void R(SurfaceHolder surfaceHolder) {
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
        surfaceHolder.addCallback(this.f7932w);
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
    public final void S(float f7) {
        F1();
        float h = e2.l0.h(f7, 0.0f, 1.0f);
        float f10 = this.f7898b0;
        if (f10 == h) {
            return;
        }
        if (h != 0.0f) {
            f10 = h;
        }
        this.f7900c0 = f10;
        this.f7898b0 = h;
        this.f7914l.f8063n.b(32, Float.valueOf(h)).b();
        this.f7916m.e(22, new t(h, 0));
    }

    @Override
    public final void U(List list, int i10, long j10) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i10, j10, g12, false);
    }

    @Override
    public final b2.y0 V() {
        F1();
        return this.f7922p0.f7973f;
    }

    @Override
    public final void W(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.l0.f6165a + "] [" + b2.q0.b() + "]");
        F1();
        this.f7934y.x();
        this.f7935z.c(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f6131f.f6151a.removeCallbacksAndMessages(null);
        e0Var.f6128a.C(e0Var.f6129b);
        s0 s0Var = this.f7914l;
        if (!s0Var.Z && s0Var.f8070s.getThread().isAlive()) {
            s0Var.Z = true;
            e2.i iVar = new e2.i(s0Var.F);
            s0Var.f8063n.b(7, iVar).b();
            z10 = iVar.c(s0Var.K);
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f7916m.e(10, new d2.c(19));
        }
        this.f7916m.d();
        this.f7910j.f6151a.removeCallbacksAndMessages(null);
        y2.c cVar = this.f7931u;
        j2.g gVar = this.f7927s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).f54146c.f48113a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.f54131b == gVar) {
                bVar.f54132c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        m1 m1Var = this.f7922p0;
        if (m1Var.f7982p) {
            this.f7922p0 = m1Var.a();
        }
        m1 n12 = n1(this.f7922p0, 1);
        this.f7922p0 = n12;
        m1 c10 = n12.c(n12.f7971b);
        this.f7922p0 = c10;
        c10.f7983q = c10.f7985s;
        this.f7922p0.f7984r = 0L;
        j2.g gVar2 = this.f7927s;
        e2.i0 i0Var = gVar2.f9355n;
        i0Var.getClass();
        i0Var.d(new gg.c(gVar2, 14));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f7902e0 = d2.d.d;
        this.f7909i0 = true;
    }

    @Override
    public final long Y() {
        F1();
        return this.m0;
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
            t6.f(z11);
            b2.o1 o1Var = this.f7922p0.f7970a;
            if (!o1Var.p() && i10 >= o1Var.o()) {
                return;
            }
            j2.g gVar = this.f7927s;
            if (!gVar.f9356r) {
                j2.a Q = gVar.Q();
                gVar.f9356r = true;
                gVar.V(Q, -1, new ig.c0(Q, 3));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                p0 p0Var = new p0(this.f7922p0);
                p0Var.f(1);
                i0 i0Var = this.f7912k.f8114b;
                i0Var.f7910j.d(new d1.e(15, i0Var, p0Var));
                return;
            }
            m1 m1Var = this.f7922p0;
            int i11 = m1Var.e;
            if (i11 == 3 || (i11 == 4 && !o1Var.p())) {
                m1Var = this.f7922p0.h(2);
            }
            int m0 = m0();
            m1 o12 = o1(m1Var, o1Var, p1(o1Var, i10, j10));
            this.f7914l.f8063n.b(3, new r0(o1Var, i10, e2.l0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), m0, z10);
        }
    }

    @Override
    public final long Z() {
        F1();
        return i1(this.f7922p0);
    }

    @Override
    public final void a() {
        int i10;
        F1();
        m1 m1Var = this.f7922p0;
        if (m1Var.e != 1) {
            return;
        }
        m1 f7 = m1Var.f(null);
        if (f7.f7970a.p()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        m1 n12 = n1(f7, i10);
        this.J++;
        this.f7914l.f8063n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void a0(int i10, List list) {
        boolean z10;
        boolean z11;
        F1();
        ArrayList g12 = g1(list);
        F1();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        int min = Math.min(i10, this.f7921p.size());
        if (this.f7922p0.f7970a.p()) {
            if (this.f7924q0 == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        D1(e1(this.f7922p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final void b0() {
        F1();
        if (this.f7898b0 == 0.0f) {
            float f7 = this.f7900c0;
            if (f7 != 0.0f) {
                S(f7);
            }
        }
    }

    @Override
    public final void c(b2.z0 z0Var) {
        F1();
        if (this.f7922p0.f7981o.equals(z0Var)) {
            return;
        }
        m1 g10 = this.f7922p0.g(z0Var);
        this.J++;
        this.f7914l.f8063n.b(4, z0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override
    public final long c0() {
        F1();
        if (n()) {
            m1 m1Var = this.f7922p0;
            if (m1Var.f7977k.equals(m1Var.f7971b)) {
                return e2.l0.h0(this.f7922p0.f7983q);
            }
            return getDuration();
        }
        return F0();
    }

    @Override
    public final boolean d() {
        F1();
        return this.f7922p0.f7974g;
    }

    public final m1 e1(m1 m1Var, int i10, ArrayList arrayList) {
        b2.o1 o1Var = m1Var.f7970a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f7921p;
            if (i11 < size) {
                k1 k1Var = new k1((u2.a) arrayList.get(i11), this.f7923q);
                arrayList2.add(k1Var);
                arrayList3.add(i11 + i10, new e0(k1Var.f7950b, k1Var.f7949a));
                i11++;
            } else {
                this.O = this.O.f(i10, arrayList2.size());
                r1 r1Var = new r1(arrayList3, this.O);
                m1 o12 = o1(m1Var, r1Var, l1(o1Var, r1Var, k1(m1Var), i1(m1Var)));
                u2.i1 i1Var = this.O;
                e2.i0 i0Var = this.f7914l.f8063n;
                n0 n0Var = new n0(arrayList2, i1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.f6147a = i0Var.f6151a.obtainMessage(18, i10, 0, n0Var);
                c10.b();
                return o12;
            }
        }
    }

    @Override
    public final void f0(int i10) {
        F1();
    }

    public final b2.s0 f1() {
        boolean z10;
        b2.o1 y02 = y0();
        if (y02.p()) {
            return this.f7920o0;
        }
        b2.p0 p0Var = y02.m(m0(), (b2.n1) this.f2047a, 0L).f2139c;
        b2.r0 a2 = this.f7920o0.a();
        b2.s0 s0Var = p0Var.d;
        if (s0Var != null) {
            e9.n0 n0Var = s0Var.K;
            byte[] bArr = s0Var.f2254k;
            CharSequence charSequence = s0Var.f2247a;
            if (charSequence != null) {
                a2.f2199a = charSequence;
            }
            CharSequence charSequence2 = s0Var.f2248b;
            if (charSequence2 != null) {
                a2.f2200b = charSequence2;
            }
            CharSequence charSequence3 = s0Var.f2249c;
            if (charSequence3 != null) {
                a2.f2201c = charSequence3;
            }
            CharSequence charSequence4 = s0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = s0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = s0Var.f2250f;
            if (charSequence6 != null) {
                a2.f2202f = charSequence6;
            }
            CharSequence charSequence7 = s0Var.f2251g;
            if (charSequence7 != null) {
                a2.f2203g = charSequence7;
            }
            Long l4 = s0Var.h;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.f(z10);
                a2.h = l4;
            }
            b2.g1 g1Var = s0Var.f2252i;
            if (g1Var != null) {
                a2.f2204i = g1Var;
            }
            b2.g1 g1Var2 = s0Var.f2253j;
            if (g1Var2 != null) {
                a2.f2205j = g1Var2;
            }
            Uri uri = s0Var.f2257n;
            if (uri != null || bArr != null) {
                a2.f2209n = uri;
                a2.b(bArr, s0Var.f2256m);
                a2.f2207l = s0Var.f2255l;
            }
            Integer num = s0Var.f2258o;
            if (num != null) {
                a2.f2210o = num;
            }
            Integer num2 = s0Var.f2259p;
            if (num2 != null) {
                a2.f2211p = num2;
            }
            Integer num3 = s0Var.f2260q;
            if (num3 != null) {
                a2.f2212q = num3;
            }
            Boolean bool = s0Var.f2261r;
            if (bool != null) {
                a2.f2213r = bool;
            }
            Boolean bool2 = s0Var.f2262s;
            if (bool2 != null) {
                a2.f2214s = bool2;
            }
            Integer num4 = s0Var.f2263t;
            if (num4 != null) {
                a2.f2215t = num4;
            }
            Integer num5 = s0Var.f2264u;
            if (num5 != null) {
                a2.f2215t = num5;
            }
            Integer num6 = s0Var.v;
            if (num6 != null) {
                a2.f2216u = num6;
            }
            Integer num7 = s0Var.f2265w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = s0Var.f2266x;
            if (num8 != null) {
                a2.f2217w = num8;
            }
            Integer num9 = s0Var.f2267y;
            if (num9 != null) {
                a2.f2218x = num9;
            }
            Integer num10 = s0Var.f2268z;
            if (num10 != null) {
                a2.f2219y = num10;
            }
            CharSequence charSequence8 = s0Var.A;
            if (charSequence8 != null) {
                a2.f2220z = charSequence8;
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
    public final b2.z0 g() {
        F1();
        return this.f7922p0.f7981o;
    }

    @Override
    public final b2.w1 g0() {
        F1();
        return this.f7922p0.f7975i.d;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f7925r.a((b2.p0) list.get(i10)));
        }
        return arrayList;
    }

    @Override
    public final long getDuration() {
        F1();
        if (n()) {
            m1 m1Var = this.f7922p0;
            u2.g0 g0Var = m1Var.f7971b;
            b2.o1 o1Var = m1Var.f7970a;
            Object obj = g0Var.f49875a;
            b2.l1 l1Var = this.f7919o;
            o1Var.g(obj, l1Var);
            return e2.l0.h0(l1Var.a(g0Var.f49876b, g0Var.f49877c));
        }
        return z();
    }

    @Override
    public final int h() {
        F1();
        return this.f7922p0.e;
    }

    @Override
    public final b2.s0 h0() {
        F1();
        return this.R;
    }

    public final p1 h1(o1 o1Var) {
        int k12 = k1(this.f7922p0);
        b2.o1 o1Var2 = this.f7922p0.f7970a;
        if (k12 == -1) {
            k12 = 0;
        }
        s0 s0Var = this.f7914l;
        return new p1(s0Var, o1Var, o1Var2, k12, s0Var.f8070s);
    }

    public final long i1(m1 m1Var) {
        u2.g0 g0Var = m1Var.f7971b;
        long j10 = m1Var.f7972c;
        b2.o1 o1Var = m1Var.f7970a;
        if (g0Var.b()) {
            Object obj = m1Var.f7971b.f49875a;
            b2.l1 l1Var = this.f7919o;
            o1Var.g(obj, l1Var);
            if (j10 == -9223372036854775807L) {
                return e2.l0.h0(o1Var.m(k1(m1Var), (b2.n1) this.f2047a, 0L).f2145l);
            }
            return e2.l0.h0(j10) + e2.l0.h0(l1Var.e);
        }
        return e2.l0.h0(j1(m1Var));
    }

    @Override
    public final d2.d j0() {
        F1();
        return this.f7902e0;
    }

    public final long j1(m1 m1Var) {
        long j10;
        if (m1Var.f7970a.p()) {
            return e2.l0.S(this.f7926r0);
        }
        if (m1Var.f7982p) {
            j10 = m1Var.l();
        } else {
            j10 = m1Var.f7985s;
        }
        if (m1Var.f7971b.b()) {
            return j10;
        }
        b2.o1 o1Var = m1Var.f7970a;
        Object obj = m1Var.f7971b.f49875a;
        b2.l1 l1Var = this.f7919o;
        o1Var.g(obj, l1Var);
        return j10 + l1Var.e;
    }

    @Override
    public final void k(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.f7914l.f8063n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f6147a = i0Var.f6151a.obtainMessage(11, i10, 0);
            c10.b();
            w wVar = new w(i10, 0);
            e2.r rVar = this.f7916m;
            rVar.c(8, wVar);
            B1();
            rVar.b();
        }
    }

    public final int k1(m1 m1Var) {
        if (m1Var.f7970a.p()) {
            return this.f7924q0;
        }
        return m1Var.f7970a.g(m1Var.f7971b.f49875a, this.f7919o).f2109c;
    }

    @Override
    public final int l() {
        F1();
        return 0;
    }

    @Override
    public final int l0() {
        F1();
        if (n()) {
            return this.f7922p0.f7971b.f49876b;
        }
        return -1;
    }

    public final Pair l1(b2.o1 o1Var, r1 r1Var, int i10, long j10) {
        boolean z10;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        if (!o1Var.p() && !r1Var.p()) {
            Pair i12 = o1Var.i((b2.n1) this.f2047a, this.f7919o, i10, e2.l0.S(j10));
            Object obj = i12.first;
            if (r1Var.b(obj) != -1) {
                return i12;
            }
            int U = s0.U((b2.n1) this.f2047a, this.f7919o, this.H, this.I, obj, o1Var, r1Var);
            if (U != -1) {
                b2.n1 n1Var = (b2.n1) this.f2047a;
                r1Var.m(U, n1Var, 0L);
                return p1(r1Var, U, e2.l0.h0(n1Var.f2145l));
            }
            return p1(r1Var, -1, -9223372036854775807L);
        }
        if (!o1Var.p() && r1Var.p()) {
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
        return p1(r1Var, i11, j11);
    }

    @Override
    public final int m() {
        F1();
        return this.H;
    }

    @Override
    public final int m0() {
        F1();
        int k12 = k1(this.f7922p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    @Override
    public final boolean n() {
        F1();
        return this.f7922p0.f7971b.b();
    }

    @Override
    public final void o0(b2.d1 d1Var) {
        d1Var.getClass();
        this.f7916m.a(d1Var);
    }

    public final m1 o1(m1 m1Var, b2.o1 o1Var, Pair pair) {
        boolean z10;
        u2.g0 g0Var;
        u2.r1 r1Var;
        x2.u uVar;
        List list;
        int i10;
        long j10;
        if (!o1Var.p() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.f(z10);
        b2.o1 o1Var2 = m1Var.f7970a;
        long i12 = i1(m1Var);
        m1 j11 = m1Var.j(o1Var);
        if (o1Var.p()) {
            u2.g0 g0Var2 = m1.f7969u;
            long S = e2.l0.S(this.f7926r0);
            m1 c10 = j11.d(g0Var2, S, S, S, 0L, u2.r1.d, this.f7897b, x1.e).c(g0Var2);
            c10.f7983q = c10.f7985s;
            return c10;
        }
        Object obj = j11.f7971b.f49875a;
        String str = e2.l0.f6165a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            g0Var = new u2.g0(pair.first);
        } else {
            g0Var = j11.f7971b;
        }
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.l0.S(i12);
        if (!o1Var2.p()) {
            S2 -= o1Var2.g(obj, this.f7919o).e;
            if (equals && S2 - longValue == 1 && S2 == o1Var2.g(obj, this.f7919o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.g0 g0Var3 = g0Var;
            t6.p(!g0Var3.b());
            if (!equals) {
                r1Var = u2.r1.d;
            } else {
                r1Var = j11.h;
            }
            u2.r1 r1Var2 = r1Var;
            if (!equals) {
                uVar = this.f7897b;
            } else {
                uVar = j11.f7975i;
            }
            x2.u uVar2 = uVar;
            if (!equals) {
                e9.l0 l0Var = e9.n0.f6390b;
                list = x1.e;
            } else {
                list = j11.f7976j;
            }
            m1 c11 = j11.d(g0Var3, longValue, longValue, longValue, 0L, r1Var2, uVar2, list).c(g0Var3);
            c11.f7983q = longValue;
            return c11;
        } else if (i10 == 0) {
            int b10 = o1Var.b(j11.f7977k.f49875a);
            if (b10 != -1 && o1Var.f(b10, this.f7919o, false).f2109c == o1Var.g(g0Var.f49875a, this.f7919o).f2109c) {
                return j11;
            }
            o1Var.g(g0Var.f49875a, this.f7919o);
            if (g0Var.b()) {
                j10 = this.f7919o.a(g0Var.f49876b, g0Var.f49877c);
            } else {
                j10 = this.f7919o.d;
            }
            u2.g0 g0Var4 = g0Var;
            m1 c12 = j11.d(g0Var4, j11.f7985s, j11.f7985s, j11.d, j10 - j11.f7985s, j11.h, j11.f7975i, j11.f7976j).c(g0Var4);
            c12.f7983q = j10;
            return c12;
        } else {
            u2.g0 g0Var5 = g0Var;
            t6.p(!g0Var5.b());
            long max = Math.max(0L, j11.f7984r - (longValue - S2));
            long j12 = j11.f7983q;
            if (j11.f7977k.equals(j11.f7971b)) {
                j12 = longValue + max;
            }
            m1 d = j11.d(g0Var5, longValue, longValue, longValue, max, j11.h, j11.f7975i, j11.f7976j);
            d.f7983q = j12;
            return d;
        }
    }

    @Override
    public final void p(b2.u1 u1Var) {
        F1();
        x2.t tVar = this.f7908i;
        tVar.getClass();
        b2.u1 E0 = E0();
        if (!u1Var.equals(((x2.o) tVar).j())) {
            tVar.b(u1Var);
        }
        if (!E0.equals(u1Var)) {
            this.f7916m.e(19, new a1.c(u1Var, 25));
        }
    }

    @Override
    public final void p0(boolean z10) {
        F1();
    }

    public final Pair p1(b2.o1 o1Var, int i10, long j10) {
        if (o1Var.p()) {
            this.f7924q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f7926r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= o1Var.o()) {
            i10 = o1Var.a(this.I);
            j10 = e2.l0.h0(o1Var.m(i10, (b2.n1) this.f2047a, 0L).f2145l);
        }
        return o1Var.i((b2.n1) this.f2047a, this.f7919o, i10, e2.l0.S(j10));
    }

    @Override
    public final long q() {
        F1();
        return e2.l0.h0(this.f7922p0.f7984r);
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.f6211a && i11 == yVar.f6212b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        n61 n61Var = this.f7928s0;
        if (n61Var != null) {
            n61Var.execute(new u(this, i10, i11, 0));
            return;
        }
        this.f7916m.e(24, new v(i10, i11, 0));
        t1(2, 14, new e2.y(i10, i11));
    }

    @Override
    public final void r0(List list, int i10, int i11) {
        boolean z10;
        u2.q1 q1Var;
        F1();
        boolean z11 = true;
        if (i10 >= 0 && i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        ArrayList arrayList = this.f7921p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((e0) arrayList.get(i12)).f7841b.f50013k.a((b2.p0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.f7914l.f8063n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f6147a = i0Var.f6151a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                b2.o1 o1Var = e0Var.f7842c;
                b2.p0 p0Var = (b2.p0) list.get(i13 - i10);
                if (o1Var instanceof u2.q1) {
                    q1Var = new u2.q1(((u2.q1) o1Var).e, p0Var);
                } else {
                    q1Var = new u2.q1(o1Var, p0Var);
                }
                e0Var.f7842c = q1Var;
            }
            D1(this.f7922p0.j(new r1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (this.f7922p0.f7970a.p()) {
            if (this.f7924q0 != -1) {
                z11 = false;
            }
            F1();
            v1(-1, -9223372036854775807L, g12, z11);
            return;
        }
        m1 r12 = r1(e1(this.f7922p0, min, g12), i10, min);
        D1(r12, 0, !r12.f7971b.f49875a.equals(this.f7922p0.f7971b.f49875a), 4, j1(r12), -1, false);
    }

    public final m1 r1(m1 m1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(m1Var);
        long i12 = i1(m1Var);
        b2.o1 o1Var = m1Var.f7970a;
        this.J++;
        int i13 = i11 - 1;
        while (true) {
            arrayList = this.f7921p;
            if (i13 < i10) {
                break;
            }
            arrayList.remove(i13);
            i13--;
        }
        this.O = this.O.a(i10, i11);
        r1 r1Var = new r1(arrayList, this.O);
        m1 o12 = o1(m1Var, r1Var, l1(o1Var, r1Var, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (s0.U((b2.n1) this.f2047a, this.f7919o, this.H, this.I, m1Var.f7971b.f49875a, o1Var, r1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.i1 i1Var = this.O;
        e2.i0 i0Var = this.f7914l.f8063n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.f6147a = i0Var.f6151a.obtainMessage(20, i10, i11, i1Var);
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
        c0 c0Var = this.f7932w;
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
        this.f7902e0 = new d2.d(this.f7922p0.f7985s, x1.e);
    }

    @Override
    public final boolean t() {
        F1();
        return this.f7922p0.f7978l;
    }

    public final void t1(int i10, int i11, Object obj) {
        b[] bVarArr;
        b[] bVarArr2;
        for (b bVar : this.f7905g) {
            if (i10 == -1 || bVar.f7808b == i10) {
                p1 h12 = h1(bVar);
                t6.p(!h12.f8023f);
                h12.f8022c = i11;
                t6.p(!h12.f8023f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.f7808b == i10)) {
                p1 h13 = h1(bVar2);
                t6.p(!h13.f8023f);
                h13.f8022c = i11;
                t6.p(!h13.f8023f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override
    public final void u0(int i10, int i11, int i12) {
        boolean z10;
        F1();
        if (i10 >= 0 && i10 <= i11 && i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        ArrayList arrayList = this.f7921p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 < size && i10 != min && i10 != min2) {
            b2.o1 y02 = y0();
            this.J++;
            e2.l0.R(i10, min, min2, arrayList);
            this.O = this.O.g();
            r1 r1Var = new r1(arrayList, this.O);
            m1 m1Var = this.f7922p0;
            m1 o12 = o1(m1Var, r1Var, l1(y02, r1Var, k1(m1Var), i1(this.f7922p0)));
            u2.i1 i1Var = this.O;
            s0 s0Var = this.f7914l;
            s0Var.getClass();
            s0Var.f8063n.b(19, new o0(i10, min, min2, i1Var)).b();
            D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void u1(u2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    public final void v1(int i10, long j10, List list, boolean z10) {
        int i11;
        long j11;
        boolean z11;
        int k12 = k1(this.f7922p0);
        long M0 = M0();
        this.J++;
        ArrayList arrayList = this.f7921p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            k1 k1Var = new k1((u2.a) list.get(i12), this.f7923q);
            arrayList2.add(k1Var);
            arrayList.add(i12, new e0(k1Var.f7950b, k1Var.f7949a));
        }
        this.O = this.O.c(arrayList2.size());
        r1 r1Var = new r1(arrayList, this.O);
        boolean p5 = r1Var.p();
        int i13 = r1Var.h;
        if (!p5 && i10 >= i13) {
            throw new IllegalStateException();
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = r1Var.a(this.I);
        } else if (i10 == -1) {
            i11 = k12;
            j11 = M0;
        } else {
            i11 = i10;
            j11 = j10;
        }
        m1 o12 = o1(this.f7922p0, r1Var, p1(r1Var, i11, j11));
        int i14 = o12.e;
        if (i14 == 1) {
            i14 = 1;
        } else {
            if (!r1Var.p()) {
                if (i11 != -1) {
                    if (i11 < i13) {
                        i14 = 2;
                    }
                }
            }
            i14 = 4;
        }
        m1 n12 = n1(o12, i14);
        this.f7914l.f8063n.b(17, new n0(arrayList2, this.O, i11, e2.l0.S(j11))).b();
        if (!this.f7922p0.f7971b.f49875a.equals(n12.f7971b.f49875a) && !this.f7922p0.f7970a.p()) {
            z11 = true;
        } else {
            z11 = false;
        }
        D1(n12, 0, z11, 4, j1(n12), -1, false);
    }

    @Override
    public final void w(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            e2.i0 i0Var = this.f7914l.f8063n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.f6147a = i0Var.f6151a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            y yVar = new y(0, z10);
            e2.r rVar = this.f7916m;
            rVar.c(9, yVar);
            B1();
            rVar.b();
        }
    }

    @Override
    public final int w0() {
        F1();
        return this.f7922p0.f7980n;
    }

    public final void w1(v1 v1Var) {
        F1();
        if (v1Var == null) {
            v1Var = v1.f8102f;
        }
        if (!this.N.equals(v1Var)) {
            this.N = v1Var;
            this.f7914l.f8063n.b(5, v1Var).b();
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
        s0 s0Var = this.f7914l;
        if (!s0Var.Z && s0Var.f8070s.getThread().isAlive()) {
            e2.i iVar = new e2.i(s0Var.F);
            s0Var.f8063n.b(30, new Pair(surface, iVar)).b();
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
            A1(new l(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override
    public final long y() {
        F1();
        return this.f7918n0;
    }

    @Override
    public final b2.o1 y0() {
        F1();
        return this.f7922p0.f7970a;
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
        textureView.setSurfaceTextureListener(this.f7932w);
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
