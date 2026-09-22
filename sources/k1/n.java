package k1;

import v7.t7;
public final class n extends kd.j implements rd.p {
    public final int f13176a;
    public Object f13177b;
    public final Object f13178c;

    public n(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.f13176a = i10;
        this.f13178c = obj;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f13176a) {
            case 0:
                n nVar = new n((b0) this.f13178c, cVar, 0);
                nVar.f13177b = obj;
                return nVar;
            default:
                n nVar2 = new n((String) this.f13178c, cVar, 1);
                nVar2.f13177b = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13176a) {
            case 0:
                return ((n) create((b0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9617a);
            default:
                gd.i iVar = gd.i.f9617a;
                ((n) create((n1.b) obj, (id.c) obj2)).invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f13176a;
        Object obj2 = this.f13178c;
        switch (i10) {
            case 0:
                jd.a aVar = jd.a.f12969a;
                t7.b(obj);
                b0 b0Var = (b0) this.f13177b;
                b0 b0Var2 = (b0) obj2;
                if (!(b0Var2 instanceof b) && !(b0Var2 instanceof g) && b0Var == b0Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                jd.a aVar2 = jd.a.f12969a;
                t7.b(obj);
                n1.b bVar = (n1.b) this.f13177b;
                bVar.getClass();
                n1.d key = za.v.f48824a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return gd.i.f9617a;
        }
    }
}
