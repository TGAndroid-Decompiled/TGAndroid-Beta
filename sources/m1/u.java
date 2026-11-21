package m1;
public final class u extends kd.j implements rd.l {
    public Throwable f20467a;
    public int f20468b;
    public final b0 f20469c;

    public u(b0 b0Var, id.c cVar) {
        super(1, cVar);
        this.f20469c = b0Var;
    }

    @Override
    public final id.c create(id.c cVar) {
        return new u(this.f20469c, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((u) create((id.c) obj)).invokeSuspend(gd.k.f13514a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        e1 e1Var;
        jd.a aVar = jd.a.f17406a;
        int i7 = this.f20468b;
        b0 b0Var = this.f20469c;
        try {
        } catch (Throwable th3) {
            m0 g10 = b0Var.g();
            this.f20467a = th3;
            this.f20468b = 2;
            Object b10 = g10.b(this);
            if (b10 != aVar) {
                th2 = th3;
                obj = b10;
            }
        }
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    th2 = this.f20467a;
                    b7.h.b(obj);
                    e1Var = new w0(((Number) obj).intValue(), th2);
                    return new gd.e(e1Var, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b7.h.b(obj);
        } else {
            b7.h.b(obj);
            this.f20468b = 1;
            obj = b0.f(b0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        e1Var = (e1) obj;
        return new gd.e(e1Var, Boolean.TRUE);
    }
}
