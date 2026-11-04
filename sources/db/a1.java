package db;

import android.util.Log;
import b8.ib;
public final class a1 extends hd.j implements od.p {
    public final int f8601a;
    public int f8602b;
    public final Object f8603c;

    public a1(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.f8601a = i3;
        this.f8603c = obj;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.f8601a) {
            case 0:
                return new a1((e1) this.f8603c, cVar, 0);
            case 1:
                return new a1((e1) this.f8603c, cVar, 1);
            default:
                return new a1((ja.d) this.f8603c, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        wd.z zVar = (wd.z) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.f8601a) {
            case 0:
                return ((a1) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
            case 1:
                return ((a1) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((a1) create(zVar, cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f8601a) {
            case 0:
                e1 e1Var = (e1) this.f8603c;
                gd.a aVar = gd.a.f12241a;
                int i3 = this.f8602b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ib.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ib.b(obj);
                    ua.b bVar = new ua.b(11, e1Var.f8647e.getData(), new y0(e1Var, null));
                    z0 z0Var = new z0(e1Var, 0);
                    this.f8602b = 1;
                    if (bVar.U(z0Var, this) == aVar) {
                        return aVar;
                    }
                }
                return dd.k.f8801a;
            case 1:
                e1 e1Var2 = (e1) this.f8603c;
                gd.a aVar2 = gd.a.f12241a;
                int i10 = this.f8602b;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ib.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ib.b(obj);
                        l1.g gVar = e1Var2.f8647e;
                        c1 c1Var = new c1(e1Var2, null, 0);
                        this.f8602b = 1;
                        if (gVar.a(c1Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    j0 j0Var = e1Var2.h;
                    if (j0Var != null) {
                        e1Var2.h = j0.a(j0Var, null, e1Var2.d.a(), null, 5);
                    } else {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                }
                return dd.k.f8801a;
            default:
                gd.a aVar3 = gd.a.f12241a;
                int i11 = this.f8602b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ib.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ib.b(obj);
                    zd.b data = ((ja.d) this.f8603c).f16234c.f53064a.getData();
                    this.f8602b = 1;
                    obj = zd.v.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                p1.b bVar2 = (p1.b) obj;
                if (bVar2 != null) {
                    return bVar2.a();
                }
                return ed.p.f9954a;
        }
    }
}
