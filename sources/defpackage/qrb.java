package defpackage;
public final class qrb implements at9 {
    public final at9 a;
    public final long b;

    public qrb(at9 at9Var, long j) {
        this.a = at9Var;
        this.b = j;
    }

    @Override
    public final int a() {
        return this.a.a();
    }

    @Override
    public final void g() {
        this.a.g();
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        int i2 = this.a.i(ym4Var, s93Var, i);
        if (i2 == -4) {
            s93Var.e += this.b;
        }
        return i2;
    }

    @Override
    public final boolean k() {
        return this.a.k();
    }

    @Override
    public final int o(long j) {
        return this.a.o(j - this.b);
    }
}
