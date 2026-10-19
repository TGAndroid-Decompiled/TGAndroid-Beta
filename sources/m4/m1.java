package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b2.a2;
import b2.v1;
import java.util.IdentityHashMap;
import java.util.List;
import v7.u6;
public final class m1 implements b2.f1 {
    public final b2.f1 f16643a;
    public final IdentityHashMap f16644b = new IdentityHashMap();

    public m1(b2.f1 f1Var) {
        this.f16643a = f1Var;
    }

    @Override
    public final int A() {
        V0();
        return this.f16643a.A();
    }

    @Override
    public final Looper A0() {
        return this.f16643a.A0();
    }

    @Override
    public final void B(b2.r0 r0Var) {
        V0();
        this.f16643a.B(r0Var);
    }

    @Override
    public final void B0() {
        V0();
        this.f16643a.B0();
    }

    @Override
    public final void C(b2.d1 d1Var) {
        V0();
        synchronized (this.f16644b) {
            b2.d1 d1Var2 = (b2.d1) this.f16644b.remove(d1Var);
            b2.f1 f1Var = this.f16643a;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            f1Var.C(d1Var);
        }
    }

    @Override
    public final void C0() {
        V0();
        this.f16643a.C0();
    }

    @Override
    public final a2 D() {
        V0();
        return this.f16643a.D();
    }

    @Override
    public final boolean D0() {
        V0();
        return this.f16643a.D0();
    }

    @Override
    public final void E() {
        V0();
        this.f16643a.E();
    }

    @Override
    public final b2.t1 E0() {
        V0();
        return this.f16643a.E0();
    }

    @Override
    public final float F() {
        V0();
        return this.f16643a.F();
    }

    @Override
    public final long F0() {
        V0();
        return this.f16643a.F0();
    }

    @Override
    public final void G() {
        V0();
        this.f16643a.G();
    }

    @Override
    public final void G0(int i10) {
        V0();
        this.f16643a.G0(i10);
    }

    @Override
    public final b2.f H() {
        V0();
        return this.f16643a.H();
    }

    @Override
    public final void H0() {
        V0();
        this.f16643a.H0();
    }

    @Override
    public final void I(int i10, boolean z10) {
        V0();
        this.f16643a.I(i10, z10);
    }

    @Override
    public final void I0() {
        V0();
        this.f16643a.I0();
    }

    @Override
    public final b2.p J() {
        V0();
        return this.f16643a.J();
    }

    @Override
    public final void J0() {
        V0();
        this.f16643a.J0();
    }

    @Override
    public final void K() {
        V0();
        this.f16643a.K();
    }

    @Override
    public final b2.r0 K0() {
        V0();
        return this.f16643a.K0();
    }

    @Override
    public final void L(int i10, int i11) {
        V0();
        this.f16643a.L(i10, i11);
    }

    @Override
    public final void L0(List list) {
        V0();
        this.f16643a.L0(list);
    }

    @Override
    public final void M(int i10) {
        V0();
        this.f16643a.M(i10);
    }

    @Override
    public final long M0() {
        V0();
        return this.f16643a.M0();
    }

    @Override
    public final int N() {
        V0();
        return this.f16643a.N();
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        this.f16643a.N0(fVar, z10);
    }

    @Override
    public final void O(int i10, int i11, List list) {
        V0();
        this.f16643a.O(i10, i11, list);
    }

    @Override
    public final long O0() {
        V0();
        return this.f16643a.O0();
    }

    @Override
    public final boolean P() {
        return this.f16643a.P();
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f16643a.P0();
    }

    @Override
    public final void Q(int i10) {
        V0();
        this.f16643a.Q(i10);
    }

    public final b2.e1 Q0() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        b2.o0 o0Var;
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
        u6.p(z10);
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
        u6.p(z11);
        if (o03) {
            b2.o1 y02 = y0();
            if (!y02.p()) {
                if (i10 < y02.o()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u6.p(z12);
                b2.n1 m10 = y02.m(i10, new b2.n1(), 0L);
                if (i11 == e2.m0.i(i11, m10.f3879n, m10.f3880o)) {
                    z13 = true;
                }
                u6.p(z13);
            }
        }
        long j11 = 0;
        if (o02) {
            o0Var = v();
        } else {
            o0Var = null;
        }
        b2.o0 o0Var2 = o0Var;
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
        return new b2.e1(null, i10, o0Var2, null, i11, j10, j12, i12, i13);
    }

    @Override
    public final void R(int i10, int i11) {
        V0();
        this.f16643a.R(i10, i11);
    }

    public final r1 R0() {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean o02 = o0(16);
        b2.e1 Q0 = Q0();
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
        return new r1(Q0, z10, elapsedRealtime, j10, j11, i10, j12, j13, j14, j15);
    }

    @Override
    public final void S(long j10, int i10, List list) {
        V0();
        this.f16643a.S(j10, i10, list);
    }

    public final b2.o0 S0() {
        if (o0(16)) {
            return v();
        }
        return null;
    }

    @Override
    public final void T(SurfaceHolder surfaceHolder) {
        V0();
        this.f16643a.T(surfaceHolder);
    }

    public final b2.o1 T0() {
        if (o0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new l1(this);
        }
        return b2.o1.f3892a;
    }

    @Override
    public final void U(float f7) {
        V0();
        this.f16643a.U(f7);
    }

    public final b2.r0 U0() {
        if (o0(18)) {
            return K0();
        }
        return b2.r0.L;
    }

    @Override
    public final void V() {
        V0();
        this.f16643a.V();
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f16643a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
    }

    @Override
    public final b2.y0 W() {
        V0();
        return this.f16643a.W();
    }

