package defpackage;

import android.os.Handler;
import org.telegram.ui.Components.q;
public final class b30 implements mc8 {
    public final byte a;
    public final Object b;

    public b30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void A(int i, nc8 nc8Var, nc8 nc8Var2) {
        byte b = this.a;
    }

    @Override
    public final void B(jr6 jr6Var) {
        byte b = this.a;
    }

    @Override
    public final void C(jr6 jr6Var) {
        byte b = this.a;
    }

    @Override
    public final void D(aob aobVar, int i) {
        byte b = this.a;
    }

    @Override
    public final void E(j54 j54Var) {
        byte b = this.a;
    }

    @Override
    public final void F(j54 j54Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((h30) obj).g(j54Var);
                return;
            case 1:
                ul9 ul9Var = (ul9) obj;
                ek9 ek9Var = ul9Var.m;
                ek9Var.b("preview player error: code=" + j54Var.a);
                ul9Var.h(j54Var);
                return;
            case 2:
                fa4.e("[RtmpStream] player error", j54Var);
                ao9 ao9Var = (ao9) obj;
                ao9Var.j.clear();
                y54 y54Var = ao9Var.f;
                if (y54Var != null) {
                    y54Var.t();
                    ao9Var.f.a();
                    return;
                }
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final void G(w59 w59Var) {
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
                lbc lbcVar = (lbc) this.b;
                if (!lbcVar.I && i == 3) {
                    lbcVar.I = true;
                    if (lbcVar.H && lbcVar.J) {
                        lbcVar.g0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void J(zb8 zb8Var) {
        byte b = this.a;
    }

    @Override
    public final void K(kc8 kc8Var) {
        byte b = this.a;
    }

    @Override
    public final void L(ld7 ld7Var) {
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
                h30 h30Var = (h30) obj;
                y20 y20Var = h30Var.E;
                Handler handler = h30Var.i;
                if (h30Var.u != z) {
                    h30Var.u = z;
                    handler.removeCallbacks(y20Var);
                    if (z) {
                        handler.post(y20Var);
                    }
                    h30Var.f.getClass();
                    h30Var.m();
                    return;
                }
                return;
            case 1:
                ul9 ul9Var = (ul9) obj;
                if (ul9Var.a0 == 5) {
                    ul9Var.z(z);
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
    public final void a(icc iccVar) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                zn9 zn9Var = ((ao9) this.b).g;
                if (zn9Var != null && (i = iccVar.a) > 0 && (i2 = iccVar.b) > 0) {
                    zn9Var.a(i, i2);
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
    public final void c(lc8 lc8Var) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                o90 o90Var = (o90) this.b;
                ((w9b) o90Var.g).a();
                ((x9b) o90Var.h).a();
                ((y9b) o90Var.i).a();
                ((z9b) o90Var.j).a();
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
    public final void l(nz nzVar) {
        byte b = this.a;
    }

    @Override
    public final void m(byb bybVar) {
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
                ul9 ul9Var = (ul9) this.b;
                if (ul9Var.a0 == 5) {
                    ((q) ul9Var.d.a).o();
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
    public final void r(int i, br6 br6Var) {
        byte b = this.a;
    }

    @Override
    public final void t(int i) {
        y54 y54Var;
        y54 y54Var2;
        String str;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                h30 h30Var = (h30) obj;
                if (i == 4 && h30Var.G == 5 && (y54Var = h30Var.A) != null) {
                    y54Var.k1(h30Var.r);
                    h30Var.A.V(false);
                    return;
                }
                return;
            case 1:
                ul9 ul9Var = (ul9) obj;
                ul9Var.m.b("preview playback state=" + i);
                if (ul9Var.a0 == 5 && i == 4 && (y54Var2 = ul9Var.W) != null) {
                    y54Var2.k1(ul9Var.K);
                    ul9Var.W.V(true);
                    return;
                }
                return;
            case 2:
                ao9 ao9Var = (ao9) obj;
                if (i == 4) {
                    z = true;
                }
                ao9Var.l = z;
                if (ao9Var.f != null) {
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
                    sb.append(ao9Var.f.l0());
                    sb.append("/");
                    sb.append(ao9Var.j.size());
                    sb.append(" +");
                    sb.append(ao9Var.f.m());
                    sb.append(" ms");
                    ao9Var.d(sb.toString());
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
    public final void x(v33 v33Var) {
        byte b = this.a;
    }

    @Override
    public final void z(eyb eybVar) {
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

    private final void A0(jr6 jr6Var) {
    }

    private final void B0(jr6 jr6Var) {
    }

    private final void C0(jr6 jr6Var) {
    }

    private final void D0(jr6 jr6Var) {
    }

    private final void E0(jr6 jr6Var) {
    }

    private final void F0(ld7 ld7Var) {
    }

    private final void F1(int i) {
    }

    private final void G0(ld7 ld7Var) {
    }

    private final void G1(int i) {
    }

    private final void H0(ld7 ld7Var) {
    }

    private final void H1(int i) {
    }

    private final void I(int i) {
    }

    private final void I0(ld7 ld7Var) {
    }

    private final void I1(int i) {
    }

    private final void J0(ld7 ld7Var) {
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

    private final void O(kc8 kc8Var) {
    }

    private final void O1(boolean z) {
    }

    private final void P0(zb8 zb8Var) {
    }

    private final void P1(boolean z) {
    }

    private final void Q(kc8 kc8Var) {
    }

    private final void Q0(zb8 zb8Var) {
    }

    private final void Q1(boolean z) {
    }

    private final void R(kc8 kc8Var) {
    }

    private final void R0(zb8 zb8Var) {
    }

    private final void R1(boolean z) {
    }

    private final void S(kc8 kc8Var) {
    }

    private final void S0(zb8 zb8Var) {
    }

    private final void S1(boolean z) {
    }

    private final void T(kc8 kc8Var) {
    }

    private final void T0(zb8 zb8Var) {
    }

    private final void T1(boolean z) {
    }

    private final void U(v33 v33Var) {
    }

    private final void U0(int i) {
    }

    private final void V(w59 w59Var) {
    }

    private final void V0(int i) {
    }

    private final void W(v33 v33Var) {
    }

    private final void W0(int i) {
    }

    private final void X(w59 w59Var) {
    }

    private final void X0(int i) {
    }

    private final void Y(v33 v33Var) {
    }

    private final void Y0(int i) {
    }

    private final void Z(w59 w59Var) {
    }

    private final void Z0(int i) {
    }

    private final void a0(v33 v33Var) {
    }

    private final void a1(int i) {
    }

    private final void b0(w59 w59Var) {
    }

    private final void b1(j54 j54Var) {
    }

    private final void c0(v33 v33Var) {
    }

    private final void c1(j54 j54Var) {
    }

    private final void d0(w59 w59Var) {
    }

    private final void d1(j54 j54Var) {
    }

    private final void e0(lc8 lc8Var) {
    }

    private final void e1(j54 j54Var) {
    }

    private final void e2(byb bybVar) {
    }

    private final void f0(lc8 lc8Var) {
    }

    private final void f1(j54 j54Var) {
    }

    private final void f2(byb bybVar) {
    }

    private final void g0(lc8 lc8Var) {
    }

    private final void g1(j54 j54Var) {
    }

    private final void g2(byb bybVar) {
    }

    private final void h0(lc8 lc8Var) {
    }

    private final void h1(j54 j54Var) {
    }

    private final void h2(byb bybVar) {
    }

    private final void i(nz nzVar) {
    }

    private final void i0(boolean z) {
    }

    private final void i2(byb bybVar) {
    }

    private final void j(nz nzVar) {
    }

    private final void j0(boolean z) {
    }

    private final void j2(eyb eybVar) {
    }

    private final void k(nz nzVar) {
    }

    private final void k0(boolean z) {
    }

    private final void k2(eyb eybVar) {
    }

    private final void l0(boolean z) {
    }

    private final void l2(eyb eybVar) {
    }

    private final void m0(boolean z) {
    }

    private final void m1(jr6 jr6Var) {
    }

    private final void m2(eyb eybVar) {
    }

    private final void n(nz nzVar) {
    }

    private final void n0(boolean z) {
    }

    private final void n1(jr6 jr6Var) {
    }

    private final void n2(eyb eybVar) {
    }

    private final void o0(boolean z) {
    }

    private final void o1(jr6 jr6Var) {
    }

    private final void o2(icc iccVar) {
    }

    private final void p0(boolean z) {
    }

    private final void p1(jr6 jr6Var) {
    }

    private final void p2(icc iccVar) {
    }

    private final void q0(boolean z) {
    }

    private final void q1(jr6 jr6Var) {
    }

    private final void q2(icc iccVar) {
    }

    private final void r0(boolean z) {
    }

    private final void r1(int i) {
    }

    private final void r2(icc iccVar) {
    }

    private final void s(nz nzVar) {
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

    private final void Z1(aob aobVar, int i) {
    }

    private final void a2(aob aobVar, int i) {
    }

    private final void b2(aob aobVar, int i) {
    }

    private final void c2(aob aobVar, int i) {
    }

    private final void d2(aob aobVar, int i) {
    }

    private final void i1(int i, boolean z) {
    }

    private final void j1(int i, boolean z) {
    }

    private final void k1(int i, boolean z) {
    }

    private final void l1(int i, boolean z) {
    }

    private final void v0(int i, br6 br6Var) {
    }

    private final void w0(int i, br6 br6Var) {
    }

    private final void x0(int i, br6 br6Var) {
    }

    private final void y0(int i, br6 br6Var) {
    }

    private final void z0(int i, br6 br6Var) {
    }

    private final void A1(int i, nc8 nc8Var, nc8 nc8Var2) {
    }

    private final void s1(int i, nc8 nc8Var, nc8 nc8Var2) {
    }

    private final void u1(int i, nc8 nc8Var, nc8 nc8Var2) {
    }

    private final void w1(int i, nc8 nc8Var, nc8 nc8Var2) {
    }

    private final void y1(int i, nc8 nc8Var, nc8 nc8Var2) {
    }
}
