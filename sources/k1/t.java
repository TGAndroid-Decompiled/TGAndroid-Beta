package k1;
public final class t extends md.c {
    public z f14609a;
    public Object f14610b;
    public final z f14611c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f14611c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14610b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14611c.e(this);
    }
}
