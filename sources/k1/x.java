package k1;
public final class x extends ld.c {
    public Object f14386a;
    public Object f14387b;
    public Object f14388c;
    public final a0 d;
    public int f14389e;

    public x(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14388c = obj;
        this.f14389e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
