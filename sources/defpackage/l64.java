package defpackage;
public final class l64 implements b86, oz6 {
    public final byte a;
    public final Object b;
    public final Object c;

    public l64(int i, cg8 cg8Var, cg8 cg8Var2) {
        this.a = i;
        this.b = cg8Var;
        this.c = cg8Var2;
    }

    @Override
    public final void a(xw6 xw6Var, int i) {
        ((sz6) this.b).S(xw6Var, i, this.a, (pz6) this.c);
    }

    @Override
    public final void invoke(Object obj) {
        bg8 bg8Var = (bg8) obj;
        byte b = this.a;
        bg8Var.f(b);
        bg8Var.A(b, (cg8) this.b, (cg8) this.c);
    }

    public l64(sz6 sz6Var, int i, pz6 pz6Var) {
        this.b = sz6Var;
        this.a = i;
        this.c = pz6Var;
    }
}
