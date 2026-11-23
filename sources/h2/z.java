package h2;

import android.os.Handler;
import e2.a1;
import e2.b1;
import e2.l1;
import e2.q0;
import e2.q1;
import e2.s1;
import e2.v0;
import e2.w0;
import e2.x1;
import e2.y0;
import e2.z0;
import java.util.List;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.i61;
import zi.u0;
public final class z implements a1 {
    public final int f13871a;
    public final Object f13872b;

    public z(Object obj, int i7) {
        this.f13871a = i7;
        this.f13872b = obj;
    }

    @Override
    public final void B(List list) {
        int i7 = this.f13871a;
    }

    @Override
    public final void D(int i7, boolean z10) {
        switch (this.f13871a) {
            case 0:
                return;
            case 1:
                i61 i61Var = (i61) this.f13872b;
                if (!i61Var.I && i7 == 3) {
                    i61Var.I = true;
                    if (i61Var.H && i61Var.J) {
                        i61Var.h0();
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
    public final void E(q1 q1Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void F(z0 z0Var) {
        switch (this.f13871a) {
            case 0:
                e0 e0Var = (e0) this.f13872b;
                ((a0) e0Var.f13781g).a();
                ((b0) e0Var.h).a();
                ((c0) e0Var.f13782i).a();
                ((d0) e0Var.f13783j).a();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void H(w0 w0Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void J(int i7, int i10) {
        int i11 = this.f13871a;
    }

    @Override
    public final void L(l1 l1Var, int i7) {
        int i10 = this.f13871a;
    }

    @Override
    public final void M(q0 q0Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void O(y0 y0Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void P(boolean z10) {
        switch (this.f13871a) {
            case 0:
            case 1:
                return;
            case 2:
                yi.j jVar = (yi.j) this.f13872b;
                yi.d dVar = jVar.E;
                Handler handler = jVar.f61368i;
                if (jVar.f61380u != z10) {
                    jVar.f61380u = z10;
                    handler.removeCallbacks(dVar);
                    if (z10) {
                        handler.post(dVar);
                    }
                    jVar.f61366f.getClass();
                    jVar.m();
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.f13872b;
                if (u0Var.f62355a0 == 5) {
                    u0Var.z(z10);
                    return;
                }
                return;
        }
    }

    @Override
    public final void a(x1 x1Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void d(int i7) {
        int i10 = this.f13871a;
    }

    @Override
    public final void e(int i7) {
        int i10 = this.f13871a;
    }

    @Override
    public final void f(boolean z10) {
        int i7 = this.f13871a;
    }

    @Override
    public final void g(int i7) {
        int i10 = this.f13871a;
    }

    @Override
    public final void h(boolean z10) {
        int i7 = this.f13871a;
    }

    @Override
    public final void i(int i7) {
        int i10 = this.f13871a;
    }

    @Override
    public final void j(boolean z10) {
        int i7 = this.f13871a;
    }

    @Override
    public final void k(int i7, boolean z10) {
        int i10 = this.f13871a;
    }

    @Override
    public final void l(float f10) {
        int i7 = this.f13871a;
    }

    @Override
    public final void m(int i7) {
        l2.f0 f0Var;
        l2.f0 f0Var2;
        switch (this.f13871a) {
            case 0:
            case 1:
                return;
            case 2:
                yi.j jVar = (yi.j) this.f13872b;
                if (i7 == 4 && jVar.G == 5 && (f0Var = jVar.A) != null) {
                    f0Var.Z0(5, jVar.f61377r);
                    jVar.A.b();
                    return;
                }
                return;
            default:
                u0 u0Var = (u0) this.f13872b;
                zi.o oVar = u0Var.f62366m;
                oVar.b("preview playback state=" + i7);
                if (u0Var.f62355a0 == 5 && i7 == 4 && (f0Var2 = u0Var.W) != null) {
                    f0Var2.Z0(5, u0Var.K);
                    u0Var.W.f();
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(e2.o0 o0Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void o(e2.e eVar) {
        int i7 = this.f13871a;
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f13871a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                u0 u0Var = (u0) this.f13872b;
                if (u0Var.f62355a0 == 5) {
                    b50.o((b50) u0Var.d.f38896b);
                    return;
                }
                return;
        }
    }

    @Override
    public final void p(e2.o0 o0Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void q(v0 v0Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void s(b1 b1Var, b1 b1Var2, int i7) {
        int i10 = this.f13871a;
    }

    @Override
    public final void t(boolean z10) {
        int i7 = this.f13871a;
    }

    @Override
    public final void u(s1 s1Var) {
        int i7 = this.f13871a;
    }

    @Override
    public final void v(int i7, e2.l0 l0Var) {
        int i10 = this.f13871a;
    }

    @Override
    public final void x(g2.c cVar) {
        int i7 = this.f13871a;
    }

    @Override
    public final void y(v0 v0Var) {
        switch (this.f13871a) {
            case 0:
            case 1:
                return;
            case 2:
                ((yi.j) this.f13872b).g(v0Var);
                return;
            default:
                u0 u0Var = (u0) this.f13872b;
                zi.o oVar = u0Var.f62366m;
                oVar.b("preview player error: code=" + v0Var.f10812a);
                u0Var.h(v0Var);
                return;
        }
    }

    private final void h1() {
    }

    private final void i1() {
    }

    private final void j1() {
    }

    private final void A(int i7) {
    }

    private final void C(int i7) {
    }

    private final void C0(w0 w0Var) {
    }

    private final void D0(w0 w0Var) {
    }

    private final void E0(w0 w0Var) {
    }

    private final void E1(q1 q1Var) {
    }

    private final void F0(w0 w0Var) {
    }

    private final void F1(q1 q1Var) {
    }

    private final void G(int i7) {
    }

    private final void G0(int i7) {
    }

    private final void G1(q1 q1Var) {
    }

    private final void H0(int i7) {
    }

    private final void H1(q1 q1Var) {
    }

    private final void I(y0 y0Var) {
    }

    private final void I0(int i7) {
    }

    private final void I1(s1 s1Var) {
    }

    private final void J0(int i7) {
    }

    private final void J1(s1 s1Var) {
    }

    private final void K(y0 y0Var) {
    }

    private final void K0(int i7) {
    }

    private final void K1(s1 s1Var) {
    }

    private final void L0(int i7) {
    }

    private final void L1(s1 s1Var) {
    }

    private final void M0(v0 v0Var) {
    }

    private final void M1(x1 x1Var) {
    }

    private final void N(y0 y0Var) {
    }

    private final void N0(v0 v0Var) {
    }

    private final void N1(x1 x1Var) {
    }

    private final void O0(v0 v0Var) {
    }

    private final void O1(x1 x1Var) {
    }

    private final void P0(v0 v0Var) {
    }

    private final void P1(x1 x1Var) {
    }

    private final void Q(y0 y0Var) {
    }

    private final void Q0(v0 v0Var) {
    }

    private final void Q1(float f10) {
    }

    private final void R(g2.c cVar) {
    }

    private final void R0(v0 v0Var) {
    }

    private final void R1(float f10) {
    }

    private final void S(List list) {
    }

    private final void S1(float f10) {
    }

    private final void T(g2.c cVar) {
    }

    private final void T1(float f10) {
    }

    private final void U(List list) {
    }

    private final void V(g2.c cVar) {
    }

    private final void V0(e2.o0 o0Var) {
    }

    private final void W(List list) {
    }

    private final void W0(e2.o0 o0Var) {
    }

    private final void X(g2.c cVar) {
    }

    private final void X0(e2.o0 o0Var) {
    }

    private final void Y(List list) {
    }

    private final void Y0(e2.o0 o0Var) {
    }

    private final void Z(z0 z0Var) {
    }

    private final void Z0(int i7) {
    }

    private final void a0(z0 z0Var) {
    }

    private final void b(e2.e eVar) {
    }

    private final void b0(z0 z0Var) {
    }

    private final void b1(int i7) {
    }

    private final void c(e2.e eVar) {
    }

    private final void c0(boolean z10) {
    }

    private final void d0(boolean z10) {
    }

    private final void d1(int i7) {
    }

    private final void e0(boolean z10) {
    }

    private final void f0(boolean z10) {
    }

    private final void f1(int i7) {
    }

    private final void g0(boolean z10) {
    }

    private final void h0(boolean z10) {
    }

    private final void i0(boolean z10) {
    }

    private final void j0(boolean z10) {
    }

    private final void k0(boolean z10) {
    }

    private final void k1(int i7) {
    }

    private final void l0(boolean z10) {
    }

    private final void l1(int i7) {
    }

    private final void m1(int i7) {
    }

    private final void n1(int i7) {
    }

    private final void o1(boolean z10) {
    }

    private final void p1(boolean z10) {
    }

    private final void q0(e2.o0 o0Var) {
    }

    private final void q1(boolean z10) {
    }

    private final void r(e2.e eVar) {
    }

    private final void r0(e2.o0 o0Var) {
    }

    private final void r1(boolean z10) {
    }

    private final void s0(e2.o0 o0Var) {
    }

    private final void s1(boolean z10) {
    }

    private final void t0(e2.o0 o0Var) {
    }

    private final void t1(boolean z10) {
    }

    private final void u0(q0 q0Var) {
    }

    private final void u1(boolean z10) {
    }

    private final void v0(q0 q0Var) {
    }

    private final void v1(boolean z10) {
    }

    private final void w(e2.e eVar) {
    }

    private final void w0(q0 q0Var) {
    }

    private final void x0(q0 q0Var) {
    }

    private final void z(int i7) {
    }

    private final void A0(int i7, boolean z10) {
    }

    private final void A1(l1 l1Var, int i7) {
    }

    private final void B0(int i7, boolean z10) {
    }

    private final void B1(l1 l1Var, int i7) {
    }

    private final void C1(l1 l1Var, int i7) {
    }

    private final void D1(l1 l1Var, int i7) {
    }

    private final void S0(int i7, boolean z10) {
    }

    private final void T0(int i7, boolean z10) {
    }

    private final void U0(int i7, boolean z10) {
    }

    private final void m0(int i7, e2.l0 l0Var) {
    }

    private final void n0(int i7, e2.l0 l0Var) {
    }

    private final void o0(int i7, e2.l0 l0Var) {
    }

    private final void p0(int i7, e2.l0 l0Var) {
    }

    private final void w1(int i7, int i10) {
    }

    private final void x1(int i7, int i10) {
    }

    private final void y0(int i7, boolean z10) {
    }

    private final void y1(int i7, int i10) {
    }

    private final void z0(int i7, boolean z10) {
    }

    private final void z1(int i7, int i10) {
    }

    private final void a1(b1 b1Var, b1 b1Var2, int i7) {
    }

    private final void c1(b1 b1Var, b1 b1Var2, int i7) {
    }

    private final void e1(b1 b1Var, b1 b1Var2, int i7) {
    }

    private final void g1(b1 b1Var, b1 b1Var2, int i7) {
    }
}
