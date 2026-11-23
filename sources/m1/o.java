package m1;
public final class o extends kd.c {
    public Object f20421a;
    public int f20422b;
    public final gb.y0 f20423c;

    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.f20423c = y0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20421a = obj;
        this.f20422b |= Integer.MIN_VALUE;
        return this.f20423c.a(null, this);
    }
}
