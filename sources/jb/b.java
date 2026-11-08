package jb;
public final class b extends kd.c {
    public ie.a f16605a;
    public Object f16606b;
    public final d f16607c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f16607c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16606b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16607c.b(this);
    }
}
