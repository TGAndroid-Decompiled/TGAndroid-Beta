package m1;
public final class o extends kd.c {
    public Object f20390a;
    public int f20391b;
    public final gb.y0 f20392c;

    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.f20392c = y0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20390a = obj;
        this.f20391b |= Integer.MIN_VALUE;
        return this.f20392c.a(null, this);
    }
}
