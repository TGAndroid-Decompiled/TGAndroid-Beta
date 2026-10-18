package k1;
public final class p extends md.c {
    public Object f14591a;
    public z f14592b;
    public be.t f14593c;
    public Object d;
    public final z e;
    public int f14594f;

    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14594f |= Integer.MIN_VALUE;
        return z.b(this.e, null, this);
    }
}
