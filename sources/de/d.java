package de;
public final class d extends ld.c {
    public Object f8314a;
    public int f8315b;
    public final pf.b f8316c;
    public pf.b d;
    public c f8317e;

    public d(pf.b bVar, ld.c cVar) {
        super(cVar);
        this.f8316c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8314a = obj;
        this.f8315b |= Integer.MIN_VALUE;
        return this.f8316c.z(null, this);
    }
}
