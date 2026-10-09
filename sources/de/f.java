package de;
public final class f extends ld.c {
    public g f8321a;
    public Object f8322b;
    public final g f8323c;
    public int d;

    public f(g gVar, ld.c cVar) {
        super(cVar);
        this.f8323c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8322b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8323c.b(null, this);
    }
}
