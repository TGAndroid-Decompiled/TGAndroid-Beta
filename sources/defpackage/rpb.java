package defpackage;
public final class rpb implements jr9 {
    public final jr9 a;
    public final long b;

    public rpb(jr9 jr9Var, long j) {
        this.a = jr9Var;
        this.b = j;
    }

    @Override
    public final int a() {
        return this.a.a();
    }

    @Override
    public final void d() {
        this.a.d();
    }

    @Override
    public final boolean i() {
        return this.a.i();
    }

    @Override
    public final int m(long j) {
        return this.a.m(j - this.b);
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        int p = this.a.p(mj4Var, la3Var, i);
        if (p == -4) {
            la3Var.e += this.b;
        }
        return p;
    }
}
