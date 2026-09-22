package bb;
public final class a extends kd.c {
    public Object f3452a;
    public ie.a f3453b;
    public Object f3454c;
    public final d d;
    public int e;

    public a(d dVar, kd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3454c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
