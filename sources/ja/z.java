package ja;
public final class z extends uc.c {
    public Object f11416a;
    public int f11417b;
    public final a0 f11418c;

    public z(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f11418c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11416a = obj;
        this.f11417b |= Integer.MIN_VALUE;
        return this.f11418c.c(null, this);
    }
}
