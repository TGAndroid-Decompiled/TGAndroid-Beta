package jb;
public final class o extends kd.c {
    public Object f16635a;
    public final p f16636b;
    public int f16637c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f16636b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16635a = obj;
        this.f16637c |= Integer.MIN_VALUE;
        return this.f16636b.c(null, this);
    }
}
