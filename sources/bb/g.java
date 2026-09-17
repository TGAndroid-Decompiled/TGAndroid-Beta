package bb;
public final class g extends kd.c {
    public h f3470a;
    public Object f3471b;
    public final h f3472c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3472c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3471b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3472c.b(this);
    }
}
