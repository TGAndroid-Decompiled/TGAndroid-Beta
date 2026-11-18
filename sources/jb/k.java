package jb;
public final class k extends kd.c {
    public Object f17367a;
    public final l f17368b;
    public int f17369c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f17368b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17367a = obj;
        this.f17369c |= Integer.MIN_VALUE;
        return this.f17368b.b(this);
    }
}
