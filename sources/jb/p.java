package jb;
public final class p extends kd.c {
    public Object f17470a;
    public final q f17471b;
    public int f17472c;

    public p(q qVar, kd.c cVar) {
        super(cVar);
        this.f17471b = qVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17470a = obj;
        this.f17472c |= Integer.MIN_VALUE;
        return this.f17471b.c(null, this);
    }
}
