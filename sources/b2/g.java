package b2;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import v7.p7;
import v7.x7;
public abstract class g implements b1 {
    public Object f2041a;

    @Override
    public long A() {
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p()) {
            return -9223372036854775807L;
        }
        return e2.d0.e0(w02.m(f0Var.l0(), (j1) this.f2041a, 0L).f2116m);
    }

    @Override
    public void E0() {
        int e7;
        i2.f0 f0Var = (i2.f0) this;
        if (!f0Var.w0().p() && !f0Var.o()) {
            if (P0()) {
                k1 w02 = f0Var.w0();
                if (w02.p()) {
                    e7 = -1;
                } else {
                    int l02 = f0Var.l0();
                    f0Var.B1();
                    int i10 = f0Var.F;
                    if (i10 == 1) {
                        i10 = 0;
                    }
                    f0Var.B1();
                    e7 = w02.e(l02, i10, f0Var.G);
                }
                if (e7 == -1) {
                    R0();
                    return;
                } else if (e7 == f0Var.l0()) {
                    V0(f0Var.l0(), -9223372036854775807L, true);
                    return;
                } else {
                    V0(e7, -9223372036854775807L, false);
                    return;
                }
            } else if (M0() && t0()) {
                V0(f0Var.l0(), -9223372036854775807L, false);
                return;
            } else {
                R0();
                return;
            }
        }
        R0();
    }

    @Override
    public void F() {
        Y0(6);
    }

    @Override
    public void F0() {
        i2.f0 f0Var = (i2.f0) this;
        f0Var.B1();
        X0(12, f0Var.f11536w);
    }

    @Override
    public void G0() {
        i2.f0 f0Var = (i2.f0) this;
        f0Var.B1();
        X0(11, -f0Var.v);
    }

    @Override
    public void H() {
        V0(((i2.f0) this).l0(), -9223372036854775807L, false);
    }

    @Override
    public boolean M0() {
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (!w02.p() && w02.m(f0Var.l0(), (j1) this.f2041a, 0L).a()) {
            return true;
        }
        return false;
    }

    public abstract Object N0(Object obj);

    public Object O0(Object obj) {
        synchronized (((HashMap) this.f2041a)) {
            try {
                if (((HashMap) this.f2041a).containsKey(obj)) {
                    return ((HashMap) this.f2041a).get(obj);
                }
                Object N0 = N0(obj);
                ((HashMap) this.f2041a).put(obj, N0);
                return N0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean P0() {
        int e7;
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p()) {
            e7 = -1;
        } else {
            int l02 = f0Var.l0();
            f0Var.B1();
            int i10 = f0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            f0Var.B1();
            e7 = w02.e(l02, i10, f0Var.G);
        }
        if (e7 == -1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean Q() {
        return true;
    }

    public boolean Q0() {
        int k10;
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p()) {
            k10 = -1;
        } else {
            int l02 = f0Var.l0();
            f0Var.B1();
            int i10 = f0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            f0Var.B1();
            k10 = w02.k(l02, i10, f0Var.G);
        }
        if (k10 == -1) {
            return false;
        }
        return true;
    }

    @Override
    public void R(int i10) {
        ((i2.f0) this).S(i10, i10 + 1);
    }

    public void R0() {
        ((i2.f0) this).B1();
    }

    public abstract void S0();

    public abstract r0.l1 T0(r0.l1 l1Var, List list);

    public void U0() {
        synchronized (this.f2041a) {
        }
    }

    @Override
    public void V() {
        i2.f0 f0Var = (i2.f0) this;
        if (!f0Var.w0().p() && !f0Var.o()) {
            boolean Q0 = Q0();
            if (M0() && !d0()) {
                if (Q0) {
                    Y0(7);
                    return;
                } else {
                    R0();
                    return;
                }
            }
            if (Q0) {
                long J0 = f0Var.J0();
                f0Var.B1();
                if (J0 <= f0Var.f11537x) {
                    Y0(7);
                    return;
                }
            }
            W0(7, 0L);
            return;
        }
        R0();
    }

    public abstract void V0(int i10, long j3, boolean z10);

    public void W0(int i10, long j3) {
        V0(((i2.f0) this).l0(), j3, false);
    }

    public void X0(int i10, long j3) {
        i2.f0 f0Var = (i2.f0) this;
        long J0 = f0Var.J0() + j3;
        long duration = f0Var.getDuration();
        if (duration != -9223372036854775807L) {
            J0 = Math.min(J0, duration);
        }
        W0(i10, Math.max(J0, 0L));
    }

    @Override
    public void Y(int i10) {
        V0(i10, -9223372036854775807L, false);
    }

    public void Y0(int i10) {
        int k10;
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p()) {
            k10 = -1;
        } else {
            int l02 = f0Var.l0();
            f0Var.B1();
            int i11 = f0Var.F;
            if (i11 == 1) {
                i11 = 0;
            }
            f0Var.B1();
            k10 = w02.k(l02, i11, f0Var.G);
        }
        if (k10 == -1) {
            R0();
        } else if (k10 == f0Var.l0()) {
            V0(f0Var.l0(), -9223372036854775807L, true);
        } else {
            V0(k10, -9223372036854775807L, false);
        }
    }

    @Override
    public void a(float f7) {
        i2.f0 f0Var = (i2.f0) this;
        f0Var.f(new v0(f7, f0Var.h().f2401b));
    }

    @Override
    public boolean d0() {
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (!w02.p() && w02.m(f0Var.l0(), (j1) this.f2041a, 0L).h) {
            return true;
        }
        return false;
    }

    @Override
    public void e() {
        ((i2.f0) this).X(false);
    }

    @Override
    public void e0() {
        int e7;
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p()) {
            e7 = -1;
        } else {
            int l02 = f0Var.l0();
            f0Var.B1();
            int i10 = f0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            f0Var.B1();
            e7 = w02.e(l02, i10, f0Var.G);
        }
        if (e7 == -1) {
            R0();
        } else if (e7 == f0Var.l0()) {
            V0(f0Var.l0(), -9223372036854775807L, true);
        } else {
            V0(e7, -9223372036854775807L, false);
        }
    }

    @Override
    public void g(long j3) {
        W0(5, j3);
    }

    @Override
    public void i() {
        ((i2.f0) this).X(true);
    }

    @Override
    public boolean i0() {
        i2.f0 f0Var = (i2.f0) this;
        if (f0Var.d() == 3 && f0Var.u() && f0Var.u0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void k(k0 k0Var, long j3) {
        ((i2.f0) this).T(j3, 0, e9.i0.z(k0Var));
    }

    @Override
    public boolean m0(int i10) {
        i2.f0 f0Var = (i2.f0) this;
        f0Var.B1();
        return f0Var.N.a(i10);
    }

    @Override
    public long p() {
        j1 j1Var = (j1) this.f2041a;
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p() || w02.m(f0Var.l0(), j1Var, 0L).f2110f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (e2.d0.A(j1Var.f2111g) - j1Var.f2110f) - f0Var.a0();
    }

    @Override
    public void p0(k0 k0Var) {
        ((i2.f0) this).I0(e9.i0.z(k0Var));
    }

    @Override
    public void q0(int i10, int i11) {
        if (i10 != i11) {
            ((i2.f0) this).r0(i10, i10 + 1, i11);
        }
    }

    @Override
    public void s(int i10, long j3) {
        V0(i10, j3, false);
    }

    @Override
    public void s0(k0 k0Var, int i10) {
        ((i2.f0) this).P(i10, i10 + 1, e9.i0.z(k0Var));
    }

    @Override
    public boolean t0() {
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (!w02.p() && w02.m(f0Var.l0(), (j1) this.f2041a, 0L).f2112i) {
            return true;
        }
        return false;
    }

    @Override
    public void v() {
        ((i2.f0) this).S(0, Integer.MAX_VALUE);
    }

    @Override
    public void v0(List list) {
        ((i2.f0) this).b0(Integer.MAX_VALUE, list);
    }

    @Override
    public k0 w() {
        i2.f0 f0Var = (i2.f0) this;
        k1 w02 = f0Var.w0();
        if (w02.p()) {
            return null;
        }
        return w02.m(f0Var.l0(), (j1) this.f2041a, 0L).f2108c;
    }

    @Override
    public int y() {
        long j3;
        i2.f0 f0Var = (i2.f0) this;
        long c02 = f0Var.c0();
        long duration = f0Var.getDuration();
        if (c02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = e2.d0.f8737a;
        long d = p7.d(c02, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j3 = d / duration;
        } else {
            j3 = c02 / (duration / 100);
        }
        return e2.d0.h(x7.b(j3), 0, 100);
    }

    public g(String str, Bundle data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f2041a = data;
    }

    public g(int i10) {
        switch (i10) {
            case 3:
                this.f2041a = new Object();
                return;
            case 4:
                this.f2041a = new HashMap();
                return;
            case 5:
            case 6:
            default:
                this.f2041a = new j1();
                return;
            case 7:
                this.f2041a = new LinkedHashMap();
                return;
        }
    }
}
