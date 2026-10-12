package c3;
public final class g0 extends v {
    public final b0 f4244b;
    public final ad.d f4245c;

    public g0(ad.d dVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f4245c = dVar;
        this.f4244b = b0Var2;
    }

    @Override
    public final a0 f(long j10) {
        a0 f7 = this.f4244b.f(j10);
        c0 c0Var = f7.f4190a;
        long j11 = c0Var.f4219a;
        long j12 = c0Var.f4220b;
        long j13 = this.f4245c.f502b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f7.f4191b;
        return new a0(c0Var2, new c0(c0Var3.f4219a, c0Var3.f4220b + j13));
    }
}
