package k1;
public final class p extends ed.c {
    public Object f10548a;
    public z f10549b;
    public td.t f10550c;
    public Object d;
    public final z e;
    public int f10551f;

    public p(z zVar, ed.c cVar) {
        super(cVar);
        this.e = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f10551f |= Integer.MIN_VALUE;
        return z.a(this.e, null, this);
    }
}
