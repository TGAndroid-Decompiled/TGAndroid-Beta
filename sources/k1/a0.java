package k1;
public final class a0 extends wc.c {
    public Object f10248a;
    public Object f10249b;
    public Object f10250c;
    public final d0 d;
    public int f10251e;

    public a0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10250c = obj;
        this.f10251e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
