package jb;
public final class b extends kd.c {
    public ie.a f17340a;
    public Object f17341b;
    public final d f17342c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f17342c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17341b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17342c.b(this);
    }
}
