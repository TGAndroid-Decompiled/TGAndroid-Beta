package m1;
public final class h extends kd.c {
    public ab.c0 f20435a;
    public Object f20436b;
    public final ab.c0 f20437c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f20437c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20436b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20437c.e(this);
    }
}
