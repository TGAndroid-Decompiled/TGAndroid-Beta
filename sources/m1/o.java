package m1;
public final class o extends kd.c {
    public Object f20026a;
    public int f20027b;
    public final gb.y0 f20028c;

    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.f20028c = y0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20026a = obj;
        this.f20027b |= Integer.MIN_VALUE;
        return this.f20028c.a(null, this);
    }
}
