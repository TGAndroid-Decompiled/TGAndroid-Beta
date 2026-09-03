package k1;

import k7.p7;
public final class q extends wc.i implements dd.p {
    public final int f9575a;
    public Object f9576b;
    public final Object f9577c;

    public q(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.f9575a = i10;
        this.f9577c = obj;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f9575a) {
            case 0:
                q qVar = new q((e0) this.f9577c, cVar, 0);
                qVar.f9576b = obj;
                return qVar;
            default:
                q qVar2 = new q((String) this.f9577c, cVar, 1);
                qVar2.f9576b = obj;
                return qVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9575a) {
            case 0:
                return ((q) create((e0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f44318a);
            default:
                sc.i iVar = sc.i.f44318a;
                ((q) create((n1.b) obj, (uc.c) obj2)).invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z4;
        int i10 = this.f9575a;
        Object obj2 = this.f9577c;
        switch (i10) {
            case 0:
                vc.a aVar = vc.a.f45727a;
                p7.b(obj);
                e0 e0Var = (e0) this.f9576b;
                e0 e0Var2 = (e0) obj2;
                if (!(e0Var2 instanceof b) && !(e0Var2 instanceof h) && e0Var == e0Var2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                vc.a aVar2 = vc.a.f45727a;
                p7.b(obj);
                n1.b bVar = (n1.b) this.f9576b;
                bVar.getClass();
                n1.d key = la.w.f11936a;
                kotlin.jvm.internal.j.e(key, "key");
                bVar.b(key, (String) obj2);
                return sc.i.f44318a;
        }
    }
}
