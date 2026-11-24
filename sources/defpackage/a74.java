package defpackage;
public final class a74 implements x76, kz6 {
    public final byte a;
    public final Object b;
    public final Object c;

    public a74(int i, qe8 qe8Var, qe8 qe8Var2) {
        this.a = i;
        this.b = qe8Var;
        this.c = qe8Var2;
    }

    @Override
    public final void a(sw6 sw6Var, int i) {
        ((oz6) this.b).S(sw6Var, i, this.a, (lz6) this.c);
    }

    @Override
    public final void invoke(Object obj) {
        pe8 pe8Var = (pe8) obj;
        byte b = this.a;
        pe8Var.h(b);
        pe8Var.A(b, (qe8) this.b, (qe8) this.c);
    }

    public a74(oz6 oz6Var, int i, lz6 lz6Var) {
        this.b = oz6Var;
        this.a = i;
        this.c = lz6Var;
    }
}
