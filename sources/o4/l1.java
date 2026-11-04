package o4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b8.zb;
import d2.a2;
import d2.v1;
import java.util.IdentityHashMap;
import java.util.List;
public final class l1 implements d2.e1 {
    public final d2.e1 f20751a;
    public final IdentityHashMap f20752b = new IdentityHashMap();

    public l1(d2.e1 e1Var) {
        this.f20751a = e1Var;
    }

    @Override
    public final long A() {
        V0();
        return this.f20751a.A();
    }

    @Override
    public final void A0(d2.f fVar, boolean z10) {
        this.f20751a.A0(fVar, z10);
    }

    @Override
    public final int B() {
        V0();
        return this.f20751a.B();
    }

    @Override
    public final Looper B0() {
        return this.f20751a.B0();
    }

    @Override
    public final a2 C() {
        V0();
        return this.f20751a.C();
    }

    @Override
    public final void C0() {
        V0();
        this.f20751a.C0();
    }

    @Override
    public final void D() {
        V0();
        this.f20751a.D();
    }

    @Override
    public final void D0() {
        V0();
        this.f20751a.D0();
    }

    @Override
    public final float E() {
        V0();
        return this.f20751a.E();
    }

    @Override
    public final boolean E0() {
        V0();
        return this.f20751a.E0();
    }

    @Override
    public final void F() {
        V0();
        this.f20751a.F();
    }

    @Override
    public final d2.s1 F0() {
        V0();
        return this.f20751a.F0();
    }

    @Override
    public final d2.f G() {
        V0();
        return this.f20751a.G();
    }

    @Override
    public final long G0() {
        V0();
        return this.f20751a.G0();
    }

    @Override
    public final void H(int i3, boolean z10) {
        V0();
        this.f20751a.H(i3, z10);
    }

    @Override
    public final void H0(int i3) {
        V0();
        this.f20751a.H0(i3);
    }

    @Override
    public final d2.p I() {
        V0();
        return this.f20751a.I();
    }

    @Override
    public final void I0() {
        V0();
        this.f20751a.I0();
    }

    @Override
    public final void J() {
        V0();
        this.f20751a.J();
    }

    @Override
    public final void J0() {
        V0();
        this.f20751a.J0();
    }

    @Override
    public final void K(int i3, int i10) {
        V0();
        this.f20751a.K(i3, i10);
    }

    @Override
    public final void K0() {
        V0();
        this.f20751a.K0();
    }

    @Override
    public final void L(int i3) {
        V0();
        this.f20751a.L(i3);
    }

    @Override
    public final d2.q0 L0() {
        V0();
        return this.f20751a.L0();
    }

    @Override
    public final int M() {
        V0();
        return this.f20751a.M();
    }

    @Override
    public final void M0(List list) {
        V0();
        this.f20751a.M0(list);
    }

    @Override
    public final boolean N() {
        return this.f20751a.N();
    }

    @Override
    public final long N0() {
        V0();
        return this.f20751a.N0();
    }

    @Override
    public final void O(int i3) {
        V0();
        this.f20751a.O(i3);
    }

    @Override
    public final long O0() {
        V0();
        return this.f20751a.O0();
    }

    @Override
    public final void P(int i3, int i10) {
        V0();
        this.f20751a.P(i3, i10);
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f20751a.P0();
    }

    @Override
    public final void Q(SurfaceHolder surfaceHolder) {
        V0();
        this.f20751a.Q(surfaceHolder);
    }

