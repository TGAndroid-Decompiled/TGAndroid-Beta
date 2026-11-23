package m1;
public final class o extends kd.c {
    public Object f20387a;
    public int f20388b;
    public final gb.y0 f20389c;

    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.f20389c = y0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20387a = obj;
        this.f20388b |= Integer.MIN_VALUE;
        return this.f20389c.a(null, this);
    }
}
