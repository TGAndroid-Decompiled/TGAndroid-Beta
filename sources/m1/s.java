package m1;
public final class s extends kd.c {
    public b0 f20449a;
    public int f20450b;
    public Object f20451c;
    public final b0 d;
    public int f20452e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20451c = obj;
        this.f20452e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
