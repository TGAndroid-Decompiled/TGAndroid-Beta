package bb;

import a8.jd;
public final class b0 extends nd.i implements ud.p {
    public final int f3727a;
    public Object f3728b;
    public final Object f3729c;

    public b0(Object obj, ld.c cVar, int i10) {
        super(2, cVar);
        this.f3727a = i10;
        this.f3729c = obj;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.f3727a) {
            case 0:
                b0 b0Var = new b0((String) this.f3729c, cVar, 0);
                b0Var.f3728b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.f3729c, cVar, 1);
                b0Var2.f3728b = obj;
                return b0Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3727a) {
            case 0:
                jd.i iVar = jd.i.f15579a;
                ((b0) create((n1.b) obj, (ld.c) obj2)).invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.a0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15579a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10 = this.f3727a;
        Object obj2 = this.f3729c;
        switch (i10) {
            case 0:
                md.a aVar = md.a.f18411a;
                jd.b(obj);
                n1.b bVar = (n1.b) this.f3728b;
                bVar.getClass();
                n1.d key = x.f3828a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return jd.i.f15579a;
            default:
                md.a aVar2 = md.a.f18411a;
                jd.b(obj);
                k1.a0 a0Var = (k1.a0) this.f3728b;
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
