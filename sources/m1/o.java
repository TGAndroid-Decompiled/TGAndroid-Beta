package m1;
public final class o extends kd.c {
    public Object f20393a;
    public int f20394b;
    public final gb.y0 f20395c;

    public o(gb.y0 y0Var, id.c cVar) {
        super(cVar);
        this.f20395c = y0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20393a = obj;
        this.f20394b |= Integer.MIN_VALUE;
        return this.f20395c.a(null, this);
    }
}
