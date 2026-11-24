package defpackage;
public final class ws5 extends ccb implements eq4 {
    public Object a;
    public final lg8 b;
    public final Long c;

    public ws5(lg8 lg8Var, Long l, fw2 fw2Var) {
        super(2, fw2Var);
        this.b = lg8Var;
        this.c = l;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        ws5 ws5Var = new ws5(this.b, this.c, fw2Var);
        ws5Var.a = obj;
        return ws5Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g5c g5cVar = g5c.a;
        ((ws5) create((ih7) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        return g5cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        ih7 ih7Var = (ih7) this.a;
        ih7Var.getClass();
        ih7Var.d(this.b, this.c);
        return g5c.a;
    }
}
