package jb;
public final class o extends kd.c {
    public Object f16638a;
    public final p f16639b;
    public int f16640c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f16639b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16638a = obj;
        this.f16640c |= Integer.MIN_VALUE;
        return this.f16639b.c(null, this);
    }
}
