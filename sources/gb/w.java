package gb;
public final class w extends kd.c {
    public Object f13113a;
    public Object f13114b;
    public final u f13115c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13115c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13114b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13115c.a(null, this);
    }
}
