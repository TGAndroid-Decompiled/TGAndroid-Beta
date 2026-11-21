package m1;
public final class s extends kd.c {
    public b0 f20446a;
    public int f20447b;
    public Object f20448c;
    public final b0 d;
    public int f20449e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20448c = obj;
        this.f20449e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
