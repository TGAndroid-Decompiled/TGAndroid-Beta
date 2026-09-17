package bb;
public final class h extends kd.c {
    public i f2577a;
    public Object f2578b;
    public final i f2579c;
    public int d;

    public h(i iVar, kd.c cVar) {
        super(cVar);
        this.f2579c = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2578b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f2579c.b(this);
    }
}
