package ce;
public final class n extends kd.c {
    public o f5237a;
    public Object f5238b;
    public Object f5239c;
    public final o d;
    public int f5240e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5239c = obj;
        this.f5240e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
