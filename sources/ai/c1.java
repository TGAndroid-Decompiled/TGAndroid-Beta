package ai;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
public abstract class c1 implements b2.f1 {
    public Object f1057a;

    @Override
    public void E() {
        b1(6);
    }

    @Override
    public void G() {
        Y0(((i2.i0) this).n0(), -9223372036854775807L, false);
    }

    @Override
    public void H0() {
        int e;
        i2.i0 i0Var = (i2.i0) this;
        if (!i0Var.y0().p() && !i0Var.n()) {
            if (S0()) {
                b2.o1 y02 = i0Var.y0();
                if (y02.p()) {
                    e = -1;
                } else {
                    int n02 = i0Var.n0();
                    i0Var.F1();
                    int i10 = i0Var.H;
                    if (i10 == 1) {
                        i10 = 0;
                    }
                    i0Var.F1();
                    e = y02.e(n02, i10, i0Var.I);
                }
                if (e == -1) {
                    U0();
                    return;
                } else if (e == i0Var.n0()) {
                    Y0(i0Var.n0(), -9223372036854775807L, true);
                    return;
                } else {
                    Y0(e, -9223372036854775807L, false);
                    return;
                }
            } else if (P0() && v0()) {
                Y0(i0Var.n0(), -9223372036854775807L, false);
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
        a1(11, -i0Var.f12403l0);
    }

    @Override
    public boolean P() {
        return true;
    }

    @Override
    public boolean P0() {
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.n0(), (b2.n1) this.f1057a, 0L).a()) {
            return true;
        }
        return false;
    }

    @Override
    public void Q(int i10) {
        ((i2.i0) this).R(i10, i10 + 1);
    }

    public abstract Object Q0(Object obj);

    public Object R0(Object obj) {
        synchronized (((HashMap) this.f1057a)) {
            try {
                if (((HashMap) this.f1057a).containsKey(obj)) {
                    return ((HashMap) this.f1057a).get(obj);
                }
                Object Q0 = Q0(obj);
                ((HashMap) this.f1057a).put(obj, Q0);
                return Q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean S0() {
        int e;
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int n02 = i0Var.n0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            e = y02.e(n02, i10, i0Var.I);
        }
        if (e == -1) {
            return false;
        }
        return true;
    }

    public boolean T0() {
        int k10;
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int n02 = i0Var.n0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            k10 = y02.k(n02, i10, i0Var.I);
        }
        if (k10 == -1) {
            return false;
        }
        return true;
    }

    public void U0() {
        ((i2.i0) this).F1();
    }

    @Override
    public void V() {
        i2.i0 i0Var = (i2.i0) this;
        if (!i0Var.y0().p() && !i0Var.n()) {
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
                long M0 = i0Var.M0();
                i0Var.F1();
                if (M0 <= i0Var.f12406n0) {
                    b1(7);
                    return;
                }
            }
            Z0(7, 0L);
            return;
        }
        U0();
    }

    public abstract void V0();

    public abstract r0.k1 W0(r0.k1 k1Var, List list);

    public void X0() {
        synchronized (this.f1057a) {
        }
    }

    @Override
    public void Y(int i10) {
        Y0(i10, -9223372036854775807L, false);
    }

    public abstract void Y0(int i10, long j10, boolean z10);

    public void Z0(int i10, long j10) {
        Y0(((i2.i0) this).n0(), j10, false);
    }

