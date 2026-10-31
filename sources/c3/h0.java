package c3;
public final class h0 extends v {
    public final b0 f3655b;
    public final g0 f3656c;

    public h0(g0 g0Var, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f3656c = g0Var;
        this.f3655b = b0Var2;
    }

    @Override
    public final a0 f(long j10) {
        a0 f7 = this.f3655b.f(j10);
        c0 c0Var = f7.f3595a;
        long j11 = c0Var.f3624a;
        long j12 = c0Var.f3625b;
        long j13 = this.f3656c.f3650b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f7.f3596b;
        return new a0(c0Var2, new c0(c0Var3.f3624a, c0Var3.f3625b + j13));
    }
}
