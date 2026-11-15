package jb;
public final class k extends kd.c {
    public Object f16982a;
    public final l f16983b;
    public int f16984c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f16983b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16982a = obj;
        this.f16984c |= Integer.MIN_VALUE;
        return this.f16983b.b(this);
    }
}
