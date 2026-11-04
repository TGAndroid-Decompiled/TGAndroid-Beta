package gb;
public final class k extends hd.c {
    public Object f12224a;
    public final l f12225b;
    public int f12226c;

    public k(l lVar, hd.c cVar) {
        super(cVar);
        this.f12225b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12224a = obj;
        this.f12226c |= Integer.MIN_VALUE;
        return this.f12225b.b(this);
    }
}
