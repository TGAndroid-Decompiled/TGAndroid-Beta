package l4;

import j3.p1;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class g0 {
    public final int f14319a;
    public final c0 f14320b;
    public final CopyOnWriteArrayList f14321c;
    public final long d;

    public g0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, c0 c0Var, long j10) {
        this.f14321c = copyOnWriteArrayList;
        this.f14319a = i10;
        this.f14320b = c0Var;
        this.d = j10;
    }

    public final long a(long j10) {
        long S = f5.d0.S(j10);
        if (S == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + S;
    }

    public final void b(int i10, j3.t0 t0Var, int i11, Object obj, long j10) {
        c(new x(1, i10, t0Var, i11, obj, a(j10), -9223372036854775807L));
    }

    public final void c(x xVar) {
        Iterator it = this.f14321c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            f5.d0.L(f0Var.f14304a, new l3.m(this, f0Var.f14305b, xVar, 1));
        }
    }

    public final void d(p pVar, int i10, int i11, j3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        e(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    public final void e(p pVar, x xVar) {
        Iterator it = this.f14321c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            f5.d0.L(f0Var.f14304a, new e0(this, f0Var.f14305b, pVar, xVar, 1));
        }
    }

    public final void f(p pVar, int i10, int i11, j3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        g(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    public final void g(p pVar, x xVar) {
        Iterator it = this.f14321c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            f5.d0.L(f0Var.f14304a, new e0(this, f0Var.f14305b, pVar, xVar, 0));
        }
    }

    public final void h(p pVar, int i10, int i11, j3.t0 t0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        j(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)), iOException, z10);
    }

    public final void i(p pVar, int i10, IOException iOException, boolean z10) {
        h(pVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public final void j(p pVar, x xVar, IOException iOException, boolean z10) {
        Iterator it = this.f14321c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            f5.d0.L(f0Var.f14304a, new p1(this, f0Var.f14305b, pVar, xVar, iOException, z10, 1));
        }
    }

    public final void k(p pVar, int i10, int i11, j3.t0 t0Var, int i12, Object obj, long j10, long j11) {
        l(pVar, new x(i10, i11, t0Var, i12, obj, a(j10), a(j11)));
    }

    public final void l(p pVar, x xVar) {
        Iterator it = this.f14321c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            f5.d0.L(f0Var.f14304a, new e0(this, f0Var.f14305b, pVar, xVar, 2));
        }
    }

    public final void m(x xVar) {
        c0 c0Var = this.f14320b;
        c0Var.getClass();
        Iterator it = this.f14321c.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            f5.d0.L(f0Var.f14304a, new androidx.car.app.utils.c(this, f0Var.f14305b, c0Var, xVar, 12));
        }
    }
}
