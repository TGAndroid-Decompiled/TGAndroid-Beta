package jb;
public final class o extends kd.c {
    public Object f17367a;
    public final p f17368b;
    public int f17369c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f17368b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17367a = obj;
        this.f17369c |= Integer.MIN_VALUE;
        return this.f17368b.c(null, this);
    }
}
