package j4;

import h3.p1;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class g0 {

    public final int f12561a;

    public final c0 f12562b;

    public final CopyOnWriteArrayList f12563c;
    public final long d;

    public g0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, c0 c0Var, long j10) {
        this.f12563c = copyOnWriteArrayList;
        this.f12561a = i10;
        this.f12562b = c0Var;
        this.d = j10;
    }

    public final long a(long j10) {
        long jS = d5.g0.S(j10);
        if (jS == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + jS;
    }

    public final void b(int i10, h3.t0 t0Var, int i11, Object obj, long j10) {
        c(new x(1, i10, t0Var, i11, obj, a(j10), -9223372036854775807L));
    }

    public final void c(x xVar) {
        for (f0 f0Var : this.f12563c) {
            d5.g0.L(f0Var.f12548a, new j3.m(this, f0Var.f12549b, xVar, 1));
        }
    }

    public final void d(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        e(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    public final void e(p pVar, x xVar) {
        for (f0 f0Var : this.f12563c) {
            d5.g0.L(f0Var.f12548a, new e0(this, f0Var.f12549b, pVar, xVar, 1));
        }
    }

    public final void f(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        g(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    public final void g(p pVar, x xVar) {
        for (f0 f0Var : this.f12563c) {
            d5.g0.L(f0Var.f12548a, new e0(this, f0Var.f12549b, pVar, xVar, 0));
        }
    }

    public final void h(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        j(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)), iOException, z10);
    }

    public final void i(p pVar, int i10, IOException iOException, boolean z10) {
        h(pVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public final void j(p pVar, x xVar, IOException iOException, boolean z10) {
        for (f0 f0Var : this.f12563c) {
            d5.g0.L(f0Var.f12548a, new p1(this, f0Var.f12549b, pVar, xVar, iOException, z10, 1));
        }
    }

    public final void k(p pVar, int i10, int i11, h3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        l(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    public final void l(p pVar, x xVar) {
        for (f0 f0Var : this.f12563c) {
            d5.g0.L(f0Var.f12548a, new e0(this, f0Var.f12549b, pVar, xVar, 2));
        }
    }

    public final void m(x xVar) {
        c0 c0Var = this.f12562b;
        c0Var.getClass();
        for (f0 f0Var : this.f12563c) {
            d5.g0.L(f0Var.f12548a, new androidx.car.app.utils.b(this, f0Var.f12549b, c0Var, xVar, 10));
        }
    }
}
