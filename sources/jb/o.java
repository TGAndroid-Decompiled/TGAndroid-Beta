package jb;
public final class o extends kd.c {
    public Object f17398a;
    public final p f17399b;
    public int f17400c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f17399b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17398a = obj;
        this.f17400c |= Integer.MIN_VALUE;
        return this.f17399b.c(null, this);
    }
}
