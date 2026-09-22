package bb;
public final class j extends kd.c {
    public Object f3478a;
    public final l f3479b;
    public int f3480c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3479b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3478a = obj;
        this.f3480c |= Integer.MIN_VALUE;
        return this.f3479b.c(null, null, this);
    }
}
