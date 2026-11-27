package defpackage;
public final class dw8 implements uz6 {
    public final f73 a;
    public final jz7 b;
    public final rx6 c;
    public final z6f d;
    public final int e;

    public dw8(f73 f73Var, db3 db3Var) {
        jz7 jz7Var = new jz7(db3Var, (byte) 21);
        rx6 rx6Var = new rx6();
        z6f z6fVar = new z6f((byte) 17);
        this.a = f73Var;
        this.b = jz7Var;
        this.c = rx6Var;
        this.d = z6fVar;
        this.e = 1048576;
    }

    @Override
    public final ew8 d(ft6 ft6Var) {
        ft6Var.b.getClass();
        return new ew8(ft6Var, this.a, this.b, this.c.G(ft6Var), this.d, this.e, null);
    }

    @Override
    public final uz6 a() {
        return this;
    }

    @Override
    public final uz6 b() {
        return this;
    }

    @Override
    public final uz6 c(uif uifVar) {
        return this;
    }
}
