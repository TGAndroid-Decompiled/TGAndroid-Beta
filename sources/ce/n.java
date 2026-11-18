package ce;
public final class n extends kd.c {
    public o f5240a;
    public Object f5241b;
    public Object f5242c;
    public final o d;
    public int f5243e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5242c = obj;
        this.f5243e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
