package bb;
public final class j extends kd.c {
    public Object f2172a;
    public final l f2173b;
    public int f2174c;

    public j(l lVar, kd.c cVar) {
        super(cVar);
        this.f2173b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2172a = obj;
        this.f2174c |= Integer.MIN_VALUE;
        return this.f2173b.c(null, null, this);
    }
}
