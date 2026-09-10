package bb;
public final class a extends kd.c {
    public Object f2148a;
    public ie.a f2149b;
    public Object f2150c;
    public final d d;
    public int e;

    public a(d dVar, kd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2150c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
