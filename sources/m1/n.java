package m1;
public final class n extends kd.j implements rd.q {
    public final int f19423a = 1;
    public int f19424b;
    public Object f19425c;

    public n(int i7, id.c cVar) {
        super(i7, cVar);
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f19423a) {
            case 0:
                ce.d dVar = (ce.d) obj;
                Throwable th2 = (Throwable) obj2;
                return new n((b0) this.f19425c, (id.c) obj3).invokeSuspend(gd.k.f13829a);
            default:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, (id.c) obj3);
                nVar.f19425c = (d0) obj;
                return nVar.invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f19423a) {
            case 0:
                jd.a aVar = jd.a.f16643a;
                int i7 = this.f19424b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    this.f19424b = 1;
                    if (b0.b((b0) this.f19425c, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.f13829a;
            default:
                jd.a aVar2 = jd.a.f16643a;
                int i10 = this.f19424b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        af.b.c(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                af.b.c(obj);
                d0 d0Var = (d0) this.f19425c;
                this.f19424b = 1;
                d0Var.getClass();
                Object a10 = d0.a(d0Var, this);
                if (a10 == aVar2) {
                    return aVar2;
                }
                return a10;
        }
    }

    public n(b0 b0Var, id.c cVar) {
        super(3, cVar);
        this.f19425c = b0Var;
    }
}
