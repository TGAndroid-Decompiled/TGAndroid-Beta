package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import b2.s1;
import b2.x1;
import java.util.List;
public final class j1 implements b2.b1 {
    public final b2.b1 f15966a;

    public j1(b2.b1 b1Var) {
        this.f15966a = b1Var;
    }

    @Override
    public final long A() {
        S0();
        return this.f15966a.A();
    }

    @Override
    public final boolean A0() {
        S0();
        return this.f15966a.A0();
    }

    @Override
    public final int B() {
        S0();
        return this.f15966a.B();
    }

    @Override
    public final b2.q1 B0() {
        S0();
        return this.f15966a.B0();
    }

    @Override
    public final void C(b2.n0 n0Var) {
        S0();
        this.f15966a.C(n0Var);
    }

    @Override
    public final long C0() {
        S0();
        return this.f15966a.C0();
    }

    @Override
    public final void D(b2.z0 z0Var) {
        S0();
        this.f15966a.D(new b2.t(this, z0Var));
    }

    @Override
    public final void D0(int i10) {
        S0();
        this.f15966a.D0(i10);
    }

    @Override
    public final x1 E() {
        S0();
        return this.f15966a.E();
    }

    @Override
    public final void E0() {
        S0();
        this.f15966a.E0();
    }

    @Override
    public final void F() {
        S0();
        this.f15966a.F();
    }

    @Override
    public final void F0() {
        S0();
        this.f15966a.F0();
    }

    @Override
    public final float G() {
        S0();
        return this.f15966a.G();
    }

    @Override
    public final void G0() {
        S0();
        this.f15966a.G0();
    }

    @Override
    public final void H() {
        S0();
        this.f15966a.H();
    }

    @Override
    public final b2.n0 H0() {
        S0();
        return this.f15966a.H0();
    }

    @Override
    public final b2.e I() {
        S0();
        return this.f15966a.I();
    }

    @Override
    public final void I0(List list) {
        S0();
        this.f15966a.I0(list);
    }

    @Override
    public final void J(int i10, boolean z10) {
        S0();
        this.f15966a.J(i10, z10);
    }

    @Override
    public final long J0() {
        S0();
        return this.f15966a.J0();
    }

    @Override
    public final b2.l K() {
        S0();
        return this.f15966a.K();
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        this.f15966a.K0(eVar, z10);
    }

    @Override
    public final void L() {
        S0();
        this.f15966a.L();
    }

    @Override
    public final long L0() {
        S0();
        return this.f15966a.L0();
    }

    @Override
    public final void M(int i10, int i11) {
        S0();
        this.f15966a.M(i10, i11);
    }

    @Override
    public final boolean M0() {
        S0();
        return this.f15966a.M0();
    }

    @Override
    public final void N(int i10) {
        S0();
        this.f15966a.N(i10);
    }

    public final b2.a1 N0() {
        int i10;
        b2.k0 k0Var;
        int i11;
        long j3;
        int i12;
        int i13;
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        if (m02) {
            i10 = l0();
        } else {
            i10 = 0;
        }
        if (m0) {
            k0Var = w();
        } else {
            k0Var = null;
        }
        if (m02) {
            i11 = B();
        } else {
            i11 = 0;
        }
        long j10 = 0;
        if (m0) {
            j3 = J0();
        } else {
            j3 = 0;
        }
        if (m0) {
            j10 = a0();
        }
        if (m0) {
            i12 = k0();
        } else {
            i12 = -1;
        }
        if (m0) {
            i13 = O();
        } else {
            i13 = -1;
        }
        return new b2.a1(null, i10, k0Var, null, i11, j3, j10, i12, i13);
    }

    @Override
    public final int O() {
        S0();
        return this.f15966a.O();
    }

