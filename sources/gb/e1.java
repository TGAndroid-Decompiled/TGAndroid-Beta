package gb;
public final class e1 extends kd.c {
    public String f13665a;
    public c1 f13666b;
    public Object f13667c;
    public final f1 d;
    public int f13668e;

    public e1(f1 f1Var, id.c cVar) {
        super(cVar);
        this.d = f1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13667c = obj;
        this.f13668e |= Integer.MIN_VALUE;
        return f1.a(this.d, null, null, this);
    }
}
