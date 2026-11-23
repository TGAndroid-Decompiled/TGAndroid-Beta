package gb;
public final class y0 extends kd.j implements rd.q {
    public int f13433a;
    public ce.d f13434b;
    public Throwable f13435c;
    public final e1 d;

    public y0(e1 e1Var, id.c cVar) {
        super(3, cVar);
        this.d = e1Var;
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        y0 y0Var = new y0(this.d, (id.c) obj3);
        y0Var.f13434b = (ce.d) obj;
        y0Var.f13435c = (Throwable) obj2;
        return y0Var.invokeSuspend(gd.k.f13480a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f17478a;
        int i7 = this.f13433a;
        if (i7 != 0) {
            if (i7 == 1) {
                c8.z.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            c8.z.b(obj);
            ce.d dVar = this.f13434b;
            Throwable th2 = this.f13435c;
            o0 a10 = this.d.f13320b.a(null);
            k0 k0Var = new k0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            p5.c.t(sb2, a10.f13385a, "FirebaseSessions");
            this.f13434b = null;
            this.f13433a = 1;
            if (dVar.a(k0Var, this) == aVar) {
                return aVar;
            }
        }
        return gd.k.f13480a;
    }
}
