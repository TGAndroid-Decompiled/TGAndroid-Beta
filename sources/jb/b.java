package jb;
public final class b extends kd.c {
    public ie.a f17365a;
    public Object f17366b;
    public final d f17367c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f17367c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17366b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17367c.b(this);
    }
}
