package bb;
public final class g extends kd.c {
    public h f3469a;
    public Object f3470b;
    public final h f3471c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3471c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3470b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3471c.b(this);
    }
}
