package ce;
public final class n extends kd.c {
    public o f5269a;
    public Object f5270b;
    public Object f5271c;
    public final o d;
    public int f5272e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5271c = obj;
        this.f5272e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
