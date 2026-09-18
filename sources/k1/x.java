package k1;
public final class x extends kd.c {
    public Object f13212a;
    public Object f13213b;
    public Object f13214c;
    public final a0 d;
    public int e;

    public x(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.d = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13214c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
