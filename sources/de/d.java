package de;
public final class d extends ld.c {
    public Object f8313a;
    public int f8314b;
    public final pf.b f8315c;
    public pf.b d;
    public c f8316e;

    public d(pf.b bVar, ld.c cVar) {
        super(cVar);
        this.f8315c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8313a = obj;
        this.f8314b |= Integer.MIN_VALUE;
        return this.f8315c.G(null, this);
    }
}
