package ci;

import android.os.Bundle;
import b8.od;
import b8.xc;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
public abstract class u0 implements d2.e1 {
    public Object f6076a;

    @Override
    public long A() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return g2.n0.h0(y02.m(i0Var.l0(), (d2.m1) this.f6076a, 0L).f8218m);
    }

    @Override
    public void D() {
        b1(6);
    }

    @Override
    public void F() {
        Y0(((k2.i0) this).l0(), -9223372036854775807L, false);
    }

    @Override
    public void I0() {
        int e10;
        k2.i0 i0Var = (k2.i0) this;
        if (!i0Var.y0().p() && !i0Var.n()) {
            if (S0()) {
                d2.n1 y02 = i0Var.y0();
                if (y02.p()) {
                    e10 = -1;
                } else {
                    int l02 = i0Var.l0();
                    i0Var.F1();
                    int i3 = i0Var.H;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    i0Var.F1();
                    e10 = y02.e(l02, i3, i0Var.I);
                }
                if (e10 == -1) {
                    U0();
                    return;
                } else if (e10 == i0Var.l0()) {
                    Y0(i0Var.l0(), -9223372036854775807L, true);
                    return;
                } else {
                    Y0(e10, -9223372036854775807L, false);
                    return;
                }
            } else if (P0() && s0()) {
                Y0(i0Var.l0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        U0();
    }

    @Override
    public void J0() {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.F1();
        a1(12, i0Var.m0);
    }

    @Override
    public void K0() {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.F1();
        a1(11, -i0Var.f16560l0);
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public void O(int i3) {
        ((k2.i0) this).P(i3, i3 + 1);
    }

    @Override
    public boolean P0() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.l0(), (d2.m1) this.f6076a, 0L).a()) {
            return true;
        }
        return false;
    }

    public abstract Object Q0(Object obj);

    public Object R0(Object obj) {
        synchronized (((HashMap) this.f6076a)) {
            try {
                if (((HashMap) this.f6076a).containsKey(obj)) {
                    return ((HashMap) this.f6076a).get(obj);
                }
                Object Q0 = Q0(obj);
                ((HashMap) this.f6076a).put(obj, Q0);
                return Q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void S() {
        k2.i0 i0Var = (k2.i0) this;
        if (!i0Var.y0().p() && !i0Var.n()) {
            boolean T0 = T0();
            if (P0() && !c0()) {
                if (T0) {
                    b1(7);
                    return;
                } else {
                    U0();
                    return;
                }
            }
            if (T0) {
                long N0 = i0Var.N0();
                i0Var.F1();
                if (N0 <= i0Var.f16563n0) {
                    b1(7);
                    return;
                }
            }
            Z0(7, 0L);
            return;
        }
        U0();
    }

    public boolean S0() {
        int e10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            e10 = y02.e(l02, i3, i0Var.I);
        }
        if (e10 == -1) {
            return false;
        }
        return true;
    }

    public boolean T0() {
        int k10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            k10 = y02.k(l02, i3, i0Var.I);
        }
        if (k10 == -1) {
            return false;
        }
        return true;
    }

    public void U0() {
        ((k2.i0) this).F1();
    }

    public abstract void V0();

    @Override
    public void W(int i3) {
        Y0(i3, -9223372036854775807L, false);
    }

    public abstract r0.k1 W0(r0.k1 k1Var, List list);

    public void X0() {
        synchronized (this.f6076a) {
        }
    }

    public abstract void Y0(int i3, long j10, boolean z10);

    public void Z0(int i3, long j10) {
        Y0(((k2.i0) this).l0(), j10, false);
    }

    public void a1(int i3, long j10) {
        k2.i0 i0Var = (k2.i0) this;
        long N0 = i0Var.N0() + j10;
        long duration = i0Var.getDuration();
        if (duration != -9223372036854775807L) {
            N0 = Math.min(N0, duration);
        }
        Z0(i3, Math.max(N0, 0L));
    }

    @Override
    public void b(float f10) {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.c(new d2.y0(f10, i0Var.g().f8518b));
    }

    public void b1(int i3) {
        int k10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            k10 = y02.k(l02, i10, i0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == i0Var.l0()) {
            Y0(i0Var.l0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    @Override
    public boolean c0() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.l0(), (d2.m1) this.f6076a, 0L).h) {
            return true;
        }
        return false;
    }

    public void c1() {
        synchronized (this) {
        }
    }

    @Override
    public void d0() {
        int e10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            e10 = y02.e(l02, i3, i0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == i0Var.l0()) {
            Y0(i0Var.l0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override
    public void e() {
        ((k2.i0) this).V(false);
    }

    @Override
    public void f(long j10) {
        Z0(5, j10);
    }

    @Override
    public boolean i0() {
        k2.i0 i0Var = (k2.i0) this;
        if (i0Var.h() == 3 && i0Var.u() && i0Var.t0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void j() {
        ((k2.i0) this).V(true);
    }

    @Override
    public boolean m0(int i3) {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.F1();
        return i0Var.P.a(i3);
    }

    @Override
    public void n0(int i3, d2.n0 n0Var) {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.p0(g9.i0.u(n0Var), i3, i3 + 1);
    }

    @Override
    public void o(d2.n0 n0Var, long j10) {
        ((k2.i0) this).T(g9.i0.u(n0Var), 0, j10);
    }

    @Override
    public long p() {
        d2.m1 m1Var = (d2.m1) this.f6076a;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p() || y02.m(i0Var.l0(), m1Var, 0L).f8212f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (g2.n0.C(m1Var.f8213g) - m1Var.f8212f) - i0Var.Y();
    }

    @Override
    public void q0(int i3, int i10) {
        if (i3 != i10) {
            ((k2.i0) this).r0(i3, i3 + 1, i10);
        }
    }

    @Override
    public void r(int i3, long j10) {
        Y0(i3, j10, false);
    }

    @Override
    public boolean s0() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.l0(), (d2.m1) this.f6076a, 0L).f8214i) {
            return true;
        }
        return false;
    }

    @Override
    public void stop() {
        synchronized (this) {
        }
    }

    @Override
    public void v() {
        ((k2.i0) this).P(0, Integer.MAX_VALUE);
    }

    @Override
    public void v0(d2.n0 n0Var) {
        ((k2.i0) this).M0(g9.i0.u(n0Var));
    }

    @Override
    public d2.n0 w() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(i0Var.l0(), (d2.m1) this.f6076a, 0L).f8210c;
    }

    @Override
    public void w0(List list) {
        ((k2.i0) this).Z(Integer.MAX_VALUE, list);
    }

    @Override
    public void x0(d2.n0 n0Var) {
        ((k2.i0) this).M0(g9.i0.u(n0Var));
    }

    @Override
    public int y() {
        long j10;
        if (!m0(16)) {
            return 0;
        }
        k2.i0 i0Var = (k2.i0) this;
        long b02 = i0Var.b0();
        long duration = i0Var.getDuration();
        if (b02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = g2.n0.f11873a;
        long d = xc.d(b02, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j10 = d / duration;
        } else {
            j10 = b02 / (duration / 100);
        }
        return g2.n0.i(od.e(j10), 0, 100);
    }

    public u0(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f6076a = data;
    }

    public u0(int i3) {
        switch (i3) {
            case 4:
                this.f6076a = new HashMap();
                return;
            case 7:
                this.f6076a = new Object();
                return;
            case 9:
                this.f6076a = new LinkedHashMap();
                return;
            default:
                this.f6076a = new d2.m1();
                return;
        }
    }

    public u0(oc.u uVar, String str, mb.b bVar) {
        this.f6076a = uVar;
    }
}