    public final o1 O0() {
        boolean z10;
        long j3;
        long j10;
        long j11;
        long j12;
        boolean m0 = m0(16);
        b2.a1 N0 = N0();
        int i10 = 0;
        if (m0 && o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = -9223372036854775807L;
        if (m0) {
            j3 = getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        long j14 = 0;
        if (m0) {
            j10 = c0();
        } else {
            j10 = 0;
        }
        if (m0) {
            i10 = y();
        }
        if (m0) {
            j11 = r();
        } else {
            j11 = 0;
        }
        if (m0) {
            j12 = p();
        } else {
            j12 = -9223372036854775807L;
        }
        if (m0) {
            j13 = A();
        }
        if (m0) {
            j14 = C0();
        }
        return new o1(N0, z10, elapsedRealtime, j3, j10, i10, j11, j12, j13, j14);
    }

    @Override
    public final void P(int i10, int i11, List list) {
        S0();
        this.f15966a.P(i10, i11, list);
    }

    public final b2.k0 P0() {
        if (m0(16)) {
            return w();
        }
        return null;
    }

    @Override
    public final boolean Q() {
        return this.f15966a.Q();
    }

    public final b2.k1 Q0() {
        if (m0(17)) {
            return w0();
        }
        if (m0(16)) {
            if (w0().p()) {
                return b2.k1.f2131a;
            }
            return new i1(this);
        }
        return b2.k1.f2131a;
    }

    @Override
    public final void R(int i10) {
        S0();
        this.f15966a.R(i10);
    }

    public final b2.n0 R0() {
        if (m0(18)) {
            return H0();
        }
        return b2.n0.K;
    }

    @Override
    public final void S(int i10, int i11) {
        S0();
        this.f15966a.S(i10, i11);
    }

    public final void S0() {
        boolean z10;
        if (Looper.myLooper() == this.f15966a.y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
    }

    @Override
    public final void T(long j3, int i10, List list) {
        S0();
        this.f15966a.T(j3, i10, list);
    }

    @Override
    public final void U(float f7) {
        S0();
        this.f15966a.U(f7);
    }

    @Override
    public final void V() {
        S0();
        this.f15966a.V();
    }

    @Override
    public final b2.u0 W() {
        S0();
        return this.f15966a.W();
    }

    @Override
    public final void X(boolean z10) {
        S0();
        this.f15966a.X(z10);
    }

    @Override
    public final void Y(int i10) {
        S0();
        this.f15966a.Y(i10);
    }

    @Override
    public final long Z() {
        S0();
        return this.f15966a.Z();
    }

    @Override
    public final void a(float f7) {
        S0();
        this.f15966a.a(f7);
    }

    @Override
    public final long a0() {
        S0();
        return this.f15966a.a0();
    }

    @Override
    public final void b() {
        S0();
        this.f15966a.b();
    }

    @Override
    public final void b0(int i10, List list) {
        S0();
        this.f15966a.b0(i10, list);
    }

    @Override
    public final boolean c() {
        S0();
        return this.f15966a.c();
    }

    @Override
    public final long c0() {
        S0();
        return this.f15966a.c0();
    }

    @Override
    public final int d() {
        S0();
        return this.f15966a.d();
    }

    @Override
    public final boolean d0() {
        S0();
        return this.f15966a.d0();
    }

    @Override
    public final void e() {
        S0();
        this.f15966a.e();
    }

    @Override
    public final void e0() {
        S0();
        this.f15966a.e0();
    }

    @Override
    public final void f(b2.v0 v0Var) {
        S0();
        this.f15966a.f(v0Var);
    }

    @Override
    public final void f0(int i10) {
        S0();
        this.f15966a.f0(i10);
    }

    @Override
    public final void g(long j3) {
        S0();
        this.f15966a.g(j3);
    }

    @Override
    public final s1 g0() {
        S0();
        return this.f15966a.g0();
    }

    @Override
    public final long getDuration() {
        S0();
        return this.f15966a.getDuration();
    }

    @Override
    public final b2.v0 h() {
        S0();
        return this.f15966a.h();
    }

    @Override
    public final b2.n0 h0() {
        S0();
        return this.f15966a.h0();
    }

    @Override
    public final void i() {
        S0();
        this.f15966a.i();
    }

    @Override
    public final boolean i0() {
        S0();
        return this.f15966a.i0();
    }

    @Override
    public final void j(int i10) {
        S0();
        this.f15966a.j(i10);
    }

    @Override
    public final d2.c j0() {
        S0();
        return this.f15966a.j0();
    }

    @Override
    public final void k(b2.k0 k0Var, long j3) {
        S0();
        this.f15966a.k(k0Var, j3);
    }

    @Override
    public final int k0() {
        S0();
        return this.f15966a.k0();
    }

    @Override
    public final int l() {
        S0();
        return this.f15966a.l();
    }

    @Override
    public final int l0() {
        S0();
        return this.f15966a.l0();
    }

    @Override
    public final int m() {
        S0();
        return this.f15966a.m();
    }

    @Override
    public final boolean m0(int i10) {
        S0();
        return this.f15966a.m0(i10);
    }

    @Override
    public final void n(Surface surface) {
        S0();
        this.f15966a.n(surface);
    }

    @Override
    public final void n0(b2.z0 z0Var) {
        S0();
        this.f15966a.n0(new b2.t(this, z0Var));
    }

    @Override
    public final boolean o() {
        S0();
        return this.f15966a.o();
    }

    @Override
    public final void o0(boolean z10) {
        S0();
        this.f15966a.o0(z10);
    }

    @Override
    public final long p() {
        S0();
        return this.f15966a.p();
    }

    @Override
    public final void p0(b2.k0 k0Var) {
        S0();
        this.f15966a.p0(k0Var);
    }

    @Override
    public final void q(b2.q1 q1Var) {
        S0();
        this.f15966a.q(q1Var);
    }

    @Override
    public final void q0(int i10, int i11) {
        S0();
        this.f15966a.q0(i10, i11);
    }

    @Override
    public final long r() {
        S0();
        return this.f15966a.r();
    }

    @Override
    public final void r0(int i10, int i11, int i12) {
        S0();
        this.f15966a.r0(i10, i11, i12);
    }

    @Override
    public final void s(int i10, long j3) {
        S0();
        this.f15966a.s(i10, j3);
    }

    @Override
    public final void s0(b2.k0 k0Var, int i10) {
        S0();
        this.f15966a.s0(k0Var, i10);
    }

    @Override
    public final void stop() {
        S0();
        this.f15966a.stop();
    }

    @Override
    public final b2.x0 t() {
        S0();
        return this.f15966a.t();
    }

    @Override
    public final boolean t0() {
        S0();
        return this.f15966a.t0();
    }

    @Override
    public final boolean u() {
        S0();
        return this.f15966a.u();
    }

    @Override
    public final int u0() {
        S0();
        return this.f15966a.u0();
    }

    @Override
    public final void v() {
        S0();
        this.f15966a.v();
    }

    @Override
    public final void v0(List list) {
        S0();
        this.f15966a.v0(list);
    }

    @Override
    public final b2.k0 w() {
        S0();
        return this.f15966a.w();
    }

    @Override
    public final b2.k1 w0() {
        S0();
        return this.f15966a.w0();
    }

    @Override
    public final void x(boolean z10) {
        S0();
        this.f15966a.x(z10);
    }

    @Override
    public final boolean x0() {
        S0();
        return this.f15966a.x0();
    }

    @Override
    public final int y() {
        S0();
        return this.f15966a.y();
    }

    @Override
    public final Looper y0() {
        return this.f15966a.y0();
    }

    @Override
    public final long z() {
        S0();
        return this.f15966a.z();
    }

    @Override
    public final void z0() {
        S0();
        this.f15966a.z0();
    }
}
