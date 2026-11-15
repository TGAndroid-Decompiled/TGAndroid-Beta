package jb;
public final class o extends kd.c {
    public Object f16991a;
    public final p f16992b;
    public int f16993c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f16992b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16991a = obj;
        this.f16993c |= Integer.MIN_VALUE;
        return this.f16992b.c(null, this);
    }
}
