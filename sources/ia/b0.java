package ia;

import h7.k6;

public final class b0 implements ld.c {

    public final int f10975a = 1;

    public final ld.c f10976b;

    public b0(ld.c cVar, d0 d0Var) {
        this.f10976b = cVar;
    }

    @Override
    public final Object c(Object obj, tc.c cVar) throws Throwable {
        a0 a0Var;
        k1.o oVar;
        int i10 = this.f10975a;
        pc.i iVar = pc.i.f45696a;
        ld.c cVar2 = this.f10976b;
        switch (i10) {
            case 0:
                if (cVar instanceof a0) {
                    a0Var = (a0) cVar;
                    int i11 = a0Var.f10971b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        a0Var.f10971b = i11 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new a0(this, cVar);
                    }
                } else {
                    a0Var = new a0(this, cVar);
                }
                Object obj2 = a0Var.f10970a;
                sc.a aVar = sc.a.f47847a;
                int i12 = a0Var.f10971b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj2);
                    return iVar;
                }
                k6.b(obj2);
                x xVar = d0.f10992e;
                o oVar2 = new o((String) ((n1.b) obj).a(y.f11089a));
                a0Var.f10971b = 1;
                return cVar2.c(oVar2, a0Var) == aVar ? aVar : iVar;
            default:
                if (cVar instanceof k1.o) {
                    oVar = (k1.o) cVar;
                    int i13 = oVar.f14282b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        oVar.f14282b = i13 - Integer.MIN_VALUE;
                    } else {
                        oVar = new k1.o(this, cVar);
                    }
                } else {
                    oVar = new k1.o(this, cVar);
                }
                Object obj3 = oVar.f14281a;
                sc.a aVar2 = sc.a.f47847a;
                int i14 = oVar.f14282b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj3);
                    return iVar;
                }
                k6.b(obj3);
                k1.a0 a0Var2 = (k1.a0) obj;
                if (a0Var2 instanceof k1.h) {
                    throw ((k1.h) a0Var2).f14270a;
                }
                if (a0Var2 instanceof k1.g) {
                    throw ((k1.g) a0Var2).f14269a;
                }
                if (a0Var2 instanceof k1.b) {
                    Object obj4 = ((k1.b) a0Var2).f14257a;
                    oVar.f14282b = 1;
                    return cVar2.c(obj4, oVar) == aVar2 ? aVar2 : iVar;
                }
                if (a0Var2 instanceof k1.b0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new a7.c();
        }
    }

    public b0(ld.c cVar) {
        this.f10976b = cVar;
    }
}
