package m1;
public final class u extends kd.j implements rd.l {
    public Throwable f19478a;
    public int f19479b;
    public final b0 f19480c;

    public u(b0 b0Var, id.c cVar) {
        super(1, cVar);
        this.f19480c = b0Var;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new u(this.f19480c, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((u) create((id.c) obj)).invokeSuspend(gd.k.f13829a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        e1 e1Var;
        jd.a aVar = jd.a.f16643a;
        int i7 = this.f19479b;
        b0 b0Var = this.f19480c;
        try {
        } catch (Throwable th3) {
            m0 g10 = b0Var.g();
            this.f19478a = th3;
            this.f19479b = 2;
            Object b10 = g10.b(this);
            if (b10 != aVar) {
                th2 = th3;
                obj = b10;
            }
        }
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    th2 = this.f19478a;
                    af.b.c(obj);
                    e1Var = new w0(((Number) obj).intValue(), th2);
                    return new gd.e(e1Var, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            af.b.c(obj);
        } else {
            af.b.c(obj);
            this.f19479b = 1;
            obj = b0.f(b0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        e1Var = (e1) obj;
        return new gd.e(e1Var, Boolean.TRUE);
    }
}
