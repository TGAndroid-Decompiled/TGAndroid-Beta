package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import java.util.IdentityHashMap;
import java.util.List;
public final class ad8 implements oc8 {
    public final oc8 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public ad8(oc8 oc8Var) {
        this.a = oc8Var;
    }

    @Override
    public final int A() {
        V0();
        return this.a.A();
    }

    @Override
    public final void A0(int i, br6 br6Var) {
        V0();
        this.a.A0(i, br6Var);
    }

    @Override
    public final icc B() {
        V0();
        return this.a.B();
    }

    @Override
    public final Looper B0() {
        return this.a.B0();
    }

    @Override
    public final void C() {
        V0();
        this.a.C();
    }

    @Override
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override
    public final float D() {
        V0();
        return this.a.D();
    }

    @Override
    public final void D0(br6 br6Var) {
        V0();
        this.a.D0(br6Var);
    }

    @Override
    public final void E() {
        V0();
        this.a.E();
    }

    @Override
    public final void E0() {
        V0();
        this.a.E0();
    }

    @Override
    public final nz F() {
        V0();
        return this.a.F();
    }

    @Override
    public final boolean F0() {
        V0();
        return this.a.F0();
    }

    @Override
    public final void G(int i, boolean z) {
        V0();
        this.a.G(i, z);
    }

    @Override
    public final byb G0() {
        V0();
        return this.a.G0();
    }

    @Override
    public final de3 H() {
        V0();
        return this.a.H();
    }

    @Override
    public final long H0() {
        V0();
        return this.a.H0();
    }

    @Override
    public final void I() {
        V0();
        this.a.I();
    }

    @Override
    public final void I0(int i) {
        V0();
        this.a.I0(i);
    }

    @Override
    public final void J(int i, int i2) {
        V0();
        this.a.J(i, i2);
    }

    @Override
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override
    public final void K(int i) {
        V0();
        this.a.K(i);
    }

    @Override
    public final void K0() {
        V0();
        this.a.K0();
    }

    @Override
    public final int L() {
        V0();
        return this.a.L();
    }

    @Override
    public final void L0() {
        V0();
        this.a.L0();
    }

    @Override
    public final void M(byb bybVar) {
        V0();
        this.a.M(bybVar);
    }

    @Override
    public final jr6 M0() {
        V0();
        return this.a.M0();
    }

    @Override
    public final boolean N() {
        return this.a.N();
    }

    @Override
    public final void N0(List list) {
        V0();
        this.a.N0(list);
    }

    @Override
    public final void O(int i) {
        V0();
        this.a.O(i);
    }

    @Override
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override
    public final void P(int i, int i2) {
        V0();
        this.a.P(i, i2);
    }

    @Override
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override
    public final void Q(SurfaceHolder surfaceHolder) {
        V0();
        this.a.Q(surfaceHolder);
    }

