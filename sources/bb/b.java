package bb;
public final class b extends kd.c {
    public Object f2559a;
    public ie.a f2560b;
    public Object f2561c;
    public final e d;
    public int f2562e;

    public b(e eVar, kd.c cVar) {
        super(cVar);
        this.d = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2561c = obj;
        this.f2562e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
