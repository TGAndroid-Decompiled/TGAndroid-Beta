package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b2.b2;
import b2.w1;
import java.util.IdentityHashMap;
import java.util.List;
import v7.t6;
public final class n1 implements b2.f1 {
    public final b2.f1 f12867a;
    public final IdentityHashMap f12868b = new IdentityHashMap();

    public n1(b2.f1 f1Var) {
        this.f12867a = f1Var;
    }

    @Override
    public final int A() {
        V0();
        return this.f12867a.A();
    }

    @Override
    public final Looper A0() {
        return this.f12867a.A0();
    }

    @Override
    public final void B(b2.s0 s0Var) {
        V0();
        this.f12867a.B(s0Var);
    }

    @Override
    public final void B0() {
        V0();
        this.f12867a.B0();
    }

    @Override
    public final void C(b2.d1 d1Var) {
        V0();
        synchronized (this.f12868b) {
            b2.d1 d1Var2 = (b2.d1) this.f12868b.remove(d1Var);
            b2.f1 f1Var = this.f12867a;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            f1Var.C(d1Var);
        }
    }

    @Override
    public final void C0() {
        V0();
        this.f12867a.C0();
    }

    @Override
    public final b2 D() {
        V0();
        return this.f12867a.D();
    }

    @Override
    public final boolean D0() {
        V0();
        return this.f12867a.D0();
    }

    @Override
    public final void E() {
        V0();
        this.f12867a.E();
    }

    @Override
    public final b2.u1 E0() {
        V0();
        return this.f12867a.E0();
    }

    @Override
    public final float F() {
        V0();
        return this.f12867a.F();
    }

    @Override
    public final long F0() {
        V0();
        return this.f12867a.F0();
    }

    @Override
    public final void G() {
        V0();
        this.f12867a.G();
    }

    @Override
    public final void G0(int i10) {
        V0();
        this.f12867a.G0(i10);
    }

    @Override
    public final b2.f H() {
        V0();
        return this.f12867a.H();
    }

    @Override
    public final void H0() {
        V0();
        this.f12867a.H0();
    }

    @Override
    public final void I(int i10, boolean z10) {
        V0();
        this.f12867a.I(i10, z10);
    }

    @Override
    public final void I0() {
        V0();
        this.f12867a.I0();
    }

    @Override
    public final b2.q J() {
        V0();
        return this.f12867a.J();
    }

    @Override
    public final void J0() {
        V0();
        this.f12867a.J0();
    }

    @Override
    public final void K() {
        V0();
        this.f12867a.K();
    }

    @Override
    public final b2.s0 K0() {
        V0();
        return this.f12867a.K0();
    }

    @Override
    public final void L(int i10, int i11) {
        V0();
        this.f12867a.L(i10, i11);
    }

    @Override
    public final void L0(List list) {
        V0();
        this.f12867a.L0(list);
    }

    @Override
    public final void M(int i10) {
        V0();
        this.f12867a.M(i10);
    }

    @Override
    public final long M0() {
        V0();
        return this.f12867a.M0();
    }

    @Override
    public final int N() {
        V0();
        return this.f12867a.N();
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        this.f12867a.N0(fVar, z10);
    }

    @Override
    public final boolean O() {
        return this.f12867a.O();
    }

    @Override
    public final long O0() {
        V0();
        return this.f12867a.O0();
    }

    @Override
    public final void P(int i10) {
        V0();
        this.f12867a.P(i10);
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f12867a.P0();
    }

    @Override
    public final void Q(int i10, int i11) {
        V0();
        this.f12867a.Q(i10, i11);
    }

