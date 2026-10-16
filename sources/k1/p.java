package k1;
public final class p extends md.c {
    public Object f13791a;
    public z f13792b;
    public be.t f13793c;
    public Object d;
    public final z e;
    public int f13794f;

    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13794f |= Integer.MIN_VALUE;
        return z.b(this.e, null, this);
    }
}
