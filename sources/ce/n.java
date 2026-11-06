package ce;
public final class n extends kd.c {
    public o f6126a;
    public Object f6127b;
    public Object f6128c;
    public final o d;
    public int f6129e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6128c = obj;
        this.f6129e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
