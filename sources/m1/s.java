package m1;
public final class s extends kd.c {
    public b0 f20415a;
    public int f20416b;
    public Object f20417c;
    public final b0 d;
    public int f20418e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20417c = obj;
        this.f20418e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
