package l1;
public final class o extends hd.c {
    public Object f17592a;
    public int f17593b;
    public final db.z0 f17594c;

    public o(db.z0 z0Var, fd.c cVar) {
        super(cVar);
        this.f17594c = z0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17592a = obj;
        this.f17593b |= Integer.MIN_VALUE;
        return this.f17594c.b(null, this);
    }
}
