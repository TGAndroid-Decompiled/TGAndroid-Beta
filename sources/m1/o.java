package m1;
public final class o extends kd.c {
    public Object f20418a;
    public int f20419b;
    public final gb.y0 f20420c;

    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.f20420c = y0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20418a = obj;
        this.f20419b |= Integer.MIN_VALUE;
        return this.f20420c.a(null, this);
    }
}
