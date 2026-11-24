package defpackage;
public final class wx6 implements ky6 {
    public final byte a;
    public final ly6 b;
    public final long c;

    public wx6(ly6 ly6Var, long j, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = j;
    }

    @Override
    public final void a(sw6 sw6Var) {
        byte b = this.a;
        long j = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                tx6 tx6Var = ly6Var.j;
                tx6Var.t();
                tx6Var.t.W((int) j);
                return;
            default:
                tx6 tx6Var2 = ly6Var.j;
                tx6Var2.t();
                tx6Var2.t.e(j);
                return;
        }
    }
}
