package k1;
public final class o extends ed.c {
    public Object f10544a;
    public int f10545b;
    public final bb.a0 f10546c;

    public o(bb.a0 a0Var, ed.c cVar) {
        super(cVar);
        this.f10546c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10544a = obj;
        this.f10545b |= Integer.MIN_VALUE;
        return this.f10546c.b(null, this);
    }
}
