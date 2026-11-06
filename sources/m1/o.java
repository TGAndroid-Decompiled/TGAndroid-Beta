package m1;
public final class o extends kd.c {
    public Object f19429a;
    public int f19430b;
    public final gb.a1 f19431c;

    public o(gb.a1 a1Var, id.c cVar) {
        super(cVar);
        this.f19431c = a1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19429a = obj;
        this.f19430b |= Integer.MIN_VALUE;
        return this.f19431c.a(null, this);
    }
}
