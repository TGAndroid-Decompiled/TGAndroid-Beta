package k1;
public final class t extends ed.c {
    public z f10565a;
    public Object f10566b;
    public final z f10567c;
    public int d;

    public t(z zVar, ed.c cVar) {
        super(cVar);
        this.f10567c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10566b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10567c.e(this);
    }
}
