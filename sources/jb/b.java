package jb;
public final class b extends kd.c {
    public ie.a f16602a;
    public Object f16603b;
    public final d f16604c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f16604c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16603b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16604c.b(this);
    }
}
