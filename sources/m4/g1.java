package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import b2.q1;
import b2.s1;
import b2.x1;
import java.util.List;
public final class g1 implements b2.b1 {
    public final b2.b1 f15850a;

    public g1(b2.b1 b1Var) {
        this.f15850a = b1Var;
    }

    @Override
    public final long A() {
        S0();
        return this.f15850a.A();
    }

    @Override
    public final boolean A0() {
        S0();
        return this.f15850a.A0();
    }

    @Override
    public final int B() {
        S0();
        return this.f15850a.B();
    }

    @Override
    public final q1 B0() {
        S0();
        return this.f15850a.B0();
    }

    @Override
    public final void C(b2.n0 n0Var) {
        S0();
        this.f15850a.C(n0Var);
    }

    @Override
    public final long C0() {
        S0();
        return this.f15850a.C0();
    }

    @Override
    public final void D(b2.z0 z0Var) {
        S0();
        this.f15850a.D(new b2.t(this, z0Var));
    }

    @Override
    public final void D0(int i10) {
        S0();
        this.f15850a.D0(i10);
    }

    @Override
    public final x1 E() {
        S0();
        return this.f15850a.E();
    }

    @Override
    public final void E0() {
        S0();
        this.f15850a.E0();
    }

    @Override
    public final void F() {
        S0();
        this.f15850a.F();
    }

    @Override
    public final void F0() {
        S0();
        this.f15850a.F0();
    }

    @Override
    public final float G() {
        S0();
        return this.f15850a.G();
    }

    @Override
    public final void G0() {
        S0();
        this.f15850a.G0();
    }

    @Override
    public final void H() {
        S0();
        this.f15850a.H();
    }

    @Override
    public final b2.n0 H0() {
        S0();
        return this.f15850a.H0();
    }

    @Override
    public final b2.e I() {
        S0();
        return this.f15850a.I();
    }

    @Override
    public final void I0(List list) {
        S0();
        this.f15850a.I0(list);
    }

    @Override
    public final void J(int i10, boolean z10) {
        S0();
        this.f15850a.J(i10, z10);
    }

    @Override
    public final long J0() {
        S0();
        return this.f15850a.J0();
    }

    @Override
    public final b2.l K() {
        S0();
        return this.f15850a.K();
    }

    @Override
    public final void K0(b2.e eVar, boolean z10) {
        this.f15850a.K0(eVar, z10);
    }

    @Override
    public final void L() {
        S0();
        this.f15850a.L();
    }

    @Override
    public final long L0() {
        S0();
        return this.f15850a.L0();
    }

    @Override
    public final void M(int i10, int i11) {
        S0();
        this.f15850a.M(i10, i11);
    }

    @Override
    public final boolean M0() {
        S0();
        return this.f15850a.M0();
    }

    @Override
    public final void N(int i10) {
        S0();
        this.f15850a.N(i10);
    }

    public final b2.a1 N0() {
        int i10;
        b2.k0 k0Var;
        long j3;
        int i11;
        boolean n02 = n0(16);
        boolean n03 = n0(17);
        int i12 = 0;
        if (n03) {
            i10 = m0();
        } else {
            i10 = 0;
        }
        if (n02) {
            k0Var = w();
        } else {
            k0Var = null;
        }
        if (n03) {
            i12 = B();
        }
        int i13 = i12;
        long j10 = 0;
        if (n02) {
            j3 = J0();
        } else {
            j3 = 0;
        }
        if (n02) {
            j10 = a0();
        }
        int i14 = -1;
        if (n02) {
            i11 = l0();
        } else {
            i11 = -1;
        }
        if (n02) {
            i14 = O();
        }
        return new b2.a1(null, i10, k0Var, null, i13, j3, j10, i11, i14);
    }

    @Override
    public final int O() {
        S0();
        return this.f15850a.O();
    }

