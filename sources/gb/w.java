package gb;
public final class w extends kd.c {
    public Object f13456a;
    public Object f13457b;
    public final u f13458c;
    public int d;

    public w(u uVar, kd.c cVar) {
        super(cVar);
        this.f13458c = uVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13457b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13458c.a(null, this);
    }
}
