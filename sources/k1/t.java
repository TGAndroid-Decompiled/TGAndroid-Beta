package k1;
public final class t extends ed.c {
    public z f10566a;
    public Object f10567b;
    public final z f10568c;
    public int d;

    public t(z zVar, ed.c cVar) {
        super(cVar);
        this.f10568c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10567b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10568c.e(this);
    }
}
