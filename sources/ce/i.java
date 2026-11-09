package ce;
public final class i extends kd.c {
    public Object f6106a;
    public int f6107b;
    public final q4.q f6108c;
    public q4.q d;
    public d f6109e;
    public de.h f6110f;

    public i(q4.q qVar, kd.c cVar) {
        super(cVar);
        this.f6108c = qVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6106a = obj;
        this.f6107b |= Integer.MIN_VALUE;
        return this.f6108c.B(null, this);
    }
}
