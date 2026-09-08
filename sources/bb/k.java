package bb;
public final class k extends kd.c {
    public Object f2586a;
    public final m f2587b;
    public int f2588c;

    public k(m mVar, kd.c cVar) {
        super(cVar);
        this.f2587b = mVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2586a = obj;
        this.f2588c |= Integer.MIN_VALUE;
        return this.f2587b.c(null, null, this);
    }
}
