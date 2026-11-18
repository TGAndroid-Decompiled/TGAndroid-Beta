package m1;
public final class s extends kd.c {
    public b0 f20421a;
    public int f20422b;
    public Object f20423c;
    public final b0 d;
    public int f20424e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20423c = obj;
        this.f20424e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
