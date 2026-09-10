package bb;
public final class g extends kd.c {
    public h f2163a;
    public Object f2164b;
    public final h f2165c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f2165c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2164b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f2165c.b(this);
    }
}
