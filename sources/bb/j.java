package bb;
public final class j extends kd.c {
    public Object f3479a;
    public final l f3480b;
    public int f3481c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3480b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3479a = obj;
        this.f3481c |= Integer.MIN_VALUE;
        return this.f3480b.c(null, null, this);
    }
}
