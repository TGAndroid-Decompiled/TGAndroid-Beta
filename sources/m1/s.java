package m1;
public final class s extends kd.c {
    public b0 f19465a;
    public int f19466b;
    public Object f19467c;
    public final b0 d;
    public int f19468e;

    public s(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19467c = obj;
        this.f19468e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
