package m1;
public final class s extends kd.c {
    public b0 f19457a;
    public int f19458b;
    public Object f19459c;
    public final b0 d;
    public int f19460e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19459c = obj;
        this.f19460e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
