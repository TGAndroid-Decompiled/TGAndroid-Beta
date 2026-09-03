package k1;
public final class b0 extends wc.c {
    public d0 f9534a;
    public Object f9535b;
    public Object f9536c;
    public Object d;
    public final d0 e;
    public int f9537f;

    public b0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.e = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f9537f |= Integer.MIN_VALUE;
        return this.e.h(null, null, this);
    }
}
