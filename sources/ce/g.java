package ce;
public final class g extends kd.c {
    public Object f4927a;
    public int f4928b;
    public final h f4929c;
    public Object d;
    public d f4930e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f4929c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4927a = obj;
        this.f4928b |= Integer.MIN_VALUE;
        return this.f4929c.G(null, this);
    }
}
