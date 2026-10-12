package bb;
public final class k extends ld.c {
    public Object f3830a;
    public final m f3831b;
    public int f3832c;

    public k(m mVar, ld.c cVar) {
        super(cVar);
        this.f3831b = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3830a = obj;
        this.f3832c |= Integer.MIN_VALUE;
        return this.f3831b.c(null, null, this);
    }
}
