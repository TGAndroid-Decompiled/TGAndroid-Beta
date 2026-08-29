package ja;

import i7.c7;
public final class b0 extends uc.i implements bd.p {
    public final int f11301a;
    public Object f11302b;
    public final Object f11303c;

    public b0(Object obj, sc.c cVar, int i10) {
        super(2, cVar);
        this.f11301a = i10;
        this.f11303c = obj;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.f11301a) {
            case 0:
                b0 b0Var = new b0((String) this.f11303c, cVar, 0);
                b0Var.f11302b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.b0) this.f11303c, cVar, 1);
                b0Var2.f11302b = obj;
                return b0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11301a) {
            case 0:
                qc.i iVar = qc.i.f46603a;
                ((b0) create((n1.b) obj, (sc.c) obj2)).invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.b0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f11301a;
        Object obj2 = this.f11303c;
        switch (i10) {
            case 0:
                tc.a aVar = tc.a.f48210a;
                c7.b(obj);
                n1.b bVar = (n1.b) this.f11302b;
                bVar.getClass();
                n1.d key = x.f11412a;
                kotlin.jvm.internal.j.e(key, "key");
                bVar.b(key, (String) obj2);
                return qc.i.f46603a;
            default:
                tc.a aVar2 = tc.a.f48210a;
                c7.b(obj);
                k1.b0 b0Var = (k1.b0) this.f11302b;
                k1.b0 b0Var2 = (k1.b0) obj2;
                if (!(b0Var2 instanceof k1.b) && !(b0Var2 instanceof k1.g) && b0Var == b0Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
