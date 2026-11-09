package ce;
public final class n extends kd.c {
    public o f6124a;
    public Object f6125b;
    public Object f6126c;
    public final o d;
    public int f6127e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6126c = obj;
        this.f6127e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
