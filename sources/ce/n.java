package ce;
public final class n extends kd.c {
    public o f5266a;
    public Object f5267b;
    public Object f5268c;
    public final o d;
    public int f5269e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5268c = obj;
        this.f5269e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
