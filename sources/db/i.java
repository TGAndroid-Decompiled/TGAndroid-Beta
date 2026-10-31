package db;
public final class i extends ed.c {
    public Object f5851a;
    public final k f5852b;
    public int f5853c;

    public i(k kVar, ed.c cVar) {
        super(cVar);
        this.f5852b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5851a = obj;
        this.f5853c |= Integer.MIN_VALUE;
        return this.f5852b.c(null, null, this);
    }
}
