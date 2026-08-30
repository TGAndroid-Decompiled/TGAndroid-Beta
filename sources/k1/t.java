package k1;
public final class t extends wc.c {
    public Object f9602a;
    public d0 f9603b;
    public ld.t f9604c;
    public Object d;
    public final d0 e;
    public int f9605f;

    public t(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.e = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f9605f |= Integer.MIN_VALUE;
        return d0.a(this.e, null, this);
    }
}