    @Override
    public final void X(boolean z10) {
        V0();
        this.f16643a.X(z10);
    }

    @Override
    public final void Y(int i10) {
        V0();
        this.f16643a.Y(i10);
    }

    @Override
    public final long Z() {
        V0();
        return this.f16643a.Z();
    }

    @Override
    public final void a(float f7) {
        V0();
        this.f16643a.a(f7);
    }

    @Override
    public final long a0() {
        V0();
        return this.f16643a.a0();
    }

    @Override
    public final void b() {
        V0();
        this.f16643a.b();
    }

    @Override
    public final void b0(int i10, List list) {
        V0();
        this.f16643a.b0(i10, list);
    }

    @Override
    public final boolean c() {
        V0();
        return this.f16643a.c();
    }

    @Override
    public final void c0() {
        V0();
        this.f16643a.c0();
    }

    @Override
    public final int d() {
        V0();
        return this.f16643a.d();
    }

    @Override
    public final long d0() {
        V0();
        return this.f16643a.d0();
    }

    @Override
    public final void e() {
        V0();
        this.f16643a.e();
    }

    @Override
    public final boolean e0() {
        V0();
        return this.f16643a.e0();
    }

    @Override
    public final void f(b2.z0 z0Var) {
        V0();
        this.f16643a.f(z0Var);
    }

    @Override
    public final void f0() {
        V0();
        this.f16643a.f0();
    }

    @Override
    public final void g(long j10) {
        V0();
        this.f16643a.g(j10);
    }

    @Override
    public final void g0(int i10) {
        V0();
        this.f16643a.g0(i10);
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f16643a.getDuration();
    }

    @Override
    public final b2.z0 h() {
        V0();
        return this.f16643a.h();
    }

    @Override
    public final v1 h0() {
        V0();
        return this.f16643a.h0();
    }

    @Override
    public final void i() {
        V0();
        this.f16643a.i();
    }

    @Override
    public final b2.r0 i0() {
        V0();
        return this.f16643a.i0();
    }

    @Override
    public final void j(int i10) {
        V0();
        this.f16643a.j(i10);
    }

    @Override
    public final boolean j0() {
        V0();
        return this.f16643a.j0();
    }

    @Override
    public final void k(b2.o0 o0Var, long j10) {
        V0();
        this.f16643a.k(o0Var, j10);
    }

    @Override
    public final d2.c k0() {
        V0();
        return this.f16643a.k0();
    }

    @Override
    public final int l() {
        V0();
        return this.f16643a.l();
    }

    @Override
    public final void l0(b2.o0 o0Var) {
        V0();
        this.f16643a.l0(o0Var);
    }

    @Override
    public final int m() {
        V0();
        return this.f16643a.m();
    }

    @Override
    public final int m0() {
        V0();
        return this.f16643a.m0();
    }

    @Override
    public final boolean n() {
        V0();
        return this.f16643a.n();
    }

    @Override
    public final int n0() {
        V0();
        return this.f16643a.n0();
    }

    @Override
    public final long o() {
        V0();
        return this.f16643a.o();
    }

    @Override
    public final boolean o0(int i10) {
        V0();
        return this.f16643a.o0(i10);
    }

    @Override
    public final void p(b2.t1 t1Var) {
        V0();
        this.f16643a.p(t1Var);
    }

    @Override
    public final void p0(b2.d1 d1Var) {
        V0();
        synchronized (this.f16644b) {
            try {
                b2.x xVar = (b2.x) this.f16644b.get(d1Var);
                if (xVar == null) {
                    xVar = new b2.x(this, d1Var);
                }
                this.f16643a.p0(xVar);
                this.f16644b.put(d1Var, xVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final long q() {
        V0();
        return this.f16643a.q();
    }

    @Override
    public final void q0(boolean z10) {
        V0();
        this.f16643a.q0(z10);
    }

    @Override
    public final void r(int i10, long j10) {
        V0();
        this.f16643a.r(i10, j10);
    }

    @Override
    public final void r0(b2.o0 o0Var) {
        V0();
        this.f16643a.r0(o0Var);
    }

    @Override
    public final b2.b1 s() {
        V0();
        return this.f16643a.s();
    }

    @Override
    public final void s0(int i10, int i11) {
        V0();
        this.f16643a.s0(i10, i11);
    }

    @Override
    public final void stop() {
        V0();
        this.f16643a.stop();
    }

    @Override
    public final boolean t() {
        V0();
        return this.f16643a.t();
    }

    @Override
    public final void t0(int i10, int i11, int i12) {
        V0();
        this.f16643a.t0(i10, i11, i12);
    }

    @Override
    public final void u() {
        V0();
        this.f16643a.u();
    }

    @Override
    public final void u0(b2.o0 o0Var, int i10) {
        V0();
        this.f16643a.u0(o0Var, i10);
    }

    @Override
    public final b2.o0 v() {
        V0();
        return this.f16643a.v();
    }

    @Override
    public final boolean v0() {
        V0();
        return this.f16643a.v0();
    }

    @Override
    public final void w(boolean z10) {
        V0();
        this.f16643a.w(z10);
    }

    @Override
    public final int w0() {
        V0();
        return this.f16643a.w0();
    }

    @Override
    public final int x() {
        V0();
        return this.f16643a.x();
    }

    @Override
    public final void x0(List list) {
        V0();
        this.f16643a.x0(list);
    }

    @Override
    public final long y() {
        V0();
        return this.f16643a.y();
    }

    @Override
    public final b2.o1 y0() {
        V0();
        return this.f16643a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f16643a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f16643a.z0();
    }
}
