package bb;
public final class b extends kd.c {
    public Object f2532a;
    public ie.a f2533b;
    public Object f2534c;
    public final e d;
    public int f2535e;

    public b(e eVar, kd.c cVar) {
        super(cVar);
        this.d = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2534c = obj;
        this.f2535e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
