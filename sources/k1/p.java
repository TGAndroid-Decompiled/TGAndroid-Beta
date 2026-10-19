package k1;
public final class p extends md.c {
    public Object f14590a;
    public z f14591b;
    public be.t f14592c;
    public Object d;
    public final z e;
    public int f14593f;

    public p(z zVar, md.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14593f |= Integer.MIN_VALUE;
        return z.a(this.e, null, this);
    }
}
