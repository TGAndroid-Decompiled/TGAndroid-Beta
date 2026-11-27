package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
public final class yv8 extends yo4 {
    public final ys9 b;
    public final po3 c;
    public final AtomicBoolean d;

    public yv8(ys9 ys9Var) {
        super(ys9Var);
        this.b = ys9Var;
        this.c = new po3();
        this.d = new AtomicBoolean(false);
    }

    @Override
    public final void a(long j, int i, int i2, int i3, w1c w1cVar) {
        h().a(j, i, i2, i3, w1cVar);
    }

    @Override
    public final void b(ey7 ey7Var, int i, int i2) {
        h().b(ey7Var, i, i2);
    }

    @Override
    public final int c(z63 z63Var, int i, boolean z) {
        return h().c(z63Var, i, z);
    }

    @Override
    public final void e(int i, ey7 ey7Var) {
        h().e(i, ey7Var);
    }

    @Override
    public final int f(z63 z63Var, int i, boolean z) {
        return h().f(z63Var, i, z);
    }

    public final x1c h() {
        if (this.d.get()) {
            return this.c;
        }
        return this.b;
    }
}
