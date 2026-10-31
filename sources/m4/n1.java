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
    public final b2.f1 f12866a;
    public final IdentityHashMap f12867b = new IdentityHashMap();

    public n1(b2.f1 f1Var) {
        this.f12866a = f1Var;
    }

    @Override
    public final int A() {
        V0();
        return this.f12866a.A();
    }

    @Override
    public final Looper A0() {
        return this.f12866a.A0();
    }

    @Override
    public final void B(b2.s0 s0Var) {
        V0();
        this.f12866a.B(s0Var);
    }

    @Override
    public final void B0() {
        V0();
        this.f12866a.B0();
    }

    @Override
    public final void C(b2.d1 d1Var) {
        V0();
        synchronized (this.f12867b) {
            b2.d1 d1Var2 = (b2.d1) this.f12867b.remove(d1Var);
            b2.f1 f1Var = this.f12866a;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            f1Var.C(d1Var);
        }
    }

    @Override
    public final void C0() {
        V0();
        this.f12866a.C0();
    }

    @Override
    public final b2 D() {
        V0();
        return this.f12866a.D();
    }

    @Override
    public final boolean D0() {
        V0();
        return this.f12866a.D0();
    }

    @Override
    public final void E() {
        V0();
        this.f12866a.E();
    }

    @Override
    public final b2.u1 E0() {
        V0();
        return this.f12866a.E0();
    }

    @Override
    public final float F() {
        V0();
        return this.f12866a.F();
    }

    @Override
    public final long F0() {
        V0();
        return this.f12866a.F0();
    }

    @Override
    public final void G() {
        V0();
        this.f12866a.G();
    }

    @Override
    public final void G0(int i10) {
        V0();
        this.f12866a.G0(i10);
    }

    @Override
    public final b2.f H() {
        V0();
        return this.f12866a.H();
    }

    @Override
    public final void H0() {
        V0();
        this.f12866a.H0();
    }

    @Override
    public final void I(int i10, boolean z10) {
        V0();
        this.f12866a.I(i10, z10);
    }

    @Override
    public final void I0() {
        V0();
        this.f12866a.I0();
    }

    @Override
    public final b2.q J() {
        V0();
        return this.f12866a.J();
    }

    @Override
    public final void J0() {
        V0();
        this.f12866a.J0();
    }

    @Override
    public final void K() {
        V0();
        this.f12866a.K();
    }

    @Override
    public final b2.s0 K0() {
        V0();
        return this.f12866a.K0();
    }

    @Override
    public final void L(int i10, int i11) {
        V0();
        this.f12866a.L(i10, i11);
    }

    @Override
    public final void L0(List list) {
        V0();
        this.f12866a.L0(list);
    }

    @Override
    public final void M(int i10) {
        V0();
        this.f12866a.M(i10);
    }

    @Override
    public final long M0() {
        V0();
        return this.f12866a.M0();
    }

    @Override
    public final int N() {
        V0();
        return this.f12866a.N();
    }

    @Override
    public final void N0(b2.f fVar, boolean z10) {
        this.f12866a.N0(fVar, z10);
    }

    @Override
    public final boolean O() {
        return this.f12866a.O();
    }

    @Override
    public final long O0() {
        V0();
        return this.f12866a.O0();
    }

    @Override
    public final void P(int i10) {
        V0();
        this.f12866a.P(i10);
    }

    @Override
    public final boolean P0() {
        V0();
        return this.f12866a.P0();
    }

    @Override
    public final void Q(int i10, int i11) {
        V0();
        this.f12866a.Q(i10, i11);
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
        this.f12866a.R(surfaceHolder);
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
        this.f12866a.S(f7);
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
        this.f12866a.T();
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
        this.f12866a.U(list, i10, j10);
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
        return this.f12866a.V();
    }

    public final void V0() {
        boolean z10;
        if (Looper.myLooper() == this.f12866a.A0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
    }

    @Override
    public final void W(boolean z10) {
        V0();
        this.f12866a.W(z10);
    }

    @Override
    public final void X(int i10) {
        V0();
        this.f12866a.X(i10);
    }

    @Override
    public final long Y() {
        V0();
        return this.f12866a.Y();
    }

    @Override
    public final long Z() {
        V0();
        return this.f12866a.Z();
    }

    @Override
    public final void a() {
        V0();
        this.f12866a.a();
    }

    @Override
    public final void a0(int i10, List list) {
        V0();
        this.f12866a.a0(i10, list);
    }

    @Override
    public final void b(float f7) {
        V0();
        this.f12866a.b(f7);
    }

    @Override
    public final void b0() {
        V0();
        this.f12866a.b0();
    }

    @Override
    public final void c(b2.z0 z0Var) {
        V0();
        this.f12866a.c(z0Var);
    }

    @Override
    public final long c0() {
        V0();
        return this.f12866a.c0();
    }

    @Override
    public final boolean d() {
        V0();
        return this.f12866a.d();
    }

    @Override
    public final boolean d0() {
        V0();
        return this.f12866a.d0();
    }

    @Override
    public final void e() {
        V0();
        this.f12866a.e();
    }

    @Override
    public final void e0() {
        V0();
        this.f12866a.e0();
    }

    @Override
    public final void f(long j10) {
        V0();
        this.f12866a.f(j10);
    }

    @Override
    public final void f0(int i10) {
        V0();
        this.f12866a.f0(i10);
    }

    @Override
    public final b2.z0 g() {
        V0();
        return this.f12866a.g();
    }

    @Override
    public final w1 g0() {
        V0();
        return this.f12866a.g0();
    }

    @Override
    public final long getDuration() {
        V0();
        return this.f12866a.getDuration();
    }

    @Override
    public final int h() {
        V0();
        return this.f12866a.h();
    }

    @Override
    public final b2.s0 h0() {
        V0();
        return this.f12866a.h0();
    }

    @Override
    public final void i(b2.p0 p0Var, long j10) {
        V0();
        this.f12866a.i(p0Var, j10);
    }

    @Override
    public final boolean i0() {
        V0();
        return this.f12866a.i0();
    }

    @Override
    public final void j() {
        V0();
        this.f12866a.j();
    }

    @Override
    public final d2.d j0() {
        V0();
        return this.f12866a.j0();
    }

    @Override
    public final void k(int i10) {
        V0();
        this.f12866a.k(i10);
    }

    @Override
    public final void k0(b2.p0 p0Var) {
        V0();
        this.f12866a.k0(p0Var);
    }

    @Override
    public final int l() {
        V0();
        return this.f12866a.l();
    }

    @Override
    public final int l0() {
        V0();
        return this.f12866a.l0();
    }

    @Override
    public final int m() {
        V0();
        return this.f12866a.m();
    }

    @Override
    public final int m0() {
        V0();
        return this.f12866a.m0();
    }

    @Override
    public final boolean n() {
        V0();
        return this.f12866a.n();
    }

    @Override
    public final boolean n0(int i10) {
        V0();
        return this.f12866a.n0(i10);
    }

    @Override
    public final long o() {
        V0();
        return this.f12866a.o();
    }

    @Override
    public final void o0(b2.d1 d1Var) {
        V0();
        synchronized (this.f12867b) {
            try {
                b2.y yVar = (b2.y) this.f12867b.get(d1Var);
                if (yVar == null) {
                    yVar = new b2.y(this, d1Var);
                }
                this.f12866a.o0(yVar);
                this.f12867b.put(d1Var, yVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void p(b2.u1 u1Var) {
        V0();
        this.f12866a.p(u1Var);
    }

    @Override
    public final void p0(boolean z10) {
        V0();
        this.f12866a.p0(z10);
    }

    @Override
    public final long q() {
        V0();
        return this.f12866a.q();
    }

    @Override
    public final void q0(int i10, b2.p0 p0Var) {
        V0();
        this.f12866a.q0(i10, p0Var);
    }

    @Override
    public final void r(int i10, long j10) {
        V0();
        this.f12866a.r(i10, j10);
    }

    @Override
    public final void r0(List list, int i10, int i11) {
        V0();
        this.f12866a.r0(list, i10, i11);
    }

    @Override
    public final b2.b1 s() {
        V0();
        return this.f12866a.s();
    }

    @Override
    public final void s0(b2.p0 p0Var) {
        V0();
        this.f12866a.s0(p0Var);
    }

    @Override
    public final void stop() {
        V0();
        this.f12866a.stop();
    }

    @Override
    public final boolean t() {
        V0();
        return this.f12866a.t();
    }

    @Override
    public final void t0(int i10, int i11) {
        V0();
        this.f12866a.t0(i10, i11);
    }

    @Override
    public final void u() {
        V0();
        this.f12866a.u();
    }

    @Override
    public final void u0(int i10, int i11, int i12) {
        V0();
        this.f12866a.u0(i10, i11, i12);
    }

    @Override
    public final b2.p0 v() {
        V0();
        return this.f12866a.v();
    }

    @Override
    public final boolean v0() {
        V0();
        return this.f12866a.v0();
    }

    @Override
    public final void w(boolean z10) {
        V0();
        this.f12866a.w(z10);
    }

    @Override
    public final int w0() {
        V0();
        return this.f12866a.w0();
    }

    @Override
    public final int x() {
        V0();
        return this.f12866a.x();
    }

    @Override
    public final void x0(List list) {
        V0();
        this.f12866a.x0(list);
    }

    @Override
    public final long y() {
        V0();
        return this.f12866a.y();
    }

    @Override
    public final b2.o1 y0() {
        V0();
        return this.f12866a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.f12866a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.f12866a.z0();
    }
}
