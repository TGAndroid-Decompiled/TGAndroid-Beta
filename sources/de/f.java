package de;
public final class f extends ld.c {
    public g f8318a;
    public Object f8319b;
    public final g f8320c;
    public int d;

    public f(g gVar, ld.c cVar) {
        super(cVar);
        this.f8320c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8319b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8320c.b(null, this);
    }
}
