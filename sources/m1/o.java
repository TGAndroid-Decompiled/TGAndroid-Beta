package m1;
public final class o extends kd.c {
    public Object f19437a;
    public int f19438b;
    public final gb.a1 f19439c;

    public o(gb.a1 a1Var, id.c cVar) {
        super(cVar);
        this.f19439c = a1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19437a = obj;
        this.f19438b |= Integer.MIN_VALUE;
        return this.f19439c.a(null, this);
    }
}
