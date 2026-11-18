package gb;
public final class w extends kd.c {
    public Object f13427a;
    public Object f13428b;
    public final u f13429c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13429c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13428b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13429c.a(null, this);
    }
}
