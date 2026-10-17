package c3;
public final class h0 extends v {
    public final c0 f4626b;
    public final ad.d f4627c;

    public h0(ad.d dVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.f4627c = dVar;
        this.f4626b = c0Var2;
    }

    @Override
    public final b0 f(long j10) {
        b0 f7 = this.f4626b.f(j10);
        d0 d0Var = f7.f4590a;
        long j11 = d0Var.f4607a;
        long j12 = d0Var.f4608b;
        long j13 = this.f4627c.f505b;
        d0 d0Var2 = new d0(j11, j12 + j13);
        d0 d0Var3 = f7.f4591b;
        return new b0(d0Var2, new d0(d0Var3.f4607a, d0Var3.f4608b + j13));
    }
}
