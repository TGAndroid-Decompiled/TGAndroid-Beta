package jb;
public final class k extends kd.c {
    public Object f16629a;
    public final l f16630b;
    public int f16631c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f16630b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16629a = obj;
        this.f16631c |= Integer.MIN_VALUE;
        return this.f16630b.b(this);
    }
}
