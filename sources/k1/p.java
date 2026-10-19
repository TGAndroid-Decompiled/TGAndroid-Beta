package k1;
public final class p extends md.c {
    public Object f14592a;
    public z f14593b;
    public be.t f14594c;
    public Object d;
    public final z e;
    public int f14595f;

    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14595f |= Integer.MIN_VALUE;
        return z.a(this.e, null, this);
    }
}