    public final l1 O0() {
        boolean z10;
        long j3;
        long j10;
        long j11;
        long j12;
        boolean n02 = n0(16);
        b2.a1 N0 = N0();
        int i10 = 0;
        if (n02 && o()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = -9223372036854775807L;
        if (n02) {
            j3 = getDuration();
        } else {
            j3 = -9223372036854775807L;
        }
        long j14 = 0;
        if (n02) {
            j10 = c0();
        } else {
            j10 = 0;
        }
        if (n02) {
            i10 = y();
        }
        if (n02) {
            j11 = r();
        } else {
            j11 = 0;
        }
        if (n02) {
            j12 = p();
        } else {
            j12 = -9223372036854775807L;
        }
        if (n02) {
            j13 = A();
        }
        if (n02) {
            j14 = C0();
        }
        return new l1(N0, z10, elapsedRealtime, j3, j10, i10, j11, j12, j13, j14);
    }

    @Override
    public final void P(int i10, int i11, List list) {
        S0();
        this.f15850a.P(i10, i11, list);
    }

    public final b2.k0 P0() {
        if (n0(16)) {
            return w();
        }
        return null;
    }

    @Override
    public final boolean Q() {
        return this.f15850a.Q();
    }

    public final b2.k1 Q0() {
        if (n0(17)) {
            return w0();
        }
        if (n0(16)) {
            if (w0().p()) {
                return b2.k1.f3402a;
            }
            return new f1(this);
        }
        return b2.k1.f3402a;
    }

    @Override
    public final void R(int i10) {
        S0();
        this.f15850a.R(i10);
    }

    public final b2.n0 R0() {
        if (n0(18)) {
            return H0();
        }
        return b2.n0.K;
    }

    @Override
    public final void S(int i10, int i11) {
        S0();
        this.f15850a.S(i10, i11);
    }

    public final void S0() {
        boolean z10;
        if (Looper.myLooper() == this.f15850a.y0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
    }

    @Override
    public final void T(long j3, int i10, List list) {
        S0();
        this.f15850a.T(j3, i10, list);
    }

    @Override
    public final void U(float f7) {
        S0();
        this.f15850a.U(f7);
    }

    @Override
    public final void V() {
        S0();
        this.f15850a.V();
    }

    @Override
    public final b2.u0 W() {
        S0();
        return this.f15850a.W();
    }

    @Override
    public final void X(boolean z10) {
        S0();
        this.f15850a.X(z10);
    }

    @Override
    public final void Y(int i10) {
        S0();
        this.f15850a.Y(i10);
    }

    @Override
    public final long Z() {
        S0();
        return this.f15850a.Z();
    }

    @Override
    public final void a(float f7) {
        S0();
        this.f15850a.a(f7);
    }

    @Override
    public final long a0() {
        S0();
        return this.f15850a.a0();
    }

    @Override
    public final void b() {
        S0();
        this.f15850a.b();
    }

    @Override
    public final void b0(int i10, List list) {
        S0();
        this.f15850a.b0(i10, list);
    }

    @Override
    public final boolean c() {
        S0();
        return this.f15850a.c();
    }

    @Override
    public final long c0() {
        S0();
        return this.f15850a.c0();
    }

    @Override
    public final int d() {
        S0();
        return this.f15850a.d();
    }

    @Override
    public final boolean d0() {
        S0();
        return this.f15850a.d0();
    }

    @Override
    public final void e() {
        S0();
        this.f15850a.e();
    }

    @Override
    public final void e0() {
        S0();
        this.f15850a.e0();
    }

    @Override
    public final void f(b2.v0 v0Var) {
        S0();
        this.f15850a.f(v0Var);
    }

    @Override
    public final void f0(int i10) {
        S0();
        this.f15850a.f0(i10);
    }

    @Override
    public final void g(long j3) {
        S0();
        this.f15850a.g(j3);
    }

    @Override
    public final s1 g0() {
        S0();
        return this.f15850a.g0();
    }

    @Override
    public final long getDuration() {
        S0();
        return this.f15850a.getDuration();
    }

    @Override
    public final b2.v0 h() {
        S0();
        return this.f15850a.h();
    }

    @Override
    public final b2.n0 h0() {
        S0();
        return this.f15850a.h0();
    }

    @Override
    public final void i() {
        S0();
        this.f15850a.i();
    }

    @Override
    public final boolean i0() {
        S0();
        return this.f15850a.i0();
    }

    @Override
    public final void j(int i10) {
        S0();
        this.f15850a.j(i10);
    }

    @Override
    public final d2.d j0() {
        S0();
        return this.f15850a.j0();
    }

    @Override
    public final void k(b2.k0 k0Var, long j3) {
        S0();
        this.f15850a.k(k0Var, j3);
    }

    @Override
    public final void k0(b2.k0 k0Var) {
        S0();
        this.f15850a.k0(k0Var);
    }

    @Override
    public final int l() {
        S0();
        return this.f15850a.l();
    }

    @Override
    public final int l0() {
        S0();
        return this.f15850a.l0();
    }

    @Override
    public final int m() {
        S0();
        return this.f15850a.m();
    }

    @Override
    public final int m0() {
        S0();
        return this.f15850a.m0();
    }

    @Override
    public final void n(Surface surface) {
        S0();
        this.f15850a.n(surface);
    }

    @Override
    public final boolean n0(int i10) {
        S0();
        return this.f15850a.n0(i10);
    }

    @Override
    public final boolean o() {
        S0();
        return this.f15850a.o();
    }

    @Override
    public final void o0(b2.z0 z0Var) {
        S0();
        this.f15850a.o0(new b2.t(this, z0Var));
    }

    @Override
    public final long p() {
        S0();
        return this.f15850a.p();
    }

    @Override
    public final void p0(boolean z10) {
        S0();
        this.f15850a.p0(z10);
    }

    @Override
    public final void q(q1 q1Var) {
        S0();
        this.f15850a.q(q1Var);
    }

    @Override
    public final void q0(int i10, int i11) {
        S0();
        this.f15850a.q0(i10, i11);
    }

    @Override
    public final long r() {
        S0();
        return this.f15850a.r();
    }

    @Override
    public final void r0(int i10, int i11, int i12) {
        S0();
        this.f15850a.r0(i10, i11, i12);
    }

    @Override
    public final void s(int i10, long j3) {
        S0();
        this.f15850a.s(i10, j3);
    }

    @Override
    public final void s0(b2.k0 k0Var, int i10) {
        S0();
        this.f15850a.s0(k0Var, i10);
    }

    @Override
    public final void stop() {
        S0();
        this.f15850a.stop();
    }

    @Override
    public final b2.x0 t() {
        S0();
        return this.f15850a.t();
    }

    @Override
    public final boolean t0() {
        S0();
        return this.f15850a.t0();
    }

    @Override
    public final boolean u() {
        S0();
        return this.f15850a.u();
    }

    @Override
    public final int u0() {
        S0();
        return this.f15850a.u0();
    }

    @Override
    public final void v() {
        S0();
        this.f15850a.v();
    }

    @Override
    public final void v0(List list) {
        S0();
        this.f15850a.v0(list);
    }

    @Override
    public final b2.k0 w() {
        S0();
        return this.f15850a.w();
    }

    @Override
    public final b2.k1 w0() {
        S0();
        return this.f15850a.w0();
    }

    @Override
    public final void x(boolean z10) {
        S0();
        this.f15850a.x(z10);
    }

    @Override
    public final boolean x0() {
        S0();
        return this.f15850a.x0();
    }

    @Override
    public final int y() {
        S0();
        return this.f15850a.y();
    }

    @Override
    public final Looper y0() {
        return this.f15850a.y0();
    }

    @Override
    public final long z() {
        S0();
        return this.f15850a.z();
    }

    @Override
    public final void z0() {
        S0();
        this.f15850a.z0();
    }
}
