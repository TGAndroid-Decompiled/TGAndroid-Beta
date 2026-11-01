package e2;

import android.os.Handler;
import b2.b1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.o1;
import b2.p0;
import b2.s0;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.y0;
import b2.z0;
import java.util.List;
import li.x0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.v61;
public final class z implements d1 {
    public final int f6213a;
    public final Object f6214b;

    public z(Object obj, int i10) {
        this.f6213a = i10;
        this.f6214b = obj;
    }

    @Override
    public final void A(d2.d dVar) {
        int i10 = this.f6213a;
    }

    @Override
    public final void C(int i10, p0 p0Var) {
        int i11 = this.f6213a;
    }

    @Override
    public final void D(c1 c1Var) {
        switch (this.f6213a) {
            case 0:
                e0 e0Var = (e0) this.f6214b;
                e0Var.f6132g.a();
                e0Var.h.a();
                e0Var.f6133i.a();
                e0Var.f6134j.a();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void F(u0 u0Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void H(y0 y0Var) {
        switch (this.f6213a) {
            case 0:
                return;
            case 1:
                ((ki.k) this.f6214b).g(y0Var);
                return;
            case 2:
                x0 x0Var = (x0) this.f6214b;
                li.p pVar = x0Var.f12317m;
                pVar.b("preview player error: code=" + y0Var.f2437a);
                x0Var.h(y0Var);
                return;
            default:
                return;
        }
    }

    @Override
    public final void I(List list) {
        int i10 = this.f6213a;
    }

    @Override
    public final void K(int i10, boolean z10) {
        switch (this.f6213a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                v61 v61Var = (v61) this.f6214b;
                if (!v61Var.H && i10 == 3) {
                    v61Var.H = true;
                    if (v61Var.G && v61Var.I) {
                        v61Var.h0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void M(int i10, int i11) {
        int i12 = this.f6213a;
    }

    @Override
    public final void N(w1 w1Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void O(o1 o1Var, int i10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void P(boolean z10) {
        switch (this.f6213a) {
            case 0:
                return;
            case 1:
                ki.k kVar = (ki.k) this.f6214b;
                ki.e eVar = kVar.E;
                Handler handler = kVar.f11418i;
                if (kVar.f11430u != z10) {
                    kVar.f11430u = z10;
                    handler.removeCallbacks(eVar);
                    if (z10) {
                        handler.post(eVar);
                    }
                    kVar.f11416f.getClass();
                    kVar.m();
                    return;
                }
                return;
            case 2:
                x0 x0Var = (x0) this.f6214b;
                if (x0Var.Z == 5) {
                    x0Var.y(z10);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void c(int i10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void d(b2 b2Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void e(boolean z10) {
        int i10 = this.f6213a;
    }

    @Override
    public final void f(int i10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void g(boolean z10) {
        int i10 = this.f6213a;
    }

    @Override
    public final void h(int i10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void i(s0 s0Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void k(boolean z10) {
        int i10 = this.f6213a;
    }

    @Override
    public final void m(s0 s0Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void o(int i10, boolean z10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f6213a) {
            case 0:
            case 1:
                return;
            case 2:
                x0 x0Var = (x0) this.f6214b;
                if (x0Var.Z == 5) {
                    d50.n((d50) x0Var.d.f10701a);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void p(b1 b1Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void q(float f7) {
        int i10 = this.f6213a;
    }

    @Override
    public final void s(e1 e1Var, e1 e1Var2, int i10) {
        int i11 = this.f6213a;
    }

    @Override
    public final void u(int i10) {
        i2.i0 i0Var;
        i2.i0 i0Var2;
        switch (this.f6213a) {
            case 0:
                return;
            case 1:
                ki.k kVar = (ki.k) this.f6214b;
                if (i10 == 4 && kVar.G == 5 && (i0Var = kVar.A) != null) {
                    i0Var.Z0(5, kVar.f11427r);
                    kVar.A.e();
                    return;
                }
                return;
            case 2:
                x0 x0Var = (x0) this.f6214b;
                li.p pVar = x0Var.f12317m;
                pVar.b("preview playback state=" + i10);
                if (x0Var.Z == 5 && i10 == 4 && (i0Var2 = x0Var.V) != null) {
                    i0Var2.Z0(5, x0Var.J);
                    x0Var.V.j();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void v(y0 y0Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void w(u1 u1Var) {
        int i10 = this.f6213a;
    }

    @Override
    public final void x(boolean z10) {
        int i10 = this.f6213a;
    }

    @Override
    public final void y(b2.f fVar) {
        int i10 = this.f6213a;
    }

    @Override
    public final void z(z0 z0Var) {
        int i10 = this.f6213a;
    }

    private final void h1() {
    }

    private final void i1() {
    }

    private final void j1() {
    }

    private final void B(int i10) {
    }

    private final void C0(z0 z0Var) {
    }

    private final void D0(z0 z0Var) {
    }

    private final void E(int i10) {
    }

    private final void E0(z0 z0Var) {
    }

    private final void E1(u1 u1Var) {
    }

    private final void F0(z0 z0Var) {
    }

    private final void F1(u1 u1Var) {
    }

    private final void G(b1 b1Var) {
    }

    private final void G0(int i10) {
    }

    private final void G1(u1 u1Var) {
    }

    private final void H0(int i10) {
    }

    private final void H1(u1 u1Var) {
    }

    private final void I0(int i10) {
    }

    private final void I1(w1 w1Var) {
    }

    private final void J(b1 b1Var) {
    }

    private final void J0(int i10) {
    }

    private final void J1(w1 w1Var) {
    }

    private final void K0(int i10) {
    }

    private final void K1(w1 w1Var) {
    }

    private final void L(b1 b1Var) {
    }

    private final void L0(int i10) {
    }

    private final void L1(w1 w1Var) {
    }

    private final void M0(y0 y0Var) {
    }

    private final void M1(b2 b2Var) {
    }

    private final void N0(y0 y0Var) {
    }

    private final void N1(b2 b2Var) {
    }

    private final void O0(y0 y0Var) {
    }

    private final void O1(b2 b2Var) {
    }

    private final void P0(y0 y0Var) {
    }

    private final void P1(b2 b2Var) {
    }

    private final void Q(b1 b1Var) {
    }

    private final void Q0(y0 y0Var) {
    }

    private final void Q1(float f7) {
    }

    private final void R(d2.d dVar) {
    }

    private final void R0(y0 y0Var) {
    }

    private final void R1(float f7) {
    }

    private final void S(List list) {
    }

    private final void S1(float f7) {
    }

    private final void T(d2.d dVar) {
    }

    private final void T1(float f7) {
    }

    private final void U(List list) {
    }

    private final void V(d2.d dVar) {
    }

    private final void V0(s0 s0Var) {
    }

    private final void W(List list) {
    }

    private final void W0(s0 s0Var) {
    }

    private final void X(d2.d dVar) {
    }

    private final void X0(s0 s0Var) {
    }

    private final void Y(List list) {
    }

    private final void Y0(s0 s0Var) {
    }

    private final void Z(c1 c1Var) {
    }

    private final void Z0(int i10) {
    }

    private final void a0(c1 c1Var) {
    }

    private final void b(b2.f fVar) {
    }

    private final void b0(c1 c1Var) {
    }

    private final void b1(int i10) {
    }

    private final void c0(boolean z10) {
    }

    private final void d0(boolean z10) {
    }

    private final void d1(int i10) {
    }

    private final void e0(boolean z10) {
    }

    private final void f0(boolean z10) {
    }

    private final void f1(int i10) {
    }

    private final void g0(boolean z10) {
    }

    private final void h0(boolean z10) {
    }

    private final void i0(boolean z10) {
    }

    private final void j(b2.f fVar) {
    }

    private final void j0(boolean z10) {
    }

    private final void k0(boolean z10) {
    }

    private final void k1(int i10) {
    }

    private final void l(b2.f fVar) {
    }

    private final void l0(boolean z10) {
    }

    private final void l1(int i10) {
    }

    private final void m1(int i10) {
    }

    private final void n(b2.f fVar) {
    }

    private final void n1(int i10) {
    }

    private final void o1(boolean z10) {
    }

    private final void p1(boolean z10) {
    }

    private final void q0(s0 s0Var) {
    }

    private final void q1(boolean z10) {
    }

    private final void r(int i10) {
    }

    private final void r0(s0 s0Var) {
    }

    private final void r1(boolean z10) {
    }

    private final void s0(s0 s0Var) {
    }

    private final void s1(boolean z10) {
    }

    private final void t(int i10) {
    }

    private final void t0(s0 s0Var) {
    }

    private final void t1(boolean z10) {
    }

    private final void u0(u0 u0Var) {
    }

    private final void u1(boolean z10) {
    }

    private final void v0(u0 u0Var) {
    }

    private final void v1(boolean z10) {
    }

    private final void w0(u0 u0Var) {
    }

    private final void x0(u0 u0Var) {
    }

    private final void A0(int i10, boolean z10) {
    }

    private final void A1(o1 o1Var, int i10) {
    }

    private final void B0(int i10, boolean z10) {
    }

    private final void B1(o1 o1Var, int i10) {
    }

    private final void C1(o1 o1Var, int i10) {
    }

    private final void D1(o1 o1Var, int i10) {
    }

    private final void S0(int i10, boolean z10) {
    }

    private final void T0(int i10, boolean z10) {
    }

    private final void U0(int i10, boolean z10) {
    }

    private final void m0(int i10, p0 p0Var) {
    }

    private final void n0(int i10, p0 p0Var) {
    }

    private final void o0(int i10, p0 p0Var) {
    }

    private final void p0(int i10, p0 p0Var) {
    }

    private final void w1(int i10, int i11) {
    }

    private final void x1(int i10, int i11) {
    }

    private final void y0(int i10, boolean z10) {
    }

    private final void y1(int i10, int i11) {
    }

    private final void z0(int i10, boolean z10) {
    }

    private final void z1(int i10, int i11) {
    }

    private final void a1(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final void c1(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final void e1(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final void g1(e1 e1Var, e1 e1Var2, int i10) {
    }
}