    public final d2.d1 Q0() {
        int i3;
        boolean z10;
        int i10;
        boolean z11;
        d2.n0 n0Var;
        long j10;
        int i11;
        boolean z12;
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        boolean z13 = false;
        if (m02) {
            i3 = l0();
        } else {
            i3 = 0;
        }
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        if (m02) {
            i10 = B();
        } else {
            i10 = 0;
        }
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.p(z11);
        if (m02) {
            d2.n1 y02 = y0();
            if (!y02.p()) {
                if (i3 < y02.o()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zb.p(z12);
                d2.m1 m10 = y02.m(i3, new d2.m1(), 0L);
                if (i10 == g2.n0.i(i10, m10.f8219n, m10.f8220o)) {
                    z13 = true;
                }
                zb.p(z13);
            }
        }
        long j11 = 0;
        if (m0) {
            n0Var = w();
        } else {
            n0Var = null;
        }
        d2.n0 n0Var2 = n0Var;
        if (m0) {
            j10 = N0();
        } else {
            j10 = 0;
        }
        if (m0) {
            j11 = Y();
        }
        long j12 = j11;
        int i12 = -1;
        if (m0) {
            i11 = k0();
        } else {
            i11 = -1;
        }
        if (m0) {
            i12 = M();
        }
        return new d2.d1(null, i3, n0Var2, null, i10, j10, j12, i11, i12);
    }

    @Override
    public final void R(float f10) {
        V0();
        this.f20751a.R(f10);
    }

    public final q1 R0() {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean m0 = m0(16);
        d2.d1 Q0 = Q0();
        int i3 = 0;
        if (m0 && n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = -9223372036854775807L;
        if (m0) {
            j10 = getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        long j15 = 0;
        if (m0) {
            j11 = b0();
        } else {
            j11 = 0;
        }
        if (m0) {
            i3 = y();
        }
        if (m0) {
            j12 = q();
        } else {
            j12 = 0;
        }
        if (m0) {
            j13 = p();
        } else {
            j13 = -9223372036854775807L;
        }
        if (m0) {
            j14 = A();
        }
        if (m0) {
            j15 = G0();
        }
        return new q1(Q0, z10, elapsedRealtime, j10, j11, i3, j12, j13, j14, j15);
    }

    @Override
    public final void S() {
        V0();
        this.f20751a.S();
    }

    public final d2.n0 S0() {
        if (m0(16)) {
            return w();
        }
        return null;
    }

    @Override
    public final void T(List list, int i3, long j10) {
        V0();
        this.f20751a.T(list, i3, j10);
    }

    public final d2.n1 T0() {
        if (m0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new k1(this);
        }
        return d2.n1.f8245a;
    }

    @Override
    public final d2.x0 U() {
        V0();
        return this.f20751a.U();
    }

    public final d2.q0 U0() {
        if (m0(18)) {
            return L0();
        }
        return d2.q0.L;
    }

    @Override
    public final void V(boolean z10) {
        V0();
        this.f20751a.V(z10);
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f20751a.B0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
    }

    @Override
    public final void W(int i3) {
        V0();
        this.f20751a.W(i3);
    }

    @Override
    public final long X() {
        V0();
        return this.f20751a.X();
    }

    @Override
    public final long Y() {
        V0();
        return this.f20751a.Y();
    }

    @Override
    public final void Z(int i3, List list) {
        V0();
        this.f20751a.Z(i3, list);
    }

    @Override
    public final void a() {
        V0();
        this.f20751a.a();
    }

    @Override
    public final void a0() {
        V0();
        this.f20751a.a0();
    }

    @Override
    public final void b(float f10) {
        V0();
        this.f20751a.b(f10);
    }

    @Override
    public final long b0() {
        V0();
        return this.f20751a.b0();
    }

    @Override
    public final void c(d2.y0 y0Var) {
        V0();
        this.f20751a.c(y0Var);
    }

    @Override
    public final boolean c0() {
        V0();
        return this.f20751a.c0();
    }

    @Override
    public final boolean d() {
        V0();
        return this.f20751a.d();
    }

    @Override
    public final void d0() {
        V0();
        this.f20751a.d0();
    }

    @Override
    public final void e() {
        V0();
        this.f20751a.e();
    }

    @Override
    public final void e0(int i3) {
        V0();
        this.f20751a.e0(i3);
    }

    @Override
    public final void f(long j10) {
        V0();
        this.f20751a.f(j10);
    }

    @Override
    public final v1 f0() {
        V0();
        return this.f20751a.f0();
    }

    @Override
    public final d2.y0 g() {
        V0();
        return this.f20751a.g();
    }

    @Override
    public final void g0(d2.s1 s1Var) {
        V0();
        this.f20751a.g0(s1Var);
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f20751a.getDuration();
    }

    @Override
    public final int h() {
        V0();
        return this.f20751a.h();
    }

    @Override
    public final d2.q0 h0() {
        V0();
        return this.f20751a.h0();
    }

    @Override
    public final int i() {
        V0();
        return this.f20751a.i();
    }

    @Override
    public final boolean i0() {
        V0();
        return this.f20751a.i0();
    }

    @Override
    public final void j() {
        V0();
        this.f20751a.j();
    }

    @Override
    public final f2.c j0() {
        V0();
        return this.f20751a.j0();
    }

    @Override
    public final void k(int i3) {
        V0();
        this.f20751a.k(i3);
    }

    @Override
    public final int k0() {
        V0();
        return this.f20751a.k0();
    }

    @Override
    public final void l(d2.q0 q0Var) {
        V0();
        this.f20751a.l(q0Var);
    }

    @Override
    public final int l0() {
        V0();
        return this.f20751a.l0();
    }

    @Override
    public final int m() {
        V0();
        return this.f20751a.m();
    }

    @Override
    public final boolean m0(int i3) {
        V0();
        return this.f20751a.m0(i3);
    }

    @Override
    public final boolean n() {
        V0();
        return this.f20751a.n();
    }

    @Override
    public final void n0(int i3, d2.n0 n0Var) {
        V0();
        this.f20751a.n0(i3, n0Var);
    }

    @Override
    public final void o(d2.n0 n0Var, long j10) {
        V0();
        this.f20751a.o(n0Var, j10);
    }

    @Override
    public final void o0(boolean z10) {
        V0();
        this.f20751a.o0(z10);
    }

    @Override
    public final long p() {
        V0();
        return this.f20751a.p();
    }

    @Override
    public final void p0(List list, int i3, int i10) {
        V0();
        this.f20751a.p0(list, i3, i10);
    }

    @Override
    public final long q() {
        V0();
        return this.f20751a.q();
    }

    @Override
    public final void q0(int i3, int i10) {
        V0();
        this.f20751a.q0(i3, i10);
    }

    @Override
    public final void r(int i3, long j10) {
        V0();
        this.f20751a.r(i3, j10);
    }

    @Override
    public final void r0(int i3, int i10, int i11) {
        V0();
        this.f20751a.r0(i3, i10, i11);
    }

    @Override
    public final void s(d2.c1 c1Var) {
        V0();
        synchronized (this.f20752b) {
            d2.c1 c1Var2 = (d2.c1) this.f20752b.remove(c1Var);
            d2.e1 e1Var = this.f20751a;
            if (c1Var2 != null) {
                c1Var = c1Var2;
            }
            e1Var.s(c1Var);
        }
    }

    @Override
    public final boolean s0() {
        V0();
        return this.f20751a.s0();
    }

    @Override
    public final void stop() {
        V0();
        this.f20751a.stop();
    }

    @Override
    public final d2.a1 t() {
        V0();
        return this.f20751a.t();
    }

    @Override
    public final int t0() {
        V0();
        return this.f20751a.t0();
    }

    @Override
    public final boolean u() {
        V0();
        return this.f20751a.u();
    }

    @Override
    public final void u0(d2.c1 c1Var) {
        V0();
        synchronized (this.f20752b) {
            try {
                d2.w wVar = (d2.w) this.f20752b.get(c1Var);
                if (wVar == null) {
                    wVar = new d2.w(this, c1Var);
                }
                this.f20751a.u0(wVar);
                this.f20752b.put(c1Var, wVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void v() {
        V0();
        this.f20751a.v();
    }

    @Override
    public final void v0(d2.n0 n0Var) {
        V0();
        this.f20751a.v0(n0Var);
    }

    @Override
    public final d2.n0 w() {
        V0();
        return this.f20751a.w();
    }

    @Override
    public final void w0(List list) {
        V0();
        this.f20751a.w0(list);
    }

    @Override
    public final void x(boolean z10) {
        V0();
        this.f20751a.x(z10);
    }

    @Override
    public final void x0(d2.n0 n0Var) {
        V0();
        this.f20751a.x0(n0Var);
    }

    @Override
    public final int y() {
        V0();
        return this.f20751a.y();
    }

    @Override
    public final d2.n1 y0() {
        V0();
        return this.f20751a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f20751a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f20751a.z0();
    }
}
