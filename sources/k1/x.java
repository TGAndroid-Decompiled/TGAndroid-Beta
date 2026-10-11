package k1;
public final class x extends ld.c {
    public Object f14389a;
    public Object f14390b;
    public Object f14391c;
    public final a0 d;
    public int f14392e;

    public x(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14391c = obj;
        this.f14392e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
