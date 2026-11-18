package jb;
public final class k extends kd.c {
    public Object f17364a;
    public final l f17365b;
    public int f17366c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f17365b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17364a = obj;
        this.f17366c |= Integer.MIN_VALUE;
        return this.f17365b.b(this);
    }
}
