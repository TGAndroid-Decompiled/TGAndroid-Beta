package k1;
public final class o extends ed.c {
    public Object f10545a;
    public int f10546b;
    public final bb.a0 f10547c;

    public o(bb.a0 a0Var, ed.c cVar) {
        super(cVar);
        this.f10547c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10545a = obj;
        this.f10546b |= Integer.MIN_VALUE;
        return this.f10547c.b(null, this);
    }
}
