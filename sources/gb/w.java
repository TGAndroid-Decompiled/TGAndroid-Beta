package gb;
public final class w extends kd.c {
    public Object f13767a;
    public Object f13768b;
    public final u f13769c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13769c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13768b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13769c.a(null, this);
    }
}
