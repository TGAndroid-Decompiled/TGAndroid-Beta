package db;
public final class v extends hd.c {
    public Object f8737a;
    public Object f8738b;
    public final t f8739c;
    public int d;

    public v(t tVar, hd.c cVar) {
        super(cVar);
        this.f8739c = tVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8738b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8739c.a(null, this);
    }
}
