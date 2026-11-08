package o1;
public final class c extends kd.c {
    public d f20698a;
    public Object f20699b;
    public final d f20700c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f20700c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20699b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20700c.a(null, this);
    }
}
