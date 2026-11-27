package defpackage;
public final class zu5 extends yfb implements is4 {
    public Object a;
    public final zj8 b;
    public final Long c;

    public zu5(zj8 zj8Var, Long l, zw2 zw2Var) {
        super(2, zw2Var);
        this.b = zj8Var;
        this.c = l;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        zu5 zu5Var = new zu5(this.b, this.c, zw2Var);
        zu5Var.a = obj;
        return zu5Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g9c g9cVar = g9c.a;
        ((zu5) create((sj7) obj, (zw2) obj2)).invokeSuspend(g9cVar);
        return g9cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        sj7 sj7Var = (sj7) this.a;
        sj7Var.getClass();
        sj7Var.d(this.b, this.c);
        return g9c.a;
    }
}
