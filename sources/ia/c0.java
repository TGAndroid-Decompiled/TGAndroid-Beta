package ia;

import h7.k6;

public final class c0 extends tc.i implements ad.p {

    public final int f10983a;

    public Object f10984b;

    public final Object f10985c;

    public c0(Object obj, rc.c cVar, int i10) {
        super(2, cVar);
        this.f10983a = i10;
        this.f10985c = obj;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.f10983a) {
            case 0:
                c0 c0Var = new c0((String) this.f10985c, cVar, 0);
                c0Var.f10984b = obj;
                return c0Var;
            default:
                c0 c0Var2 = new c0((k1.a0) this.f10985c, cVar, 1);
                c0Var2.f10984b = obj;
                return c0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10983a) {
            case 0:
                c0 c0Var = (c0) create((n1.b) obj, (rc.c) obj2);
                pc.i iVar = pc.i.f45696a;
                c0Var.invokeSuspend(iVar);
                return iVar;
            default:
                return ((c0) create((k1.a0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10983a;
        Object obj2 = this.f10985c;
        switch (i10) {
            case 0:
                sc.a aVar = sc.a.f47847a;
                k6.b(obj);
                n1.b bVar = (n1.b) this.f10984b;
                bVar.getClass();
                n1.e key = y.f11089a;
                kotlin.jvm.internal.j.e(key, "key");
                bVar.b(key, (String) obj2);
                return pc.i.f45696a;
            default:
                sc.a aVar2 = sc.a.f47847a;
                k6.b(obj);
                k1.a0 a0Var = (k1.a0) this.f10984b;
                k1.a0 a0Var2 = (k1.a0) obj2;
                boolean z10 = false;
                if (!(a0Var2 instanceof k1.b) && !(a0Var2 instanceof k1.g) && a0Var == a0Var2) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
