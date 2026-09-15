package bb;
public final class g extends kd.c {
    public h f3465a;
    public Object f3466b;
    public final h f3467c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3467c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3466b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3467c.b(this);
    }
}
