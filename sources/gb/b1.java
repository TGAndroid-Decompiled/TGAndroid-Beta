package gb;

import android.util.Log;
public final class b1 extends kd.j implements rd.p {
    public final int f13631a;
    public int f13632b;
    public final Object f13633c;

    public b1(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f13631a = i7;
        this.f13633c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13631a) {
            case 0:
                return new b1((f1) this.f13633c, cVar, 0);
            case 1:
                return new b1((f1) this.f13633c, cVar, 1);
            default:
                return new b1((ka.d) this.f13633c, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f13631a) {
            case 0:
                return ((b1) create(zVar, cVar)).invokeSuspend(gd.k.f13829a);
            case 1:
                return ((b1) create(zVar, cVar)).invokeSuspend(gd.k.f13829a);
            default:
                return ((b1) create(zVar, cVar)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f13631a) {
            case 0:
                f1 f1Var = (f1) this.f13633c;
                jd.a aVar = jd.a.f16646a;
                int i7 = this.f13632b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    wf.b bVar = new wf.b(9, f1Var.f13679e.getData(), new z0(f1Var, null));
                    a1 a1Var = new a1(f1Var, 0);
                    this.f13632b = 1;
                    if (bVar.B(a1Var, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.f13829a;
            case 1:
                f1 f1Var2 = (f1) this.f13633c;
                jd.a aVar2 = jd.a.f16646a;
                int i10 = this.f13632b;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            af.b.c(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        af.b.c(obj);
                        m1.g gVar = f1Var2.f13679e;
                        d1 d1Var = new d1(f1Var2, null, 0);
                        this.f13632b = 1;
                        if (gVar.a(d1Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    k0 k0Var = f1Var2.h;
                    if (k0Var != null) {
                        f1Var2.h = k0.a(k0Var, null, f1Var2.d.a(), null, 5);
                    } else {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                }
                return gd.k.f13829a;
            default:
                jd.a aVar3 = jd.a.f16646a;
                int i11 = this.f13632b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    ce.c data = ((ka.d) this.f13633c).f17253c.f53685a.getData();
                    this.f13632b = 1;
                    obj = ce.x.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                q1.b bVar2 = (q1.b) obj;
                if (bVar2 != null) {
                    return bVar2.a();
                }
                return hd.o.f14475a;
        }
    }
}
