package ha;

import g7.y5;
public final class b0 extends sc.i implements zc.p {
    public final int f10266a;
    public Object f10267b;
    public final Object f10268c;

    public b0(Object obj, qc.c cVar, int i9) {
        super(2, cVar);
        this.f10266a = i9;
        this.f10268c = obj;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.f10266a) {
            case 0:
                b0 b0Var = new b0((String) this.f10268c, cVar, 0);
                b0Var.f10267b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.f10268c, cVar, 1);
                b0Var2.f10267b = obj;
                return b0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10266a) {
            case 0:
                oc.i iVar = oc.i.f19197a;
                ((b0) create((n1.b) obj, (qc.c) obj2)).invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.a0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i9 = this.f10266a;
        Object obj2 = this.f10268c;
        switch (i9) {
            case 0:
                rc.a aVar = rc.a.f47127a;
                y5.b(obj);
                n1.b bVar = (n1.b) this.f10267b;
                bVar.getClass();
                n1.d key = x.f10377a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return oc.i.f19197a;
            default:
                rc.a aVar2 = rc.a.f47127a;
                y5.b(obj);
                k1.a0 a0Var = (k1.a0) this.f10267b;
                k1.a0 a0Var2 = (k1.a0) obj2;
                if (!(a0Var2 instanceof k1.b) && !(a0Var2 instanceof k1.g) && a0Var == a0Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
