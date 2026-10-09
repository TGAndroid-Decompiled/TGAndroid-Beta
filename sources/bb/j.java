package bb;
public final class j extends ld.c {
    public Object f3831a;
    public final l f3832b;
    public int f3833c;

    public j(l lVar, ld.c cVar) {
        super(cVar);
        this.f3832b = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3831a = obj;
        this.f3833c |= Integer.MIN_VALUE;
        return this.f3832b.c(null, null, this);
    }
}
