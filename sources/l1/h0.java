package l1;
public final class h0 extends hd.c {
    public i0 f17546a;
    public Object f17547b;
    public Object f17548c;
    public k0 d;
    public Object f17549e;
    public final i0 f17550f;
    public int h;

    public h0(i0 i0Var, hd.c cVar) {
        super(cVar);
        this.f17550f = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17549e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f17550f.b(null, this);
    }
}
