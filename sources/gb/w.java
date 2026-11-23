package gb;
public final class w extends kd.c {
    public Object f13459a;
    public Object f13460b;
    public final u f13461c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13461c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13460b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13461c.a(null, this);
    }
}
