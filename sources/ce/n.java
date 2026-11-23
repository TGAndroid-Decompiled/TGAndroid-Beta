package ce;
public final class n extends kd.c {
    public o f5232a;
    public Object f5233b;
    public Object f5234c;
    public final o d;
    public int f5235e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5234c = obj;
        this.f5235e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
