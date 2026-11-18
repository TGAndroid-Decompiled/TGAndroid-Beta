package ce;
public final class g extends kd.c {
    public Object f5216a;
    public int f5217b;
    public final h f5218c;
    public Object d;
    public d f5219e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f5218c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5216a = obj;
        this.f5217b |= Integer.MIN_VALUE;
        return this.f5218c.v(null, this);
    }
}
