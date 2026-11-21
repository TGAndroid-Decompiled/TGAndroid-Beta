package jb;
public final class k extends kd.c {
    public Object f17389a;
    public final l f17390b;
    public int f17391c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f17390b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17389a = obj;
        this.f17391c |= Integer.MIN_VALUE;
        return this.f17390b.b(this);
    }
}
