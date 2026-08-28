package k1;
public final class o extends sc.c {
    public Object f14460a;
    public int f14461b;
    public final ha.a0 f14462c;

    public o(ha.a0 a0Var, sc.c cVar) {
        super(cVar);
        this.f14462c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14460a = obj;
        this.f14461b |= Integer.MIN_VALUE;
        return this.f14462c.c(null, this);
    }
}
