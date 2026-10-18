package ab;

import v7.i8;
public final class b0 extends md.i implements td.p {
    public final int f370a;
    public Object f371b;
    public final Object f372c;

    public b0(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.f370a = i10;
        this.f372c = obj;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f370a) {
            case 0:
                b0 b0Var = new b0((String) this.f372c, cVar, 0);
                b0Var.f371b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.f372c, cVar, 1);
                b0Var2.f371b = obj;
                return b0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f370a) {
            case 0:
                id.i iVar = id.i.f12775a;
                ((b0) create((n1.b) obj, (kd.c) obj2)).invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.a0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12775a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f370a;
        Object obj2 = this.f372c;
        switch (i10) {
            case 0:
                ld.a aVar = ld.a.f15998a;
                i8.b(obj);
                n1.b bVar = (n1.b) this.f371b;
                bVar.getClass();
                n1.d key = x.f473a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return id.i.f12775a;
            default:
                ld.a aVar2 = ld.a.f15998a;
                i8.b(obj);
                k1.a0 a0Var = (k1.a0) this.f371b;
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
