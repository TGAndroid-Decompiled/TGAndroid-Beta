package k1;
public final class o extends uc.i implements bd.p {
    public final int f13277a;
    public int f13278b;
    public Object f13279c;
    public final a0 d;

    public o(a0 a0Var, sc.c cVar, int i10) {
        super(2, cVar);
        this.f13277a = i10;
        this.d = a0Var;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.f13277a) {
            case 0:
                o oVar = new o(this.d, cVar, 0);
                oVar.f13279c = obj;
                return oVar;
            default:
                o oVar2 = new o(this.d, cVar, 1);
                oVar2.f13279c = obj;
                return oVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13277a) {
            case 0:
                return ((o) create((l) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            default:
                return ((o) create((md.c) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: k1.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
