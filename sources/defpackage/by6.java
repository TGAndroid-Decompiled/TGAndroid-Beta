package defpackage;
public final class by6 implements py6 {
    public final byte a;
    public final qy6 b;
    public final long c;

    public by6(qy6 qy6Var, long j, byte b) {
        this.a = b;
        this.b = qy6Var;
        this.c = j;
    }

    @Override
    public final void a(xw6 xw6Var) {
        byte b = this.a;
        long j = this.c;
        qy6 qy6Var = this.b;
        switch (b) {
            case 0:
                yx6 yx6Var = qy6Var.j;
                yx6Var.t();
                yx6Var.t.W((int) j);
                return;
            default:
                yx6 yx6Var2 = qy6Var.j;
                yx6Var2.t();
                yx6Var2.t.g(j);
                return;
        }
    }
}
