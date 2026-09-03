package k1;
public final class a0 extends wc.c {
    public Object f9529a;
    public Object f9530b;
    public Object f9531c;
    public final d0 d;
    public int e;

    public a0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9531c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
