package gb;
public final class x0 extends kd.j implements rd.q {
    public int f13437a;
    public ce.d f13438b;
    public Throwable f13439c;
    public final d1 d;

    public x0(d1 d1Var, id.c cVar) {
        super(3, cVar);
        this.d = d1Var;
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        x0 x0Var = new x0(this.d, (id.c) obj3);
        x0Var.f13438b = (ce.d) obj;
        x0Var.f13439c = (Throwable) obj2;
        return x0Var.invokeSuspend(gd.k.f13488a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f17384a;
        int i7 = this.f13437a;
        if (i7 != 0) {
            if (i7 == 1) {
                b7.h.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            b7.h.b(obj);
            ce.d dVar = this.f13438b;
            Throwable th2 = this.f13439c;
            n0 a10 = this.d.f13323b.a(null);
            j0 j0Var = new j0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            p5.c.t(sb2, a10.f13390a, "FirebaseSessions");
            this.f13438b = null;
            this.f13437a = 1;
            if (dVar.a(j0Var, this) == aVar) {
                return aVar;
            }
        }
        return gd.k.f13488a;
    }
}
