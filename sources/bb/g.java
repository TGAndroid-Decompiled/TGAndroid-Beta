package bb;
public final class g extends kd.c {
    public h f3743a;
    public Object f3744b;
    public final h f3745c;
    public int d;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f3745c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3744b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f3745c.b(this);
    }
}
