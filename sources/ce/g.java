package ce;
public final class g extends kd.c {
    public Object f5208a;
    public int f5209b;
    public final h f5210c;
    public Object d;
    public d f5211e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f5210c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5208a = obj;
        this.f5209b |= Integer.MIN_VALUE;
        return this.f5210c.J(null, this);
    }
}
