package de;
public final class h extends ld.c {
    public i f8326a;
    public Object f8327b;
    public Object f8328c;
    public final i d;
    public int f8329e;

    public h(i iVar, ld.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8328c = obj;
        this.f8329e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
