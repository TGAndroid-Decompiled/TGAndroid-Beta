package bi;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
public abstract class b1 implements e2.c1 {
    public Object f3500a;

    public b1(Object obj) {
        this.f3500a = obj;
    }

    @Override
    public long A() {
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return h2.m0.h0(y02.m(i0Var.o0(), (e2.k1) this.f3500a, 0L).f10334m);
    }

    @Override
    public void E() {
        b1(6);
    }

    @Override
    public void G() {
        Y0(((l2.i0) this).o0(), -9223372036854775807L, false);
    }

    @Override
    public void H0() {
        int e10;
        l2.i0 i0Var = (l2.i0) this;
        if (!i0Var.y0().p() && !i0Var.p()) {
            if (S0()) {
                e2.l1 y02 = i0Var.y0();
                if (y02.p()) {
                    e10 = -1;
                } else {
                    int o02 = i0Var.o0();
                    i0Var.F1();
                    int i7 = i0Var.H;
                    if (i7 == 1) {
                        i7 = 0;
                    }
                    i0Var.F1();
                    e10 = y02.e(o02, i7, i0Var.I);
                }
                if (e10 == -1) {
                    U0();
                    return;
                } else if (e10 == i0Var.o0()) {
                    Y0(i0Var.o0(), -9223372036854775807L, true);
                    return;
                } else {
                    Y0(e10, -9223372036854775807L, false);
                    return;
                }
            } else if (P0() && v0()) {
                Y0(i0Var.o0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        U0();
    }

    @Override
    public void I(e2.l0 l0Var) {
        ((l2.i0) this).N0(h9.i0.u(l0Var));
    }

    @Override
    public void J0() {
        l2.i0 i0Var = (l2.i0) this;
        i0Var.F1();
        a1(12, i0Var.m0);
    }

    @Override
    public void L0() {
        l2.i0 i0Var = (l2.i0) this;
        i0Var.F1();
        a1(11, -i0Var.f17872l0);
    }

    @Override
    public boolean P() {
        return true;
    }

    @Override
    public boolean P0() {
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.o0(), (e2.k1) this.f3500a, 0L).a()) {
            return true;
        }
        return false;
    }

    @Override
    public void Q(int i7) {
        ((l2.i0) this).R(i7, i7 + 1);
    }

    public abstract Object Q0(Object obj);

    public Object R0(Object obj) {
        synchronized (((HashMap) this.f3500a)) {
            try {
                if (((HashMap) this.f3500a).containsKey(obj)) {
                    return ((HashMap) this.f3500a).get(obj);
                }
                Object Q0 = Q0(obj);
                ((HashMap) this.f3500a).put(obj, Q0);
                return Q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean S0() {
        int e10;
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int o02 = i0Var.o0();
            i0Var.F1();
            int i7 = i0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            i0Var.F1();
            e10 = y02.e(o02, i7, i0Var.I);
        }
        if (e10 == -1) {
            return false;
        }
        return true;
    }

    public boolean T0() {
        int k10;
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int o02 = i0Var.o0();
            i0Var.F1();
            int i7 = i0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            i0Var.F1();
            k10 = y02.k(o02, i7, i0Var.I);
        }
        if (k10 == -1) {
            return false;
        }
        return true;
    }

    @Override
    public void U() {
        l2.i0 i0Var = (l2.i0) this;
        if (!i0Var.y0().p() && !i0Var.p()) {
            boolean T0 = T0();
            if (P0() && !e0()) {
                if (T0) {
                    b1(7);
                    return;
                } else {
                    U0();
                    return;
                }
            }
            if (T0) {
                long l10 = i0Var.l();
                i0Var.F1();
                if (l10 <= i0Var.f17875n0) {
                    b1(7);
                    return;
                }
            }
            Z0(7, 0L);
            return;
        }
        U0();
    }

    public void U0() {
        ((l2.i0) this).F1();
    }

    public abstract void V0();

    public abstract r0.k1 W0(r0.k1 k1Var, List list);

    public void X0() {
        synchronized (this.f3500a) {
        }
    }

    @Override
    public void Y(int i7) {
        Y0(i7, -9223372036854775807L, false);
    }

    public abstract void Y0(int i7, long j3, boolean z9);

    public void Z0(int i7, long j3) {
        Y0(((l2.i0) this).o0(), j3, false);
    }

    public void a1(int i7, long j3) {
        l2.i0 i0Var = (l2.i0) this;
        long l10 = i0Var.l() + j3;
        long duration = i0Var.getDuration();
        if (duration != -9223372036854775807L) {
            l10 = Math.min(l10, duration);
        }
        Z0(i7, Math.max(l10, 0L));
    }

    @Override
    public void b() {
        ((l2.i0) this).X(false);
    }

    public void b1(int i7) {
        int k10;
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int o02 = i0Var.o0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            k10 = y02.k(o02, i10, i0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == i0Var.o0()) {
            Y0(i0Var.o0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    @Override
    public void c(long j3) {
        Z0(5, j3);
    }

    public void c1() {
        synchronized (this) {
        }
    }

    @Override
    public void d(float f10) {
        l2.i0 i0Var = (l2.i0) this;
        i0Var.e(new e2.w0(f10, i0Var.j().f10639b));
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override
    public boolean e0() {
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.o0(), (e2.k1) this.f3500a, 0L).h) {
            return true;
        }
        return false;
    }

    @Override
    public void f() {
        ((l2.i0) this).X(true);
    }

    @Override
    public void f0(e2.l0 l0Var, long j3) {
        ((l2.i0) this).V(h9.i0.u(l0Var), 0, j3);
    }

    @Override
    public void g0() {
        int e10;
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int o02 = i0Var.o0();
            i0Var.F1();
            int i7 = i0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            i0Var.F1();
            e10 = y02.e(o02, i7, i0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == i0Var.o0()) {
            Y0(i0Var.o0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    @Override
    public boolean h() {
        l2.i0 i0Var = (l2.i0) this;
        if (i0Var.i() == 3 && i0Var.u() && i0Var.w0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void m0(e2.l0 l0Var) {
        ((l2.i0) this).N0(h9.i0.u(l0Var));
    }

    @Override
    public void o(int i7, e2.l0 l0Var) {
        l2.i0 i0Var = (l2.i0) this;
        i0Var.s0(h9.i0.u(l0Var), i7, i7 + 1);
    }

    @Override
    public boolean p0(int i7) {
        l2.i0 i0Var = (l2.i0) this;
        i0Var.F1();
        return i0Var.P.a(i7);
    }

    @Override
    public long q() {
        e2.k1 k1Var = (e2.k1) this.f3500a;
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p() || y02.m(i0Var.o0(), k1Var, 0L).f10328f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (h2.m0.C(k1Var.f10329g) - k1Var.f10328f) - i0Var.a0();
    }

    @Override
    public void s(int i7, long j3) {
        Y0(i7, j3, false);
    }

    @Override
    public void stop() {
        synchronized (this) {
        }
    }

    @Override
    public void t0(int i7, int i10) {
        if (i7 != i10) {
            ((l2.i0) this).u0(i7, i7 + 1, i10);
        }
    }

    @Override
    public void v() {
        ((l2.i0) this).R(0, Integer.MAX_VALUE);
    }

    @Override
    public boolean v0() {
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.o0(), (e2.k1) this.f3500a, 0L).f10330i) {
            return true;
        }
        return false;
    }

    @Override
    public e2.l0 w() {
        l2.i0 i0Var = (l2.i0) this;
        e2.l1 y02 = i0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(i0Var.o0(), (e2.k1) this.f3500a, 0L).f10326c;
    }

    @Override
    public void x0(List list) {
        ((l2.i0) this).b0(Integer.MAX_VALUE, list);
    }

    @Override
    public int y() {
        long j3;
        if (!p0(16)) {
            return 0;
        }
        l2.i0 i0Var = (l2.i0) this;
        long d02 = i0Var.d0();
        long duration = i0Var.getDuration();
        if (d02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = h2.m0.f14112a;
        long d = c8.s0.d(d02, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j3 = d / duration;
        } else {
            j3 = d02 / (duration / 100);
        }
        return h2.m0.i(c8.e1.e(j3), 0, 100);
    }

    public b1(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f3500a = data;
    }

    public b1(int i7) {
        switch (i7) {
            case 4:
                this.f3500a = new HashMap();
                return;
            case 7:
                this.f3500a = new Object();
                return;
            case 9:
                this.f3500a = new LinkedHashMap();
                return;
            default:
                this.f3500a = new e2.k1();
                return;
        }
    }

    public b1(rc.u uVar, String str, sa.d dVar) {
        this.f3500a = uVar;
    }
}
