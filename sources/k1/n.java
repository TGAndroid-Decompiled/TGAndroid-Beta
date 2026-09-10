package k1;

import v7.u7;
public final class n extends kd.j implements rd.p {
    public final int f12021a;
    public Object f12022b;
    public final Object f12023c;

    public n(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f12021a = i10;
        this.f12023c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f12021a) {
            case 0:
                n nVar = new n((b0) this.f12023c, cVar, 0);
                nVar.f12022b = obj;
                return nVar;
            default:
                n nVar2 = new n((String) this.f12023c, cVar, 1);
                nVar2.f12022b = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12021a) {
            case 0:
                return ((n) create((b0) obj, (id.c) obj2)).invokeSuspend(gd.i.f8748a);
            default:
                gd.i iVar = gd.i.f8748a;
                ((n) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f12021a;
        Object obj2 = this.f12023c;
        switch (i10) {
            case 0:
                jd.a aVar = jd.a.f11861a;
                u7.b(obj);
                b0 b0Var = (b0) this.f12022b;
                b0 b0Var2 = (b0) obj2;
                if (!(b0Var2 instanceof b) && !(b0Var2 instanceof g) && b0Var == b0Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                jd.a aVar2 = jd.a.f11861a;
                u7.b(obj);
                n1.b bVar = (n1.b) this.f12022b;
                bVar.getClass();
                n1.d key = za.v.f47951a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return gd.i.f8748a;
        }
    }
}
