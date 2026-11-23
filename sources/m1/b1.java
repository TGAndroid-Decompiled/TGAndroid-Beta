package m1;
public final class b1 extends kd.c {
    public ie.d f20395a;
    public boolean f20396b;
    public Object f20397c;
    public final d1 d;
    public int f20398e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20397c = obj;
        this.f20398e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
