package defpackage;
public final class f40 implements x56, us2 {
    public final long a;

    public f40(long j) {
        this.a = j;
    }

    @Override
    public final void accept(Object obj) {
        ((ad8) obj).f(this.a);
    }

    @Override
    public final void invoke(Object obj) {
        u30 u30Var;
        o93 o93Var = (o93) obj;
        q93 q93Var = o93Var.a;
        if (o93Var == q93Var.j && (u30Var = q93Var.n) != null) {
            u30Var.o(this.a);
        }
    }
}
