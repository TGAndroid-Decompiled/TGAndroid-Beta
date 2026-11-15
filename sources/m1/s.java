package m1;
public final class s extends kd.c {
    public b0 f20054a;
    public int f20055b;
    public Object f20056c;
    public final b0 d;
    public int f20057e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20056c = obj;
        this.f20057e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
