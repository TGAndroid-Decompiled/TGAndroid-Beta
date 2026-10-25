package m4;

import a8.yb;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b2.b2;
import java.util.IdentityHashMap;
import java.util.List;
public final class n1 implements b2.g1 {
    public final b2.g1 f18169a;
    public final IdentityHashMap f18170b = new IdentityHashMap();

    public n1(b2.g1 g1Var) {
        this.f18169a = g1Var;
    }

    @Override
    public final int A() {
        V0();
        return this.f18169a.A();
    }

    @Override
    public final Looper A0() {
        return this.f18169a.A0();
    }

    @Override
    public final void B(b2.s0 s0Var) {
        V0();
        this.f18169a.B(s0Var);
    }

    @Override
    public final void B0() {
        V0();
        this.f18169a.B0();
    }

    @Override
    public final void C(b2.e1 e1Var) {
        V0();
        synchronized (this.f18170b) {
            b2.e1 e1Var2 = (b2.e1) this.f18170b.remove(e1Var);
            b2.g1 g1Var = this.f18169a;
            if (e1Var2 != null) {
                e1Var = e1Var2;
            }
            g1Var.C(e1Var);
        }
    }

    @Override
    public final void C0() {
        V0();
        this.f18169a.C0();
    }

    @Override
    public final b2 D() {
        V0();
        return this.f18169a.D();
    }

    @Override
    public final boolean D0() {
        V0();
        return this.f18169a.D0();
    }

    @Override
    public final void E() {
        V0();
        this.f18169a.E();
    }

    @Override
    public final b2.u1 E0() {
        V0();
        return this.f18169a.E0();
    }

    @Override
    public final float F() {
        V0();
        return this.f18169a.F();
    }

    @Override
    public final long F0() {
        V0();
        return this.f18169a.F0();
    }

    @Override
    public final void G() {
        V0();
        this.f18169a.G();
    }

    @Override
    public final void G0(int i10) {
        V0();
        this.f18169a.G0(i10);
    }

    @Override
    public final b2.f H() {
        V0();
        return this.f18169a.H();
    }

    @Override
    public final void H0() {
        V0();
        this.f18169a.H0();
    }

    @Override
    public final void I(int i10, boolean z10) {
        V0();
        this.f18169a.I(i10, z10);
    }

    @Override
    public final void I0() {
        V0();
        this.f18169a.I0();
    }

    @Override
    public final b2.q J() {
        V0();
        return this.f18169a.J();
    }

    @Override
    public final void J0() {
        V0();
        this.f18169a.J0();
    }

    @Override
    public final void K() {
        V0();
        this.f18169a.K();
    }

    @Override
    public final b2.s0 K0() {
        V0();
        return this.f18169a.K0();
    }

    @Override
    public final void L(int i10, int i11) {
        V0();
        this.f18169a.L(i10, i11);
    }

    @Override
    public final void L0(List list) {
        V0();
        this.f18169a.L0(list);
    }

    @Override
    public final void M(int i10) {
        V0();
        this.f18169a.M(i10);
    }

    @Override
    public final long M0() {
        V0();
        return this.f18169a.M0();
    }

    @Override
    public final int N() {
        V0();
        return this.f18169a.N();
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        this.f18169a.N0(fVar, z10);
    }

    @Override
    public final void O(int i10, int i11, List list) {
        V0();
        this.f18169a.O(i10, i11, list);
    }

    @Override
    public final long O0() {
        V0();
        return this.f18169a.O0();
    }

    @Override
    public final boolean P() {
        return this.f18169a.P();
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f18169a.P0();
    }

    @Override
    public final void Q(int i10) {
        V0();
        this.f18169a.Q(i10);
    }

