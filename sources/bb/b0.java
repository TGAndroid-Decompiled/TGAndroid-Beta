package bb;
public final class b0 extends ed.j implements ld.p {
    public final int f2527a;
    public Object f2528b;
    public final Object f2529c;

    public b0(Object obj, cd.c cVar, int i10) {
        super(2, cVar);
        this.f2527a = i10;
        this.f2529c = obj;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.f2527a) {
            case 0:
                b0 b0Var = new b0((String) this.f2529c, cVar, 0);
                b0Var.f2528b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.f2529c, cVar, 1);
                b0Var2.f2528b = obj;
                return b0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2527a) {
            case 0:
                ad.j jVar = ad.j.f401a;
                ((b0) create((n1.b) obj, (cd.c) obj2)).invokeSuspend(jVar);
                return jVar;
            default:
                return ((b0) create((k1.a0) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f2527a;
        Object obj2 = this.f2529c;
        switch (i10) {
            case 0:
                dd.a aVar = dd.a.f5864a;
                l9.b.b(obj);
                n1.b bVar = (n1.b) this.f2528b;
                bVar.getClass();
                n1.d key = x.f2629a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return ad.j.f401a;
            default:
                dd.a aVar2 = dd.a.f5864a;
                l9.b.b(obj);
                k1.a0 a0Var = (k1.a0) this.f2528b;
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
