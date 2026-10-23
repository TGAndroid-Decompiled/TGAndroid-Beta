package k1;
public final class p extends md.c {
    public Object f14636a;
    public z f14637b;
    public be.t f14638c;
    public Object d;
    public final z e;
    public int f14639f;

    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14639f |= Integer.MIN_VALUE;
        return z.a(this.e, null, this);
    }
}
