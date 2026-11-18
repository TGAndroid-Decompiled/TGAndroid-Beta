package m1;
public final class s extends kd.c {
    public b0 f20418a;
    public int f20419b;
    public Object f20420c;
    public final b0 d;
    public int f20421e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20420c = obj;
        this.f20421e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
