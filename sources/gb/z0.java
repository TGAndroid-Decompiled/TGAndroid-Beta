package gb;
public final class z0 extends kd.j implements rd.q {
    public int f13787a;
    public ce.d f13788b;
    public Throwable f13789c;
    public final f1 d;

    public z0(f1 f1Var, id.c cVar) {
        super(3, cVar);
        this.d = f1Var;
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        z0 z0Var = new z0(this.d, (id.c) obj3);
        z0Var.f13788b = (ce.d) obj;
        z0Var.f13789c = (Throwable) obj2;
        return z0Var.invokeSuspend(gd.k.f13829a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f16646a;
        int i7 = this.f13787a;
        if (i7 != 0) {
            if (i7 == 1) {
                af.b.c(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            af.b.c(obj);
            ce.d dVar = this.f13788b;
            Throwable th2 = this.f13789c;
            o0 a10 = this.d.f13677b.a(null);
            k0 k0Var = new k0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            rf.b.p(sb2, a10.f13736a, "FirebaseSessions");
            this.f13788b = null;
            this.f13787a = 1;
            if (dVar.a(k0Var, this) == aVar) {
                return aVar;
            }
        }
        return gd.k.f13829a;
    }
}
