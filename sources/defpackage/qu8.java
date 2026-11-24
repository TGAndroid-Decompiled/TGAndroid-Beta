package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
public final class qu8 extends uo4 {
    public final hr9 b;
    public final ip3 c;
    public final AtomicBoolean d;

    public qu8(hr9 hr9Var) {
        super(hr9Var);
        this.b = hr9Var;
        this.c = new ip3();
        this.d = new AtomicBoolean(false);
    }

    @Override
    public final void a(long j, int i, int i2, int i3, xzb xzbVar) {
        h().a(j, i, i2, i3, xzbVar);
    }

    @Override
    public final void b(yw7 yw7Var, int i, int i2) {
        h().b(yw7Var, i, i2);
    }

    @Override
    public final int c(s73 s73Var, int i, boolean z) {
        return h().c(s73Var, i, z);
    }

    @Override
    public final void e(int i, yw7 yw7Var) {
        h().e(i, yw7Var);
    }

    @Override
    public final int f(s73 s73Var, int i, boolean z) {
        return h().f(s73Var, i, z);
    }

    public final yzb h() {
        if (this.d.get()) {
            return this.c;
        }
        return this.b;
    }
}
