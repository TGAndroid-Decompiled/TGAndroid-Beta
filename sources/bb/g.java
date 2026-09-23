package bb;
public final class g extends kd.c {
    public h f3462a;
    public Object f3463b;
    public final h f3464c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3464c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3463b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3464c.b(this);
    }
}
