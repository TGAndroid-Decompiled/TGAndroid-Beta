package k1;
public final class y extends kd.c {
    public a0 f13212a;
    public Object f13213b;
    public Object f13214c;
    public Object d;
    public final a0 e;
    public int f13215f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13215f |= Integer.MIN_VALUE;
        return this.e.h(null, null, this);
    }
}
