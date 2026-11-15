package jb;
public final class b extends kd.c {
    public ie.a f16958a;
    public Object f16959b;
    public final d f16960c;
    public int d;

    public b(d dVar, kd.c cVar) {
        super(cVar);
        this.f16960c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16959b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16960c.b(this);
    }
}
