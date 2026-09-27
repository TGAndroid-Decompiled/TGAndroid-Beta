package bb;
public final class j extends kd.c {
    public Object f3473a;
    public final l f3474b;
    public int f3475c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3474b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3473a = obj;
        this.f3475c |= Integer.MIN_VALUE;
        return this.f3474b.c(null, null, this);
    }
}
