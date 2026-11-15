package gb;
public final class x0 extends kd.j implements rd.q {
    public int f13120a;
    public ce.d f13121b;
    public Throwable f13122c;
    public final d1 d;

    public x0(d1 d1Var, id.c cVar) {
        super(3, cVar);
        this.d = d1Var;
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        x0 x0Var = new x0(this.d, (id.c) obj3);
        x0Var.f13121b = (ce.d) obj;
        x0Var.f13122c = (Throwable) obj2;
        return x0Var.invokeSuspend(gd.k.f13173a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f16999a;
        int i7 = this.f13120a;
        if (i7 != 0) {
            if (i7 == 1) {
                af.b.c(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            af.b.c(obj);
            ce.d dVar = this.f13121b;
            Throwable th2 = this.f13122c;
            n0 a10 = this.d.f13006b.a(null);
            j0 j0Var = new j0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            r.b.t(sb2, a10.f13073a, "FirebaseSessions");
            this.f13121b = null;
            this.f13120a = 1;
            if (dVar.a(j0Var, this) == aVar) {
                return aVar;
            }
        }
        return gd.k.f13173a;
    }
}
