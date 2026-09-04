package bb;
public final class h extends kd.c {
    public i f2550a;
    public Object f2551b;
    public final i f2552c;
    public int d;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.f2552c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2551b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f2552c.b(this);
    }
}
