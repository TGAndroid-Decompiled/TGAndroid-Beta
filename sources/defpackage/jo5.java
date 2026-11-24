package defpackage;
public final class jo5 extends gw2 {
    public Object a;
    public Object b;
    public final cff c;
    public int d;

    public jo5(cff cffVar, gw2 gw2Var) {
        super(gw2Var);
        this.c = cffVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.A(null, this);
    }
}
