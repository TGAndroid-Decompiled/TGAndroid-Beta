package gb;

import android.util.Log;
public final class z0 extends kd.j implements rd.p {
    public final int f13129a;
    public int f13130b;
    public final Object f13131c;

    public z0(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.f13129a = i7;
        this.f13131c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13129a) {
            case 0:
                return new z0((d1) this.f13131c, cVar, 0);
            case 1:
                return new z0((d1) this.f13131c, cVar, 1);
            default:
                return new z0((ka.d) this.f13131c, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.f13129a) {
            case 0:
                return ((z0) create(zVar, cVar)).invokeSuspend(gd.k.f13173a);
            case 1:
                return ((z0) create(zVar, cVar)).invokeSuspend(gd.k.f13173a);
            default:
                return ((z0) create(zVar, cVar)).invokeSuspend(gd.k.f13173a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f13129a) {
            case 0:
                d1 d1Var = (d1) this.f13131c;
                jd.a aVar = jd.a.f16999a;
                int i7 = this.f13130b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    wf.b bVar = new wf.b(8, d1Var.f13008e.getData(), new x0(d1Var, null));
                    y0 y0Var = new y0(d1Var, 0);
                    this.f13130b = 1;
                    if (bVar.G(y0Var, this) == aVar) {
                        return aVar;
                    }
                }
                return gd.k.f13173a;
            case 1:
                d1 d1Var2 = (d1) this.f13131c;
                jd.a aVar2 = jd.a.f16999a;
                int i10 = this.f13130b;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            af.b.c(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        af.b.c(obj);
                        m1.g gVar = d1Var2.f13008e;
                        b1 b1Var = new b1(d1Var2, null, 0);
                        this.f13130b = 1;
                        if (gVar.a(b1Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    j0 j0Var = d1Var2.h;
                    if (j0Var != null) {
                        d1Var2.h = j0.a(j0Var, null, d1Var2.d.a(), null, 5);
                    } else {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                }
                return gd.k.f13173a;
            default:
                jd.a aVar3 = jd.a.f16999a;
                int i11 = this.f13130b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    ce.c data = ((ka.d) this.f13131c).f17812c.f55132a.getData();
                    this.f13130b = 1;
                    obj = ce.x.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                q1.b bVar2 = (q1.b) obj;
                if (bVar2 != null) {
                    return bVar2.a();
                }
                return hd.o.f13832a;
        }
    }
}
