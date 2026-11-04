package l1;
public final class z extends hd.c {
    public kotlin.jvm.internal.p f17676a;
    public Object f17677b;
    public final b0 f17678c;
    public int d;

    public z(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.f17678c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17677b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f17678c.j(null, false, this);
    }
}
