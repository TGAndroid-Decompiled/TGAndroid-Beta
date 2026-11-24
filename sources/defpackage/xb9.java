package defpackage;
public final class xb9 implements jm7 {
    public final int a;
    public final ava b;
    public final qb9 c;
    public ub9 d;
    public boolean e;

    public xb9(int i, long j) {
        this.a = i;
        ava avaVar = new ava(i, 0L, false);
        this.b = avaVar;
        avaVar.p = j;
        qb9 qb9Var = new qb9(i, j, new ci7(this, (byte) 28));
        qb9Var.x = true;
        this.c = qb9Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        nm7.f(this.a).b(this, nm7.I3);
        this.b.a();
        this.c.l(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        nm7.f(this.a).n(this, nm7.I3);
        this.b.f();
        this.c.i();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ub9 ub9Var;
        if (i == nm7.I3 && objArr[1] == this.b && (ub9Var = this.d) != null) {
            ub9Var.run();
        }
    }
}