    public final b2.e1 Q0() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        b2.p0 p0Var;
        long j10;
        int i12;
        boolean z12;
        boolean n02 = n0(16);
        boolean n03 = n0(17);
        boolean z13 = false;
        if (n03) {
            i10 = m0();
        } else {
            i10 = 0;
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        if (n03) {
            i11 = A();
        } else {
            i11 = 0;
        }
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.p(z11);
        if (n03) {
            b2.o1 y02 = y0();
            if (!y02.p()) {
                if (i10 < y02.o()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t6.p(z12);
                b2.n1 m10 = y02.m(i10, new b2.n1(), 0L);
                if (i11 == e2.l0.i(i11, m10.f2147n, m10.f2148o)) {
                    z13 = true;
                }
                t6.p(z13);
            }
        }
        long j11 = 0;
        if (n02) {
            p0Var = v();
        } else {
            p0Var = null;
        }
        b2.p0 p0Var2 = p0Var;
        if (n02) {
            j10 = M0();
        } else {
            j10 = 0;
        }
        if (n02) {
            j11 = Z();
        }
        long j12 = j11;
        int i13 = -1;
        if (n02) {
            i12 = l0();
        } else {
            i12 = -1;
        }
        if (n02) {
            i13 = N();
        }
        return new b2.e1(null, i10, p0Var2, null, i11, j10, j12, i12, i13);
    }

    @Override
    public final void R(SurfaceHolder surfaceHolder) {
        V0();
        this.f12867a.R(surfaceHolder);
    }

    public final s1 R0() {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean n02 = n0(16);
        b2.e1 Q0 = Q0();
        int i10 = 0;
        if (n02 && n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = -9223372036854775807L;
        if (n02) {
            j10 = getDuration();
        } else {
            j10 = -9223372036854775807L;
        }
        long j15 = 0;
        if (n02) {
            j11 = c0();
        } else {
            j11 = 0;
        }
        if (n02) {
            i10 = x();
        }
        if (n02) {
            j12 = q();
        } else {
            j12 = 0;
        }
        if (n02) {
            j13 = o();
        } else {
            j13 = -9223372036854775807L;
        }
        if (n02) {
            j14 = z();
        }
        if (n02) {
            j15 = F0();
        }
        return new s1(Q0, z10, elapsedRealtime, j10, j11, i10, j12, j13, j14, j15);
    }

    @Override
    public final void S(float f7) {
        V0();
        this.f12867a.S(f7);
    }

    public final b2.p0 S0() {
        if (n0(16)) {
            return v();
        }
        return null;
    }

    @Override
    public final void T() {
        V0();
        this.f12867a.T();
    }

    public final b2.o1 T0() {
        if (n0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new m1(this);
        }
        return b2.o1.f2172a;
    }

    @Override
    public final void U(List list, int i10, long j10) {
        V0();
        this.f12867a.U(list, i10, j10);
    }

    public final b2.s0 U0() {
        if (n0(18)) {
            return K0();
        }
        return b2.s0.L;
    }

    @Override
    public final b2.y0 V() {
        V0();
        return this.f12867a.V();
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f12867a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
    }

    @Override
    public final void W(boolean z10) {
        V0();
        this.f12867a.W(z10);
    }

    @Override
    public final void X(int i10) {
        V0();
        this.f12867a.X(i10);
    }

    @Override
    public final long Y() {
        V0();
        return this.f12867a.Y();
    }

    @Override
    public final long Z() {
        V0();
        return this.f12867a.Z();
    }

    @Override
    public final void a() {
        V0();
        this.f12867a.a();
    }

    @Override
    public final void a0(int i10, List list) {
        V0();
        this.f12867a.a0(i10, list);
    }

    @Override
    public final void b(float f7) {
        V0();
        this.f12867a.b(f7);
    }

    @Override
    public final void b0() {
        V0();
        this.f12867a.b0();
    }

    @Override
    public final void c(b2.z0 z0Var) {
        V0();
        this.f12867a.c(z0Var);
    }

    @Override
    public final long c0() {
        V0();
        return this.f12867a.c0();
    }

    @Override
    public final boolean d() {
        V0();
        return this.f12867a.d();
    }

    @Override
    public final boolean d0() {
        V0();
        return this.f12867a.d0();
    }

    @Override
    public final void e() {
        V0();
        this.f12867a.e();
    }

    @Override
    public final void e0() {
        V0();
        this.f12867a.e0();
    }

    @Override
    public final void f(long j10) {
        V0();
        this.f12867a.f(j10);
    }

    @Override
    public final void f0(int i10) {
        V0();
        this.f12867a.f0(i10);
    }

    @Override
    public final b2.z0 g() {
        V0();
        return this.f12867a.g();
    }

    @Override
    public final w1 g0() {
        V0();
        return this.f12867a.g0();
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f12867a.getDuration();
    }

    @Override
    public final int h() {
        V0();
        return this.f12867a.h();
    }

    @Override
    public final b2.s0 h0() {
        V0();
        return this.f12867a.h0();
    }

    @Override
    public final void i(b2.p0 p0Var, long j10) {
        V0();
        this.f12867a.i(p0Var, j10);
    }

    @Override
    public final boolean i0() {
        V0();
        return this.f12867a.i0();
    }

    @Override
    public final void j() {
        V0();
        this.f12867a.j();
    }

    @Override
    public final d2.d j0() {
        V0();
        return this.f12867a.j0();
    }

    @Override
    public final void k(int i10) {
        V0();
        this.f12867a.k(i10);
    }

    @Override
    public final void k0(b2.p0 p0Var) {
        V0();
        this.f12867a.k0(p0Var);
    }

    @Override
    public final int l() {
        V0();
        return this.f12867a.l();
    }

    @Override
    public final int l0() {
        V0();
        return this.f12867a.l0();
    }

    @Override
    public final int m() {
        V0();
        return this.f12867a.m();
    }

    @Override
    public final int m0() {
        V0();
        return this.f12867a.m0();
    }

    @Override
    public final boolean n() {
        V0();
        return this.f12867a.n();
    }

    @Override
    public final boolean n0(int i10) {
        V0();
        return this.f12867a.n0(i10);
    }

    @Override
    public final long o() {
        V0();
        return this.f12867a.o();
    }

    @Override
    public final void o0(b2.d1 d1Var) {
        V0();
        synchronized (this.f12868b) {
            try {
                b2.y yVar = (b2.y) this.f12868b.get(d1Var);
                if (yVar == null) {
                    yVar = new b2.y(this, d1Var);
                }
                this.f12867a.o0(yVar);
                this.f12868b.put(d1Var, yVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void p(b2.u1 u1Var) {
        V0();
        this.f12867a.p(u1Var);
    }

    @Override
    public final void p0(boolean z10) {
        V0();
        this.f12867a.p0(z10);
    }

    @Override
    public final long q() {
        V0();
        return this.f12867a.q();
    }

    @Override
    public final void q0(int i10, b2.p0 p0Var) {
        V0();
        this.f12867a.q0(i10, p0Var);
    }

    @Override
    public final void r(int i10, long j10) {
        V0();
        this.f12867a.r(i10, j10);
    }

    @Override
    public final void r0(List list, int i10, int i11) {
        V0();
        this.f12867a.r0(list, i10, i11);
    }

    @Override
    public final b2.b1 s() {
        V0();
        return this.f12867a.s();
    }

    @Override
    public final void s0(b2.p0 p0Var) {
        V0();
        this.f12867a.s0(p0Var);
    }

    @Override
    public final void stop() {
        V0();
        this.f12867a.stop();
    }

    @Override
    public final boolean t() {
        V0();
        return this.f12867a.t();
    }

    @Override
    public final void t0(int i10, int i11) {
        V0();
        this.f12867a.t0(i10, i11);
    }

    @Override
    public final void u() {
        V0();
        this.f12867a.u();
    }

    @Override
    public final void u0(int i10, int i11, int i12) {
        V0();
        this.f12867a.u0(i10, i11, i12);
    }

    @Override
    public final b2.p0 v() {
        V0();
        return this.f12867a.v();
    }

    @Override
    public final boolean v0() {
        V0();
        return this.f12867a.v0();
    }

    @Override
    public final void w(boolean z10) {
        V0();
        this.f12867a.w(z10);
    }

    @Override
    public final int w0() {
        V0();
        return this.f12867a.w0();
    }

    @Override
    public final int x() {
        V0();
        return this.f12867a.x();
    }

    @Override
    public final void x0(List list) {
        V0();
        this.f12867a.x0(list);
    }

    @Override
    public final long y() {
        V0();
        return this.f12867a.y();
    }

    @Override
    public final b2.o1 y0() {
        V0();
        return this.f12867a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f12867a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f12867a.z0();
    }
}
