package m1;
public final class o extends kd.c {
    public Object f20483a;
    public int f20484b;
    public final gb.z0 f20485c;

    public o(gb.z0 z0Var, id.c cVar) {
        super(cVar);
        this.f20485c = z0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20483a = obj;
        this.f20484b |= Integer.MIN_VALUE;
        return this.f20485c.a(null, this);
    }
}
