package k1;
public final class y extends kd.c {
    public a0 f13214a;
    public Object f13215b;
    public Object f13216c;
    public Object d;
    public final a0 e;
    public int f13217f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13217f |= Integer.MIN_VALUE;
        return this.e.h(null, null, this);
    }
}
