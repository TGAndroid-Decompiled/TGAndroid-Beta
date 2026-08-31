package k1;
public final class t extends wc.c {
    public Object f10307a;
    public d0 f10308b;
    public ld.t f10309c;
    public Object d;
    public final d0 f10310e;
    public int f10311f;

    public t(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f10310e = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f10311f |= Integer.MIN_VALUE;
        return d0.a(this.f10310e, null, this);
    }
}
