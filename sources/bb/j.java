package bb;
public final class j extends kd.c {
    public Object f3752a;
    public final l f3753b;
    public int f3754c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3753b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3752a = obj;
        this.f3754c |= Integer.MIN_VALUE;
        return this.f3753b.c(null, null, this);
    }
}
