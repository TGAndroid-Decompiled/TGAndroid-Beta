package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
public final class ps8 extends tm4 {
    public final gp9 b;
    public final yn3 c;
    public final AtomicBoolean d;

    public ps8(gp9 gp9Var) {
        super(gp9Var);
        this.b = gp9Var;
        this.c = new yn3();
        this.d = new AtomicBoolean(false);
    }

    @Override
    public final void a(long j, int i, int i2, int i3, vxb vxbVar) {
        h().a(j, i, i2, i3, vxbVar);
    }

    @Override
    public final void b(xu7 xu7Var, int i, int i2) {
        h().b(xu7Var, i, i2);
    }

    @Override
    public final int c(g63 g63Var, int i, boolean z) {
        return h().c(g63Var, i, z);
    }

    @Override
    public final void e(int i, xu7 xu7Var) {
        h().e(i, xu7Var);
    }

    @Override
    public final int f(g63 g63Var, int i, boolean z) {
        return h().f(g63Var, i, z);
    }

    public final wxb h() {
        if (this.d.get()) {
            return this.c;
        }
        return this.b;
    }
}
