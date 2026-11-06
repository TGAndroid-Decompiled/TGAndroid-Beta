package jb;
public final class k extends kd.c {
    public Object f16626a;
    public final l f16627b;
    public int f16628c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f16627b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16626a = obj;
        this.f16628c |= Integer.MIN_VALUE;
        return this.f16627b.b(this);
    }
}
