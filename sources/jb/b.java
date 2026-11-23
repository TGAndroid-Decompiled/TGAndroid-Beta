package jb;
public final class b extends kd.c {
    public ie.a f17434a;
    public Object f17435b;
    public final d f17436c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f17436c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17435b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17436c.b(this);
    }
}
