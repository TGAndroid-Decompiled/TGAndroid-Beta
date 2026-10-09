package bb;
public final class a extends ld.c {
    public Object f3804a;
    public je.a f3805b;
    public Object f3806c;
    public final d d;
    public int f3807e;

    public a(d dVar, ld.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3806c = obj;
        this.f3807e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
