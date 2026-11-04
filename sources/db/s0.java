package db;
public final class s0 extends hd.c {
    public Object f8725a;
    public final t0 f8726b;
    public int f8727c;

    public s0(t0 t0Var, hd.c cVar) {
        super(cVar);
        this.f8726b = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8725a = obj;
        this.f8727c |= Integer.MIN_VALUE;
        return t0.a(this.f8726b, this);
    }
}
