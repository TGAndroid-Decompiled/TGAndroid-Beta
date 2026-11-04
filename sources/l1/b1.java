package l1;
public final class b1 extends hd.c {
    public Object f17500a;
    public fe.d f17501b;
    public Object f17502c;
    public final e1 d;
    public int f17503e;

    public b1(e1 e1Var, hd.c cVar) {
        super(cVar);
        this.d = e1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17502c = obj;
        this.f17503e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
