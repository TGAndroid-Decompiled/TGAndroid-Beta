package c3;
public final class h0 extends v {
    public final c0 f4627b;
    public final ad.d f4628c;

    public h0(ad.d dVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.f4628c = dVar;
        this.f4627b = c0Var2;
    }

    @Override
    public final b0 f(long j10) {
        b0 f7 = this.f4627b.f(j10);
        d0 d0Var = f7.f4591a;
        long j11 = d0Var.f4608a;
        long j12 = d0Var.f4609b;
        long j13 = this.f4628c.f505b;
        d0 d0Var2 = new d0(j11, j12 + j13);
        d0 d0Var3 = f7.f4592b;
        return new b0(d0Var2, new d0(d0Var3.f4608a, d0Var3.f4609b + j13));
    }
}
