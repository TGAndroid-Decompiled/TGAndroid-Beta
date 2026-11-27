package defpackage;
public final class f0b extends wo4 {
    public final zy9 b;
    public final zg2 c;

    public f0b(zg2 zg2Var, zy9 zy9Var, zy9 zy9Var2) {
        super(zy9Var);
        this.c = zg2Var;
        this.b = zy9Var2;
    }

    @Override
    public final yy9 e(long j) {
        yy9 e = this.b.e(j);
        bz9 bz9Var = e.a;
        long j2 = bz9Var.a;
        long j3 = bz9Var.b;
        long j4 = this.c.b;
        bz9 bz9Var2 = new bz9(j2, j3 + j4);
        bz9 bz9Var3 = e.b;
        return new yy9(bz9Var2, new bz9(bz9Var3.a, bz9Var3.b + j4));
    }
}
