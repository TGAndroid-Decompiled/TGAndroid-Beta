package defpackage;
public final class vu8 implements qz6 {
    public final y73 a;
    public final h68 b;
    public final mx6 c;
    public final k4f d;
    public final int e;

    public vu8(y73 y73Var, wb3 wb3Var) {
        h68 h68Var = new h68(wb3Var, (byte) 18);
        mx6 mx6Var = new mx6();
        k4f k4fVar = new k4f((byte) 17);
        this.a = y73Var;
        this.b = h68Var;
        this.c = mx6Var;
        this.d = k4fVar;
        this.e = 1048576;
    }

    @Override
    public final wu8 d(bt6 bt6Var) {
        bt6Var.b.getClass();
        return new wu8(bt6Var, this.a, this.b, this.c.G(bt6Var), this.d, this.e, null);
    }

    @Override
    public final qz6 a() {
        return this;
    }

    @Override
    public final qz6 b() {
        return this;
    }

    @Override
    public final qz6 c(fgf fgfVar) {
        return this;
    }
}
