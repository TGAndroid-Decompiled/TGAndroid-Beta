package defpackage;
public final class vu5 extends eeb implements fs4 {
    public Object a;
    public final ni8 b;
    public final Long c;

    public vu5(ni8 ni8Var, Long l, px2 px2Var) {
        super(2, px2Var);
        this.b = ni8Var;
        this.c = l;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        vu5 vu5Var = new vu5(this.b, this.c, px2Var);
        vu5Var.a = obj;
        return vu5Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g7c g7cVar = g7c.a;
        ((vu5) create((lj7) obj, (px2) obj2)).invokeSuspend(g7cVar);
        return g7cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        lj7 lj7Var = (lj7) this.a;
        lj7Var.getClass();
        lj7Var.d(this.b, this.c);
        return g7c.a;
    }
}
