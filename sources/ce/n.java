package ce;
public final class n extends kd.c {
    public o f6129a;
    public Object f6130b;
    public Object f6131c;
    public final o d;
    public int f6132e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6131c = obj;
        this.f6132e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
