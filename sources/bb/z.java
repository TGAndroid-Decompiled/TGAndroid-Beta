package bb;
public final class z extends ed.c {
    public Object f2633a;
    public int f2634b;
    public final a0 f2635c;

    public z(a0 a0Var, ed.c cVar) {
        super(cVar);
        this.f2635c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2633a = obj;
        this.f2634b |= Integer.MIN_VALUE;
        return this.f2635c.b(null, this);
    }
}
