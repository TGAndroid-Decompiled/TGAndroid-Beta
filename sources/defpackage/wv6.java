package defpackage;
public final class wv6 implements kw6 {
    public final byte a;
    public final lw6 b;
    public final long c;

    public wv6(lw6 lw6Var, long j, byte b) {
        this.a = b;
        this.b = lw6Var;
        this.c = j;
    }

    @Override
    public final void a(su6 su6Var) {
        byte b = this.a;
        long j = this.c;
        lw6 lw6Var = this.b;
        switch (b) {
            case 0:
                tv6 tv6Var = lw6Var.j;
                tv6Var.t();
                tv6Var.t.W((int) j);
                return;
            default:
                tv6 tv6Var2 = lw6Var.j;
                tv6Var2.t();
                tv6Var2.t.f(j);
                return;
        }
    }
}
