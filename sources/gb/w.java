package gb;
public final class w extends kd.c {
    public Object f13422a;
    public Object f13423b;
    public final u f13424c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13424c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13423b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13424c.a(null, this);
    }
}
