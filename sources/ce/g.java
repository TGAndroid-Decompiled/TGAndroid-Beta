package ce;
public final class g extends kd.c {
    public Object f5242a;
    public int f5243b;
    public final h f5244c;
    public Object d;
    public d f5245e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f5244c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5242a = obj;
        this.f5243b |= Integer.MIN_VALUE;
        return this.f5244c.v(null, this);
    }
}
