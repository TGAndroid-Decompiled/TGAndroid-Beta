package jb;
public final class b extends kd.c {
    public ie.a f17368a;
    public Object f17369b;
    public final d f17370c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f17370c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17369b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17370c.b(this);
    }
}
