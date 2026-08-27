package ia;

public final class a0 extends tc.c {

    public Object f10970a;

    public int f10971b;

    public final b0 f10972c;

    public a0(b0 b0Var, tc.c cVar) {
        super(cVar);
        this.f10972c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10970a = obj;
        this.f10971b |= Integer.MIN_VALUE;
        return this.f10972c.c(null, this);
    }
}
