package bb;
public final class g extends kd.c {
    public h f3467a;
    public Object f3468b;
    public final h f3469c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3469c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3468b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3469c.b(this);
    }
}
