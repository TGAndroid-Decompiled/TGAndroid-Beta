package k1;
public final class n extends ed.j implements ld.p {
    public final int f10542a;
    public int f10543b;
    public Object f10544c;
    public final z d;

    public n(z zVar, cd.c cVar, int i10) {
        super(2, cVar);
        this.f10542a = i10;
        this.d = zVar;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.f10542a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.f10544c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.f10544c = obj;
                return nVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10542a) {
            case 0:
                return ((n) create((l) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
            default:
                return ((n) create((wd.c) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
