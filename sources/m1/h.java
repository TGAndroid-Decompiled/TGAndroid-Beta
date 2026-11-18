package m1;
public final class h extends kd.c {
    public ab.c0 f20345a;
    public Object f20346b;
    public final ab.c0 f20347c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f20347c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20346b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20347c.e(this);
    }
}
