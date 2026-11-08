package m1;
public final class o extends kd.c {
    public Object f19432a;
    public int f19433b;
    public final gb.a1 f19434c;

    public o(gb.a1 a1Var, id.c cVar) {
        super(cVar);
        this.f19434c = a1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19432a = obj;
        this.f19433b |= Integer.MIN_VALUE;
        return this.f19434c.a(null, this);
    }
}
