package jb;
public final class b extends kd.c {
    public ie.a f17343a;
    public Object f17344b;
    public final d f17345c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f17345c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17344b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17345c.b(this);
    }
}
