package ce;
public final class n extends kd.c {
    public o f4951a;
    public Object f4952b;
    public Object f4953c;
    public final o d;
    public int f4954e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4953c = obj;
        this.f4954e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
