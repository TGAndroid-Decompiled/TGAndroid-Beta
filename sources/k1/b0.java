package k1;
public final class b0 extends wc.c {
    public d0 f10254a;
    public Object f10255b;
    public Object f10256c;
    public Object d;
    public final d0 f10257e;
    public int f10258f;

    public b0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f10257e = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f10258f |= Integer.MIN_VALUE;
        return this.f10257e.i(null, null, this);
    }
}
