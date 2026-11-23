package ce;
public final class i extends kd.c {
    public Object f5214a;
    public int f5215b;
    public final q4.q f5216c;
    public q4.q d;
    public d f5217e;
    public de.h f5218f;

    public i(q4.q qVar, kd.c cVar) {
        super(cVar);
        this.f5216c = qVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5214a = obj;
        this.f5215b |= Integer.MIN_VALUE;
        return this.f5216c.v(null, this);
    }
}