    public final nc8 Q0() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        br6 br6Var;
        long j;
        long j2;
        int i3;
        int i4;
        boolean z3;
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        boolean z4 = false;
        if (m02) {
            i = l0();
        } else {
            i = 0;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        if (m02) {
            i2 = A();
        } else {
            i2 = 0;
        }
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        gre.p(z2);
        if (m02) {
            aob y0 = y0();
            if (!y0.p()) {
                if (i < y0.o()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                gre.p(z3);
                znb m = y0.m(i, new znb(), 0L);
                if (i2 == g8c.i(i2, m.m, m.n)) {
                    z4 = true;
                }
                gre.p(z4);
            }
        }
        if (m0) {
            br6Var = u();
        } else {
            br6Var = null;
        }
        br6 br6Var2 = br6Var;
        if (m0) {
            long m2 = m();
            long Y = Y();
            int k0 = k0();
            i4 = L();
            j = m2;
            j2 = Y;
            i3 = k0;
        } else {
            j = 0;
            j2 = 0;
            i3 = -1;
            i4 = -1;
        }
        return new nc8(null, i, br6Var2, null, i2, j, j2, i3, i4);
    }

    @Override
    public final void R(float f) {
        V0();
        this.a.R(f);
    }

    public final l6a R0() {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        boolean z2;
        long j5;
        long j6;
        long j7;
        boolean m0 = m0(16);
        nc8 Q0 = Q0();
        if (m0 && l()) {
            z = true;
        } else {
            z = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m0) {
            long duration = getDuration();
            long b0 = b0();
            int w = w();
            j3 = o();
            j = n();
            j2 = z();
            j4 = H0();
            i = w;
            z2 = z;
            j5 = elapsedRealtime;
            j6 = duration;
            j7 = b0;
        } else {
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = 0;
            j4 = 0;
            i = 0;
            z2 = z;
            j5 = elapsedRealtime;
            j6 = -9223372036854775807L;
            j7 = 0;
        }
        return new l6a(Q0, z2, j5, j6, j7, i, j3, j, j2, j4);
    }

    @Override
    public final void S() {
        V0();
        this.a.S();
    }

    public final br6 S0() {
        if (m0(16)) {
            return u();
        }
        return null;
    }

    @Override
    public final void T(List list, int i, long j) {
        V0();
        this.a.T(list, i, j);
    }

    public final aob T0() {
        if (m0(17)) {
            return y0();
        }
        if (S0() != null) {
            return new zc8(this);
        }
        return aob.a;
    }

    @Override
    public final j54 U() {
        V0();
        return this.a.U();
    }

    public final jr6 U0() {
        if (m0(18)) {
            return M0();
        }
        return jr6.M;
    }

    @Override
    public final void V(boolean z) {
        V0();
        this.a.V(z);
    }

    public final void V0() {
        boolean z;
        if (Looper.myLooper() == this.a.B0()) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
    }

    @Override
    public final void W(int i) {
        V0();
        this.a.W(i);
    }

    @Override
    public final long X() {
        V0();
        return this.a.X();
    }

    @Override
    public final long Y() {
        V0();
        return this.a.Y();
    }

    @Override
    public final void Z(int i, List list) {
        V0();
        this.a.Z(i, list);
    }

    @Override
    public final void a() {
        V0();
        this.a.a();
    }

    @Override
    public final void a0() {
        V0();
        this.a.a0();
    }

    @Override
    public final void b(zb8 zb8Var) {
        V0();
        this.a.b(zb8Var);
    }

    @Override
    public final long b0() {
        V0();
        return this.a.b0();
    }

    @Override
    public final void c(float f) {
        V0();
        this.a.c(f);
    }

    @Override
    public final boolean c0() {
        V0();
        return this.a.c0();
    }

    @Override
    public final boolean d() {
        V0();
        return this.a.d();
    }

    @Override
    public final void d0() {
        V0();
        this.a.d0();
    }

    @Override
    public final void e() {
        V0();
        this.a.e();
    }

    @Override
    public final void e0(int i) {
        V0();
        this.a.e0(i);
    }

    @Override
    public final void f(long j) {
        V0();
        this.a.f(j);
    }

    @Override
    public final eyb f0() {
        V0();
        return this.a.f0();
    }

    @Override
    public final zb8 g() {
        V0();
        return this.a.g();
    }

    @Override
    public final jr6 g0() {
        V0();
        return this.a.g0();
    }

    @Override
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override
    public final int h() {
        V0();
        return this.a.h();
    }

    @Override
    public final v33 h0() {
        V0();
        return this.a.h0();
    }

    @Override
    public final int i() {
        V0();
        return this.a.i();
    }

    @Override
    public final void i0(nz nzVar, boolean z) {
        this.a.i0(nzVar, z);
    }

    @Override
    public final boolean j() {
        V0();
        return this.a.j();
    }

    @Override
    public final void j0(jr6 jr6Var) {
        V0();
        this.a.j0(jr6Var);
    }

    @Override
    public final void k() {
        V0();
        this.a.k();
    }

    @Override
    public final int k0() {
        V0();
        return this.a.k0();
    }

    @Override
    public final boolean l() {
        V0();
        return this.a.l();
    }

    @Override
    public final int l0() {
        V0();
        return this.a.l0();
    }

    @Override
    public final long m() {
        V0();
        return this.a.m();
    }

    @Override
    public final boolean m0(int i) {
        V0();
        return this.a.m0(i);
    }

    @Override
    public final long n() {
        V0();
        return this.a.n();
    }

    @Override
    public final void n0(int i) {
        V0();
        this.a.n0(i);
    }

    @Override
    public final long o() {
        V0();
        return this.a.o();
    }

    @Override
    public final void o0(boolean z) {
        V0();
        this.a.o0(z);
    }

    @Override
    public final void p(int i, long j) {
        V0();
        this.a.p(i, j);
    }

    @Override
    public final void p0(mc8 mc8Var) {
        V0();
        synchronized (this.b) {
            mc8 mc8Var2 = (mc8) this.b.remove(mc8Var);
            oc8 oc8Var = this.a;
            if (mc8Var2 != null) {
                mc8Var = mc8Var2;
            }
            oc8Var.p0(mc8Var);
        }
    }

    @Override
    public final kc8 q() {
        V0();
        return this.a.q();
    }

    @Override
    public final void q0(br6 br6Var) {
        V0();
        this.a.q0(br6Var);
    }

    @Override
    public final void r(br6 br6Var, long j) {
        V0();
        this.a.r(br6Var, j);
    }

    @Override
    public final void r0(List list, int i, int i2) {
        V0();
        this.a.r0(list, i, i2);
    }

    @Override
    public final boolean s() {
        V0();
        return this.a.s();
    }

    @Override
    public final void s0(int i, int i2) {
        V0();
        this.a.s0(i, i2);
    }

    @Override
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override
    public final void t() {
        V0();
        this.a.t();
    }

    @Override
    public final void t0(int i, int i2, int i3) {
        V0();
        this.a.t0(i, i2, i3);
    }

    @Override
    public final br6 u() {
        V0();
        return this.a.u();
    }

    @Override
    public final boolean u0() {
        V0();
        return this.a.u0();
    }

    @Override
    public final void v(boolean z) {
        V0();
        this.a.v(z);
    }

    @Override
    public final int v0() {
        V0();
        return this.a.v0();
    }

    @Override
    public final int w() {
        V0();
        return this.a.w();
    }

    @Override
    public final void w0(List list) {
        V0();
        this.a.w0(list);
    }

    @Override
    public final long x() {
        V0();
        return this.a.x();
    }

    @Override
    public final int x0() {
        V0();
        return this.a.x0();
    }

    @Override
    public final void y(mc8 mc8Var) {
        V0();
        synchronized (this.b) {
            qm4 qm4Var = (qm4) this.b.get(mc8Var);
            if (qm4Var == null) {
                qm4Var = new qm4(this, mc8Var);
            }
            this.a.y(qm4Var);
            this.b.put(mc8Var, qm4Var);
        }
    }

    @Override
    public final aob y0() {
        V0();
        return this.a.y0();
    }

    @Override
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
