package defpackage;

import android.os.Handler;
import org.telegram.ui.Components.q;
public final class c30 implements bg8 {
    public final byte a;
    public final Object b;

    public c30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void A(int i, cg8 cg8Var, cg8 cg8Var2) {
        byte b = this.a;
    }

    @Override
    public final void B(nt6 nt6Var) {
        byte b = this.a;
    }

    @Override
    public final void C(nt6 nt6Var) {
        byte b = this.a;
    }

    @Override
    public final void D(asb asbVar, int i) {
        byte b = this.a;
    }

    @Override
    public final void E(e64 e64Var) {
        byte b = this.a;
    }

    @Override
    public final void F(e64 e64Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((i30) obj).g(e64Var);
                return;
            case 1:
                jp9 jp9Var = (jp9) obj;
                sn9 sn9Var = jp9Var.m;
                sn9Var.b("preview player error: code=" + e64Var.a);
                jp9Var.h(e64Var);
                return;
            case 2:
                cc4.e("[RtmpStream] player error", e64Var);
                rr9 rr9Var = (rr9) obj;
                rr9Var.j.clear();
                s64 s64Var = rr9Var.f;
                if (s64Var != null) {
                    s64Var.t();
                    rr9Var.f.a();
                    return;
                }
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void G(j99 j99Var) {
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
                kfc kfcVar = (kfc) this.b;
                if (!kfcVar.I && i == 3) {
                    kfcVar.I = true;
                    if (kfcVar.H && kfcVar.J) {
                        kfcVar.g0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void J(of8 of8Var) {
        byte b = this.a;
    }

    @Override
    public final void K(zf8 zf8Var) {
        byte b = this.a;
    }

    @Override
    public final void L(uf7 uf7Var) {
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
                i30 i30Var = (i30) obj;
                z20 z20Var = i30Var.E;
                Handler handler = i30Var.i;
                if (i30Var.u != z) {
                    i30Var.u = z;
                    handler.removeCallbacks(z20Var);
                    if (z) {
                        handler.post(z20Var);
                    }
                    i30Var.f.getClass();
                    i30Var.m();
                    return;
                }
                return;
            case 1:
                jp9 jp9Var = (jp9) obj;
                if (jp9Var.a0 == 5) {
                    jp9Var.z(z);
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
    public final void a(ggc ggcVar) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                qr9 qr9Var = ((rr9) this.b).g;
                if (qr9Var != null && (i = ggcVar.a) > 0 && (i2 = ggcVar.b) > 0) {
                    qr9Var.a(i, i2);
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
    public final void c(ag8 ag8Var) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                q90 q90Var = (q90) this.b;
                ((udb) q90Var.g).a();
                ((vdb) q90Var.h).a();
                ((wdb) q90Var.i).a();
                ((xdb) q90Var.j).a();
                return;
            default:
                return;
        }
    }

    @Override
    public final void d(int i) {
        byte b = this.a;
    }

    @Override
    public final void e(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void f(int i) {
        byte b = this.a;
    }

    @Override
    public final void g(int i) {
        byte b = this.a;
    }

    @Override
    public final void h(boolean z) {
        byte b = this.a;
    }

    @Override
    public final void l(oz ozVar) {
        byte b = this.a;
    }

    @Override
    public final void m(c2c c2cVar) {
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
                jp9 jp9Var = (jp9) this.b;
                if (jp9Var.a0 == 5) {
                    ((q) jp9Var.d.b).o();
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
    public final void r(int i, ft6 ft6Var) {
        byte b = this.a;
    }

    @Override
    public final void t(int i) {
        s64 s64Var;
        s64 s64Var2;
        String str;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                i30 i30Var = (i30) obj;
                if (i == 4 && i30Var.G == 5 && (s64Var = i30Var.A) != null) {
                    s64Var.k1(i30Var.r);
                    i30Var.A.V(false);
                    return;
                }
                return;
            case 1:
                jp9 jp9Var = (jp9) obj;
                jp9Var.m.b("preview playback state=" + i);
                if (jp9Var.a0 == 5 && i == 4 && (s64Var2 = jp9Var.W) != null) {
                    s64Var2.k1(jp9Var.K);
                    jp9Var.W.V(true);
                    return;
                }
                return;
            case 2:
                rr9 rr9Var = (rr9) obj;
                if (i == 4) {
                    z = true;
                }
                rr9Var.l = z;
                if (rr9Var.f != null) {
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
                    sb.append(rr9Var.f.l0());
                    sb.append("/");
                    sb.append(rr9Var.j.size());
                    sb.append(" +");
                    sb.append(rr9Var.f.k());
                    sb.append(" ms");
                    rr9Var.c(sb.toString());
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
    public final void x(n43 n43Var) {
        byte b = this.a;
    }

    @Override
    public final void z(f2c f2cVar) {
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

    private final void A0(nt6 nt6Var) {
    }

    private final void B0(nt6 nt6Var) {
    }

    private final void C0(nt6 nt6Var) {
    }

    private final void D0(nt6 nt6Var) {
    }

    private final void E0(nt6 nt6Var) {
    }

    private final void F0(uf7 uf7Var) {
    }

    private final void F1(int i) {
    }

    private final void G0(uf7 uf7Var) {
    }

    private final void G1(int i) {
    }

    private final void H0(uf7 uf7Var) {
    }

    private final void H1(int i) {
    }

    private final void I(int i) {
    }

    private final void I0(uf7 uf7Var) {
    }

    private final void I1(int i) {
    }

    private final void J0(uf7 uf7Var) {
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

    private final void O(zf8 zf8Var) {
    }

    private final void O1(boolean z) {
    }

    private final void P0(of8 of8Var) {
    }

    private final void P1(boolean z) {
    }

    private final void Q(zf8 zf8Var) {
    }

    private final void Q0(of8 of8Var) {
    }

    private final void Q1(boolean z) {
    }

    private final void R(zf8 zf8Var) {
    }

    private final void R0(of8 of8Var) {
    }

    private final void R1(boolean z) {
    }

    private final void S(zf8 zf8Var) {
    }

    private final void S0(of8 of8Var) {
    }

    private final void S1(boolean z) {
    }

    private final void T(zf8 zf8Var) {
    }

    private final void T0(of8 of8Var) {
    }

    private final void T1(boolean z) {
    }

    private final void U(n43 n43Var) {
    }

    private final void U0(int i) {
    }

    private final void V(j99 j99Var) {
    }

    private final void V0(int i) {
    }

    private final void W(n43 n43Var) {
    }

    private final void W0(int i) {
    }

    private final void X(j99 j99Var) {
    }

    private final void X0(int i) {
    }

    private final void Y(n43 n43Var) {
    }

    private final void Y0(int i) {
    }

    private final void Z(j99 j99Var) {
    }

    private final void Z0(int i) {
    }

    private final void a0(n43 n43Var) {
    }

    private final void a1(int i) {
    }

    private final void b0(j99 j99Var) {
    }

    private final void b1(e64 e64Var) {
    }

    private final void c0(n43 n43Var) {
    }

    private final void c1(e64 e64Var) {
    }

    private final void d0(j99 j99Var) {
    }

    private final void d1(e64 e64Var) {
    }

    private final void e0(ag8 ag8Var) {
    }

    private final void e1(e64 e64Var) {
    }

    private final void e2(c2c c2cVar) {
    }

    private final void f0(ag8 ag8Var) {
    }

    private final void f1(e64 e64Var) {
    }

    private final void f2(c2c c2cVar) {
    }

    private final void g0(ag8 ag8Var) {
    }

    private final void g1(e64 e64Var) {
    }

    private final void g2(c2c c2cVar) {
    }

    private final void h0(ag8 ag8Var) {
    }

    private final void h1(e64 e64Var) {
    }

    private final void h2(c2c c2cVar) {
    }

    private final void i(oz ozVar) {
    }

    private final void i0(boolean z) {
    }

    private final void i2(c2c c2cVar) {
    }

    private final void j(oz ozVar) {
    }

    private final void j0(boolean z) {
    }

    private final void j2(f2c f2cVar) {
    }

    private final void k(oz ozVar) {
    }

    private final void k0(boolean z) {
    }

    private final void k2(f2c f2cVar) {
    }

    private final void l0(boolean z) {
    }

    private final void l2(f2c f2cVar) {
    }

    private final void m0(boolean z) {
    }

    private final void m1(nt6 nt6Var) {
    }

    private final void m2(f2c f2cVar) {
    }

    private final void n(oz ozVar) {
    }

    private final void n0(boolean z) {
    }

    private final void n1(nt6 nt6Var) {
    }

    private final void n2(f2c f2cVar) {
    }

    private final void o0(boolean z) {
    }

    private final void o1(nt6 nt6Var) {
    }

    private final void o2(ggc ggcVar) {
    }

    private final void p0(boolean z) {
    }

    private final void p1(nt6 nt6Var) {
    }

    private final void p2(ggc ggcVar) {
    }

    private final void q0(boolean z) {
    }

    private final void q1(nt6 nt6Var) {
    }

    private final void q2(ggc ggcVar) {
    }

    private final void r0(boolean z) {
    }

    private final void r1(int i) {
    }

    private final void r2(ggc ggcVar) {
    }

    private final void s(oz ozVar) {
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

    private final void Z1(asb asbVar, int i) {
    }

    private final void a2(asb asbVar, int i) {
    }

    private final void b2(asb asbVar, int i) {
    }

    private final void c2(asb asbVar, int i) {
    }

    private final void d2(asb asbVar, int i) {
    }

    private final void i1(int i, boolean z) {
    }

    private final void j1(int i, boolean z) {
    }

    private final void k1(int i, boolean z) {
    }

    private final void l1(int i, boolean z) {
    }

    private final void v0(int i, ft6 ft6Var) {
    }

    private final void w0(int i, ft6 ft6Var) {
    }

    private final void x0(int i, ft6 ft6Var) {
    }

    private final void y0(int i, ft6 ft6Var) {
    }

    private final void z0(int i, ft6 ft6Var) {
    }

    private final void A1(int i, cg8 cg8Var, cg8 cg8Var2) {
    }

    private final void s1(int i, cg8 cg8Var, cg8 cg8Var2) {
    }

    private final void u1(int i, cg8 cg8Var, cg8 cg8Var2) {
    }

    private final void w1(int i, cg8 cg8Var, cg8 cg8Var2) {
    }

    private final void y1(int i, cg8 cg8Var, cg8 cg8Var2) {
    }
}
