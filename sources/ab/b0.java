package ab;

import v7.i8;
public final class b0 extends md.i implements td.p {
    public final int f371a;
    public Object f372b;
    public final Object f373c;

    public b0(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.f371a = i10;
        this.f373c = obj;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f371a) {
            case 0:
                b0 b0Var = new b0((String) this.f373c, cVar, 0);
                b0Var.f372b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.f373c, cVar, 1);
                b0Var2.f372b = obj;
                return b0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f371a) {
            case 0:
                id.i iVar = id.i.f11390a;
                ((b0) create((n1.b) obj, (kd.c) obj2)).invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.a0) obj, (kd.c) obj2)).invokeSuspend(id.i.f11390a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f371a;
        Object obj2 = this.f373c;
        switch (i10) {
            case 0:
                ld.a aVar = ld.a.f14658a;
                i8.b(obj);
                n1.b bVar = (n1.b) this.f372b;
                bVar.getClass();
                n1.d key = x.f474a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return id.i.f11390a;
            default:
                ld.a aVar2 = ld.a.f14658a;
                i8.b(obj);
                k1.a0 a0Var = (k1.a0) this.f372b;
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
