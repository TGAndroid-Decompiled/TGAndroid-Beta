package m1;
public final class s extends kd.c {
    public b0 f19460a;
    public int f19461b;
    public Object f19462c;
    public final b0 d;
    public int f19463e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19462c = obj;
        this.f19463e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
