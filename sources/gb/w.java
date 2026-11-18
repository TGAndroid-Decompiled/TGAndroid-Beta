package gb;
public final class w extends kd.c {
    public Object f13430a;
    public Object f13431b;
    public final u f13432c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13432c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13431b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13432c.a(null, this);
    }
}
