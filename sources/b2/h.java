package b2;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import v7.c8;
import v7.o7;
public abstract class h implements f1 {
    public Object f2047a;

    @Override
    public void E() {
        b1(6);
    }

    @Override
    public void G() {
        Y0(((i2.i0) this).m0(), -9223372036854775807L, false);
    }

    @Override
    public void H0() {
        int e;
        i2.i0 i0Var = (i2.i0) this;
        if (!i0Var.y0().p() && !i0Var.n()) {
            if (S0()) {
                o1 y02 = i0Var.y0();
                if (y02.p()) {
                    e = -1;
                } else {
                    int m0 = i0Var.m0();
                    i0Var.F1();
                    int i10 = i0Var.H;
                    if (i10 == 1) {
                        i10 = 0;
                    }
                    i0Var.F1();
                    e = y02.e(m0, i10, i0Var.I);
                }
                if (e == -1) {
                    U0();
                    return;
                } else if (e == i0Var.m0()) {
                    Y0(i0Var.m0(), -9223372036854775807L, true);
                    return;
                } else {
                    Y0(e, -9223372036854775807L, false);
                    return;
                }
            } else if (P0() && v0()) {
                Y0(i0Var.m0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        U0();
    }

    @Override
    public void I0() {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.F1();
        a1(12, i0Var.m0);
    }

    @Override
    public void J0() {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.F1();
        a1(11, -i0Var.f7915l0);
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(int i10) {
        ((i2.i0) this).Q(i10, i10 + 1);
    }

    @Override
    public boolean P0() {
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.m0(), (n1) this.f2047a, 0L).a()) {
            return true;
        }
        return false;
    }

    public abstract Object Q0(Object obj);

    public Object R0(Object obj) {
        synchronized (((HashMap) this.f2047a)) {
            try {
                if (((HashMap) this.f2047a).containsKey(obj)) {
                    return ((HashMap) this.f2047a).get(obj);
                }
                Object Q0 = Q0(obj);
                ((HashMap) this.f2047a).put(obj, Q0);
                return Q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean S0() {
        int e;
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int m0 = i0Var.m0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            e = y02.e(m0, i10, i0Var.I);
        }
        if (e == -1) {
            return false;
        }
        return true;
    }

    @Override
    public void T() {
        i2.i0 i0Var = (i2.i0) this;
        if (!i0Var.y0().p() && !i0Var.n()) {
            boolean T0 = T0();
            if (P0() && !d0()) {
                if (T0) {
                    b1(7);
                    return;
                } else {
                    U0();
                    return;
                }
            }
            if (T0) {
                long M0 = i0Var.M0();
                i0Var.F1();
                if (M0 <= i0Var.f7918n0) {
                    b1(7);
                    return;
                }
            }
            Z0(7, 0L);
            return;
        }
        U0();
    }

    public boolean T0() {
        int k10;
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int m0 = i0Var.m0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            k10 = y02.k(m0, i10, i0Var.I);
        }
        if (k10 == -1) {
            return false;
        }
        return true;
    }

    public void U0() {
        ((i2.i0) this).F1();
    }

    public abstract void V0();

    public abstract r0.j1 W0(r0.j1 j1Var, List list);

    @Override
    public void X(int i10) {
        Y0(i10, -9223372036854775807L, false);
    }

    public void X0() {
        synchronized (this.f2047a) {
        }
    }

    public abstract void Y0(int i10, long j10, boolean z10);

    public void Z0(int i10, long j10) {
        Y0(((i2.i0) this).m0(), j10, false);
    }

    public void a1(int i10, long j10) {
        i2.i0 i0Var = (i2.i0) this;
        long M0 = i0Var.M0() + j10;
        long duration = i0Var.getDuration();
        if (duration != -9223372036854775807L) {
            M0 = Math.min(M0, duration);
        }
        Z0(i10, Math.max(M0, 0L));
    }

    @Override
    public void b(float f7) {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.c(new z0(f7, i0Var.g().f2444b));
    }

    public void b1(int i10) {
        int k10;
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int m0 = i0Var.m0();
            i0Var.F1();
            int i11 = i0Var.H;
            if (i11 == 1) {
                i11 = 0;
            }
            i0Var.F1();
            k10 = y02.k(m0, i11, i0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == i0Var.m0()) {
            Y0(i0Var.m0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    public void c1() {
        synchronized (this) {
        }
    }

    @Override
    public boolean d0() {
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.m0(), (n1) this.f2047a, 0L).h) {
            return true;
        }
        return false;
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override
    public void e() {
        ((i2.i0) this).W(false);
    }

    @Override
    public void e0() {
        int e;
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int m0 = i0Var.m0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            e = y02.e(m0, i10, i0Var.I);
        }
        if (e == -1) {
            U0();
        } else if (e == i0Var.m0()) {
            Y0(i0Var.m0(), -9223372036854775807L, true);
        } else {
            Y0(e, -9223372036854775807L, false);
        }
    }

    @Override
    public void f(long j10) {
        Z0(5, j10);
    }

    @Override
    public void i(p0 p0Var, long j10) {
        ((i2.i0) this).U(e9.n0.y(p0Var), 0, j10);
    }

    @Override
    public boolean i0() {
        i2.i0 i0Var = (i2.i0) this;
        if (i0Var.h() == 3 && i0Var.t() && i0Var.w0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void j() {
        ((i2.i0) this).W(true);
    }

    @Override
    public void k0(p0 p0Var) {
        ((i2.i0) this).L0(e9.n0.y(p0Var));
    }

    @Override
    public boolean n0(int i10) {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.F1();
        return i0Var.P.a(i10);
    }

    @Override
    public long o() {
        n1 n1Var = (n1) this.f2047a;
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p() || y02.m(i0Var.m0(), n1Var, 0L).f2140f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (e2.l0.C(n1Var.f2141g) - n1Var.f2140f) - i0Var.Z();
    }

    @Override
    public void q0(int i10, p0 p0Var) {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.r0(e9.n0.y(p0Var), i10, i10 + 1);
    }

    @Override
    public void r(int i10, long j10) {
        Y0(i10, j10, false);
    }

    @Override
    public void s0(p0 p0Var) {
        ((i2.i0) this).L0(e9.n0.y(p0Var));
    }

    @Override
    public void stop() {
        synchronized (this) {
        }
    }

    @Override
    public void t0(int i10, int i11) {
        if (i10 != i11) {
            ((i2.i0) this).u0(i10, i10 + 1, i11);
        }
    }

    @Override
    public void u() {
        ((i2.i0) this).Q(0, Integer.MAX_VALUE);
    }

    @Override
    public p0 v() {
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(i0Var.m0(), (n1) this.f2047a, 0L).f2139c;
    }

    @Override
    public boolean v0() {
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.m0(), (n1) this.f2047a, 0L).f2142i) {
            return true;
        }
        return false;
    }

    @Override
    public int x() {
        long j10;
        if (!n0(16)) {
            return 0;
        }
        i2.i0 i0Var = (i2.i0) this;
        long c02 = i0Var.c0();
        long duration = i0Var.getDuration();
        if (c02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = e2.l0.f6165a;
        long d = o7.d(c02, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j10 = d / duration;
        } else {
            j10 = c02 / (duration / 100);
        }
        return e2.l0.i(c8.e(j10), 0, 100);
    }

    @Override
    public void x0(List list) {
        ((i2.i0) this).a0(Integer.MAX_VALUE, list);
    }

    @Override
    public long z() {
        i2.i0 i0Var = (i2.i0) this;
        o1 y02 = i0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return e2.l0.h0(y02.m(i0Var.m0(), (n1) this.f2047a, 0L).f2146m);
    }

    public h(String str, Bundle data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f2047a = data;
    }

    public h(int i10) {
        switch (i10) {
            case 3:
                this.f2047a = new HashMap();
                return;
            case 5:
                this.f2047a = new Object();
                return;
            case 9:
                this.f2047a = new LinkedHashMap();
                return;
            default:
                this.f2047a = new n1();
                return;
        }
    }

    public h(lc.v vVar, String str, t7.u uVar) {
        this.f2047a = vVar;
    }
}
