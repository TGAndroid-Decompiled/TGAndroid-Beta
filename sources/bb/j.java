package bb;
public final class j extends kd.c {
    public Object f3474a;
    public final l f3475b;
    public int f3476c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3475b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3474a = obj;
        this.f3476c |= Integer.MIN_VALUE;
        return this.f3475b.c(null, null, this);
    }
}