    public final b2.f1 Q0() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        b2.p0 p0Var;
        long j10;
        int i12;
        boolean z12;
        boolean o02 = o0(16);
        boolean o03 = o0(17);
        boolean z13 = false;
        if (o03) {
            i10 = n0();
        } else {
            i10 = 0;
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        if (o03) {
            i11 = A();
        } else {
            i11 = 0;
        }
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.p(z11);
        if (o03) {
            b2.p1 y02 = y0();
            if (!y02.p()) {
                if (i10 < y02.o()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                yb.p(z12);
                b2.o1 m10 = y02.m(i10, new b2.o1(), 0L);
                if (i11 == e2.n0.i(i11, m10.f3335n, m10.f3336o)) {
                    z13 = true;
                }
                yb.p(z13);
            }
        }
        long j11 = 0;
        if (o02) {
            p0Var = v();
        } else {
            p0Var = null;
        }
        b2.p0 p0Var2 = p0Var;
        if (o02) {
            j10 = M0();
        } else {
            j10 = 0;
        }
        if (o02) {
            j11 = a0();
        }
        long j12 = j11;
        int i13 = -1;
        if (o02) {
            i12 = m0();
        } else {
            i12 = -1;
        }
        if (o02) {
            i13 = N();
        }
        return new b2.f1(null, i10, p0Var2, null, i11, j10, j12, i12, i13);
    }

    @Override
    public final void R(int i10, int i11) {
        V0();
        this.f18169a.R(i10, i11);
    }

    public final s1 R0() {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean o02 = o0(16);
        b2.f1 Q0 = Q0();
        int i10 = 0;
        if (o02 && n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = -9223372036854775807L;
        if (o02) {
            j10 = getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        long j15 = 0;
        if (o02) {
            j11 = d0();
        } else {
            j11 = 0;
        }
        if (o02) {
            i10 = x();
        }
        if (o02) {
            j12 = q();
        } else {
            j12 = 0;
        }
        if (o02) {
            j13 = o();
        } else {
            j13 = -9223372036854775807L;
        }
        if (o02) {
            j14 = z();
        }
        if (o02) {
            j15 = F0();
        }
        return new s1(Q0, z10, elapsedRealtime, j10, j11, i10, j12, j13, j14, j15);
    }

    @Override
    public final void S(long j10, int i10, List list) {
        V0();
        this.f18169a.S(j10, i10, list);
    }

    public final b2.p0 S0() {
        if (o0(16)) {
            return v();
        }
        return null;
    }

    @Override
    public final void T(SurfaceHolder surfaceHolder) {
        V0();
        this.f18169a.T(surfaceHolder);
    }

    public final b2.p1 T0() {
        if (o0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new m1(this);
        }
        return b2.p1.f3348a;
    }

    @Override
    public final void U(float f7) {
        V0();
        this.f18169a.U(f7);
    }

    public final b2.s0 U0() {
        if (o0(18)) {
            return K0();
        }
        return b2.s0.L;
    }

    @Override
    public final void V() {
        V0();
        this.f18169a.V();
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f18169a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
    }

    @Override
    public final b2.z0 W() {
        V0();
        return this.f18169a.W();
    }

    @Override
    public final void X(boolean z10) {
        V0();
        this.f18169a.X(z10);
    }

    @Override
    public final void Y(int i10) {
        V0();
        this.f18169a.Y(i10);
    }

    @Override
    public final long Z() {
        V0();
        return this.f18169a.Z();
    }

    @Override
    public final void a() {
        V0();
        this.f18169a.a();
    }

    @Override
    public final long a0() {
        V0();
        return this.f18169a.a0();
    }

    @Override
    public final void b(float f7) {
        V0();
        this.f18169a.b(f7);
    }

    @Override
    public final void b0(int i10, List list) {
        V0();
        this.f18169a.b0(i10, list);
    }

    @Override
    public final boolean c() {
        V0();
        return this.f18169a.c();
    }

    @Override
    public final void c0() {
        V0();
        this.f18169a.c0();
    }

    @Override
    public final int d() {
        V0();
        return this.f18169a.d();
    }

    @Override
    public final long d0() {
        V0();
        return this.f18169a.d0();
    }

    @Override
    public final void e() {
        V0();
        this.f18169a.e();
    }

    @Override
    public final boolean e0() {
        V0();
        return this.f18169a.e0();
    }

    @Override
    public final void f(b2.a1 a1Var) {
        V0();
        this.f18169a.f(a1Var);
    }

    @Override
    public final void f0() {
        V0();
        this.f18169a.f0();
    }

    @Override
    public final void g(long j10) {
        V0();
        this.f18169a.g(j10);
    }

    @Override
    public final void g0(int i10) {
        V0();
        this.f18169a.g0(i10);
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f18169a.getDuration();
    }

    @Override
    public final b2.a1 h() {
        V0();
        return this.f18169a.h();
    }

    @Override
    public final b2.w1 h0() {
        V0();
        return this.f18169a.h0();
    }

    @Override
    public final void i() {
        V0();
        this.f18169a.i();
    }

    @Override
    public final b2.s0 i0() {
        V0();
        return this.f18169a.i0();
    }

    @Override
    public final void j(int i10) {
        V0();
        this.f18169a.j(i10);
    }

    @Override
    public final boolean j0() {
        V0();
        return this.f18169a.j0();
    }

    @Override
    public final void k(b2.p0 p0Var, long j10) {
        V0();
        this.f18169a.k(p0Var, j10);
    }

    @Override
    public final d2.c k0() {
        V0();
        return this.f18169a.k0();
    }

    @Override
    public final int l() {
        V0();
        return this.f18169a.l();
    }

    @Override
    public final void l0(b2.p0 p0Var) {
        V0();
        this.f18169a.l0(p0Var);
    }

    @Override
    public final int m() {
        V0();
        return this.f18169a.m();
    }

    @Override
    public final int m0() {
        V0();
        return this.f18169a.m0();
    }

    @Override
    public final boolean n() {
        V0();
        return this.f18169a.n();
    }

    @Override
    public final int n0() {
        V0();
        return this.f18169a.n0();
    }

    @Override
    public final long o() {
        V0();
        return this.f18169a.o();
    }

    @Override
    public final boolean o0(int i10) {
        V0();
        return this.f18169a.o0(i10);
    }

    @Override
    public final void p(b2.u1 u1Var) {
        V0();
        this.f18169a.p(u1Var);
    }

    @Override
    public final void p0(b2.e1 e1Var) {
        V0();
        synchronized (this.f18170b) {
            try {
                b2.y yVar = (b2.y) this.f18170b.get(e1Var);
                if (yVar == null) {
                    yVar = new b2.y(this, e1Var);
                }
                this.f18169a.p0(yVar);
                this.f18170b.put(e1Var, yVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final long q() {
        V0();
        return this.f18169a.q();
    }

    @Override
    public final void q0(boolean z10) {
        V0();
        this.f18169a.q0(z10);
    }

    @Override
    public final void r(int i10, long j10) {
        V0();
        this.f18169a.r(i10, j10);
    }

    @Override
    public final void r0(b2.p0 p0Var) {
        V0();
        this.f18169a.r0(p0Var);
    }

    @Override
    public final b2.c1 s() {
        V0();
        return this.f18169a.s();
    }

    @Override
    public final void s0(int i10, int i11) {
        V0();
        this.f18169a.s0(i10, i11);
    }

    @Override
    public final void stop() {
        V0();
        this.f18169a.stop();
    }

    @Override
    public final boolean t() {
        V0();
        return this.f18169a.t();
    }

    @Override
    public final void t0(int i10, int i11, int i12) {
        V0();
        this.f18169a.t0(i10, i11, i12);
    }

    @Override
    public final void u() {
        V0();
        this.f18169a.u();
    }

    @Override
    public final void u0(b2.p0 p0Var, int i10) {
        V0();
        this.f18169a.u0(p0Var, i10);
    }

    @Override
    public final b2.p0 v() {
        V0();
        return this.f18169a.v();
    }

    @Override
    public final boolean v0() {
        V0();
        return this.f18169a.v0();
    }

    @Override
    public final void w(boolean z10) {
        V0();
        this.f18169a.w(z10);
    }

    @Override
    public final int w0() {
        V0();
        return this.f18169a.w0();
    }

    @Override
    public final int x() {
        V0();
        return this.f18169a.x();
    }

    @Override
    public final void x0(List list) {
        V0();
        this.f18169a.x0(list);
    }

    @Override
    public final long y() {
        V0();
        return this.f18169a.y();
    }

    @Override
    public final b2.p1 y0() {
        V0();
        return this.f18169a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f18169a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f18169a.z0();
    }
}
