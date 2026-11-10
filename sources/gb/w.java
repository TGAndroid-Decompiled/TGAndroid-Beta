package gb;
public final class w extends kd.c {
    public Object f13769a;
    public Object f13770b;
    public final u f13771c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13771c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13770b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13771c.a(null, this);
    }
}
