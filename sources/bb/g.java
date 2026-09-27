package bb;
public final class g extends kd.c {
    public h f3464a;
    public Object f3465b;
    public final h f3466c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3466c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3465b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3466c.b(this);
    }
}
