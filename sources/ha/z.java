package ha;
public final class z extends sc.c {
    public Object f10381a;
    public int f10382b;
    public final a0 f10383c;

    public z(a0 a0Var, sc.c cVar) {
        super(cVar);
        this.f10383c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10381a = obj;
        this.f10382b |= Integer.MIN_VALUE;
        return this.f10383c.c(null, this);
    }
}
