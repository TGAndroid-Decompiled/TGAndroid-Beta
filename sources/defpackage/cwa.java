package defpackage;
public final class cwa extends rm4 {
    public final fv9 b;
    public final hg2 c;

    public cwa(hg2 hg2Var, fv9 fv9Var, fv9 fv9Var2) {
        super(fv9Var);
        this.c = hg2Var;
        this.b = fv9Var2;
    }

    @Override
    public final ev9 f(long j) {
        ev9 f = this.b.f(j);
        hv9 hv9Var = f.a;
        long j2 = hv9Var.a;
        long j3 = hv9Var.b;
        long j4 = this.c.b;
        hv9 hv9Var2 = new hv9(j2, j3 + j4);
        hv9 hv9Var3 = f.b;
        return new ev9(hv9Var2, new hv9(hv9Var3.a, hv9Var3.b + j4));
    }
}
