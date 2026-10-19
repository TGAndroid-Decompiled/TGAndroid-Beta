package c3;
public final class h0 extends v {
    public final c0 f4623b;
    public final ad.d f4624c;

    public h0(ad.d dVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.f4624c = dVar;
        this.f4623b = c0Var2;
    }

    @Override
    public final b0 f(long j10) {
        b0 f7 = this.f4623b.f(j10);
        d0 d0Var = f7.f4587a;
        long j11 = d0Var.f4604a;
        long j12 = d0Var.f4605b;
        long j13 = this.f4624c.f504b;
        d0 d0Var2 = new d0(j11, j12 + j13);
        d0 d0Var3 = f7.f4588b;
        return new b0(d0Var2, new d0(d0Var3.f4604a, d0Var3.f4605b + j13));
    }
}
