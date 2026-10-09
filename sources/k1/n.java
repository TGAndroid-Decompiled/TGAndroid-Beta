package k1;

import v7.a8;
public final class n extends ld.j implements sd.p {
    public final int f14351a;
    public Object f14352b;
    public final Object f14353c;

    public n(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.f14351a = i10;
        this.f14353c = obj;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f14351a) {
            case 0:
                n nVar = new n((b0) this.f14353c, cVar, 0);
                nVar.f14352b = obj;
                return nVar;
            default:
                n nVar2 = new n((String) this.f14353c, cVar, 1);
                nVar2.f14352b = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14351a) {
            case 0:
                return ((n) create((b0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
            default:
                hd.i iVar = hd.i.f11092a;
                ((n) create((n1.b) obj, (jd.c) obj2)).invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f14351a;
        Object obj2 = this.f14353c;
        switch (i10) {
            case 0:
                kd.a aVar = kd.a.f14784a;
                a8.b(obj);
                b0 b0Var = (b0) this.f14352b;
                b0 b0Var2 = (b0) obj2;
                if (!(b0Var2 instanceof b) && !(b0Var2 instanceof g) && b0Var == b0Var2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                kd.a aVar2 = kd.a.f14784a;
                a8.b(obj);
                n1.b bVar = (n1.b) this.f14352b;
                bVar.getClass();
                n1.d key = za.w.f54292a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return hd.i.f11092a;
        }
    }
}
