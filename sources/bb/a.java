package bb;
public final class a extends kd.c {
    public Object f3725a;
    public ie.a f3726b;
    public Object f3727c;
    public final d d;
    public int f3728e;

    public a(d dVar, kd.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3727c = obj;
        this.f3728e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
