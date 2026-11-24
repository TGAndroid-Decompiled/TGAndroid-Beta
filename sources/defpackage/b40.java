package defpackage;

import android.os.Handler;
import org.telegram.ui.Components.q;
public final class b40 implements pe8 {
    public final byte a;
    public final Object b;

    public b40(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void A(int i, qe8 qe8Var, qe8 qe8Var2) {
        byte b = this.a;
    }

    @Override
    public final void B(jt6 jt6Var) {
        byte b = this.a;
    }

    @Override
    public final void C(jt6 jt6Var) {
        byte b = this.a;
    }

    @Override
    public final void D(bqb bqbVar, int i) {
        byte b = this.a;
    }

    @Override
    public final void E(u64 u64Var) {
        byte b = this.a;
    }

    @Override
    public final void F(u64 u64Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((h40) obj).g(u64Var);
                return;
            case 1:
                un9 un9Var = (un9) obj;
                fm9 fm9Var = un9Var.m;
                fm9Var.b("preview player error: code=" + u64Var.a);
                un9Var.h(u64Var);
                return;
            case 2:
                fc4.e("[RtmpStream] player error", u64Var);
                bq9 bq9Var = (bq9) obj;
                bq9Var.j.clear();
                h74 h74Var = bq9Var.f;
                if (h74Var != null) {
                    h74Var.t();
                    bq9Var.f.a();
                    return;
                }
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void G(y79 y79Var) {
        byte b = this.a;
    }

    @Override
    public final void H(int i, boolean z) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ndc ndcVar = (ndc) this.b;
                if (!ndcVar.I && i == 3) {
                    ndcVar.I = true;
                    if (ndcVar.H && ndcVar.J) {
                        ndcVar.g0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void J(ce8 ce8Var) {
        byte b = this.a;
    }

    @Override
    public final void K(ne8 ne8Var) {
        byte b = this.a;
    }

    @Override
    public final void L(nf7 nf7Var) {
        byte b = this.a;
    }

    @Override
    public final void M(int i, int i2) {
        byte b = this.a;
    }

    @Override
    public final void P(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h40 h40Var = (h40) obj;
                z30 z30Var = h40Var.E;
                Handler handler = h40Var.i;
                if (h40Var.u != z) {
                    h40Var.u = z;
                    handler.removeCallbacks(z30Var);
                    if (z) {
                        handler.post(z30Var);
                    }
                    h40Var.f.getClass();
                    h40Var.m();
                    return;
                }
                return;
            case 1:
                un9 un9Var = (un9) obj;
                if (un9Var.a0 == 5) {
                    un9Var.z(z);
                    return;
                }
                return;
            case 2:
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void a(jec jecVar) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                aq9 aq9Var = ((bq9) this.b).g;
                if (aq9Var != null && (i = jecVar.a) > 0 && (i2 = jecVar.b) > 0) {
                    aq9Var.a(i, i2);
                    return;
                }
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
    }

    @Override
    public final void d(oe8 oe8Var) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                oa0 oa0Var = (oa0) this.b;
                ((ybb) oa0Var.g).a();
                ((zbb) oa0Var.h).a();
                ((acb) oa0Var.i).a();
                ((bcb) oa0Var.j).a();
                return;
            default:
                return;
        }
    }

    @Override
    public final void e(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void f(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void g(int i) {
        byte b = this.a;
    }

    @Override
    public final void h(int i) {
        byte b = this.a;
    }

    @Override
    public final void l(o00 o00Var) {
        byte b = this.a;
    }

    @Override
    public final void m(d0c d0cVar) {
        byte b = this.a;
    }

    @Override
    public final void o(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                return;
            case 1:
                un9 un9Var = (un9) this.b;
                if (un9Var.a0 == 5) {
                    ((q) un9Var.d.a).o();
                    return;
                }
                return;
            case 2:
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void p(int i, boolean z) {
        byte b = this.a;
    }

    @Override
    public final void q(float f) {
        byte b = this.a;
    }

    @Override
    public final void r(int i, bt6 bt6Var) {
        byte b = this.a;
    }

    @Override
    public final void t(int i) {
        h74 h74Var;
        h74 h74Var2;
        String str;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                h40 h40Var = (h40) obj;
                if (i == 4 && h40Var.G == 5 && (h74Var = h40Var.A) != null) {
                    h74Var.k1(h40Var.r);
                    h40Var.A.V(false);
                    return;
                }
                return;
            case 1:
                un9 un9Var = (un9) obj;
                un9Var.m.b("preview playback state=" + i);
                if (un9Var.a0 == 5 && i == 4 && (h74Var2 = un9Var.W) != null) {
                    h74Var2.k1(un9Var.K);
                    un9Var.W.V(true);
                    return;
                }
                return;
            case 2:
                bq9 bq9Var = (bq9) obj;
                if (i == 4) {
                    z = true;
                }
                bq9Var.l = z;
                if (bq9Var.f != null) {
                    StringBuilder sb = new StringBuilder("player state ");
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    str = String.valueOf(i);
                                } else {
                                    str = "ended";
                                }
                            } else {
                                str = "ready";
                            }
                        } else {
                            str = "buffering";
                        }
                    } else {
                        str = "idle";
                    }
                    sb.append(str);
                    sb.append(" at item ");
                    sb.append(bq9Var.f.l0());
                    sb.append("/");
                    sb.append(bq9Var.j.size());
                    sb.append(" +");
                    sb.append(bq9Var.f.k());
                    sb.append(" ms");
                    bq9Var.d(sb.toString());
                    return;
                }
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void v(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void x(g53 g53Var) {
        byte b = this.a;
    }

    @Override
    public final void z(g0c g0cVar) {
        byte b = this.a;
    }

    private final void B1() {
    }

    private final void C1() {
    }

    private final void D1() {
    }

    private final void E1() {
    }

    private final void A0(jt6 jt6Var) {
    }

    private final void B0(jt6 jt6Var) {
    }

    private final void C0(jt6 jt6Var) {
    }

    private final void D0(jt6 jt6Var) {
    }

    private final void E0(jt6 jt6Var) {
    }

    private final void F0(nf7 nf7Var) {
    }

    private final void F1(int i) {
    }

    private final void G0(nf7 nf7Var) {
    }

    private final void G1(int i) {
    }

    private final void H0(nf7 nf7Var) {
    }

    private final void H1(int i) {
    }

    private final void I(int i) {
    }

    private final void I0(nf7 nf7Var) {
    }

    private final void I1(int i) {
    }

    private final void J0(nf7 nf7Var) {
    }

    private final void J1(int i) {
    }

    private final void K1(boolean z) {
    }

    private final void L1(boolean z) {
    }

    private final void M1(boolean z) {
    }

    private final void N(int i) {
    }

    private final void N1(boolean z) {
    }

    private final void O(ne8 ne8Var) {
    }

    private final void O1(boolean z) {
    }

    private final void P0(ce8 ce8Var) {
    }

    private final void P1(boolean z) {
    }

    private final void Q(ne8 ne8Var) {
    }

    private final void Q0(ce8 ce8Var) {
    }

    private final void Q1(boolean z) {
    }

    private final void R(ne8 ne8Var) {
    }

    private final void R0(ce8 ce8Var) {
    }

    private final void R1(boolean z) {
    }

    private final void S(ne8 ne8Var) {
    }

    private final void S0(ce8 ce8Var) {
    }

    private final void S1(boolean z) {
    }

    private final void T(ne8 ne8Var) {
    }

    private final void T0(ce8 ce8Var) {
    }

    private final void T1(boolean z) {
    }

    private final void U(g53 g53Var) {
    }

    private final void U0(int i) {
    }

    private final void V(y79 y79Var) {
    }

    private final void V0(int i) {
    }

    private final void W(g53 g53Var) {
    }

    private final void W0(int i) {
    }

    private final void X(y79 y79Var) {
    }

    private final void X0(int i) {
    }

    private final void Y(g53 g53Var) {
    }

    private final void Y0(int i) {
    }

    private final void Z(y79 y79Var) {
    }

    private final void Z0(int i) {
    }

    private final void a0(g53 g53Var) {
    }

    private final void a1(int i) {
    }

    private final void b0(y79 y79Var) {
    }

    private final void b1(u64 u64Var) {
    }

    private final void c0(g53 g53Var) {
    }

    private final void c1(u64 u64Var) {
    }

    private final void d0(y79 y79Var) {
    }

    private final void d1(u64 u64Var) {
    }

    private final void e0(oe8 oe8Var) {
    }

    private final void e1(u64 u64Var) {
    }

    private final void e2(d0c d0cVar) {
    }

    private final void f0(oe8 oe8Var) {
    }

    private final void f1(u64 u64Var) {
    }

    private final void f2(d0c d0cVar) {
    }

    private final void g0(oe8 oe8Var) {
    }

    private final void g1(u64 u64Var) {
    }

    private final void g2(d0c d0cVar) {
    }

    private final void h0(oe8 oe8Var) {
    }

    private final void h1(u64 u64Var) {
    }

    private final void h2(d0c d0cVar) {
    }

    private final void i(o00 o00Var) {
    }

    private final void i0(boolean z) {
    }

    private final void i2(d0c d0cVar) {
    }

    private final void j(o00 o00Var) {
    }

    private final void j0(boolean z) {
    }

    private final void j2(g0c g0cVar) {
    }

    private final void k(o00 o00Var) {
    }

    private final void k0(boolean z) {
    }

    private final void k2(g0c g0cVar) {
    }

    private final void l0(boolean z) {
    }

    private final void l2(g0c g0cVar) {
    }

    private final void m0(boolean z) {
    }

    private final void m1(jt6 jt6Var) {
    }

    private final void m2(g0c g0cVar) {
    }

    private final void n(o00 o00Var) {
    }

    private final void n0(boolean z) {
    }

    private final void n1(jt6 jt6Var) {
    }

    private final void n2(g0c g0cVar) {
    }

    private final void o0(boolean z) {
    }

    private final void o1(jt6 jt6Var) {
    }

    private final void o2(jec jecVar) {
    }

    private final void p0(boolean z) {
    }

    private final void p1(jt6 jt6Var) {
    }

    private final void p2(jec jecVar) {
    }

    private final void q0(boolean z) {
    }

    private final void q1(jt6 jt6Var) {
    }

    private final void q2(jec jecVar) {
    }

    private final void r0(boolean z) {
    }

    private final void r1(int i) {
    }

    private final void r2(jec jecVar) {
    }

    private final void s(o00 o00Var) {
    }

    private final void s0(boolean z) {
    }

    private final void s2(float f) {
    }

    private final void t0(boolean z) {
    }

    private final void t1(int i) {
    }

    private final void t2(float f) {
    }

    private final void u(int i) {
    }

    private final void u0(boolean z) {
    }

    private final void u2(float f) {
    }

    private final void v1(int i) {
    }

    private final void v2(float f) {
    }

    private final void w(int i) {
    }

    private final void w2(float f) {
    }

    private final void x1(int i) {
    }

    private final void y(int i) {
    }

    private final void z1(int i) {
    }

    private final void K0(int i, boolean z) {
    }

    private final void L0(int i, boolean z) {
    }

    private final void M0(int i, boolean z) {
    }

    private final void N0(int i, boolean z) {
    }

    private final void O0(int i, boolean z) {
    }

    private final void U1(int i, int i2) {
    }

    private final void V1(int i, int i2) {
    }

    private final void W1(int i, int i2) {
    }

    private final void X1(int i, int i2) {
    }

    private final void Y1(int i, int i2) {
    }

    private final void Z1(bqb bqbVar, int i) {
    }

    private final void a2(bqb bqbVar, int i) {
    }

    private final void b2(bqb bqbVar, int i) {
    }

    private final void c2(bqb bqbVar, int i) {
    }

    private final void d2(bqb bqbVar, int i) {
    }

    private final void i1(int i, boolean z) {
    }

    private final void j1(int i, boolean z) {
    }

    private final void k1(int i, boolean z) {
    }

    private final void l1(int i, boolean z) {
    }

    private final void v0(int i, bt6 bt6Var) {
    }

    private final void w0(int i, bt6 bt6Var) {
    }

    private final void x0(int i, bt6 bt6Var) {
    }

    private final void y0(int i, bt6 bt6Var) {
    }

    private final void z0(int i, bt6 bt6Var) {
    }

    private final void A1(int i, qe8 qe8Var, qe8 qe8Var2) {
    }

    private final void s1(int i, qe8 qe8Var, qe8 qe8Var2) {
    }

    private final void u1(int i, qe8 qe8Var, qe8 qe8Var2) {
    }

    private final void w1(int i, qe8 qe8Var, qe8 qe8Var2) {
    }

    private final void y1(int i, qe8 qe8Var, qe8 qe8Var2) {
    }
}
