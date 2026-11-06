package ce;
public final class g extends kd.c {
    public Object f6102a;
    public int f6103b;
    public final h f6104c;
    public Object d;
    public d f6105e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f6104c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6102a = obj;
        this.f6103b |= Integer.MIN_VALUE;
        return this.f6104c.B(null, this);
    }
}
