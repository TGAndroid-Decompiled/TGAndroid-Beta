package l1;
public final class c1 extends hd.c {
    public fe.d f17510a;
    public boolean f17511b;
    public Object f17512c;
    public final e1 d;
    public int f17513e;

    public c1(e1 e1Var, hd.c cVar) {
        super(cVar);
        this.d = e1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17512c = obj;
        this.f17513e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
