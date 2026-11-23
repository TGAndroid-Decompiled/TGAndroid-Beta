package gb;

import android.util.Log;
public final class a1 extends kd.j implements rd.p {
    public final int f13280a;
    public int f13281b;
    public final Object f13282c;

    public a1(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f13280a = i7;
        this.f13282c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13280a) {
            case 0:
                return new a1((e1) this.f13282c, cVar, 0);
            case 1:
                return new a1((e1) this.f13282c, cVar, 1);
            default:
                return new a1((ka.d) this.f13282c, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f13280a) {
            case 0:
                return ((a1) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
            case 1:
                return ((a1) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
            default:
                return ((a1) create(zVar, cVar)).invokeSuspend(gd.k.f13480a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f13280a) {
            case 0:
                e1 e1Var = (e1) this.f13282c;
                jd.a aVar = jd.a.f17478a;
                int i7 = this.f13281b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        c8.z.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c8.z.b(obj);
                    wf.b bVar = new wf.b(8, e1Var.f13322e.getData(), new y0(e1Var, null));
                    z0 z0Var = new z0(e1Var, 0);
                    this.f13281b = 1;
                    if (bVar.J(z0Var, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.f13480a;
            case 1:
                e1 e1Var2 = (e1) this.f13282c;
                jd.a aVar2 = jd.a.f17478a;
                int i10 = this.f13281b;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c8.z.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        c8.z.b(obj);
                        m1.g gVar = e1Var2.f13322e;
                        c1 c1Var = new c1(e1Var2, null, 0);
                        this.f13281b = 1;
                        if (gVar.a(c1Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    k0 k0Var = e1Var2.h;
                    if (k0Var != null) {
                        e1Var2.h = k0.a(k0Var, null, e1Var2.d.a(), null, 5);
                    } else {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                }
                return gd.k.f13480a;
            default:
                jd.a aVar3 = jd.a.f17478a;
                int i11 = this.f13281b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        c8.z.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c8.z.b(obj);
                    ce.c data = ((ka.d) this.f13282c).f18300c.f55831a.getData();
                    this.f13281b = 1;
                    obj = ce.x.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                q1.b bVar2 = (q1.b) obj;
                if (bVar2 != null) {
                    return bVar2.a();
                }
                return hd.o.f14141a;
        }
    }
}
