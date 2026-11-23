package jb;
public final class o extends kd.c {
    public Object f17401a;
    public final p f17402b;
    public int f17403c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f17402b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17401a = obj;
        this.f17403c |= Integer.MIN_VALUE;
        return this.f17402b.c(null, this);
    }
}
