package de;
public final class h extends ld.c {
    public i f8325a;
    public Object f8326b;
    public Object f8327c;
    public final i d;
    public int f8328e;

    public h(i iVar, ld.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8327c = obj;
        this.f8328e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