    @Override
    public void a(float f7) {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.f(new b2.z0(f7, i0Var.h().f4155b));
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

    public void b1(int i10) {
        int k10;
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int n02 = i0Var.n0();
            i0Var.F1();
            int i11 = i0Var.H;
            if (i11 == 1) {
                i11 = 0;
            }
            i0Var.F1();
            k10 = y02.k(n02, i11, i0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == i0Var.n0()) {
            Y0(i0Var.n0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    public void c1() {
        synchronized (this) {
        }
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override
    public void e() {
        ((i2.i0) this).X(false);
    }

    @Override
    public boolean e0() {
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.n0(), (b2.n1) this.f1057a, 0L).h) {
            return true;
        }
        return false;
    }

    @Override
    public void f0() {
        int e;
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int n02 = i0Var.n0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            e = y02.e(n02, i10, i0Var.I);
        }
        if (e == -1) {
            U0();
        } else if (e == i0Var.n0()) {
            Y0(i0Var.n0(), -9223372036854775807L, true);
        } else {
            Y0(e, -9223372036854775807L, false);
        }
    }

    @Override
    public void g(long j10) {
        Z0(5, j10);
    }

    @Override
    public void i() {
        ((i2.i0) this).X(true);
    }

    @Override
    public boolean j0() {
        i2.i0 i0Var = (i2.i0) this;
        if (i0Var.d() == 3 && i0Var.t() && i0Var.w0() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void k(b2.o0 o0Var, long j10) {
        ((i2.i0) this).S(j10, 0, e9.n0.y(o0Var));
    }

    @Override
    public void l0(b2.o0 o0Var) {
        ((i2.i0) this).L0(e9.n0.y(o0Var));
    }

    @Override
    public long o() {
        b2.n1 n1Var = (b2.n1) this.f1057a;
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p() || y02.m(i0Var.n0(), n1Var, 0L).f3872f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (e2.m0.C(n1Var.f3873g) - n1Var.f3872f) - i0Var.a0();
    }

    @Override
    public boolean o0(int i10) {
        i2.i0 i0Var = (i2.i0) this;
        i0Var.F1();
        return i0Var.P.a(i10);
    }

    @Override
    public void r(int i10, long j10) {
        Y0(i10, j10, false);
    }

    @Override
    public void r0(b2.o0 o0Var) {
        ((i2.i0) this).L0(e9.n0.y(o0Var));
    }

    @Override
    public void s0(int i10, int i11) {
        if (i10 != i11) {
            ((i2.i0) this).t0(i10, i10 + 1, i11);
        }
    }

    @Override
    public void stop() {
        synchronized (this) {
        }
    }

    @Override
    public void u() {
        ((i2.i0) this).R(0, Integer.MAX_VALUE);
    }

    @Override
    public void u0(b2.o0 o0Var, int i10) {
        ((i2.i0) this).O(i10, i10 + 1, e9.n0.y(o0Var));
    }

    @Override
    public b2.o0 v() {
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(i0Var.n0(), (b2.n1) this.f1057a, 0L).f3871c;
    }

    @Override
    public boolean v0() {
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (!y02.p() && y02.m(i0Var.n0(), (b2.n1) this.f1057a, 0L).f3874i) {
            return true;
        }
        return false;
    }

    @Override
    public int x() {
        long j10;
        if (!o0(16)) {
            return 0;
        }
        i2.i0 i0Var = (i2.i0) this;
        long d02 = i0Var.d0();
        long duration = i0Var.getDuration();
        if (d02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = e2.m0.f8254a;
        long d = v7.n7.d(d02, 100L);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            j10 = d / duration;
        } else {
            j10 = d02 / (duration / 100);
        }
        return e2.m0.i(v7.b8.e(j10), 0, 100);
    }

    @Override
    public void x0(List list) {
        ((i2.i0) this).b0(Integer.MAX_VALUE, list);
    }

    @Override
    public long z() {
        i2.i0 i0Var = (i2.i0) this;
        b2.o1 y02 = i0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return e2.m0.h0(y02.m(i0Var.n0(), (b2.n1) this.f1057a, 0L).f3878m);
    }

    public c1(String str, Bundle data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f1057a = data;
    }

    public c1(int i10) {
        switch (i10) {
            case 4:
                this.f1057a = new Object();
                return;
            case 6:
                this.f1057a = new HashMap();
                return;
            case 9:
                this.f1057a = new LinkedHashMap();
                return;
            default:
                this.f1057a = new b2.n1();
                return;
        }
    }

    public c1(tc.u uVar, String str, rb.b bVar) {
        this.f1057a = uVar;
    }
}
