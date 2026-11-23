package jb;
public final class k extends kd.c {
    public Object f17458a;
    public final l f17459b;
    public int f17460c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f17459b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17458a = obj;
        this.f17460c |= Integer.MIN_VALUE;
        return this.f17459b.b(this);
    }
}
