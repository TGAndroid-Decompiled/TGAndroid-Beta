package k1;
public final class t extends md.c {
    public z f14608a;
    public Object f14609b;
    public final z f14610c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f14610c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14609b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14610c.d(this);
    }
}
