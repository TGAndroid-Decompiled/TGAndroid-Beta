package jb;
public final class k extends kd.c {
    public Object f17358a;
    public final l f17359b;
    public int f17360c;

    public k(l lVar, kd.c cVar) {
        super(cVar);
        this.f17359b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17358a = obj;
        this.f17360c |= Integer.MIN_VALUE;
        return this.f17359b.b(this);
    }
}
