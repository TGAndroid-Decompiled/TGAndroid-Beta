package c3;
public final class g0 extends v {
    public final b0 f4248b;
    public final ad.d f4249c;

    public g0(ad.d dVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.f4249c = dVar;
        this.f4248b = b0Var2;
    }

    @Override
    public final a0 f(long j10) {
        a0 f7 = this.f4248b.f(j10);
        c0 c0Var = f7.f4194a;
        long j11 = c0Var.f4223a;
        long j12 = c0Var.f4224b;
        long j13 = this.f4249c.f506b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f7.f4195b;
        return new a0(c0Var2, new c0(c0Var3.f4223a, c0Var3.f4224b + j13));
    }
}
