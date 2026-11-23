package gb;
public final class x extends kd.c {
    public Object f13426a;
    public Object f13427b;
    public final v f13428c;
    public int d;

    public x(v vVar, kd.c cVar) {
        super(cVar);
        this.f13428c = vVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13427b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13428c.a(null, this);
    }
}
