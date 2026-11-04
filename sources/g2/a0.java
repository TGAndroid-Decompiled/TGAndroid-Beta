package g2;

import android.os.Handler;
import d2.a1;
import d2.a2;
import d2.b1;
import d2.c1;
import d2.d1;
import d2.n1;
import d2.s0;
import d2.s1;
import d2.v1;
import d2.x0;
import d2.y0;
import java.util.List;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.m51;
import wi.t0;
public final class a0 implements c1 {
    public final int f11797a;
    public final Object f11798b;

    public a0(Object obj, int i3) {
        this.f11797a = i3;
        this.f11798b = obj;
    }

    @Override
    public final void B(s1 s1Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void C(d2.q0 q0Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void E(n1 n1Var, int i3) {
        int i10 = this.f11797a;
    }

    @Override
    public final void F(List list) {
        int i3 = this.f11797a;
    }

    @Override
    public final void G(int i3, boolean z10) {
        switch (this.f11797a) {
            case 0:
                return;
            case 1:
                m51 m51Var = (m51) this.f11798b;
                if (!m51Var.I && i3 == 3) {
                    m51Var.I = true;
                    if (m51Var.H && m51Var.J) {
                        m51Var.h0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void H(y0 y0Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void J(int i3, int i10) {
        int i11 = this.f11797a;
    }

    @Override
    public final void L(d2.q0 q0Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void N(a1 a1Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void O(b1 b1Var) {
        switch (this.f11797a) {
            case 0:
                f0 f0Var = (f0) this.f11798b;
                ((b0) f0Var.f11838g).a();
                ((c0) f0Var.h).a();
                ((d0) f0Var.f11839i).a();
                ((e0) f0Var.f11840j).a();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void P(boolean z10) {
        switch (this.f11797a) {
            case 0:
            case 1:
                return;
            case 2:
                vi.j jVar = (vi.j) this.f11798b;
                vi.d dVar = jVar.E;
                Handler handler = jVar.f56987i;
                if (jVar.f56999u != z10) {
                    jVar.f56999u = z10;
                    handler.removeCallbacks(dVar);
                    if (z10) {
                        handler.post(dVar);
                    }
                    jVar.f56985f.getClass();
                    jVar.m();
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.f11798b;
                if (t0Var.Z == 5) {
                    t0Var.y(z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void a(int i3) {
        int i10 = this.f11797a;
    }

    @Override
    public final void c(int i3) {
        int i10 = this.f11797a;
    }

    @Override
    public final void e(boolean z10) {
        int i3 = this.f11797a;
    }

    @Override
    public final void f(a2 a2Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void g(int i3) {
        int i10 = this.f11797a;
    }

    @Override
    public final void h(boolean z10) {
        int i3 = this.f11797a;
    }

    @Override
    public final void i(int i3) {
        int i10 = this.f11797a;
    }

    @Override
    public final void k(f2.c cVar) {
        int i3 = this.f11797a;
    }

    @Override
    public final void l(x0 x0Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void m(s0 s0Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void n(int i3, d2.n0 n0Var) {
        int i10 = this.f11797a;
    }

    @Override
    public final void o(x0 x0Var) {
        switch (this.f11797a) {
            case 0:
            case 1:
                return;
            case 2:
                ((vi.j) this.f11798b).g(x0Var);
                return;
            default:
                t0 t0Var = (t0) this.f11798b;
                wi.n nVar = t0Var.f58064m;
                nVar.b("preview player error: code=" + x0Var.f8512a);
                t0Var.h(x0Var);
                return;
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f11797a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                t0 t0Var = (t0) this.f11798b;
                if (t0Var.Z == 5) {
                    j40.n((j40) t0Var.d.f40562a);
                    return;
                }
                return;
        }
    }

    @Override
    public final void p(boolean z10) {
        int i3 = this.f11797a;
    }

    @Override
    public final void q(d1 d1Var, d1 d1Var2, int i3) {
        int i10 = this.f11797a;
    }

    @Override
    public final void r(int i3, boolean z10) {
        int i10 = this.f11797a;
    }

    @Override
    public final void s(float f10) {
        int i3 = this.f11797a;
    }

    @Override
    public final void u(d2.f fVar) {
        int i3 = this.f11797a;
    }

    @Override
    public final void v(v1 v1Var) {
        int i3 = this.f11797a;
    }

    @Override
    public final void w(int i3) {
        k2.i0 i0Var;
        k2.i0 i0Var2;
        switch (this.f11797a) {
            case 0:
            case 1:
                return;
            case 2:
                vi.j jVar = (vi.j) this.f11798b;
                if (i3 == 4 && jVar.G == 5 && (i0Var = jVar.A) != null) {
                    i0Var.Z0(5, jVar.f56996r);
                    jVar.A.e();
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) this.f11798b;
                wi.n nVar = t0Var.f58064m;
                nVar.b("preview playback state=" + i3);
                if (t0Var.Z == 5 && i3 == 4 && (i0Var2 = t0Var.V) != null) {
                    i0Var2.Z0(5, t0Var.J);
                    t0Var.V.j();
                    return;
                }
                return;
        }
    }

    @Override
    public final void y(boolean z10) {
        int i3 = this.f11797a;
    }

    private final void h1() {
    }

    private final void i1() {
    }

    private final void j1() {
    }

    private final void A(int i3) {
    }

    private final void C0(y0 y0Var) {
    }

    private final void D(int i3) {
    }

    private final void D0(y0 y0Var) {
    }

    private final void E0(y0 y0Var) {
    }

    private final void E1(s1 s1Var) {
    }

    private final void F0(y0 y0Var) {
    }

    private final void F1(s1 s1Var) {
    }

    private final void G0(int i3) {
    }

    private final void G1(s1 s1Var) {
    }

    private final void H0(int i3) {
    }

    private final void H1(s1 s1Var) {
    }

    private final void I(a1 a1Var) {
    }

    private final void I0(int i3) {
    }

    private final void I1(v1 v1Var) {
    }

    private final void J0(int i3) {
    }

    private final void J1(v1 v1Var) {
    }

    private final void K(a1 a1Var) {
    }

    private final void K0(int i3) {
    }

    private final void K1(v1 v1Var) {
    }

    private final void L0(int i3) {
    }

    private final void L1(v1 v1Var) {
    }

    private final void M(a1 a1Var) {
    }

    private final void M0(x0 x0Var) {
    }

    private final void M1(a2 a2Var) {
    }

    private final void N0(x0 x0Var) {
    }

    private final void N1(a2 a2Var) {
    }

    private final void O0(x0 x0Var) {
    }

    private final void O1(a2 a2Var) {
    }

    private final void P0(x0 x0Var) {
    }

    private final void P1(a2 a2Var) {
    }

    private final void Q(a1 a1Var) {
    }

    private final void Q0(x0 x0Var) {
    }

    private final void Q1(float f10) {
    }

    private final void R(f2.c cVar) {
    }

    private final void R0(x0 x0Var) {
    }

    private final void R1(float f10) {
    }

    private final void S(List list) {
    }

    private final void S1(float f10) {
    }

    private final void T(f2.c cVar) {
    }

    private final void T1(float f10) {
    }

    private final void U(List list) {
    }

    private final void V(f2.c cVar) {
    }

    private final void V0(d2.q0 q0Var) {
    }

    private final void W(List list) {
    }

    private final void W0(d2.q0 q0Var) {
    }

    private final void X(f2.c cVar) {
    }

    private final void X0(d2.q0 q0Var) {
    }

    private final void Y(List list) {
    }

    private final void Y0(d2.q0 q0Var) {
    }

    private final void Z(b1 b1Var) {
    }

    private final void Z0(int i3) {
    }

    private final void a0(b1 b1Var) {
    }

    private final void b(d2.f fVar) {
    }

    private final void b0(b1 b1Var) {
    }

    private final void b1(int i3) {
    }

    private final void c0(boolean z10) {
    }

    private final void d(d2.f fVar) {
    }

    private final void d0(boolean z10) {
    }

    private final void d1(int i3) {
    }

    private final void e0(boolean z10) {
    }

    private final void f0(boolean z10) {
    }

    private final void f1(int i3) {
    }

    private final void g0(boolean z10) {
    }

    private final void h0(boolean z10) {
    }

    private final void i0(boolean z10) {
    }

    private final void j(d2.f fVar) {
    }

    private final void j0(boolean z10) {
    }

    private final void k0(boolean z10) {
    }

    private final void k1(int i3) {
    }

    private final void l0(boolean z10) {
    }

    private final void l1(int i3) {
    }

    private final void m1(int i3) {
    }

    private final void n1(int i3) {
    }

    private final void o1(boolean z10) {
    }

    private final void p1(boolean z10) {
    }

    private final void q0(d2.q0 q0Var) {
    }

    private final void q1(boolean z10) {
    }

    private final void r0(d2.q0 q0Var) {
    }

    private final void r1(boolean z10) {
    }

    private final void s0(d2.q0 q0Var) {
    }

    private final void s1(boolean z10) {
    }

    private final void t(d2.f fVar) {
    }

    private final void t0(d2.q0 q0Var) {
    }

    private final void t1(boolean z10) {
    }

    private final void u0(s0 s0Var) {
    }

    private final void u1(boolean z10) {
    }

    private final void v0(s0 s0Var) {
    }

    private final void v1(boolean z10) {
    }

    private final void w0(s0 s0Var) {
    }

    private final void x(int i3) {
    }

    private final void x0(s0 s0Var) {
    }

    private final void z(int i3) {
    }

    private final void A0(int i3, boolean z10) {
    }

    private final void A1(n1 n1Var, int i3) {
    }

    private final void B0(int i3, boolean z10) {
    }

    private final void B1(n1 n1Var, int i3) {
    }

    private final void C1(n1 n1Var, int i3) {
    }

    private final void D1(n1 n1Var, int i3) {
    }

    private final void S0(int i3, boolean z10) {
    }

    private final void T0(int i3, boolean z10) {
    }

    private final void U0(int i3, boolean z10) {
    }

    private final void m0(int i3, d2.n0 n0Var) {
    }

    private final void n0(int i3, d2.n0 n0Var) {
    }

    private final void o0(int i3, d2.n0 n0Var) {
    }

    private final void p0(int i3, d2.n0 n0Var) {
    }

    private final void w1(int i3, int i10) {
    }

    private final void x1(int i3, int i10) {
    }

    private final void y0(int i3, boolean z10) {
    }

    private final void y1(int i3, int i10) {
    }

    private final void z0(int i3, boolean z10) {
    }

    private final void z1(int i3, int i10) {
    }

    private final void a1(d1 d1Var, d1 d1Var2, int i3) {
    }

    private final void c1(d1 d1Var, d1 d1Var2, int i3) {
    }

    private final void e1(d1 d1Var, d1 d1Var2, int i3) {
    }

    private final void g1(d1 d1Var, d1 d1Var2, int i3) {
    }
}
