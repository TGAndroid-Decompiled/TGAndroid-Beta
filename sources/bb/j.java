package bb;
public final class j extends kd.c {
    public Object f3476a;
    public final l f3477b;
    public int f3478c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3477b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3476a = obj;
        this.f3478c |= Integer.MIN_VALUE;
        return this.f3477b.c(null, null, this);
    }
}
