package m1;
public final class s extends kd.c {
    public b0 f20511a;
    public int f20512b;
    public Object f20513c;
    public final b0 d;
    public int f20514e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20513c = obj;
        this.f20514e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
