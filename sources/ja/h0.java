package ja;
public final class h0 extends uc.c {
    public Object f11344a;
    public final k0 f11345b;
    public int f11346c;

    public h0(k0 k0Var, uc.c cVar) {
        super(cVar);
        this.f11345b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11344a = obj;
        this.f11346c |= Integer.MIN_VALUE;
        return k0.a(this.f11345b, this);
    }
}
