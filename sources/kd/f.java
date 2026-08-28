package kd;
public final class f extends sc.c {
    public g f14770a;
    public Object f14771b;
    public final g f14772c;
    public int d;

    public f(g gVar, sc.c cVar) {
        super(cVar);
        this.f14772c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14771b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14772c.c(null, this);
    }
}
