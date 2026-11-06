package ce;
public final class i extends kd.c {
    public Object f6108a;
    public int f6109b;
    public final q4.q f6110c;
    public q4.q d;
    public d f6111e;
    public de.h f6112f;

    public i(q4.q qVar, kd.c cVar) {
        super(cVar);
        this.f6110c = qVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6108a = obj;
        this.f6109b |= Integer.MIN_VALUE;
        return this.f6110c.B(null, this);
    }
}
