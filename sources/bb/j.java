package bb;
public final class j extends kd.c {
    public Object f3471a;
    public final l f3472b;
    public int f3473c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f3472b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3471a = obj;
        this.f3473c |= Integer.MIN_VALUE;
        return this.f3472b.c(null, null, this);
    }
}
