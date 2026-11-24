package defpackage;
public final class q54 implements x56, kx6 {
    public final byte a;
    public final Object b;
    public final Object c;

    public q54(int i, nc8 nc8Var, nc8 nc8Var2) {
        this.a = i;
        this.b = nc8Var;
        this.c = nc8Var2;
    }

    @Override
    public final void a(su6 su6Var, int i) {
        ((ox6) this.b).S(su6Var, i, this.a, (lx6) this.c);
    }

    @Override
    public final void invoke(Object obj) {
        mc8 mc8Var = (mc8) obj;
        byte b = this.a;
        mc8Var.f(b);
        mc8Var.A(b, (nc8) this.b, (nc8) this.c);
    }

    public q54(ox6 ox6Var, int i, lx6 lx6Var) {
        this.b = ox6Var;
        this.a = i;
        this.c = lx6Var;
    }
}
