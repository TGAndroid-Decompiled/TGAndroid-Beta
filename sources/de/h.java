package de;
public final class h extends ld.c {
    public i f8323a;
    public Object f8324b;
    public Object f8325c;
    public final i d;
    public int f8326e;

    public h(i iVar, ld.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8325c = obj;
        this.f8326e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
