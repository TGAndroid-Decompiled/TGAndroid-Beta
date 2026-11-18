package jb;
public final class o extends kd.c {
    public Object f17376a;
    public final p f17377b;
    public int f17378c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f17377b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17376a = obj;
        this.f17378c |= Integer.MIN_VALUE;
        return this.f17377b.c(null, this);
    }
}
