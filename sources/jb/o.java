package jb;
public final class o extends kd.c {
    public Object f17373a;
    public final p f17374b;
    public int f17375c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f17374b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17373a = obj;
        this.f17375c |= Integer.MIN_VALUE;
        return this.f17374b.c(null, this);
    }
}
