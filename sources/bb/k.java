package bb;
public final class k extends kd.c {
    public Object f2559a;
    public final m f2560b;
    public int f2561c;

    public k(m mVar, kd.c cVar) {
        super(cVar);
        this.f2560b = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2559a = obj;
        this.f2561c |= Integer.MIN_VALUE;
        return this.f2560b.c(null, null, this);
    }
}
