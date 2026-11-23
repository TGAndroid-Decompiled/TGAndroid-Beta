package jb;
public final class k extends kd.c {
    public Object f17392a;
    public final l f17393b;
    public int f17394c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f17393b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17392a = obj;
        this.f17394c |= Integer.MIN_VALUE;
        return this.f17393b.b(this);
    }
}
