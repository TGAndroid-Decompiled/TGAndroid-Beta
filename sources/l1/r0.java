package l1;
public final class r0 extends hd.c {
    public Object f17615a;
    public Object f17616b;
    public Object f17617c;
    public Object d;
    public final t0 f17618e;
    public int f17619f;

    public r0(t0 t0Var, hd.c cVar) {
        super(cVar);
        this.f17618e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f17619f |= Integer.MIN_VALUE;
        return this.f17618e.b(null, this);
    }
}
