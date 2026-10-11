package de;
public final class f extends ld.c {
    public g f8320a;
    public Object f8321b;
    public final g f8322c;
    public int d;

    public f(g gVar, ld.c cVar) {
        super(cVar);
        this.f8322c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8321b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8322c.b(null, this);
    }
}
