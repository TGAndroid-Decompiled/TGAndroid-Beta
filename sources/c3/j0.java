package c3;
public final class j0 extends x {
    public final e0 f4635b;
    public final ad.d f4636c;

    public j0(ad.d dVar, e0 e0Var, e0 e0Var2) {
        super(e0Var);
        this.f4636c = dVar;
        this.f4635b = e0Var2;
    }

    @Override
    public final d0 f(long j10) {
        d0 f7 = this.f4635b.f(j10);
        f0 f0Var = f7.f4609a;
        long j11 = f0Var.f4621a;
        long j12 = f0Var.f4622b;
        long j13 = this.f4636c.f504b;
        f0 f0Var2 = new f0(j11, j12 + j13);
        f0 f0Var3 = f7.f4610b;
        return new d0(f0Var2, new f0(f0Var3.f4621a, f0Var3.f4622b + j13));
    }
}
