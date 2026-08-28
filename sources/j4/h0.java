package j4;

import h3.p1;
import ih.h3;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public final class h0 {
    public final int f13464a;
    public final d0 f13465b;
    public final CopyOnWriteArrayList f13466c;
    public final long d;

    public h0(CopyOnWriteArrayList copyOnWriteArrayList, int i9, d0 d0Var, long j10) {
        this.f13466c = copyOnWriteArrayList;
        this.f13464a = i9;
        this.f13465b = d0Var;
        this.d = j10;
    }

    public final long a(long j10) {
        long S = d5.f0.S(j10);
        if (S == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.d + S;
    }

    public final void b(int i9, h3.t0 t0Var, int i10, Object obj, long j10) {
        c(new y(1, i9, t0Var, i10, obj, a(j10), -9223372036854775807L));
    }

    public final void c(y yVar) {
        Iterator it = this.f13466c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d5.f0.L(g0Var.f13452a, new h3(this, g0Var.f13453b, yVar, 9));
        }
    }

    public final void d(q qVar, int i9, int i10, h3.t0 t0Var, int i11, Object obj, long j10, long j11) {
        e(qVar, new y(i9, i10, t0Var, i11, obj, a(j10), a(j11)));
    }

    public final void e(q qVar, y yVar) {
        Iterator it = this.f13466c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d5.f0.L(g0Var.f13452a, new f0(this, g0Var.f13453b, qVar, yVar, 1));
        }
    }

    public final void f(q qVar, int i9, int i10, h3.t0 t0Var, int i11, Object obj, long j10, long j11) {
        g(qVar, new y(i9, i10, t0Var, i11, obj, a(j10), a(j11)));
    }

    public final void g(q qVar, y yVar) {
        Iterator it = this.f13466c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d5.f0.L(g0Var.f13452a, new f0(this, g0Var.f13453b, qVar, yVar, 0));
        }
    }

    public final void h(q qVar, int i9, int i10, h3.t0 t0Var, int i11, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        j(qVar, new y(i9, i10, t0Var, i11, obj, a(j10), a(j11)), iOException, z10);
    }

    public final void i(q qVar, int i9, IOException iOException, boolean z10) {
        h(qVar, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public final void j(q qVar, y yVar, IOException iOException, boolean z10) {
        Iterator it = this.f13466c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d5.f0.L(g0Var.f13452a, new p1(this, g0Var.f13453b, qVar, yVar, iOException, z10, 1));
        }
    }

    public final void k(q qVar, int i9, int i10, h3.t0 t0Var, int i11, Object obj, long j10, long j11) {
        l(qVar, new y(i9, i10, t0Var, i11, obj, a(j10), a(j11)));
    }

    public final void l(q qVar, y yVar) {
        Iterator it = this.f13466c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d5.f0.L(g0Var.f13452a, new f0(this, g0Var.f13453b, qVar, yVar, 2));
        }
    }

    public final void m(y yVar) {
        d0 d0Var = this.f13465b;
        d0Var.getClass();
        Iterator it = this.f13466c.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            d5.f0.L(g0Var.f13452a, new androidx.car.app.utils.c(this, g0Var.f13453b, d0Var, yVar, 14));
        }
    }
}
